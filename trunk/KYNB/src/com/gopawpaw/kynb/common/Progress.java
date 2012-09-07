package com.gopawpaw.kynb.common;

public class Progress extends Thread {
	private ProgressBarPanel pnlProgressBar;
	private IProgressListener listener;
	
	public Progress(ProgressBarPanel pnlProgressBar) {
		this.pnlProgressBar = pnlProgressBar;
		listener = createListener();
	}
	
	public void run() {
		pnlProgressBar.setVisible(true);
		execut();
		pnlProgressBar.getProgressBar().setString("��ɣ�");
		endWait(1000);//��ɺ�ȴ��Զ��ر�
		pnlProgressBar.getProgressBar().setString("");
		pnlProgressBar.getProgressBar().setValue(0);
		pnlProgressBar.setVisible(false);
	}
	
	private IProgressListener createListener() {
		IProgressListener plistener = new IProgressListener() {
			@Override
			public void onBefore(int size) {
				pnlProgressBar.getProgressBar().setMaximum(size);
			}

			@Override
			public void onExecute(int n) {
				pnlProgressBar.getProgressBar().setString("");
				pnlProgressBar.getProgressBar().setValue(n);
				pnlProgressBar.getProgressBar().setString("���ȣ�" + n + "/" 
				+ String.valueOf(pnlProgressBar.getProgressBar().getMaximum() - 1));
			}
		};
		return plistener;
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
	
	public ProgressBarPanel getPnlProgressBar() {
		return pnlProgressBar;
	}

	public void endWait(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public IProgressListener getListener() {
		return listener;
	}

	public void setListener(IProgressListener listener) {
		this.listener = listener;
	}
}
