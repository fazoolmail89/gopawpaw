package com.gopawpaw.kynb.module.print2.dpmtmng;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JDialog;

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.MainFrame;

/**	
 *  
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class ThorpMngDialog extends JDialog {
	private static final long serialVersionUID = 5872706229490156047L;

	private MainFrame mainFrame;
	
	private QueryPanel pnlQuery;
	private TableScrollPane tspThorpsTable;
	private OptBtnsPanel pnlOptBtns;
	public ThorpMngDialog(MainFrame mf) {
		this.mainFrame = mf;
		
		pnlQuery = new QueryPanel(this);
		pnlQuery.setBorder(BorderFactory.createTitledBorder(""));
		
		tspThorpsTable = new TableScrollPane(this);
		tspThorpsTable.setBorder(BorderFactory.createTitledBorder("�����б�"));
		
		pnlOptBtns = new OptBtnsPanel(this);
		pnlOptBtns.setBorder(BorderFactory.createTitledBorder("������"));		
		
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(tspThorpsTable, BorderLayout.CENTER);
		add(pnlOptBtns, BorderLayout.EAST);
		
		setTitle("��������Ի���");
		setSize(300, 400);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		 
		// �̶���С
		setResizable(false);
		setModal(true);		
		setVisible(true);
	}
	
	public TableScrollPane getTspThorpsTable() {
		return tspThorpsTable;
	}

	public QueryPanel getPnlQuery() {
		return pnlQuery;
	}
}
