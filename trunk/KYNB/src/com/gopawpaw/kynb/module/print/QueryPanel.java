package com.gopawpaw.kynb.module.print;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class QueryPanel extends JPanel {
	private static final long serialVersionUID = -1981810628043724422L;
	private PrintFrame mainFrame;
	
	private static final String[] PRINT_STATS = {"δ��ӡ", "�Ѵ�ӡ","����"};
	
	private JLabel lblThorp = new JLabel("���ڴ�");
	private JComboBox cbbThorp  = null;
	
	private JLabel lblName = new JLabel("����");
	private JTextField ttfName = new JTextField();
	
	private JLabel lblICCode = new JLabel("���֤��");
	private JTextField ttfICCode = new JTextField();
	
	private JLabel lblPrint = new JLabel("��ӡ���");
	private JComboBox cbbPrint  = new JComboBox(PRINT_STATS);
	
	private JButton btnQuery = new JButton("��ѯ");
	
	public QueryPanel(PrintFrame mf) {
		this.mainFrame = mf;
		
		Dimension dsLbl = new Dimension(60, 20);
		Dimension dsTtf = new Dimension(150, 20);

		lblThorp.setPreferredSize(dsLbl);
		lblThorp.setHorizontalAlignment(SwingConstants.RIGHT); 
		cbbThorp = new JComboBox(new DataOperator().findThorpArray());
		cbbThorp.setPreferredSize(dsTtf);
		
		lblName.setPreferredSize(dsLbl);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfName.setPreferredSize(dsTtf);
		
		lblICCode.setPreferredSize(dsLbl);
		lblICCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfICCode.setPreferredSize(dsTtf);
		
		lblPrint.setPreferredSize(dsLbl);
		lblPrint.setHorizontalAlignment(SwingConstants.RIGHT); 
		cbbPrint.setPreferredSize(dsTtf);
		
		add(lblThorp);
		add(cbbThorp);
		
		add(lblName);
		add(ttfName);
		
		add(lblICCode);
		add(ttfICCode);
		
		add(lblPrint);
		add(cbbPrint);
		
		add(btnQuery);
		
		btnQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Map<String,String> parames = new HashMap<String, String>();
				parames.put(DataOperator.NAME, ttfName.getText().toString().trim());
				parames.put(DataOperator.ICCODE, ttfICCode.getText().toString().trim());
				mainFrame.getSpnLT().refreshTable(new DataOperator().findByParams(parames));
			}
		});
		
	}
}
