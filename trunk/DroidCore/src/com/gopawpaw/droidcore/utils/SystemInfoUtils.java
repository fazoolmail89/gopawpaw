/**
 * 
 */
package com.gopawpaw.droidcore.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author Jason
 * @since: 2011-7-14
 */
public class SystemInfoUtils {
	private static final String TAG = "SystemInfoUtils";
	
	private static final String LOG_SPLIT = "=============================================";
	
	private static android.os.StatFs statfs = new android.os.StatFs(
			android.os.Environment
			.getExternalStorageDirectory().getAbsolutePath());
	
	private Context mContext = null;
	/**
	 * 
	 */
	public SystemInfoUtils(Context context) {
		// TODO Auto-generated constructor stub
		mContext = context;
	}

	public TelephonyManager getTelephonyManager(){
		return (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
	}
	
	
	
	/**
	 * 获取操作系统版本:Linux version 2.6.25-018430-gfea26b0
	 * 
	 * @author Jason
	 * @since:2011-7-14
	 * @return
	 */
	public static String getLinuxVersionInfo() {
		String result = null;
		CMDExecute cmdexe = new CMDExecute();
		try {
			String[] args = { "/system/bin/cat", "/proc/version" };
			result = cmdexe.run(args, "system/bin/");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return result.trim();
	}

	/**
	 * 获取CPU信息
	 * 
	 * @author Jason
	 * @since:2011-7-14
	 * @return
	 */
	public static String getCpuInfo() {
		String result = null;
		CMDExecute cmdexe = new CMDExecute();
		try {
			String[] args = { "/system/bin/cat", "/proc/cpuinfo" };
			result = cmdexe.run(args, "/system/bin/");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	private static String initProperty(String description, String propertyStr) {

		StringBuffer buffer = new StringBuffer();
		buffer.append(description).append(":");
		buffer.append(System.getProperty(propertyStr)).append("\n");
		return buffer.toString().trim();
	}

	/**
	 * 获取系统属性
	 * 
	 * @author Jason
	 * @since:2011-7-14
	 * @return
	 */
	public static String getSystemProperty() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(initProperty("java.vendor.url", "java.vendor.url")).append("\n");
		buffer.append(initProperty("java.class.path", "java.class.path"));
		return buffer.toString().trim();
	}

	/**
	 * 系统内存情况查看
	 */
	public String getMemoryInfo() {
		StringBuffer memoryInfo = new StringBuffer();
		final ActivityManager activityManager = (ActivityManager) this.mContext
				.getSystemService(Context.ACTIVITY_SERVICE);
		ActivityManager.MemoryInfo outInfo = new ActivityManager.MemoryInfo();
		activityManager.getMemoryInfo(outInfo);
		memoryInfo.append("\nTotal Available Memory :")
				.append(outInfo.availMem >> 10).append("K");
		memoryInfo.append("\nTotal Available Memory :")
				.append(outInfo.availMem >> 20).append("M");
		memoryInfo.append("\nIn low memory situation:").append(
				outInfo.lowMemory);
		String result = null;
		CMDExecute cmdexe = new CMDExecute();
		try {
			String[] args = { "/system/bin/cat", "/proc/meminfo" };
			result = cmdexe.run(args, "/system/bin/");
		} catch (IOException ex) {
			AppLog.i("fetch_process_info", "ex=" + ex.toString());
		}
		return memoryInfo.toString() + "\n\n" + result.trim();
	}

	/**
	 * 磁盘信息
	 * 
	 * @author Jason
	 * @since:2011-7-14
	 * @return
	 */
	public static String getDiskInfo() {
		String result = null;
		CMDExecute cmdexe = new CMDExecute();
		try {
			String[] args = { "df" };
			result = cmdexe.run(args, "/system/bin");
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return result.trim();
	}

	/**
	 * 获取网络信息 要获取手机设备的网络信息，只要读取/system/bin/netcfg中的信息就可以，关键代码如下：
	 */
	public static String getNetworkConfigInfo() {
		String result = null;
		CMDExecute cmdexe = new CMDExecute();
		try {
			String[] args = { "netcfg" };
			result = cmdexe.run(args, "/system/bin/");
		} catch (IOException ex) {
			AppLog.i("fetch_process_info", "ex=" + ex.toString());
		}
		return result.trim();
	}

	/**
	 * 获取显示频信息 除了显示手机的CPU、内存、磁盘信息外，还有个非常重要的硬件，显示频。在Android中，
	 * 它提供了DisplayMetrics类，可以通过getApplication
	 * Context()、getResources()、getDisplayMetrics()初始化，
	 * 进而读取其屏幕宽（widthPixels）、高（heightPixels）等信息，实现的关键代码如下：
	 */
	public String getDisplayMetrics() {
		String str = " ";
		DisplayMetrics dm = new DisplayMetrics();
		dm = this.mContext.getApplicationContext().getResources().getDisplayMetrics();
		int screenWidth = dm.widthPixels;
		int screenHeight = dm.heightPixels;
		float density = dm.density;
		float xdpi = dm.xdpi;
		float ydpi = dm.ydpi;
		str += "The absolute width: " + String.valueOf(screenWidth)
				+ "pixels\n";
		str += "The absolute height: " + String.valueOf(screenHeight)
				+ "pixels\n";
		str += "The logical density of the display. : "
				+ String.valueOf(density) + "\n";
		str += "X dimension : " + String.valueOf(xdpi) + "pixels per inch\n";
		str += "Y dimension : " + String.valueOf(ydpi) + "pixels per inch\n";
		return str.trim();
	}

	/**
	 * 判断SD卡是否可用
	 * 
	 * @author 李锦华
	 * @Since:2010-12-13
	 * @return
	 */
	public static boolean isSDCardEnable() {

		return Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED);
	}
	
	/**
	 * 获取SDCard总大小
	 * @Since:2010-12-13
	 * @return bit
	 */
	public static long getTotalSize() {
		// 获取SDCard上BLOCK总数
		long nTotalBlocks = statfs.getBlockCount();

		// 获取SDCard上每个block的SIZE
		long nBlocSize = statfs.getBlockSize();

		// 计算SDCard 总容量大小MB
		long nSDTotalSize = nTotalBlocks * nBlocSize;

		return nSDTotalSize;
	}

	/**
	 * 获取可用空间大小
	 * @Since:2010-12-13
	 * @return bit
	 */
	public static long getFreeSize() {

		// 获取SDCard上每个block的SIZE
		long nBlocSize = statfs.getBlockSize();

		// 获取可供程序使用的Block的数量
		long nAvailaBlock = statfs.getAvailableBlocks();

		// 获取剩下的所有Block的数量(包括预留的一般程序无法使用的块)
		// long nFreeBlock = statfs.getFreeBlocks();

		// 计算 SDCard 剩余大小B
		long nSDFreeSize = nAvailaBlock * nBlocSize;
		return nSDFreeSize;
	}
	
	/**
	 * LOG所有信息
	 * @author Jason
	 * @since:2011-7-15
	 */
	public void logSystemInfoAll(){
		logTelephonyManager();
		logAndroidOsBuild();
		logLinuxVersionInfo();
		logCpuInfo();
		logSystemProperty();
		logMemoryInfo();
		logDiskInfo();
		logNetworkConfigInfo();
		logDisplayMetrics();
		logSDCardSize();
	}
	
	
	/**
	 * AppAppLog 运营商信息
	 * @author Jason
	 * @since:2011-7-14
	 */
	public HashMap<String,String> logTelephonyManager(){
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "TelephonyManager");
		
		TelephonyManager tm = getTelephonyManager();
		
        /**
         * 返回电话状态
         * 
         * CALL_STATE_IDLE 无任何状态时 
         * CALL_STATE_OFFHOOK 接起电话时
         * CALL_STATE_RINGING 电话进来时 
         */
        int callState = tm.getCallState();
        
        String msg = "";
        if(callState == TelephonyManager.CALL_STATE_IDLE){
        	msg = "CALL_STATE_IDLE：无任何状态时";
        }else if(callState == TelephonyManager.CALL_STATE_OFFHOOK){
        	msg = "CALL_STATE_OFFHOOK：接起电话时";
        }else if(callState == TelephonyManager.CALL_STATE_RINGING){
        	msg = "CALL_STATE_RINGING：电话进来时 ";
        }else{
        	msg = "CALL_STATE_：电话状态未知！";
        }
        AppLog.i(TAG,msg);
        map.put("CALL_STATE", msg);
        
        //返回当前移动终端的位置
        CellLocation location=tm.getCellLocation();
      
        
        //请求位置更新，如果更新将产生广播，接收对象为注册LISTEN_CELL_LOCATION的对象，需要的permission名称为ACCESS_COARSE_LOCATION。
        CellLocation.requestLocationUpdate();
        
        
        /**
         * 获取数据活动状态
         * 
         * DATA_ACTIVITY_IN 数据连接状态：活动，正在接受数据
         * DATA_ACTIVITY_OUT 数据连接状态：活动，正在发送数据
         * DATA_ACTIVITY_INOUT 数据连接状态：活动，正在接受和发送数据
         * DATA_ACTIVITY_NONE 数据连接状态：活动，但无数据发送和接受
         */
        int dataActivity = tm.getDataActivity();
        
        if(dataActivity == TelephonyManager.DATA_ACTIVITY_IN){
        	msg = "DATA_ACTIVITY_IN：数据连接状态：活动，正在接受数据";
        }else if(dataActivity == TelephonyManager.DATA_ACTIVITY_OUT){
        	msg = "DATA_ACTIVITY_OUT：数据连接状态：活动，正在发送数据";
        }else if(dataActivity == TelephonyManager.DATA_ACTIVITY_INOUT){
        	msg = "DATA_ACTIVITY_INOUT：数据连接状态：活动，正在接受和发送数据 ";
        }else if(dataActivity == TelephonyManager.DATA_ACTIVITY_NONE){
        	msg = "DATA_ACTIVITY_NONE：数据连接状态：活动，但无数据发送和接受 ";
        }else{
        	msg = "DATA_ACTIVITY_：数据连接状态未知！";
        }
        AppLog.i(TAG,msg);
        map.put("DATA_ACTIVITY", msg);
        
        /**
         * 获取数据连接状态
         * 
         * DATA_CONNECTED 数据连接状态：已连接
         * DATA_CONNECTING 数据连接状态：正在连接
         * DATA_DISCONNECTED 数据连接状态：断开
         * DATA_SUSPENDED 数据连接状态：暂停
         */
        int dataState = tm.getDataState();
        
        if(dataState == TelephonyManager.DATA_CONNECTED){
        	msg = "DATA_CONNECTED：数据连接状态：已连接";
        }else if(dataState == TelephonyManager.DATA_CONNECTING){
        	msg = "DATA_CONNECTING：数据连接状态：正在连接";
        }else if(dataState == TelephonyManager.DATA_DISCONNECTED){
        	msg = "DATA_DISCONNECTED：数据连接状态：断开 ";
        }else if(dataState == TelephonyManager.DATA_SUSPENDED){
        	msg = "DATA_SUSPENDED：数据连接状态：暂停 ";
        }else{
        	msg = "DATA_STATE_：数据连接状态未知！";
        }
        AppLog.i(TAG,msg);
        map.put("DATA_STATE", msg);
        
        /**
         * 返回当前移动终端的唯一标识
         * 
         * 如果是GSM网络，返回IMEI；如果是CDMA网络，返回MEID
         */
        String deviceId = tm.getDeviceId();
        
        AppLog.i(TAG, "DeviceId(IMEI):"+deviceId);
        
        map.put("DeviceId(IMEI)", deviceId);
        
        //返回移动终端的软件版本，例如：GSM手机的IMEI/SV码。
        String deviceSoftwareVersion = tm.getDeviceSoftwareVersion();
        
        AppLog.i(TAG, "DeviceSoftwareVersion:"+deviceSoftwareVersion);
        
        map.put("DeviceSoftwareVersion", deviceSoftwareVersion);
        
        //返回手机号码，对于GSM网络来说即MSISDN
        String line1Number = tm.getLine1Number();
        
        AppLog.i(TAG, "Line1Number:"+line1Number);
        map.put("Line1Number", line1Number);
        
        //返回当前移动终端附近移动终端的信息
        List<NeighboringCellInfo> infos=tm.getNeighboringCellInfo();
        int infoN = 0;
        for(NeighboringCellInfo info:infos){
        	AppLog.e(TAG, "NeighboringCellInfo:"+infoN++);
        	
            //获取邻居小区号ß
            int cid=info.getCid();
            AppLog.i(TAG, "邻居小区号:"+cid);
            map.put("邻居小区号", ""+cid);
            
            //获取邻居小区LAC，LAC: 位置区域码。为了确定移动台的位置，每个GSM/PLMN的覆盖区都被划分成许多位置区，LAC则用于标识不同的位置区。
            int lac = info.getLac();
            AppLog.i(TAG, "位置区域码:"+lac);
            map.put("位置区域码", ""+cid);
            
            //网络类型
            int networkType = info.getNetworkType();
            switch(networkType){
            case TelephonyManager.NETWORK_TYPE_GPRS:
            	msg = "GPRS";
            	break;
            case TelephonyManager.NETWORK_TYPE_EDGE:
            	msg = "EDGE";
            	break;
            case TelephonyManager.NETWORK_TYPE_UMTS:
            	msg = "UMTS";
            	break;
            case TelephonyManager.NETWORK_TYPE_HSPA:
            	msg = "HSPA";
            	break;
            case TelephonyManager.NETWORK_TYPE_HSDPA:
            	msg = "HSDPA";
            	break;
            case TelephonyManager.NETWORK_TYPE_HSUPA:
            	msg = "HSUPA";
            	break;
            }
            
            AppLog.i(TAG,"NETWORK_TYPE:"+msg);
            map.put("NETWORK_TYPE", msg);
            
            
            int psc = info.getPsc();
            AppLog.i(TAG, "Psc："+psc);
            
            map.put("Psc", ""+psc);
            
            //获取邻居小区信号强度  
            int rssi = info.getRssi();
            AppLog.i(TAG, "信号强度："+rssi);
            
            map.put("信号强度", ""+rssi);
        }
        
        
        //返回ISO标准的国家码，即国际长途区号
        String networkCountryIso = tm.getNetworkCountryIso();
        AppLog.i(TAG, "国际长途区号:"+networkCountryIso);
        
        map.put("国际长途区号", ""+networkCountryIso);
        
        //返回MCC+MNC代码 (SIM卡运营商国家代码和运营商网络代码)(IMSI)
        String operator = tm.getNetworkOperator();
        AppLog.i(TAG, "运营商网络代码:"+operator);
        map.put("运营商网络代码", ""+operator);
        
        //返回移动网络运营商的名字(SPN)
        String spn = tm.getNetworkOperatorName();
        AppLog.i(TAG, "移动网络运营商(SPN):"+spn);
        map.put("移动网络运营商(SPN)", ""+spn);
        
        /**
         * 获取网络类型
         * 
         * NETWORK_TYPE_CDMA 网络类型为CDMA
         * NETWORK_TYPE_EDGE 网络类型为EDGE
         * NETWORK_TYPE_EVDO_0 网络类型为EVDO0
         * NETWORK_TYPE_EVDO_A 网络类型为EVDOA
         * NETWORK_TYPE_GPRS 网络类型为GPRS
         * NETWORK_TYPE_HSDPA 网络类型为HSDPA
         * NETWORK_TYPE_HSPA 网络类型为HSPA
         * NETWORK_TYPE_HSUPA 网络类型为HSUPA
         * NETWORK_TYPE_UMTS 网络类型为UMTS
         * 
         * 在中国，联通的3G为UMTS或HSDPA，移动和联通的2G为GPRS或EGDE，电信的2G为CDMA，电信的3G为EVDO
         */
        int networkType = tm.getNetworkType();
        switch(networkType){
        case TelephonyManager.NETWORK_TYPE_GPRS:
        	msg = "GPRS";
        	break;
        case TelephonyManager.NETWORK_TYPE_EDGE:
        	msg = "EDGE";
        	break;
        case TelephonyManager.NETWORK_TYPE_UMTS:
        	msg = "UMTS";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSPA:
        	msg = "HSPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSDPA:
        	msg = "HSDPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_HSUPA:
        	msg = "HSUPA";
        	break;
        case TelephonyManager.NETWORK_TYPE_CDMA:
        	msg = "CDMA";
        	break;
        case TelephonyManager.NETWORK_TYPE_EVDO_0:
        	msg = "EVDO0";
        	break;
        case TelephonyManager.NETWORK_TYPE_EVDO_A:
        	msg = "EVDOA";
//        	break;
//        case TelephonyManager.NETWORK_TYPE_EVDO_B:
//        	AppLog.i(TAG, "NETWORK_TYPE: EVDO_B");
//        	break;
//        case TelephonyManager.NETWORK_TYPE_IDEN:
//        	AppLog.i(TAG, "NETWORK_TYPE: IDEN");
        	break;
        case TelephonyManager.NETWORK_TYPE_1xRTT:
        	msg = "1xRTT";
        	break;
        case TelephonyManager.NETWORK_TYPE_UNKNOWN:
        	msg = "UNKNOWN";
        	break;
        }
        AppLog.i(TAG,"NETWORK_TYPE:"+msg);
        map.put("NETWORK_TYPE", msg);
        
        /**
         * 返回移动终端的类型
         * 
         * PHONE_TYPE_CDMA 手机制式为CDMA，电信
         * PHONE_TYPE_GSM 手机制式为GSM，移动和联通
         * PHONE_TYPE_NONE 手机制式未知
         */
        int phoneType = tm.getPhoneType();
        switch(phoneType){
        case TelephonyManager.PHONE_TYPE_CDMA:
        	msg = "CDMA，电信";
        	break;
        case TelephonyManager.PHONE_TYPE_GSM:
        	msg = "GSM，移动和联通";
        	break;
        case TelephonyManager.PHONE_TYPE_NONE:
        	msg = "未知";
        	break;
        }
        AppLog.i(TAG,"手机制式:"+msg);
        map.put("手机制式", msg);
        
        //返回SIM卡提供商的国家代码
        String simCountryIso = tm.getSimCountryIso();
        AppLog.i(TAG,"国家代码:"+simCountryIso);
        map.put("国家代码", simCountryIso);
        
        //返回MCC+MNC代码 (SIM卡运营商国家代码和运营商网络代码)(IMSI)
        String simOperatro = tm.getSimOperator();
        AppLog.i(TAG, "运营商SIM代码:"+simOperatro);
        map.put("运营商SIM代码", simOperatro);
        String simOperatorName = tm.getSimOperatorName();
        AppLog.i(TAG, "运营商名称："+simOperatorName);
        map.put("运营商名称", simOperatorName);
        
        //返回SIM卡的序列号(IMEI)
        String simSerial = tm.getSimSerialNumber();
        AppLog.i(TAG, "SimSerialNumber："+simSerial);
        map.put("SimSerialNumber", simSerial);
        
        /**
         * 返回移动终端
         * 
         * SIM_STATE_ABSENT SIM卡未找到
         * SIM_STATE_NETWORK_LOCKED SIM卡网络被锁定，需要Network PIN解锁
         * SIM_STATE_PIN_REQUIRED SIM卡PIN被锁定，需要User PIN解锁
         * SIM_STATE_PUK_REQUIRED SIM卡PUK被锁定，需要User PUK解锁
         * SIM_STATE_READY SIM卡可用
         * SIM_STATE_UNKNOWN SIM卡未知
         */
        int simState = tm.getSimState();
        switch(simState){
        case TelephonyManager.SIM_STATE_ABSENT:
        	msg = "SIM卡未找到";
        	break;
        case TelephonyManager.SIM_STATE_NETWORK_LOCKED:
        	msg = "SIM卡网络被锁定，需要Network PIN解锁";
        	break;
        case TelephonyManager.SIM_STATE_PIN_REQUIRED:
        	msg = "SIM卡PIN被锁定，需要User PIN解锁";
        	break;
        case TelephonyManager.SIM_STATE_PUK_REQUIRED:
        	msg = "SIM卡PUK被锁定，需要User PUK解锁";
        	break;
        case TelephonyManager.SIM_STATE_READY:
        	msg = "SIM卡可用";
        	break;
        case TelephonyManager.SIM_STATE_UNKNOWN:
        	msg = "SIM卡未知";
        	break;
        }
        AppLog.i(TAG,"SIM卡:"+msg);
        map.put("SIM卡", msg);
        
        //返回用户唯一标识，比如GSM网络的IMSI编号
        String imsi = tm.getSubscriberId();
        AppLog.i(TAG, "IMSI:"+imsi);
        map.put("IMSI", imsi);
        
        //获取语音信箱号码关联的字母标识。 
        String voiceMailAlp = tm.getVoiceMailAlphaTag();
        AppLog.i(TAG, "VoiceMail字母标识:"+voiceMailAlp);
        map.put("VoiceMail字母标识", voiceMailAlp);
        
        //返回语音邮件号码
        String voiceMailNum = tm.getVoiceMailNumber();
        AppLog.i(TAG, "voiceMailNum:"+voiceMailNum);
        map.put("voiceMailNum", voiceMailNum);
        
        boolean icc = tm.hasIccCard();
        AppLog.i(TAG, "hasIccCard:"+icc);
        map.put("hasIccCard", ""+icc);
        
        //返回手机是否处于漫游状态
        boolean isNetworkRoaming = tm.isNetworkRoaming();
        AppLog.i(TAG, "isNetworkRoaming:"+isNetworkRoaming);
        map.put("isNetworkRoaming", ""+isNetworkRoaming);
        // tm.listen(PhoneStateListener listener, int events) ;
        
        //解释：
        //IMSI是国际移动用户识别码的简称(International Mobile Subscriber Identity)
        //IMSI共有15位，其结构如下：
        //MCC+MNC+MIN
        //MCC：Mobile Country Code，移动国家码，共3位，中国为460;
        //MNC:Mobile NetworkCode，移动网络码，共2位
        //在中国，移动的代码为电00和02，联通的代码为01，电信的代码为03
        //合起来就是（也是Android手机中APN配置文件中的代码）：
        //中国移动：46000 46002
        //中国联通：46001
        //中国电信：46003
        //举例，一个典型的IMSI号码为460030912121001

        //IMEI是International Mobile Equipment Identity （国际移动设备标识）的简称
        //IMEI由15位数字组成的”电子串号”，它与每台手机一一对应，而且该码是全世界唯一的
        //其组成为：
        //1. 前6位数(TAC)是”型号核准号码”，一般代表机型
        //2. 接着的2位数(FAC)是”最后装配号”，一般代表产地
        //3. 之后的6位数(SNR)是”串号”，一般代表生产顺序号
        //4. 最后1位数(SP)通常是”0″，为检验码，目前暂备用
        
        return map;
	}
	
	
	public HashMap<String,String> logAndroidOsBuild(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "AndroidOsBuild");
		String phoneInfo = "\nProduct: " + android.os.Build.PRODUCT;
		phoneInfo += ", \nCPU_ABI: " + android.os.Build.CPU_ABI;
		phoneInfo += ", \nTAGS: " + android.os.Build.TAGS;
		phoneInfo += ", \nVERSION_CODES.BASE: "
				+ android.os.Build.VERSION_CODES.BASE;
		phoneInfo += ", \nMODEL: " + android.os.Build.MODEL;
		phoneInfo += ", \nSDK: " + android.os.Build.VERSION.SDK;
		phoneInfo += ", \nVERSION.RELEASE: "
				+ android.os.Build.VERSION.RELEASE;
		phoneInfo += ", \nDEVICE: " + android.os.Build.DEVICE;
		phoneInfo += ", \nDISPLAY: " + android.os.Build.DISPLAY;
		phoneInfo += ", \nBRAND: " + android.os.Build.BRAND;
		phoneInfo += ", \nBOARD: " + android.os.Build.BOARD;
		phoneInfo += ", \nFINGERPRINT: " + android.os.Build.FINGERPRINT;
		phoneInfo += ", \nID: " + android.os.Build.ID;
		phoneInfo += ", \nMANUFACTURER: " + android.os.Build.MANUFACTURER;
		phoneInfo += ", \nUSER: " + android.os.Build.USER;
		AppLog.i(TAG, phoneInfo);
		
		map.put("Product", android.os.Build.PRODUCT);
		map.put("CPU_ABI", android.os.Build.CPU_ABI);
		map.put("TAGS", android.os.Build.TAGS);
		map.put("VERSION_CODES.BASE", ""+android.os.Build.VERSION_CODES.BASE);
		map.put("MODEL", android.os.Build.MODEL);
		map.put("SDK", ""+android.os.Build.VERSION.SDK);
		map.put("RELEASE", android.os.Build.VERSION.RELEASE);
		map.put("DISPLAY", android.os.Build.DEVICE);
		map.put("BRAND", android.os.Build.BRAND);
		map.put("BOARD", android.os.Build.BOARD);
		map.put("FINGERPRINT", android.os.Build.FINGERPRINT);
		map.put("ID", android.os.Build.ID);
		map.put("MANUFACTURER", android.os.Build.MANUFACTURER);
		map.put("USER", android.os.Build.USER);
		
		return map;
	}
	
	public HashMap<String,String> logLinuxVersionInfo(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "LinuxVersionInfo");
		String msg = getLinuxVersionInfo();
		AppLog.i(TAG, msg);
		map.put("LinuxVersionInfo", msg);
		return map;
	}
	
	
	public HashMap<String,String> logCpuInfo(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "CpuInfo");
		
