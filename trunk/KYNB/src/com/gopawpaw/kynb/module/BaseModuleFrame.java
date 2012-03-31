/**
 * 
 */
package com.gopawpaw.kynb.module;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.common.BaseFrame;
import com.gopawpaw.kynb.XXNCYLBXMain;
import com.gopawpaw.kynb.utils.GppConfiguration;

/**
 * @version 2012-3-12
 * @author Jason
 */
public class BaseModuleFrame extends BaseFrame{

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

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public BaseModuleFrame(String[] args) throws HeadlessException {
		super(args);
		initialize();
	}

	/**
	 * @param gc
	 */
	public BaseModuleFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public BaseModuleFrame(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public BaseModuleFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}
	
	private void initialize() {
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("快译农保信息处理系统 ");
		GlobalParameter.initialize();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("Applications.jpg");
		setIconImage(img);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
