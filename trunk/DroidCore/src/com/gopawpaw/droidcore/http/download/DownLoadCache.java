/*
 * 文  件   名： DownLoadCache.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-6-1
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.http.download;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import android.content.Context;

import com.gopawpaw.droidcore.utils.CommonUtils;
import com.gopawpaw.droidcore.utils.FileUtil;


/**
 * 下载缓存
 * 
 * @author LiJinHua
 * @date 2012-6-1
 * @version [Android 1.0.0, 2012-6-1]
 * @description
 */
public class DownLoadCache {

	private static DownLoadCache instance;

	private DownLoadCache() {
		super();
	}

	/**
	 * 获取缓存器实例
	 */
	public static DownLoadCache getInstance() {

		if (instance == null) {
			instance = new DownLoadCache();
		}
		return instance;
	}

	/**
	 * 新增文件缓存<br>
	 * SD卡目录下的缓存
	 * @param url
	 * @param dataBytes
	 */
	public void addFileCache(String url, byte[] dataBytes) {
		addFileCache(url,dataBytes,null);
	}
	
	/**
	 * 新增文件缓存<br>
	 * 优先SD卡目录下的缓存，SD卡不存在时，则缓存到data/data目录下
	 * @param url
	 * @param dataBytes
	 * @param context
	 */
	public void addFileCache(String url, byte[] dataBytes,Context context) {
		String fileName = FileUtil.getFileName(url);
		try {
			if(!FileUtil.saveFile2SDCard(fileName, dataBytes)){
				//缓存到SD卡失败时，则缓存到data/data目录下
				if(context != null){
					FileUtil.writeFileData(fileName, dataBytes, context);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取SD卡缓存
	 * @param url
	 * @return
	 */
	public byte[] getFileCache(String url) {
		return getFileCache(url,null);
	}
	
	/**
	 * 获取文件缓存<br>
	 * 优先获取SD卡目录下的缓存，SD卡不存在时，读取data/data目录下的缓存
	 * @param context
	 * @param url
	 * @return
	 */
	public byte[] getFileCache(String url,Context context) {
		
		String fileName = FileUtil.getFileName(url);
		
		byte[] dataBytes = null;
		try {
			//从SD卡读取缓存
			dataBytes = getSDCardCache(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(dataBytes == null && context != null){
			//从data/data目录读取缓存
			dataBytes = FileUtil.readFileDataByte(fileName, context);
		}
		
		return dataBytes;
	}

	/**
	 * 获取SD卡缓存
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	private byte[] getSDCardCache(String fileName) throws Exception {
		byte[] dataBytes = null;
		InputStream dataStream = null;
		if (CommonUtils.avaiableSDCard()) {
			HashMap<String, Boolean> mLocalCacheMap = FileUtil
					.getFileList2SDCard();
			if (mLocalCacheMap != null && mLocalCacheMap.containsKey(fileName)) {
				dataStream = FileUtil.readCacheFile(fileName);
			}

			if (dataStream != null) {
				dataBytes = FileUtil.readStream(dataStream);
			}
		}

		return dataBytes;
	}
	
	/**
	 * 清空缓存
	 */
	public boolean clearCache(){
		if (CommonUtils.avaiableSDCard()) {
			HashMap<String, Boolean> mLocalCacheMap = FileUtil
					.getFileList2SDCard();
			if (mLocalCacheMap != null) {
				Iterator<String> it = mLocalCacheMap.keySet().iterator();
				try {
					while (it.hasNext()) {
						String fileName = it.next();
							FileUtil.delFile2SDCard(fileName);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return true;
		}
		return false;
	}
}
