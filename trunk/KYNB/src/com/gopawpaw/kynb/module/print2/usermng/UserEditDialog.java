/**     
* @{#} UserEditDialog.java Create on 2012-9-30 ����9:31:43     
*     
* Copyright (c) 2012 by ¬����.     
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
 * @author ¬���� luxiangqi521@gmail.com    
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
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
		
	}
	
	private void initComponent() {
		  lblId = new JLabel("���");
		  ttfId = new JTextField("�Զ����"); 
		  ttfId.setEditable(false);
		
		  lblUsername = new JLabel("�˺�");
		  ttfUsername = new JTextField();
		
		  lblPassworld = new JLabel("����");
		  pwfPassworld = new JPasswordField();
		
		  lblStatus = new JLabel("�Ƿ���Ч");
		  ckbStatus = new JCheckBox("��Ч");
		  ckbStatus.setSelected(true);
	}
	
	private void initPnlBottom() {
		pnlBottom = new JPanel();
		  btnOk = new JButton("ȷ��");
		  btnQuit = new JButton("ȡ��");	
		  btnClose = new JButton("�ر�");
		  
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
		//�û�����֤
		//----------------------------------------------------------------------------
		if(user != null) {
			error = dv.CheckUsername(ttfUsername.getText().trim(), user.getUsername());
		} else {
			error = dv.CheckUsername(ttfUsername.getText().trim(), null);
		}
		
		if(error != null) {
			//���ý���
			ttfUsername.requestFocus();
			//��ʾ�û�
			JOptionPane.showMessageDialog(null, 
					error, 
					"������ʾ��",
					JOptionPane.ERROR_MESSAGE);	
			//�˳���ǰ����������false
			return false;
		}
		//----------------------------------------------------------------------------
		
		//��֤����
		//----------------------------------------------------------------------------
		if(error == null) {
			error = dv.CheckPassword(pwfPassworld.getText());
		}
		
		if(error != null) {
			//���ý���
			pwfPassworld.requestFocus();
			//��ʾ�û�
			JOptionPane.showMessageDialog(null, 
					error, 
					"������ʾ��",
					JOptionPane.ERROR_MESSAGE);	
			//�˳���ǰ����������false
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
							"���ݱ���ɹ����Զ��رձ༭���ڣ�", 
							"������ʾ��",
							JOptionPane.PLAIN_MESSAGE);	
					userMD.getSpnUserL().refreshTable();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, 
							"���ݱ���ʧ�ܣ�", 
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);	
				}
			}
			
			if(opt == OPT_UPD) {
				int rv = JOptionPane.showConfirmDialog(
						UserEditDialog.this, 
						"�Ƿ�ȷ�ϸ������ݣ�",
						"������ʾ��",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0) {
					UserDAO ud = new UserDAO();
					if(ud.update(getUserToSave())) {
						JOptionPane.showMessageDialog(null, 
								"���ݱ���ɹ����Զ��رձ༭���ڣ�", 
								"������ʾ��",
								JOptionPane.PLAIN_MESSAGE);	
						userMD.getSpnUserL().refreshTable();
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, 
								"���ݱ���ʧ�ܣ�", 
								"������ʾ��",
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
					"����δ�����Ƿ�ȷ���˳���",
					"������ʾ��",
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
