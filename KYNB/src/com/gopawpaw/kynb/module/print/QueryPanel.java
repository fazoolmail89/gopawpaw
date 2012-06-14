package com.gopawpaw.kynb.module.print;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class QueryPanel extends JPanel {
	private static final long serialVersionUID = -1981810628043724422L;
	private PrintFrame mainFrame;
	private JLabel lblName = new JLabel("姓名");
	private JTextField ttfName = new JTextField();
	
	private JLabel lblICCode = new JLabel("身份证号");
	private JTextField ttfICCode = new JTextField();
	
	private JButton btnQuery = new JButton("查询");
	
	public QueryPanel(PrintFrame mf) {
		this.mainFrame = mf;
		
		Dimension dsLbl = new Dimension(100, 20);
		Dimension dsTtf = new Dimension(150, 20);
		
		lblName.setPreferredSize(dsLbl);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfName.setPreferredSize(dsTtf);
		
		lblICCode.setPreferredSize(dsLbl);
		lblICCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfICCode.setPreferredSize(dsTtf);
		
		add(lblName);
		add(ttfName);
		
		add(lblICCode);
		add(ttfICCode);
		
		add(btnQuery);
	}
}
