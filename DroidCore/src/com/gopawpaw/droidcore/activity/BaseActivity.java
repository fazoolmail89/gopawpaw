/*
 * 文件名: BaseActivity.java
 * 版    权：  Copyright PingAn Technology All Rights Reserved.
 * 描    述: [头部的基类]
 * 创建人: EX-LIUHONGBAO001
 * 创建时间: 2011-12-20
 * 
 * 修改人：
 * 修改时间:
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;

import com.gopawpaw.droid.R;
import com.gopawpaw.droidcore.dialog.LoadingDialog;
import com.gopawpaw.droidcore.dialog.MessageDialog;
import com.gopawpaw.droidcore.dialog.LoadingDialog.OnLoadingCancleListener;
import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.CommonUtils;
import com.gopawpaw.droidcore.utils.Tools;

/**
 * Activity基类 带有基本操作MessageDialog和LoadingDialog的方法
 * 
 * @author EX-LIJINHUA001
 * @date 2013-1-25
 */
public class BaseActivity extends Activity {

	/**
	 * debug Tag
	 */
	protected final String TAG = this.getClass().getSimpleName();

	private final int EXITAPP_DIALOG = 1990;

	/** 加载动画对话框 **/
	private LoadingDialog mLoadingDialog;

	/** 消息提示对话框 **/
	private MessageDialog mMessageDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		CommonUtils.add(this);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		AppLog.d(TAG, "The Activity " + TAG
				+ "is onDestroy dismiss mLoadingDialog and mMessageDialog");
		if (mLoadingDialog != null) {
			mLoadingDialog.dismiss();
			mLoadingDialog = null;
		}
		if (mMessageDialog != null) {
			mMessageDialog.dismiss();
			mMessageDialog = null;
		}
		CommonUtils.remove(this);
		super.onDestroy();
	}

	/**
	 * 退出应用
	 */
	protected void exitApp() {
		showMessageDialog(EXITAPP_DIALOG,
				getResources().getString(R.string.msg_exit), getResources()
						.getString(R.string.sure),
				getResources().getString(R.string.cancel));
	}

	/**
	 * 启动加载动画
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 */
	protected void showLoadingDialog() {
		showLoadingDialog(null, mOnLoadingCancleListener);
	}

	/**
	 * 加载动画,且用户不能取消动画
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param message
	 */
	protected void showLoadingDialog(String message) {
		showLoadingDialog(message, mOnLoadingCancleListener);
	}

	/**
	 * 启动加载动画,且用户不能取消动画
	 * 
	 * @param context
	 * @param message
	 */
	private void showLoadingDialog(String message,
			OnLoadingCancleListener listener) {
		if (isFinishing()) {
			return;
		}

		if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
			return;
		}

		boolean canNotCancel = !Tools.isEmpty(message);

		// 如果一个Activity只存在一个LoadingDialog实例，那动画会有点问题，所以每次都new
		// if (mLoadingDialog == null) {
		// 当前的Activity只new一个实例
		mLoadingDialog = new LoadingDialog(this, canNotCancel, message);
		// }
		mLoadingDialog.setCanNotCancel(canNotCancel);
		mLoadingDialog.setTipMsg(message);
		mLoadingDialog.setOnLoadingCancleListener(listener);
		mLoadingDialog.show();
	}

	/**
	 * 关闭加载动画
	 * 
	 * @param context
	 */
	protected void dismissLoadingDialog() {
		if (mLoadingDialog != null) {
			mLoadingDialog.dismiss();
		}
	}

	/**
	 * 取消加载动画时回调的监听器
	 */
	private OnLoadingCancleListener mOnLoadingCancleListener = new OnLoadingCancleListener() {

		@Override
		public void onLoadingCancle() {
			// TODO Auto-generated method stub
			onLoadingDialogCancle();
		}
	};

	/**
	 * LoadingDialog取消时回调
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 */
	protected void onLoadingDialogCancle() {
		AppLog.d(TAG, "onLoadingDialogCancle()");
	}

	/**
	 * [带一个按钮的提示框]<BR>
	 * 
	 * @param tipMsg
	 *            提示信息
	 */
	protected void showMessageDialog(int id, String tipMsg) {
		showMessageDialog(id, null, tipMsg, null, null, false);
	}

	/**
	 * 带一个按钮的提示框,并支持html格式显示
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param tipMsg
	 *            提示信息
	 * @param isHtml
	 */
	protected void showMessageDialog(int id, String tipMsg, boolean isHtml) {
		showMessageDialog(id, null, tipMsg, null, null, isHtml);
	}

	/**
	 * [带一个按钮的提示框,并支持html格式显示]<BR>
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param tipMsg
	 *            提示信息
	 * @param isHtml
	 * @param gravity
	 */
	protected void showMessageDialog(int id, String tipMsg, boolean isHtml,
			int gravity) {
		showMessageDialog(id, null, tipMsg, null, null, isHtml, gravity);
	}

	/**
	 * [带一个按钮的提示框]<BR>
	 * 
	 * @param tipMsg
	 *            提示信息
	 * @param btnMsg
	 *            按钮名称
	 */
	protected void showMessageDialog(int id, String tipMsg, String btnMsg) {
		showMessageDialog(id, null, tipMsg, btnMsg, null, false);
	}

	/**
	 * 带一个按钮的提示框
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param tipMsg
	 * @param btnMsg
	 * @param gravity
	 */
	protected void showAlertDialog(int id, String tipMsg, String btnMsg,
			int gravity) {
		showMessageDialog(id, null, tipMsg, btnMsg, null, false, gravity);
	}

	/**
	 * [带两个按钮的提示框]<BR>
	 * 
	 * @param tipMsg
	 *            提示信息
	 * @param btnMsg1
	 *            按钮1名称
	 * @param btnMsg2
	 *            按钮2名称
	 */
	protected void showMessageDialog(int id, String tipMsg, String btnMsg1,
			String btnMsg2) {
		showMessageDialog(id, null, tipMsg, btnMsg1, btnMsg2, false);
	}

	/**
	 * 带两个按钮的提示框
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param titleMsg
	 * @param tipMsg
	 * @param btnMsg1
	 * @param btnMsg2
	 */
	protected void showMessageDialog(int id, String titleMsg, String tipMsg,
			String btnMsg1, String btnMsg2) {
		showMessageDialog(id, titleMsg, tipMsg, btnMsg1, btnMsg2, false);
	}

	/**
	 * 带两个按钮的提示框
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 * @param titleMsg
	 * @param tipMsg
	 * @param btnMsg1
	 * @param btnMsg2
	 * @param isHtml
	 */
	protected void showMessageDialog(int id, String titleMsg, String tipMsg,
			String btnMsg1, String btnMsg2, boolean isHtml) {
		showMessageDialog(id, titleMsg, tipMsg, btnMsg1, btnMsg2, isHtml,
				Gravity.CENTER);
	}

	/**
	 * 统一弹出提示对话框 [功能详细描述]
	 * 
	 * @param titleMsg
	 *            标题
	 * @param btnMsg1
	 *            按钮1名称
	 * @param btnMsg2
	 *            按钮2名称
	 * @param tipMsg
	 *            提示消息
	 */
	protected final void showMessageDialog(final int id, String titleMsg,
			String tipMsg, String btnMsg1, String btnMsg2, boolean isHtml,
			int gravity) {

		if (mMessageDialog != null && mMessageDialog.isShowing()) {
			return;
		}

		if (isFinishing()) {
			return;
		}

		if (mMessageDialog == null) {
			mMessageDialog = new MessageDialog(this);
		}

		if (!Tools.isEmpty(titleMsg)) {
			mMessageDialog.setTitle(titleMsg);
		} else {
			mMessageDialog.setTitle(R.string.dialog_title_tip_defalut);
		}

		mMessageDialog.setTextViewGravity(gravity);
		mMessageDialog.setMessage(tipMsg, isHtml);

		if (!Tools.isEmpty(btnMsg1)) {
			mMessageDialog.setBtn1Text(btnMsg1);
		}

		mMessageDialog.setBtn1ClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				onMessageDialogBtn1Click(id);
			}
		});

		if (Tools.isEmpty(btnMsg2)) {
			mMessageDialog.setBtn2Visible(false);
		} else {
			mMessageDialog.setBtn2Visible(true);
			mMessageDialog.setBtn2Text(btnMsg2);
			mMessageDialog.setBtn2ClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					onMessageDialogBtn2Click(id);
				}
			});
		}

		mMessageDialog.setOnCancelListener(new OnCancelListener() {

			@Override
			public void onCancel(DialogInterface dialog) {
				onMessageDialogCancel(id);
			}
		});

		// 显示对话框
		mMessageDialog.show();
	}

	/**
	 * 响应MessageDialogBtn1点击事件
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 */
	protected void onMessageDialogBtn1Click(int id) {
		AppLog.d(TAG, "onMessageDialogBtn1Click(View v)");
		if (id == EXITAPP_DIALOG) {
			CommonUtils.finishProgram();
		}
	}

	/**
	 * 响应MessageDialogBtn1点击事件
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 */
	protected void onMessageDialogBtn2Click(int id) {
		AppLog.d(TAG, "onMessageDialogBtn2Click(View v)");
	}

	/**
	 * 响应MessageDialogBtn1点击事件
	 * 
	 * @author EX-LIJINHUA001
	 * @date 2013-1-25
	 */
	protected void onMessageDialogCancel(int id) {
		AppLog.d(TAG, "onMessageDialogCancel()");
	}

	
}