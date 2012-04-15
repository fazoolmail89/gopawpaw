package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class DataScanFrame extends BaseModuleFrame implements
GppJarRunableInterface {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private static DataScanFrame thisClass;
	private static ExcelDataTablePane excelDataTablePane = null;
	private static OptBtnsPanel optBtnsPanel = null;
	private static List<ScanItem> siList = new ArrayList<ScanItem>();
	
	//�ļ�ѡ��ؼ�
	private static JFileChooser fileChooser = new JFileChooser();
	
	/**
	 * ��̬�����
	 * 1��Ϊɨ�����б���ʼֵ
	 * 2��Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {
		ScanItem si = new ScanItem();
		si.setDbtColumnName(ScanItem.SI_V_IC);
		si.setExlColumnName("���֤��");
		siList.add(si);
		
		//�����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}
	
	public DataScanFrame() {
		excelDataTablePane = new ExcelDataTablePane();
		optBtnsPanel = new OptBtnsPanel();
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
				// IdnoUpgrade thisClass = new IdnoUpgrade();
				thisClass = new DataScanFrame();
				// thisClass.setVisible(true);
				thisClass.setVisible(true);
				optBtnsPanel.setMainFrame(thisClass);
			}
		});
	}
	
	@Override
	public boolean runJar(String[] args) {
		DataScanFrame.main(args);
		return false;
	}

	public static DataScanFrame getThisClass() {
		return thisClass;
	}

	public static void setThisClass(DataScanFrame thisClass) {
		DataScanFrame.thisClass = thisClass;
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

	public static List<ScanItem> getSiList() {
		return siList;
	}
	
	/**
	 * ִ�е���Excel�ļ�
	 * @param file
	 */
	public void executImportExcel(File file) {
		if(file == null) return;
		ImportExcelProgree iep = new ImportExcelProgree(file);
		iep.getProgressBar().setString("���ڼ������ݣ������ĵȴ���������");
		iep.getProgressBar().setIndeterminate(true);
		iep.start();
	}

	/**
	 * ִ�е���Excel�ļ�
	 * @param file
	 */
	public void executlScanning() {
		ScanningProgress sp = new ScanningProgress();
		sp.getProgressBar().setString("����ɨ�����ݣ������ĵȴ���������");
		sp.getProgressBar().setIndeterminate(true);
		sp.start();
	}
	
	/**
	 * ִ�е���Excel�ļ�
	 * @param file
	 */
	public void executExportExcel(File file) {
		if(file == null) return;
		ExportExcelProgress eep = new ExportExcelProgress(file);
		eep.getProgressBar().setString("���ڵ������ݣ������ĵȴ���������");
		eep.getProgressBar().setIndeterminate(true);
		eep.start();
	}
	
	/**
	 * ����Excel�߳��࣬��ʾ������
	 * @author lxq
	 *
	 */
	class ImportExcelProgree extends Progress {
		private File file = null;
		public ImportExcelProgree(File file) {
			super(DataScanFrame.this);
			this.file = file;
		}
		
		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file);
			getExcelDataTablePane().refreshTableByOriginalData(excelData);
			
			//��������ĵ�һ����ΪĬ��ɨ����
			getSiList().clear();
			ScanItem si = new ScanItem();
			si.setDbtColumnName(ScanItem.SI_V_IC);
			si.setExlColumnName(excelData[0][0].toString());
			getSiList().add(si);	
		}
	}

	/**
	 * ɨ�������߳��࣬��ʾ������
	 * @author lxq
	 *
	 */
	class ScanningProgress extends Progress {
		public ScanningProgress() {
			super(DataScanFrame.this);
			// TODO Auto-generated constructor stub
		}
		public void execut() {
			DataScanning ds = new DataScanning();
			
			//��ñ��ԭʼ���ݣ���ɨ������
			Object[][] sranResult = ds.scaning(getSiList(), getExcelDataTablePane().getOriginalData());
			//ˢ�±��
			getExcelDataTablePane().refreshTable(sranResult);
		}
	}

	/**
	 * ����Excel�߳��࣬��ʾ������
	 * @author lxq
	 *
	 */
	class ExportExcelProgress extends Progress {
		private JLabel message = new JLabel();
		private File file = null;
		public ExportExcelProgress(File file) {
			super(DataScanFrame.this);
			this.file = file;
		}
		
		public void execut() {
			//��ȡ�ļ�����ı������
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();
			
			if(excelData == null || excelData.length == 0) {
				message.setText("���ܵ��������ݱ��");
			} else {
				//�����ļ�
				boolean rv = PoiOperatXls.writeXls(excelData, file.getPath());
				if(rv) {
					message.setText("�ɹ������ļ���" + file.getPath());
				} else {
					message.setText("�޷������ļ���" + file.getPath());
				}				
			}
			
			JDialog md = new JDialog(DataScanFrame.this);
			md.setTitle("�ļ�������");
			message.setFont(new Font("���� ",java.awt.Font.BOLD,14));
			md.add(message);
			DataScanFrame.setDialogLocaltion(md);
			md.setSize(500, 100);
			md.setVisible(true);
			md.setModal(true);
		}
	}
	
	public static void setDialogLocaltion(JDialog dialog) {
		JFrame owner = thisClass;
		int	left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int	top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}
}
