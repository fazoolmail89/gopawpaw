/**     
* @{#} UserMngDialog.java Create on 2012-9-30 下午9:27:15     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import java.awt.BorderLayout;

import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.MainFrame;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserMngDialog extends JDialog {
	private static final long serialVersionUID = -8995119918490753105L;
	private MainFrame mainFrame;
	
	private UserListScrollPane spnUserL;
	private OptBtnsPanel pnlOptBtns;
	public UserMngDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		spnUserL = new UserListScrollPane(this);
		pnlOptBtns = new OptBtnsPanel(this);
		
		setLayout(new BorderLayout());
		add(spnUserL, BorderLayout.CENTER);
		add(pnlOptBtns, BorderLayout.EAST);
		
		setTitle("用户管理");
		setSize(300, 400);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		 
		// 固定大小
		setResizable(false);
		setModal(true);		
		setVisible(true);
	}
	public UserListScrollPane getSpnUserL() {
		return spnUserL;
	}
}
