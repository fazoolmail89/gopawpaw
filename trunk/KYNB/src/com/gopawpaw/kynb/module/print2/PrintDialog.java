/**     
* @{#} PrintDialog.java Create on 2012-8-16 ����1:23:22     
*     
* Copyright (c) 2012 by ¬����.     
*/   

package com.gopawpaw.kynb.module.print2;

import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;

/**     
 * @author ¬���� luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintDialog extends JDialog {
	private static final long serialVersionUID = -2816372067073195315L;
	private MainFrame mainFrame;
	
	public PrintDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		setTitle("��ӡԤ��");
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 0);
		setSize(500, 600);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
}
