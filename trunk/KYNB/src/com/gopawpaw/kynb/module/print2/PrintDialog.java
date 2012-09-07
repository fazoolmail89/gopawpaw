/**     
 * @{#} PrintDialog.java Create on 2012-8-16 上午1:23:22     
 *     
 * Copyright (c) 2012 by 卢向琪.     
 */

package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.common.DialogUtil;

/**
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0
 */

public class PrintDialog extends JDialog {
	private static final long serialVersionUID = -2816372067073195315L;
	private Dimension dimLbl1 = new Dimension(30, 20);
	private Dimension dimLbl2 = new Dimension(100, 20);
	private Dimension dimSpace = new Dimension(30, 20);
	private Dimension dimTtf = new Dimension(200, 20);
	private MainFrame mainFrame;

	private List<PrintItem> piList;

	private JCheckBox ckbAutoNext = new JCheckBox("自动加载下一条记录");

	private JScrollPane spnBody;
	private ItemPanel[] itmePanels;

	private JPanel pnlBottom;

	private Object rowData[] = new Object[BaseDataTable.columnNames.length];

	public PrintDialog(MainFrame mf, Object rowData[]) {
		this.mainFrame = mf;
		this.rowData = rowData;
		// 相关初始化，顺序不可变
		initPiList();
		createSpnBody();
		createPnlBottom();
		refreshSpnBody();

		// ------------------------------------------------------------
		// 界面排版
		setLayout(new BorderLayout());
		spnBody.setBorder(BorderFactory.createTitledBorder("打印数据"));

		// add(ckbAutoNext, BorderLayout.NORTH);
		add(spnBody, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.SOUTH);

		setTitle("打印准备");
		setSize(500, spnBody.getPreferredSize().height + 100);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 50);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}

	/**
	 * 创建中部滚动面板
	 */
	@SuppressWarnings("static-access")
	private void createSpnBody() {
		spnBody = new JScrollPane();
		spnBody.setPreferredSize(new Dimension(this.WIDTH,
				getSpnItemPnaelHeight()));
		itmePanels = new ItemPanel[piList.size()];

		Box box = Box.createVerticalBox();
		ItemPanel itemP = null;
		int i = 0;
		for (PrintItem pi : piList) {
			itemP = new ItemPanel();
			itemP.getLblMapIndex().setText(String.valueOf(pi.getMapIndex()));
			itemP.getLblCode().setText(pi.getCode());
			itemP.getLblName().setText(pi.getName());
			if(PrintItem.SYSDATE_FLAG.equals(pi.getDefValue())) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
				itemP.getTtfValue().setText(sdf.format(new Date()));
			} else
				itemP.getTtfValue().setText(pi.getDefValue());

			box.add(itemP);
			itmePanels[i] = itemP;
			i++;
		}
		spnBody.setViewportView(box);
	}

	/**
	 * 刷新界面数据
	 */
	private void refreshSpnBody() {
		if (rowData == null)
			return;
		if (rowData.length == 0)
			return;
		ItemPanel itemP = null;
		for (int i = 0; i < itmePanels.length; i++) {
			itemP = itmePanels[i];
			String temp = itemP.getLblMapIndex().getText().trim();
			if (!"".equals(temp)) {
				if (Integer.parseInt(temp) < 0
						|| Integer.parseInt(temp) > rowData.length)
					continue;
				if (rowData[Integer.parseInt(temp)] != null)
					itemP.getTtfValue().setText(
							rowData[Integer.parseInt(temp)].toString().trim());
			}
		}
	}

	/**
	 * 创建底部面板
	 */
	private void createPnlBottom() {
		pnlBottom = new JPanel();
		JButton btnPrint = new JButton("打印(En)");
		JButton btnPreview = new JButton("预览");
		JButton btnClose = new JButton("关闭");

		//设置按钮样式
		//---------------------------------------
		btnPreview.setPreferredSize(MyStyle.BTN_DIM_1);
		btnPreview.setMaximumSize(MyStyle.BTN_DIM);
		btnPreview.setFont(MyStyle.BTN_FONT_PLAIN);		
		
		btnPrint.setPreferredSize(MyStyle.BTN_DIM_1);
		btnPrint.setMaximumSize(MyStyle.BTN_DIM);
		btnPrint.setFont(MyStyle.BTN_FONT_PLAIN);	
		
		btnClose.setPreferredSize(MyStyle.BTN_DIM_1);
		btnClose.setMaximumSize(MyStyle.BTN_DIM);
		btnClose.setFont(MyStyle.BTN_FONT_PLAIN);	
		//---------------------------------------
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 执行打印
				doPrint();
			}
		});

		//将enter设置为打印按钮快捷键
		btnPrint.registerKeyboardAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 执行打印
				doPrint();
			}
		}, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

		btnPreview.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (itmePanels.length == 0)
					return;
				new PreviewDialog(new MyPrintable(getPrintAtomList()));
			}
		});

		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PrintDialog.this,
						"是否确认关闭，打印对话框？", "操作提示！", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0)
					dispose();
			}
		});

		pnlBottom.add(ckbAutoNext);
		pnlBottom.add(btnPrint);
		pnlBottom.add(btnClose);
		// pnlBottom.add(btnPreview);
	}

	/**
	 * 初始化PrintItem列表(piList)
	 */
	private void initPiList() {
		piList = new ArrayList<PrintItem>();
		PrintItemDAO piDao = new PrintItemDAO();
		piList = piDao.findAvailables();
	}

	/**
	 * 获取滚动面板高度
	 * 
	 * @return
	 */
	private int getSpnItemPnaelHeight() {
		if (piList.size() < 20)
			return piList.size() * 30;
		else
			return 600;
	}

	/**
	 * 获取打印原子列表
	 * 
	 * @return
	 */
	private List<PrintAtom> getPrintAtomList() {
		List<PrintAtom> printAtoms = new ArrayList<PrintAtom>();
		ItemPanel itemP = null;
		for (int i = 0; i < itmePanels.length; i++) {
			itemP = itmePanels[i];
			PrintAtom printAtom = null;
			for (PrintItem printItem : piList) {
				if (itemP.getLblCode().getText().equals(printItem.getCode())) {
					printAtom = new PrintAtom();
					printAtom.setValue(itemP.getTtfValue().getText().trim());
					printAtom.setX(printItem.getX());
					printAtom.setY(printItem.getY());
					printAtoms.add(printAtom);
				}
			}
		}
		return printAtoms;
	}

	/**
	 * 执行打印
	 */
	private void doPrint() {
		if (itmePanels.length == 0)
			return;
		Toolkit.getDefaultToolkit().beep();

		// 如果数据已打印，提示用户是否重新打印
		if (rowData != null && rowData.length > 0 && rowData[25] != null) {
			if ("已打印".equals(rowData[25])) {
				int rv = JOptionPane.showConfirmDialog(PrintDialog.this,
						"该记录已打印，是否重新打印？", "操作提示！",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				// 用户点击取消按钮
				if (rv == 2)
					return;
			}
		}

		//获取打印信息
		MyPrintable myPrintable = new MyPrintable(getPrintAtomList());

		// 执行打印
		boolean rs1 = mainFrame.getPrinter().print(myPrintable);
		boolean rs2 = false;
		if (rs1) {
			PrintDataDAO pdDao = new PrintDataDAO();
			// data[0]为ID值 ,如果ID值为空，不执行数据库更新操作，直接提示打印成功
			if (!"".equals(rowData[0].toString().trim())) {
				// 更新数据库
				rs2 = pdDao.updatePrintFlag(Integer.parseInt(rowData[0]
						.toString().trim()));
				if (rs2) {
					// 提示用户打印成功
					JOptionPane.showMessageDialog(null, "打印成功！", "操作提示！",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "更新数据库失败！", "操作提示！",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				// 提示用户打印成功
				JOptionPane.showMessageDialog(null, "打印成功！", "操作提示！",
						JOptionPane.PLAIN_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "连接打印机失败！", "操作提示！",
					JOptionPane.ERROR_MESSAGE);
		}

		// 如果无法连接打印机，不做操作
		if (!rs1)
			return;

		// 判断用户是否选中自动加载选项
		if (ckbAutoNext.isSelected()) {
			// 自动加载下一条记录
			rowData = mainFrame.getSpnBDT().getSelectNextRow();
			refreshSpnBody();
		} else {
			// 用户未选中更新按钮，更新主界面数据列表，关闭打印对话框
			mainFrame.getPnlQuery().executQuery();
			dispose();
		}
	}

	class ItemPanel extends JPanel {
		private static final long serialVersionUID = 7812225315955879302L;
		private JLabel lblMapIndex;// 隐藏标签，用于保存列值
		private JLabel lblCode;
		private JLabel lblName;
		private JLabel lblSpace;// 占位
		private JTextField ttfValue;

		public ItemPanel() {

			lblMapIndex = new JLabel();
			lblMapIndex.setVisible(false);

			lblCode = new JLabel();
			lblCode.setPreferredSize(dimLbl1);

			lblName = new JLabel();
			lblName.setPreferredSize(dimLbl2);
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);

			lblSpace = new JLabel();
			lblSpace.setPreferredSize(dimSpace);

			ttfValue = new JTextField();
			ttfValue.setPreferredSize(dimTtf);

			Box box = Box.createHorizontalBox();
			box.add(lblCode);
			box.add(lblName);
			box.add(lblSpace);
			box.add(ttfValue);
			add(box);
		}

		public JLabel getLblName() {
			return lblName;
		}

		public void setLblName(JLabel lblName) {
			this.lblName = lblName;
		}

		public JTextField getTtfValue() {
			return ttfValue;
		}

		public void setTtfValue(JTextField ttfValue) {
			this.ttfValue = ttfValue;
		}

		public JLabel getLblCode() {
			return lblCode;
		}

		public void setLblCode(JLabel lblCode) {
			this.lblCode = lblCode;
		}

		public void setLblMapIndex(JLabel lblMapIndex) {
			this.lblMapIndex = lblMapIndex;
		}

		public JLabel getLblMapIndex() {
			return lblMapIndex;
		}
	}
}
