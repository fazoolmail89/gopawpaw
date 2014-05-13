package im.device.appshare;

import im.device.appshare.SelectShareDialog.OnSelectShareItem;
import im.device.appshare.adapter.AppsListAdapter;
import im.device.appshare.utils.Tools;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gopawpaw.droidcore.AppConfig;
import com.gopawpaw.droidcore.activity.BaseActivity;
import com.gopawpaw.droidcore.http.HttpHelper;
import com.gopawpaw.droidcore.http.action.HttpAction;
import com.gopawpaw.droidcore.http.action.HttpActionListener;
import com.gopawpaw.droidcore.utils.CommonUtils;
import com.tendcloud.tenddata.TCAgent;

/**
 * @author EX-LIJINHUA001
 * @date 2013-3-29
 */
public class DeviceAppShareActivity extends BaseActivity implements HttpActionListener,
		OnItemClickListener, OnItemLongClickListener,OnSelectShareItem {
	private static final String TAG = "DeviceAppShareActivity";
	
	//定义menu菜单ID
	private final int MENU_1=0;
	private final int MENU_2=1;
	
	private EditText mETSearch;
	private TextView mTvResult;
	private ListView mListView;

	private AppsListAdapter mDeviceAppsAdapter;

	private List<PackageInfo> mListData;

	private HttpAction mAction;
	
	private String mApkUrl = null;
	
	private SelectShareDialog mSelectShareDialog;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TCAgent.init(this);
		AppConfig.init(this);
		if(AppConfig.IS_PRODUCT){
			HttpHelper.setHostUrl(AppConfig.URL_ID_HOST_PRD);
		}else{
			HttpHelper.setHostUrl(AppConfig.URL_ID_HOST_STG);
		}
		
		setContentView(R.layout.activity_device_appshare);
		mETSearch = (EditText) findViewById(R.id.et_search);
		mTvResult = (TextView) findViewById(R.id.tv_count);
		mListView = (ListView) findViewById(R.id.list);

		mListData = getAppsList();

		mDeviceAppsAdapter = new AppsListAdapter(this, mListData);

		mListView.setAdapter(mDeviceAppsAdapter);
		mListView.setOnItemClickListener(this);
		mListView.setOnItemLongClickListener(this);
		
		mTvResult.setText("找到" + mListData.size() + "个应用");
		mETSearch.addTextChangedListener(mTextWatcher);
		
	    
		mSelectShareDialog = new SelectShareDialog(this,this);
		mAction = new HttpAction(this, this);
		
		String imei = CommonUtils.getIMEI(this);
		
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("app", "im.device.appshare");
		params.put("client", "1");
		params.put("version", CommonUtils.getVersionName(this));
		params.put("imei", imei);
		
		
		mAction.sendRequest(getString(R.string.url_app_update),params);
		
		Map<String, Object> map = Tools.getDeviceInfo(this);
		TCAgent.onEvent(this, "Open-AppShare",imei,map);
		
	}

	public void onResume() {
		super.onResume();
		TCAgent.onResume(this);
	}

	public void onPause() {
		super.onPause();
		TCAgent.onPause(this);
	}
	
	private TextWatcher mTextWatcher = new TextWatcher() {

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			searchAppsName(s.toString());
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
			// TODO Auto-generated method stub

		}
	};

	private void searchAppsName(String name) {
		Tools.searchInfoInThread(this, mListData,
				Tools.TYPE_APP_NAME, name,mHandler,10);
	}
	
	
	private Handler mHandler = new Handler(){

		@Override
		public void handleMessage(Message msg) {
			if(msg.what == 10){
				List<PackageInfo> listData = (List<PackageInfo>) msg.obj;
				if (listData == null || listData.size() == 0) {
					mTvResult.setText("找到0个应用");
				} else {
					mTvResult.setText("找到" + listData.size() + "个应用");
				}
				mDeviceAppsAdapter.setData(listData);
				mDeviceAppsAdapter.notifyDataSetChanged();
			}
		}
		
	};

	private List<PackageInfo> getAppsList() {
		List<PackageInfo> packages = getPackageManager()
				.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);
		List<PackageInfo> list = new ArrayList<PackageInfo>();
		for (int i = 0; i < packages.size(); i++) {
			PackageInfo packageInfo = packages.get(i);
			if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) {
				continue;// 如果系统应用，则不添加至appList
			}
			list.add(packageInfo);
		}
		return list;
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		PackageInfo pinfo = mDeviceAppsAdapter.getItem(arg2);
//		mSelectShareDialog.setData(pinfo);
//		if(!mSelectShareDialog.isShowing()){
//			mSelectShareDialog.show();
//		}
//		
		Map<String,Object> map = getAppInfo(pinfo);
		String label = map.get("应用名")+"："+pinfo.packageName;
