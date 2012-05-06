package com.gopawpaw.kynb.common;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarPanel extends JPanel {
	private static final long serialVersionUID = 4891675301791669832L;
	
	private JProgressBar progressBar;
	public ProgressBarPanel() {
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ��ȷ�����ȵĽ�����
		add(progressBar);
		setVisible(false);
	}
	public JProgressBar getProgressBar() {
		return progressBar;
	}
}
