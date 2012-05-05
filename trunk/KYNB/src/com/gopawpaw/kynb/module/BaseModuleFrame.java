/**
 * 
 */
package com.gopawpaw.kynb.module;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.widget.BaseJInternalFrame;

/**
 * @version 2012-3-12
 * @author Jason
 */
public class BaseModuleFrame extends BaseJInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @throws HeadlessException
	 */
	public BaseModuleFrame() throws HeadlessException {
		initialize();
	}

	
	private void initialize() {
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("快译农保信息处理系统 ");
		GlobalParameter.initialize();
		
	}
}
