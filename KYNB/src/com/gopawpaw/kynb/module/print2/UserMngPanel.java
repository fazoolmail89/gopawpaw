/**     
* @{#} UserMngPanel.java Create on 2012-9-30 下午9:35:10     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.module.print2.usermng.PasswdUpdDialog;
import com.gopawpaw.kynb.module.print2.usermng.User;
import com.gopawpaw.kynb.module.print2.usermng.UserLoginDialog;
import com.gopawpaw.kynb.module.print2.usermng.UserMngDialog;


/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserMngPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6896101837246194894L;
	
	private MainFrame mainFrame;
	private JButton btnLogin = new JButton("登入");
	private JButton btnPasswd = new JButton("改密");
	private JButton btnMng = new JButton("管理");
	
	public UserMngPanel(MainFrame mf) {
		this.mainFrame = mf;
		setBorder(BorderFactory.createTitledBorder("用户操作"));
		
		btnLogin.setMaximumSize(MyStyle.BTN_DIM);
		btnLogin.setFont(MyStyle.BTN_FONT_PLAIN);

		btnPasswd.setMaximumSize(MyStyle.BTN_DIM);
		btnPasswd.setFont(MyStyle.BTN_FONT_PLAIN);
		
		btnMng.setMaximumSize(MyStyle.BTN_DIM);
		btnMng.setFont(MyStyle.BTN_FONT_PLAIN);
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserLoginDialog(mainFrame);
			}
		});
		
		btnPasswd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mainFrame.getLoginUser() != null)
					new PasswdUpdDialog(mainFrame);
				else
					JOptionPane.showMessageDialog(null, 
							"您无权操作，请先登入！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);	
			}
		});
		
		btnMng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mainFrame.getLoginUser() != null && 
						User.SUPER_ADMIN.equals(mainFrame.getLoginUser().getUsername()))
					new UserMngDialog(mainFrame);
				else
					JOptionPane.showMessageDialog(null, 
							"您无权操作，只有[ admin ]账号可以对用户进行管理！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);
					
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnLogin);
		box.add(btnPasswd);
		box.add(btnMng);
		
		add(box);
	}
}
