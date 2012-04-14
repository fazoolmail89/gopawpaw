package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JProgressBar;


public class ProgressBarDialog extends JDialog {
	private static final long serialVersionUID = 890455239265457053L;
	private static final int DEFAULT_HEIGHT = 42;
	private static final int DEFAULT_WIDTH = 300;
	private Frame owner = null;

	private JProgressBar progressBar;

	public ProgressBarDialog(Frame owner) {
		this.owner = owner;
		initialize();
	}
	
	public void initialize() {
		owner.setEnabled(false);
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // 显示提示信息
		progressBar.setIndeterminate(true); // 不确定进度的进度条
		//progressBar.setString(runString); // 确定信息时加上此条，则提示升级中，没有%比，如是不加上这个，则会提示%
		add(progressBar);
		// 取消标题栏
		setUndecorated(true);
		setBounds(SwingConsole.getTop(DEFAULT_WIDTH), SwingConsole
				.getTop(DEFAULT_HEIGHT), DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation();
		setModal(false);
		setVisible(false);
	}
	
	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public Frame getOwner() {
		return owner;
	}
	
	public void setLocation() {
		int left = (owner.getWidth() - this.getWidth())/2 + owner.getX();
		int top = (owner.getHeight() - this.getHeight())/2 + owner.getY();
		setLocation(left, top);
	}
}
