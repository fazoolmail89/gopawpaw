/**
 * 
 */
package com.gopawpaw.frame.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JDialog;
import java.awt.Dimension;
import javax.swing.JLabel;


import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @version 2010-5-15
 * @author 李锦华
 * 
 */
public class GppAbout extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	
	/**
	 * 程序名称
	 */
	private static String programs = null;
	
	/**
	 * 版本号
	 */
	private static String versions = null;
	
	/**
	 * 作者
	 */
	private static String author = null;
	
	/**
	 * 支持
	 */
	private static String support = null;
	
	/**
	 * 邮箱
	 */
	private static String email = null;
	
	/**
	 * 程序名称显示
	 */
	private static boolean programs_display = false;
	
	/**
	 * 版本号显示
	 */
	private static boolean versions_display = false;
	
	/**
	 * 作者显示
	 */
	private static boolean author_display = false;
	
	/**
	 * 支持显示
	 */
	private static boolean support_display = false;
	
	/**
	 * 邮箱显示
	 */
	private static boolean email_display = false;

	/**
	 * @param arg0
	 */
	public GppAbout(Frame arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppAbout(Dialog arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppAbout(Window arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Frame arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Frame arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Dialog arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Dialog arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Window arg0, ModalityType arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppAbout(Window arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppAbout(Frame arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppAbout(Dialog arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppAbout(Window arg0, String arg1, ModalityType arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppAbout(Frame arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppAbout(Dialog arg0, String arg1, boolean arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppAbout(Window arg0, String arg1, ModalityType arg2,
			GraphicsConfiguration arg3) {
		super(arg0, arg1, arg2, arg3);
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
//			jLabel4 = new JLabel();
//			jLabel4.setBounds(new Rectangle(22, 117, 333, 23));
//			jLabel4.setToolTipText("获取更多支持");
//			jLabel4
//					.setText("<html> 支         持：<a   href='"+support+"'>"+support+"</a></html>");
//			jLabel4.addMouseListener(new MouseAdapter() {
//				public void mouseClicked(MouseEvent e) {
//					
//					try {
//						String   url   =   support; 
//						Runtime.getRuntime().exec( "explorer   "   +   url); 
//					} catch (Exception ex) {
//						ex.printStackTrace();
//					}
//				}
//			});
			
//			jLabel3 = new JLabel();
//			jLabel3.setBounds(new Rectangle(22, 152, 333, 20));
//			jLabel3.setToolTipText("邮件联系");
//			jLabel3.setText("<html>E-Mail :<a href=''> "+email+"</a></html>");
//			jLabel3.addMouseListener(new MouseAdapter() {
//				public void mouseClicked(MouseEvent e) {
//					
//					try {
//						String   url   =   "mailto:"+email; 
//						Runtime.getRuntime().exec( "cmd /c start  "   +   url); 
//					} catch (Exception ex) {
//						ex.printStackTrace();
//					}
//				}
//			});
			
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(22, 90, 333, 19));
			jLabel2.setText("技术支持：李业钦");
			
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(22, 122, 333, 20));
			jLabel3.setText("QQ:1483695671");
			
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(22, 50, 333, 22));
			jLabel1.setText("版    本：V1.2");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(22, 18, 333, 24));
			jLabel.setText("程序名称：快译农保信息处理系统");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			
//			jLabel.setVisible(programs_display);
//			jLabel1.setVisible(versions_display);
//			jLabel2.setVisible(author_display);
//			jLabel3.setVisible(support_display);
//			jLabel4.setVisible(email_display);
			
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(jLabel3, null);
//			jPanel.add(jLabel4, null);

			
		}
		return jPanel;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(376, 238);
		this.setTitle("关于本系统");
		this.setContentPane(getJContentPane());
		this.setLocation(MainFrame.getMainFrameLocation());
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
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	public static String getPrograms() {
		return programs;
	}

	public static void setPrograms(String programs) {
		GppAbout.programs = programs;
	}

	public static String getVersions() {
		return versions;
	}

	public static void setVersions(String versions) {
		GppAbout.versions = versions;
	}

	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		GppAbout.author = author;
	}

	public static String getSupport() {
		return support;
	}

	public static void setSupport(String support) {
		GppAbout.support = support;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		GppAbout.email = email;
	}

	public static boolean isPrograms_display() {
		return programs_display;
	}

	public static void setPrograms_display(boolean programsDisplay) {
		programs_display = programsDisplay;
	}

	public static boolean isVersions_display() {
		return versions_display;
	}

	public static void setVersions_display(boolean versionsDisplay) {
		versions_display = versionsDisplay;
	}

	public static boolean isAuthor_display() {
		return author_display;
	}

	public static void setAuthor_display(boolean authorDisplay) {
		author_display = authorDisplay;
	}

	public static boolean isSupport_display() {
		return support_display;
	}

	public static void setSupport_display(boolean supportDisplay) {
		support_display = supportDisplay;
	}

	public static boolean isEmail_display() {
		return email_display;
	}

	public static void setEmail_display(boolean emailDisplay) {
		email_display = emailDisplay;
	}

} // @jve:decl-index=0:visual-constraint="170,116"
