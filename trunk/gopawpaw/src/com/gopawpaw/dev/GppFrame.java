/**
 * 
 */
package com.gopawpaw.dev;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JSplitPane;

import com.gopawpaw.dev.common.GppBaseFrame;
import com.gopawpaw.dev.common.GppPanelFreeOrder;

import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JProgressBar;


/**
 * @version 2009-10-3
 * @author 李锦华
 */
public class GppFrame extends GppBaseFrame implements GppModuleActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4261817208913012434L;
	private JSplitPane jSplitPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenu jMenu1 = null;
	private JPopupMenu jPopupMenu = null;  //  @jve:decl-index=0:visual-constraint="421,201"
	private JScrollPane jScrollPane = null;
	private JPanel jPanel = null;
	GppPanelFreeOrder gppPanel = new GppPanelFreeOrder(GppPanelFreeOrder.X_AXIS,2);  //  @jve:decl-index=0:
	private JScrollPane jScrollPane1 = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JLabel jLabel = null;
	private JTextField jTextField = null;
	private JPanel jPanel3 = null;
	private JPanel jPanel4 = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JPanel jPanel5 = null;  //  @jve:decl-index=0:visual-constraint="526,454"
	private JLabel jLabel1 = null;
	
	/**
	 * This method initializes 
	 * 
	 */
	public GppFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        this.setSize(new Dimension(958, 434));
        this.setContentPane(getJPanel5());
        this.setJMenuBar(getJJMenuBar());
		this.addKeyListener(new KeyListener(){

			public void keyPressed(KeyEvent arg0) {
				System.out.println("sdfdsf");
			}

			
			public void keyReleased(KeyEvent arg0) {
			}

			public void keyTyped(KeyEvent arg0) {
			}
			
		});
		
	}
	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setLeftComponent(getJScrollPane());
			jSplitPane.setRightComponent(getJScrollPane1());
			jSplitPane.setDividerSize(5);
			jSplitPane.setDividerLocation(400);
			jSplitPane.setOneTouchExpandable(false);
		}
		return jSplitPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("文件");
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("系统设置");
			jMenu1.add(getJPopupMenu());
		}
		return jMenu1;
	}

	/**
	 * This method initializes jPopupMenu	
	 * 	
	 * @return javax.swing.JPopupMenu	
	 */ 
	private JPopupMenu getJPopupMenu() {
		if (jPopupMenu == null) {
			jPopupMenu = new JPopupMenu();
			jPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jPopupMenu;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJPanel());
		}
		return jScrollPane;
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
			GppModule	gppModule	= new GppModule();
			gppModule.addGppModuleActionListener(this);
			gppModule.actionModule("0");
			jPanel.add(gppModule.getModuleNav(),null);
		}
		return jPanel;
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
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.add(getJPanel4(), BorderLayout.SOUTH);
			
		}
		return jPanel1;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppModuleActionListener#actionGppModule(java.lang.String)
	 */
	@Override
	public boolean actionGppModule(String modid) {
		GppModule	gppModule	= new GppModule();
		gppModule.addGppModuleActionListener(this);
		
		gppModule.actionModule(modid);
		
		getJPanel().removeAll();
		getJPanel1().removeAll();
		
		getJPanel().add(gppModule.getModuleNav(),null);
		getJPanel1().add(gppModule.getModuleList(),BorderLayout.CENTER);
		getJPanel1().add(getJPanel4(), BorderLayout.SOUTH);
		
		getJPanel().updateUI();
		getJPanel1().updateUI();
		//设置默认选择
		gppModule.getJList().setSelectedIndex(0);
		//设置焦点
		gppModule.getJList().requestFocusInWindow();
		return false;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabel = new JLabel();
			jLabel.setText("菜单选择（M）：");
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));
			jPanel2.add(jLabel, null);
			jPanel2.add(getJTextField(), null);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
		}
		return jTextField;
	}

	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.X_AXIS));
			jPanel3.add(getJButton(), null);
			jPanel3.add(getJButton1(), null);
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
			jPanel4.add(getJPanel2(), null);
			jPanel4.add(getJPanel3(), null);
		}
		return jPanel4;
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
		}
		return jButton1;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("  状态提示：");
			jPanel5 = new JPanel();
			jPanel5.setLayout(new BorderLayout());
			jPanel5.add(getJSplitPane(),BorderLayout.CENTER);
			jPanel5.add(jLabel1, BorderLayout.SOUTH);
		}
		return jPanel5;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
