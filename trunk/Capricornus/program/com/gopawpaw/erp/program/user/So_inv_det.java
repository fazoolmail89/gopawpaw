/**
 * 
 */
package com.gopawpaw.erp.program.user;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.common.ReportParameterFrame;
import com.gopawpaw.erp.common.ReportParameterInterface;
import com.gopawpaw.erp.common.dev.DateSelect;
import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.util.HashMap;
import javax.swing.JScrollPane;

/**
 * @version 2010-5-15
 * @author 李锦华
 *
 */
public class So_inv_det extends ReportParameterFrame implements GppJarRunableInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3978923772581604454L;

	private DateSelect effdate = null;

	private JPanel jPanel = null;

	private JScrollPane jScrollPane = null;  //  @jve:decl-index=0:visual-constraint="369,238"
	/**
	 * @throws HeadlessException
	 */
	public So_inv_det() throws HeadlessException {
		initialize();
	}
		

	/**
	 * @param gc
	 */
	public So_inv_det(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public So_inv_det(String title) throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public So_inv_det(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        this.setSize(new Dimension(460, 121));
        this.setTitle("销售开票明细报表");
        this.setContentPanes(getJScrollPane());
			
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.erp.common.ReportParameterFrame#getReportParameter()
	 */
	@Override
	public ReportParameterInterface getReportParameter() {
		ReportParameterInterface rpe = new ReportParameterInterface(){

			@Override
			public HashMap<String, String> getReportParameterMap() {
				
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("domain", GlobalParameter.getLoginSession().getDomain());
				hm.put("effdate", effdate.getValues());
				hm.put("effdate2", effdate.getValues2());
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
					retstr = "access_report_so_inv_det.rptdesign";
				}else if(GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer){
					retstr = "sqlserver_report_so_inv_det.rptdesign";
				}else if(GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress){
					retstr = "progress_report_so_inv_det.rptdesign";
				}
				return retstr;
			}
			
		};
		return rpe;
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
			
			effdate = new DateSelect(this, DateSelect.EffDate);
			jPanel.add(effdate.getPanel());
			
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


	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+":"+args[1]);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				So_inv_det thisClass = new So_inv_det();
				thisClass.setDefaultCloseOperation(GppJFrame.HIDE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	@Override
	public boolean runJar(String[] args) {
		// TODO Auto-generated method stub
		So_inv_det.main(args);
		return false;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
