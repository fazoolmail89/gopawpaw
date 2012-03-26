package com.gopawpaw.kynb.module.idnoupgrade;

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

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.ThorpDialog;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;

/**
 * 
 * @version 2012-3-26
 * @author Jason
 */
public class IdnoUpgrade extends BaseModuleFrame  implements GppJarRunableInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	
	private GppJComboBox jComboBoxThorp = null;
	
	
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();
	
	/**
	 * @throws HeadlessException
	 */
	public IdnoUpgrade() throws HeadlessException {
		initialize();
	}

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public IdnoUpgrade(String[] args) throws HeadlessException {
		super(args);
		initialize();
	}

	/**
	 * @param gc
	 */
	public IdnoUpgrade(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public IdnoUpgrade(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public IdnoUpgrade(String title, GraphicsConfiguration gc) {
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


		
		return jPanelTop;
	}
	

	
	@Override
	public boolean runJar(String[] args) {
		IdnoUpgrade.main(args);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				IdnoUpgrade thisClass = new IdnoUpgrade();
				thisClass.setVisible(true);
			}
		});
	}
}
