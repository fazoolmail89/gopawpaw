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
 * @描述 带有15位身份证号码及错误身份证号码表格的滚动面板
 * @作者 卢向琪
 * @版本 2012-03-28
 */
public class IdCardNoTablePanel extends JPanel {
	private static final long serialVersionUID = -6262707394292686623L;
	/**
	 * 旧身份证号码标题
	 */
	public static final String OLD_IC_TITLE = "旧身份证号码";
	/**
	 * 新身份证号码标题
	 */
	public static final String NEW_IC_TITLE = "新身份证号码";
	
	/**
	 * 旧身份证号码列标
	 */
	public static final int OLD_IC_COLNUM = 3;
	
	/**
	 * 新旧身份证号码列标
	 */
	public static final int NEW_IC_COLNUM = 4;
	
	private DefaultTableModel model = null;
	
	private JScrollPane paneTableContainer;
	
	private static JTable idCardNoTable;	
	
	/**
	 * 持有主窗体引用
	 */
	private IdnoUpgrade mainFrame;
	private JLabel title = new JLabel("需升级身份证号码列表(红色为错误身份证号码)：");
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
	 * 初始化面板
	 */
	private void initialize(IdnoUpgrade mainFrame) {
		this.mainFrame = mainFrame;
		//mVillagerData = getMVillagerData();//改为点击验证按钮时加载数据
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
	 * 获取旧身份证号码列表表格
	 * @return
	 */
	private JTable getInitIdCardNoTable() {
		if (idCardNoTable == null) {
			//mVillagerTableTitle.add("选择");
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
	 * 刷新表格数据
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
	 *  将身份证号码验证不通过的单元格字体设为红色
	 */
	public void setCellColor() {
		TableColumn oldITColumn = idCardNoTable.getColumn(OLD_IC_TITLE);
		TableColumn newITcolumn = idCardNoTable.getColumn(NEW_IC_TITLE);
		DefaultTableCellRenderer oldITFontColor = new DefaultTableCellRenderer() {
			private static final long serialVersionUID = -5337538538128245214L;
			// 重写setValue方法，从而可以动态设置列单元字体颜色
			public void setValue(Object value) {
				// 如果身份证号码检查不通过，就将字体设置为红色
/*				String temp = null;
				try {
					temp = IDNumberChecker.IDCardValidate(value.toString());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				setForeground(( temp.length() == 0 ) ? Color.black : Color.red);*/
				
				setForeground(( IDCardUtil.validate(value.toString()) ) ? Color.black : Color.red);
				// 重写该单元格值
				setText((value == null) ? "" : value.toString());
				setFont(new Font(Font.SERIF,0,15));
			}
		};
		
		@SuppressWarnings("serial")
		DefaultTableCellRenderer newITFontColor = new DefaultTableCellRenderer() {
			// 重写setValue方法，从而可以动态设置列单元字体颜色
			public void setValue(Object value) {
				setForeground(( IDCardUtil.validate(value.toString()) ) ? Color.black : Color.red);
				// 重写该单元格值
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
		rowdata.add("");//新身份证号码显示空字符
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
	 * 导出页面表格数据
	 * @param progressBar
	 */
	public void actionSaveTableDateToExce(final JProgressBar progressBar) {

		Date date = new Date();

		String excelFile = "OutPut\\" + "异常身份在号码列表" + "-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";
		String excelTempPath = "DBCenter\\emptyTemp.xls";
		
		progressBar.setStringPainted(true); // 显示提示信息
		progressBar.setIndeterminate(false); // 确定进度的进度条
		progressBar.setString("进度：" + 0 + "/" + 0);
		progressBar.setValue(0); // 进度值
		
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
					progressBar.setString("进度：" + current + "/" + total);
					progressBar.setValue(current); // 进度值
				}
			}
		});
		
		if(ew.actionSave()){
			String tempMSG = "成功导出到："+excelFile;
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
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
