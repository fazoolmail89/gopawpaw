package com.gopawpaw.kynb.module.idnoupgrade4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.lxq.swing.util.SwingConsole;

public class MutualDialog extends JDialog {
	private static final long serialVersionUID = -4557608213171202955L;
	private static final int DEFAULT_HEIGHT = 100;
	private static final int DEFAULT_WIDTH = 300;
	private JLabel messageLabel = null;
	private Frame fatherFrame;
	public MutualDialog(Frame fatherFrame,String message) {
		super(fatherFrame);
		this.fatherFrame = fatherFrame;
		messageLabel = new JLabel(message);
		messageLabel.setFont(new Font("宋体 ",java.awt.Font.BOLD,14));
		add(messageLabel);
		setLayout(new FlowLayout());
		setTitle("提示信息");
		setBounds(SwingConsole.getTop(DEFAULT_WIDTH), SwingConsole
				.getTop(DEFAULT_HEIGHT), DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation();
		setVisible(true);
		setModal(true);
	}
	
	public void setLocation() {
		int left = (fatherFrame.getWidth() - this.getWidth())/2 + fatherFrame.getX();
		int top = (fatherFrame.getHeight() - this.getHeight())/2 + fatherFrame.getY();
		setLocation(left, top);
	}
}
