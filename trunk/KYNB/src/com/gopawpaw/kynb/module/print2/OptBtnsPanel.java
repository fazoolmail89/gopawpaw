package com.gopawpaw.kynb.module.print2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.module.print2.dataimport.BasicDataImport;
import com.gopawpaw.kynb.module.print2.dpmtmng.ThorpMngDialog;

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
	private JButton btnThorpMng = new JButton("机构管理");
	
	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
		
		//javax.swing.plaf.ButtonUI bui = new ButtonUI() {};
		//btnAdd.setUI(bui);
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//导入操作
				BasicDataImport thisClass = new BasicDataImport(BasicDataImport.TABLE_PRINTDATA);
				thisClass.setModal(true);
				thisClass.setVisible(true);
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"即将清空数据库中所有操作，是否确认执行此操作？", "操作警告！", 
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0)
					rv = JOptionPane.showConfirmDialog(mainFrame,
							"即将清空数据库中所有操作，请再次确认？", "操作警告！", 
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0) {
					PrintDataDAO pddao = new PrintDataDAO();
					if (pddao.cleare()) {
						JOptionPane.showMessageDialog(null, "清除成功！", "操作提示！",
								JOptionPane.PLAIN_MESSAGE);
						//删除成功，刷新界面
						mainFrame.getPnlQuery().executQuery();
					} else
						JOptionPane.showMessageDialog(null, "清除失败！", "保存文件提示！",
								JOptionPane.ERROR_MESSAGE);
				}
					
				
			}
		});
		
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
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if(pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, 
							"修改数据",
							pd,
							PrintDataEditDialog.UPTD_OPT);				
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, 
							"请先在列表中选择对应的数据！", 
							"保存文件提示！",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if(pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, 
							"查看数据",
							pd,
							PrintDataEditDialog.UPTD_OPT);				
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, 
							"请先在列表中选择对应的数据！", 
							"保存文件提示！",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});		
		
		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = mainFrame.getSpnBDT().getSelectPrintData().getId();
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"执行删除操作数据将无法恢复，是否确认执行该操作？", "删除提示！", 
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0) {
					PrintDataDAO pdDao = new PrintDataDAO();
					if (pdDao.delete(id)) {
						JOptionPane.showMessageDialog(null, "删除成功！", "操作提示！",
								JOptionPane.PLAIN_MESSAGE);
						//删除成功，刷新界面
						mainFrame.getPnlQuery().executQuery();
					} else
						JOptionPane.showMessageDialog(null, "删除失败！", "保存文件提示！",
								JOptionPane.ERROR_MESSAGE);
				}
				
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
		
		btnThorpMng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThorpMngDialog(mainFrame);
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
		box.add(btnThorpMng);
		add(box);
	}
}
