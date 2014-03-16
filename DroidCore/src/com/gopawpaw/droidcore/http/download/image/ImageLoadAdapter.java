/*
 * 文  件   名： ImageLoadAdapter.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-5-14
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.http.download.image;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.gopawpaw.droidcore.http.HttpConnector;
import com.gopawpaw.droidcore.http.HttpListener;
import com.gopawpaw.droidcore.http.HttpRequest;
import com.gopawpaw.droidcore.http.HttpResponse;
import com.gopawpaw.droidcore.http.download.DownLoadCache;
import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.FileUtil;


/**
 * 图片加载适配器
 * @author LiJinHua
 * @date 2012-5-14
 * @version [Android 1.0.0, 2012-5-14]
 * @description
 */
public abstract class ImageLoadAdapter extends BaseAdapter implements HttpListener{

	/**
	 * Log标签
	 */
	private static final String TAG = ImageLoadAdapter.class.getSimpleName();
	
	/**
	 * 刷新UI的消息
	 */
	private static final int MSG_REFRESH_UI = 100;
	
	/**
	 * 图片加载失败时，最多加载次数
	 */
	private static final int LOAD_IMG_MAX_TIMES = 3;
	
	/**
	 * URL对应的View列表
	 */
	private HashMap<String,ArrayList<View>> urlViewMapList = new HashMap<String,ArrayList<View>>();
	
	/**
	 * 图片加载失败次数
	 */
	private HashMap<String,Integer> mLoadImgFailMap = new HashMap<String,Integer>();
	
	public ImageLoadAdapter() {
		super();
	}

	/**
	 * 更新图片
	 * @param ivs
	 * @return
	 */
	protected boolean updateBitmapUI(ImageView... ivs){
		if(ivs == null){
			return false;
		}
		AppLog.d(TAG, "updateBitmapUI ivs.size="+ivs.length);
		boolean flag = true;
		for(ImageView iv:ivs){
			if(!updateBitmap(iv)){
				flag = false;
			}
		}
		return flag;
	}
	
	/**
	 * 更新图片
	 * @param iv
	 * @return
	 */
	private boolean updateBitmap(ImageView iv){
		if(iv == null){
			return false;
		}
		Object tag = iv.getTag();
		if(tag == null){
			//下载地址不存在
			return false;
		}
		AppLog.d(TAG, "updateBitmap iv="+iv);
		String url = (String) tag;
		
		//更新url对应的View映射
		ArrayList<View> list = urlViewMapList.get(url);
		if(list == null){
			list = new ArrayList<View>();
			urlViewMapList.put(url, list);
		}
		list.add(iv);
		
		
		//从内存OR本地中取图片
		Bitmap bmp = BitmapCache.getInstance().getBitmap(url);
		
		if(bmp == null || bmp.isRecycled()){
			//图片在内存中未被创建或已经被回收
			AppLog.e(TAG, "图片不在内存中："+url);
			bmp = getLocalBitmap(url);
			if(bmp == null || bmp.isRecycled()){
				//OR 若本地图片不存在，则请求网络加载图片
				
				sendRequest(url);
				
				return true;
			}
			
			bmp = optimizeBitmap(url,bmp);
			
			//从sdcard缓存到内存软引用中
			BitmapCache.getInstance().addCacheBitmap(bmp, url);
			AppLog.d(TAG, "图片从SD卡缓存加载成功："+url);
		}else{
			AppLog.v(TAG, "图片未被回收："+url);
		}
		
		
		iv.setImageBitmap(bmp);
		
		return true;
	}
	
	/**
	 * 保存图片到本地
	 * @param url
	 * @return
	 */
	public void saveLocalBitmap(String url,byte[] data){
		DownLoadCache.getInstance().addFileCache(url, data);
	}
	
