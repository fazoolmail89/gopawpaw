/**
 * 
 */
package com.gopawpaw.erp.program.mygui11;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import com.gopawpaw.dev.common.GppJarRunableInterface;

import com.gopawpaw.erp.common.dev.DateSelect;
import com.gopawpaw.erp.common.dev.Pl_prod_line;
import com.gopawpaw.erp.common.dev.Pt_part;
import com.gopawpaw.erp.common.dev.Pt_part_type;
import com.gopawpaw.erp.common.dev.Si_site;
import com.gopawpaw.erp.common.dev.Wo_nbr;
import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

/**
 * @version 2010-4-16
 * @author 李锦华
 * 
 */
public class Mygui11Main extends GppJFrame implements GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8936229390253969809L;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JScrollPane jScrollPane = null;
	private JPanel jPanel2 = null;
	private JButton jButton = null;

	private Pt_part_type pt_part_type = null;
	private Pl_prod_line pl_prod_line = null;
	private Pt_part pt_part = null;
	private DateSelect effdate = null;
	private DateSelect trdate = null;
	private Si_site si_Site = null;
	private Wo_nbr wo_nbr = null;

	/**
	 * @throws HeadlessException
	 */
	public Mygui11Main() throws HeadlessException {
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param gc
	 */
	public Mygui11Main(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Mygui11Main(String title) throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public Mygui11Main(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(new Dimension(628, 290));
		this.setTitle("收发存报表");
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
			// jPanel.add(getJPanel(), BorderLayout.SOUTH);
			jPanel.add(getJScrollPane(), BorderLayout.NORTH);
			jPanel.add(getJPanel2(), BorderLayout.SOUTH);
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
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));

			pt_part_type = new Pt_part_type(this);
			pl_prod_line = new Pl_prod_line(this);
			pt_part = new Pt_part(this);
			effdate = new DateSelect(this, DateSelect.EffDate);
			trdate = new DateSelect(this, DateSelect.TrDate);
			si_Site = new Si_site(this);
			wo_nbr = new Wo_nbr(this);

			jPanel1.add(pt_part_type.getPanel());
			jPanel1.add(pl_prod_line.getPanel());
			jPanel1.add(pt_part.getPanel());
			jPanel1.add(effdate.getPanel());
			jPanel1.add(trdate.getPanel());
			jPanel1.add(si_Site.getPanel());
			jPanel1.add(wo_nbr.getPanel());

		}
		return jPanel1;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJPanel1());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jPanel2
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel2 = new JPanel();
			jPanel2.setLayout(new GridBagLayout());
			jPanel2.add(getJButton(), gridBagConstraints);
		}
		return jPanel2;
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
					System.out.println("pt_part_type:"
							+ pt_part_type.getValues() + " pt_part_type2:"
							+ pt_part_type.getValues2());
					
					System.out.println("pl_prod_line:"
							+ pl_prod_line.getValues() + " pl_prod_line2:"
							+ pl_prod_line.getValues2());
					
					System.out.println("pt_part:"
							+ pt_part.getValues() + " pt_part2:"
							+ pt_part.getValues2());
					
					System.out.println("effdate:"
							+ effdate.getValues() + " effdate2:"
							+ effdate.getValues2());
					
					System.out.println("trdate:"
							+ trdate.getValues() + " trdate2:"
							+ trdate.getValues2());
					
					System.out.println("si_Site:"
							+ si_Site.getValues() + " si_Site2:"
							+ si_Site.getValues2());
					
					System.out.println("wo_nbr:"
							+ wo_nbr.getValues() + " wo_nbr2:"
							+ wo_nbr.getValues2());

				}
			});
		}
		return jButton;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mygui11Main thisClass = new Mygui11Main();
				thisClass.setDefaultCloseOperation(GppJFrame.HIDE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});

	}

	@Override
	public boolean runJar(String[] args) {
		Mygui11Main.main(args);
		return false;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
