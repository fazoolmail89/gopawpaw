/**
 * 
 */
package com.gopawpaw.erp.program.report.receivingDispensingPreserving;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.erp.GppMainFrame;
import com.gopawpaw.javax.swing.GppJFrame;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

/**
 * @version 2010-4-7
 * @author 李锦华
 *
 */
public class ReceivingDispensingPreservingTotalw extends GppJFrame implements GppJarRunableInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6302214085785316234L;

	/**
	 * @throws HeadlessException
	 */
	public ReceivingDispensingPreservingTotalw() throws HeadlessException {
		// TODO Auto-generated constructor stub
		initialize();
	}
		

	/**
	 * @param gc
	 */
	public ReceivingDispensingPreservingTotalw(GraphicsConfiguration gc) {
		super(gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public ReceivingDispensingPreservingTotalw(String title)
			throws HeadlessException {
		super(title);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param gc
	 */
	public ReceivingDispensingPreservingTotalw(String title,
			GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
        this.setSize(new Dimension(483, 191));
        this.setLocation(300, 100);
        this.setTitle("收发存汇总报表wwww");
			
	}
	@Override
	public boolean runJar(String[] args) {
		ReceivingDispensingPreservingTotalw.main(args);
		return false;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ReceivingDispensingPreservingTotalw thisClass = new ReceivingDispensingPreservingTotalw();
				thisClass.setDefaultCloseOperation(GppJFrame.HIDE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
