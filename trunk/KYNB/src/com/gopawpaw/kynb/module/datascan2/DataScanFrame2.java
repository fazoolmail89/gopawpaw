package com.gopawpaw.kynb.module.datascan2;

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
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.PoiOperatXls;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.StringConstant;

public class DataScanFrame2 extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private JPanel pnlContent;
	private DBDataPane dbDataPane;
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
		
		if(!GlobalParameter.isAuthModuls){
			//�Ƿ���Ȩ
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		setTitle("����ɨ��˶ԣ��Զ����ݿ⣩");
		
		// �������α߿�
		LineBorder lineBorder = (LineBorder)BorderFactory.createLineBorder(Color.black);
		//�������ݿ��������ı߿�
		TitledBorder ddpBorder = BorderFactory.createTitledBorder(lineBorder, "���ݿ�����ʾ��");
		//����Excel�������ı߿�
		TitledBorder edpBorder = BorderFactory.createTitledBorder(lineBorder, "Excel�������");
		
		pnlContent = new JPanel();
		dbDataPane = new DBDataPane();
		dbDataPane.setBorder(ddpBorder);
		
		excelDataTablePane = new ExcelDataTablePane2();
		excelDataTablePane.setBorder(edpBorder);
		pnlContent.setLayout(new BorderLayout());
		pnlContent.add(excelDataTablePane, BorderLayout.NORTH);
		pnlContent.add(dbDataPane, BorderLayout.CENTER);
		
		//�������������
		pnlProgressBar = new ProgressBarPanel();
		
		optBtnsPanel = new OptBtnsPanel2(this);
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		
		setLayout(new BorderLayout());
		add(pnlContent, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		setSize(900, 700);
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
	
	public DBDataPane getDbDataPane() {
		return dbDataPane;
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
	 * ִ��ɨ��
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
		//����ļ����ѱ�ռ�ã���ʾ�û��Ƿ񸲸��ļ�
		if(file.exists()) {
			int rv = JOptionPane.showConfirmDialog(DataScanFrame2.this,
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
