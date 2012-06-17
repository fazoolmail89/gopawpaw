/**
 * 
 */
package com.gopawpaw.kynb.module.modulemanage;

import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

/**
 * @version 2012-5-28
 * @author Jason
 */
public class ModuleManage extends BaseModuleFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModuleManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				ModuleManage thisClass = new ModuleManage();
				thisClass.showWithFrame();
			}
		});
	}
}
