package com.gopawpaw.kynb.module.print2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
	private JButton btnImport = new JButton("导入");
	private JButton btnExport = new JButton("导出");
	private JButton btnClear = new JButton("批量删除");
	private JButton btnAdd = new JButton("新增");
	private JButton btnUpd = new JButton("修改");
	private JButton btnDel = new JButton("删除");
	private JButton btnView = new JButton("查看");
	private JButton btnPrint = new JButton("打印");
	private JButton btnPtSet = new JButton("设置");
	private JButton btnThorpMng = new JButton("机构管理");

	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
		setBorder(BorderFactory.createTitledBorder("常用操作"));	
			
		//设置按钮样式
		//------------------------------------
		btnImport.setMaximumSize(MyStyle.BTN_DIM);
		btnExport.setMaximumSize(MyStyle.BTN_DIM);
		btnClear.setMaximumSize(MyStyle.BTN_DIM);
		btnAdd.setMaximumSize(MyStyle.BTN_DIM);
		btnUpd.setMaximumSize(MyStyle.BTN_DIM);
		btnDel.setMaximumSize(MyStyle.BTN_DIM);
		btnView.setMaximumSize(MyStyle.BTN_DIM);
		btnPrint.setMaximumSize(MyStyle.BTN_DIM);
		btnPtSet.setMaximumSize(MyStyle.BTN_DIM);
		btnThorpMng.setMaximumSize(MyStyle.BTN_DIM);

		btnImport.setFont(MyStyle.BTN_FONT_PLAIN);
		btnExport.setFont(MyStyle.BTN_FONT_PLAIN);
		btnClear.setFont(MyStyle.BTN_FONT_PLAIN);
		btnAdd.setFont(MyStyle.BTN_FONT_PLAIN);
		btnUpd.setFont(MyStyle.BTN_FONT_PLAIN);
		btnDel.setFont(MyStyle.BTN_FONT_PLAIN);
		btnView.setFont(MyStyle.BTN_FONT_BOLD);
		btnPrint.setFont(MyStyle.BTN_FONT_BOLD);
		btnPtSet.setFont(MyStyle.BTN_FONT_PLAIN);
		btnThorpMng.setFont(MyStyle.BTN_FONT_PLAIN);
		//------------------------------------

		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				// 导入操作
				BasicDataImport thisClass = new BasicDataImport(
						BasicDataImport.TABLE_PRINTDATA);
				thisClass.setModal(true);
				thisClass.setVisible(true);
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				Object[][] excelData = mainFrame.getSpnBDT().getData();
				if (excelData != null && excelData.length > 0) {
					// 打开文件保存视图
					int returnVal = mainFrame.getFilechooser().showSaveDialog(
							mainFrame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						// 获取要保存的文件
						File file = mainFrame.getFilechooser()
								.getSelectedFile();
						mainFrame.executExportExcel(new File(file.getPath()));
					}
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "没有数据，不需要导出！",
							"文件保存提示！", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
					//弹出命令输入窗口
					new DataClearDialog(mainFrame); 
			}
		});

		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new PrintDataEditDialog(
						mainFrame, 
						"新增数据", 
						null,
						PrintDataEditDialog.ADD_OPT);
			}
		});

		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, "修改数据", pd,
							PrintDataEditDialog.UPTD_OPT);
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "请先在列表中选择对应的数据！",
							"操作提示！", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, "查看数据", pd,
							PrintDataEditDialog.VIEW_OPT);
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "请先在列表中选择对应的数据！",
							"操作提示！", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					Toolkit.getDefaultToolkit().beep();
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"执行删除操作数据将无法恢复，是否确认执行该操作？", "删除提示！",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					if (rv == 0) {
						PrintDataDAO pdDao = new PrintDataDAO();
						if (pdDao.delete(pd.getId())) {
							JOptionPane.showMessageDialog(null, "删除成功！",
									"操作提示！", JOptionPane.PLAIN_MESSAGE);
							// 删除成功，刷新界面
							mainFrame.getPnlQuery().executQuery();
						} else
							JOptionPane.showMessageDialog(null, "删除失败！",
									"保存文件提示！", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "请先在列表中选择对应的数据！",
							"操作提示！", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				mainFrame.getSpnBDT().getSelectNextRow();
			}
		});

		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new PrintDialog(mainFrame, mainFrame.getSpnBDT().getSelectRow());
			}
		});

		btnPtSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				new PtSetDialog(mainFrame);
			}
		});

		btnThorpMng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//检查用户是否登入
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"请先登入才能执行操作！",
							"文件保存提示！", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new ThorpMngDialog(mainFrame);
				mainFrame.getPnlQuery().refreshCbbDpmt();
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnPrint);
		box.add(btnView);
		box.add(btnImport);
		box.add(btnExport);
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		box.add(btnClear);
		box.add(btnPtSet);
		box.add(btnThorpMng);
		add(box);
	}
}
