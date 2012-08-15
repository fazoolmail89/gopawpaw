/**     
* @{#} PtSetDialog.java Create on 2012-8-15 ÉÏÎç2:02:37     
*     
* Copyright (c) 2012 by luxiangqi.     
*/   

package com.gopawpaw.kynb.module.print2;

import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;

/**     
 * @author luxiangqi luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PtSetDialog extends JDialog {
	private static final long serialVersionUID = 2373365918782990387L;
	private MainFrame mainFrame;
	public PtSetDialog(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 0);
		setSize(600, 700);
		setModal(true);
		setVisible(true);
	}
}
