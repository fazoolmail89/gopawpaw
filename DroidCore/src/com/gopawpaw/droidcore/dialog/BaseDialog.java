package com.gopawpaw.droidcore.dialog;

import com.gopawpaw.droid.R;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;


/**
 * 公共的dialog样式
 * @author EX-XIAOFANQING001
 * @date 2012-1-6
 * @version [Android PABank C01, @2012-1-6]
 * @description
 */
public abstract class BaseDialog extends Dialog implements android.view.View.OnClickListener
{
    protected TextView tvTitle;
    
    protected FrameLayout mContent;
    
    protected Button btn1;
    
    protected Button btn2;
    
    protected Button btn3;
    
    private View.OnClickListener mBtn1ClickListener;
    private View.OnClickListener mBtn2ClickListener;
    private View.OnClickListener mBtn3ClickListener;
    
    private boolean isAutoDismiss1 = true;
    
    private boolean isAutoDismiss2 = true;
    
    private boolean isAutoDismiss3 = true; 
    
    public BaseDialog(Context context) {
        super(context);
        init();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(createContentView());
    }

    private void init() {
        
        this.getContext().setTheme(android.R.style.Theme_InputMethod);
        super.setContentView(R.layout.app_widget_common_dialog);
        
        tvTitle = (TextView) findViewById(R.id.tv_title);
        mContent = (FrameLayout) findViewById(R.id.fl_content);
        
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
     
        
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        
        Window window  = getWindow();
        WindowManager.LayoutParams attributesParams = window.getAttributes();
        attributesParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        attributesParams.dimAmount = 0.4f;
        
        window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT); 
    }
    
    /**
     * 设置dialog的标题
     * @param title
     */
    public void setTitle(String title) {
        tvTitle.setText(title);
    }
    
    /**
     * 设置dialog的标题
     * @param resId
     * @see android.app.Dialog#setTitle(int)
     */
    public void setTitle(int resId) {
        setTitle(getContext().getResources().getString(resId));
    }

    /**
     * 构建dialog的内容视图
     * @return
     */
    public abstract View createContentView();
    
    public void setContentView(View view) {
        LayoutParams lp = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        view.setLayoutParams(lp);
        mContent.addView(view);
    }
    
    /**
     * 设置按钮1的文字
     * @param text
     */
    public void setBtn1Text(String text) {
        btn1.setText(text);
    }

    /**
     * 设置按钮2的文字
     * @param text
     */
    public void setBtn2Text(String text) {
        btn2.setText(text);
    }
    
    /**
     * 设置按钮3的文字
     * @param text
     */
    public void setBtn3Text(String text) {
        btn3.setText(text);
    }


    /**
     * 设置按钮1的文字
     * @param resId
     */
    public void setBtn1Text(int resId) {
        btn1.setText(resId);
    }

    /**
     * 设置按钮2的文字
     * @param resId
     */
    public void setBtn2Text(int resId) {
        btn2.setText(resId);
    }
    
    /**
     * 设置按钮3的文字
     * @param resId
     */
    public void setBtn3Text(int resId) {
        btn3.setText(resId);
    }

    /**
     * 设置点击按钮1后时候是否关闭dialog
     * 默认为true
     * @param autoDismiss
     */
    public void setAutoDismiss1(boolean autoDismiss) {
        isAutoDismiss1 = autoDismiss;
    }
    
    /**
     * 设置点击按钮2后时候是否关闭dialog
     * 默认为true
     * @param autoDismiss
     */
    public void setAutoDismiss2(boolean autoDismiss) {
        isAutoDismiss2 = autoDismiss;
    }
    
    /**
     * 设置点击按钮3后时候是否关闭dialog
     * 默认为true
     * @param autoDismiss
     */
    public void setAutoDismiss3(boolean autoDismiss) {
        isAutoDismiss3 = autoDismiss;
    }
    
    /**
     * 设置按钮1是否可见
     * @param visible
     */
    public void setBtn1Visible(boolean visible) {
        if (visible) {
            btn1.setVisibility(View.VISIBLE);
        } else {
            btn1.setVisibility(View.GONE);
        }
    }

    /**
     * 设置按钮2是否可见
     * @param visible
     */
    public void setBtn2Visible(boolean visible) {
        if (visible) {
            btn2.setVisibility(View.VISIBLE);
        } else {
            btn2.setVisibility(View.GONE);
        }
    }
    
    /**
     * 设置按钮3是否可见
     * @param visible
     */
    public void setBtn3Visible(boolean visible) {
        if (visible) {
            btn3.setVisibility(View.VISIBLE);
        } else {
            btn3.setVisibility(View.GONE);
        }
    }
    
   /**
    * 
    *设置按钮1是否处于可点击状态
    * @param enable
    */
    public void setBtn1Enable(boolean enabled){
    	btn1.setEnabled(enabled);
    }
    
    /**
     * 
     *设置按钮2是否处于可点击状态
     * @param enable
     */
     public void setBtn2Enable(boolean enabled){
     	btn2.setEnabled(enabled);
     }
     
     /**
      * 
      *设置按钮2是否处于可点击状态
      * @param enable
      */
      public void setBtn3Enable(boolean enabled){
         btn3.setEnabled(enabled);
      }
    
    /**
     * @param listener
     */
    public void setBtn1ClickListener(View.OnClickListener listener) {
        mBtn1ClickListener = listener;
    }

    /**
     * @param listener
     */
    public void setBtn2ClickListener(View.OnClickListener listener) {
        mBtn2ClickListener = listener;
    }
    
    /**
     * @param listener
     */
    public void setBtn3ClickListener(View.OnClickListener listener) {
        mBtn3ClickListener = listener;
    }

    @Override
    public void onClick(View v)
    {
    	int id = v.getId();
        if(id == R.id.btn1){
            if (mBtn1ClickListener != null) {
                mBtn1ClickListener.onClick(v);
            }
            if (isAutoDismiss1) {
                dismiss();
            }
        } else if(id == R.id.btn2){
            if (mBtn2ClickListener != null ) {
                mBtn2ClickListener.onClick(v);
            }
            if (isAutoDismiss2) {
                dismiss();
            }
        } else if(id == R.id.btn3){
            if (mBtn3ClickListener != null ) {
                mBtn3ClickListener.onClick(v);
            }
            if (isAutoDismiss3) {
                dismiss();
            }
        }
    }

}

