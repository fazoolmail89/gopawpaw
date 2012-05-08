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
 * ��ģ����ҳ�Ļ��࣬���е���ģ����ڶ�����̳��Դ��࣬���ṩĬ�ϵĹ��캯��
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
		this.setTitle("<����ģ��δ����> ");
		GlobalParameter.initialize();
		
	}
	
	/**
	 * ��JFrame����ʾ<br>
	 * һ����ģ�鵥Ԫ��������Ҫ��������ʱ���õ���ʾ����
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
		jf.setTitle("����ũ��-����ģ�����");
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
