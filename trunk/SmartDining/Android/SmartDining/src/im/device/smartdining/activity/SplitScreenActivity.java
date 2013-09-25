/**
 * @author EX-LIJINHUA001
 * @date 2013-6-24
 */
package im.device.smartdining.activity;

import im.device.smartdining.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * 用于分屏的Activity
 * @author EX-LIJINHUA001
 * @date 2013-6-24
 */
public class SplitScreenActivity extends Activity {
	
	protected LinearLayout mLLTopView,mLLBottomView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splitscreen);
		mLLTopView = (LinearLayout) findViewById(R.id.screen_top);
		mLLBottomView = (LinearLayout) findViewById(R.id.screen_bottom);
	}
	
	/**
	 * 设置顶部桌面
	 * @author EX-LIJINHUA001
	 * @date 2013-6-24
	 * @param topView
	 */
	protected void setContentViewTop(View topView) {
		mLLTopView.removeAllViews();
		mLLTopView.addView(topView);
	}
	
	/**
	 * 设置底部桌面
	 * @author EX-LIJINHUA001
	 * @date 2013-6-24
	 * @param bottomView
	 */
	protected void setContentViewBottom(View bottomView) {
		mLLBottomView.removeAllViews();
		mLLBottomView.addView(bottomView);
	}
}
