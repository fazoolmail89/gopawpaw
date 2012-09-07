package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.PoiOperatXls;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class MainFrame extends BaseModuleFrame {
	private static final long serialVersionUID = -7850040792130935086L;
	
	private QueryPanel pnlQuery;
	private BaseDataTable spnBDT;
	private OptBtnsPanel pnlOptBtns;
	private ProgressBarPanel pnlProgressBar;
	
	// �ļ�ѡ��ؼ�
	private static final JFileChooser fileChooser = new JFileChooser();
	
	/**
	 * Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {		
		// �����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}	
	
	public MainFrame() {
		//��ȡ��ӡ�����ļ�
		PrintInit.readInitFile();
		
		setTitle("��ӡ����");
		
		pnlQuery = new QueryPanel(this);
		pnlQuery.setBorder(BorderFactory.createTitledBorder("��ѯ����"));
		
		spnBDT = new BaseDataTable();
		spnBDT.setBorder(BorderFactory.createTitledBorder("�����б�"));
		
		pnlOptBtns = new OptBtnsPanel(this);
		pnlOptBtns.setBorder(BorderFactory.createTitledBorder("������"));

		//�������������
		pnlProgressBar = new ProgressBarPanel();
				
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(spnBDT, BorderLayout.CENTER);
		add(pnlOptBtns, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		
		setSize(1400, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		com.gopawpaw.frame.GlobalParameter.isAuthModuls = true;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				MainFrame thisClass = new MainFrame();
				thisClass.showWithFrame();
			}
		});
	}
	
	public BaseDataTable getSpnBDT() {
		return spnBDT;
	}
	
	public QueryPanel getPnlQuery() {
		return pnlQuery;
	}
	
	public ProgressBarPanel getPnlProgressBar() {
		return pnlProgressBar;
	}
	
	/**
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executExportExcel(File file) {
		if (file == null) return;
		//����ļ����ѱ�ռ�ã���ʾ�û��Ƿ񸲸��ļ�
		if(file.exists()) {
			int rv = JOptionPane.showConfirmDialog(MainFrame.this,
					file.getName() + "�ļ��Ѵ����Ƿ���и��ǣ�",
					"������ʾ��",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.OK_CANCEL_OPTION);	
			if(rv != 0) return;
		}
		
		ExportExcelProgress eep = new ExportExcelProgress(pnlProgressBar, file);
		eep.start();
	}
	
	/**
	 * ����Excel�߳��࣬��ʾ������
	 * 
	 * @author lxq
	 * 
	 */
	class ExportExcelProgress extends Progress {
		private String message = "";
		private File file = null;

		public ExportExcelProgress(ProgressBarPanel pbp, File file) {
			super(pbp);
			this.file = file;
		}

		public void execut() {
			// ��ȡ�ļ�����ı������
			Object[][] excelData = spnBDT.getExportData();

			// �����ļ�
			boolean rv = PoiOperatXls.writeXls(
					excelData, 
					file.getPath(),
					super.getListener());

			Toolkit.getDefaultToolkit().beep();
			if (rv) {
				message = "�ɹ������ļ���" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "�����ļ���ʾ��",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				message = "�޷������ļ���" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "�����ļ���ʾ��",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public JFileChooser getFilechooser() {
		return fileChooser;
	}
}
