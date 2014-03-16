/**
 * @author EX-LIJINHUA001
 * @date 2013-2-22
 */
package im.device.appshare;

import im.device.appshare.utils.Tools;
import android.os.Bundle;
import android.widget.TextView;

import com.gopawpaw.droidcore.activity.BaseActivity;
import com.gopawpaw.droidcore.utils.CommonUtils;
import com.tendcloud.tenddata.TCAgent;

/**
 * 关于我们
 * @author EX-LIJINHUA001
 * @date 2013-2-22
 */
public class AboutActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		TextView tv = (TextView) findViewById(R.id.tv_contact);
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
}
