/**
 * 
 */
package com.gopawpaw.frame;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import java.text.ParseException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;

import com.gopawpaw.dev.common.encryption.MD5;
import com.gopawpaw.frame.dataEntity.Dmnd_det;
import com.gopawpaw.frame.dataEntity.Omnd_det;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.RegisterDialog;
import com.gopawpaw.kynb.utils.GppConfiguration;

import javax.swing.JMenu;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
/**
 * @version 2010-6-7
 * @author 李锦华
 * 
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private String mLiyeqin = "\r\n技术支持：李业钦\r\n QQ:1483695671\r\n 电话：0774-7290788";

	private String mOffice = "联系快译支持：kuaiyi_support@163.com" + mLiyeqin;
	private String mSupport = mLiyeqin;

	private JPanel jContentPane = null;
	private MainPanelTree mainPanelTree = null;

	private JPanel jPanel = null; // @jve:decl-index=0:visual-constraint="173,440"
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JLabel jLabel = null;
	private JComboBox jComboBox = null;
	private Modules modules = null; // @jve:decl-index=0:
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel1 = null;
	private JButton jButton3 = null;
	private JButton jButton4 = null;
	private JButton jButton5 = null;

	public static Vector<Dmnd_det> actionHistory = new Vector<Dmnd_det>(); // @jve:decl-index=0:
	public static Vector<Dmnd_det> actionHistory2 = new Vector<Dmnd_det>();

	private GppConfiguration mGppConfiguration;

	/**
	 * @throws HeadlessException
	 */
	public MainFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();

		initialize();
	}

	/**
	 * @param arg0
	 */
	public MainFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public MainFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public MainFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.setSize(new Dimension(357, 26));
			jPanel.add(getJButton(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
			jPanel.add(getJLabel(), null);
			jPanel.add(getJComboBox(), null);
			jPanel.add(getJButton5(), null);
			jPanel.add(getJButton3(), null);
			jPanel.add(getJButton4(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("   主页    ");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mainPanelTree.actionMainMenu();
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("   返回 ");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (MainFrame.actionHistory.size() > 1) {
						Dmnd_det tempdd = MainFrame.actionHistory.lastElement();
						MainFrame.actionHistory2.add(tempdd);
						MainFrame.actionHistory.removeElement(tempdd);
						if (!MainFrame.actionHistory.isEmpty()) {
							tempdd = MainFrame.actionHistory.lastElement();
							if (tempdd.isHaveChild()) {
								// 清空列表子节点
								((DefaultListModel) getMainPanelTree()
										.getJListFunction().getModel())
										.removeAllElements();
								Omnd_det od = new Omnd_det(tempdd);
								od.updataVector();
								Iterator<?> it = od.getVectorDmnd_det()
										.iterator();
								while (it.hasNext()) {
									Dmnd_det tempdd2 = (Dmnd_det) it.next();
									((DefaultListModel) getMainPanelTree()
											.getJListFunction().getModel())
											.addElement(tempdd2);
								}
							}
						}
					} else {
						MainFrame.exitSystem();
					}

				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText(" 前进   ");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (MainFrame.actionHistory2.size() > 0) {
						Dmnd_det tempdd = MainFrame.actionHistory2
								.lastElement();
						MainFrame.actionHistory.add(tempdd);
						MainFrame.actionHistory2.removeElement(tempdd);

						if (tempdd.isHaveChild()) {
							// 清空列表子节点
							((DefaultListModel) getMainPanelTree()
									.getJListFunction().getModel())
									.removeAllElements();
							Omnd_det od = new Omnd_det(tempdd);
							od.updataVector();
							Iterator<?> it = od.getVectorDmnd_det().iterator();
							while (it.hasNext()) {
								Dmnd_det tempdd2 = (Dmnd_det) it.next();
								((DefaultListModel) getMainPanelTree()
										.getJListFunction().getModel())
										.addElement(tempdd2);
							}
						}
					}

				}
			});
		}
		return jButton2;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setText("    选择菜单（M）： ");
		}
		return jLabel;
	}

	/**
	 * This method initializes jComboBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new GppJComboBox() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 6284876885903681726L;

				public boolean actionEnter() {

					// 获取菜单对象
					Object obdd = jComboBox.getEditor().getItem();

					Dmnd_det dd = null;
					String editString = null;

					if (obdd instanceof Dmnd_det) {
						dd = (Dmnd_det) obdd;
					} else {
						editString = (String) obdd;
					}

					if (dd != null) {// 标准菜单对象

						Omnd_det od = new Omnd_det(dd);
						if (od.updateDmnd_det()) {

							if (!modules.actionModule(dd)) {

								JOptionPane.showConfirmDialog(null,
										modules.getActionModuleMessage(),
										"系统提示", JOptionPane.YES_NO_OPTION,
										JOptionPane.QUESTION_MESSAGE);
							} else {

								if (dd.isHaveChild()) {
									MainFrame.actionHistory.add(dd);
									// 清空列表子节点
									((DefaultListModel) mainPanelTree
											.getJListFunction().getModel())
											.removeAllElements();
									od.updataVector();
									Iterator<?> it = od.getVectorDmnd_det()
											.iterator();
									while (it.hasNext()) {
										Dmnd_det tempdd2 = (Dmnd_det) it.next();
										((DefaultListModel) mainPanelTree
												.getJListFunction().getModel())
												.addElement(tempdd2);
									}
								}
							}
						} else {// 不存在该菜单
							JOptionPane.showConfirmDialog(null, "菜单项不存在：" + dd,
									"系统提示", JOptionPane.YES_NO_OPTION,
									JOptionPane.QUESTION_MESSAGE);
						}

					} else {// 非标准菜单对象
						if (Dmnd_det.isRightMenu(editString)) {
							Dmnd_det tempdd = new Dmnd_det();
							if (Dmnd_det.isTopMenu(editString)) {
								tempdd.setMnd_nbr(editString);
								tempdd = Omnd_det.getFatherNbr(tempdd);

							} else {
								tempdd.setMnd_nbr(Dmnd_det
										.getMnd_nbrOfMenuString(editString));
								tempdd.setMnd_select(Dmnd_det
										.getMnd_selectOfMenuString(editString));
							}

							Omnd_det tempod = new Omnd_det(tempdd);

							if (tempod.updateDmnd_det()) {
								tempdd = tempod.getDmnd_det();
								if (!modules.actionModule(tempdd)) {

									JOptionPane.showConfirmDialog(null,
											modules.getActionModuleMessage(),
											"系统提示", JOptionPane.YES_NO_OPTION,
											JOptionPane.QUESTION_MESSAGE);
								} else {

									if (tempdd.isHaveChild()) {
										MainFrame.actionHistory.add(tempdd);
										// 清空列表子节点
										((DefaultListModel) mainPanelTree
												.getJListFunction().getModel())
												.removeAllElements();
										tempod.updataVector();
										Iterator<?> it = tempod
												.getVectorDmnd_det().iterator();
										while (it.hasNext()) {
											Dmnd_det tempdd2 = (Dmnd_det) it
													.next();
											((DefaultListModel) mainPanelTree
													.getJListFunction()
													.getModel())
													.addElement(tempdd2);
										}
									}
								}
							} else {// 不存在该菜单
								JOptionPane.showConfirmDialog(null, "菜单项不存在："
										+ editString, "系统提示",
										JOptionPane.YES_NO_OPTION,
										JOptionPane.QUESTION_MESSAGE);
							}
						} else {
							JOptionPane.showConfirmDialog(null, "非法菜单格式！ "
									+ editString, "系统提示",
									JOptionPane.YES_NO_OPTION,
									JOptionPane.QUESTION_MESSAGE);
						}

					}
					return false;
				}

			};
			jComboBox.setEditable(true);

			Iterator<Dmnd_det> it = GlobalParameter
					.getFrequently_used_menu_item().iterator();
			while (it.hasNext()) {
				Dmnd_det tempDmnd = (Dmnd_det) it.next();
				jComboBox.addItem(tempDmnd);
			}
			((GppJComboBox) jComboBox).updateGppKeyListener();
		}
		return jComboBox;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("帮助");
		}
		return jMenu;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(getJLabel1(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("状态：");
		}
		return jLabel1;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("登陆");
			jButton3.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					System.out.println("jButton3.mouseClicked, event=" + evt);
					// TODO add your code for jButton3.mouseClicked
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("退出");
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					exitSystem();
				}
			});
		}
		return jButton4;
	}

	/**
	 * This method initializes jButton5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("运行");
			jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					((GppJComboBox) jComboBox).actionEnter();
				}
			});
		}
		return jButton5;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// SynthLookAndFeel synth = new SynthLookAndFeel();
				// try {
				// synth.load(MainFrame.class.getResourceAsStream("demo.xml"),
				// MainFrame.class);
				// } catch (ParseException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }
				// try {
				// UIManager.setLookAndFeel(synth);
				// } catch (UnsupportedLookAndFeelException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }

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

				MainFrame thisClass = new MainFrame();
				thisClass.setLocation(200, 100);
				thisClass.setSize(800, 350);
				thisClass
						.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				thisClass.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						exitSystem();
					}
				});

				if (thisClass.cheakRegister()) {
					thisClass.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					thisClass.setVisible(true);
				} else {
					System.exit(0);
				}

			}
		});
	}

	public static void exitSystem() {
		int option = JOptionPane.showConfirmDialog(null, "是否完全退出该系统？", "系统提示",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GlobalParameter.initialize();
		modules = new Modules();
		// this.setSize(GlobalParameter.getGuiClient().getSizeOfMainFrame());
		// this.setLocation(GlobalParameter.getGuiClient().getLocationOfMainFrame());

		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("快译农保");
		mGppConfiguration = new GppConfiguration("ini.ini");
		getMainPanelTree().actionMainMenu();

		Component[] c = this.getJPanel().getComponents();
		for (int i = 0; i < c.length; i++) {
			Object o = c[i];

			System.out.println(o.getClass());
		}

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
			// 隐藏掉头部工具栏
			// jContentPane.add(getJPanel(), BorderLayout.NORTH);
			jContentPane.add(getMainPanelTree(), BorderLayout.CENTER);
			jContentPane.add(getJPanel1(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	private MainPanelTree getMainPanelTree() {
		if (mainPanelTree == null) {
			mainPanelTree = new MainPanelTree();

		}
		return mainPanelTree;
	}

	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	private boolean cheakRegister() {
		String diskID = chenmin.io.DiskID.DiskID();

		String registerCode = mGppConfiguration.getValue("registerCode");

		String displayKey = genDisplayCode(diskID);

		final String regKey = genKeyCode(displayKey);

		// System.out.println(displayKey);
		//
		// System.out.println(genKeyCode(displayKey));

		if (registerCode == null || !registerCode.equals(regKey)) {
			boolean regFlag = false;
			RegisterDialog rd = new RegisterDialog(this) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				protected void actionFinish(int option, String regCode) {
					// TODO Auto-generated method stub
					if (option == RegisterDialog.YES_OPTION) {
						System.out.println(regCode);
						if (regKey.equals(regCode)) {
							// 注册成功
							mGppConfiguration.setValue("registerCode", regCode);
							mGppConfiguration.saveFile();

							String tempMSG = "恭喜您注册成功，非常感谢您对快译软件的支持！\r\n请重新启动系统，即可生效。";
							// 声音提示
							Toolkit.getDefaultToolkit().beep();
							JOptionPane.showConfirmDialog(null, tempMSG,
									"系统提示", JOptionPane.YES_NO_OPTION,
									JOptionPane.INFORMATION_MESSAGE);

							super.actionFinish(option, regCode);
						} else {
							// 注册失败
							String tempMSG = "该注册码不能在本机使用，或者您的注册码已经过期，请联系管理员获取注册码！\r\n"
									+ mSupport;
							// 声音提示
							Toolkit.getDefaultToolkit().beep();
							JOptionPane.showConfirmDialog(null, tempMSG,
									"系统提示", JOptionPane.YES_NO_OPTION,
									JOptionPane.INFORMATION_MESSAGE);
						}

					} else {
						// 取消
						super.actionFinish(option, regCode);
					}

				}
			};
			rd.setTitle("您的支持，我们的动力！");
			rd.setKeyCode(displayKey);
			rd.setVisible(true);

			return regFlag;
		} else {
			return true;
		}

		//
		// return true;
	}

	private String genDisplayCode(String diskID) {
		MD5 md5 = new MD5();

		return md5.getMD5ofStr(diskID);
	}

	private String genKeyCode(String displayCode) {
		String k3 = displayCode.substring(6, 21);

		MD5 md5 = new MD5();

		return md5.getMD5ofStr(k3);
	}

} // @jve:decl-index=0:visual-constraint="8,5"
