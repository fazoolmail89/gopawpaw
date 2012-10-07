/**     
* @{#} UserEditDialog.java Create on 2012-9-30 下午9:31:43     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.gopawpaw.kynb.common.DialogUtil;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserEditDialog extends JDialog {
	private static final long serialVersionUID = 946730946489270604L;
	public static final int OPT_ADD = 2;
	public static final int OPT_UPD = 1;
	public static final int OPT_VEW = 0;
	
	private int opt;
	
	private User user;
	
	private UserMngDialog userMD;
	
	private JLabel lblId;
	private JTextField ttfId;
	
	private JLabel lblUsername;
	private JTextField ttfUsername;
	
	private JLabel lblPassworld;
	private JPasswordField pwfPassworld;
	
	private JLabel lblStatus;
	private JCheckBox ckbStatus;
	
	private JPanel pnlBottom;
	private JButton btnOk;
	private JButton btnQuit;
	private JButton btnClose;
	
	public UserEditDialog(UserMngDialog userMD, User user, int opt, String title) {
		this.userMD = userMD;
		this.user = user;
		this.opt = opt;
		initComponent();
		initPnlBottom();
		loadUser();
		
		Box box = Box.createVerticalBox();
		box.add(LayoutUtil.getLayoutPanelDefDim(lblId, ttfId));
		box.add(LayoutUtil.getLayoutPanelDefDim(lblUsername, ttfUsername));
		box.add(LayoutUtil.getLayoutPanelDefDim(lblPassworld, pwfPassworld));
		box.add(LayoutUtil.getLayoutPanelDefDim(lblStatus, ckbStatus));
		
		setLayout(new BorderLayout());
		add(box, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.SOUTH);
		
		setTitle(title);
		setSize(300, 200);
		DialogUtil.setDialogLocaltion(this);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
		
	}
	
	private void initComponent() {
		  lblId = new JLabel("序号");
		  ttfId = new JTextField("自动编号"); 
		  ttfId.setEditable(false);
		
		  lblUsername = new JLabel("账号");
		  ttfUsername = new JTextField();
		
		  lblPassworld = new JLabel("密码");
		  pwfPassworld = new JPasswordField();
		
		  lblStatus = new JLabel("是否有效");
		  ckbStatus = new JCheckBox("有效");
		  ckbStatus.setSelected(true);
	}
	
	private void initPnlBottom() {
		pnlBottom = new JPanel();
		  btnOk = new JButton("确定");
		  btnQuit = new JButton("取消");	
		  btnClose = new JButton("关闭");
		  
		  btnOk.addActionListener(new BtnOkActionListener());
		  btnQuit.addActionListener(new BtnQuitActionListener());
		  btnClose.addActionListener(new BtnCloseActionListener());
		  
		  if(opt == OPT_VEW) {
			  pnlBottom.add(btnClose);
		  } else {
			  pnlBottom.add(btnOk);
			  pnlBottom.add(btnQuit);
		  }
	}
	
	private void loadUser() {
		if(user != null && opt != 2) {
			ttfId.setText(String.valueOf(user.getId()));
			ttfUsername.setText(user.getUsername());
			pwfPassworld.setText(user.getPassword());
			if(user.getStatus() == 1)
				ckbStatus.setSelected(true);
			else
				ckbStatus.setSelected(false);
		}
	}
	
	@SuppressWarnings("deprecation")
	private User getUserToSave() {
		User newUser = new User();
		if(opt == OPT_UPD) {
			newUser.setId(Integer.parseInt(ttfId.getText().trim()));
		}
		newUser.setUsername(ttfUsername.getText().trim());
		newUser.setPassword(pwfPassworld.getText());
		if(ckbStatus.isSelected())
			newUser.setStatus(1);
		else
			newUser.setStatus(0);
		
		return newUser;
	}
	
	@SuppressWarnings("deprecation")
	private boolean dataValidate() {
		DataValidate dv = new DataValidate();
		String error = null;
		//用户名验证
		//----------------------------------------------------------------------------
		if(user != null) {
			error = dv.CheckUsername(ttfUsername.getText().trim(), user.getUsername());
		} else {
			error = dv.CheckUsername(ttfUsername.getText().trim(), null);
		}
		
		if(error != null) {
			//设置焦点
			ttfUsername.requestFocus();
			//提示用户
			JOptionPane.showMessageDialog(null, 
					error, 
					"操作提示！",
					JOptionPane.ERROR_MESSAGE);	
			//退出当前方法，返回false
			return false;
		}
		//----------------------------------------------------------------------------
		
		//验证密码
		//----------------------------------------------------------------------------
		if(error == null) {
			error = dv.CheckPassword(pwfPassworld.getText());
		}
		
		if(error != null) {
			//设置焦点
			pwfPassworld.requestFocus();
			//提示用户
			JOptionPane.showMessageDialog(null, 
					error, 
					"操作提示！",
					JOptionPane.ERROR_MESSAGE);	
			//退出当前方法，返回false
			return false;
		}
		
		return true;
	}

	class BtnOkActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(!dataValidate()) return;
			
			if(opt == OPT_ADD) {
				UserDAO ud = new UserDAO();
				if(ud.save(getUserToSave())) {
					JOptionPane.showMessageDialog(null, 
							"数据保存成功，自动关闭编辑窗口！", 
							"操作提示！",
							JOptionPane.PLAIN_MESSAGE);	
					userMD.getSpnUserL().refreshTable();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, 
							"数据保存失败！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);	
				}
			}
			
			if(opt == OPT_UPD) {
				int rv = JOptionPane.showConfirmDialog(
						UserEditDialog.this, 
						"是否确认更新数据？",
						"操作提示！",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0) {
					UserDAO ud = new UserDAO();
					if(ud.update(getUserToSave())) {
						JOptionPane.showMessageDialog(null, 
								"数据保存成功，自动关闭编辑窗口！", 
								"操作提示！",
								JOptionPane.PLAIN_MESSAGE);	
						userMD.getSpnUserL().refreshTable();
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, 
								"数据保存失败！", 
								"操作提示！",
								JOptionPane.ERROR_MESSAGE);	
					}					
				}
			}
		}
	}
	
	class BtnQuitActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int rv = JOptionPane.showConfirmDialog(
					UserEditDialog.this, 
					"数据未保存是否确认退出？",
					"操作提示！",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.OK_CANCEL_OPTION);	
			if(rv == 0) dispose();
		}
	}
	
	class BtnCloseActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
