/**
 * 
 */
package com.gopawpaw.kynb.module.thorpmanage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.ThorpDialog;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;

/**
 * @version 2012-3-12
 * @author Jason
 */
public class ThorpManage extends BaseModuleFrame  implements GppJarRunableInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	
	private GppJComboBox jComboBoxThorp = null;
	
	private Thorp mCurrentThorp = new Thorp();
	
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();
	
	/**
	 * @throws HeadlessException
	 */
	public ThorpManage() throws HeadlessException {
		initialize();
	}

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public ThorpManage(String[] args) throws HeadlessException {
		super(args);
		initialize();
	}

	/**
	 * @param gc
	 */
	public ThorpManage(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public ThorpManage(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public ThorpManage(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
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
//			jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
//			jContentPane.add(getJPanelBottom(), BorderLayout.SOUTH);
		}
		return jContentPane;
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
		
		JPanel jPanelTop = new JPanel();

		jPanelTop.setLayout(new GridBagLayout());
		jPanelTop.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		JLabel jLabel = new JLabel();
		jLabel.setText("选择村名:   ");

		JLabel jLabel2 = new JLabel();
		jLabel2.setPreferredSize(new Dimension(30, 20));

		jPanelTop.add(jLabel, new GridBagConstraints());
		jPanelTop.add(getJComboBoxThorp(), new GridBagConstraints());
		jPanelTop.add(jLabel2, new GridBagConstraints());
		jPanelTop.add(getJButtonNewThorp(), new GridBagConstraints());
		jPanelTop.add(getJButtonUpdateThorp(), new GridBagConstraints());
		jPanelTop.add(getJButtonDeleteThorp(), new GridBagConstraints());
		
		return jPanelTop;
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
			jComboBoxThorp = new GppJComboBox();
			// jComboBoxThorp.setPreferredSize(new Dimension(200,20));
			// jComboBoxThorp.setMinimumSize(new Dimension(200,20));
			jComboBoxThorp.setEditable(false);

			jComboBoxThorp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							mCurrentThorp = (Thorp) jComboBoxThorp
									.getSelectedItem();
							
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
	 * 新建村
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonNewThorp() {
		JButton jButtonNewThorp = null;
		if (jButtonNewThorp == null) {
			jButtonNewThorp = new JButton();
			jButtonNewThorp.setText("创建村");
			jButtonNewThorp.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					ThorpDialog gmd = new ThorpDialog(ThorpManage.this) {
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
					gmd.setVisible(true);
				}
			});
		}
		return jButtonNewThorp;
	}

	private JButton getJButtonUpdateThorp() {
		JButton jButtonUpdateThorp = null;
		if (jButtonUpdateThorp == null) {
			jButtonUpdateThorp = new JButton();
			jButtonUpdateThorp.setText("修改村");
			jButtonUpdateThorp
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							ThorpDialog td = new ThorpDialog(ThorpManage.this) {
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
							td.setThorp(mCurrentThorp);
							td.setVisible(true);
						}
					});
		}
		return jButtonUpdateThorp;
	}

	private JButton getJButtonDeleteThorp() {
		JButton jButtonDeleteThorp = null;
		if (jButtonDeleteThorp == null) {
			jButtonDeleteThorp = new JButton();
			jButtonDeleteThorp.setText("删除村");
			jButtonDeleteThorp
					.addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							ThorpDialog gmd = new ThorpDialog(ThorpManage.this) {
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
							gmd.setThorp(mCurrentThorp);
							gmd.setVisible(true);
						}
					});
		}
		return jButtonDeleteThorp;
	}
	
	
	
	
	@Override
	public boolean runJar(String[] args) {
		ThorpManage.main(args);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {

					// UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
					UIManager.setLookAndFeel(
					// UIManager.getCrossPlatformLookAndFeelClassName()
					// UIManager.getSystemLookAndFeelClassName()
					// new com.sun.java.swing.plaf.motif.MotifLookAndFeel()
					// "com.jgoodies.looks.windows.WindowsLookAndFeel"
					// "com.jgoodies.looks.plastic.PlasticLookAndFeel"
							"com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
							// "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"

							);

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				ThorpManage thisClass = new ThorpManage();
				thisClass.setVisible(true);

			}
		});
	}
}
