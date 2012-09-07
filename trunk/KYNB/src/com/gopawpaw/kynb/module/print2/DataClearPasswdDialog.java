package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorp;
import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorpDAO;

/**	
 *  ����ɾ����������Ի���
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-7
 */
public class DataClearPasswdDialog extends JDialog {
	
	private static final long serialVersionUID = -5684813482287134243L;
	private MainFrame mainFrame;
	/** ���� */
	private final String passwd = "ClearDpmt";
	
	private PrintThorp[] dpmtArray = {};
	private int step = 0;
	
	private JPanel pnlFirst;
	private JLabel lblPasswd;
	private JPasswordField pwfPasswd;
	
	private JPanel pnlSecend;
	private JLabel lblSelect;
	private JComboBox cbbDpmt;
	
	private JPanel pnlButtom;
	
	public DataClearPasswdDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		initDpmtArray();
		createFirstPanel();
		createSecondPanel();
		createButtomPanel();
		
		setLayout(new BorderLayout());
		add(pnlFirst, BorderLayout.CENTER);
		add(pnlButtom, BorderLayout.SOUTH);
		
		setTitle("������ݶԻ���");
		setSize(200, 120);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	private void createFirstPanel() {
		pnlFirst = new JPanel();
		lblPasswd = new JLabel("���������룺");
		pwfPasswd = new JPasswordField();
		
		lblPasswd.setPreferredSize(new Dimension(150, 20));
		pwfPasswd.setPreferredSize(new Dimension(150, 20));
		
		pnlFirst.add(lblPasswd);
		pnlFirst.add(pwfPasswd);
	}
	
	private void createSecondPanel() {
		pnlSecend = new JPanel();
		lblSelect = new JLabel("��ѡ��ɾ����Χ��");
		cbbDpmt = new JComboBox(dpmtArray);
		
		lblSelect.setPreferredSize(new Dimension(150, 20));
		cbbDpmt.setPreferredSize(new Dimension(150, 20));
		
		pnlSecend.add(lblSelect);
		pnlSecend.add(cbbDpmt);
	}
	
	private void createButtomPanel() {
		pnlButtom = new JPanel();
		JButton btnOk = new JButton("ȷ��");
		JButton btnQuit = new JButton("ȡ��");	

		btnOk.setPreferredSize(MyStyle.BTN_DIM_2);
		btnOk.setMaximumSize(MyStyle.BTN_DIM);
		btnOk.setFont(MyStyle.BTN_FONT_PLAIN);	
		
		btnQuit.setPreferredSize(MyStyle.BTN_DIM_2);
		btnQuit.setMaximumSize(MyStyle.BTN_DIM);
		btnQuit.setFont(MyStyle.BTN_FONT_PLAIN);
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				if(step == 0) {
					if(passwd.equals(pwfPasswd.getText().trim())) {
						mainFrame.setClearDataPass(true);
						
						pnlFirst.setVisible(false);
						add(pnlSecend, BorderLayout.CENTER);
						step = 1;
					} else {
						JOptionPane.showMessageDialog(null, 
								"����������������룡", 
								"������ʾ��",
								JOptionPane.ERROR_MESSAGE);						
					}
				}
				
				if(step == 1) {
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"�Ƿ�ȷ�������" + "����", "�������棡",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);					
				}
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(step == 0) dispose();
				
				if(step == 1) {
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"�Ƿ�ȡ��������", "�������棡",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					if(rv == 0) dispose();
				}
			}
		});
		
		pnlButtom.add(btnOk);
		pnlButtom.add(btnQuit);
	}
	
	/**
	 * ��ʼ�����������б�
	 */
	private void initDpmtArray() {
		PrintThorp[] temp = new PrintThorpDAO().findObjArray();
		dpmtArray = new PrintThorp[temp.length + 1];
		
		//��ptArray�б��һ�����󸳿�ֵ
		PrintThorp first = new PrintThorp();
		first.setName("����");
		dpmtArray[0] = first;
		
		for(int i = 0; i < temp.length; i++) {
			dpmtArray[i+1] = temp[i];
		}
	}
}
