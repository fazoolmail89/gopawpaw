package com.gopawpaw.kynb.module.print2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**     
 * @author luxiangqi luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = -1375038623430954359L;
	private MainFrame mainFrame;
	private JButton btnExport = new JButton("导入");
	private JButton btnClear = new JButton("清空");
	private JButton btnAdd = new JButton("新增");
	private JButton btnUpd = new JButton("修改");
	private JButton btnDel = new JButton("删除");
	private JButton btnView = new JButton("查看");
	private JButton btnPrint = new JButton("打印");
	private JButton btnPtSet = new JButton("设置");
	
	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDataEditDialog(mainFrame,
						"新增数据",
						null, 
						PrintDataEditDialog.ADD_OPT);				
			}
		});
		
		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDataEditDialog(mainFrame, 
						"修改数据",
						mainFrame.getSpnBDT().getSelectPrintData(),
						PrintDataEditDialog.UPTD_OPT);
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDataEditDialog(mainFrame, 
						"查看数据",
						mainFrame.getSpnBDT().getSelectPrintData(),
						PrintDataEditDialog.VIEW_OPT);
			}
		});		

		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getSpnBDT().getSelectNextRow();
			}
		});
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDialog(mainFrame, mainFrame.getSpnBDT().getSelectRow());
			}
		});
		
		btnPtSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PtSetDialog(mainFrame);
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnExport);
		box.add(btnClear);
		box.add(btnView);
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		box.add(btnPrint);
		box.add(btnPtSet);
		add(box);
	}
}
