package com.gopawpaw.kynb.module.scandatamange;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.*;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class ScanDataMangeFrame extends BaseModuleFrame {

	private static final long serialVersionUID = -1184641427476379004L;

	private static QueryPanel pnlQuery;
	private TableScrollPane spnTable;
	private static OptBtnsPanel optBtnsPanel;
	private ProgressBarPanel pnlProgressBar;
	
	// �ļ�ѡ��ؼ�
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * ��̬����� 1��Ϊɨ�����б���ʼֵ 2��Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {
		// �����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}
	
	public ScanDataMangeFrame() {
		pnlQuery = new QueryPanel(this);
		spnTable = new TableScrollPane();
		pnlProgressBar =  new ProgressBarPanel();
		optBtnsPanel = new OptBtnsPanel(this);
		optBtnsPanel.setSize(new Dimension(70, 600));
		optBtnsPanel.setPreferredSize(new Dimension(70, 600));
		
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(spnTable, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		setSize(900, 600);
		
		//--------------------------------------------
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				ScanDataMangeFrame thisClass = new ScanDataMangeFrame();
				thisClass.showWithFrame();
			}
		});
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
	
	public JFileChooser getFilechooser() {
		return fileChooser;
	}
	
	public TableScrollPane getSpnTable() {
		return spnTable;
	}
	
	public QueryPanel getPnlQuery() {
		return pnlQuery;
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
			
			if(excelData[0].length > 10) {
				JOptionPane.showMessageDialog(null, "����Excel����������ܴ���10��", "����Excel��ʾ��",
						JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			Object[][] tableData = new Object[excelData.length - 1][];
			List<OtherData> list = new ArrayList<OtherData>();
			OtherData odata = null;
			for(int i = 1; i < excelData.length ; i++) {
				tableData[i - 1] = excelData[i];
				odata = new OtherData();
				odata.setAcol("");
				odata.setBcol("");
				odata.setCcol("");
				odata.setDcol("");
				odata.setEcol("");
				odata.setFcol("");
				odata.setGcol("");
				odata.setHcol("");
				odata.setIcol("");
				odata.setJcol("");
				
				for(int j = 0; j < excelData[i].length; j++) {
					switch (j) {
					case 0:
						odata.setAcol((String)excelData[i][j]);
						break;
					case 1:
						odata.setBcol((String)excelData[i][j]);
						break;
					case 2:
						odata.setCcol((String)excelData[i][j]);
						break;
					case 3:
						odata.setDcol((String)excelData[i][j]);
						break;
					case 4:
						odata.setEcol((String)excelData[i][j]);
						break;
					case 5:
						odata.setFcol((String)excelData[i][j]);
						break;
					case 6:
						odata.setGcol((String)excelData[i][j]);
						break;
					case 7:
						odata.setHcol((String)excelData[i][j]);
						break;
					case 8:
						odata.setIcol((String)excelData[i][j]);
						break;
					case 9:
						odata.setJcol((String)excelData[i][j]);
						break;
					default:
						break;
					}
				}
				list.add(odata);
			}
			DataOpertor dot = new DataOpertor();
			if(dot.batSave(list, super.getListener())) {
				dot = new DataOpertor();
				spnTable.refreshTable(dot.findListAll());
				JOptionPane.showMessageDialog(null, "�������ݳɹ���", "����Excel��ʾ��",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "��������ʧ�ܣ�", "����Excel��ʾ��",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
