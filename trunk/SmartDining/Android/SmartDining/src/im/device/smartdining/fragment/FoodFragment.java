/**
 * 
 */
package im.device.smartdining.fragment;

import com.gopawpaw.droidcore.log.AppLog;

import im.device.smartdining.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * 
 * @author jinhua
 * 
 */
public class FoodFragment extends BaseFragment {

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_food_fragment,
				container, false);
		
		Button btn = (Button) root.findViewById(R.id.btn1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AppLog.d(TAG, "==============onClick startFragmentForResult");
				startFragmentForResult(FoodTypeFragment.class,100);
//				startFragment(FoodTypeFragment.class,null);
			}
		});
		
		return root;
	}
	
	@Override
	protected void onFragmentResult(int requestCode, int resultCode,
			Bundle bundle) {
		// TODO Auto-generated method stub
		AppLog.d(TAG, "onFragmentResult requestCode="+requestCode+" resultCode="+resultCode);
	}
}
