package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.IProgressListener;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelAccess;
import com.gopawpaw.kynb.db.ExcelWriter;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.IDNumberChecker;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * @���� ����15λ���֤���뼰�������֤������Ĺ������
 * @���� ¬����
 * @�汾 2012-03-28
 */
public class IdCardNoTablePanel extends JPanel {
	private static final long serialVersionUID = -6262707394292686623L;
	/**
	 * �����֤�������
	 */
	public static final String OLD_IC_TITLE = "�����֤����";
	/**
	 * �����֤�������
	 */
	public static final String NEW_IC_TITLE = "�����֤����";
	
	/**
	 * �����֤�����б�
	 */
	public static final int OLD_IC_COLNUM = 3;
	
	/**
	 * �¾����֤�����б�
	 */
	public static final int NEW_IC_COLNUM = 4;
	
	private DefaultTableModel model = null;
	
	private JScrollPane paneTableContainer;
	
	private static JTable idCardNoTable;	
	
	/**
	 * ��������������
	 */
	private IdnoUpgrade mainFrame;
	private JLabel title = new JLabel("���������֤�����б�(��ɫΪ�������֤����)��");
	private Vector<String> mVillagerTableTitle = new Vector<String>(34);
	private Vector<Vector<String>> mVillagerData = new Vector<Vector<String>>(
			34);
	private IdCardDbAccess icdAccess = new IdCardDbAccess();
	private IDNumberChecker idNumberChecker = new IDNumberChecker();
	
	public IdCardNoTablePanel(IdnoUpgrade mainFrame) {
		initialize(mainFrame);
	}

	public IdCardNoTablePanel(IdnoUpgrade mainFrame, int width, int height) {
		setSize(new Dimension(width, height));
		initialize(mainFrame);
	}

	/**
	 * ��ʼ�����
	 */
	private void initialize(IdnoUpgrade mainFrame) {
		this.mainFrame = mainFrame;
		//mVillagerData = getMVillagerData();//��Ϊ�����֤��ťʱ��������
		setLayout(new BorderLayout());
		add(title, BorderLayout.NORTH);
		add(getPaneTableContainer(), BorderLayout.CENTER);
		setVisible(true);
	}

	private JScrollPane getPaneTableContainer() {
		if(paneTableContainer == null)
			paneTableContainer = new JScrollPane();
		paneTableContainer.setViewportView(getInitIdCardNoTable());
		paneTableContainer.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		return paneTableContainer;
	}
	
	/**
	 * ��ȡ�����֤�����б���
	 * @return
	 */
	private JTable getInitIdCardNoTable() {
		if (idCardNoTable == null) {
			//mVillagerTableTitle.add("ѡ��");
			mVillagerTableTitle.add(Villager.tab_v_id);
			mVillagerTableTitle.add(Villager.tab_v_name);
			mVillagerTableTitle.add(Villager.tab_v_sex);
			//mVillagerTableTitle.add(Villager.tab_v_ic);
			
			mVillagerTableTitle.add(OLD_IC_TITLE);
			mVillagerTableTitle.add(NEW_IC_TITLE);
			
			mVillagerTableTitle.add(Villager.tab_v_nation);
			mVillagerTableTitle.add(Villager.tab_v_birthday);
			mVillagerTableTitle.add(Villager.tab_v_address_live);
			mVillagerTableTitle.add(Villager.tab_v_bank_name);
			mVillagerTableTitle.add(Villager.tab_v_bank_account);
			mVillagerTableTitle.add(Villager.tab_v_bank_account_name);
			mVillagerTableTitle.add(Villager.tab_v_bank2_name);
			mVillagerTableTitle.add(Villager.tab_v_bank2_account);
			mVillagerTableTitle.add(Villager.tab_v_bank2_account_name);
			mVillagerTableTitle.add(Villager.tab_v_capture_expend_calss);
			mVillagerTableTitle.add(Villager.tab_v_type);
			mVillagerTableTitle.add(Villager.tab_v_join_time);
			mVillagerTableTitle.add(Villager.tab_v_archival_location);
			mVillagerTableTitle.add(Villager.tab_v_old_balance);
			mVillagerTableTitle.add(Villager.tab_v_old_balance_flag);
			mVillagerTableTitle.add(Villager.tab_v_householder_name);
			mVillagerTableTitle.add(Villager.tab_v_householder_ic);
			mVillagerTableTitle.add(Villager.tab_v_householder_relation);
			mVillagerTableTitle.add(Villager.tab_v_standard_culture);
			mVillagerTableTitle.add(Villager.tab_v_60not_enough15_flag);
			mVillagerTableTitle.add(Villager.tab_v_phone_num);
			mVillagerTableTitle.add(Villager.tab_v_marital_status);
			mVillagerTableTitle.add(Villager.tab_v_politics_status);
			mVillagerTableTitle.add(Villager.tab_v_contact_name);
			mVillagerTableTitle.add(Villager.tab_v_address_com);
			mVillagerTableTitle.add(Villager.tab_v_address_zip_code);
			mVillagerTableTitle.add(Villager.tab_v_soldie_flag);
			mVillagerTableTitle.add(Villager.tab_v_model_worker);
			mVillagerTableTitle.add(Villager.tab_v_social_security_num);
			mVillagerTableTitle.add(Villager.tab_v_begin_get_date);
			mVillagerTableTitle.add(Villager.tab_v_status);
			mVillagerTableTitle.add(Villager.tab_v_mark);
			mVillagerTableTitle.add(Villager.tab_v_mark2);
			mVillagerTableTitle.add(Villager.tab_t_id);

			model = new DefaultTableModel(mVillagerData, mVillagerTableTitle);
			idCardNoTable = new GppStyleTable(model) {
				private static final long serialVersionUID = 3798362980630566569L;

				public boolean isCellEditable(int rowIndex, int columnIndex) {
					boolean f = (columnIndex == NEW_IC_COLNUM) ? true : false;
					return f;
				}
			};
			setCellColor();
			//idCardNoTable = new JTable(mVillagerData, mVillagerTableTitle);
			idCardNoTable.setRowHeight(22);
		}
		return idCardNoTable;
	}
	
