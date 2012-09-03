/**
 * 
 */
package com.gopawpaw.kynb.module.oldprogram;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.frame.utils.GppCmdShell;
import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJCheckBox;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.DefultData;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.DataDefultManager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelAccess;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.GppConfiguration;
import com.gopawpaw.kynb.utils.IDNumberChecker;
import com.gopawpaw.kynb.utils.StringConstant;
import com.gopawpaw.kynb.utils.Tools;
import com.gopawpaw.kynb.widget.GppStyleTable;
import com.gopawpaw.kynb.widget.MessageDialog;

/**
 * @version 2011-11-13
 * @author Jason
 */
public class XXNCYLBXMain extends BaseModuleFrame implements GppJarRunableInterface{

	
	private static final long serialVersionUID = 1L;
	
	private String mLiyeqin = "\r\n技术支持：李业钦\r\n QQ:1483695671\r\n 电话：0774-7290788";
	
	private String mOffice = "联系快译支持：kuaiyi_support@163.com"+mLiyeqin;
	private String mSupport = mLiyeqin;
	
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	private JPanel jContentPane = null;

	private JSplitPane jSplitPaneCenter = null;
	private JScrollPane jScrollPaneCenterLeft = null;
	private JScrollPane jScrollPaneCenterRight = null;
	private JTable jTableVillager = null;

	private JTable jTableVillagerTop1 = null;

	private JPanel jPanelTop = null;
	private JPanel jPanelBottom = null;
	private JPanel jPanelDataEdit = null;

	private GJComboBox jComboBoxThorp = null;
	private JButton jButtonNewThorp = null;
	private JButton jButtonUpdateThorp = null;
	private JButton jButtonDeleteThorp = null;

	private JButton jButtonImportVillager = null;

	private JButton jButtonSaveVillager = null;
	private JButton jButtonSaveToExcel = null;
	private JButton jButtonSaveToExcel2 = null;

	private Vector<String> mVillagerTableTitle = new Vector<String>(33);
	private Vector<Vector<Object>> mVillagerData = new Vector<Vector<Object>>(
			33);
	private Vector<Vector<Object>> mVillagerDataTop1 = new Vector<Vector<Object>>(
			33);

	private Thorp mCurrentThorp = new Thorp();

	private Villager mCurrentVillager = new Villager();

	private GppJComboBoxExp jComboBox_ic = null;
	private GppJComboBoxExp jComboBox_name = null;
	private GppJComboBoxExp jComboBox_sex = null;
	private GppJComboBoxExp jComboBox_nation = null;
	private GppJComboBoxExp jComboBox_birthday = null;
	private GppJComboBoxExp jComboBox_address_live = null;
	private GppJComboBoxExp jComboBox_bank_name = null;
	private GppJComboBoxExp jComboBox_bank_account = null;
	private GppJComboBoxExp jComboBox_bank_account_name = null;
	private GppJComboBoxExp jComboBox_bank2_name = null;
	private GppJComboBoxExp jComboBox_bank2_account = null;
	private GppJComboBoxExp jComboBox_bank2_account_name = null;
	private GppJComboBoxExp jComboBox_capture_expend_calss = null;
	private GppJComboBoxExp jComboBox_type = null;
	private GppJComboBoxExp jComboBox_join_time = null;
	private GppJComboBoxExp jComboBox_archival_location = null;
	private GppJComboBoxExp jComboBox_old_balance = null;
	private GppJComboBoxExp jComboBox_old_balance_flag = null;
	private GppJComboBoxExp jComboBox_householder_name = null;
	private GppJComboBoxExp jComboBox_householder_ic = null;
	private GppJComboBoxExp jComboBox_householder_relation = null;
	private GppJComboBoxExp jComboBox_standard_culture = null;
	private GppJComboBoxExp jComboBox_60not_enough15_flag = null;
	private GppJComboBoxExp jComboBox_phone_num = null;
	private GppJComboBoxExp jComboBox_marital_status = null;
	private GppJComboBoxExp jComboBox_politics_status = null;
	private GppJComboBoxExp jComboBox_contact_name = null;
	private GppJComboBoxExp jComboBox_address_com = null;
	private GppJComboBoxExp jComboBox_address_zip_code = null;
	private GppJComboBoxExp jComboBox_soldie_flag = null;
	private GppJComboBoxExp jComboBox_model_worker = null;
	private GppJComboBoxExp jComboBox_social_security_num = null;
	private GppJComboBoxExp jComboBox_begin_get_date = null;
	private GppJComboBoxExp jComboBox_status = null;
	private GppJComboBoxExp jComboBox_mark = null;
	private GppJComboBoxExp jComboBox_mark2 = null;
	
	private JLabel jLabelVillagerNormalCount = new JLabel();
	private JLabel jLabelVillagerBlackCount = new JLabel();

	private JLabel jLabelStatusInfo = new JLabel();

	private String mStatusInfoTableNormal = "F5=删除该条信息；Right=将该条数据移至黑名单";
	private String mStatusInfoTableBlack = "F5=删除该条信息；Left=将该条数据移至正常数据";

	private String mStatusInfoEdit = "Enter=下一个字段；Esc=上一个字段；Up/Down=选择预订值；F1/F12=新增保存；F2/pageDown/+=修改保存；F3=初始默认；F4=清空编辑框；F5=删除；End=复制银行信息";

	private GppConfiguration mGppConfiguration;

	private String mBankAccountName = "";
	
	private String mBankAccount ="";
	
	private String mBank2AccountName = "";
	
	private String mBank2Account ="";
	
