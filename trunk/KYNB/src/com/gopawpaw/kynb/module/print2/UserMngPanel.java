/**     
* @{#} UserMngPanel.java Create on 2012-9-30 ����9:35:10     
*     
* Copyright (c) 2012 by ¬����.     
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
 * @author ¬���� luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserMngPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6896101837246194894L;
	
	private MainFrame mainFrame;
	private JButton btnLogin = new JButton("����");
	private JButton btnPasswd = new JButton("����");
	private JButton btnMng = new JButton("����");
	
	public UserMngPanel(MainFrame mf) {
		this.mainFrame = mf;
		setBorder(BorderFactory.createTitledBorder("�û�����"));
		
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
							"����Ȩ���������ȵ��룡", 
							"������ʾ��",
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
							"����Ȩ������ֻ��[ admin ]�˺ſ��Զ��û����й���", 
							"������ʾ��",
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
