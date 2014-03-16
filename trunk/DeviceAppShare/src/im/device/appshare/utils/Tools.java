/**
 * @author EX-LIJINHUA001
 * @date 2013-4-11
 */
package im.device.appshare.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;

import com.gopawpaw.droidcore.utils.SystemInfoUtils;

/**
 * @author EX-LIJINHUA001
 * @date 2013-4-11
 */
public class Tools {
	
	public static final int TYPE_APP_NAME = 0;
	public static final int TYPE_PACKAGENAME = 0;
	/**
	 * 搜索信息
	 * @author EX-LIJINHUA001
	 * @date 2013-4-11
	 * @param list
	 * @param infoType
	 * @param like
	 * @return
	 */
	public static List<PackageInfo> searchInfo(Context context,List<PackageInfo> list,int infoType,String like){
		if(list == null){
			return null;
		}
		
		List<PackageInfo> mlist = new ArrayList<PackageInfo>();
		if(list != null)
		{
			String value = "";
			PackageInfo info = null;
			
			for(int i=0;i<list.size();i++)
			{
				info = list.get(i);
				if(info != null)
				{
					if(infoType == TYPE_APP_NAME){
						value = info.applicationInfo.loadLabel(
								context.getPackageManager()).toString();;
					}else if(infoType == TYPE_PACKAGENAME){
						value = info.packageName;
					}
					value = value.toLowerCase();
					like = like.toLowerCase();
					if(value.indexOf(like) > -1){
						mlist.add(info);
					}
				}
			}
		}
		return mlist;
	}
	
	/**
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-4-17
	 * @param context
	 * @param list
	 * @param infoType
	 * @param like
	 * @param handler
	 * @param what
	 */
	public static void searchInfoInThread(final Context context,final List<PackageInfo> list,final int infoType,final String like,final Handler handler,final int what){
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				List<PackageInfo> result = searchInfo(context,list,infoType,like);
				Message msg = new Message();
				msg.what = what;
				msg.obj = result;
				handler.sendMessage(msg);
			}
		};
		
		Thread  th = new Thread(runnable);
		th.start();
	}
	
	/**
	 * 获取设备信息
	 * @param context
	 * @return
	 */
	public static Map<String,Object> getDeviceInfo(Context context){
		
		Map<String,Object> retMap = new HashMap<String,Object>();
		
		SystemInfoUtils su = new SystemInfoUtils(context);
		HashMap<String,String> mapOs = su.logAndroidOsBuild();
		
		TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		String phoneType = "";
		int phoneT = tm.getPhoneType();
        switch(phoneT){
        case TelephonyManager.PHONE_TYPE_CDMA:
        	phoneType = "CDMA，电信";
        	break;
        case TelephonyManager.PHONE_TYPE_GSM:
        	phoneType = "GSM，移动和联通";
        	break;
        case TelephonyManager.PHONE_TYPE_NONE:
        	phoneType = "未知";
        	break;
        }
        
      //网络类型
        String network = "";
        int networkType = tm.getNetworkType();
        switch(networkType){
        case TelephonyManager.NETWORK_TYPE_GPRS:
        	network = "GPRS";
        	break;
        case TelephonyManager.NETWORK_TYPE_EDGE:
        	network = "EDGE";
        	break;
        case TelephonyManager.NETWORK_TYPE_UMTS:
        	network = "UMTS";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSPA:
        	network = "HSPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSDPA:
        	network = "HSDPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSUPA:
        	network = "HSUPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_CDMA:
        	network = "CDMA";
        	break;
        case TelephonyManager.NETWORK_TYPE_EVDO_0:
        	network = "EVDO0";
        	break;
        case TelephonyManager.NETWORK_TYPE_EVDO_A:
        	network = "EVDOA";
//        	break;
//        case TelephonyManager.NETWORK_TYPE_EVDO_B:
//        	AppLog.i(TAG, "NETWORK_TYPE: EVDO_B");
//        	break;
//        case TelephonyManager.NETWORK_TYPE_IDEN:
//        	AppLog.i(TAG, "NETWORK_TYPE: IDEN");
        	break;
        case TelephonyManager.NETWORK_TYPE_1xRTT:
        	network = "1xRTT";
        	break;
        case TelephonyManager.NETWORK_TYPE_UNKNOWN:
        	network = "UNKNOWN";
        	break;
        }
        
		retMap.put("IMEI", tm.getDeviceId());
		retMap.put("手机制式", phoneType);
		retMap.put("运营商名称", tm.getSimOperatorName());
		retMap.put("网络类型", network);
		
		retMap.put("Product", mapOs.get("Product"));
		retMap.put("操作系统", mapOs.get("RELEASE"));
		retMap.put("制造商", mapOs.get("MANUFACTURER"));
		retMap.put("SDK", mapOs.get("SDK"));
		retMap.put("CPU", mapOs.get("CPU_ABI"));
		return retMap;
	}
	
}