//		TCAgent.onEvent(this, "应用分享",label,map);
		
		String apkPath = pinfo.applicationInfo.sourceDir;
		String appName = pinfo.applicationInfo.loadLabel(getPackageManager())
		.toString();
//		sendShareApk(appName, apkPath);
		BluetoothScanerActivity.actionStart(this, appName, apkPath);
		
		TCAgent.onEvent(this, "应用分享-分享apk",label,map);
		
	}
	
	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
//		PackageInfo pinfo = mDeviceAppsAdapter.getItem(arg2);
//		mSelectOptionDialog.setData(pinfo);
//		if(!mSelectOptionDialog.isShowing()){
//			mSelectOptionDialog.show();
//		}
//		Map<String,Object> map = getAppInfo(pinfo);
//		String label = map.get("应用名")+"："+pinfo.packageName;
//		TCAgent.onEvent(this, "应用管理",label,map);
		return true;
	}

	
	private void loadApp(String packageName) {
		if (packageName == null) {
			return;
		}
		String ANDROID_MARKET = "market://details?id=";
		PackageManager pm = getPackageManager();
		try {
			// String className = null;
			//
			// Intent qintent = new Intent(Intent.ACTION_MAIN);
			// qintent.addCategory(Intent.CATEGORY_LAUNCHER);
			// qintent.setPackage(packageName);
			// List<ResolveInfo> list = pm.queryIntentActivities(qintent,
			// PackageManager.GET_ACTIVITIES);
			//
			// if(list != null){
			// for (ResolveInfo resolveInfo : list) {
			// className = resolveInfo.activityInfo.name;
			// AppLog.e(TAG, "activity:"+className);
			// //有多个第一启动项，取第一个
			// break;
			// }
			// }
			//
			//
			// if (className != null) {
			// Intent intent = new Intent();
			// ComponentName cn = new ComponentName(packageName, className);
			// intent.setComponent(cn);
			// startActivity(intent);
			// } else {
			// Uri uri = Uri.parse(ANDROID_MARKET + packageName);
			// Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			// startActivity(intent);
			// }

			Intent intent = pm.getLaunchIntentForPackage(packageName);
			if (intent != null) {
				startActivity(intent);
			} else {
				Uri uri = Uri.parse(ANDROID_MARKET + packageName);
				intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Uri uri = Uri.parse(ANDROID_MARKET + packageName);
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
		}
	}
	
	
	private void startApplicationDetailsActivity(String packageName) {
		try {
			Intent localIntent1 = new Intent("android.intent.action.VIEW");
			localIntent1.setClassName("com.android.settings",
					"com.android.settings.InstalledAppDetails");
			localIntent1.putExtra("pkg", packageName);
			startActivity(localIntent1);
		} catch (ActivityNotFoundException localActivityNotFoundException) {
			Intent localIntent2 = new Intent(
					"android.settings.APPLICATION_DETAILS_SETTINGS");
			localIntent2.setClassName("com.android.settings",
					"com.android.settings.applications.InstalledAppDetails");
			localIntent2.setData(Uri.parse("package:" + packageName));
			startActivity(localIntent2);
		}
	}

	/**
	 * APP卸载
	 * @author EX-LIJINHUA001
	 * @date 2013-4-17
	 * @param packageName
	 */
	private void appUninstall(String packageName){
		//通过程序的报名创建URI 
		Uri packageURI = Uri.parse("package:"+packageName); 
		//创建Intent意图 
		Intent intent = new Intent(Intent.ACTION_DELETE,packageURI); 
		//执行卸载程序 
		startActivity(intent);
	}
	/**
	 * 分享APK包
	 * @author EX-LIJINHUA001
	 * @date 2013-4-12
	 * @param appName
	 * @param apkPath
	 */
	private void sendShareApk(String appName, String apkPath) {
		String[] apks = apkPath.split("/");
		String title = "分享《"+appName+"》安装包："+apks[apks.length-1];
		// 启动分享发送的属性
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("application/vnd.android.package-archive");
		List<ResolveInfo> resInfo = getPackageManager().queryIntentActivities(
				intent, 0);
		File f = new File(apkPath);
		if (!resInfo.isEmpty()) {
			List<Intent> targetedShareIntents = new ArrayList<Intent>();
			for (ResolveInfo info : resInfo) {
				Intent targeted = new Intent(Intent.ACTION_SEND);
				targeted.setType("application/vnd.android.package-archive");
				ActivityInfo activityInfo = info.activityInfo;

				AppLog.d(TAG, "可用的分享程序：" + activityInfo.packageName);

				// 分享APK安装包
				
				targeted.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
				targeted.setPackage(activityInfo.packageName);
				targetedShareIntents.add(targeted);
			}

			// 分享框标题
			Intent chooserIntent = Intent.createChooser(
					targetedShareIntents.remove(0), title);
			if (chooserIntent == null) {
				Toast.makeText(this, "没找到分享的应用", Toast.LENGTH_SHORT).show();
				return;
			}

			chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
					targetedShareIntents.toArray(new Parcelable[] {}));
			try {
				startActivity(chooserIntent);
			} catch (android.content.ActivityNotFoundException ex) {
				Toast.makeText(this, "没找到分享的应用", Toast.LENGTH_SHORT).show();
			}
		}
	}

	/**
	 * 发送分享应用文本
	 * @author EX-LIJINHUA001
	 * @date 2013-4-12
	 * @param appName
	 * @param appPackage
	 */
	private void sendShareText(String appName, String appPackage,int vocde) {
		String title = "分享《"+appName+"》下载链接";
		
		String shareUrl = "下载地址1: http://play.google.com/store/apps/details?id="+appPackage+
						  "  下载地址2: http://apk.hiapk.com/m/details?id="+appPackage+"&vcode="+vocde
							;
		
		// 分享内容 market://details?id=
		String contentDetails = "我发现一款好应用《" + appName+"》,一起来玩吧！ "+shareUrl;
		// 启动分享发送的属性
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		List<ResolveInfo> resInfo = getPackageManager().queryIntentActivities(
				intent, 0);
		if (!resInfo.isEmpty()) {
			List<Intent> targetedShareIntents = new ArrayList<Intent>();
			for (ResolveInfo info : resInfo) {
				Intent targeted = new Intent(Intent.ACTION_SEND);
				targeted.setType("text/plain");
				ActivityInfo activityInfo = info.activityInfo;

				AppLog.d(TAG, "可用的分享程序：" + activityInfo.packageName);

				// 文本分享
				targeted.putExtra(Intent.EXTRA_TEXT, contentDetails);
				targeted.setPackage(activityInfo.packageName);
				targetedShareIntents.add(targeted);
			}

			// 分享框标题
			Intent chooserIntent = Intent.createChooser(
					targetedShareIntents.remove(0), title);
			if (chooserIntent == null) {
				Toast.makeText(this, "没找到分享的应用", Toast.LENGTH_SHORT).show();
				return;
			}

			chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
					targetedShareIntents.toArray(new Parcelable[] {}));
			try {
				startActivity(chooserIntent);
			} catch (android.content.ActivityNotFoundException ex) {
				Toast.makeText(this, "没找到分享的应用", Toast.LENGTH_SHORT).show();
			}
		}
	}
	
	@Override
	public void onHttpActionResponse(int state, Object data, String urlId,
			int connectionId, Object obj) {
		JSONObject json = null;
		try {
			String str = new String((byte[])data);
			json = new JSONObject(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
		AppLog.d(TAG, "state="+state+" onHttpActionResponse="+json);
		Message msg = new Message();
		msg.what = state;
		msg.arg2 = connectionId;
		msg.obj = json;

		mUIHandler.sendMessage(msg);
	}

	private Handler mUIHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			if(msg.what == HttpActionListener.STATE_SUCCESS){
				JSONObject json = (JSONObject) msg.obj;
				
				String flagStr = (String)com.gopawpaw.droidcore.utils.Tools.getValuseFromJSONObject(json, JsonKey.DATA,JsonKey.FLAG);
				String msgtip = (String)com.gopawpaw.droidcore.utils.Tools.getValuseFromJSONObject(json, JsonKey.DATA,JsonKey.MSG);
				String apkurl = (String)com.gopawpaw.droidcore.utils.Tools.getValuseFromJSONObject(json, JsonKey.DATA,JsonKey.URL);
				
				int flag = 0;
				try {
					flag = Integer.parseInt(flagStr);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				showUpdateMessage(flag,msgtip,apkurl);
			}
//				showUpdateMessage(0,"无升级提示","http://www.demo.com/apk.apk");
//				showUpdateMessage(1,"建议升级提示","http://www.demo.com/apk.apk");
//				showUpdateMessage(2,"强制升级提示","http://www.demo.com/apk.apk");
//				showUpdateMessage(3,"公告提示","http://www.demo.com/apk.apk");
		}
	};
	
	/**
	 * 显示更新信息
	 * @author EX-LIJINHUA001
	 * @date 2013-4-12
	 * @param flag
	 * @param msg
	 * @param apkUrl
	 */
	private void showUpdateMessage(int flag,String msg,String apkUrl){
		mApkUrl = apkUrl;
		switch (flag) {
		case 0:
			/**无需升级**/
			break;
		case 1:
			/**建议升级**/
			showMessageDialog(0, msg, getString(R.string.sure), getString(R.string.cancel));
			break;
		case 2:
			/**强制升级**/
			showMessageDialog(1, msg, getString(R.string.sure), getString(R.string.cancel));
			break;
		case 3:
			/**公告**/
			showMessageDialog(2, msg, getString(R.string.sure));
			break;
		default:
			break;
		}
	}
	
	@Override
	protected void onMessageDialogBtn1Click(int id) {
		//确定
		if(id == 0 || id == 1){
			Uri uri = Uri.parse(mApkUrl);
			Intent intent = new Intent(Intent.ACTION_VIEW,uri);
			startActivity(intent);
			if(id == 1){
				CommonUtils.finishProgram();
			}
		}
	}
	
	@Override
	protected void onMessageDialogBtn2Click(int id) {
		if(id == 1){
			//强制升级，取消
			CommonUtils.finishProgram();
		}
	}
	
	@Override
	protected void onMessageDialogCancel(int id) {
		if(id == 1){
			//强制升级，取消
			CommonUtils.finishProgram();
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//对于菜单id的要求，必须是一个常量。故在定义菜单id时需要用到final关键字
		
		menu.add(0,MENU_1, 1,"关于App分享");
//		menu.add(0,MENU_2,0,"菜单到SubActivity");
		//可用setIcon方法来设置菜单图标
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Intent mIntent=new Intent();
		switch (item.getItemId()) {
		case MENU_1:
			mIntent.setClass(this,AboutActivity.class);
			startActivity(mIntent);
			break;
		case MENU_2:
		default:
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}

	public void onSelectShareItem(int type, PackageInfo pinfo) {
		// TODO Auto-generated method stub
		
		Map<String,Object> map = getAppInfo(pinfo);
		String label = map.get("应用名")+"："+pinfo.packageName;
		
		if(type == OnSelectShareItem.TYPE_APK){
			//选择分享APK
			String apkPath = pinfo.applicationInfo.sourceDir;
			String appName = pinfo.applicationInfo.loadLabel(getPackageManager())
			.toString();
			sendShareApk(appName, apkPath);
			TCAgent.onEvent(this, "应用分享-分享apk",label,map);
		}else if(type == OnSelectShareItem.TYPE_LINK){
			//选择分享下载链接
			String appPackage = pinfo.packageName;
			String appName = pinfo.applicationInfo.loadLabel(getPackageManager())
			.toString();
			sendShareText(appName, appPackage,pinfo.versionCode);
			TCAgent.onEvent(this, "应用分享-分享连接",label,map);
		}else if(type == OnSelectShareItem.TYPE_OPEN){
			//选择打开
			TCAgent.onEvent(this, "应用管理-打开",label,map);
			loadApp(pinfo.packageName);
		}else if(type == OnSelectShareItem.TYPE_MANAGE){
			//选择管理
			TCAgent.onEvent(this, "应用管理-管理",label,map);
			startApplicationDetailsActivity(pinfo.packageName);
		}else if(type == OnSelectShareItem.TYPE_UNINSTALL){
			//选择卸载
			TCAgent.onEvent(this, "应用管理-卸载",label,map);
			appUninstall(pinfo.packageName);
		}
	}
	
		
		
	
	/**
	 * 获取应用程序信息，以便统计
	 * @param pinfo
	 * @return
	 */
	private Map<String,Object> getAppInfo(PackageInfo pinfo){
		
		String appName = pinfo.applicationInfo.loadLabel(getPackageManager())
				.toString();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("应用名", appName);
		map.put("程序包", pinfo.packageName);
		map.put("VersionName", pinfo.versionName);
		map.put("VersionCode", pinfo.versionCode);
		
		return map;
	}

}
