package com.gopawpaw.kynb.module.datascan2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.PoiOperatXls;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class DataScanFrame2 extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private ExcelDataTablePane2 excelDataTablePane;
	private OptBtnsPanel2 optBtnsPanel;
	private ProgressBarPanel pnlProgressBar;

	private static Map<String, Integer> scanMap = null;

	// �ļ�ѡ��ؼ�
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * ��̬����� 1��Ϊɨ�����б���ʼֵ 2��Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {
		//���ó�ʼĬ��ɨ����
		scanMap = new HashMap<String, Integer>();
		scanMap.put(OtherData.ACOL, 0);
		
		// �����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}

	public DataScanFrame2() {
		excelDataTablePane = new ExcelDataTablePane2();
		pnlProgressBar = new ProgressBarPanel();
		optBtnsPanel = new OptBtnsPanel2(this);
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		setLayout(new BorderLayout());
		add(excelDataTablePane, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		setSize(900, 600);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				DataScanFrame2 thisClass = new DataScanFrame2();
				thisClass.showWithFrame();
			}
		});
	}
	
	public ProgressBarPanel getPnlProgressBar() {
		return pnlProgressBar;
	}
	
	public ExcelDataTablePane2 getExcelDataTablePane() {
		return excelDataTablePane;
	}

	public void setExcelDataTablePane(ExcelDataTablePane2 excelDataTablePane) {
		this.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel2 getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel2 optBtnsPanel) {
		this.optBtnsPanel = optBtnsPanel;
	}

	public JFileChooser getFilechooser() {
		return fileChooser;
	}

	public Map<String, Integer> getScanMap() {
		return scanMap;
	}

	/**
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executImportExcel(File file) {
		if (file == null)
			return;
		ImportExcelProgree iep = new ImportExcelProgree(pnlProgressBar, file);
		iep.start();
	}

	/**
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executlScanning() {
		ScanningProgress sp = new ScanningProgress(pnlProgressBar);
		sp.start();
	}

	/**
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executExportExcel(File file) {
		if (file == null)
			return;
		ExportExcelProgress eep = new ExportExcelProgress(pnlProgressBar, file);
		eep.start();
	}

	/**
	 * ����Excel�߳��࣬��ʾ������
	 * 
	 * @author lxq
	 * 
	 */
	class ImportExcelProgree extends Progress {
		private File file = null;

		public ImportExcelProgree(ProgressBarPanel pbp, File file) {
			super(pbp);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file,
					super.getListener());
			getExcelDataTablePane().refreshTableByOriginalData(excelData);
		}
	}

	/**
	 * ɨ�������߳��࣬��ʾ������
	 * 
	 * @author lxq
	 * 
	 */
	class ScanningProgress extends com.gopawpaw.kynb.common.Progress {
		public ScanningProgress(ProgressBarPanel pbp) {
			super(pbp);
		}

		public void execut() {			
			DataScanning2 ds = new DataScanning2();
			// ��ñ��ԭʼ���ݣ���ɨ������
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), 
					super.getListener());
			// ˢ�±��
			getExcelDataTablePane().refreshTable(sranResult);
		}
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
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

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
}
