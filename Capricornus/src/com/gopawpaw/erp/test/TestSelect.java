/**
 * 
 */
package com.gopawpaw.erp.test;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.common.SelectDialog;
import com.gopawpaw.erp.common.dev.DateSelect;
import com.gopawpaw.erp.common.dev.Pl_prod_line;
import com.gopawpaw.erp.common.dev.Pt_part;
import com.gopawpaw.erp.common.dev.Pt_part_type;
import com.gopawpaw.erp.common.dev.Si_site;
import com.gopawpaw.erp.common.dev.Wo_nbr;
import com.gopawpaw.erp.hibernate.m.MntDet;
import com.gopawpaw.erp.hibernate.m.MntDetDAO;
import java.awt.GridBagLayout;
import java.awt.Dimension;

/**
 * @version 2010-4-17
 * @author 李锦华
 *
 */
public class TestSelect extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JPanel jPanel = null;

	/**
	 * @throws HeadlessException
	 */
	public TestSelect() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public TestSelect(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public TestSelect(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public TestSelect(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		initialize();
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
			jContentPane.add(getJButton(), BorderLayout.SOUTH);
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
			
//			Vector<String> cname = new Vector<String>(8);
//			cname.add("菜单");
//			cname.add("选择");
//			cname.add("标签");
//			
//			Vector<Vector<String>> vesource = new Vector<Vector<String>>();
//			
//			MntDetDAO mntDAO = MntDetDAO.getFromApplicationContext(GlobalParameter.getAppContextXMLClass("MntDetDAO"));
//			List<?> l = mntDAO.findAll();
//			
//			for(Object o:l){
////				getJTextArea().append(((MntDet)o).getId().getMntNbr()+"."+((MntDet)o).getId().getMntSelect()+":"+((MntDet)o).getMntLabel()+"\n");
//				Vector<String> temve = new Vector<String>(8);
//				temve.add(((MntDet)o).getId().getMntNbr());
//				temve.add(((MntDet)o).getId().getMntSelect().toString());
//				temve.add(((MntDet)o).getMntLabel());
//				
//				vesource.add(temve);
//			}
////			SelectDialog sd = new SelectDialog(Gpp_ThisJFrame,"查询",true,cname,vesource);
//			
//			DataSelectObject dso = new DataSelectObject("物料：",DataSelectObject.dataType_txt,cname,vesource,"菜单",this,"");
////			DataSelectObject dso = new DataSelectObject("物料：",DataSelectObject.dataType_date);
//			dso.getTextField().setText("www");
			

			
//			jContentPane.add(pt_part_type.getTOLabel(), BorderLayout.CENTER);
			
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
		}
		return jButton;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
			
			Pt_part_type pt_part_type = new Pt_part_type(this);
			Pl_prod_line pl_prod_line = new Pl_prod_line(this);
			Pt_part pt_part = new Pt_part(this);
			DateSelect effdate = new DateSelect(this,DateSelect.EffDate);
			DateSelect trdate = new DateSelect(this,DateSelect.TrDate);
			Si_site si_Site = new Si_site(this);
			Wo_nbr wo_nbr = new Wo_nbr(this);
			
//			Pt_part_type pt_part_type2 = new Pt_part_type(this);
//			Pl_prod_line pl_prod_line2 = new Pl_prod_line(this);
//			Pt_part pt_part2 = new Pt_part(this);
//			DateSelect effdate2 = new DateSelect(this,DateSelect.EffDate);
//			DateSelect trdate2 = new DateSelect(this,DateSelect.TrDate);
//			Si_site si_Site2 = new Si_site(this);
//			Wo_nbr wo_nbr2 = new Wo_nbr(this);
			
			jPanel.add(pt_part_type.getPanel());
			jPanel.add(pl_prod_line.getPanel());
			jPanel.add(pt_part.getPanel());
			jPanel.add(effdate.getPanel());
			jPanel.add(trdate.getPanel());
			jPanel.add(si_Site.getPanel());
			jPanel.add(wo_nbr.getPanel());
			
//			jPanel.add(pt_part_type.getTOLabel());
//			jPanel.add(pl_prod_line.getTOLabel());
//			jPanel.add(pt_part.getTOLabel());
//			jPanel.add(effdate.getTOLabel());
//			jPanel.add(trdate.getTOLabel());
//			jPanel.add(si_Site.getTOLabel());
//			jPanel.add(wo_nbr.getTOLabel());
			
//			jPanel.add(pt_part_type2.getSelectPanelNoLabel());
//			jPanel.add(pl_prod_line2.getSelectPanelNoLabel());
//			jPanel.add(pt_part2.getSelectPanelNoLabel());
//			jPanel.add(effdate2.getSelectPanelNoLabel());
//			jPanel.add(trdate2.getSelectPanelNoLabel());
//			jPanel.add(si_Site2.getSelectPanelNoLabel());
//			jPanel.add(wo_nbr2.getSelectPanelNoLabel());
			
			
		}
		return jPanel;
	}

}  //  @jve:decl-index=0:
