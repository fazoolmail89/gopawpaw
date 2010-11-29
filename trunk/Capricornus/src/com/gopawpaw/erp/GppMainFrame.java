/**
 * 
 */
package com.gopawpaw.erp;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Point;

import com.gopawpaw.erp.common.SelectDialog;
import com.gopawpaw.erp.dataEntity.Dmnd_det;
import com.gopawpaw.erp.dataEntity.Omnd_det;
import com.gopawpaw.erp.dataEntity.mfg.GppCodeMstr;
import com.gopawpaw.erp.hibernate.c.CodeMstr;
import com.gopawpaw.erp.hibernate.m.MntDet;
import com.gopawpaw.erp.hibernate.m.MntDetDAO;
import com.gopawpaw.erp.program.mygui11.Mygui11;
import com.gopawpaw.erp.program.mygui11.Mygui11Main;
import com.gopawpaw.erp.program.user.So_inv;
import com.gopawpaw.erp.program.user.So_inv_det;
import com.gopawpaw.erp.program.user.So_scale;
import com.gopawpaw.erp.program.user.So_trend;
import com.gopawpaw.erp.program.user.Wo_det;
import com.gopawpaw.erp.program.user.Wo_pro;
import com.gopawpaw.erp.program.user.Wo_trend;
import com.gopawpaw.erp.test.DateChooser;
import com.gopawpaw.erp.test.TestSelect;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.javax.swing.GppJFrame;
import com.gopawpaw.javax.swing.GppJTextField;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComboBox;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @version 2010-3-4
 * @author 李锦华
 * 
 */
public class GppMainFrame extends GppJFrame implements GppModuleActionListener {

	private static final long serialVersionUID = 1L;
	private static Point mainFrameLocation = null;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar1 = null;
	private JMenu jMenu1 = null;
	private JSplitPane jSplitPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JScrollPane jScrollPane = null;
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null;
	private JPanel jPanel5 = null;
	private JPanel jPanel6 = null;
	private JLabel jLabel1 = null;
	private JTextField jTextField = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	public static Vector<Dmnd_det> actionHistory = new Vector<Dmnd_det>();  //  @jve:decl-index=0:
	public static Vector<Dmnd_det> actionHistory2 = new Vector<Dmnd_det>();
	private JScrollPane jScrollPane1 = null;
	private JPanel jPanel7 = null;
	private JComboBox jComboBox = null;

	private GppModule gppModuleini = null;  //  @jve:decl-index=0:
	private JButton jButton2 = null;
	/**
	 * @throws HeadlessException
	 */
	public GppMainFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppMainFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public GppMainFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppMainFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes jJMenuBar1
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar1() {
		if (jJMenuBar1 == null) {
			jJMenuBar1 = new JMenuBar();
			jJMenuBar1.add(getJMenu1());
		}
		return jJMenuBar1;
	}

