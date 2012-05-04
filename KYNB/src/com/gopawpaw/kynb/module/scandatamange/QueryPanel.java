package com.gopawpaw.kynb.module.scandatamange;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gopawpaw.kynb.bean.OtherData;

public class QueryPanel extends JPanel {
	private static final long serialVersionUID = 1463005949441101400L;
	private ScanDataMangeFrame mainFrame = null;
	private JPanel pnlFirst = null;
	private JComboBox cbbFirst = null;
	private JTextField tfdFirst = null;
	
	private JPanel pnlSceond = null;
	private JComboBox cbbSceond = null;
	private JTextField tfdSceond = null;
	
	private JPanel pnlThird = null;
	private JComboBox cbbThird = null;
	private JTextField tfdThird = null;	
	
	private JButton btnQuery = null;
	
	public QueryPanel(ScanDataMangeFrame mf) {
		this.mainFrame = mf;
		Box bgBox = Box.createHorizontalBox();
		bgBox.add(getPnlFirst());
		bgBox.add(getPnlSceond());
		bgBox.add(getPnlThird());
		bgBox.add(getButton());
		add(bgBox);
	}
	
	private JPanel getPnlFirst() {
		pnlFirst = new JPanel();
		cbbFirst = new JComboBox(TableScrollPane.getColumnNamesNoFirst());
		tfdFirst = new JTextField();
		tfdFirst.setPreferredSize(new Dimension(200, 21));
		pnlFirst.add(cbbFirst);
		pnlFirst.add(tfdFirst);
		return pnlFirst;
	}
	
	private JPanel getPnlSceond() {
		pnlSceond= new JPanel();
		cbbSceond = new JComboBox(TableScrollPane.getColumnNamesNoFirst());
		tfdSceond = new JTextField();
		tfdSceond.setPreferredSize(new Dimension(200, 21));
		pnlSceond.add(cbbSceond);
		pnlSceond.add(tfdSceond);
		return pnlSceond;
	}
	
	private JPanel getPnlThird() {
		pnlThird = new JPanel();
		cbbThird = new JComboBox(TableScrollPane.getColumnNamesNoFirst());
		tfdThird  = new JTextField();
		tfdThird .setPreferredSize(new Dimension(200, 21));
		pnlThird .add(cbbThird);
		pnlThird .add(tfdThird);
		return pnlThird;
	}
	
	private JButton getButton() {
		btnQuery = new JButton("≤È—Ø");
		btnQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executQuery();
			}
		});
		return btnQuery;
	}
	
	public void executQuery() {
		DataOpertor dot = new DataOpertor();
		List<OtherData> list = dot.findListByQB(createQueryBean());
		mainFrame.getSpnTable().refreshTable(list);	
	}
	
	private List<QueryBean> createQueryBean() {
		List<QueryBean> list = new ArrayList<QueryBean>();
		QueryBean qbF = new QueryBean();
		qbF.setColumnName((String)cbbFirst.getSelectedItem());
		qbF.setCondition(tfdFirst.getText().trim());
		
		QueryBean qbS = new QueryBean();
		qbS.setColumnName((String)cbbSceond.getSelectedItem());
		qbS.setCondition(tfdSceond.getText().trim());
		
		QueryBean qbT = new QueryBean();
		qbT.setColumnName((String)cbbThird.getSelectedItem());
		qbT.setCondition(tfdThird.getText().trim());
		
		list.add(qbF);
		list.add(qbS);
		list.add(qbT);
		
		return list;
	}
}
