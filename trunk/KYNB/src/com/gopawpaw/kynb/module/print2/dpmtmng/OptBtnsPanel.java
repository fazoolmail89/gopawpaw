package com.gopawpaw.kynb.module.print2.dpmtmng;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = -8925941701245494929L;
	
	private ThorpMngDialog fdialog;
	
	private JButton btnAdd = new JButton("新增");
	private JButton btnUpd = new JButton("修改");
	private JButton btnDel = new JButton("删除");

	public OptBtnsPanel(ThorpMngDialog f) {
		this.fdialog = f;
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				
				PrintThorp pt = new PrintThorp();
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//进行数据校验
				DataValidate dv = new DataValidate();
				String error = dv.addValidate(pt);
				if(error == null || "".equals(error)) {
					PrintThorpDAO ptdao = new PrintThorpDAO();
					if(ptdao.save(pt)) {
						//保存成功刷新数据
						JOptionPane.showMessageDialog(null, "保存成功！", "数据保存提示！",
								JOptionPane.PLAIN_MESSAGE);		
						fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
					} else {
						JOptionPane.showMessageDialog(null, "保存失败！", "数据保存提示！",
								JOptionPane.ERROR_MESSAGE);	
					}
				} else {
					//校验失败，提示用户错误信息，并设置焦点
					JOptionPane.showMessageDialog(null, error, "数据校验提示！",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}
			}
		});
		
		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				if(fdialog.getTspThorpsTable().getSelectRow() == null) {
					JOptionPane.showMessageDialog(null, 
							"请先在机构列表中选中相应的记录！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);	
					return;
				}
				
				String oldName = fdialog.getTspThorpsTable().getSelectRow().getName();
				String newName = fdialog.getPnlQuery().getTtfName().getText().trim();
				if(oldName.equals(newName)) return;					
		
				PrintThorp pt = new PrintThorp();
				pt.setId(fdialog.getTspThorpsTable().getSelectRow().getId());
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//进行数据校验
				DataValidate dv = new DataValidate();
				String error = dv.updValidate(pt);
				if(error == null || "".equals(error)) {
					PrintThorpDAO ptdao = new PrintThorpDAO();
					if(ptdao.update(pt)) {
						//保存成功刷新数据
						JOptionPane.showMessageDialog(null, "保存成功！", "数据保存提示！",
								JOptionPane.PLAIN_MESSAGE);		
						fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
					} else {
						JOptionPane.showMessageDialog(null, "保存失败！", "数据保存提示！",
								JOptionPane.ERROR_MESSAGE);	
					}
				} else {
					//校验失败，提示用户错误信息，并设置焦点
					JOptionPane.showMessageDialog(null, error, "数据校验提示！",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}				
			}
		});
		
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				if(fdialog.getTspThorpsTable().getSelectRow() == null) {
					JOptionPane.showMessageDialog(null, 
							"请先在机构列表中选中相应的记录！", 
							"操作提示！",
							JOptionPane.ERROR_MESSAGE);	
					return;
				}
				
				PrintThorp pt = new PrintThorp();
				pt.setId(fdialog.getTspThorpsTable().getSelectRow().getId());
				pt.setName(fdialog.getPnlQuery().getTtfName().getText().trim());
				
				//进行数据校验
				DataValidate dv = new DataValidate();
				String error = dv.delValidate(pt);
				if(error == null || "".equals(error)) {
					//询问用户是否进行确认进行删除操作
					int rv =  JOptionPane.showConfirmDialog(null,
							"是否确认删除名称为【" + pt.getName() + "】的机构？", "删除提示！", 
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					
					if(rv == 0) {
						PrintThorpDAO ptdao = new PrintThorpDAO();
						if(ptdao.delete(pt.getId())) {
							//删除成功刷新数据
							JOptionPane.showMessageDialog(null, "删除成功！", "数据保存提示！",
									JOptionPane.PLAIN_MESSAGE);		
							fdialog.getTspThorpsTable().refreshTable(ptdao.findArrayToTable(null));
						} else {
							JOptionPane.showMessageDialog(null, "删除失败！", "数据保存提示！",
									JOptionPane.ERROR_MESSAGE);	
						}						
					}
				} else {
					//校验失败，提示用户错误信息，并设置焦点
					JOptionPane.showMessageDialog(null, error, "数据校验提示！",
							JOptionPane.ERROR_MESSAGE);	
					fdialog.getPnlQuery().getTtfName().setFocusable(true);
				}			
				
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		add(box);
	}
}
