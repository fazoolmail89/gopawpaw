/**
 * 
 */
package com.gopawpaw.dev.test;

/**
 * @version 2010-1-31
 * @author 李锦华
 */
import java.awt.*;
import java.awt.event.*;

class DisposeFrame extends Frame {
	Button b;

	DisposeFrame() {
		super("dispose测试窗体");
		init();
	}

	public void init() {
		b = new Button("关闭窗口");
		b.setSize(new Dimension(20, 20));
		add(b);
		b.addActionListener(new SubActionListener());
	}

	class SubActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
//			System.out.println("eee");
			dispose();
		}
	};

};

public class MainFrame extends Frame {
	Button newb;

	MainFrame(String title) {
		super(title);
		newb = new Button("创建窗体");
		newb.setSize(new Dimension(20, 20));
		add(newb);
		newb.addActionListener(new Myactionlistener());
		addWindowListener(new Mywindowadapter());

	}

	public static void main(String[] args) {
		MainFrame mf;

		mf = new MainFrame("主窗体");
		mf.setSize(300, 300);
		mf.setVisible(true);

	}

	class Myactionlistener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			DisposeFrame df = new DisposeFrame();
			df.setSize(200, 200);
			df.setVisible(true);
		}
	};

	class Mywindowadapter extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	};
}