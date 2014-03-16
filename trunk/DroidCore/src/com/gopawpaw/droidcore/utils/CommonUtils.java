package com.gopawpaw.droidcore.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.struct.AppKeyConstants;

/**
 * @author CUNGUANTONG
 * @date 2011-12-14
 * @version
 * @description 工具处理类convertStreamToString
 */
public class CommonUtils {

	private static final String TAG = CommonUtils.class.getSimpleName();

	public static final int MSG_SHOW_ALERTDIALOG = 1;

	
	public static final String SHARED_CONFIG_FILE_NAME = "shared_config";

	private static List<Activity> activityList = new ArrayList<Activity>();
	
	/**
	 * 判断网络是否畅通
	 * 
	 * @param context
	 * @return
	 */
	public static boolean isNetworkAvailable(Context context) 
	{
//		if(true){
//			return true;
//		}
		ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity == null) {
			return false;
		} 
		else 
		{
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null) 
			{
				for (int i = 0; i < info.length; i++) 
				{
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	/**    
     * 获取当前的网络状态 - 空字符串：没有网络   wifi：WIFI网络  cmwap：wap网络   cmnet：net网络    
     *     
     * @param context    
     * @return    
     */    
    public static String getAPNType(Context context) {    
        String netType = "";    
        ConnectivityManager connMgr = (ConnectivityManager) context    
                .getSystemService(Context.CONNECTIVITY_SERVICE);    
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();    
   
        if (networkInfo == null) {    
            return netType;
        }    
        int nType = networkInfo.getType();    
        if (nType == ConnectivityManager.TYPE_MOBILE) {    
            if (networkInfo.getExtraInfo().toLowerCase().equals("cmnet")) {    
                netType = "cmnet";
            } else {
                netType = "cmwap";
            }
        } else if (nType == ConnectivityManager.TYPE_WIFI) {    
            netType = "wifi";    
        }    
        return netType;    
    }
	
	/*
     * 打开设置网络界面
     * */
    public static void setNetworkMethod(final Context context){
        //提示对话框
        AlertDialog.Builder builder=new Builder(context);
        builder.setTitle("网络设置提示").setMessage("网络连接不可用,是否进行设置?").setPositiveButton("设置", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                Intent intent=null;
                //判断手机系统的版本  即API大于10 就是3.0或以上版本 
                if(android.os.Build.VERSION.SDK_INT>10){
                    intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
                }else{
                    intent = new Intent();
                    ComponentName component = new ComponentName("com.android.settings","com.android.settings.WirelessSettings");
                    intent.setComponent(component);
                    intent.setAction("android.intent.action.VIEW");
                }
                context.startActivity(intent);
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        }).show();
    }
	


	
	/**
	 * [模糊搜索动态数组]<BR>
	 * [功能详细描述]
	 * @param list 页面得到的数组
	 * @param key  要匹配字段的key
	 * @param like 模糊字符
	 * @return
	 */
	public static List<Map<String, Object>> qryLikeList(List<Map<String, Object>> list, String key, String like)
	{
		if(Tools.isEmpty(like)) {
			return list;
		}
			
		List<Map<String, Object>> mlist = new ArrayList<Map<String,Object>>();
		if(list != null)
		{
			String value = "";
			Map<String, Object> map = null;
			
			for(int i=0;i<list.size();i++)
			{
				map = list.get(i);
				if(map != null)
				{
					value = map.get(key).toString();
					if(value.indexOf(like) > -1){
						mlist.add(map);
					}
				}
			}
		}
		return mlist;
	}
	
	
	/**
	 * 计算ListView高度并写定高度
	 * 
	 * @param listView 仅对于Listitem布局为LinearLayout的有效
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView) {
		ListAdapter listAdapter = listView.getAdapter();
		if (listAdapter == null) {
			return;
		}

		int totalHeight = 0;
		for (int i = 0; i < listAdapter.getCount(); i++) {
			View listItem = listAdapter.getView(i, null, listView);
			listItem.measure(0, 0);
			totalHeight += listItem.getMeasuredHeight();
		}

		int height = totalHeight
				+ (listView.getDividerHeight() * (listAdapter.getCount() - 1));
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, height);
		listView.setLayoutParams(params);
	}

	
	/**
     * 得到系统级别的缓存对象
     * @param context
     * @return
     */
    public static SharedPreferences getSysShare(Context context, String mapKey){
        return context.getSharedPreferences(mapKey, Context.MODE_PRIVATE);
    }
    
    /**
     * 添加系统缓存信息
     * 
     * [一句话功能简述]<BR>
     * [功能详细描述]
     * @param context
     * @param mapKey
     * @param key
     * @param value
     */
    public static void saveSysMap(Context context ,String mapKey, String key , String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(mapKey, Context.MODE_PRIVATE);
        Editor sysEdit =  sharedPreferences.edit();
        sysEdit.putString(key, value);
        sysEdit.commit();
    }
 
	/**
	 * [通过汇率得到折算成人名币,用于处理大数]<BR>
	 * @param balance 货币
	 * @param rate 汇率
	 */
	public static BigDecimal getBalanceToRMB(String value, String rate) {
		
		BigDecimal valueDecimal = new BigDecimal(value);
		BigDecimal rateDecimal = new BigDecimal(rate);
		return getBalanceToRMB(valueDecimal, rateDecimal);
	}
	
	public static BigDecimal getBalanceToRMB(BigDecimal valueDecimal, BigDecimal rateDecimal) {
		
		BigDecimal mulDecimal = new BigDecimal(10000);
		BigDecimal mulResult = valueDecimal.multiply(mulDecimal);
		BigDecimal result = mulResult.divide(rateDecimal, 2, BigDecimal.ROUND_HALF_UP);
		return result;
	}
	
	/**
	 * [大数比较]<BR>
	 * @param value1
	 * @param value2
	 * @return 1为大于，-1为小于，0为等于
	 */
	public static int compareBigNum(String value1, String value2) {
		BigDecimal bigDecimal = new BigDecimal(value1);
		BigDecimal bigDecimal2 = new BigDecimal(value2);
		return bigDecimal.compareTo(bigDecimal2);
	}
	
	
	
	/**
	 * [得到Map中的第一个Key]<BR>
	 * @param map map
	 * @return key值
	 */
	public static Object getMapKey(Map<?, ?> map) {
		
		Iterator<?> it = map.keySet().iterator();
		if (it.hasNext()) {
			return it.next();
		}
		return null;
	}
	
	/**
	 * 是否需要帮助向导
	 * @param context context
	 * @return true为需要
	 */
	public static boolean isNeedHelper(Context context){
		SharedPreferences preference = context.getSharedPreferences(SHARED_CONFIG_FILE_NAME, Context.MODE_PRIVATE);
		//已经 被帮助过的版本号
		int helperVersion = preference.getInt(AppKeyConstants.SHARED_APP_VERSION_FOR_HELPER, AppKeyConstants.SHARED_INITEGER_DEFAULT);
		//当前版本号
		int curVersion = getAppVersionCode(context);
		if(curVersion!=helperVersion){
			return true;
		}
		return false;
		
	}
	/**
	 * 检查是否需要导航
	 * @param context	context
	 * @param navType	
	 * {@link AppKeyConstants#SHARED_HOME_FIRST_LAUNCHER}  
	 * {@link AppKeyConstants#SHARED_CALANDER_FIRST_LAUNCHER}
	 * {@link AppKeyConstants#SHARED_TRANSFER_FIRST_LAUNCHER}  
	 * {@link AppKeyConstants#SHARED_MY_SELF_FIRST_LAUNCHER}
	 * @return 如果需要导航会返回true
	 */
	public static boolean isNeedNavigation(Context context,String navType){
		SharedPreferences preference = context.getSharedPreferences(SHARED_CONFIG_FILE_NAME, Context.MODE_PRIVATE);
		return preference.getBoolean(navType, true);
	}
	/**
	 * 用户不再需要导航
	 * @param context	context
	 * @param navType	
	 * {@link AppKeyConstants#SHARED_HOME_FIRST_LAUNCHER}  
	 * {@link AppKeyConstants#SHARED_CALANDER_FIRST_LAUNCHER}
	 * {@link AppKeyConstants#SHARED_TRANSFER_FIRST_LAUNCHER}  
	 * {@link AppKeyConstants#SHARED_MY_SELF_FIRST_LAUNCHER}
	 */
	public static void cancleNavigation(Context context,String navType){
		SharedPreferences preference = context.getSharedPreferences(SHARED_CONFIG_FILE_NAME, Context.MODE_PRIVATE);
		Editor mSharedDataEditor = preference.edit();
		mSharedDataEditor.putBoolean(navType, false);
		mSharedDataEditor.commit();
	}
	
	/**
	 * 记录帮助  代表这个版本我已经被帮助向导过一次
	 * @param version 要记录的版本号
	 */
	public static void recordHelper(int version,Context context){
		SharedPreferences preference = context.getSharedPreferences(SHARED_CONFIG_FILE_NAME, Context.MODE_PRIVATE);
		Editor mSharedDataEditor = preference.edit();
		mSharedDataEditor.putInt(AppKeyConstants.SHARED_APP_VERSION_FOR_HELPER, version);
		mSharedDataEditor.commit();
	}
	/**
	 * 记录帮助  代表当前这个应用版本我已经帮助过
	 */
	public static void recordHelper(Context context){
		recordHelper(getAppVersionCode(context), context);
	}
	
	/**
	 * 返回当前程序版本名
	 */
	public static int getAppVersionCode(Context context) {
		int versioncode = 0;
		try {
			// ---get the package info---
			PackageManager pm = context.getPackageManager();
			PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
			versioncode = pi.versionCode;
			
		} catch (Exception e) {
			Log.e("VersionInfo", "Exception", e);
		}
		return versioncode;
	}
	
	/**
	 * 返回当前程序版本名
	 */
	public static String getAppVersionName(Context context) {
		String versionName = "";
		try {
			// ---get the package info---
			PackageManager pm = context.getPackageManager();
			PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
			versionName = pi.versionName;
			if (versionName == null || versionName.length() <= 0) {
				return "";
			}
		} catch (Exception e) {
			Log.e("VersionInfo", "Exception", e);
		}
		return versionName;
	}
	
	/**
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param context
	 * @param len
	 * @return
	 */
	public static String getVersionName(Context context, int len)
	{
	    String versionName = "";
		PackageInfo pinfo = null;
		
		try {
			pinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_CONFIGURATIONS);
			versionName = pinfo.versionName;
		 } catch (NameNotFoundException e) {
			e.printStackTrace();
		 }
		
		 AppLog.e(TAG, "getVersionName : " + versionName);
		 return versionName;
	 }
	
