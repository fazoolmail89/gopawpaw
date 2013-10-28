/**
 * 文件名: BaseFragment.java
 * 版    权：  Copyright  LiJinHua  All Rights Reserved.
 * 描    述: [常量类]
 * 创建人: LiJinHua
 * 创建时间:  2013-10-23
 * 
 * 修改人：LiJinHua
 * 修改时间:2013-10-23  上午9:53:17
 * 修改内容：[修改内容]
 */
package im.device.smartdining.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * 
 * @author LiJinHua
 * @modify 2013-10-23  上午9:54:27
 */
public class BaseFragment extends Fragment {

	protected String TAG = this.getClass().getSimpleName();
	
	/**
	 * 通过startFragmentForResult启动的Fragment
	 * 的返回码
	 */
	private int resultCode;
	
	/**
	 * 通过startFragmentForResult启动的Fragment
	 * 的返回数据
	 */
	private Bundle resultBundle;
	
	/**
	 * 通过startFragmentForResult启动的Fragment，在获取值后需要将数据回调给的原来的Fragment
	 * 返回的上一个Fragment
	 */
	private BaseFragment resultForFragment;
	
	/**
	 * 
	 * @author LiJinHua
	 * @modify 2013-10-23  上午9:54:32
	 */
	public BaseFragment() {
		
	}
	
	protected void finish() {
		// TODO Auto-generated method stub
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.remove(this);
		if(resultForFragment != null){
			ft.remove(resultForFragment);
			ft.add(resultForFragment.getId(), resultForFragment);
		}
		ft.commit();
		AppLog.d(TAG, "getFragmentManager().getBackStackEntryCount()="+getFragmentManager().getBackStackEntryCount());
	}
	
	@Override
	public void onDestroy() {
		AppLog.w(TAG, "onDestroy....");
		int requestCode = -1;
		if(getArguments() != null){
			requestCode = getArguments().getInt(this.getClass().getSimpleName()+"_startFragmentForResult_requestCode");
		}
		if(resultForFragment != null && requestCode != -1){
			//在销毁Fragment前
			resultForFragment.onFragmentResult(requestCode, resultCode, resultBundle);
		}
		super.onDestroy();
	}
	
	protected final void setResult (int resultCode, Bundle bundle){
		this.resultCode = resultCode;
		this.resultBundle = bundle;
	}
	
	protected void startFragment(Class<?> cls,Bundle bundle){
		startFragmentForResult( cls, -1,null);
	}
	
	protected void startFragmentForResult(Class<?> cls){
		startFragmentForResult( cls, 0,null);
	}
	
	protected void startFragmentForResult(Class<?> cls, int requestCode){
		startFragmentForResult( cls, requestCode,null);
	}
	
	protected void startFragmentForResult(Class<?> cls, int requestCode,Bundle bundle){
		try {
			if(bundle == null){
				bundle = new Bundle();
			}
			bundle.putInt(cls.getSimpleName()+"_startFragmentForResult_requestCode", requestCode);
			int layoutId = this.getId();
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			BaseFragment baseFragment = (BaseFragment) cls.newInstance();
			baseFragment.resultForFragment = this;
			baseFragment.setArguments(bundle);
			ft.replace(layoutId, baseFragment);
			ft.commit();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void onFragmentResult(int requestCode, int resultCode, Bundle bundle) {
		AppLog.i(TAG, "onFragmentResult requestCode="+requestCode+" resultCode="+resultCode+" bundle="+bundle);
    }
}
