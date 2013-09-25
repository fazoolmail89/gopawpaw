package im.device.smartdining.activity;

import im.device.smartdining.R;
import im.device.smartdining.view.SmartDesktopView;
import im.device.smartdining.widget.animation.DragController;
import im.device.smartdining.widget.animation.DragLayer;
import im.device.smartdining.widget.animation.DragLayer.OnDockEndListener;
import im.device.smartdining.widget.animation.DragLayer.OnDragEndListener;
import im.device.smartdining.widget.animation.DragLayer.OnMoveListener;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class SmartDiningActivity extends SplitScreenActivity implements OnDockEndListener, OnDragEndListener, OnLongClickListener,
OnMoveListener,OnClickListener{
	private SmartDesktopView topView,bottomView;
	
	/**
	 * 拖动层
	 */
	private DragLayer mDragLayer;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }
    
    private void initView(){
    	
    	mDragLayer = (DragLayer) findViewById(R.id.draglayer);
		mDragLayer.setOnDockEndListener(this);
		mDragLayer.setOnDragEndListener(this);
		mDragLayer.setOnMoveListener(this);
		
    	topView = new SmartDesktopView(this,this,this,SmartDesktopView.DESKTOP_OPPOSITE);
    	bottomView = new SmartDesktopView(this,this,this,SmartDesktopView.DESKTOP_FRONT);
    	
    	setContentViewTop(topView);
    	setContentViewBottom(bottomView);
    }
    
	@Override
	public void onMove(View v, float x, float y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onLongClick(View v) {

		Object obj = v.getTag();
		if(obj != null){
			Integer type = (Integer) obj;
			if(SmartDesktopView.DESKTOP_OPPOSITE == type){
				Rect rl = new Rect();
				mLLTopView.getGlobalVisibleRect(rl);
				mDragLayer.startDrag(v, null, null, DragController.DRAG_ACTION_COPY,
						1.0f,true,new Point(rl.centerX(),rl.centerY()));
			}else{
				mDragLayer.startDrag(v, null, null, DragController.DRAG_ACTION_COPY,
						1.0f,false,null);
			}
		}
		return false;
	}

	@Override
	public boolean onDragEnd(View dragView, float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onDockEnd(int inWhich) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_change_screem:
			if(topView.getVisibility() == View.VISIBLE){
				topView.setVisibility(View.GONE);
			}else if(topView.getVisibility() == View.GONE){
				topView.setVisibility(View.VISIBLE);
			}
			break;

		default:
			break;
		}
		
	}
}