/**     
* @{#} PasswdUpdDialog.java Create on 2012-9-30 ����9:32:20     
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

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.MainFrame;

/**     
 * @author ¬���� luxiangqi521@gmail.com    
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
		
		setTitle("�޸�����");
		setSize(300, 180);
		DialogUtil.setDialogLocaltion(mainFrame, this);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	/**
	 * ��ʼ���ؼ� 
	 */
	private void initComponent() {
		Dimension dimLbl = new Dimension(50, 22);
		Dimension dimInp = new Dimension(150, 22);
		
		lblOld = new JLabel("������");
		lblOld.setPreferredSize(dimLbl);
		pwfOld = new JPasswordField();
		pwfOld.setPreferredSize(dimInp);
		
		lblNew = new JLabel("������");
		lblNew.setPreferredSize(dimLbl);
		pwfNew = new JPasswordField();
		pwfNew.setPreferredSize(dimInp);
		
		lblRe = new JLabel("ȷ������");
		lblRe.setPreferredSize(dimLbl);
		pwfRe = new JPasswordField();
		pwfRe.setPreferredSize(dimInp);
		
		btnOk = new JButton("ȷ��");
		btnOk.addActionListener(new BtnOkActionListener());
		btnResult = new JButton("����");
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
									"�����޸ĳɹ���", 
									"������ʾ��",
									JOptionPane.PLAIN_MESSAGE);	
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, 
									"����ʧ�ܣ�", 
									"������ʾ��",
									JOptionPane.ERROR_MESSAGE);								
						}
					} else {
						//���ý��� 
						pwfRe.requestFocus();
						//��ʾ�û�
						JOptionPane.showMessageDialog(null, 
								"������������벻һ�£����������룡", 
								"������ʾ��",
								JOptionPane.ERROR_MESSAGE);							
					}
				} else {
					//���ý��� 
					pwfNew.requestFocus();
					//��ʾ�û�
					JOptionPane.showMessageDialog(null, 
							"���벻��Ϊ�գ����������룡", 
							"������ʾ��",
							JOptionPane.ERROR_MESSAGE);						
				}
			} else {
				//���ý��� 
				pwfOld.requestFocus();
				//��ʾ�û�
				JOptionPane.showMessageDialog(null, 
						"������������������룡", 
						"������ʾ��",
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
