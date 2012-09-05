package com.gopawpaw.kynb.module.print2.dpmtmng;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class QueryPanel extends JPanel {
	private static final long serialVersionUID = -341551589704218815L;

	private ThorpMngDialog fdialog;
	
	private JLabel lblName;
	private JTextField ttfName;

	private JButton btnQuery;
	
	public QueryPanel(ThorpMngDialog fdialog) {
		this.fdialog = fdialog;
		
		lblName = new JLabel("机构名称");
		lblName.setPreferredSize(new Dimension(80, 20));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT); 
		
		ttfName = new JTextField("");
		ttfName.setPreferredSize(new Dimension(100, 20));
		
		btnQuery = new JButton("查询");
		
		btnQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executQuery();
			}
		});
		
		add(lblName);
		add(ttfName);
		add(btnQuery);
	}
	
	public void executQuery() {
		PrintThorpDAO ptd = new PrintThorpDAO();
		fdialog.getTspThorpsTable().refreshTable(
				ptd.findArrayToTable(ttfName.getText().toString().trim()));
	}
	
	public JTextField getTtfName() {
		return ttfName;
	}
}
