package im.device.smartdining.activity;

import im.device.smartdining.view.SmartDesktop2View;
import android.os.Bundle;

public class SmartDinnerActivity extends SplitScreenActivity {
	
	private SmartDesktop2View topView,bottomView;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }
    
    private void initView(){
		
    	topView = new SmartDesktop2View(this,SmartDesktop2View.DESKTOP_OPPOSITE);
    	bottomView = new SmartDesktop2View(this,SmartDesktop2View.DESKTOP_FRONT);
    	setContentViewTop(topView);
    	setContentViewBottom(bottomView);
    }
    
//    @Override
//    public void onBackPressed() {
//    	// TODO Auto-generated method stub
//    	
//    }
}