		String msg = getCpuInfo();
		AppLog.i(TAG, msg);
		map.put("CpuInfo", msg);
		return map;
	}
	
	public HashMap<String,String> logSystemProperty(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "SystemProperty");
		
		String msg = getSystemProperty();
		AppLog.i(TAG, msg);
		map.put("SystemProperty", msg);
		return map;
	}
	
	public HashMap<String,String> logMemoryInfo(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "MemoryInfo");
		
		String msg = getMemoryInfo();
		AppLog.i(TAG, msg);
		map.put("MemoryInfo", msg);
		return map;
	}
	
	public HashMap<String,String> logDiskInfo(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "DiskInfo");
		
		String msg = getDiskInfo();
		AppLog.i(TAG, msg);
		map.put("DiskInfo", msg);
		return map;
	}
	
	public HashMap<String,String> logNetworkConfigInfo(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "NetworkConfigInfo");
		
		String msg = getNetworkConfigInfo();
		AppLog.i(TAG, msg);
		map.put("NetworkConfigInfo", msg);
		return map;
	}
	
	public HashMap<String,String> logDisplayMetrics(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "DisplayMetrics");
		
		String msg = getDisplayMetrics();
		AppLog.i(TAG, msg);
		map.put("DisplayMetrics", msg);
		return map;
	}

	public HashMap<String,String> logSDCardSize(){
		HashMap<String,String> map = new HashMap<String,String>();
		AppLog.i(TAG, LOG_SPLIT);
		AppLog.d(TAG, "SDCardSize");
		
		String msg = ""+getTotalSize();
		AppLog.i(TAG, "TotalSize:"+msg+"K");
		map.put("TotalSize", msg);
		
		msg = ""+getFreeSize();
		AppLog.i(TAG, "FreeSize:"+msg+"K");
		map.put("FreeSize", msg);
		
		return map;
	}
	
	
	
	
}