	/**
	 * This method initializes jMenu1
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("关于");
			jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
//					Mygui11 mm = new Mygui11();
					
//					So_trend mm = new So_trend();
//					mm.setLocation(Gpp_ThisJFrame.getLocation());
//					mm.setVisible(true);
//					
					GppAbout gabout = new GppAbout(Gpp_ThisJFrame);
					gabout.setVisible(true);
				}
			});
		}
		return jMenu1;
	}

	/**
	 * This method initializes jSplitPane
	 * 
	 * @return javax.swing.JSplitPane
	 */
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setDividerSize(8);
			jSplitPane.setDividerLocation(250);
			jSplitPane.setResizeWeight(0.4);
			jSplitPane.setOneTouchExpandable(true);
			jSplitPane.setRightComponent(getJPanel2());
			jSplitPane.setLeftComponent(getJPanel7());
			

		}
		return jSplitPane;
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
			jPanel.add(getJLabel(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setText("状态条：");
		}
		return jLabel;
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

			if(gppModuleini == null){
				gppModuleini = new GppModule();
				gppModuleini.addGppModuleActionListener(this);
				Dmnd_det dd = new Dmnd_det();
				dd.setMnd_nbr("");
				dd.setMnd_select(2);

				Omnd_det od = new Omnd_det(dd);
				od.updateDmnd_det();

				gppModuleini.actionModule(od.getDmnd_det());
			}
			
			jPanel1.add(gppModuleini.getModuleNav());
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
			jPanel2.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJPanel3());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jPanel3
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setLayout(new BorderLayout());
			jPanel3.add(getJPanel4(), BorderLayout.SOUTH);
			if(gppModuleini == null){
				gppModuleini = new GppModule();
				gppModuleini.addGppModuleActionListener(this);
				Dmnd_det dd = new Dmnd_det();
				dd.setMnd_nbr("");
				dd.setMnd_select(2);
				Omnd_det od = new Omnd_det(dd);
				od.updateDmnd_det();
				gppModuleini.actionModule(od.getDmnd_det());
			}
			
			jPanel3.add(gppModuleini.getModuleList(), BorderLayout.CENTER);
			
		}
		return jPanel3;
	}

	/**
	 * This method initializes jPanel4
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.Y_AXIS));
			jPanel4.add(getJPanel5(), null);
			jPanel4.add(getJPanel6(), null);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jPanel5
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText(" 选择菜单（M）： ");
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.X_AXIS));
			jPanel5.add(getJButton2(), null);
			jPanel5.add(jLabel1, null);
//			jPanel5.add(getJTextField(), null);
			jPanel5.add(getJComboBox(), null);
			jPanel5.setBorder(BorderFactory.createLineBorder(new Color(51, 51, 51)));
			
//			jPanel5.setBorder(BorderFactory.createTitledBorder(null, "详细信息", TitledBorder.LEADING, TitledBorder.TOP, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
		}
		return jPanel5;
	}

	/**
	 * This method initializes jPanel6
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jPanel6 = new JPanel();
			jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.X_AXIS));
			jPanel6.add(getJButton(), null);
			jPanel6.add(getJButton1(), null);
			jPanel6.setBorder(BorderFactory.createEmptyBorder(6, 4, 1, 4));//设置间距,参数分别为上边距，左边距，下边距，右边距
		}
		return jPanel6;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new GppJTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = -6746964678919693648L;

				public boolean actionEnter() {
					String tempstr = jTextField.getText();
					if (GppModule.isJarFile(tempstr)
							&& Omnd_det.isExistExec(tempstr)) {

					}
					Dmnd_det dd = new Dmnd_det();
					dd.setMnd_nbr(Omnd_det.getNbr(tempstr));
					dd.setMnd_select(Omnd_det.getSelect(tempstr));
					Omnd_det od = new Omnd_det(dd);
					if (od.updateDmnd_det()) {
						actionGppModule(od.getDmnd_det());
					} else {

					}

					return false;
				}
			};
		}
		return jTextField;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("登陆");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					// Vector<String> cname = new Vector<String>(8);
					// cname.add("菜单");
					// cname.add("选择");
					// cname.add("标签");
					//					
					// Vector<Vector<String>> vesource = new
					// Vector<Vector<String>>();
					//					
					// MntDetDAO mntDAO =
					// MntDetDAO.getFromApplicationContext(GlobalParameter.getAppContextXMLClass("MntDetDAO"));
					// List<?> l = mntDAO.findAll();
					//					
					// for(Object o:l){
					// //
					// getJTextArea().append(((MntDet)o).getId().getMntNbr()+"."+((MntDet)o).getId().getMntSelect()+":"+((MntDet)o).getMntLabel()+"\n");
					// Vector<String> temve = new Vector<String>(8);
					// temve.add(((MntDet)o).getId().getMntNbr());
					// temve.add(((MntDet)o).getId().getMntSelect().toString());
					// temve.add(((MntDet)o).getMntLabel());
					//						
					// vesource.add(temve);
					// }
					// SelectDialog sd = new
					// SelectDialog(Gpp_ThisJFrame,"查询",true,cname,vesource);
					//					
					// sd.setSeekContext("菜单", "");
					// sd.seekAction();
					//					
					// sd.setVisible(true);
					// System.out.println("=="+sd.getSelectedValues());

					// Mygui11 my = new Mygui11(Gpp_ThisJFrame);
					// my.setVisible(true);
					// GppCodeMstr gcm = new GppCodeMstr();
					// Iterator it = gcm.getPt_part_type().iterator();
					// while(it.hasNext()){
					// CodeMstr cm = (CodeMstr)it.next();
					// System.out.println(cm.getId().getCodeValue());
					// }
					// TestSelect ts = new TestSelect();
					// ts.setVisible(true);
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
			jButton1.setText("退出");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					GppMainFrame.exitSystem();
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jScrollPane1
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJPanel1());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jPanel7
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel7() {
		if (jPanel7 == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.weightx = 1.0;
			jPanel7 = new JPanel();
			jPanel7.setLayout(new GridBagLayout());
			jPanel7.add(getJScrollPane1(), gridBagConstraints);
		}
		return jPanel7;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new GppJComboBox(){

				/**
				 * 
				 */
				private static final long serialVersionUID = 6284876885903681726L;
				
				public boolean actionEnter() {

					Dmnd_det dd = (Dmnd_det) jComboBox.getSelectedItem();

					Omnd_det od = new Omnd_det(dd);
					if (od.updateDmnd_det()) {
						actionGppModule(od.getDmnd_det());
					} else {

					}
					return false;
				}
			
			};
			jComboBox.setEditable(true);
			
			Iterator<Dmnd_det> it = GlobalParameter.getFrequently_used_menu_item().iterator();
			while (it.hasNext()) {
				Dmnd_det tempDmnd = (Dmnd_det) it.next();
				jComboBox.addItem(tempDmnd);
			}
			
			((GppJComboBox)jComboBox).updateGppKeyListener();
		}
		return jComboBox;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("主菜单");
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Dmnd_det dd = new Dmnd_det();
					dd.setMnd_nbr("");
					dd.setMnd_select(2);
					Omnd_det od = new Omnd_det(dd);
					od.updateDmnd_det();
					actionGppModule(od.getDmnd_det());
				}
			});
		}
		return jButton2;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GppMainFrame thisClass = new GppMainFrame();
				
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

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GlobalParameter.initialize();
		this.setSize(1000, 400);
		this.setJMenuBar(getJJMenuBar1());
		this.setContentPane(getJContentPane());
		this.setTitle("GERP");
		this.setLocation(300, 200);
		mainFrameLocation = this.getLocation();

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
			jContentPane.add(getJSplitPane(), BorderLayout.CENTER);
			jContentPane.add(getJPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	@Override
	public boolean actionGppModule(Dmnd_det dd) {
		GppModule gppModule = new GppModule();
		gppModule.addGppModuleActionListener(this);
		gppModule.actionModule(dd);

////		getJPanel1().removeAll();
//		getJPanel3().removeAll();
//
//		JPanel tempJP = gppModule.getModuleNav();
//		JList tempJL = gppModule.getModuleList();
//
////		getJPanel1().add(tempJP);
//		getJPanel3().add(tempJL, BorderLayout.CENTER);
//		getJPanel2().add(getJPanel4(), BorderLayout.SOUTH);
////		getJPanel1().updateUI();
//		getJPanel3().updateUI();
//		getJPanel4().updateUI();
//		// 设置默认选择
//		tempJL.setSelectedIndex(0);
//		// 设置焦点
//		tempJL.requestFocusInWindow();
		return false;
	}

	public static Point getMainFrameLocation() {
		return mainFrameLocation;
	}

	public static void exitSystem() {
		int option = JOptionPane.showConfirmDialog(null, "是否完全退出该系统？", "系统提示",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}

} // @jve:decl-index=0:visual-constraint="10,10"
