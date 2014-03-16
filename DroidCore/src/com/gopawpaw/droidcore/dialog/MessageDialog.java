package com.gopawpaw.droidcore.dialog;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.gopawpaw.droid.R;

/**
 * 消息提示框
 * @author EX-XIAOFANQING001
 * @date 2012-1-6
 * @version [Android PABank C01, @2012-1-6]
 * @description
 */
public class MessageDialog extends BaseDialog
{

    private TextView tvMessage;
    
    private View contentView;
    
    public MessageDialog(Context context)
    {
        super(context);
        contentView =  LayoutInflater.from(getContext()).inflate(R.layout.app_widget_message_dialog, null);
        tvMessage = (TextView) contentView.findViewById(R.id.tv_message);
    }

    @Override
    public View createContentView()
    {
        return contentView;
    }
    
    public void setMessage(String text) {
    	tvMessage.setText(text);
    }
    
    public void setMessage(String text, boolean isHtml) {
    	if(isHtml){
    		tvMessage.setText(Html.fromHtml(text));
    	}else{
    		tvMessage.setText(text);
    	}
    }
    
    public void setTextViewGravity(int gravity) {
        tvMessage.setGravity(gravity);
    }

}

