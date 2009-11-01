/**
 * 
 */
package com.gopawpaw.dev.test;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @version 2009-10-4
 * @author Àî½õ»ª
 */
public class TryFlowLayout {
	// The window object
	static JFrame aWindow = new JFrame("This is a Flow Layout");

	public static void myComponent(Container content) {
		Component[] cp = content.getComponents();
		for (Component component : cp) {
			System.out.println(component);
		}
	}

	public static void main(String[] args) {
		Toolkit theKit = aWindow.getToolkit(); // Get the window toolkit
		Dimension wndSize = theKit.getScreenSize(); // Get screen size
		// Set the position to screen center & size to half screen size
		aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, // Position
				wndSize.width / 2, wndSize.height / 2); // Size
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout flow = new FlowLayout(); // Create a layout manager
		Container content = aWindow.getContentPane(); // Get the content pane
		content.setLayout(flow); // Set the container layout mgr
		flow.setVgap(50);
		// Now add six button components
		for (int i = 1; i <= 6; i++)
			content.add(new JButton("Press " + i)); // Add a Button to content
													// pane

		aWindow.setVisible(true); // Display the window

		myComponent(content);
	}
}
