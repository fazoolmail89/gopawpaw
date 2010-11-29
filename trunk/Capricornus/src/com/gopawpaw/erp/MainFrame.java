/**
 * 
 */
package com.gopawpaw.erp;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import java.text.ParseException;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;

import com.gopawpaw.erp.dataEntity.Dmnd_det;
import com.gopawpaw.erp.dataEntity.Omnd_det;
import com.gopawpaw.javax.swing.GppJComboBox;
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
					if (GppMainFrame.actionHistory.size() > 1) {
						Dmnd_det tempdd = GppMainFrame.actionHistory
								.lastElement();
						GppMainFrame.actionHistory2.add(tempdd);
						GppMainFrame.actionHistory.removeElement(tempdd);
						if (!GppMainFrame.actionHistory.isEmpty()) {
							tempdd = GppMainFrame.actionHistory.lastElement();
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
						GppMainFrame.exitSystem();
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
					if (GppMainFrame.actionHistory2.size() > 0) {
						Dmnd_det tempdd = GppMainFrame.actionHistory2
								.lastElement();
						GppMainFrame.actionHistory.add(tempdd);
						GppMainFrame.actionHistory2.removeElement(tempdd);

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

								JOptionPane.showConfirmDialog(null, modules
										.getActionModuleMessage(), "系统提示",
										JOptionPane.YES_NO_OPTION,
										JOptionPane.QUESTION_MESSAGE);
							} else {

								if (dd.isHaveChild()) {
									GppMainFrame.actionHistory.add(dd);
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

									JOptionPane.showConfirmDialog(null, modules
											.getActionModuleMessage(), "系统提示",
											JOptionPane.YES_NO_OPTION,
											JOptionPane.QUESTION_MESSAGE);
								} else {

									if (tempdd.isHaveChild()) {
										GppMainFrame.actionHistory.add(tempdd);
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
					System.out.println("jButton3.mouseClicked, event="+evt);
					//TODO add your code for jButton3.mouseClicked
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

//				 SynthLookAndFeel synth = new SynthLookAndFeel();
//				 try {
//				 synth.load(MainFrame.class.getResourceAsStream("demo.xml"),
//				 MainFrame.class);
//				 } catch (ParseException e1) {
//				 // TODO Auto-generated catch block
//				 e1.printStackTrace();
//				 }
//				 try {
//				 UIManager.setLookAndFeel(synth);
//				 } catch (UnsupportedLookAndFeelException e1) {
//				 // TODO Auto-generated catch block
//				 e1.printStackTrace();
//				 }

				try {

//					 UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
					UIManager.setLookAndFeel(
//					 UIManager.getCrossPlatformLookAndFeelClassName()
//							 UIManager.getSystemLookAndFeelClassName()
//							 new com.sun.java.swing.plaf.motif.MotifLookAndFeel()
//							 "com.jgoodies.looks.windows.WindowsLookAndFeel"
//							"com.jgoodies.looks.plastic.PlasticLookAndFeel"
							 "com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
//							 "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"

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
				thisClass.setSize(1000, 400);
				thisClass
						.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				thisClass.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						exitSystem();
					}
				});
				thisClass.setVisible(true);

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
		this.setTitle("JFrame");

		getMainPanelTree().actionMainMenu();
		
		Component[] c  = this.getJPanel().getComponents();
		for(int i = 0 ;i<c.length;i++){
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
			jContentPane.add(getJPanel(), BorderLayout.NORTH);
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
} // @jve:decl-index=0:visual-constraint="8,5"
