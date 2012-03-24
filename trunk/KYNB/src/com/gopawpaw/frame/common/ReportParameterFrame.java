/**
 * 
 */
package com.gopawpaw.frame.common;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.GppReportBrowser;
import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

/**
 * @version 2010-4-22
 * @author 李锦华
 * 
 */
public abstract class ReportParameterFrame extends GppJFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3050554943874284928L;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;

	/**
	 * @throws HeadlessException
	 */
	public ReportParameterFrame() throws HeadlessException {
		initialize();
	}

	/**
	 * @param gc
	 */
	public ReportParameterFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public ReportParameterFrame(String title) throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public ReportParameterFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(new Dimension(531, 193));
		this.setContentPane(getJPanel());
		this.setJMenuBar(getJJMenuBar());
//		this.setLocation(GppMainFrame.getMainFrameLocation());
	}

	/**
	 * 设置参数面板
	 */
	public void setContentPanes(Container ct) {

		getJPanel().add(ct, BorderLayout.CENTER);

		this.setContentPane(getJPanel());
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BorderLayout());
			jPanel.add(getJPanel1(), BorderLayout.SOUTH);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = 0;
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GridBagLayout());
			jPanel1.add(getJButton(), new GridBagConstraints());
			jPanel1.add(getJButton1(), gridBagConstraints);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("打印");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					outputReport();
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
					Gpp_ThisJFrame.setVisible(false);
				}
			});
		}
		return jButton1;
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
			jMenu.setText("M");
		}
		return jMenu;
	}

	/**
	 * 输出报表
	 */
	private boolean outputReport() {
		ReportParameterInterface rpi = getReportParameter();

		String userdir = rpi.getUserReportDir();
		String rptname = rpi.getReportName();
		HashMap<String, String> hm = rpi.getReportParameterMap();

		String httpurl = GlobalParameter.getReportHttpURL()
				+ "/frameset?__report=" 
				+ GlobalParameter.getReportDir();
		
		//如果指定用户报表目录
		if(!userdir.isEmpty() || userdir != null){
			httpurl = httpurl +"/"+ userdir;
		}
		httpurl = httpurl +"/"+ rptname;
		
		String param = "";
		//参数不为空
		if(!hm.isEmpty() && hm != null){
			Iterator<String> itkey = hm.keySet().iterator();
			
			while(itkey.hasNext()){
				
				String temkey = (String) itkey.next();
				String temval = hm.get(temkey);
				
				try {
					temval = java.net.URLEncoder.encode(temval, "UTF-8");
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
				
				param = param + "&"+temkey+"="+temval;
			}
			
		}
		
		httpurl = httpurl + param;
		
		GppReportBrowser grb = new GppReportBrowser();
		grb.setURL(httpurl);
		grb.runReport();

		return false;
	}

	/**
	 * 获取报表参数，该方法必须在子类重写
	 */
	public abstract ReportParameterInterface getReportParameter();

} // @jve:decl-index=0:visual-constraint="10,10"
