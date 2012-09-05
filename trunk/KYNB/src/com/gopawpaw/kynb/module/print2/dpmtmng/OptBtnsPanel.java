package com.gopawpaw.kynb.module.print2.dpmtmng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
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

	public OptBtnsPanel(ThorpMngDialog fdialog) {
		this.fdialog = fdialog;
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		add(box);
	}
}
