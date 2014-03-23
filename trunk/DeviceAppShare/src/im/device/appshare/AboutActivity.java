/**
 * @author EX-LIJINHUA001
 * @date 2013-2-22
 */
package im.device.appshare;

import java.util.HashMap;

import org.json.JSONObject;

import im.device.appshare.utils.Tools;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.gopawpaw.droidcore.activity.BaseActivity;
import com.gopawpaw.droidcore.http.action.HttpAction;
import com.gopawpaw.droidcore.http.action.HttpActionListener;
import com.gopawpaw.droidcore.utils.CommonUtils;
import com.tendcloud.tenddata.TCAgent;

/**
 * 关于我们
 * @author EX-LIJINHUA001
 * @date 2013-2-22
 */
public class AboutActivity extends BaseActivity implements OnClickListener,HttpActionListener{

	private HttpAction mAction;
	private String mApkUrl = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		TextView tv = (TextView) findViewById(R.id.tv_contact);
		findViewById(R.id.btn_check_version).setOnClickListener(this);
		tv.setText(String.format(getString(R.string.about_content3),CommonUtils.getVersionName(this)));
		
		String imei = CommonUtils.getIMEI(this);
		TCAgent.onEvent(this, "Open-About",imei,Tools.getDeviceInfo(this));
		
		
	}

	public void onResume() {
		super.onResume();
		TCAgent.onResume(this);
	}

	public void onPause() {
		super.onPause();

		TCAgent.onPause(this);
	}

	@Override
	public void onClick(View v) {
		String imei = CommonUtils.getIMEI(this);
		
		TCAgent.onEvent(this, "About-CheckVersion",imei,Tools.getDeviceInfo(this));
		
		mAction = new HttpAction(this, this);
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("app", "im.device.appshare");
		params.put("client", "1");
		params.put("version", CommonUtils.getVersionName(this));
		params.put("imei", imei);
		
		mAction.sendRequest(getString(R.string.url_app_update),params);
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
			}else{
				Toast.makeText(AboutActivity.this, "检查新版本失败，谢谢支持！", Toast.LENGTH_SHORT).show();
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
			Toast.makeText(this, "您当前已经是最新版本，谢谢支持！", Toast.LENGTH_SHORT).show();
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
			Toast.makeText(this, "您当前已经是最新版本，谢谢支持！", Toast.LENGTH_SHORT).show();
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
}