	 /**
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param context
	 * @return
	 */
	public static String getVersionName(Context context)
	{
		 return getVersionName(context , 3);
	 }
	
	public static List<Map<String, Object>> sort(List<Map<String, Object>> dataList, String sortByKey) {
		
		int tempLength;
		int length = dataList.size();
		String no1;
		String no2;
		Map<String, Object> map1;
		Map<String, Object> map2;
		@SuppressWarnings("unused")
		Map<String, Object> tempMap;
		for (int i = 0;i < length;i++) {
			tempLength = length - i - 1;
			for (int j = 0;j < tempLength;j++) {
				map1 = dataList.get(j);
				map2 = dataList.get(j + 1);
				no1 = map1.get(sortByKey).toString();
				no2 = map2.get(sortByKey).toString();
				if (no1 != null && ! no1.equals("") && no2 != null && !no2.equals("")) {
					int num1 =Integer.parseInt(no1);
					int num2 =Integer.parseInt(no2);
					if (num1 < num2) {
						tempMap = map1;
						dataList.set(j, map2);
						dataList.set(j + 1, map1);
						tempMap = null;
					}
				}
			}
		}
		return dataList;
	}
	
	
	/**
	 * 排序
	 * @param list list
	 * @param key key
	 */
	public static void sortList(List<Map<String, Object>> list, final String key) {
		Comparator<Map<String, Object>> mapComprator = new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String date1 = (String) o1.get(key);
				String date2 = (String) o2.get(key);
				int compare = DateUtils.compareDate(date1, date2);
				if (date1.equals("") && date2.equals("")) {
					return 0;
				}
				if (date1.equals("")) {
					return 1;
				}
				if (date2.equals("")) {
					return -1;
				}
				if (compare == -1) {
					return 1;
				} else if (compare == 1) {
					return -1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(list, mapComprator);
	}
	
	/**
	 * 判断是否有SD卡
	 * @return
	 */
	public static boolean avaiableSDCard(){  
        String status = Environment.getExternalStorageState();  
        if(status.equals(Environment.MEDIA_MOUNTED)){  
            return true;  
        }
        else {  
            return false;  
        }  
    }
	
/************************模拟堆栈，管理Activity************************/	
	
	public static void remove(Activity activity){
		activityList.remove(activity);
	}
	
	public static void add(Activity activity){
		activityList.add(activity);
	}
	
	public static void finishProgram(){
		for(Activity activity:activityList){
			activity.finish();
		}
//		WebTrends.exitTrack();
		android.os.Process.killProcess(android.os.Process.myPid());
	}
	
	 public static String getSysValue(Context context, String key,String def){
	    	SharedPreferences sp = getSysShare(context,SHARED_CONFIG_FILE_NAME);
	    	String value  = sp.getString(key, def);
	    	
	    	return value;
	    }
	    
	    /**
	     * 添加系统缓存信息
	     * 
	     * [一句话功能简述]<BR>
	     * [功能详细描述]
	     * @param context
	     * @param key
	     * @param value
	     */
	    public static void saveSysMap(Context context , String key , String value){
	    	saveSysMap(context,SHARED_CONFIG_FILE_NAME,key,value);
	    }
	    
	    /**
		 * [将文件流转换成字节]<BR>
		 * [功能详细描述]
		 * 
		 * @param inStream
		 *            InputStream
		 * @return
		 * @throws IOException
		 */
		public static byte[] readStream(InputStream inStream) throws IOException {
			ByteArrayOutputStream outstream = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = inStream.read(buffer)) != -1) {
				outstream.write(buffer, 0, len);
			}

			return outstream.toByteArray();
		}
		public static String getIMEI(Context context){
			TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
			return tm.getDeviceId();
		}
}
