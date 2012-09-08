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
 *  ��������ɾ���Ի���
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-7
 */
public class DataClearDialog extends JDialog {
	
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
	
	public DataClearDialog(MainFrame mf) {
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
		cbbDpmt.setSelectedIndex(0);
		
		lblSelect.setPreferredSize(new Dimension(150, 20));
		cbbDpmt.setPreferredSize(new Dimension(150, 20));
		
		pnlSecend.add(lblSelect);
		pnlSecend.add(cbbDpmt);
	}
	
	private void createButtomPanel() {
		pnlButtom = new JPanel();
		JButton btnOk = new JButton("ȷ��");
		JButton btnQuit = new JButton("ȡ��");	

		//���ð�ť��ʽ
		//----------------------------------------
		btnOk.setPreferredSize(MyStyle.BTN_DIM_2);
		btnOk.setMaximumSize(MyStyle.BTN_DIM);
		btnOk.setFont(MyStyle.BTN_FONT_PLAIN);	
		
		btnQuit.setPreferredSize(MyStyle.BTN_DIM_2);
		btnQuit.setMaximumSize(MyStyle.BTN_DIM);
		btnQuit.setFont(MyStyle.BTN_FONT_PLAIN);
		//----------------------------------------
		
		//��Ӱ�ť�¼�
		btnOk.addActionListener(new BtnOkActionListener());
		btnQuit.addActionListener(new BtnQuitActionListener());
		
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
		first.setId(-1);
		first.setName("����");
		dpmtArray[0] = first;
		
		for(int i = 0; i < temp.length; i++) {
			dpmtArray[i+1] = temp[i];
		}
	}
	
	/**
	 * ȷ��(btnOk)��ť�����¼���
	 *
	 * @author ¬���� luxiangqi521@gmail.com
	 * @version 1.0 2012-9-7����06:31:39
	 */
	class BtnOkActionListener implements ActionListener {
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) { 
			if(step == 0) {
				if(passwd.equals(pwfPasswd.getText().trim())) {
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
				if(cbbDpmt.getSelectedIndex() > -1) {
					PrintThorp pt = (PrintThorp) cbbDpmt.getItemAt(cbbDpmt.getSelectedIndex());
				
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"�Ƿ�ȷ�������" + pt.getName() + "�����������ݣ�", 
							"�������棡",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);	
					
					if (rv == 0)
						rv = JOptionPane.showConfirmDialog(mainFrame,
								"���������" + pt.getName() + "�����������ݣ����ٴ�ȷ�ϣ�", 
								"�������棡",
								JOptionPane.OK_CANCEL_OPTION,
								JOptionPane.OK_CANCEL_OPTION);
					
					if(rv == 0) {
						PrintDataDAO pddao = new PrintDataDAO();
						boolean result = false;
						//��һ����¼Ϊɾ������
						if(cbbDpmt.getSelectedIndex() == 0)
							result = pddao.deleteByDpmtId(null);
						else
							result =pddao.deleteByDpmtId(String.valueOf(pt.getId()));	
						
						if(result) {
							JOptionPane.showMessageDialog(null, 
									"�����ɹ���", 
									"������ʾ��",
									JOptionPane.PLAIN_MESSAGE);	
							// ɾ���ɹ���ˢ�½���
							mainFrame.getPnlQuery().executQuery();								
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, 
									"����ʧ�ܣ�", 
									"������ʾ��",
									JOptionPane.ERROR_MESSAGE);	
							
							pnlFirst.setVisible(true);
							pnlSecend.setVisible(false);
							step = 0;
						}
					}
				}
			}
		}
	}
	
	/**
	 * ȡ��(btnQuit)��ť�����¼��� 
	 *
	 * @author ¬���� luxiangqi521@gmail.com
	 * @version 1.0 2012-9-7����06:32:56
	 */
	class BtnQuitActionListener implements ActionListener {
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
	}
}