	@SuppressWarnings("static-access")
	public Vector<Vector<String>> getMVillagerDataFromDb(IProgressListener listener) {
		try {
			List<Villager> list = icdAccess.findAllVillagers();

			mVillagerData.removeAllElements();
			listener.onBefore(list.size());
			int i = 0;
			for (Villager v : list) {
				if(v.getV_ic().length() == 15 || idNumberChecker.IDCardValidate(v.getV_ic()).length() > 0) {
					mVillagerData.add(getVillagerVector(v));
				} 
				i++;
				listener.onExecute(i);
			}
			
		} catch (DBException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mVillagerData;
	}
	
	public Vector<Vector<String>> getMVillagerDataFromDb() {
		try {
			List<Villager> list = icdAccess.findAllVillagers();

			mVillagerData.removeAllElements();
			for (Villager v : list) {
				if(v.getV_ic().length() == 15 || idNumberChecker.IDCardValidate(v.getV_ic()).length() > 0) {
					mVillagerData.add(getVillagerVector(v));
				} 
			}
			
		} catch (DBException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mVillagerData;
	}
	
	/**
	 * ˢ�±������
	 * @param rowData
	 */
	public void refreshTable(Vector<Vector<String>> rowData) {
		DefaultTableModel model = new DefaultTableModel(rowData,
				mVillagerTableTitle);
		((GppStyleTable) idCardNoTable).updateModel(model);

		idCardNoTable.repaint();
		idCardNoTable.updateUI();
		
		idCardNoTable.scrollRectToVisible(idCardNoTable.getCellRect(idCardNoTable.getRowCount()-1,0,true));
		setCellColor();
	}
	
	/**
	 *  �����֤������֤��ͨ���ĵ�Ԫ��������Ϊ��ɫ
	 */
	public void setCellColor() {
		TableColumn oldITColumn = idCardNoTable.getColumn(OLD_IC_TITLE);
		TableColumn newITcolumn = idCardNoTable.getColumn(NEW_IC_TITLE);
		DefaultTableCellRenderer oldITFontColor = new DefaultTableCellRenderer() {
			private static final long serialVersionUID = -5337538538128245214L;
			// ��дsetValue�������Ӷ����Զ�̬�����е�Ԫ������ɫ
			public void setValue(Object value) {
				// ������֤�����鲻ͨ�����ͽ���������Ϊ��ɫ
/*				String temp = null;
				try {
					temp = IDNumberChecker.IDCardValidate(value.toString());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				setForeground(( temp.length() == 0 ) ? Color.black : Color.red);*/
				
				setForeground(( IDCardUtil.validate(value.toString()) ) ? Color.black : Color.red);
				// ��д�õ�Ԫ��ֵ
				setText((value == null) ? "" : value.toString());
				setFont(new Font(Font.SERIF,0,15));
			}
		};
		
		@SuppressWarnings("serial")
		DefaultTableCellRenderer newITFontColor = new DefaultTableCellRenderer() {
			// ��дsetValue�������Ӷ����Զ�̬�����е�Ԫ������ɫ
			public void setValue(Object value) {
				setForeground(( IDCardUtil.validate(value.toString()) ) ? Color.black : Color.red);
				// ��д�õ�Ԫ��ֵ
				setText((value == null) ? "" : value.toString());
				setFont(new Font(Font.SERIF,0,15));
			}
		};
		
		oldITColumn.setCellRenderer(oldITFontColor);
		newITcolumn.setCellRenderer(newITFontColor);
	}
	
	private Vector<String> getVillagerVector(Villager v) {
		Vector<String> rowdata = new Vector<String>(33);
		rowdata.add("" + v.getV_id());
		rowdata.add(v.getV_name());
		rowdata.add(v.getV_sex());
		rowdata.add(v.getV_ic());
		rowdata.add("");//�����֤������ʾ���ַ�
		rowdata.add(v.getV_nation());
		rowdata.add(v.getV_birthday());
		rowdata.add(v.getV_address_live());
		rowdata.add(v.getV_bank_name());
		rowdata.add(v.getV_bank_account());
		rowdata.add(v.getV_bank_account_name());
		rowdata.add(v.getV_bank2_name());
		rowdata.add(v.getV_bank2_account());
		rowdata.add(v.getV_bank2_account_name());
		rowdata.add(v.getV_capture_expend_calss());
		rowdata.add(v.getV_type());
		rowdata.add(v.getV_join_time());
		rowdata.add(v.getV_archival_location());
		rowdata.add(v.getV_old_balance());
		rowdata.add(v.getV_old_balance_flag());
		rowdata.add(v.getV_householder_name());
		rowdata.add(v.getV_householder_ic());
		rowdata.add(v.getV_householder_relation());
		rowdata.add(v.getV_standard_culture());
		rowdata.add(v.getV_60not_enough15_flag());
		rowdata.add(v.getV_phone_num());
		rowdata.add(v.getV_marital_status());
		rowdata.add(v.getV_politics_status());
		rowdata.add(v.getV_contact_name());
		rowdata.add(v.getV_address_com());
		rowdata.add(v.getV_address_zip_code());
		rowdata.add(v.getV_soldie_flag());
		rowdata.add(v.getV_model_worker());
		rowdata.add(v.getV_social_security_num());
		rowdata.add(v.getV_begin_get_date());
		rowdata.add(v.getV_status());
		rowdata.add(v.getV_mark());
		rowdata.add(v.getV_mark2());
		rowdata.add("" + v.getT_id());
		return rowdata;
	}
	
	/**
	 * ����ҳ��������
	 * @param progressBar
	 */
	public void actionSaveTableDateToExce(final JProgressBar progressBar) {

		Date date = new Date();

		String excelFile = "OutPut\\" + "�쳣����ں����б�" + "-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";
		String excelTempPath = "DBCenter\\emptyTemp.xls";
		
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		progressBar.setString("���ȣ�" + 0 + "/" + 0);
		progressBar.setValue(0); // ����ֵ
		
		ExcelWriter ew = new ExcelWriter(excelTempPath,excelFile);
		ew.setmTableTitle(mVillagerTableTitle);
		
		Vector<Vector<String>> exportDate = mVillagerData;
		
		ew.setmTableData(mVillagerData);
		ew.setExportExcelListener(new ExportExcelListener() {
			
			private boolean flag = false;
			@Override
			public void onExportProgress(int total, int current, boolean isOk) {
				// TODO Auto-generated method stub
				if(!flag){
					progressBar.setMaximum(total);
					flag = true;
				}else{
					progressBar.setString("���ȣ�" + current + "/" + total);
					progressBar.setValue(current); // ����ֵ
				}
			}
		});
		
		if(ew.actionSave()){
			String tempMSG = "�ɹ���������"+excelFile;
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
		}
	}

	public JTable getIdCardNoTable() {
		return idCardNoTable;
	}
	
	public Vector<Vector<String>> getmVillagerData() {
		return mVillagerData;
	}

	public void setmVillagerData(Vector<Vector<String>> mVillagerData) {
		this.mVillagerData = mVillagerData;
	}

	public static String getOldIcTitle() {
		return OLD_IC_TITLE;
	}

	public static String getNewIcTitle() {
		return NEW_IC_TITLE;
	}

	public static int getOldIcColnum() {
		return OLD_IC_COLNUM;
	}

	public static int getNewIcColnum() {
		return NEW_IC_COLNUM;
	}
	public Vector<String> getmVillagerTableTitle() {
		return mVillagerTableTitle;
	}

	public void setmVillagerTableTitle(Vector<String> mVillagerTableTitle) {
		this.mVillagerTableTitle = mVillagerTableTitle;
	}
	
	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
}
