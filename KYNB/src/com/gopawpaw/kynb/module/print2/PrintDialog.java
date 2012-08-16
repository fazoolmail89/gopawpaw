/**     
* @{#} PrintDialog.java Create on 2012-8-16 上午1:23:22     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;

import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintDialog extends JDialog {
	private static final long serialVersionUID = -2816372067073195315L;
	private MainFrame mainFrame;
	
	public PrintDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		setTitle("打印预备");
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 0);
		setSize(500, 600);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
}