	private DefaultTableModel mVillagerModel;
	/**
	 * @throws HeadlessException
	 */
	public XXNCYLBXMain() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}


	/**
	 * @version 2011-11-13
	 * @author Jason
	 * @param
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				XXNCYLBXMain thisClass = new XXNCYLBXMain();
				thisClass.showWithFrame();

			}
		});
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setContentPane(getJContentPane());
		this.setTitle("数据信息录入");
		mGppConfiguration = new GppConfiguration("ini.ini");
		// testDB();
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());

			jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
			jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
			jContentPane.add(getJPanelBottom(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * 中间面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JSplitPane getJPanelCenter() {
		if (jSplitPaneCenter == null) {

			JPanel jPanelLeft = new JPanel();
			jPanelLeft.setLayout(new BorderLayout());
			JPanel jPanelLeft1 = new JPanel();
			jPanelLeft1.setLayout(new BoxLayout(jPanelLeft1, BoxLayout.X_AXIS));
			jPanelLeft1.add(getJButtonResetNormalID());
			jPanelLeft1.add(getJButtonSaveToExcel0());
			jPanelLeft1.add(getJButtonSaveToExcelOld());
			jPanelLeft1.add(getJButtonSaveToExcelNew());
			jPanelLeft.add(getJScrollPaneCenterRight(), BorderLayout.CENTER);
			jPanelLeft.add(jPanelLeft1, BorderLayout.SOUTH);
			jPanelLeft.add(getJPanelLeftTop(), BorderLayout.NORTH);

			JPanel jPanelRight = new JPanel();
			jPanelRight.setLayout(new BorderLayout());
			JPanel jPanelRight1 = new JPanel();
			jPanelRight1.setLayout(new BorderLayout());
			jPanelRight1.add(getJButtonResetBlackID(), BorderLayout.WEST);
			jPanelRight1.add(getJButtonSaveToExcel2(), BorderLayout.EAST);
			jPanelRight.add(getJScrollPaneCenterRightTop1(),
					BorderLayout.CENTER);
			jPanelRight.add(jPanelRight1, BorderLayout.SOUTH);
			jPanelRight.add(getJPanelRightTop(), BorderLayout.NORTH);

			JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					jPanelLeft, null);
			jSplitPane.setDividerLocation(300);
			jSplitPane.setOneTouchExpandable(true);
			jSplitPane.setDividerSize(10);

			jSplitPaneCenter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					getJScrollPaneCenterLeft(), jPanelLeft);
			jSplitPaneCenter.setDividerLocation(350);

		}
		return jSplitPaneCenter;
	}

	private JPanel getJPanelLeftTop() {
		JPanel jPanel0 = new JPanel();
		jPanel0.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		jPanel.add(new JLabel("正常数据列表："));
		jPanel.add(jLabelVillagerNormalCount);

		 
		jPanel0.add(jPanel, BorderLayout.CENTER);
		 jPanel0.add(getJButtonDeleteVillagersA(), BorderLayout.EAST);
		return jPanel0;
	}
	
	private JButton getJButtonDeleteVillagersA(){
		JButton jButton = new JButton("删除所选数据");
		
		jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int indexSelect = 0;
				int indexIC = 0;
				int size = mVillagerTableTitle.size();
				for(int i =0;i<size;i++){
					String cname = mVillagerTableTitle.get(i);
					if(Villager.tab_v_ic.equals(cname)){
						indexIC = i;
					}
					
					if("选择".equals(cname)){
						indexSelect = i;
					}
				}
				
				
				size = jTableVillager.getRowCount();
				for(int i=0;i<size;i++){
					String temp = jTableVillager.getValueAt(i, indexSelect).toString();
					
					if("true".equals(temp)){
						try {
							mXXDB.deleteVillager(jTableVillager.getValueAt(i, indexIC).toString());
						} catch (DBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				refreshTableVillager();
			}
			
		});
		return jButton;
	}

	private JPanel getJPanelRightTop() {

		JPanel jPanel0 = new JPanel();
		jPanel0.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		jPanel.add(new JLabel("黑名单列表："));
		jPanel.add(jLabelVillagerBlackCount);

		jPanel0.add(jPanel, BorderLayout.CENTER);
		 jPanel0.add(getJButtonDeleteVillagersB(), BorderLayout.WEST);
		return jPanel0;
	}

	private JButton getJButtonDeleteVillagersB(){
		JButton jButton = new JButton("删除所选数据");
		
		jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int size = jTableVillagerTop1.getRowCount();
				
				for(int i=0;i<size;i++){
					jTableVillagerTop1.getValueAt(i, 0).toString();
					
					if("true".equals(jTableVillagerTop1.getValueAt(i, 0).toString())){
						try {
							mXXDB.deleteVillager(jTableVillagerTop1.getValueAt(i, 4).toString());
						} catch (DBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				refreshTableVillagerTop1();
			}
			
		});
		return jButton;
	}
	
	/**
	 * 顶部面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JPanel getJPanelTop() {
		if (jPanelTop == null) {
			jPanelTop = new JPanel();
			jPanelTop.setLayout(new GridBagLayout());
			jPanelTop.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

			JLabel jLabel = new JLabel();
			jLabel.setText("选择村名:   ");

			JLabel jLabel2 = new JLabel();
			jLabel2.setPreferredSize(new Dimension(30, 20));

			jPanelTop.add(getJButtonCopyBank(), new GridBagConstraints());
			jPanelTop.add(getJButtonPasteBank(), new GridBagConstraints());
			
			jPanelTop.add(jLabel, new GridBagConstraints());
			jPanelTop.add(getJComboBoxThorp(), new GridBagConstraints());
			jPanelTop.add(jLabel2, new GridBagConstraints());
			jPanelTop.add(getJButtonNewThorp(), new GridBagConstraints());
			jPanelTop.add(getJButtonUpdateThorp(), new GridBagConstraints());
			jPanelTop.add(getJButtonDeleteThorp(), new GridBagConstraints());

			jPanelTop.add(jLabel2, new GridBagConstraints());
//			jPanelTop.add(getJButtonImportVillager(), new GridBagConstraints());
//			jPanelTop.add(getJButtonImportVillagerError(),
//					new GridBagConstraints());
//			jPanelTop.add(getJButtonBankEidt(),
//					new GridBagConstraints());
			jPanelTop.add(getJButtonImportDir(),
					new GridBagConstraints());
			jPanelTop.add(getJButtonDeleteVillager(), new GridBagConstraints());
			
			
		}
		return jPanelTop;
	}

	/**
	 * 底部面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JPanel getJPanelBottom() {
		if (jPanelBottom == null) {
			jPanelBottom = new JPanel();
			jPanelBottom.setLayout(new BorderLayout());
			// 上边距，左边距，下边距，右边距
			jPanelBottom.setBorder(BorderFactory
					.createEmptyBorder(5, 20, 5, 20));
			JPanel jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(getJButtonVillagerAdd());
			jPanel.add(getJButtonVillagerUpdate());
			jPanel.add(getJButtonVillagerDef());
			jPanel.add(getJButtonVillagerClear());
			jPanel.add(getJButtonVillagerDel());

			jPanelBottom.add(jPanel, BorderLayout.NORTH);
			jPanelBottom.add(jLabelStatusInfo, BorderLayout.SOUTH);

		}
		return jPanelBottom;
	}

	/**
	 * 新建村
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonNewThorp() {
		if (jButtonNewThorp == null) {
			jButtonNewThorp = new JButton();
			jButtonNewThorp.setText("创建村");
			jButtonNewThorp.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					ThorpDialog gmd = new ThorpDialog(XXNCYLBXMain.this) {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						@Override
						protected void actionFinish(int option, Thorp thorp) {
							// TODO Auto-generated method stub

							if (option == ThorpDialog.YES_OPTION) {
								try {
									if (mXXDB.isExistThorp(thorp.getT_name())) {
										String tempMSG = "该村名已经存在，请重新输入！";
										//声音提示
										Toolkit.getDefaultToolkit().beep();
										JOptionPane.showConfirmDialog(null,
												tempMSG, "系统提示",
												JOptionPane.OK_OPTION,
												JOptionPane.WARNING_MESSAGE);

										return;
									}

									if (mXXDB.insertThorp(thorp)) {
										// 创建成功
										String tempMSG = "创建成功！";
										//声音提示
										Toolkit.getDefaultToolkit().beep();
										JOptionPane.showConfirmDialog(null,
												tempMSG, "系统提示",
												JOptionPane.OK_OPTION,
												JOptionPane.WARNING_MESSAGE);
										jComboBoxThorp.addItem(thorp);
									} else {
										String tempMSG = "创建失败！";
										//声音提示
										Toolkit.getDefaultToolkit().beep();
										JOptionPane.showConfirmDialog(null,
												tempMSG, "系统提示",
												JOptionPane.OK_OPTION,
												JOptionPane.WARNING_MESSAGE);
									}
								} catch (DBException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							} else {

							}
							super.actionFinish(option, thorp);

						}
					};
					gmd.setTitle("创建村");
					gmd.setModal(true);
					gmd.setVisible(true);
				}
			});
		}
		return jButtonNewThorp;
	}

	private JButton getJButtonUpdateThorp() {
		if (jButtonUpdateThorp == null) {
			jButtonUpdateThorp = new JButton();
			jButtonUpdateThorp.setText("修改村");
			jButtonUpdateThorp
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							ThorpDialog td = new ThorpDialog(XXNCYLBXMain.this) {
								/**
						 * 
						 */
								private static final long serialVersionUID = 1L;

								@Override
								protected void actionFinish(int option,
										Thorp thorp) {
									// TODO Auto-generated method stub

									if (option == ThorpDialog.YES_OPTION) {
										try {
											if (mXXDB.updateThorp(thorp)) {
												// 创建成功
												String tempMSG = "修改成功！";
												JOptionPane
														.showConfirmDialog(
																null,
																tempMSG,
																"系统提示",
																JOptionPane.OK_OPTION,
																JOptionPane.WARNING_MESSAGE);
												int count = jComboBoxThorp.getItemCount();
												for(int i=0;i<count;i++){
													Thorp tho = (Thorp)jComboBoxThorp.getItemAt(i);
													if(tho.getT_id() == thorp.getT_id()){
														jComboBoxThorp.removeItem(tho);
														
														jComboBoxThorp.addItem(thorp);
														
														break;
													}
												}
											} else {
												String tempMSG = "修改失败！";
												JOptionPane
														.showConfirmDialog(
																null,
																tempMSG,
																"系统提示",
																JOptionPane.OK_OPTION,
																JOptionPane.WARNING_MESSAGE);
											}
										} catch (DBException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

									} else {

									}

									super.actionFinish(option, thorp);

								}
							};
							td.setTitle("修改村");
							td.setModal(true);
							td.setThorp(mCurrentThorp);
							td.setVisible(true);
						}
					});
		}
		return jButtonUpdateThorp;
	}

	private JButton getJButtonDeleteThorp() {
		if (jButtonDeleteThorp == null) {
			jButtonDeleteThorp = new JButton();
			jButtonDeleteThorp.setText("删除村");
			jButtonDeleteThorp
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							ThorpDialog gmd = new ThorpDialog(XXNCYLBXMain.this) {
								/**
						 * 
						 */
								private static final long serialVersionUID = 1L;

								@Override
								protected void actionFinish(int option,
										Thorp thorp) {
									// TODO Auto-generated method stub

									if (option == ThorpDialog.YES_OPTION) {
										try {
											if (mXXDB.deleteThorp(thorp)) {
												// 创建成功
												String tempMSG = "删除成功！";
												JOptionPane
														.showConfirmDialog(
																null,
																tempMSG,
																"系统提示",
																JOptionPane.OK_OPTION,
																JOptionPane.WARNING_MESSAGE);
												jComboBoxThorp
														.removeItem(thorp);
											} else {
												String tempMSG = "删除失败！";
												JOptionPane
														.showConfirmDialog(
																null,
																tempMSG,
																"系统提示",
																JOptionPane.OK_OPTION,
																JOptionPane.WARNING_MESSAGE);
											}
										} catch (DBException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}

									} else {

									}
									super.actionFinish(option, thorp);
								}
							};
							gmd.setTitle("删除村");
							gmd.setModal(true);
							gmd.setThorp(mCurrentThorp);
							gmd.setVisible(true);
						}
					});
		}
		return jButtonDeleteThorp;
	}

	private JButton getJButtonImportVillager() {
		if (jButtonImportVillager == null) {
			jButtonImportVillager = new JButton();
			jButtonImportVillager.setText("导入数据");
			jButtonImportVillager
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							DataImportDialog gmd = new DataImportDialog(XXNCYLBXMain.this) {
								/**
						 * 
						 */
								private static final long serialVersionUID = 1L;

								@Override
								protected void actionFinish(int option,
										Thorp thorp) {
									// TODO Auto-generated method stub

									if (option == ThorpDialog.YES_OPTION) {

									} else {

									}
									super.actionFinish(option, thorp);
								}
							};
							gmd.setTitle("导入数据");
							// gmd.setThorp(mCurrentThorp);
							
							gmd.setModal(true);
							gmd.setVisible(true);
						}
					});
		}
		return jButtonImportVillager;
	}

	private JButton getJButtonImportVillagerError() {

		JButton jButtonImportVillager = new JButton();
		jButtonImportVillager.setText("黑名单管理");
		jButtonImportVillager
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						BlackNameManagerDialog gmd = new BlackNameManagerDialog();
						gmd.setTitle("黑名单管理");
						gmd.setVisible(true);
					}
				});

		return jButtonImportVillager;
	}

	private JButton getJButtonBankEidt() {

		JButton jButton = new JButton();
		jButton.setText("银行信息编辑");
		jButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						BankEdit be = new BankEdit(mCurrentThorp);
						be.setLocation(XXNCYLBXMain.this.getLocation());
						be.setSize(900,400);
						be.setModal(true);
						be.setVisible(true);
					}
				});

		return jButton;
	}
	
	private JButton getJButtonCopyBank() {

		JButton jButton = new JButton();
		jButton.setText("复制缴费行");
		jButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						mBankAccount = jComboBox_bank_account.getSelectedItem().toString();
						mBankAccountName = jComboBox_bank_account_name.getSelectedItem().toString();
						String tempMSG = "复制成功！ \r\n"+mBankAccount+"\r\n"+mBankAccountName;
						//声音提示
//						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.INFORMATION_MESSAGE);
					}
				});

		return jButton;
	}
	
	private JButton getJButtonPasteBank() {

		JButton jButton = new JButton();
		jButton.setText("粘贴缴费行");
		jButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						if(mBankAccount != null && !"".equals(mBankAccount)){
							jComboBox_bank_account.setSelectedItem(mBankAccount);
						}
						
						if(mBankAccountName != null && !"".equals(mBankAccountName)){
							jComboBox_bank_account_name.setSelectedItem(mBankAccountName);
						}
					}
				});

		return jButton;
	}
	
	private JButton getJButtonDeleteVillager() {

		JButton jButton = new JButton();
		jButton.setText("删除所有个人数据");
		jButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						
				String tempMSG = "是否真的确认删除所有档案数据？\r\n" +
				"所有村的档案数据将会被清空；并且该操作将不可恢复数据，请谨慎使用！！\r\n";
				MessageDialog gmd = new MessageDialog(XXNCYLBXMain.this) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					protected void actionFinish(int option) {
						// TODO Auto-generated method stub

						super.actionFinish(option);
						if (option == MessageDialog.YES_OPTION) {
							// 第一次确认删除
							
							MessageDialog gmd2 = new MessageDialog(XXNCYLBXMain.this) {
								/**
								 * 
								 */
								private static final long serialVersionUID = 1L;

								@Override
								protected void actionFinish(int option) {
									// TODO Auto-generated method stub

									super.actionFinish(option);
									if (option == MessageDialog.YES_OPTION) {
										// 第二次确认删除
										try {
											mXXDB.deleteVillagerAll();
											
										} catch (DBException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										clearEditVillager(false, false);
										jComboBox_ic.requestFocus();
										jScrollPaneCenterLeft.getVerticalScrollBar()
												.setValue(0);
										refreshTableVillager();
										refreshTableVillagerTop1();
									}
								}
							};
							String temp = "！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！\r\n" +
									"是否真的确认删除所有档案数据？\r\n" +
									"所有村的档案数据将会被清空；并且该操作将不可恢复数据，请谨慎使用！！\r\n" +
									"！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！";
							gmd2.setTitle("系统提示");
							gmd2.setModal(true);
							gmd2.setMessage(temp);
							gmd2.setVisible(true);
						}
					}
				};
				gmd.setTitle("系统提示");
				gmd.setModal(true);
				gmd.setMessage(tempMSG);
				gmd.setVisible(true);
					}
				});

		return jButton;
	}
	
	private JButton getJButtonImportDir() {

		JButton jButton = new JButton();
		jButton.setText("打开导出目录");
		jButton
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						GppCmdShell.actionCommand("start .\\OutPut\\");
					}
				});

		return jButton;
	}
	
	/**
	 * 选择村
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JComboBox
	 */
	private JComboBox getJComboBoxThorp() {
		if (jComboBoxThorp == null) {
			jComboBoxThorp = new GJComboBox();
			// jComboBoxThorp.setPreferredSize(new Dimension(200,20));
			// jComboBoxThorp.setMinimumSize(new Dimension(200,20));
			jComboBoxThorp.setEditable(false);

			jComboBoxThorp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							mCurrentThorp = (Thorp) jComboBoxThorp
									.getSelectedItem();
							if (jTableVillager != null
									&& jTableVillagerTop1 != null) {
								// jTableVillager = null;
								// getJScrollPaneCenterRight().setViewportView(getJTableVillager());
								refreshTableVillager();
								refreshTableVillagerTop1();
							}

						}
					});

			refreshThorpList();

			jComboBoxThorp.updateGppKeyListener();
		}

		return jComboBoxThorp;
	}

	private void refreshThorpList() {
		List<Thorp> list = null;
		try {
			jComboBoxThorp.removeAllItems();
			list = mXXDB.getThorpAll();
			for (Thorp th : list) {
				jComboBoxThorp.addItem(th);
			}
		} catch (DBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (mCurrentThorp == null && list != null && list.size() > 0) {
			jComboBoxThorp.setSelectedIndex(0);
			mCurrentThorp = list.get(0);
		}

	}

	/**
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonVillagerAdd() {

		JButton jButton = new JButton();
		jButton.setText("新增");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionAddVillager();
			}
		});

		return jButton;
	}

	private JButton getJButtonVillagerUpdate() {

		JButton jButton = new JButton();
		jButton.setText("保存");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionUpdateVillager();
			}
		});

		return jButton;
	}

	private JButton getJButtonVillagerDef() {

		JButton jButton = new JButton();
		jButton.setText("初始默认");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionEditReset();
			}
		});

		return jButton;
	}

	private JButton getJButtonVillagerClear() {

		JButton jButton = new JButton();
		jButton.setText("清空编辑框");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionEditClear();
			}
		});

		return jButton;
	}

	private JButton getJButtonVillagerDel() {

		JButton jButton = new JButton();
		jButton.setText("删除");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionDeleteVillager();
			}
		});

		return jButton;
	}

	private JButton getJButtonResetNormalID() {
		JButton jButton = new JButton();
		jButton.setText("重新生成有序ID号");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionResetVillagerId(jTableVillager);
			}
		});
		return jButton;
	}

	private JButton getJButtonResetBlackID() {
		JButton jButton = new JButton();
		jButton.setText("重新生成有序ID号");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionResetVillagerId(jTableVillagerTop1);
			}
		});
		return jButton;
	}

	private JButton getJButtonSaveToExcel0() {
			JButton jButtonSaveToExcel = new JButton();
			jButtonSaveToExcel.setText("导出银行信息");
			jButtonSaveToExcel
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							actionSaveToExcel0();
						}
					});
		return jButtonSaveToExcel;
	}
	
	/**
	 * 导出Excel
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonSaveToExcelNew() {
		if (jButtonSaveToExcel == null) {
			jButtonSaveToExcel = new JButton();
			jButtonSaveToExcel.setText("导出参保表（新表）");

			jButtonSaveToExcel
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
//							actionSaveToExcel();
							DataExportDialog1 ded = new DataExportDialog1(mCurrentThorp);
							
							ded.setDataType("a");
							ded.setVisible(true);
							
						}
					});
		}
		return jButtonSaveToExcel;
	}
	
	private JButton getJButtonSaveToExcelOld() {
		JButton jButtonSaveToExcel = new JButton();
			jButtonSaveToExcel.setText("导出参保表（旧表）");

			jButtonSaveToExcel
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
//							actionSaveToExcel();
							DataExportDialogOld ded = new DataExportDialogOld(mCurrentThorp);
							
							ded.setDataType("a");
							ded.setVisible(true);
							
						}
					});
		return jButtonSaveToExcel;
	}

	private JButton getJButtonSaveToExcel2() {
		if (jButtonSaveToExcel2 == null) {
			jButtonSaveToExcel2 = new JButton();
			jButtonSaveToExcel2.setText("导出黑名单到Excel");

			jButtonSaveToExcel2
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
//							actionSaveToExcel2();
							DataExportDialog1 ded = new DataExportDialog1(mCurrentThorp);
							ded.setDataType("b");
							ded.setVisible(true);
							
						}
					});
		}
		return jButtonSaveToExcel2;
	}

	private JScrollPane getJScrollPaneCenterLeft() {
		if (jScrollPaneCenterLeft == null) {
			jScrollPaneCenterLeft = new JScrollPane();
			jScrollPaneCenterLeft.setViewportView(getJPanelDataEdit());
			jScrollPaneCenterLeft.setAutoscrolls(true);
			jScrollPaneCenterLeft
					.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			jScrollPaneCenterLeft.setAlignmentY(100);
		}
		return jScrollPaneCenterLeft;
	}

	private JScrollPane getJScrollPaneCenterRightTop1() {

		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(getJTableVillagerTop1());

		jScrollPane.setAutoscrolls(true);
		jScrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		return jScrollPane;
	}

	private int isNeedBottom = 0;
	private JScrollPane getJScrollPaneCenterRight() {
		if (jScrollPaneCenterRight == null) {
			jScrollPaneCenterRight = new JScrollPane();
			jScrollPaneCenterRight.setViewportView(getJTableVillager());

			jScrollPaneCenterRight.setAutoscrolls(true);
			jScrollPaneCenterRight
					.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			jScrollPaneCenterRight.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {

	            public void adjustmentValueChanged(AdjustmentEvent evt) {
	                if(evt.getAdjustmentType() == AdjustmentEvent.TRACK && isNeedBottom <= 3) {
	                	jScrollPaneCenterRight.getVerticalScrollBar().setValue(jScrollPaneCenterRight.getVerticalScrollBar().getModel().getMaximum() - jScrollPaneCenterRight.getVerticalScrollBar().getModel().getExtent());
	                    isNeedBottom++;
	                }
	            }

	        });

		}
		return jScrollPaneCenterRight;
	}

	private JTable getJTableVillagerTop1() {
		if (jTableVillagerTop1 == null) {

			// 设置列标题(表头)
			// String[] columnName = {
			// "序号","姓名","性别","身份证号","民族","出生日期","现居住地址","开户银行","银行账户","本年缴费档次","人员类别","参保时间","档案存放位置","老农保帐户余额","参加老农保标志","户主姓名","户主身份证号","与户主间关系","文化程度","距60岁不足15年缴费标志","联系电话","婚姻状况","政治面貌","联系人","通讯地址","邮政编码","军转人员标志","劳动模范","社保账号","起领日期","状态","备注"};

			// mVillagerTableTitle.add(Villager.tab_v_id);
			// mVillagerTableTitle.add(Villager.tab_v_name);
			// mVillagerTableTitle.add(Villager.tab_v_sex );
			// mVillagerTableTitle.add(Villager.tab_v_ic );
			// mVillagerTableTitle.add(Villager.tab_v_nation );
			// mVillagerTableTitle.add(Villager.tab_v_birthday );
			// mVillagerTableTitle.add(Villager.tab_v_address_live );
			// mVillagerTableTitle.add(Villager.tab_v_bank_name );
			// mVillagerTableTitle.add(Villager.tab_v_bank_account );
			// mVillagerTableTitle.add(Villager.tab_v_capture_expend_calss );
			// mVillagerTableTitle.add(Villager.tab_v_type );
			// mVillagerTableTitle.add(Villager.tab_v_join_time );
			// mVillagerTableTitle.add(Villager.tab_v_archival_location );
			// mVillagerTableTitle.add(Villager.tab_v_old_balance );
			// mVillagerTableTitle.add(Villager.tab_v_old_balance_flag );
			// mVillagerTableTitle.add(Villager.tab_v_householder_name );
			// mVillagerTableTitle.add(Villager.tab_v_householder_ic );
			// mVillagerTableTitle.add(Villager.tab_v_householder_relation );
			// mVillagerTableTitle.add(Villager.tab_v_standard_culture );
			// mVillagerTableTitle.add(Villager.tab_v_60not_enough15_flag );
			// mVillagerTableTitle.add(Villager.tab_v_phone_num );
			// mVillagerTableTitle.add(Villager.tab_v_marital_status );
			// mVillagerTableTitle.add(Villager.tab_v_politics_status );
			// mVillagerTableTitle.add(Villager.tab_v_contact_name);
			// mVillagerTableTitle.add(Villager.tab_v_address_com);
			// mVillagerTableTitle.add(Villager.tab_v_address_zip_code );
			// mVillagerTableTitle.add(Villager.tab_v_soldie_flag );
			// mVillagerTableTitle.add(Villager.tab_v_model_worker );
			// mVillagerTableTitle.add(Villager.tab_v_social_security_num );
			// mVillagerTableTitle.add(Villager.tab_v_begin_get_date );
			// mVillagerTableTitle.add(Villager.tab_v_status );
			// mVillagerTableTitle.add(Villager.tab_v_mark );

			// 初始化表格

			DefaultTableModel model = new DefaultTableModel(mVillagerDataTop1,
					mVillagerTableTitle);
			jTableVillagerTop1 = new GppStyleTable(model) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionF5() {
					actionDeleteVillager();
					return true;
				};

				public boolean actionUp() {
					int rowS = jTableVillagerTop1.getSelectedRow();
					if (rowS > 0) {
						rowS--;
					}
					actionTableVillagerEdit(jTableVillagerTop1, rowS);

					return true;
				};

				public boolean actionDown() {
					int max = jTableVillagerTop1.getRowCount() - 1;
					int rowS = jTableVillagerTop1.getSelectedRow();
					if (rowS < max) {
						rowS++;
					}
					actionTableVillagerEdit(jTableVillagerTop1, rowS);

					return true;
				};

				public boolean actionLeft() {

					List<String> list = new ArrayList<String>();

					list.add(jComboBox_ic.getEditor().getItem().toString());

					if (updateVillager(list, "a")) {
						refreshTableVillager();
						refreshTableVillagerTop1();
					}
					return true;
				};

			};
			jTableVillagerTop1.setRowHeight(22);

			jTableVillagerTop1
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							// System.out.println("mouseClicked()"); // TODO
							// Auto-generated Event stub mouseClicked()
							int rowS = jTableVillagerTop1.getSelectedRow();
							actionTableVillagerEdit(jTableVillagerTop1, rowS);
							jLabelStatusInfo.setText(mStatusInfoTableBlack);
						}
					});

			refreshTableVillagerTop1();
		}
		return jTableVillagerTop1;
	}

	private JTable getJTableVillager() {
		if (jTableVillager == null) {

			// 设置列标题(表头)
			// String[] columnName = {
			// "序号","姓名","性别","身份证号","民族","出生日期","现居住地址","开户银行","银行账户","本年缴费档次","人员类别","参保时间","档案存放位置","老农保帐户余额","参加老农保标志","户主姓名","户主身份证号","与户主间关系","文化程度","距60岁不足15年缴费标志","联系电话","婚姻状况","政治面貌","联系人","通讯地址","邮政编码","军转人员标志","劳动模范","社保账号","起领日期","状态","备注"};
			mVillagerTableTitle.add("选择");
			mVillagerTableTitle.add(Villager.tab_v_id);
			mVillagerTableTitle.add(Villager.tab_v_name);
			mVillagerTableTitle.add(Villager.tab_v_sex);
			mVillagerTableTitle.add(Villager.tab_v_ic);
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
			
			if(jComboBox_name == null){
				getJPanelDataEdit();
			}
			//初始化表格对应的编辑框
			mTableColumeEdit.put(Villager.tab_v_name, jComboBox_name);
			mTableColumeEdit.put(Villager.tab_v_sex, jComboBox_sex);
			mTableColumeEdit.put(Villager.tab_v_ic, jComboBox_ic);
			mTableColumeEdit.put(Villager.tab_v_nation, jComboBox_nation);
			mTableColumeEdit.put(Villager.tab_v_birthday, jComboBox_birthday);
			mTableColumeEdit.put(Villager.tab_v_address_live, jComboBox_address_live);
			mTableColumeEdit.put(Villager.tab_v_bank_name, jComboBox_bank_name);
			mTableColumeEdit.put(Villager.tab_v_bank_account, jComboBox_bank_account);
			mTableColumeEdit.put(Villager.tab_v_bank_account_name, jComboBox_bank_account_name);
			mTableColumeEdit.put(Villager.tab_v_bank2_name, jComboBox_bank2_name);
			mTableColumeEdit.put(Villager.tab_v_bank2_account, jComboBox_bank2_account);
			mTableColumeEdit.put(Villager.tab_v_bank2_account_name, jComboBox_bank2_account_name);
			mTableColumeEdit.put(Villager.tab_v_capture_expend_calss, jComboBox_capture_expend_calss);
			mTableColumeEdit.put(Villager.tab_v_type, jComboBox_type);
			mTableColumeEdit.put(Villager.tab_v_join_time, jComboBox_join_time);
			mTableColumeEdit.put(Villager.tab_v_archival_location, jComboBox_archival_location);
			mTableColumeEdit.put(Villager.tab_v_old_balance, jComboBox_old_balance);
			mTableColumeEdit.put(Villager.tab_v_old_balance_flag, jComboBox_old_balance_flag);
			mTableColumeEdit.put(Villager.tab_v_householder_name, jComboBox_householder_name);
			mTableColumeEdit.put(Villager.tab_v_householder_ic, jComboBox_householder_ic);
			mTableColumeEdit.put(Villager.tab_v_householder_relation, jComboBox_householder_relation);
			mTableColumeEdit.put(Villager.tab_v_standard_culture, jComboBox_standard_culture);
			mTableColumeEdit.put(Villager.tab_v_60not_enough15_flag, jComboBox_60not_enough15_flag);
			mTableColumeEdit.put(Villager.tab_v_phone_num, jComboBox_phone_num);
			mTableColumeEdit.put(Villager.tab_v_marital_status, jComboBox_marital_status);
			mTableColumeEdit.put(Villager.tab_v_politics_status, jComboBox_politics_status);
			mTableColumeEdit.put(Villager.tab_v_contact_name, jComboBox_contact_name);
			mTableColumeEdit.put(Villager.tab_v_address_com, jComboBox_address_com);
			mTableColumeEdit.put(Villager.tab_v_address_zip_code, jComboBox_address_zip_code);
			mTableColumeEdit.put(Villager.tab_v_soldie_flag, jComboBox_soldie_flag);
			mTableColumeEdit.put(Villager.tab_v_model_worker, jComboBox_model_worker);
			mTableColumeEdit.put(Villager.tab_v_social_security_num, jComboBox_social_security_num);
			mTableColumeEdit.put(Villager.tab_v_begin_get_date, jComboBox_begin_get_date);
			mTableColumeEdit.put(Villager.tab_v_status, jComboBox_status);
			mTableColumeEdit.put(Villager.tab_v_mark, jComboBox_mark);
			mTableColumeEdit.put(Villager.tab_v_mark2, jComboBox_mark2);
			
			
			// 初始化表格
			mVillagerModel = new DefaultTableModel(mVillagerData,
					mVillagerTableTitle);
			jTableVillager = new GppStyleTable(mVillagerModel) {

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
					if (rowS > 0) {
						rowS--;
					}
					actionTableVillagerEdit(jTableVillager, rowS);

					return true;
				};

				public boolean actionDown() {
					int max = jTableVillager.getRowCount() - 1;
					int rowS = jTableVillager.getSelectedRow();
					if (rowS < max) {
						rowS++;
					}
					actionTableVillagerEdit(jTableVillager, rowS);

					return true;
				};

				public boolean actionRight() {
					List<String> list = new ArrayList<String>();

					list.add(jComboBox_ic.getEditor().getItem().toString());

					if (updateVillager(list, "b")) {
						refreshTableVillager();
						refreshTableVillagerTop1();
					}
					return true;
				};

			};
			jTableVillager.setRowHeight(22);

			jTableVillager.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
//					 System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					int rowS = jTableVillager.getSelectedRow();
					actionTableVillagerEdit(jTableVillager, rowS);
					jLabelStatusInfo.setText(mStatusInfoTableNormal);
				}
			});
			
			jTableVillager.getTableHeader().addMouseListener(new MouseListener() {
				boolean flag = false;
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					 if(flag){
						 //可能是拖动列了
						 refreshTableTitleOrder();
					 }
					 flag = false;
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					 flag = true;
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}
			});
			
			refreshTableVillager();
		}
		return jTableVillager;
	}

	private void refreshTableVillagerTop1() {
		try {
			if(mCurrentThorp == null){
				return;
			}
			List<Villager> list = mXXDB.getVillagerByThorp(
					mCurrentThorp.getT_id(), "b");

			mVillagerDataTop1.removeAllElements();
			for (Villager v : list) {
				mVillagerDataTop1.add(getVillagerVector(v));
			}

			DefaultTableModel model = new DefaultTableModel(mVillagerDataTop1,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillagerTop1).updateModel(model);

			jLabelVillagerBlackCount.setText("总数：" + list.size());
			jTableVillagerTop1.repaint();
			jTableVillagerTop1.updateUI();
		} catch (DBException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
	}

	private void refreshTableVillager() {
		try {
			
			if(mCurrentThorp == null){
				return;
			}
			List<Villager> list = mXXDB.getVillagerByThorp(
					mCurrentThorp.getT_id(), "a");

			mVillagerData.removeAllElements();
			for (Villager v : list) {
				mVillagerData.add(getVillagerVector(v));
			}

//			DefaultTableModel model = new DefaultTableModel(mVillagerData,
//					mVillagerTableTitle);
//			((GppStyleTable) jTableVillager).updateModel(model);
			mVillagerModel.setDataVector(mVillagerData, mVillagerTableTitle);
			jLabelVillagerNormalCount.setText("总数：" + list.size());
			
			jTableVillager.repaint();
			jTableVillager.updateUI();
			
			jTableVillager.scrollRectToVisible(jTableVillager.getCellRect(jTableVillager.getRowCount()-1,0,true));
			
		} catch (DBException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * 数据编辑面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelDataEdit() {
		if (jPanelDataEdit == null) {
			jPanelDataEdit = new JPanel();
			jPanelDataEdit.setLayout(new BoxLayout(jPanelDataEdit,
					BoxLayout.Y_AXIS));

			jComboBox_ic = new GppJComboBoxExp(DataDefultManager.getInstance()
					.getDefultData(Villager.tab_v_ic)) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public boolean actionEnter() {
					// TODO Auto-generated method stub
					super.actionEnter();
					
					String ic = getEditor().getItem().toString();

					selectEditVillager(ic);
					return true;
				}

			};

			jComboBox_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_name)){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public boolean actionEnter() {
					// TODO Auto-generated method stub
					super.actionEnter();
					String name = getEditor().getItem().toString();
					if(jComboBox_bank_account_name != null){
						jComboBox_bank_account_name.setSelectedItem(name);
					}
					
					if(jComboBox_bank2_account_name != null){
						jComboBox_bank2_account_name.setSelectedItem(name);
					}
					return true;
				}
			};
			jComboBox_sex = new GppJComboBoxExp(DataDefultManager.getInstance()
					.getDefultData(Villager.tab_v_sex));
			jComboBox_nation = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_nation));
			jComboBox_birthday = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_birthday));
			jComboBox_address_live = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_address_live));
			jComboBox_bank_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_name));
			jComboBox_bank_account = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_account));
			jComboBox_bank_account_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_account_name));
			jComboBox_bank2_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_name));
			jComboBox_bank2_account = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_account));
			jComboBox_bank2_account_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_account_name));
			jComboBox_capture_expend_calss = new GppJComboBoxExp(
					DataDefultManager.getInstance().getDefultData(
							Villager.tab_v_capture_expend_calss));
			jComboBox_type = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_type));
			jComboBox_join_time = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_join_time));
			jComboBox_archival_location = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(
							Villager.tab_v_archival_location));
			jComboBox_old_balance = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_old_balance));
			jComboBox_old_balance_flag = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(
							Villager.tab_v_old_balance_flag));
			jComboBox_householder_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(
							Villager.tab_v_householder_name));
			jComboBox_householder_ic = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_householder_ic));
			jComboBox_householder_relation = new GppJComboBoxExp(
					DataDefultManager.getInstance().getDefultData(
							Villager.tab_v_householder_relation));
			jComboBox_standard_culture = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(
							Villager.tab_v_standard_culture));
			jComboBox_60not_enough15_flag = new GppJComboBoxExp(
					DataDefultManager.getInstance().getDefultData(
							Villager.tab_v_60not_enough15_flag));
			jComboBox_phone_num = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_phone_num));
			jComboBox_marital_status = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_marital_status));
			jComboBox_politics_status = new GppJComboBoxExp(DataDefultManager
					.getInstance()
					.getDefultData(Villager.tab_v_politics_status));
			jComboBox_contact_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_contact_name));
			jComboBox_address_com = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_address_com));
			jComboBox_address_zip_code = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(
							Villager.tab_v_address_zip_code));
			jComboBox_soldie_flag = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_soldie_flag));
			jComboBox_model_worker = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_model_worker));
			jComboBox_social_security_num = new GppJComboBoxExp(
					DataDefultManager.getInstance().getDefultData(
							Villager.tab_v_social_security_num));
			jComboBox_begin_get_date = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_begin_get_date));
			jComboBox_status = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_status));
			jComboBox_mark = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_mark));
			jComboBox_mark2 = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_mark2));
			
			// 设置默认值为正常数据
			jComboBox_status.setSelectedItem("a");
			
			HashMap<String,Object> hashMap = new HashMap<String,Object>();
			hashMap.put(Villager.tab_v_name, jComboBox_name);
			hashMap.put(Villager.tab_v_sex, jComboBox_sex);
			hashMap.put(Villager.tab_v_birthday, jComboBox_birthday);
			hashMap.put(Villager.tab_v_address_live,
					jComboBox_address_live);
			hashMap.put(Villager.tab_v_nation, jComboBox_nation);
			hashMap.put(Villager.tab_v_bank_name,
					jComboBox_bank_name);
			hashMap.put(Villager.tab_v_bank_account,
					jComboBox_bank_account);
			hashMap.put(Villager.tab_v_bank_account_name,
					jComboBox_bank_account_name);
			hashMap.put(Villager.tab_v_bank2_name,
					jComboBox_bank2_name);
			hashMap.put(Villager.tab_v_bank2_account,
					jComboBox_bank2_account);
			hashMap.put(Villager.tab_v_bank2_account_name,
					jComboBox_bank2_account_name);
			hashMap.put(Villager.tab_v_capture_expend_calss,
					jComboBox_capture_expend_calss);
			hashMap.put(Villager.tab_v_type, jComboBox_type);
			hashMap.put(Villager.tab_v_join_time,
					jComboBox_join_time);
			hashMap.put(Villager.tab_v_archival_location,
					jComboBox_archival_location);
			hashMap.put(Villager.tab_v_old_balance,
					jComboBox_old_balance);
			hashMap.put(Villager.tab_v_old_balance_flag,
					jComboBox_old_balance_flag);
			hashMap.put(Villager.tab_v_householder_name,
					jComboBox_householder_name);
			hashMap.put(Villager.tab_v_householder_ic,
					jComboBox_householder_ic);
			hashMap.put(Villager.tab_v_householder_relation,
					jComboBox_householder_relation);
			hashMap.put(Villager.tab_v_standard_culture,
					jComboBox_standard_culture);
			hashMap.put(Villager.tab_v_60not_enough15_flag,
					jComboBox_60not_enough15_flag);
			hashMap.put(Villager.tab_v_phone_num,
					jComboBox_phone_num);
			hashMap.put(Villager.tab_v_marital_status,
					jComboBox_marital_status);
			hashMap.put(Villager.tab_v_politics_status,
					jComboBox_politics_status);
			hashMap.put(Villager.tab_v_contact_name,
					jComboBox_contact_name);
			hashMap.put(Villager.tab_v_address_com,
					jComboBox_address_com);
			hashMap.put(Villager.tab_v_address_zip_code,
					jComboBox_address_zip_code);
			hashMap.put(Villager.tab_v_soldie_flag,
					jComboBox_soldie_flag);
			hashMap.put(Villager.tab_v_model_worker,
					jComboBox_model_worker);
			hashMap.put(Villager.tab_v_social_security_num,
					jComboBox_social_security_num);
			hashMap.put(Villager.tab_v_begin_get_date,
					jComboBox_begin_get_date);
			hashMap.put(Villager.tab_v_mark, jComboBox_mark);
			hashMap.put(Villager.tab_v_mark2, jComboBox_mark2);

			jPanelDataEdit.add(getJPanelNew(Villager.tab_v_ic, jComboBox_ic),
					null);
			
			ArrayList<DefultData> list = DataDefultManager.getInstance().getEditOrder(hashMap);
			int size = list.size();
			for(int i=0;i<size;i++){
				DefultData dd = list.get(i);
				if(dd.getObj() instanceof GppJComboBoxExp){
					GppJComboBoxExp temp = (GppJComboBoxExp)dd.getObj();
					jPanelDataEdit.add(getJPanelNew(dd.getValuse(), temp),
							null);
					if(i==0){
						jComboBox_ic.setFocusetNext(temp);
						temp.setFocusetPre(jComboBox_ic);
					}else{
						DefultData ddP = list.get(i-1);
						GppJComboBoxExp tempP = (GppJComboBoxExp)ddP.getObj();
						tempP.setFocusetNext(temp);
						temp.setFocusetPre(tempP);
						
						if(i == size-1){
							//最后一个时，只向第一个
							temp.setFocusetNext(jComboBox_ic);
						}
					}
					
				}
				
			}
			
			
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_name, jComboBox_name), null);
//			jPanelDataEdit.add(getJPanelNew(Villager.tab_v_sex, jComboBox_sex),
//					null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_birthday, jComboBox_birthday),
//					null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_address_live,
//							jComboBox_address_live), null);
//			jPanelDataEdit
//					.add(getJPanelNew(Villager.tab_v_nation, jComboBox_nation),
//							null);
//			jPanelDataEdit
//					.add(getJPanelNew(Villager.tab_v_bank_name,
//							jComboBox_bank_name), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_bank_account,
//							jComboBox_bank_account), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_bank_account_name,
//							jComboBox_bank_account_name), null);
//			jPanelDataEdit
//			.add(getJPanelNew(Villager.tab_v_bank2_name,
//					jComboBox_bank2_name), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_bank2_account,
//							jComboBox_bank2_account), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_bank2_account_name,
//							jComboBox_bank2_account_name), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_capture_expend_calss,
//							jComboBox_capture_expend_calss), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_type, jComboBox_type), null);
//			jPanelDataEdit
//					.add(getJPanelNew(Villager.tab_v_join_time,
//							jComboBox_join_time), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_archival_location,
//							jComboBox_archival_location), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_old_balance,
//							jComboBox_old_balance), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_old_balance_flag,
//							jComboBox_old_balance_flag), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_householder_name,
//							jComboBox_householder_name), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_householder_ic,
//							jComboBox_householder_ic), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_householder_relation,
//							jComboBox_householder_relation), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_standard_culture,
//							jComboBox_standard_culture), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_60not_enough15_flag,
//							jComboBox_60not_enough15_flag), null);
//			jPanelDataEdit
//					.add(getJPanelNew(Villager.tab_v_phone_num,
//							jComboBox_phone_num), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_marital_status,
//							jComboBox_marital_status), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_politics_status,
//							jComboBox_politics_status), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_contact_name,
//							jComboBox_contact_name), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_address_com,
//							jComboBox_address_com), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_address_zip_code,
//							jComboBox_address_zip_code), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_soldie_flag,
//							jComboBox_soldie_flag), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_model_worker,
//							jComboBox_model_worker), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_social_security_num,
//							jComboBox_social_security_num), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_begin_get_date,
//							jComboBox_begin_get_date), null);
//			// jPanelDataEdit.add(getJPanelNew(Villager.tab_v_status,jComboBox_status),
//			// null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_mark, jComboBox_mark), null);
//			jPanelDataEdit.add(
//					getJPanelNew(Villager.tab_v_mark2, jComboBox_mark2), null);
			
			// 设置Enter键顺序
//			jComboBox_ic.setFocusetNext(jComboBox_name);
//			jComboBox_name.setFocusetNext(jComboBox_sex);
//			jComboBox_sex.setFocusetNext(jComboBox_birthday);
//			jComboBox_birthday.setFocusetNext(jComboBox_address_live);
//			jComboBox_address_live.setFocusetNext(jComboBox_nation);
//			jComboBox_nation.setFocusetNext(jComboBox_bank_name);
//			jComboBox_bank_name.setFocusetNext(jComboBox_bank_account);
//			jComboBox_bank_account
//					.setFocusetNext(jComboBox_bank_account_name);
//			jComboBox_bank_account_name
//				.setFocusetNext(jComboBox_bank2_name);
//			jComboBox_bank2_name.setFocusetNext(jComboBox_bank2_account);
//			jComboBox_bank2_account
//					.setFocusetNext(jComboBox_bank2_account_name);
//			jComboBox_bank2_account_name
//				.setFocusetNext(jComboBox_capture_expend_calss);
//			
//			jComboBox_capture_expend_calss.setFocusetNext(jComboBox_type);
//			jComboBox_type.setFocusetNext(jComboBox_join_time);
//			jComboBox_join_time.setFocusetNext(jComboBox_archival_location);
//			jComboBox_archival_location.setFocusetNext(jComboBox_old_balance);
//			jComboBox_old_balance.setFocusetNext(jComboBox_old_balance_flag);
//			jComboBox_old_balance_flag
//					.setFocusetNext(jComboBox_householder_name);
//			jComboBox_householder_name.setFocusetNext(jComboBox_householder_ic);
//			jComboBox_householder_ic
//					.setFocusetNext(jComboBox_householder_relation);
//			jComboBox_householder_relation
//					.setFocusetNext(jComboBox_standard_culture);
//			jComboBox_standard_culture
//					.setFocusetNext(jComboBox_60not_enough15_flag);
//			jComboBox_60not_enough15_flag.setFocusetNext(jComboBox_phone_num);
//			jComboBox_phone_num.setFocusetNext(jComboBox_marital_status);
//			jComboBox_marital_status.setFocusetNext(jComboBox_politics_status);
//			jComboBox_politics_status.setFocusetNext(jComboBox_contact_name);
//			jComboBox_contact_name.setFocusetNext(jComboBox_address_com);
//			jComboBox_address_com.setFocusetNext(jComboBox_address_zip_code);
//			jComboBox_address_zip_code.setFocusetNext(jComboBox_soldie_flag);
//			jComboBox_soldie_flag.setFocusetNext(jComboBox_model_worker);
//			jComboBox_model_worker
//					.setFocusetNext(jComboBox_social_security_num);
//			jComboBox_social_security_num
//					.setFocusetNext(jComboBox_begin_get_date);
//			jComboBox_begin_get_date.setFocusetNext(jComboBox_mark);
//			// jComboBox_status.setFocusetNext(jComboBox_mark);
//			jComboBox_mark.setFocusetNext(jComboBox_mark2);
//			jComboBox_mark2.setFocusetNext(jComboBox_ic);
//			
//			// 设置Esc键顺序
//			jComboBox_name.setFocusetPre(jComboBox_ic);
//			jComboBox_sex.setFocusetPre(jComboBox_name);
//			jComboBox_birthday.setFocusetPre(jComboBox_sex);
//			jComboBox_address_live.setFocusetPre(jComboBox_birthday);
//			jComboBox_nation.setFocusetPre(jComboBox_address_live);
//			jComboBox_bank_name.setFocusetPre(jComboBox_nation);
//			jComboBox_bank_account.setFocusetPre(jComboBox_bank_name);
//			jComboBox_bank_account_name.setFocusetPre(jComboBox_bank_account);
//			jComboBox_bank2_name.setFocusetPre(jComboBox_bank_account_name);
//			jComboBox_bank2_account.setFocusetPre(jComboBox_bank2_name);
//			jComboBox_bank2_account_name.setFocusetPre(jComboBox_bank2_account);
//			jComboBox_capture_expend_calss
//					.setFocusetPre(jComboBox_bank2_account_name);
//			jComboBox_type.setFocusetPre(jComboBox_capture_expend_calss);
//			jComboBox_join_time.setFocusetPre(jComboBox_type);
//			jComboBox_archival_location.setFocusetPre(jComboBox_join_time);
//			jComboBox_old_balance.setFocusetPre(jComboBox_archival_location);
//			jComboBox_old_balance_flag.setFocusetPre(jComboBox_old_balance);
//			jComboBox_householder_name
//					.setFocusetPre(jComboBox_old_balance_flag);
//			jComboBox_householder_ic.setFocusetPre(jComboBox_householder_name);
//			jComboBox_householder_relation
//					.setFocusetPre(jComboBox_householder_ic);
//			jComboBox_standard_culture
//					.setFocusetPre(jComboBox_householder_relation);
//			jComboBox_60not_enough15_flag
//					.setFocusetPre(jComboBox_standard_culture);
//			jComboBox_phone_num.setFocusetPre(jComboBox_60not_enough15_flag);
//			jComboBox_marital_status.setFocusetPre(jComboBox_phone_num);
//			jComboBox_politics_status.setFocusetPre(jComboBox_marital_status);
//			jComboBox_contact_name.setFocusetPre(jComboBox_politics_status);
//			jComboBox_address_com.setFocusetPre(jComboBox_contact_name);
//			jComboBox_address_zip_code.setFocusetPre(jComboBox_address_com);
//			jComboBox_soldie_flag.setFocusetPre(jComboBox_address_zip_code);
//			jComboBox_model_worker.setFocusetPre(jComboBox_soldie_flag);
//			jComboBox_social_security_num.setFocusetPre(jComboBox_model_worker);
//			jComboBox_begin_get_date
//					.setFocusetPre(jComboBox_social_security_num);
//			// jComboBox_status.setFocusetPre(jComboBox_begin_get_date);
//			jComboBox_mark.setFocusetPre(jComboBox_begin_get_date);
//			jComboBox_mark2.setFocusetPre(jComboBox_mark);

		}
		return jPanelDataEdit;
	}

	private List<Checkbox> listCheckbox = new ArrayList<Checkbox>();

	private CheckboxGroup mCheckboxGroup = new CheckboxGroup();

	private HashMap<String, Boolean> mDefultEditShow = DataDefultManager
			.getInstance().getmDefultEditShow();

	/**
	 * 获取新的面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelNew(String tab, final JComboBox jComboBox) {

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		// 上边距，左边距，下边距，右边距
		jPanel.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		boolean flagPop = mDefultEditShow.get(tab);
		final GJCheckBox gcb = new GJCheckBox(tab, flagPop);
		gcb.setHorizontalAlignment(SwingConstants.RIGHT);
		gcb.setPreferredSize(new Dimension(150, 25));

		if (jComboBox instanceof GppJComboBoxExp) {
			((GppJComboBoxExp) jComboBox).setAutoPopup(flagPop);
		}
		gcb.addItemListener(new java.awt.event.ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(gcb.getText()+"=-="+e.getStateChange());
				if (jComboBox instanceof GppJComboBoxExp) {
					if (e.getStateChange() == 1) {
						((GppJComboBoxExp) jComboBox).setAutoPopup(true);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "1");
						DataDefultManager.getmGppConfigurationIni().saveFile();
					} else {
						((GppJComboBoxExp) jComboBox).setAutoPopup(false);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "0");
						DataDefultManager.getmGppConfigurationIni().saveFile();
					}

				}
			}

		});

		jPanel.add(gcb, null);
		jPanel.add(jComboBox, null);
		// jPanel.add(jPanel2,null);
		return jPanel;
	}

	class GppJComboBoxExp extends GJComboBox {

		private GppJComboBoxExp mFocuseNext = null;

		private GppJComboBoxExp mFocusePre = null;

		private List<DefultData> mDefData = null;

		private boolean isAutoPopup = false;
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public GppJComboBoxExp(List<DefultData> data) {
			super();
			this.setEditable(true);
			mDefData = data;
			init();
		}

		private void init() {
			if (mDefData != null) {
				for (DefultData d : mDefData) {
					addItem(d);
				}
			}
			setSelectedItem("");

			Component[] comps = this.getComponents();
			for (int i = 0; i < comps.length; i++) {

				if (comps[i] instanceof com.jgoodies.looks.common.ComboBoxEditorTextField) {
					comps[i].addFocusListener(new FocusListener() {

						@Override
						public void focusLost(FocusEvent e) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void focusGained(FocusEvent e) {
							// TODO Auto-generated method stub
							jLabelStatusInfo.setText(mStatusInfoEdit);
							if (GppJComboBoxExp.this == jComboBox_ic) {
								JScrollBar sBar = jScrollPaneCenterLeft
										.getVerticalScrollBar();
								sBar.setValue(0);
							}
							if (isAutoPopup) {
								GppJComboBoxExp.this.showPopup();
							}

						}
					});
				}

			}

			updateGppKeyListener();
		}

		@Override
		public boolean actionUp() {
			// TODO Auto-generated method stub
			// 滚动到指定位置
			Point p = this.getParent().getLocation();

			// 获取JScrollPane中的纵向JScrollBar
			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();

			// 设置滚动到button[12]所在位置
			sBar.setValue(p.y - 75);

			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionUp();
		}

		@Override
		public boolean actionDown() {
			// TODO Auto-generated method stub
			// 滚动到指定位置
			Point p = this.getParent().getLocation();

			// 获取JScrollPane中的纵向JScrollBar
			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();

			// 设置滚动到button[12]所在位置

			int offset = jScrollPaneCenterLeft.getHeight() - p.y;
			if (offset < 70) {
				sBar.setValue(p.y - 400);
			}

			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return super.actionDown();
		}

		@Override
		public boolean actionEnter() {

			Object obj = this.getEditor().getItem();

			if (obj instanceof DefultData) {
				// 使用对象替换值
				this.setSelectedItem(((DefultData) obj).getValuse());
			} else {
				boolean flag = false;
				for (DefultData d : mDefData) {
					if (d.getKey().equals(obj)) {
						// 使用关键字替换值
						this.setSelectedItem((d).getValuse());
						flag = true;
					}
				}

				if (!flag) {
					// 都不满足时，使用原本数据
					String str = obj.toString();
					if (!str.equals("")) {
						int i = str.indexOf(".");
						if (i > 0) {
							String pre = str.substring(0, i);
							String suffixal = str.substring(i + 1);

							for (DefultData d : mDefData) {
								if (d.getKey().equals(pre)) {
									// 使用关键字替换值
									this.setSelectedItem((d).getValuse()
											+ suffixal);
									flag = true;
								}
							}
						}
					}

					if (!flag) {
						this.setSelectedItem(obj);
					}

				}
			}
			
			if(!checkDataInput(this)){
				//输入的字符非法
				
				return false;
			}

			// 滚动到指定位置
			Point p = this.getParent().getLocation();

			// 获取JScrollPane中的纵向JScrollBar
			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
			System.out.println(jScrollPaneCenterLeft.getHeight() + ":" + p.y
					+ ":" + sBar.getY());
			// 设置滚动到button[12]所在位置

			int offset = jScrollPaneCenterLeft.getHeight() - p.y;
			if (offset < 70) {
				sBar.setValue(p.y - 400);
			}

			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return true;
		}

		@Override
		public boolean actionEscape() {
			// 滚动到指定位置
			Point p = this.getParent().getLocation();

			// 获取JScrollPane中的纵向JScrollBar
			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();

			// 设置滚动到button[12]所在位置
			sBar.setValue(p.y - 75);

			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionEscape();
		}

		
		@Override
		public boolean actionF1() {
			// TODO Auto-generated method stub
			actionAddVillager();
			return super.actionF1();
		}

		@Override
		public boolean actionF2() {
			// TODO Auto-generated method stub
			actionUpdateVillager();
			return super.actionF2();
		}

		@Override
		public boolean actionF3() {
			// TODO Auto-generated method stub
			actionEditReset();
			return super.actionF3();
		}

		@Override
		public boolean actionF4() {
			// TODO Auto-generated method stub
			actionEditClear();
			return super.actionF4();
		}

		@Override
		public boolean actionF5() {
			// TODO Auto-generated method stub
			actionDeleteVillager();
			return super.actionF5();
		}
		
		@Override
		public boolean actionF11() {
			// TODO Auto-generated method stub
			actionUpdateVillager();
			return super.actionF2();
		}
		
		@Override
		public boolean actionF12() {
			// TODO Auto-generated method stub
			actionAddVillager();
			return true;
		}

		@Override
		public boolean actionKey(int keyCode) {
			// TODO Auto-generated method stub
			System.out.println(keyCode);
			if (keyCode == 34) {
				// pageDown
				
				actionUpdateVillager();
			} else if (keyCode == 33) {
				// pageUp
				
			} else if (keyCode == 36) {
				// Home
			} else if (keyCode == 35) {
				// end
				//使用上一个银行信息
					if(mBankAccount != null && !"".equals(mBankAccount)){
						jComboBox_bank_account.setSelectedItem(mBankAccount);
					}
					
					if(mBankAccountName != null && !"".equals(mBankAccountName)){
						jComboBox_bank_account_name.setSelectedItem(mBankAccountName);
					}
			} else if (keyCode == 107) {
				// 加号键
				actionUpdateVillager();
			}

			return false;
		}

		public void setFocusetNext(GppJComboBoxExp next) {
			mFocuseNext = next;
		}

		public void setFocusetPre(GppJComboBoxExp pre) {
			mFocusePre = pre;
		}

		public boolean isAutoPopup() {
			return isAutoPopup;
		}

		public void setAutoPopup(boolean isAutoPopup) {
			this.isAutoPopup = isAutoPopup;
		}
	}
	
	/**
	 * 检查数据是否合法
	 * @version 2012-4-12
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	private boolean checkDataInput(GppJComboBoxExp gjcbe){
		
		boolean flag = true;
		String valuse = gjcbe.getSelectedItem().toString();
		
		if(gjcbe == jComboBox_birthday || 
				gjcbe == jComboBox_begin_get_date || 
				gjcbe == jComboBox_join_time){
			
			if(Tools.isContainsChinese(valuse)){
				
				String tempMSG = "您输入的日期含有中文字，请重新输入";
				
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				flag = false;
			}
			
			
		}else{
			if(!Tools.checkStringLegal(valuse)){
				
				String tempMSG = "您输入的信息含有 ：\"-\" 和 \"+\"两个非法字符";
				
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				flag = false;
			}
		}
		
		return flag;
	}

	private void selectEditVillager(String v_ic) {

		if (v_ic != null && v_ic.length() == 18 && v_ic.charAt(17) == 'x') {
			// 将身份证最后一位小写x转为大写X
			v_ic = v_ic.subSequence(0, 17) + "X";
		}

		
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(v_ic);
			if (!"".equals(ic_msg)) {
				String tempMSG = ic_msg;
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();
				return;
			}
			
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}

		try {
			if(mXXDB.isExistVillagerError(v_ic)){
				//是黑名单数据
				String[][] arr = mXXDB.getVillagerErrorAll2(v_ic);
				String tempMSG = "";
				if(arr!=null && arr[0] != null){
					
					tempMSG = "该身份证号（"+v_ic+"）姓名（"+arr[0][1]+"）黑名单类型（"+arr[0][2]+"）属于黑名单数据，请重新输入！";
				}else{
					tempMSG = "该身份证号（"+v_ic+"）属于黑名单数据，请重新输入！";
				}
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();
				return;
			}
			
			if (mXXDB.isExistVillager(v_ic)) {
				mCurrentVillager = mXXDB.getVillagerByIc(v_ic);
				
				if(mXXDB.isExistThorp(mCurrentVillager.getT_id()) && mCurrentVillager.getT_id() != mCurrentThorp.getT_id()){
					//转移档案信息
					Thorp th = mXXDB.getThorpById(mCurrentVillager.getT_id());
					
					String tempMSG = mCurrentVillager.getV_name()+" 的信息当前是在 "+th.getT_name()+" 中，您是否需要将"+mCurrentVillager.getV_name()+" 转移到 "+mCurrentThorp.getT_name()+"？\r\n 需要转移则请编辑后进行保存，不需要转移则不用保存！";

					Toolkit.getDefaultToolkit().beep();
					int option = JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);

					if(option == JOptionPane.OK_OPTION){
						//确认
						clearEditVillager(false, true);
					}else{
						
					}
				}else{
					clearEditVillager(false, true);
				}
				
//				if(mCurrentVillager.getV_householder_ic() == null || "".equals(mCurrentVillager.getV_householder_ic())){
//					jComboBox_householder_ic.setSelectedItem(v_ic);
//				}
			} else {
				// 数据库中不存在该身份证号码
				String tempMSG = "数据库中不存在该身份证号码，是否创建一个新的档案？";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);

				clearEditVillager(false, false);
				jComboBox_ic.setSelectedItem(v_ic);
				
				//默认户主身份证相同
//				jComboBox_householder_ic.setSelectedItem(v_ic);
			}

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	/**
	 * 执行增加
	 * 
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionAddVillager() {

		String ic = jComboBox_ic.getEditor().getItem().toString();

		try {

			if (ic == null || "".equals(ic)) {
				String tempMSG = "该身份证号不能为空，请重新输入！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			if (mXXDB.isExistVillager(ic)) {
				String tempMSG = "该身份证号（" + ic + "）已经存在系统中，请重新输入！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			Villager tempVillager = putCurrentVillager();
			String cheak = cheakData(tempVillager);
			if (cheak != null) {
				// 数据不合法
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, cheak, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);

			} else {
				// 数据合法
				if (mXXDB.insertVillager(tempVillager)) {
					// 插入成功
					String tempMSG = "数据（" + tempVillager.getV_ic()
							+ "）新增成功！";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
					clearEditVillager(false, false);
					jComboBox_ic.requestFocus();
					jScrollPaneCenterLeft.getVerticalScrollBar().setValue(0);
					refreshTableVillager();
					mCurrentVillager = tempVillager;
					mBankAccount = mCurrentVillager.getV_bank_account();
					mBankAccountName = mCurrentVillager.getV_bank_account_name();

				} else {
					// 插入失败
					String tempMSG = "数据保存失败！";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				}
			}

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

	}

	private void actionUpdateVillager() {

		if (mCurrentVillager.getT_id() != mCurrentThorp.getT_id()) {
			// 转移村
			actionUpdateVillager(true);
			return;
		}

		actionUpdateVillager(false);
	}

	/**
	 * 执行修改
	 * 
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionUpdateVillager(boolean isNewId) {

		try {

			Villager tempVillager = putCurrentVillager();

			if (tempVillager.getV_ic() == null
					|| "".equals(tempVillager.getV_ic())) {
				String tempMSG = "该身份证号不能为空，请重新输入！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			boolean flagAdd = false;
			if (!mXXDB.isExistVillager(tempVillager.getV_ic())) {
//				String tempMSG = "该身份证号（" + tempVillager.getV_ic()
//						+ "）不存在系统中，请先添加！";
//				//声音提示
//				Toolkit.getDefaultToolkit().beep();
//				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
//						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
//				jComboBox_ic.requestFocus();
//
//				return;
				flagAdd = true;
			}

			String cheak = cheakData(tempVillager);
			if (cheak != null) {
				// 数据不合法
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, cheak, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			} else {
				// 数据合法
				if(flagAdd){
					if (mXXDB.insertVillager(tempVillager)) {
						// 插入成功
						String tempMSG = "数据（" + tempVillager.getV_ic()
								+ "）保存成功！";
						//声音提示
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
								JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
						clearEditVillager(false, false);
						jComboBox_ic.requestFocus();
						jScrollPaneCenterLeft.getVerticalScrollBar().setValue(0);
						refreshTableVillager();
						mCurrentVillager = tempVillager;
						mBankAccount = mCurrentVillager.getV_bank_account();
						mBankAccountName = mCurrentVillager.getV_bank_account_name();

					} else {
						// 插入失败
						String tempMSG = "数据保存失败！";
						//声音提示
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
								JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
					}
					return;
				}
				
				tempVillager.setV_id(mCurrentVillager.getV_id());
				System.out.println("========"+tempVillager.getV_id());
				if (mXXDB.updateVillager(tempVillager,isNewId)) {
					// 更新成功
					String tempMSG = "数据（" + tempVillager.getV_ic()
							+ "）保存到：" + mCurrentThorp.getT_name() + "修改成功！";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
					// clearEditVillager(false,false);
					jComboBox_ic.requestFocus();
					jScrollPaneCenterLeft.getVerticalScrollBar().setValue(0);
					refreshTableVillager();
					
					mCurrentVillager = tempVillager;
					mBankAccount = mCurrentVillager.getV_bank_account();
					mBankAccountName = mCurrentVillager.getV_bank_account_name();
//					mBank2Account = mCurrentVillager.getV_bank2_account();
//					mBank2AccountName = mCurrentVillager.getV_bank2_account_name();
					
				} else {
					// 更新失败
					String tempMSG = "数据修改失败！";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				}
			}

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 执行删除
	 * 
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionDeleteVillager() {

		try {

			final Villager tempVillager = putCurrentVillager();

			if (tempVillager.getV_ic() == null
					|| "".equals(tempVillager.getV_ic())) {
				String tempMSG = "该身份证号不能为空，请重新输入！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			if (!mXXDB.isExistVillager(tempVillager.getV_ic())) {
				String tempMSG = "您要删除的身份证号（" + tempVillager.getV_ic()
						+ "）已经不存在系统中！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			String tempMSG = "是否确认删除:" + tempVillager.getV_name() + "=>"
					+ tempVillager.getV_ic() + " 的档案？";
			MessageDialog gmd = new MessageDialog(this) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				protected void actionFinish(int option) {
					// TODO Auto-generated method stub

					super.actionFinish(option);
					if (option == MessageDialog.YES_OPTION) {
						// 确认删除
						try {
							mXXDB.deleteVillager(tempVillager.getV_ic());
							
						} catch (DBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						clearEditVillager(false, false);
						jComboBox_ic.requestFocus();
						jScrollPaneCenterLeft.getVerticalScrollBar()
								.setValue(0);
						refreshTableVillager();
						refreshTableVillagerTop1();
					}
				}
			};
			gmd.setTitle("系统提示");
			gmd.setModal(true);
			gmd.setMessage(tempMSG);
			gmd.setVisible(true);

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 执行编辑框重设默认值
	 * 
	 * @author 李锦华
	 * @since:2011-11-16
	 */
	private void actionEditReset() {
		clearEditVillager(false, false);
	}

	/**
	 * 执行编辑框清空
	 * 
	 * @author 李锦华
	 * @since:2011-11-16
	 */
	private void actionEditClear() {
		clearEditVillager(true, false);
	}

	/**
	 * 检测数据合法性
	 * 
	 * @version 2011-11-15
	 * @author Jason
	 * @param
	 * @return String null表示合法，否则是错误信息
	 */
	private String cheakData(Villager villager) {
		String vic = villager.getV_ic();
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(vic);
			if (!"".equals(ic_msg)) {
				return "身份证号码不合法，"+ic_msg;
			}
			
			if(!"".equals(villager.getV_householder_ic())){
				ic_msg = IDNumberChecker.IDCardValidate(villager.getV_householder_ic());
				if (!"".equals(ic_msg)) {
					return "户主身份证号码不合法，"+ic_msg;
				}
			}
			
			
			String temMSG = checkBankAccount(villager.getV_bank_account());
			if(null != temMSG){
				
					return temMSG;
				
			}
			
			temMSG = checkBankAccount(villager.getV_bank2_account());
			if(null != temMSG){
				
					return temMSG;
				
			}
			
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		return null;
	}

	private String checkBankAccount(String bankAccount){
		if(bankAccount != null && !"".equals(bankAccount) ){
			System.out.println("bankAccount.length():"+bankAccount.length());
			if(bankAccount.length() != 16 && bankAccount.length() != 18 && bankAccount.length() != 19){
				return "银行账号必须为16位或18位或19位！";
			}
		}
		
		return null;
	}
	private Villager putCurrentVillager() {
		Villager tempVillager = new Villager();
		tempVillager.setV_ic(jComboBox_ic.getEditor().getItem().toString());
		tempVillager.setT_id(mCurrentThorp.getT_id());
		tempVillager.setV_name(jComboBox_name.getEditor().getItem()
				.toString());
		tempVillager.setV_sex(jComboBox_sex.getEditor().getItem()
				.toString());
		tempVillager.setV_nation(jComboBox_nation.getEditor().getItem()
				.toString());
		tempVillager.setV_birthday(jComboBox_birthday.getEditor().getItem()
				.toString());
		tempVillager.setV_address_live(jComboBox_address_live.getEditor()
				.getItem().toString());
		tempVillager.setV_bank_name(jComboBox_bank_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank_account(jComboBox_bank_account.getEditor()
				.getItem().toString());
		tempVillager.setV_bank_account_name(jComboBox_bank_account_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_name(jComboBox_bank2_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_account(jComboBox_bank2_account.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_account_name(jComboBox_bank2_account_name.getEditor()
				.getItem().toString());
		tempVillager
				.setV_capture_expend_calss(jComboBox_capture_expend_calss
						.getEditor().getItem().toString());
		tempVillager.setV_type(jComboBox_type.getEditor().getItem()
				.toString());
		tempVillager.setV_join_time(jComboBox_join_time.getEditor()
				.getItem().toString());
		tempVillager.setV_archival_location(jComboBox_archival_location
				.getEditor().getItem().toString());
		tempVillager.setV_old_balance(jComboBox_old_balance.getEditor()
				.getItem().toString());
		tempVillager.setV_old_balance_flag(jComboBox_old_balance_flag
				.getEditor().getItem().toString());
		tempVillager.setV_householder_name(jComboBox_householder_name
				.getEditor().getItem().toString());
		tempVillager.setV_householder_ic(jComboBox_householder_ic
				.getEditor().getItem().toString());
		tempVillager
				.setV_householder_relation(jComboBox_householder_relation
						.getEditor().getItem().toString());
		tempVillager.setV_standard_culture(jComboBox_standard_culture
				.getEditor().getItem().toString());
		tempVillager.setV_60not_enough15_flag(jComboBox_60not_enough15_flag
				.getEditor().getItem().toString());
		tempVillager.setV_phone_num(jComboBox_phone_num.getEditor()
				.getItem().toString());
		tempVillager.setV_marital_status(jComboBox_marital_status
				.getEditor().getItem().toString());
		tempVillager.setV_politics_status(jComboBox_politics_status
				.getEditor().getItem().toString());
		tempVillager.setV_contact_name(jComboBox_contact_name.getEditor()
				.getItem().toString());
		tempVillager.setV_address_com(jComboBox_address_com.getEditor()
				.getItem().toString());
		tempVillager.setV_address_zip_code(jComboBox_address_zip_code
				.getEditor().getItem().toString());
		tempVillager.setV_soldie_flag(jComboBox_soldie_flag.getEditor()
				.getItem().toString());
		tempVillager.setV_model_worker(jComboBox_model_worker.getEditor()
				.getItem().toString());
		tempVillager.setV_social_security_num(jComboBox_social_security_num
				.getEditor().getItem().toString());
		tempVillager.setV_begin_get_date(jComboBox_begin_get_date
				.getEditor().getItem().toString());
		tempVillager.setV_status(jComboBox_status.getEditor().getItem()
				.toString());
		tempVillager.setV_mark(jComboBox_mark.getEditor().getItem()
				.toString());
		tempVillager.setV_mark2(jComboBox_mark2.getEditor().getItem()
				.toString());
		return tempVillager;
	}

	/**
	 * 清空编辑的居民数据
	 * 
	 * @version 2011-11-15
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void clearEditVillager(boolean clearEmpty,
			boolean fromCurrentVillager) {

		initEditComboBox(jComboBox_ic, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_ic());
		initEditComboBox(jComboBox_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_name());
		initEditComboBox(jComboBox_sex, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_sex());
		initEditComboBox(jComboBox_birthday, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_birthday());
		initEditComboBox(jComboBox_address_live, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_address_live());
		initEditComboBox(jComboBox_nation, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_nation());
		initEditComboBox(jComboBox_bank_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_bank_name());
		initEditComboBox(jComboBox_bank_account, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank_account());
		initEditComboBox(jComboBox_bank_account_name, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank_account_name());
		initEditComboBox(jComboBox_bank2_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_bank2_name());
		initEditComboBox(jComboBox_bank2_account, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank2_account());
		initEditComboBox(jComboBox_bank2_account_name, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank2_account_name());
		initEditComboBox(jComboBox_capture_expend_calss, clearEmpty,
				fromCurrentVillager,
				mCurrentVillager.getV_capture_expend_calss());
		initEditComboBox(jComboBox_type, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_type());
		initEditComboBox(jComboBox_join_time, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_join_time());
		initEditComboBox(jComboBox_archival_location, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_archival_location());
		initEditComboBox(jComboBox_old_balance, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_old_balance());
		initEditComboBox(jComboBox_old_balance_flag, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_old_balance_flag());
		initEditComboBox(jComboBox_householder_name, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_householder_name());
		initEditComboBox(jComboBox_householder_ic, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_householder_ic());
		initEditComboBox(jComboBox_householder_relation, clearEmpty,
				fromCurrentVillager,
				mCurrentVillager.getV_householder_relation());
		initEditComboBox(jComboBox_standard_culture, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_standard_culture());
		initEditComboBox(jComboBox_60not_enough15_flag, clearEmpty,
				fromCurrentVillager,
				mCurrentVillager.getV_60not_enough15_flag());
		initEditComboBox(jComboBox_phone_num, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_phone_num());
		initEditComboBox(jComboBox_marital_status, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_marital_status());
		initEditComboBox(jComboBox_politics_status, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_politics_status());
		initEditComboBox(jComboBox_contact_name, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_contact_name());
		initEditComboBox(jComboBox_address_com, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_address_com());
		initEditComboBox(jComboBox_address_zip_code, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_address_zip_code());
		initEditComboBox(jComboBox_soldie_flag, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_soldie_flag());
		initEditComboBox(jComboBox_model_worker, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_model_worker());
		initEditComboBox(jComboBox_social_security_num, clearEmpty,
				fromCurrentVillager,
				mCurrentVillager.getV_social_security_num());
		initEditComboBox(jComboBox_begin_get_date, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_begin_get_date());
		// initEditComboBox(jComboBox_status,clearEmpty);
		initEditComboBox(jComboBox_mark, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_mark());
		initEditComboBox(jComboBox_mark2, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_mark2());
		mCurrentVillager = new Villager();
	}

	private void initEditComboBox(JComboBox jb, boolean clearEmpty,
			boolean fromCurrentVillager, String values) {

		if (fromCurrentVillager && values != null && !"".equals(values)) {
			jb.setSelectedItem(values);
			return;
		}

		if (clearEmpty) {
			jb.setSelectedItem("");
			return;
		}

		if (jb.getItemCount() > 0) {
			DefultData dd = (DefultData) jb.getItemAt(0);
			jb.setSelectedItem(dd.getValuse());
		} else {
			jb.setSelectedItem("");
		}
	}

	private Vector<Object> getVillagerVector(Villager v) {
		Vector<Object> rowdata = new Vector<Object>(33);
		
		int size = mVillagerTableTitle.size();
		for(int i =0;i<size;i++){
			String cname = mVillagerTableTitle.get(i);
			if("选择".equals(cname)){
				rowdata.add(Boolean.FALSE);
			}else if(Villager.tab_v_id.equals(cname)){
				rowdata.add("" + v.getV_id());
			}else if(Villager.tab_v_name.equals(cname)){
				rowdata.add(v.getV_name());
			}else if(Villager.tab_v_sex.equals(cname)){
				rowdata.add(v.getV_sex());
			}else if(Villager.tab_v_ic.equals(cname)){
				rowdata.add(v.getV_ic());
				
			}else if(Villager.tab_v_nation.equals(cname)){
				rowdata.add(v.getV_nation());
				
			}else if(Villager.tab_v_birthday.equals(cname)){
				rowdata.add(v.getV_birthday());
				
			}else if(Villager.tab_v_address_live.equals(cname)){
				rowdata.add(v.getV_address_live());
				
			}else if(Villager.tab_v_bank_name.equals(cname)){
				rowdata.add(v.getV_bank_name());
				
			}else if(Villager.tab_v_bank_account.equals(cname)){
				rowdata.add(v.getV_bank_account());
				
			}else if(Villager.tab_v_bank_account_name.equals(cname)){
				rowdata.add(v.getV_bank_account_name());
				
			}else if(Villager.tab_v_bank2_name.equals(cname)){
				rowdata.add(v.getV_bank2_name());
				
			}else if(Villager.tab_v_bank2_account.equals(cname)){
				
				rowdata.add(v.getV_bank2_account());
			}else if(Villager.tab_v_bank2_account_name.equals(cname)){
				
				rowdata.add(v.getV_bank2_account_name());
			}else if(Villager.tab_v_capture_expend_calss.equals(cname)){
				
				rowdata.add(v.getV_capture_expend_calss());
			}else if(Villager.tab_v_type.equals(cname)){
				
				rowdata.add(v.getV_type());
			}else if(Villager.tab_v_join_time.equals(cname)){
				
				rowdata.add(v.getV_join_time());
			}else if(Villager.tab_v_archival_location.equals(cname)){
				
				rowdata.add(v.getV_archival_location());
			}else if(Villager.tab_v_old_balance.equals(cname)){
				
				rowdata.add(v.getV_old_balance());
			}else if(Villager.tab_v_old_balance_flag.equals(cname)){
				
				rowdata.add(v.getV_old_balance_flag());
			}else if(Villager.tab_v_householder_name.equals(cname)){
				
				rowdata.add(v.getV_householder_name());
			}else if(Villager.tab_v_householder_ic.equals(cname)){
				
				rowdata.add(v.getV_householder_ic());
			}else if(Villager.tab_v_householder_relation.equals(cname)){
				
				rowdata.add(v.getV_householder_relation());
			}else if(Villager.tab_v_standard_culture.equals(cname)){
				
				rowdata.add(v.getV_standard_culture());
			}else if(Villager.tab_v_60not_enough15_flag.equals(cname)){
				
				rowdata.add(v.getV_60not_enough15_flag());
			}else if(Villager.tab_v_phone_num.equals(cname)){
				rowdata.add(v.getV_phone_num());
				
			}else if(Villager.tab_v_marital_status.equals(cname)){
				rowdata.add(v.getV_marital_status());
				
			}else if(Villager.tab_v_politics_status.equals(cname)){
				
				rowdata.add(v.getV_politics_status());
			}else if(Villager.tab_v_contact_name.equals(cname)){
				rowdata.add(v.getV_contact_name());
				
			}else if(Villager.tab_v_address_com.equals(cname)){
				
				rowdata.add(v.getV_address_com());
			}else if(Villager.tab_v_address_zip_code.equals(cname)){
				rowdata.add(v.getV_address_zip_code());
				
			}else if(Villager.tab_v_soldie_flag.equals(cname)){
				
				rowdata.add(v.getV_soldie_flag());
			}else if(Villager.tab_v_model_worker.equals(cname)){
				rowdata.add(v.getV_model_worker());
				
			}else if(Villager.tab_v_social_security_num.equals(cname)){
				rowdata.add(v.getV_social_security_num());
				
			}else if(Villager.tab_v_begin_get_date.equals(cname)){
				
				rowdata.add(v.getV_begin_get_date());
			}else if(Villager.tab_v_status.equals(cname)){
				
				rowdata.add(v.getV_status());
			}else if(Villager.tab_v_mark.equals(cname)){
				
				rowdata.add(v.getV_mark());
			}else if(Villager.tab_v_mark2.equals(cname)){
				
				rowdata.add(v.getV_mark2());
			}else if(Villager.tab_t_id.equals(cname)){
				rowdata.add("" + v.getT_id());
			}
		}
		return rowdata;
	}

	/**
	 * 刷新表头顺序
	 * @version 2012-5-22
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void refreshTableTitleOrder(){
		
		int size = jTableVillager.getColumnCount();
		Vector<String>  tt = new Vector<String>();
		
		for(int ii=0;ii<size;ii++){
			String cname = jTableVillager.getColumnName(ii);
			tt.add(cname);
			
		}
		
		mVillagerTableTitle = tt;
	}
	
	
	private void actionSaveToExcel0() {

		Date date = new Date();

		String excelFile = this.mCurrentThorp.getT_name() + "-参保人员银行数据-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";

		ExcelAccess ea = new ExcelAccess(excelFile);
		ea.setThorp(mCurrentThorp);
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mCurrentThorp.getT_id(), "a");
			ea.setVillagerList(list);
			if (ea.saveExcel(ExcelAccess.SAVE_BANK)) {
				// 导出成功
				String tempMSG = "成功导出到文件:" + excelFile + " ";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				// 导出失败
				String tempMSG = "导出到文件:" + excelFile + " 失败！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * 保存到excel
	 * 
	 * @author 李锦华
	 * @since:2011-11-16
	 */
	private void actionSaveToExcel() {

		Date date = new Date();

		String excelFile = this.mCurrentThorp.getT_name() + "-正常数据-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";

		ExcelAccess ea = new ExcelAccess(excelFile);
		ea.setThorp(mCurrentThorp);
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mCurrentThorp.getT_id(), "a");
			ea.setVillagerList(list);
			if (ea.saveExcel(ExcelAccess.SAVE_VILLAGER)) {
				// 导出成功
				String tempMSG = "成功导出到文件:" + excelFile + " ";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				// 导出失败
				String tempMSG = "导出到文件:" + excelFile + " 失败！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 保存到excel
	 * 
	 * @author 李锦华
	 * @since:2011-11-16
	 */
	private void actionSaveToExcel2() {

		Date date = new Date();

		String excelFile = this.mCurrentThorp.getT_name() + "-黑名单-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";

		ExcelAccess ea = new ExcelAccess(excelFile);
		ea.setThorp(mCurrentThorp);
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mCurrentThorp.getT_id(), "b");
			ea.setVillagerList(list);
			if (ea.saveExcel(ExcelAccess.SAVE_VILLAGER)) {
				// 导出成功
				String tempMSG = "成功导出到文件:" + excelFile + " ";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				// 导出失败
				String tempMSG = "导出到文件:" + excelFile + " 失败！";
				//声音提示
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void actionTableVillagerEdit(JTable jTableVillager, int rowS) {
//		jComboBox_ic.setSelectedItem(jTableVillager.getValueAt(rowS, 4));
//		jComboBox_name.setSelectedItem(jTableVillager.getValueAt(rowS, 2));
//		jComboBox_sex.setSelectedItem(jTableVillager.getValueAt(rowS, 3));
//		jComboBox_birthday.setSelectedItem(jTableVillager.getValueAt(rowS, 6));
//		jComboBox_address_live.setSelectedItem(jTableVillager.getValueAt(rowS,
//				7));
//		jComboBox_nation.setSelectedItem(jTableVillager.getValueAt(rowS, 5));
//		jComboBox_bank_name.setSelectedItem(jTableVillager.getValueAt(rowS, 8));
//		jComboBox_bank_account.setSelectedItem(jTableVillager.getValueAt(rowS,
//				9));
//		jComboBox_bank_account_name.setSelectedItem(jTableVillager.getValueAt(rowS,
//				10));
//		jComboBox_bank2_name.setSelectedItem(jTableVillager.getValueAt(rowS, 11));
//		jComboBox_bank2_account.setSelectedItem(jTableVillager.getValueAt(rowS,
//				12));
//		jComboBox_bank2_account_name.setSelectedItem(jTableVillager.getValueAt(rowS,
//				13));
//		jComboBox_capture_expend_calss.setSelectedItem(jTableVillager
//				.getValueAt(rowS, 14));
//		jComboBox_type.setSelectedItem(jTableVillager.getValueAt(rowS, 15));
//		jComboBox_join_time
//				.setSelectedItem(jTableVillager.getValueAt(rowS, 16));
//		jComboBox_archival_location.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 17));
//		jComboBox_old_balance.setSelectedItem(jTableVillager.getValueAt(rowS,
//				18));
//		jComboBox_old_balance_flag.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 19));
//		jComboBox_householder_name.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 20));
//		jComboBox_householder_ic.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 21));
//		jComboBox_householder_relation.setSelectedItem(jTableVillager
//				.getValueAt(rowS, 22));
//		jComboBox_standard_culture.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 23));
//		jComboBox_60not_enough15_flag.setSelectedItem(jTableVillager
//				.getValueAt(rowS, 24));
//		jComboBox_phone_num
//				.setSelectedItem(jTableVillager.getValueAt(rowS, 25));
//		jComboBox_marital_status.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 26));
//		jComboBox_politics_status.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 27));
//		jComboBox_contact_name.setSelectedItem(jTableVillager.getValueAt(rowS,
//				28));
//		jComboBox_address_com.setSelectedItem(jTableVillager.getValueAt(rowS,
//				29));
//		jComboBox_address_zip_code.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 30));
//		jComboBox_soldie_flag.setSelectedItem(jTableVillager.getValueAt(rowS,
//				31));
//		jComboBox_model_worker.setSelectedItem(jTableVillager.getValueAt(rowS,
//				32));
//		jComboBox_social_security_num.setSelectedItem(jTableVillager
//				.getValueAt(rowS, 33));
//		jComboBox_begin_get_date.setSelectedItem(jTableVillager.getValueAt(
//				rowS, 34));
//		jComboBox_status.setSelectedItem(jTableVillager.getValueAt(rowS, 35));
//		jComboBox_mark.setSelectedItem(jTableVillager.getValueAt(rowS, 36));
//		jComboBox_mark2.setSelectedItem(jTableVillager.getValueAt(rowS, 37));
//		mCurrentVillager.setT_id(Integer.parseInt(jTableVillager.getValueAt(
//				rowS, 38).toString()));
//		
//		mCurrentVillager.setV_id(Integer.parseInt(jTableVillager.getValueAt(
//				rowS, 1).toString()));
		
		int size = jTableVillager.getColumnCount();
		
		for(int ii=0;ii<size;ii++){
			String cname = jTableVillager.getColumnName(ii);
			GppJComboBoxExp temp = mTableColumeEdit.get(cname);
			
			if(temp != null){
				temp.setSelectedItem(jTableVillager.getValueAt(rowS, ii));
			}
			
			if("序号".equals(cname)){
				mCurrentVillager.setV_id(Integer.parseInt(""+jTableVillager.getValueAt(
						rowS, ii)));
			}
			
			if(Villager.tab_t_id.equals(cname)){
				mCurrentVillager.setT_id(Integer.parseInt(jTableVillager.getValueAt(
						rowS, ii).toString()));
			}
		}
	}
	
	/**
	 * 列名编辑
	 */
	private HashMap<String,GppJComboBoxExp> mTableColumeEdit = new HashMap<String,GppJComboBoxExp>();

	private boolean updateVillager(List<String> v_ics, String v_status) {
		try {
			return mXXDB.updateVillagerStatus(v_ics, v_status);
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	private void actionResetVillagerId(JTable tableVillager) {

		try {

			List<String> vv_ics = new ArrayList<String>();

			int size = tableVillager.getRowCount();
			for (int i = 0; i < size; i++) {
				vv_ics.add("" + tableVillager.getValueAt(i, 4));
			}

			if (mXXDB.resetVillagerOrderID(vv_ics)) {
				refreshTableVillager();
				refreshTableVillagerTop1();
			}

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}


	@Override
	public boolean runJar(String[] args) {
		XXNCYLBXMain.main(args);
		return false;
	}

}
