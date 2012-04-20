package com.gopawpaw.kynb.module.idnoupgrade4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class IdnoUpgrade4 extends BaseModuleFrame implements
		GppJarRunableInterface {
	private static final long serialVersionUID = -3660717367105367561L;
	private static IdnoUpgrade4 thisClass = null;
	private JButton btnOpenExe = null;

	public IdnoUpgrade4() {
		btnOpenExe = new JButton("�����֤����������������");
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
			path = directory.getCanonicalPath() + "/resource/���֤������������/���֤������������.exe";
			//errorInfo = FindProcessofExe.findProcess("���֤������������.exe");
			//if("".equals(errorInfo))
			p = rn.exec(path);
		} catch (Exception e) {
			errorInfo = "������ô�������ϵ������Ա��";
			System.out.println("Error exec!");
		} finally {
			if(!"".equals(errorInfo)) {
				MutualDialog md = new MutualDialog(thisClass, errorInfo);
			}
		}
	}
	
	@Override
	public boolean runJar(String[] args) {
		IdnoUpgrade4.main(args);
		return false;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				 thisClass = new IdnoUpgrade4();
				thisClass.setVisible(true);
			}
		});
	}
}
