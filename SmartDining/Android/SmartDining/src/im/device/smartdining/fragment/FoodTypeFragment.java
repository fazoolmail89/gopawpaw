/**
 * 
 */
package im.device.smartdining.fragment;

import im.device.smartdining.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author jinhua
 *
 */
public class FoodTypeFragment extends BaseFragment {

	private static int count = 0;
	
	private int current = count++;
	
	/**
	 * 
	 */
	public FoodTypeFragment() {
		// TODO Auto-generated constructor stub
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_food_type,
				container, false);
		
		EditText et = (EditText) root.findViewById(R.id.edit);
		et.setText(""+current);
		Button btn = (Button) root.findViewById(R.id.btn1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				actionBtn();
			}
		});
		
		root.findViewById(R.id.btn2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				startFragment(FoodTypeFragment.class,null);
				startFragmentForResult(FoodTypeFragment.class,current);
			}
		});
		
		return root;
	}
	
	private void actionBtn(){
		finish();
	}

}
