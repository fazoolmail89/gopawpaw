package com.gopawpaw.kynb.module.idnoupgrade4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.StringConstant;

public class IdnoUpgrade4 extends BaseModuleFrame {
	private static final long serialVersionUID = -3660717367105367561L;
	private JButton btnOpenExe = null;

	public IdnoUpgrade4() {
		
		if(!GlobalParameter.isAuthModuls){
			//非法授权
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"系统提示", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		btnOpenExe = new JButton("打开身份证号码升级批处理工具");
		btnOpenExe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openExe();
			}
		});
		
		add(btnOpenExe);
		setLayout(new FlowLayout());
	}

	@SuppressWarnings("unused")
	public static void openExe() {
		Runtime rn = Runtime.getRuntime();
		Process p = null;
		File directory = null;
		String path = "";
		String errorInfo = "";
		try {
			directory = new File(".");  
			path = directory.getCanonicalPath() + "/resource/身份证号码批量升级/身份证号码批量升级.exe";
			p = rn.exec(path);
		} catch (Exception e) {
			errorInfo = "程序调用错误，请联系开发人员！";
			System.out.println("Error exec!");
		} finally {
			if(!"".equals(errorInfo)) {
				JOptionPane.showMessageDialog(null, errorInfo, "错误提示！",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				IdnoUpgrade4 thisClass = new IdnoUpgrade4();
				thisClass.showWithFrame();
			}
		});
	}
}
