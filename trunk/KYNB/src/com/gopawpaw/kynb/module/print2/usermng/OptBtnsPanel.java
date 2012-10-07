/**     
* @{#} OptBtnsPanel.java Create on 2012-10-1 下午9:12:27     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.module.print2.MyStyle;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = 484067671680213181L;
	private UserMngDialog userMD;
	private JButton btnAdd = new JButton("新增");
	private JButton btnUpd = new JButton("修改");
	private JButton btnDel = new JButton("删除");
	
	public OptBtnsPanel(UserMngDialog umd) {
		this.userMD = umd;

		btnAdd.setMaximumSize(MyStyle.BTN_DIM);
		btnAdd.setFont(MyStyle.BTN_FONT_PLAIN);

		btnUpd.setMaximumSize(MyStyle.BTN_DIM);
		btnUpd.setFont(MyStyle.BTN_FONT_PLAIN);
		
		btnDel.setMaximumSize(MyStyle.BTN_DIM);
		btnDel.setFont(MyStyle.BTN_FONT_PLAIN);
		
		btnAdd.addActionListener(new BtnAddActionListener());		
		
		btnUpd.addActionListener(new BtnUpdActionListener());
		
		btnDel.addActionListener(new BtnDelActionListener());
		
		Box box = Box.createVerticalBox();
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		add(box);
		setBorder(BorderFactory.createTitledBorder("操作选项"));
	}
	
	/**
	 * 新增按钮事件监听类
	 * @author lxq
	 *
	 */
	class BtnAddActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new UserEditDialog(userMD, null, UserEditDialog.OPT_ADD, "新增用户");
		}
	}
	
	/**
	 * 修改按钮事件监听类
	 * @author lxq
	 *
	 */
	class BtnUpdActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			User user = userMD.getSpnUserL().getSelUser();
			if(user != null) {
				if(User.SUPER_ADMIN.equals(user.getUsername())) {
					JOptionPane.showMessageDialog(null, 
							"[ " + user.getUsername() + " ]为超级用户用户，不能修改！",
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);							
				} else {
					new UserEditDialog(userMD, user, UserEditDialog.OPT_UPD, "修改用户");
				}
			} else {
				JOptionPane.showMessageDialog(null, 
						"请先选中列表中的数据！", 
						"操作提示！",
						JOptionPane.ERROR_MESSAGE);	
			}
		}
	}	
	
	/**
	 * 删除按钮事件监听类
	 * @author lxq
	 *
	 */
	class BtnDelActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			User user = userMD.getSpnUserL().getSelUser();
			if(user != null) {
				if("admin".equals(user.getUsername())) {
					JOptionPane.showMessageDialog(null, 
							"[ " + user.getUsername() + " ]为超级用户用户，不能删除！",
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);							
				} else {
					int rv = JOptionPane.showConfirmDialog(
							userMD, 
							"是否确认删除[ " + user.getUsername() + " ]用户？",
							"操作提示！",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					if(rv == 0) {
						UserDAO ud = new UserDAO();
						if(ud.delete(user)) {
							JOptionPane.showMessageDialog(null, 
									"删除成功！", 
									"操作提示！",
									JOptionPane.PLAIN_MESSAGE);	
							//刷新表格
							userMD.getSpnUserL().refreshTable();
						} else {
							JOptionPane.showMessageDialog(null, 
									"删除失败！", 
									"操作提示！",
									JOptionPane.ERROR_MESSAGE);							
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, 
						"请先选中列表中的数据！", 
						"操作提示！",
						JOptionPane.ERROR_MESSAGE);		
			}
		}
	}
}
