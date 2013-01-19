/**     
* @{#} UserLoginDialog.java Create on 2012-9-30 下午9:29:13     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.MainFrame;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserLoginDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2792075561640489319L;
	private MainFrame mainFrame;
	
	private JLabel lblUsername;
	private JTextField ttfUsername;
	
	private JLabel lblPassword;
	private JPasswordField pwfPassword;
	
	private JButton btnLogin;
	private JButton btnReset;
	
	//private JLabel lblStatus;
	//private JCheckBox ckbStatus;
	
	public UserLoginDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		initComponent();
		
		Box box = Box.createVerticalBox();
		box.add(LayoutUtil.getLayoutPanel(lblUsername, ttfUsername));
		box.add(LayoutUtil.getLayoutPanel(lblPassword, pwfPassword));
		box.add(LayoutUtil.getLayoutPanel(btnLogin, btnReset));
		
		add(box);
		
		setTitle("用户登入");
		setSize(300, 180);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	/**
	 * 初始化控件
	 */
	private void initComponent() {
		Dimension inputDim = new Dimension(150, 22);
		
		lblUsername = new JLabel("账号");
		ttfUsername = new JTextField();
		ttfUsername.setPreferredSize(inputDim);
		
		lblPassword = new JLabel("密码");
		pwfPassword = new JPasswordField();
		pwfPassword.setPreferredSize(inputDim);
		
		btnLogin = new JButton("登入");
		btnReset = new JButton("重置");
		
		btnLogin.addActionListener(new LoginActionListener());
		btnReset.addActionListener(new ResetActionListener());
	}
	
	class ResetActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ttfUsername.setText("");
			pwfPassword.setText("");
		}
	}
	
	class LoginActionListener implements ActionListener {
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			UserDAO ud = new UserDAO();
			User loginUser = null; 
			if(APPLog.IS_DEBUG){
				loginUser = new User();
				loginUser.setId(1);
				loginUser.setUsername("admin");
				loginUser.setPassword("admin");
				loginUser.setStatus(1);
			}else{
				loginUser = ud.Login(ttfUsername.getText().trim(), pwfPassword.getText());
			}
			
			if(loginUser == null) {
				JOptionPane.showMessageDialog(null, 
						"登入失败：账号不存在，或者密码错误！", 
						"登入提示！",
						JOptionPane.ERROR_MESSAGE);
			} else {
				if(loginUser.getStatus() == 0) {
					JOptionPane.showMessageDialog(null, 
							"登入失败：账号已过期！", 
							"登入提示！",
							JOptionPane.ERROR_MESSAGE);					
				} else {
					mainFrame.setLoginUser(loginUser);
					JOptionPane.showMessageDialog(null, 
							"登入成功！", 
							"登入提示！",
							JOptionPane.PLAIN_MESSAGE);	
					dispose();
				}
			}
		}
	}
}
