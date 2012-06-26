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
	private static final String[] TYPE = {"农业","非农业"};
	
	private JPanel pnlMain;
	
	private JLabel lblICCode = new JLabel("身份证号");
	private JTextField ttfICCode;
	
	private JLabel lblName = new JLabel("姓名");
	private JTextField ttfName;
	
	private JLabel lblOldName = new JLabel("曾用名");
	private JTextField ttfOldName;

	private JLabel lblBirthday = new JLabel("出生年月日");
	private JTextField ttfBirthday;//出生年月日
	
	private JLabel lblSex = new JLabel("性别");
	private JTextField ttfSex;//性别
	
	private JLabel lblCode = new JLabel("社会保障号");
	private JTextField ttfCode;//社会保障号
	
	private JLabel lblAddress = new JLabel("地址");	
	private JTextField ttfAddress;//地址

	private JLabel lblAccountType = new JLabel("户口性质");
	private JComboBox ttfAccountType;//户口性质

	private JLabel lblGrantDate = new JLabel("核发时间");
	private JTextField ttfGrantDate;//核发时间

	private JLabel lblGrantDpmt = new JLabel("核发单位");
	private JTextField ttfGrantDpmt;//核发单位
	
	private JButton btnPrint = new JButton("打印");
	private JButton btnQuit = new JButton("取消");
	
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
		
		ttfBirthday = new JTextField();//出生年月日
		ttfBirthday.setText(licenseDto.getBirthday());
		lblBirthday.setPreferredSize(dsLbl);
		lblBirthday.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfBirthday.setPreferredSize(dsInp);
		
		ttfSex = new JTextField();//性别
		ttfSex.setText(licenseDto.getSex());
		lblSex.setPreferredSize(dsLbl);
		lblSex.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfSex.setPreferredSize(dsInp);
		
		ttfCode = new JTextField();//社会保障号
		ttfCode.setText(licenseDto.getCode());
		lblCode.setPreferredSize(dsLbl);
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfCode.setPreferredSize(dsInp);
		
		ttfAddress = new JTextField();//地址
		ttfAddress.setText(licenseDto.getAddress());
		lblAddress.setPreferredSize(dsLbl);
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfAddress.setPreferredSize(dsInp);

		ttfAccountType = new JComboBox(TYPE);//户口性质
		lblAccountType.setPreferredSize(dsLbl);
		lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfAccountType.setPreferredSize(dsInp);

		ttfGrantDate = new JTextField();//核发时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		ttfGrantDate.setText(sdf.format(new Date()));
		lblGrantDate.setPreferredSize(dsLbl);
		lblGrantDate.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfGrantDate.setPreferredSize(dsInp);

		ttfGrantDpmt = new JTextField();//核发单位
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
				 * 1、打开打印预览即认定为该记录已打印
				 * 2、打印成功更新数据库对应记录的打印标记
				 * 3、刷新主界面列表，关闭自身
				 * 4、如果打印失败提示用户，不自动退出
				 */
				try {
					new PreviewDialog(PrintReviseDialog.this, createLicense());
					DataOperator dot = new DataOperator();
					if(dot.updatePrintFlag(licenseDto)){
						mainFrame.getQP().executQuery();
						dispose();
					} else {
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showMessageDialog(null, "打印失败，E1！", "错误提示！",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception ex) {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "打印失败，E2！", "错误提示！",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PrintReviseDialog.this,
						"是否取消打印？", "退出提示！", JOptionPane.OK_CANCEL_OPTION,
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
