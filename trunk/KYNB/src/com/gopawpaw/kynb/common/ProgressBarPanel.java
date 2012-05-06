package com.gopawpaw.kynb.common;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarPanel extends JPanel {
	private static final long serialVersionUID = 4891675301791669832L;
	
	private JProgressBar progressBar;
	public ProgressBarPanel() {
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // 显示提示信息
		progressBar.setIndeterminate(false); // 不确定进度的进度条
		add(progressBar);
		setVisible(false);
	}
	public JProgressBar getProgressBar() {
		return progressBar;
	}
}
