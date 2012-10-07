/**     
* @{#} PasswdUpdDialog.java Create on 2012-9-30 下午9:32:20     
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

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.MainFrame;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PasswdUpdDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8980565512528947781L;
	
	private MainFrame mainFrame;
	private JLabel lblOld;
	private JPasswordField pwfOld;
	
	private JLabel lblNew;
	private JPasswordField pwfNew;
	
	private JLabel lblRe;
	private JPasswordField pwfRe;
	
	private JButton btnOk;
	private JButton btnResult;
	
	public PasswdUpdDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		initComponent();
		
		Box box = Box.createVerticalBox();
		box.add(LayoutUtil.getLayoutPanel(lblOld, pwfOld));
		box.add(LayoutUtil.getLayoutPanel(lblNew, pwfNew));
		box.add(LayoutUtil.getLayoutPanel(lblRe, pwfRe));
		box.add(LayoutUtil.getLayoutPanel(btnOk, btnResult));
		
		add(box);
		
		setTitle("修改密码");
		setSize(300, 180);
		DialogUtil.setDialogLocaltion(mainFrame, this);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	/**
	 * 初始化控件 
	 */
	private void initComponent() {
		Dimension dimLbl = new Dimension(50, 22);
		Dimension dimInp = new Dimension(150, 22);
		
		lblOld = new JLabel("旧密码");
		lblOld.setPreferredSize(dimLbl);
		pwfOld = new JPasswordField();
		pwfOld.setPreferredSize(dimInp);
		
		lblNew = new JLabel("新密码");
		lblNew.setPreferredSize(dimLbl);
		pwfNew = new JPasswordField();
		pwfNew.setPreferredSize(dimInp);
		
		lblRe = new JLabel("确认密码");
		lblRe.setPreferredSize(dimLbl);
		pwfRe = new JPasswordField();
		pwfRe.setPreferredSize(dimInp);
		
		btnOk = new JButton("确定");
		btnOk.addActionListener(new BtnOkActionListener());
		btnResult = new JButton("重置");
	}
	
	class BtnOkActionListener implements ActionListener {
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			if(mainFrame.getLoginUser().getPassword().equals(pwfOld.getText())) {
				String newPw = pwfNew.getText();
				if(!"".equals(newPw)) {
					if(newPw.equals(pwfRe.getText())) {
						mainFrame.getLoginUser().setPassword(newPw);
						UserDAO ud = new UserDAO();
						
						if(ud.update(mainFrame.getLoginUser())) {
							JOptionPane.showMessageDialog(null, 
									"密码修改成功！", 
									"操作提示！",
									JOptionPane.PLAIN_MESSAGE);	
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, 
									"操作失败！", 
									"操作提示！",
									JOptionPane.ERROR_MESSAGE);								
						}
					} else {
						//设置焦点 
						pwfRe.requestFocus();
						//提示用户
						JOptionPane.showMessageDialog(null, 
								"两次输入的密码不一致，请重新输入！", 
								"操作提示！",
								JOptionPane.ERROR_MESSAGE);							
					}
				} else {
					//设置焦点 
					pwfNew.requestFocus();
					//提示用户
					JOptionPane.showMessageDialog(null, 
							"密码不能为空，请重新输入！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);						
				}
			} else {
				//设置焦点 
				pwfOld.requestFocus();
				//提示用户
				JOptionPane.showMessageDialog(null, 
						"旧密码错误，请重新输入！", 
						"操作提示！",
						JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
	
	class BtnResultActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			pwfOld.setText("");
			pwfNew.setText("");
			pwfRe.setText("");
		}
	}
}
