package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.common.*;

public class DataScanFrame extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;

	//private static DataScanFrame thisClass;
	private static ExcelDataTablePane excelDataTablePane;
	private static OptBtnsPanel optBtnsPanel;
	private ProgressBarPanel pnlProgressBar;
	// private static List<ScanItem> siList = new ArrayList<ScanItem>();
	private static Map<String, Integer> scanMap = null;

	// �ļ�ѡ��ؼ�
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * ��̬����� 1��Ϊɨ�����б���ʼֵ 2��Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {
		scanMap = new HashMap<String, Integer>();
		scanMap.put(ScanItem.V_IC, 0);

		// �����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}

	public DataScanFrame() {
		setTitle("����ɨ��<һ>");

		// �������α߿�
		LineBorder lineBorder = (LineBorder)BorderFactory.createLineBorder(Color.black);
		//����Excel�������ı߿�
		TitledBorder edpBorder = BorderFactory.createTitledBorder(lineBorder, "Excel�������");
		
		excelDataTablePane = new ExcelDataTablePane();
		excelDataTablePane.setBorder(edpBorder);
		pnlProgressBar = new ProgressBarPanel();
		optBtnsPanel = new OptBtnsPanel(this);
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
				DataScanFrame thisClass = new DataScanFrame();
				thisClass.showWithFrame();
			}
		});
	}

	public ExcelDataTablePane getExcelDataTablePane() {
		return excelDataTablePane;
	}

	public void setExcelDataTablePane(ExcelDataTablePane excelDataTablePane) {
		DataScanFrame.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel optBtnsPanel) {
		DataScanFrame.optBtnsPanel = optBtnsPanel;
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
	public void executScanning() {
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

		public ImportExcelProgree(ProgressBarPanel pnlProgressBar, File file) {
			super(pnlProgressBar);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file, super.getListener());
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
		public ScanningProgress(ProgressBarPanel pnlProgressBar) {
			super(pnlProgressBar);
		}

		public void execut() {
			DataScanning ds = new DataScanning();
			// ��ñ��ԭʼ���ݣ���ɨ������
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), super.getListener());
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

		public ExportExcelProgress(ProgressBarPanel pnlProgressBar, File file) {
			super(pnlProgressBar);
			this.file = file;
		}

		public void execut() {
			// ��ȡ�ļ�����ı������
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

			// �����ļ�
			boolean rv = PoiOperatXls.writeXls(excelData, file.getPath(), super.getListener());

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
