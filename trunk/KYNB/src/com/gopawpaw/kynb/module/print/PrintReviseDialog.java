package com.gopawpaw.kynb.module.print;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.datascan.ScanItemDialog;

public class PrintReviseDialog extends JDialog {
	private static final long serialVersionUID = 1576225917283563650L;
	private PrintFrame mainFrame;
	private LicenseDto licenseDto;
	private static final String[] TYPE = {"ũҵ","��ũҵ"};
	
	private JPanel pnlMain;
	
	private JLabel lblICCode = new JLabel("���֤��");
	private JTextField ttfICCode;
	
	private JLabel lblName = new JLabel("����");
	private JTextField ttfName;
	
	private JLabel lblOldName = new JLabel("������");
	private JTextField ttfOldName;

	private JLabel lblBirthday = new JLabel("����������");
	private JTextField ttfBirthday;//����������
	
	private JLabel lblSex = new JLabel("�Ա�");
	private JTextField ttfSex;//�Ա�
	
	private JLabel lblCode = new JLabel("��ᱣ�Ϻ�");
	private JTextField ttfCode;//��ᱣ�Ϻ�
	
	private JLabel lblAddress = new JLabel("��ַ");	
	private JTextField ttfAddress;//��ַ

	private JLabel lblAccountType = new JLabel("��������");
	private JComboBox ttfAccountType;//��������

	private JLabel lblGrantDate = new JLabel("�˷�ʱ��");
	private JTextField ttfGrantDate;//�˷�ʱ��

	private JLabel lblGrantDpmt = new JLabel("�˷���λ");
	private JTextField ttfGrantDpmt;//�˷���λ
	
	private JButton btnPrint = new JButton("��ӡ");
	private JButton btnQuit = new JButton("ȡ��");
	
	public PrintReviseDialog(PrintFrame mf, LicenseDto licenseDto) {
		this.mainFrame = mf;
		this.licenseDto = licenseDto;
		License.readInitFile();
		setContentPane(getPnlMain());
		setSize(500,380);
		DialogUtil.setDialogLocaltion(mainFrame, this);
		setModal(true);
		setVisible(true);
	}
	
	private JPanel getPnlMain() {
		pnlMain = new JPanel();
		
		Dimension dsLbl = new Dimension(60, 20);
		Dimension dsInp = new Dimension(300, 20);
		
		Box box = Box.createVerticalBox();
		box.add(Box.createHorizontalStrut(10));
		
		ttfICCode = new JTextField();
		ttfICCode.setEditable(false);
		ttfICCode.setText(licenseDto.getIcCode());
		lblICCode.setPreferredSize(dsLbl);
		lblICCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfICCode.setPreferredSize(dsInp);
		
		ttfName = new JTextField();
		ttfName.setEditable(false);
		ttfName.setText(licenseDto.getName());
		lblName.setPreferredSize(dsLbl);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfName.setPreferredSize(dsInp);
		
		ttfOldName = new JTextField();
		ttfOldName.setText(licenseDto.getOldName());
		lblOldName.setPreferredSize(dsLbl);
		lblOldName.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfOldName.setPreferredSize(dsInp);
		
		ttfBirthday = new JTextField();//����������
		ttfBirthday.setText(licenseDto.getBirthday());
		lblBirthday.setPreferredSize(dsLbl);
		lblBirthday.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfBirthday.setPreferredSize(dsInp);
		
		ttfSex = new JTextField();//�Ա�
		ttfSex.setText(licenseDto.getSex());
		lblSex.setPreferredSize(dsLbl);
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfSex.setPreferredSize(dsInp);
		
		ttfCode = new JTextField();//��ᱣ�Ϻ�
		ttfCode.setText(licenseDto.getCode());
		lblCode.setPreferredSize(dsLbl);
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfCode.setPreferredSize(dsInp);
		
		ttfAddress = new JTextField();//��ַ
		ttfAddress.setText(licenseDto.getAddress());
		lblAddress.setPreferredSize(dsLbl);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfAddress.setPreferredSize(dsInp);

		ttfAccountType = new JComboBox(TYPE);//��������
		lblAccountType.setPreferredSize(dsLbl);
		lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfAccountType.setPreferredSize(dsInp);

		ttfGrantDate = new JTextField();//�˷�ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		ttfGrantDate.setText(sdf.format(new Date()));
		lblGrantDate.setPreferredSize(dsLbl);
		lblGrantDate.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfGrantDate.setPreferredSize(dsInp);

		ttfGrantDpmt = new JTextField();//�˷���λ
		ttfGrantDpmt.setText(License.GreantDpmtDV);
		lblGrantDpmt.setPreferredSize(dsLbl);
		lblGrantDpmt.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfGrantDpmt.setPreferredSize(dsInp);
		
		box.add(getLayoutPanel(lblICCode, ttfICCode));
		box.add(getLayoutPanel(lblName, ttfName));
		box.add(getLayoutPanel(lblOldName, ttfOldName));
		box.add(getLayoutPanel(lblBirthday, ttfBirthday));
		box.add(getLayoutPanel(lblSex, ttfSex));
		box.add(getLayoutPanel(lblCode, ttfCode));
		box.add(getLayoutPanel(lblAddress, ttfAddress));
		box.add(getLayoutPanel(lblAccountType, ttfAccountType));
		box.add(getLayoutPanel(lblGrantDate, ttfGrantDate));
		box.add(getLayoutPanel(lblGrantDpmt, ttfGrantDpmt));
		box.add(getLayoutPanel(btnPrint, btnQuit));
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * 1���򿪴�ӡԤ�����϶�Ϊ�ü�¼�Ѵ�ӡ
				 * 2����ӡ�ɹ��������ݿ��Ӧ��¼�Ĵ�ӡ���
				 * 3��ˢ���������б��ر�����
				 * 4�������ӡʧ����ʾ�û������Զ��˳�
				 */
				try {
					new PreviewDialog(PrintReviseDialog.this, createLicense());
					DataOperator dot = new DataOperator();
					if(dot.updatePrintFlag(licenseDto)){
						mainFrame.getQP().executQuery();
						dispose();
					} else {
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showMessageDialog(null, "��ӡʧ�ܣ�E1��", "������ʾ��",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception ex) {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "��ӡʧ�ܣ�E2��", "������ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PrintReviseDialog.this,
						"�Ƿ�ȡ����ӡ��", "�˳���ʾ��", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (rv == 0) {
					dispose();
				}
			}
		});
		
		pnlMain.add(box);
		
		return pnlMain;
	}
	
	private JPanel getLayoutPanel(Component c1, Component c2) {
		JPanel layoutPanel = new JPanel();
		layoutPanel.add(c1);
		layoutPanel.add(c2);
		return layoutPanel;
	}

	private License createLicense() {
		License license = new License();
		license.setName(ttfName.getText().trim());
		license.setOldName(ttfOldName.getText().trim());
		license.setBirthday(ttfBirthday.getText().trim());
		license.setSex(ttfSex.getText().trim());
		license.setCode(ttfCode.getText().trim());
		license.setAddress(ttfAddress.getText().trim());
		license.setAccountType(ttfAccountType.getSelectedItem().toString());
		license.setGrantDate(ttfGrantDate.getText().trim());
		license.setGrantDpmt(ttfGrantDpmt.getText().trim());
	
		return license;
	}
}
