/**
 * 
 */
package com.gopawpaw.erp.program.mygui11;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.common.ReportParameterFrame;
import com.gopawpaw.erp.common.ReportParameterInterface;
import com.gopawpaw.erp.common.dev.DateSelect;
import com.gopawpaw.erp.common.dev.Pl_prod_line;
import com.gopawpaw.erp.common.dev.Pt_part;
import com.gopawpaw.erp.common.dev.Pt_part_type;
import com.gopawpaw.erp.common.dev.Si_site;
import com.gopawpaw.erp.common.dev.Wo_nbr;
import com.gopawpaw.javax.swing.GppJFrame;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 * @version 2010-4-22
 * @author 李锦华
 *
 */
public class Mygui11 extends ReportParameterFrame implements GppJarRunableInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4261173225229699299L;
	private JPanel jPanel = null;

	private Pt_part_type pt_part_type = null;
	private Pl_prod_line pl_prod_line = null;
	private Pt_part pt_part = null;
	private DateSelect effdate = null;
	private DateSelect trdate = null;
	private Si_site si_Site = null;
	private Wo_nbr wo_nbr = null;
	private JScrollPane jScrollPane = null;  //  @jve:decl-index=0:visual-constraint="39,310"
	/**
	 * @throws HeadlessException
	 */
	public Mygui11() throws HeadlessException {
		initialize();
	}
		

	/**
	 * @param gc
	 */
	public Mygui11(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Mygui11(String title) throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public Mygui11(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        this.setSize(new Dimension(541, 219));
        this.setTitle("收发存报表");
        this.setContentPanes(getJScrollPane());
        this.setLocation(300, 200);
			
	}


	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

			pt_part_type = new Pt_part_type(this);
			pl_prod_line = new Pl_prod_line(this);
			pt_part = new Pt_part(this);
			effdate = new DateSelect(this, DateSelect.EffDate);
			trdate = new DateSelect(this, DateSelect.TrDate);
			si_Site = new Si_site(this);
			wo_nbr = new Wo_nbr(this);

			jPanel.add(pt_part_type.getPanel());
			jPanel.add(pl_prod_line.getPanel());
//			jPanel.add(pt_part.getPanel());
			jPanel.add(effdate.getPanel());
//			jPanel.add(trdate.getPanel());
//			jPanel.add(si_Site.getPanel());
//			jPanel.add(wo_nbr.getPanel());
		}
		return jPanel;
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
	@Override
	public ReportParameterInterface getReportParameter() {
		ReportParameterInterface rpe = new ReportParameterInterface(){

			@Override
			public HashMap<String, String> getReportParameterMap() {
				
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("domian", GlobalParameter.getLoginSession().getDomain());
				hm.put("part_type", pt_part_type.getValues());
				hm.put("part_type2", pt_part_type.getValues2());
				
				hm.put("prod_line", pl_prod_line.getValues());
				hm.put("prod_line2", pl_prod_line.getValues2());
				
//				hm.put("pt_part", pt_part.getValues());
//				hm.put("pt_part2", pt_part.getValues2());
				
				hm.put("tr_effdate", effdate.getValues());
				hm.put("tr_effdate2", effdate.getValues2());
				
//				hm.put("trdate", trdate.getValues());
//				hm.put("trdate2", trdate.getValues2());
//				
//				hm.put("si_Site", si_Site.getValues());
//				hm.put("si_Site2", si_Site.getValues2());
//				
//				hm.put("wo_nbr", wo_nbr.getValues());
//				hm.put("wo_nbr2", wo_nbr.getValues2());
				
				return hm;
			}

			@Override
			public String getUserReportDir() {
				
				return "keer_report";
			}

			@Override
			public String getReportName() {
				String retstr = "";
				if(GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access){
					retstr = "access_report_keer_rdp.rptdesign";
				}else if(GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer){
					retstr = "sqlserver_report_keer_rdp.rptdesign";
				}else if(GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress){
					retstr = "progress_report_keer_rdp.rptdesign";
				}
				System.out
						.println("Mygui11.getReportParameter().getReportName():"+retstr);
				return retstr;
			}
			
		};
		return rpe;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mygui11 thisClass = new Mygui11();
				thisClass.setDefaultCloseOperation(GppJFrame.HIDE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});

	}

	@Override
	public boolean runJar(String[] args) {
		Mygui11.main(args);
		return false;
	}



}  //  @jve:decl-index=0:visual-constraint="10,10"
