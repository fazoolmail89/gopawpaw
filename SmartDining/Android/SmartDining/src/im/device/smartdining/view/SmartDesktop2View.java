/**
 * 
 */
package im.device.smartdining.view;

import com.gopawpaw.droidcore.log.AppLog;

import im.device.smartdining.R;
import im.device.smartdining.fragment.FoodFragment;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * @author jinhua
 *
 */
public class SmartDesktop2View extends LinearLayout {

	protected static final String TAG = SmartDesktop2View.class.getSimpleName();
	
	/**
	 * 正面
	 */
	public static final int DESKTOP_FRONT = 0;
	
	/**
	 * 反面
	 */
	public static final int DESKTOP_OPPOSITE = 1;
	
	/**
	 * 桌面类型
	 */
	private int desktopType = DESKTOP_FRONT;
	
	private Activity mActivity;
	
	private static int VIEW_ID_INCRE = 10000;
	
	public SmartDesktop2View(Activity activity,int desktopType) {
		super(activity);
		mActivity = activity;
		this.desktopType = desktopType;
		initView();
	}
	
	/**
	 * 根据viewID获取FragmentId
	 * @return
	 */
	private int getFragmentLayoutId(int viewId){
		int retId = -1;
		LinearLayout llcontent = (LinearLayout) findViewById(viewId);
		int count = llcontent.getChildCount();
		for(int i=0 ;i<count ;i++){
			View v = llcontent.getChildAt(i);
			if(v != null){
				retId = v.getId();
			}
		}
		if(retId == -1){
			//还未初始化
			++VIEW_ID_INCRE;
			LinearLayout ll = new LinearLayout(mActivity);
			ll.setLayoutParams(llcontent.getLayoutParams());
			ll.setId(viewId+VIEW_ID_INCRE);
			llcontent.addView(ll);
			retId = ll.getId();
		}
		AppLog.i(TAG, "getFragmentLayoutId retId="+retId);
		return retId;
	}
	
	private void initView(){
		LayoutInflater inflater = LayoutInflater.from(mActivity);
		RelativeLayout view = (RelativeLayout) inflater.inflate(R.layout.view_smartdesktops, null);
		addView(view);
		
//		mActivity.getFragmentManager().findFragmentById(id);
		FragmentTransaction ft = mActivity.getFragmentManager().beginTransaction();
		
		FoodFragment ff = new FoodFragment();
		AppLog.i(TAG, "getFragmentLayoutId ff.getId()="+ff.getId());
//		Bundle bundle = new Bundle();
		ft.add(getFragmentLayoutId(R.id.content), ff);
		ft.addToBackStack(null);
		ft.commit();
	}

}