	/**
	 * 获取本地图片
	 * @param url
	 * @return
	 */
	public Bitmap getLocalBitmap(String url){
		Bitmap bmp = null;
		byte[] data = DownLoadCache.getInstance().getFileCache(url);
		if(data != null){
			bmp = BitmapFactory.decodeByteArray(data, 0, data.length);
		}
		return bmp;
	}
	
	
	/**
	 * 优化处理图片<br>
	 * 子类可重写该方法，以达到期望的图片处理
	 * @param url
	 * @param bitmap
	 * @return
	 */
	protected Bitmap optimizeBitmap(String url , Bitmap bitmap) {
		
		return bitmap;
	}
	
	/**
	 * 发送请求
	 * @param url
	 */
	private void sendRequest(String url){
		AppLog.d(TAG,
				"sendRequest:" + url);
		
		Integer times = mLoadImgFailMap.get(url);
		if(times != null && times > LOAD_IMG_MAX_TIMES){
			AppLog.e(TAG,
					"图片已加载失败超过:" + LOAD_IMG_MAX_TIMES+"次"+" url="+url);
			return;
		}
		
		// 创建新的请求
		HttpRequest request = new HttpRequest(url, null, this, HttpRequest.REQUEST_MODE_2,
				HttpRequest.REQUEST_TYPE_2, HttpRequest.REQUEST_METHOD_GET);

		// 发送Http请求
		HttpConnector.sendHttpRequest(request);
		
	}
	
	@Override
	public void httpResponse(HttpResponse httpResponse) {
		// TODO Auto-generated method stub
		
		AppLog.d(TAG,
				"Code:" + httpResponse.getResponseCode() + "Type:"
						+ httpResponse.getContentType() + "Length:"
						+ httpResponse.getContentLength());

		String url = httpResponse.getUrl();
		if (httpResponse.getResponseCode() == HttpResponse.RESPONSE_CODE_SUCCESS) {
			// Http返回成功
			InputStream is = httpResponse.getInputStream();
			byte[] bs = null;
			try {
				bs = FileUtil.readStream(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(bs == null){
				//读取数据失败
				AppLog.d(TAG,
						"读取网络图片数据失败");
				return;
			}
			
			Bitmap bmp = BitmapFactory.decodeByteArray(bs, 0, bs.length);
			
			if(bmp == null){
				//获取图片失败
				Integer times = mLoadImgFailMap.get(url);
				if(times == null){
					times = 1;
				}
				mLoadImgFailMap.put(url, ++times);
			}
			
			bmp = optimizeBitmap(url,bmp);
			
			saveLocalBitmap(url,bs);
			
			BitmapCache.getInstance().addCacheBitmap(bmp, url);
	
			
			Message msg = new Message();
			msg.what = MSG_REFRESH_UI;
			msg.obj = url;
			//发送刷新UI的消息
			mHandler.sendMessage(msg);
			
		} else {
			// Http错误返回
			Integer times = mLoadImgFailMap.get(url);
			if(times == null){
				times = 1;
			}
			mLoadImgFailMap.put(url, ++times);
		}
	}
	
	
	
	/**
	 * 刷新UI
	 * @param url
	 */
	public Handler mHandler = new Handler(){

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			switch (msg.what) {
			case MSG_REFRESH_UI:
				String url = (String)msg.obj;
				refreshUI(url);
				break;
			default:
				break;
			}
		}
	};
	
	/**
	 * 刷新UI，该方法需要在UI线程中被调用
	 * @param url
	 */
	private void refreshUI(String url){
		//从内存中取图片
		Bitmap bmp = BitmapCache.getInstance().getBitmap(url);
		
		ArrayList<View> list = urlViewMapList.get(url);
		if(list != null){
			for(View view :list){
				if(url.equals(view.getTag())){
					//该View需要被刷新
					//一个屏幕中存在多个View对应该图片
					ImageView iv = (ImageView) view;
					iv.setImageBitmap(bmp);
				}
			}
		}
		
		this.notifyDataSetChanged();
	}
	
	public void destroy(){
		BitmapCache.getInstance().clearCache();
		urlViewMapList = null;
		HttpConnector.clearRequest();
	}

}

