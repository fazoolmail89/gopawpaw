/**     
* @{#} PtintDataEditDialog.java Create on 2012-8-18 上午2:22:37     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.common.DialogUtil;

/**     
 * 数据编辑窗口
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintDataEditDialog extends JDialog {
	private static final long serialVersionUID = -198794430177043710L;
	private Dimension dimLbl = new Dimension(100, 20);
	private Dimension dimInp = new Dimension(200, 20);

	private MainFrame mainFrame;
	public static final int VIEW_OPT = 0;
	public static final int ADD_OPT = 1;
	public static final int UPTD_OPT = 2;
	private int opt;
	private PrintData printData;
	
	private JPanel pnlBody;
	private JLabel lblName = new JLabel("姓名");
	private JTextField ttfName = new JTextField();

	private JLabel lblSex = new JLabel("性别");
	private static String[] sexItem = {"男", "女"};
	private JComboBox cbbSex = new JComboBox(sexItem);
	
	private JLabel lblICCode = new JLabel("身份证号");
	private JTextField ttfICCode = new JTextField();
	
	private JLabel lblSerialNum = new JLabel("个人编号");
	private JTextField ttfSerialNum = new JTextField();

	private JLabel lblArea = new JLabel("所属地区");
	private JTextField ttfArea = new JTextField();
	
	private JLabel lblThorpId = new JLabel("所在村");
	private JComboBox cbbThorpId = new JComboBox();
	
	private JLabel lblThorpName = new JLabel("所属机构编号");
	private JTextField ttfThorpName = new JTextField();
	
	private JLabel lblPhone = new JLabel("联系电话");
	private JTextField ttfPhone = new JTextField();
	
	private JLabel lblFamilyCode = new JLabel("家庭编号");
	private JTextField ttfFamilyCode = new JTextField();
	
	private JLabel lblJ_Account = new JLabel("缴费银行账号");
	private JTextField ttfJ_Account = new JTextField();
	
	private JLabel lblJ_AccountName = new JLabel("缴费银行户名");
	private JTextField ttfJ_AccountName = new JTextField();
	
	private JLabel lblZ_Account = new JLabel("支付银行账号");
	private JTextField ttfZ_Account = new JTextField();
	
	private JLabel lblZ_AccountName = new JLabel("支付银行户名");
	private JTextField ttfZ_AccountName = new JTextField();
	
	private JLabel lblAge = new JLabel("年龄");
	private JTextField ttfAge = new JTextField();
	
	private JLabel lblAchieveDate = new JLabel("到龄时间");
	private JTextField ttfAchieveDate = new JTextField();
	
	private JLabel lblBirthDate = new JLabel("出生日期");
	private JTextField ttfBirthDate = new JTextField();
	
	private JLabel lblRelationship = new JLabel("与户主关系");
	private JTextField ttfRelationship = new JTextField();
	
	private JLabel lblPayGrade = new JLabel("本年缴费档次");
	private JTextField ttfPayGrade = new JTextField();
	
	private JLabel lblPersType = new JLabel("本年人员类别");
	private JTextField ttfPersType = new JTextField();
	
	private JLabel lblAddress = new JLabel("家庭住址");
	private JTextField ttfAddress = new JTextField();
	
	private JLabel lblRemark = new JLabel("备注");
	private JTextField ttfRemark = new JTextField();
	
	private JLabel lblTotalAcct = new JLabel("累计个人账户金额");
	private JTextField ttfTotalAcct = new JTextField();
	
	private JLabel lblTotalPay = new JLabel("累计个人缴费金额");
	private JTextField ttfTotalPay = new JTextField();
	
	private JLabel lblTotalSubs = new JLabel("累计财政补助");
	private JTextField ttfTotalSubs = new JTextField();
	
	private JLabel lblPrintFlag = new JLabel("打印标记");
	private JTextField ttfPrintFlag = new JTextField();
	
	private JLabel lblPrintDate = new JLabel("打印日期");
	private JTextField ttfPrintDate = new JTextField();
	
	private JPanel pnlBottom;
	private JCheckBox ckbContinue = new JCheckBox("连续添加");
	
	public PrintDataEditDialog(MainFrame mainFrame, String title, PrintData printData, int opt) {
		this.mainFrame = mainFrame;
		this.printData = printData;
		this.opt = opt;
		
		createPnlBottom();
		createPnlBody();
		
		//-----------------------------------
		//界面布局
		pnlBody.setBorder(BorderFactory.createTitledBorder(title));
		
		setLayout(new BorderLayout());
		add(pnlBody, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.SOUTH);
		
		setTitle(title);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 30);
		setSize(800, 500);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}
	
	private void createPnlBody() {
		pnlBody = new JPanel();
		
		Box boxBg = Box.createHorizontalBox();
		Box boxLeft = Box.createVerticalBox();
		Box boxRight = Box.createVerticalBox();
		
		boxLeft.add(getLayoutPanel(lblName, ttfName));
		boxRight.add(getLayoutPanel(lblSex, cbbSex));
		
		boxLeft.add(getLayoutPanel(lblICCode, ttfICCode));
		boxRight.add(getLayoutPanel(lblSerialNum, ttfSerialNum));	
		
		boxLeft.add(getLayoutPanel(lblArea, ttfArea));
		boxRight.add(getLayoutPanel(lblThorpId, cbbThorpId));
		
		boxLeft.add(getLayoutPanel(lblThorpName, ttfThorpName));
		boxRight.add(getLayoutPanel(lblPhone, ttfPhone));	
		
		boxLeft.add(getLayoutPanel(lblFamilyCode, ttfFamilyCode));
		boxRight.add(getLayoutPanel(lblRelationship, ttfRelationship));
		
		boxRight.add(getLayoutPanel(lblJ_Account, ttfJ_Account));	
		boxLeft.add(getLayoutPanel(lblJ_AccountName, ttfJ_AccountName));
		
		boxRight.add(getLayoutPanel(lblZ_Account, ttfZ_Account));	
		boxLeft.add(getLayoutPanel(lblZ_AccountName, ttfZ_AccountName));
		
		boxLeft.add(getLayoutPanel(lblAchieveDate, ttfAchieveDate));
		boxRight.add(getLayoutPanel(lblAge, ttfAge));	
		
		boxLeft.add(getLayoutPanel(lblBirthDate, ttfBirthDate));
		boxRight.add(getLayoutPanel(lblPayGrade, ttfPayGrade));	
		
		boxLeft.add(getLayoutPanel(lblPersType, ttfPersType));
		boxRight.add(getLayoutPanel(lblTotalAcct, ttfTotalAcct));	
		
		boxLeft.add(getLayoutPanel(lblTotalPay, ttfTotalPay));
		boxRight.add(getLayoutPanel(lblTotalSubs, ttfTotalSubs));	
		
		boxRight.add(getLayoutPanel(lblAddress, ttfAddress));
		boxLeft.add(getLayoutPanel(lblRemark, ttfRemark));	
		
		boxLeft.add(getLayoutPanel(lblPrintFlag, ttfPrintFlag));
		ttfPrintFlag.setEditable(false);
		boxRight.add(getLayoutPanel(lblPrintDate, ttfPrintDate));
		ttfPrintDate.setEditable(false);
		
		boxBg.add(boxLeft);
		boxBg.add(boxRight);
		
		pnlBody.add(boxBg);
	}
	
	private JPanel getLayoutPanel(JLabel lbl, Component input) {
		JPanel layoutPanel = new JPanel();
		lbl.setPreferredSize(dimLbl);
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setPreferredSize(dimInp);
		layoutPanel.add(lbl);
		layoutPanel.add(input);
		return layoutPanel;
	}
	
	/**
	 * 创建底部面板
	 */
	private void createPnlBottom() {
		pnlBottom = new JPanel();
		
		JButton btnOk = new JButton("确定");
		JButton btnQuit = new JButton("取消");
		JButton btnClose = new JButton("关闭");
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rv = JOptionPane.showConfirmDialog(PrintDataEditDialog.this,
						"未保存数据将丢失，是否确认退出？", "操作提示！",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				// 用户点击取消按钮
				if (rv == 0)
					dispose();
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		if(opt == PrintDataEditDialog.VIEW_OPT) {
			pnlBottom.add(btnClose);
		} else {
			if(opt == PrintDataEditDialog.ADD_OPT) 
				pnlBottom.add(ckbContinue);
			pnlBottom.add(btnOk);
			pnlBottom.add(btnQuit);
		}
		
	}
	
	/**
	 * 加载数据
	 */
	private void loadPrintDataDto() {
		if(printData != null) {
			
		}
	}
	
	/**
	 * 清空数据
	 */
	private void clearData() {
		
	}

}
