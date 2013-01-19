/**     
* @{#} UserLoginDialog.java Create on 2012-9-30 ����9:29:13     
*     
* Copyright (c) 2012 by ¬����.     
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
 * @author ¬���� luxiangqi521@gmail.com    
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
		
		setTitle("�û�����");
		setSize(300, 180);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	/**
	 * ��ʼ���ؼ�
	 */
	private void initComponent() {
		Dimension inputDim = new Dimension(150, 22);
		
		lblUsername = new JLabel("�˺�");
		ttfUsername = new JTextField();
		ttfUsername.setPreferredSize(inputDim);
		
		lblPassword = new JLabel("����");
		pwfPassword = new JPasswordField();
		pwfPassword.setPreferredSize(inputDim);
		
		btnLogin = new JButton("����");
		btnReset = new JButton("����");
		
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
						"����ʧ�ܣ��˺Ų����ڣ������������", 
						"������ʾ��",
						JOptionPane.ERROR_MESSAGE);
			} else {
				if(loginUser.getStatus() == 0) {
					JOptionPane.showMessageDialog(null, 
							"����ʧ�ܣ��˺��ѹ��ڣ�", 
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);					
				} else {
					mainFrame.setLoginUser(loginUser);
					JOptionPane.showMessageDialog(null, 
							"����ɹ���", 
							"������ʾ��",
							JOptionPane.PLAIN_MESSAGE);	
					dispose();
				}
			}
		}
	}
}
