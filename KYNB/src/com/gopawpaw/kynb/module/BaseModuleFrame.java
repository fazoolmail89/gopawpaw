/**
 * 
 */
package com.gopawpaw.kynb.module;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.widget.BaseJInternalFrame;

/**
 * 子模块首页的基类，所有的子模块入口都必须继承自此类，并提供默认的构造函数
 * @version 2012-3-12
 * @author Jason
 */
public class BaseModuleFrame extends BaseJInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public BaseModuleFrame() {
		initialize();
	}

	
	private void initialize() {
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("<功能模块未定义> ");
		GlobalParameter.initialize();
		
	}
	
	/**
	 * 在JFrame中显示<br>
	 * 一般在模块单元测试中需要独立运行时调用的显示方法
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	public void showWithFrame(){
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.add(this);
		
		JFrame jf = new JFrame();
		jf.setSize(new Dimension(1000,600));
		jf.setTitle("快译农保-独立模块测试");
		jf.add(desktopPane);
		jf.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		jf.setVisible(true);
		
		try {
			setClosable(true);
			setMaximizable(true);
			setMaximum(true);
			setIconifiable(true);
			setResizable(true);
			setVisible(true);
			setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
