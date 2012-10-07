/**     
* @{#} OptBtnsPanel.java Create on 2012-10-1 ����9:12:27     
*     
* Copyright (c) 2012 by ¬����.     
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
 * @author ¬���� luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = 484067671680213181L;
	private UserMngDialog userMD;
	private JButton btnAdd = new JButton("����");
	private JButton btnUpd = new JButton("�޸�");
	private JButton btnDel = new JButton("ɾ��");
	
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
		setBorder(BorderFactory.createTitledBorder("����ѡ��"));
	}
	
	/**
	 * ������ť�¼�������
	 * @author lxq
	 *
	 */
	class BtnAddActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new UserEditDialog(userMD, null, UserEditDialog.OPT_ADD, "�����û�");
		}
	}
	
	/**
	 * �޸İ�ť�¼�������
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
							"[ " + user.getUsername() + " ]Ϊ�����û��û��������޸ģ�",
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);							
				} else {
					new UserEditDialog(userMD, user, UserEditDialog.OPT_UPD, "�޸��û�");
				}
			} else {
				JOptionPane.showMessageDialog(null, 
						"����ѡ���б��е����ݣ�", 
						"������ʾ��",
						JOptionPane.ERROR_MESSAGE);	
			}
		}
	}	
	
	/**
	 * ɾ����ť�¼�������
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
							"[ " + user.getUsername() + " ]Ϊ�����û��û�������ɾ����",
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);							
				} else {
					int rv = JOptionPane.showConfirmDialog(
							userMD, 
							"�Ƿ�ȷ��ɾ��[ " + user.getUsername() + " ]�û���",
							"������ʾ��",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					if(rv == 0) {
						UserDAO ud = new UserDAO();
						if(ud.delete(user)) {
							JOptionPane.showMessageDialog(null, 
									"ɾ���ɹ���", 
									"������ʾ��",
									JOptionPane.PLAIN_MESSAGE);	
							//ˢ�±��
							userMD.getSpnUserL().refreshTable();
						} else {
							JOptionPane.showMessageDialog(null, 
									"ɾ��ʧ�ܣ�", 
									"������ʾ��",
									JOptionPane.ERROR_MESSAGE);							
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, 
						"����ѡ���б��е����ݣ�", 
						"������ʾ��",
						JOptionPane.ERROR_MESSAGE);		
			}
		}
	}
}
