package com.gopawpaw.kynb.module.scandatamange;

import java.awt.Frame;

import javax.swing.JProgressBar;

/**
 * @描述 进度条管理线程类，继承后重写execut()方法 
 * @作者 卢向琪
 *
 */
public	class Progress extends Thread {
	/**
	 * 只带有进度条的对话框
	 */
	private ProgressBarDialog pbd = null;
	
	/**
	 * 对话框中的进度条对象
	 */
	private JProgressBar progressBar = null;
	
	/**
	 * 执行操作完成后的提示信息
	 */
	private String endMessage = "完成！";
	
	/**
	 * 构造方法 
	 * @param pbd ProgressBarDialog对象
	 */
	public Progress(Frame frame) {
		initialize(frame);
	}
	
	public void initialize(Frame frame) {
		pbd = new ProgressBarDialog(frame);
		progressBar = pbd.getProgressBar();
	}
	
	public JProgressBar getProgressBar() {
		return progressBar;
	}
	
	public void setendMessage(String message) {
		endMessage = message;
	}
	
	public void run() {
		pbd.setVisible(true);
		
		execut();//执行相关操作
		
		//完成后改变进度条状态
		progressBar.setValue(100);
		progressBar.setIndeterminate(false);	
		progressBar.setString(endMessage);
		
		endWait(1000);//完成后等待自动关闭
		
		//自动关闭后继续处理
		pbd.setVisible(false);
		pbd.getOwner().setEnabled(true);
		pbd.getOwner().setVisible(true);
		pbd.dispose();
	}
	
	/**
	 * 具体执行方法，需重写
	 */
	public void execut() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void endWait() {
		try {
			Thread.sleep(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}	
	
	public void endWait(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
