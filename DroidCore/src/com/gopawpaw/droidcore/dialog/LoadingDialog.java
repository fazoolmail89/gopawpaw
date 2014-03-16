package com.gopawpaw.droidcore.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

import com.gopawpaw.droid.R;
import com.gopawpaw.droidcore.log.AppLog;

/**
 * 页面加载动画
 * @author EX-LIJINHUA001
 * @date 2013-1-24
 */
public class LoadingDialog extends Dialog {
    private final String TAG = "LoadingDialog";
    private AnimationDrawable loadingAnimation;
    private boolean canNotCancel ;
    private String tipMsg ;
    private ImageView ivLoading;
    private OnLoadingCancleListener onLoadingCancleListener;
    private Context ctx;
    
    /**
	 * 屏幕宽度
	 */
	private int mWindowWidth = 0;
    public  LoadingDialog(final Context ctx, boolean canNotCancel, String tipMsg) {
        super(ctx);
        this.ctx = ctx;
        this.canNotCancel = canNotCancel;
        this.tipMsg = tipMsg;
        AppLog.d(TAG, "tipMsg="+tipMsg);
        this.getContext().setTheme(android.R.style.Theme_InputMethod);
        setContentView(R.layout.layout_loading_dialog);
        ivLoading = (ImageView) findViewById(R.id.iv_loading);
    
        // 加载动画弹出后背景变灰
        Window window  = getWindow();
        WindowManager.LayoutParams attributesParams = window.getAttributes();
        attributesParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        attributesParams.dimAmount = 0.5f;
        
        window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT); 
        
        WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
		mWindowWidth = wm.getDefaultDisplay().getWidth();//屏幕宽度
    }
    
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
        	try {
        		ivLoading.setBackgroundResource(R.anim.loading_dialog);
        		loadingAnimation = (AnimationDrawable) ivLoading.getBackground();
        		loadingAnimation.start();
        		
        		TranslateAnimation translate = new TranslateAnimation(-180, mWindowWidth, 0, 0);
        		translate.setRepeatCount(TranslateAnimation.INFINITE);
        		translate.setDuration(5500);
        		translate.setFillAfter(true);
        		
        		ivLoading.startAnimation(translate);
			} catch (Exception e) {
				// TODO: handle exception
				AppLog.e(TAG, "========================系统异常！");
				e.printStackTrace();
			}
        }
    }
    
    public void setCanNotCancel(boolean canNotCancel){
    	this.canNotCancel = canNotCancel;
    }

    @Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		AppLog.e(TAG, "onBackPressed");
		if(onLoadingCancleListener!=null){
			onLoadingCancleListener.onLoadingCancle();
		}
	}

	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (canNotCancel) {
                Toast.makeText(getContext(), tipMsg, Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
	
	/**
	 * 
	 * 选择完成回调接口
	 * 
	 * @author EX-LIJINHUA001
	 * @version [Android PABank C01, 2012-1-16]
	 */
	public interface OnLoadingCancleListener {
		public void onLoadingCancle();
	}
	
	/**
	 * 设置选择Item后监听器
	 * [一句话功能简述]<BR>
	 * [功能详细描述]
	 * @param onItemSelectListener
	 */
	public void setOnLoadingCancleListener(
			OnLoadingCancleListener onLoadingCancleListener) {
		this.onLoadingCancleListener = onLoadingCancleListener;
	}

	public void setTipMsg(String tipMsg) {
		this.tipMsg = tipMsg;
	}

	public Context getCtx() {
		return ctx;
	}
	
}
