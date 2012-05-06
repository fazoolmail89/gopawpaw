/**
 * 
 */
package com.gopawpaw.frame.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.utils.MD5;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.kynb.RegisterDialog;
import com.gopawpaw.kynb.utils.GppConfiguration;
import com.gopawpaw.kynb.utils.MacUtils;

/**
 * 主程序入口类
 * 
 * @version 2010-6-7
 * @author 李锦华
 * 
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private String mLiyeqin = "\r\n技术支持：李业钦\r\n QQ:1483695671";

	private String mOffice = "联系快译支持：kuaiyi_support@163.com" + mLiyeqin;

	private String mSupport = mLiyeqin;

	private JPanel jContentPane = null;

	/**
	 * 选择执行的模块
	 */
	private GJComboBox jComboBoxSelectedModule = null;
	
	/**
	 * 主功能面板
	 */
	private MainPanelTree mainPanelTree = null;

	/**
	 * 菜单栏
	 */
	private JMenuBar jJMenuBar = null;

	/**
	 * 状态栏提示
	 */
	private JLabel jLabelStatus = null;

	private GppConfiguration mGppConfiguration;

	private static MainFrame thisClassMainFrame;

	public MainFrame() {
		// TODO Auto-generated constructor stub
		super();

		initialize();
	}

	/**
	 * 头部面板
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanelTop() {
		//头部父面板
		JPanel jPanelParent = new JPanel();
		jPanelParent.setLayout(new BorderLayout());
		jPanelParent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		//第一组面板（登陆、退出）
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5,0));
		jPanel1.setPreferredSize(new Dimension(200,25));
//		jPanel1.add(getJButton3(), null);
//		jPanel1.add(getJButton4(), null);
		
		//第二组面板（执行菜单）
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5,0));
		
		jPanel2.add(getJLabel(), null);
		jPanel2.add(getJComboBoxSelectedModule(), null);
		jPanel2.add(getJButton5(), null);
		
		//第三组面板（最小化、关掉）
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5,0));
		jPanel3.setPreferredSize(new Dimension(200,25));
		jPanel3.add(getJButtonMinAll(), null);
		jPanel3.add(getJButtonCloseAll(), null);
		
		jPanelParent.add(jPanel1, BorderLayout.WEST);
		jPanelParent.add(jPanel2, BorderLayout.CENTER);
		jPanelParent.add(jPanel3, BorderLayout.EAST);
		return jPanelParent;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		JLabel jLabel = new JLabel();
		jLabel.setText("执行菜单（M）： ");
//		jLabel.setBorder(BorderFactory.createEmptyBorder(0, 120, 0, 0));
		return jLabel;
	}

	private GJComboBox getJComboBoxSelectedModule() {
		if (jComboBoxSelectedModule == null) {
			jComboBoxSelectedModule = new GJComboBox() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionEnter() {
					System.out.println(jComboBoxSelectedModule.getSelectedItem());
					actionModule();
					return true;
				};
			};
			jComboBoxSelectedModule.setPreferredSize(new Dimension(400,25));
			jComboBoxSelectedModule.setMaximumSize(new Dimension(400,25));
			jComboBoxSelectedModule.setEditable(true);
		}
		return jComboBoxSelectedModule;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
		jPanel1.add(getJLabel1(), null);
		return jPanel1;
	}

	/**
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel1() {
		if (jLabelStatus == null) {
			jLabelStatus = new JLabel();
			jLabelStatus.setText("状态：");
		}
		return jLabelStatus;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		JButton jButton3 = new JButton();
		jButton3.setText("登陆");
		jButton3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {

			}
		});
		return jButton3;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		JButton jButton4 = new JButton();
		jButton4.setText("退出");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exitSystem();
			}
		});
		return jButton4;
	}

	/**
	 * This method initializes jButton5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton5() {
		JButton jButton5 = new JButton();
		jButton5.setText("运行");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionModule();
			}
		});
		
		return jButton5;
	}

	/**
	 * 最小化所有子模块
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonMinAll() {
		JButton jButton5 = new JButton();
		jButton5.setText("最小化所有");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mainPanelTree.actionMinAllModule();
			}
		});
		
		return jButton5;
	}
	
	/**
	 * 关闭所有子模块
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonCloseAll() {
		JButton jButton5 = new JButton();
		jButton5.setText("关闭所有");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mainPanelTree.actionCloseAllModule();
			}
		});
		
		return jButton5;
	}
	/**
	 * 执行模块
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	private void actionModule(){
		
		mainPanelTree.actionModule(jComboBoxSelectedModule.getEditor().getItem());
		
	}
	/**
	 * 
	 */
	public static void main(String[] args) {
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

				MainFrame thisClass = new MainFrame();
				thisClassMainFrame = thisClass;
				thisClass.setLocation(200, 100);
				thisClass.setSize(1000, 600);
				thisClass
						.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				thisClass.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						exitSystem();

					}

				});

//				if (thisClass.cheakRegister()) {
					// if (true) {
					thisClass.setVisible(true);
//				} else {
//					System.exit(0);
//				}
			}
		});
	}

	public static void exitSystem() {
		int option = JOptionPane.showConfirmDialog(null, "是否完全退出该系统？", "系统提示",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else {
			thisClassMainFrame.setVisible(true);
		}

	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GlobalParameter.initialize();
		// MySQLUtils.initMySQLConfig();
		// MySQLUtils.startMySQLService();

		// this.setSize(GlobalParameter.getGuiClient().getSizeOfMainFrame());
		// this.setLocation(GlobalParameter.getGuiClient().getLocationOfMainFrame());

		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("快译农保 V1.2");
		mGppConfiguration = new GppConfiguration("ini.ini");

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
			jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
			jContentPane.add(getMainPanelTree(), BorderLayout.CENTER);
			jContentPane.add(getJPanel1(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	private MainPanelTree getMainPanelTree() {

		if(mainPanelTree == null){
			mainPanelTree = new MainPanelTree();
		}
		return mainPanelTree;

	}

	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();

			JButton jb = new JButton("帮助");
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GppAbout a = new GppAbout(MainFrame.this);
					a.setModal(true);
					a.setVisible(true);
				}
			});
			jJMenuBar.add(jb);
		}
		return jJMenuBar;
	}
	
	
	

	private boolean cheakRegister() {

		String mac = MacUtils.getMACAddress();

		String registerCode = mGppConfiguration.getValue("registerCode");

		String displayKey = genDisplayCode(mac);

		final String regKey = genKeyCode(displayKey);

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
			rd.setModal(true);
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

	public static Point getMainFrameLocation() {
		return thisClassMainFrame.getLocation();
	}

} // @jve:decl-index=0:visual-constraint="8,5"
