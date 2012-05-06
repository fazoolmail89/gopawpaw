package com.gopawpaw.kynb.common;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;


public class ProgressBarDialog extends JDialog {
	private static final long serialVersionUID = 890455239265457053L;
	private static final int DEFAULT_HEIGHT = 42;
	private static final int DEFAULT_WIDTH = 300;
	private JInternalFrame owner = null;

	private JProgressBar progressBar;

	public ProgressBarDialog(JInternalFrame frame) {
		this.owner = frame;
		initialize();
	}

	public void initialize() {
		owner.setEnabled(false);
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(true); // ��ȷ�����ȵĽ�����
		//progressBar.setString(runString); // ȷ����Ϣʱ���ϴ���������ʾ�����У�û��%�ȣ����ǲ���������������ʾ%
		add(progressBar);
		// ȡ��������
		setUndecorated(true);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation();
		setModal(false);
		setVisible(false);
	}
	
	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public void setLocation() {
		int left = (owner.getWidth() - this.getWidth())/2 + owner.getX();
		int top = (owner.getHeight() - this.getHeight())/2 + owner.getY();
		setLocation(left, top);
	}
}
