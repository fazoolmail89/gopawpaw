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
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class DataScanFrame2 extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private static DataScanFrame2 thisClass;
	private static ExcelDataTablePane2 excelDataTablePane = null;
	private static OptBtnsPanel2 optBtnsPanel = null;
	// private static List<ScanItem> siList = new ArrayList<ScanItem>();
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
		optBtnsPanel = new OptBtnsPanel2(this);
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		setLayout(new BorderLayout());
		add(excelDataTablePane, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
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

	public static DataScanFrame2 getThisClass() {
		return thisClass;
	}

	public static void setThisClass(DataScanFrame2 thisClass) {
		DataScanFrame2.thisClass = thisClass;
	}

	public ExcelDataTablePane2 getExcelDataTablePane() {
		return excelDataTablePane;
	}

	public void setExcelDataTablePane(ExcelDataTablePane2 excelDataTablePane) {
		DataScanFrame2.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel2 getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel2 optBtnsPanel) {
		DataScanFrame2.optBtnsPanel = optBtnsPanel;
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
		ImportExcelProgree iep = new ImportExcelProgree(this, file);
		iep.getProgressBar().setString("���ڼ������ݣ������ĵȴ���������");
		iep.getProgressBar().setIndeterminate(true);
		iep.start();
	}

	/**
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executlScanning() {
		
		ScanningProgress sp = new ScanningProgress(this);
		//sp.getProgressBar().setString("����ɨ�����ݣ������ĵȴ���������");
		sp.getProgressBar().setIndeterminate(false);
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
		ExportExcelProgress eep = new ExportExcelProgress(this, file);
		eep.getProgressBar().setString("���ڵ������ݣ������ĵȴ���������");
		eep.getProgressBar().setIndeterminate(true);
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

		public ImportExcelProgree(DataScanFrame2 mainFrame, File file) {
			super(mainFrame);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file);
			getExcelDataTablePane().refreshTableByOriginalData(excelData);
		}
	}

	/**
	 * ɨ�������߳��࣬��ʾ������
	 * 
	 * @author lxq
	 * 
	 */
	class ScanningProgress extends Progress {
		public ScanningProgress(DataScanFrame2 mainFrame) {
			super(mainFrame);
		}

		public void execut() {
			ScanningListener sl = new ScanningListener() {
				@Override
				public void onScanningPre(int size) {
					getProgressBar().setMaximum(size);
				}

				@Override
				public void onScanningProgress(int n) {
					getProgressBar().setString("");
					getProgressBar().setValue(n);
					getProgressBar().setString("���ȣ�"+ n + "/"+getProgressBar().getMaximum());
				}
			};
			
			DataScanning2 ds = new DataScanning2();
			// ��ñ��ԭʼ���ݣ���ɨ������
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), sl);
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

		public ExportExcelProgress(DataScanFrame2 mainFrame, File file) {
			super(mainFrame);
			this.file = file;
		}

		public void execut() {
			// ��ȡ�ļ�����ı������
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

			// �����ļ�
			boolean rv = PoiOperatXls.writeXls(excelData, file.getPath());

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
