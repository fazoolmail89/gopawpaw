package com.gopawpaw.dev.test;

// Frame for the Sketcher application
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class SketchFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6685328094484561227L;
	private JMenuBar menuBar = new JMenuBar(); // Window menu bar
	private JMenuItem newItem;
	// Constructor
	public SketchFrame(String title) {
		setTitle(title); // Set the window title
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setJMenuBar(menuBar); // Add the menu bar to the window

		JMenu fileMenu = new JMenu("File"); // Create File menu
		JMenu elementMenu = new JMenu("Elements"); // Create Elements menu
		fileMenu.setMnemonic('F'); // 快捷键alt+f
		elementMenu.setMnemonic('E');

		newItem = fileMenu.add("new");
		fileMenu.add("Open");
		newItem.setAccelerator((KeyStroke) KeyStroke.getAWTKeyStroke('N',
				java.awt.Event.CTRL_MASK, true));//

		elementMenu.add(new JRadioButtonMenuItem("line", true));
		elementMenu.add(new JRadioButtonMenuItem("circle", false));
		elementMenu.addSeparator();// 分隔线
		JMenu colorMenu = new JMenu("Color");
		elementMenu.add(colorMenu); // 子菜单
		colorMenu.add(new JCheckBoxMenuItem("Red", false));
		colorMenu.add(new JCheckBoxMenuItem("Yellow", true));

		menuBar.add(fileMenu); // Add the file menu
		menuBar.add(elementMenu); // Add the element menu
	}

	public static void main(String[] args) {
		SketchFrame aSketchFrame = new SketchFrame("test");
		aSketchFrame.setVisible(true);
	}

}
