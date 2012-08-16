package com.gopawpaw.kynb.module.print2;

import java.awt.Dimension;
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
	private Dimension dim = new Dimension(100, 22);
	private MainFrame mainFrame;
	private JButton btnExport = new JButton("导入");
	private JButton btnClear = new JButton("清空");
	private JButton btnAdd = new JButton("新增");
	private JButton btnUpd = new JButton("修改");
	private JButton btnDel = new JButton("删除");
	private JButton btnPrint = new JButton("打印");
	private JButton btnPtSet = new JButton("设置");
	
	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
/*		btnExport.setSize(dim);
		btnClear.setSize(dim);
		btnAdd.setSize(dim);
		btnUpd.setSize(dim);
		btnDel.setSize(dim);
		btnPrint.setSize(dim);
		btnPtSet.setSize(dim);*/
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDialog(mainFrame);
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
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		box.add(btnPrint);
		box.add(btnPtSet);
		add(box);
	}
}
