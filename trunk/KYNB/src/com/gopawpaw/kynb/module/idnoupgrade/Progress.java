package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.Frame;

import javax.swing.JProgressBar;

/**
 * @���� �����������߳��࣬�̳к���дexecut()����
 * @���� ¬����
 * 
 */
public class Progress extends Thread {
	/**
	 * ֻ���н������ĶԻ���
	 */
	private ProgressBarDialog pbd = null;

	/**
	 * �Ի����еĽ���������
	 */
	private JProgressBar progressBar = null;

	/**
	 * ִ�в�����ɺ����ʾ��Ϣ
	 */
	private String endMessage = "��ɣ�";

	/**
	 * ���췽��
	 * 
	 * @param pbd
	 *            ProgressBarDialog����
	 */
	public Progress(Frame frame) {
		initialize(frame);
	}

	public Progress() {
		initialize(null);
	}

	private void initialize(Frame frame) {
		if (frame != null)
			pbd = new ProgressBarDialog(frame);
		else
			pbd = new ProgressBarDialog();
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

		execut();// ִ����ز���

		// ��ɺ�ı������״̬
		progressBar.setValue(100);
		progressBar.setIndeterminate(false);
		progressBar.setString(endMessage);

		endWait(1000);// ��ɺ�ȴ��Զ��ر�

		// �Զ��رպ��������
		pbd.setVisible(false);
		if (pbd.getOwner() != null) {
			pbd.getOwner().setEnabled(true);
			pbd.getOwner().setVisible(true);
		}
		pbd.dispose();
	}

	/**
	 * ����ִ�з���������д
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
