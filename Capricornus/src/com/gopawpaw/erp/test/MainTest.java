/**
 * 
 */
package com.gopawpaw.erp.test;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.hibernate.c.CodeMstr;
import com.gopawpaw.erp.hibernate.c.CodeMstrDAO;
import com.gopawpaw.erp.hibernate.m.MntDet;
import com.gopawpaw.erp.hibernate.m.MntDetDAO;
import com.gopawpaw.erp.hibernate.p.PlMstr;
import com.gopawpaw.erp.hibernate.p.PlMstrDAO;
import com.gopawpaw.javax.swing.GppJFrame;

/**
 * @version 2010-4-4
 * @author Àî½õ»ª
 *
 */
public class MainTest extends GppJFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JButton jButton = null;
	private JScrollPane jScrollPane = null;
	private JTextArea jTextArea = null;

	/**
	 * @throws HeadlessException
	 */
	public MainTest() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public MainTest(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public MainTest(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public MainTest(String arg0, GraphicsConfiguration arg1) {
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
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getJButton(), gridBagConstraints);
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
			jButton.setText("²éÑ¯");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
//					ClassPathXmlApplicationContext glb_ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");  //  @jve:decl-index=0:
//					 testMntDetDAO();
//					testPlMstrDAO();
					testCodeMstr();
//					Pt_part_type pt = new Pt_part_type();
//					pt.getPt_Part_type();
					
				}
			});
		}
		return jButton;
	}
	
	private void testMntDetDAO(){
		MntDetDAO mntDAO = MntDetDAO.getFromApplicationContext(GlobalParameter.getAppContextXMLClass("MntDetDAO"));
		List<?> l = mntDAO.findAll();
		
		for(Object o:l){
			getJTextArea().append(((MntDet)o).getId().getMntNbr()+"."+((MntDet)o).getId().getMntSelect()+":"+((MntDet)o).getMntLabel()+"\n");
		}
	}

	private void testPlMstrDAO(){
		PlMstrDAO dao = PlMstrDAO.getFromApplicationContext(GlobalParameter.getAppContextXMLClass("PlMstrDAO"));
		List l = dao.findAll();
		
		for(Object o:l){
			getJTextArea().append(((PlMstr)o).getId().getPlProdLine()+"\n");
		}
	}
	
	private void testCodeMstr(){
		CodeMstrDAO dao = CodeMstrDAO.getFromApplicationContext(GlobalParameter.getAppContextXMLClass("CodeMstr"));
		List l = dao.findAll();
		
		for(Object o:l){
			getJTextArea().append(((CodeMstr)o).getId().getCodeFldname()+":"+((CodeMstr)o).getId().getCodeValue()+"\n");
		}
	}
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTextArea());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainTest thisClass = new MainTest();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
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
			jContentPane.add(getJPanel(), BorderLayout.SOUTH);
			jContentPane.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

}
