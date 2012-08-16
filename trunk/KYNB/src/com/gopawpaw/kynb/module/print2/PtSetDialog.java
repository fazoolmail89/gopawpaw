package com.gopawpaw.kynb.module.print2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.gopawpaw.kynb.common.DialogUtil;

/**
 * @author luxiangqi luxiangqi521@gmail.com
 * @version 1.0
 */

public class PtSetDialog extends JDialog {
	private static final long serialVersionUID = 2373365918782990387L;
	private static Dimension dim_1 = new Dimension(50, 20);
	private static Dimension dim_2 = new Dimension(100, 20);
	private static Dimension dim_3 = new Dimension(200, 20);

	private MainFrame mainFrame;

	private JPanel pnlHeader;

	private List<PrintItem> piList;

	private JScrollPane spnBody;
	private ItemPanel[] itmePanels = new ItemPanel[26];

	private JPanel pnlBottom = new JPanel();
	private JButton btnOk = new JButton("确定");
	private JButton btnQuit = new JButton("取消");

	public PtSetDialog(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		initPiList();
		pnlHeader = getPnlHeader();
		spnBody = getSpnBody();
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PtSetDialog.this,
						"是否确认更新？", "退出提示！", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0) {
					PrintItemDBOpt pdbopt = new PrintItemDBOpt();
					if (pdbopt.updateAll(getUpdPiList())) {
						JOptionPane.showMessageDialog(null, "保存成功！", "操作提示！",
								JOptionPane.PLAIN_MESSAGE);
						dispose();
					} else
						JOptionPane.showMessageDialog(null, "保存失败！", "保存文件提示！",
								JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PtSetDialog.this,
						"是否取消操作？", "退出提示！", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0) {
					dispose();
				}
			}
		});

		pnlBottom.add(btnOk);
		pnlBottom.add(btnQuit);

		Box box = Box.createVerticalBox();
		box.setBorder(BorderFactory.createTitledBorder("打印设置"));
		box.add(pnlHeader);
		box.add(spnBody);
		box.add(pnlBottom);

		add(box);
		
		setTitle("打印设置");
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 0);
		setSize(800, 700);
		// 固定大小
		setResizable(false);
		setModal(true);
		setVisible(true);
	}

	private JPanel getPnlHeader() {
		JPanel pnlHeader = new JPanel();
		JLabel lbl_1 = new JLabel("编号");
		JLabel lbl_2 = new JLabel("是否可用");
		JLabel lbl_3 = new JLabel("名称");
		JLabel lbl_4 = new JLabel("对应值");
		JLabel lbl_5 = new JLabel("默认值");
		JLabel lbl_6 = new JLabel("X坐标");
		JLabel lbl_7 = new JLabel("Y坐标");
		lbl_1.setPreferredSize(dim_1);
		lbl_2.setPreferredSize(dim_1);
		lbl_3.setPreferredSize(dim_2);
		lbl_4.setPreferredSize(dim_2);
		lbl_5.setPreferredSize(dim_3);
		lbl_6.setPreferredSize(dim_2);
		lbl_7.setPreferredSize(dim_2);
		pnlHeader.add(lbl_1);
		pnlHeader.add(lbl_2);
		pnlHeader.add(lbl_3);
		pnlHeader.add(lbl_4);
		pnlHeader.add(lbl_5);
		pnlHeader.add(lbl_6);
		pnlHeader.add(lbl_7);

		return pnlHeader;
	}

	private JScrollPane getSpnBody() {
		JScrollPane spnBody = new JScrollPane();
		Box boxBody = Box.createVerticalBox();
		ItemPanel itemP = null;
		String code;
		for (int i = 0; i < itmePanels.length; i++) {
			code = String.valueOf((char) (65 + i));
			itemP = new ItemPanel();
			for (PrintItem pi : piList) {
				if (code.equals(pi.getCode())) {
					itemP.getCkbDisAble().setSelected(pi.isDisAble());
					itemP.getLblCode().setText(pi.getCode());
					itemP.getTtfName().setText(pi.getName());
					itemP.getCbbMapIndex().setSelectedIndex(pi.getMapIndex());
					itemP.getTtfDefValue().setText(pi.getDefValue());
					itemP.getTtfX().setText(String.valueOf(pi.getX()));
					itemP.getTtfY().setText(String.valueOf(pi.getY()));
				}
			}
			boxBody.add(itemP);
			itmePanels[i] = itemP;
		}
		spnBody.setViewportView(boxBody);
		return spnBody;
	}

	private void initPiList() {
		piList = new ArrayList<PrintItem>();
		PrintItemDBOpt pdbopt = new PrintItemDBOpt();
		piList = pdbopt.findAll();
	}

	private List<PrintItem> getUpdPiList() {
		List<PrintItem> updPiList = new ArrayList<PrintItem>();
		ItemPanel itemP = null;
		PrintItem pi = null;
		for (int i = 0; i < itmePanels.length; i++) {
			itemP = itmePanels[i];
			pi = new PrintItem();
			pi.setCode(itemP.getLblCode().getText().trim());
			pi.setName(itemP.getTtfName().getText().trim());
			pi.setMapIndex(itemP.getCbbMapIndex().getSelectedIndex());
			pi.setDefValue(itemP.getTtfDefValue().getText().trim());

			if (!"".equals(itemP.getTtfX().getText().trim()))
				pi.setX(Integer.parseInt(itemP.getTtfX().getText().trim()));
			else
				pi.setX(0);

			if (!"".equals(itemP.getTtfY().getText().trim()))
				pi.setY(Integer.parseInt(itemP.getTtfY().getText().trim()));
			else
				pi.setY(0);

			pi.setDisAble(itemP.getCkbDisAble().isSelected());
			updPiList.add(pi);
		}
		return updPiList;
	}

	class ItemPanel extends JPanel {
		private static final long serialVersionUID = -1033772509486847170L;
		private JCheckBox ckbDisAble;
		private JLabel lblCode;
		private JTextField ttfName;
		private JComboBox cbbMapIndex;
		private JTextField ttfDefValue;
		private JTextField ttfX;
		private JTextField ttfY;

		public ItemPanel() {
			ckbDisAble = new JCheckBox();
			ckbDisAble.setPreferredSize(dim_1);

			lblCode = new JLabel();
			lblCode.setPreferredSize(dim_1);

			ttfName = new JTextField();
			ttfName.setPreferredSize(dim_2);

			cbbMapIndex = new JComboBox(BaseDataTable.columnNames);
			cbbMapIndex.setPreferredSize(dim_2);

			ttfDefValue = new JTextField();
			ttfDefValue.setPreferredSize(dim_3);

			ttfX = new JTextField();
			ttfX.setPreferredSize(dim_2);

			ttfY = new JTextField();
			ttfY.setPreferredSize(dim_2);

			Box box = Box.createHorizontalBox();
			box.add(lblCode);
			box.add(ckbDisAble);
			box.add(ttfName);
			box.add(cbbMapIndex);
			box.add(ttfDefValue);
			box.add(ttfX);
			box.add(ttfY);
			add(box);
		}

		public JCheckBox getCkbDisAble() {
			return ckbDisAble;
		}

		public void setCkbDisAble(JCheckBox ckbDisAble) {
			this.ckbDisAble = ckbDisAble;
		}

		public JLabel getLblCode() {
			return lblCode;
		}

		public void setLblCode(JLabel lblCode) {
			this.lblCode = lblCode;
		}

		public JTextField getTtfName() {
			return ttfName;
		}

		public void setTtfName(JTextField ttfName) {
			this.ttfName = ttfName;
		}

		public JComboBox getCbbMapIndex() {
			return cbbMapIndex;
		}

		public void setCbbMapIndex(JComboBox cbbMapIndex) {
			this.cbbMapIndex = cbbMapIndex;
		}

		public JTextField getTtfDefValue() {
			return ttfDefValue;
		}

		public void setTtfDefValue(JTextField ttfDefValue) {
			this.ttfDefValue = ttfDefValue;
		}

		public JTextField getTtfX() {
			return ttfX;
		}

		public void setTtfX(JTextField ttfX) {
			this.ttfX = ttfX;
		}

		public JTextField getTtfY() {
			return ttfY;
		}

		public void setTtfY(JTextField ttfY) {
			this.ttfY = ttfY;
		}
	}
}
