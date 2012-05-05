/**
 * 
 */
package com.gopawpaw.kynb.module.oldprogram;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJDialog;
import com.gopawpaw.frame.widget.GJTextField;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.PoiOperatXls2;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.widget.GppStyleTable;
import com.gopawpaw.kynb.widget.MessageDialog;

/**
 * @version 2011-11-19
 * @author Jason
 */
public class BlackNameManagerDialog  extends GJDialog implements ActionListener, GppJarRunableInterface{

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String title;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JTextField mJTextExcelPath;
	
	private JTextField mJTextICEdit;

	private JProgressBar progressBar = new JProgressBar();

	private JTable jTableVillager = null;
	
	private Vector<String> mVillagerTableTitle = new Vector<String>(1);
	private Vector<Vector<String>> mVillagerData = new Vector<Vector<String>>(1);
	
	private String mCurrentBlackIC = "";
	
	private JLabel jLabelStatusInfo = new JLabel("提示帮助");
	
	private String mStatusInfoICEdit = "Enter=查询；F1=新增保存；F4=清空编辑框；F5=删除";
	private String mStatusInfoTableBlackName = "Up/Down=上/下一条记录；F5=删除";
	
	private JLabel jLabelResultCount = new JLabel("");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog() {
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public BlackNameManagerDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public BlackNameManagerDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public BlackNameManagerDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public BlackNameManagerDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public BlackNameManagerDialog(Window owner, String title,
			ModalityType modalityType) {
		super(owner, title, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public BlackNameManagerDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public BlackNameManagerDialog(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 * @param gc
	 */
	public BlackNameManagerDialog(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				BlackNameManagerDialog.this.setVisible(false);
			}
		});

		this.setModal(true);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	protected void actionFinish(int option, Thorp thorp) {
		// this.setVisible(false);

	}

	private JPanel getJPanelContent() {
		if (jPanelContent == null) {
			jPanelContent = new JPanel();
			jPanelContent.setLayout(new BorderLayout());
			// 上边距，左边距，下边距，右边距
			// jPanelContent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,
			// 5));

			JPanel jPanelBottom = new JPanel();
			jPanelBottom.setLayout(new GridLayout());
			jButtonConfirm = new GJButton("执行导入");

			jButtonConfirm.addActionListener(this);

			
			jPanelBottom.add(jLabelStatusInfo, null);

			// 上边距，左边距，下边距，右边距
			// jLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10,
			// 20));
			JPanel jPanelV = new JPanel();
			JPanel jPanelC = new JPanel();
			jPanelV.setLayout(new BoxLayout(jPanelV, BoxLayout.Y_AXIS));

			
			// 选择文件
			JPanel jPanelC2 = new JPanel();
			jPanelC2.setLayout(new BoxLayout(jPanelC2, BoxLayout.X_AXIS));
			jPanelC2.setAlignmentX(0);
			
			
			
			JButton button = new JButton("选择导入文件");
			button.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFileChooser jFileChooser = new JFileChooser();

					jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					jFileChooser.showOpenDialog(null);

					if (jFileChooser.getSelectedFile() != null) {
						String ph = jFileChooser.getSelectedFile()
								.getAbsolutePath();
						
						mJTextExcelPath.setText(ph);
					}
				}
			});

			mJTextExcelPath = new JTextField();
			mJTextExcelPath.setPreferredSize(new Dimension(100, 20));
			mJTextExcelPath.setEditable(false);
			mJTextExcelPath.setFocusable(false);
			
			mJTextICEdit = new GJTextField(){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionF1() {
					actionAddVillager();
					return true;
				};
				
				public boolean actionF4() {
					mJTextICEdit.setText("");
					return true;
				};
				
				public boolean actionF5() {
					actionDeleteVillager();
					return true;
				};
				
				public boolean actionKey(int keyCode) {
					
					return true;
				};
				
				public boolean actionEnter() {
					mCurrentBlackIC = mJTextICEdit.getText();
					refreshTableVillager(mCurrentBlackIC);
					return true;
				};
			};
			
			mJTextICEdit.setPreferredSize(new Dimension(100, 20));
			mJTextICEdit.addFocusListener(new FocusListener(){

				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					jLabelStatusInfo.setText(mStatusInfoICEdit);
				}

				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					jLabelStatusInfo.setText("");
				}
				
			});
			
			jLabelResultCount.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
			
			jPanelC2.add(new JLabel("输入身份证："));
			jPanelC2.add(mJTextICEdit);
			jPanelC2.add(jLabelResultCount);
			jPanelC2.add(new JLabel("导入文件："));
			jPanelC2.add(mJTextExcelPath);
			jPanelC2.add(button);
			jPanelC2.add(jButtonConfirm);
			
			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条

			jPanelV.add(jPanelC);
			jPanelV.add(jPanelC2);
			jPanelV.add(progressBar);
			
			//左边表格
			JScrollPane jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTableVillager());
			jScrollPane.setPreferredSize(new Dimension(170,400));
			jScrollPane.setAutoscrolls(true);
			jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

			jPanelContent.add(jScrollPane, BorderLayout.WEST);
			jPanelContent.add(jPanelV, BorderLayout.NORTH);
			jPanelContent.add(jPanelBottom, BorderLayout.SOUTH);
		}
		return jPanelContent;
	}

	@Override
	public void setVisible(boolean arg0) {
		super.setTitle(this.title);
		this.setSize(600, 300);

		this.setLocation(this.getOwner().getLocation().x
				+ this.getOwner().getSize().width / 3, this.getOwner()
				.getLocation().y + this.getOwner().getSize().height / 4);

		this.add(getJPanelContent());

		super.setVisible(arg0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (jButtonConfirm.equals(arg0.getSource())) {
			
			if(mJTextExcelPath.getText() != null && !mJTextExcelPath.getText().equals("")){
				new Progress(progressBar, jButtonConfirm).start(); // 自定义类progress
			}else{
				//提示选择文件
			}
			
		}

	}

	private JTable getJTableVillager() {
		if (jTableVillager == null) {
			

			// 设置列标题(表头)
//			String[] columnName = { "序号","姓名","性别","身份证号","民族","出生日期","现居住地址","开户银行","银行账户","本年缴费档次","人员类别","参保时间","档案存放位置","老农保帐户余额","参加老农保标志","户主姓名","户主身份证号","与户主间关系","文化程度","距60岁不足15年缴费标志","联系电话","婚姻状况","政治面貌","联系人","通讯地址","邮政编码","军转人员标志","劳动模范","社保账号","起领日期","状态","备注"};

			mVillagerTableTitle.add(Villager.tab_v_ic );

			
			// 初始化表格
			
			DefaultTableModel model = new DefaultTableModel(mVillagerData, mVillagerTableTitle);
			jTableVillager = new GppStyleTable(model){

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean actionF5() {
					actionDeleteVillager();
					return true;
				};
				public boolean actionUp() {
					int rowS = jTableVillager.getSelectedRow();
					if(rowS>0){
						rowS--;
					}
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					return true;
				};
				public boolean actionDown() {
					int max = jTableVillager.getRowCount()-1;
					int rowS = jTableVillager.getSelectedRow();
					if(rowS<max){
						rowS++;
					}
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					return true;
				};
				
			};
			jTableVillager.setRowHeight(22);
			
			jTableVillager.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					int rowS = jTableVillager.getSelectedRow();
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					jLabelStatusInfo.setText(mStatusInfoTableBlackName);
					
				}
			});

			
			refreshTableVillager();
		}
		return jTableVillager;
	}
	
	private void refreshTableVillager(){
		refreshTableVillager("");
	}
	
	private void refreshTableVillager(String ve_ic){
		try {
			List<String> list = mXXDB.getVillagerErrorAll(ve_ic);
			
			mVillagerData.removeAllElements();
			for(String v:list){
				Vector<String> rowdata = new Vector<String>(1);
				rowdata.add(v);
				mVillagerData.add(rowdata);
			}
			
			DefaultTableModel model = new DefaultTableModel(mVillagerData, mVillagerTableTitle);
			((GppStyleTable)jTableVillager).updateModel(model);
			
			jLabelResultCount.setText("共："+list.size()+"条");
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 执行添加
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionAddVillager(){
		try {
			mCurrentBlackIC = mJTextICEdit.getText();
			if(mCurrentBlackIC==null || "".equals(mCurrentBlackIC)){
				String tempMSG = "该身份证号不能为空，请重新输入！";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(mXXDB.isExistVillagerError(mCurrentBlackIC)){
				String tempMSG = "您要添加的身份证号（"+mCurrentBlackIC+"）已经存在黑名单中！";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(mXXDB.insertVillagerError(mCurrentBlackIC)){
				String tempMSG = "成功添加的身份证号（"+mCurrentBlackIC+"）到黑名单中！";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				refreshTableVillager();
				
				return;
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * 执行删除
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionDeleteVillager(){
		
		try {
			
			mCurrentBlackIC = mJTextICEdit.getText();
			if(mCurrentBlackIC==null || "".equals(mCurrentBlackIC)){
				String tempMSG = "该身份证号不能为空，请重新输入！";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(!mXXDB.isExistVillagerError(mCurrentBlackIC)){
				String tempMSG = "您要删除的身份证号（"+mCurrentBlackIC+"）已经不在黑名单中！";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			String tempMSG = "是否确认将身份证（"+mCurrentBlackIC+"）从黑名单中移除 ？";
			MessageDialog gmd = new MessageDialog(this){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				protected void actionFinish(int option) {
					// TODO Auto-generated method stub
					
					super.actionFinish(option);
					if(option == MessageDialog.YES_OPTION){
						//确认删除
						try {
							mXXDB.deleteVillagerError(mCurrentBlackIC);
						} catch (DBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						mJTextICEdit.requestFocus();
						refreshTableVillager();
					}
				}
			};
			gmd.setTitle("系统提示");
			gmd.setMessage(tempMSG);
			gmd.setVisible(true);
			
			
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	
	

	class Progress extends Thread {// 自定义类progress
		
		private JProgressBar progressBar;
		private JButton button;
		private String excelPath;
		private XXNCYLBXDBAccess mXXNCYLBXDBAccess;
		public Progress(JProgressBar progressBar, JButton button) {
			this.progressBar = progressBar;
			this.button = button;
			this.excelPath = mJTextExcelPath.getText();
			mXXNCYLBXDBAccess = new XXNCYLBXDBAccess();
			
		}

		public void run() {
			try {
				Object[][] arr = PoiOperatXls2.readXlsRTA(new File(excelPath));
				if (arr != null) {
					int size = arr.length;
					progressBar.setMaximum(size);
					
					int importOKCount = 0;
					int importErrorCount = 0;
					int importHasExistCount = 0;
					
					String ve_ic = "";
					for (int i = 0; i < size; i++) {
						ve_ic = (String) arr[i][0];
						if(mXXNCYLBXDBAccess.isExistVillagerError(ve_ic)){
							//已经存在
							importHasExistCount++;
							progressBar.setString("进度："+(i+1)+"/"+size+" 成功："+importOKCount+" 失败："+importErrorCount+" 已存在："+importHasExistCount);
							progressBar.setValue(i+1); // 进度值
							continue;
						}
						
						if(mXXNCYLBXDBAccess.insertVillagerError(ve_ic)){
							//导入成功
							importOKCount++;
						}else{
							//导入失败
							importErrorCount++;
						}
						
						progressBar.setString("进度："+(i+1)+"/"+size+" 成功："+importOKCount+" 失败："+importErrorCount+" 已存在："+importHasExistCount);
						progressBar.setValue(i+1); // 进度值
					}
				}

				progressBar.setIndeterminate(false); // 采用确定的进度条
				// progressBar.setIndeterminate(true); //不确定进度的进度条
				

			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			refreshTableVillager();
			button.setEnabled(true); // 按钮可用
		}
	}




	@Override
	public boolean runJar(String[] args) {
		BlackNameManagerDialog.main(args);
		return false;
	}

	public static void main(String[] args) {
		Frame f = new Frame();
		BlackNameManagerDialog gmd = new BlackNameManagerDialog(f);
		gmd.setTitle("黑名单管理");
		gmd.setVisible(true);
	}
}
