package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

public class FontDialog {
	private Dialog fontdialog;

	private JButton okButton, cancelButton;

	private int width = 450;

	private int height = 250;

	private String name = "Serif";

	private int type = 0;

	private int size = 12;

	private Font customFont = new Font("宋体", Font.ITALIC, 12);

	private boolean okpressed = false;

	private JLabel lbl1 = new JLabel("字体：");

	private JLabel lbl2 = new JLabel("字形：");

	private JLabel lbl3 = new JLabel("字号：");

	private JTextArea area;

	String[] zx = { "平体", "加粗", "斜体", "基线" };

	JLabel lbl = new JLabel("字体样式Style");

	private JComboBox cb1, cb3, cb2 = new JComboBox(zx);

	private String[] zt;

	public FontDialog(Frame owner, String title, boolean modal) {
		init();
		fontdialog = new Dialog(owner, title, modal);
		fontdialog.setLocation(owner.getLocation());
		fontdialog.setLayout(new FlowLayout());
		fontdialog.setSize(getWidth(), getHeight());
		fontdialog.add(lbl1);
		fontdialog.add(cb1);
		fontdialog.add(lbl2);
		fontdialog.add(cb2);
		fontdialog.add(lbl3);
		fontdialog.add(cb3);
		fontdialog.add(okButton);
		fontdialog.add(cancelButton);
		fontdialog.add(area);
		fontdialog.setResizable(false);
		fontdialog.setAlwaysOnTop(true);
		fontdialog.setBackground(new Color(145, 167, 220));
		cancelButton.addActionListener(new fontListener());
		okButton.addActionListener(new fontListener());
		fontdialog.addWindowListener(new fontListener());
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				int state = event.getStateChange();
				name = (String) event.getItem();
				setCustomFont(new Font(name, type, size));
			}
		});
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				int state = event.getStateChange();
				String s = (String) event.getItem();
				if (s.equals("平体")) {
					type = Font.PLAIN;
					setCustomFont(new Font(name, type, size));
				} else if (s.equals("加粗")) {
					type = Font.BOLD;
					setCustomFont(new Font(name, type, size));
				} else if (s.equals("斜体")) {
					type = Font.ITALIC;
					setCustomFont(new Font(name, type, size));
				} else {
					type = Font.CENTER_BASELINE;
					setCustomFont(new Font(name, type, size));
				}

			}
		});
		cb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				String state = event.getItem().toString();
				size = Integer.parseInt(state);
				setCustomFont(new Font(name, type, size));
			}
		});

	}

	public Font showFontDialog() {
		fontdialog.setVisible(true);
		if (okpressed) {
			return getCustomFont();
		} else {
			return customFont;
		}
	}

	private void init() {
		okButton = new JButton("确定");
		cancelButton = new JButton("取消");
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		zt = ge.getAvailableFontFamilyNames();
		cb1 = new JComboBox(zt);
		cb1.setMaximumRowCount(6);
		area = new JTextArea(6, 30);
		cb3 = new JComboBox();
		for (int i = 1; i <= 72; i++) {
			if (i % 2 == 0) {
				cb3.addItem(i);
			}
		}
		okButton.setFocusable(true);
		area.setEditable(false);
		area.setText(new Date().toString());
		area.setBorder(new TitledBorder("字体样式"));
		area.setBackground(new Color(255, 122, 0));
		okButton.setBackground(new Color(122, 122, 122));
		cancelButton.setBackground(new Color(122, 122, 122));

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int getWidth() {
		return (this.width);
	}

	private int getHeight() {
		return (this.height);
	}

	private void setCustomFont(Font customFont) {
		this.customFont = customFont;
		area.setFont(customFont);
		area.revalidate();

	}

	public String toString() {
		return FontDialog.class.toString();
	}

	public Font getCustomFont() {
		return (this.customFont);
	}

	private class fontListener extends WindowAdapter implements ActionListener {
		public void windowClosing(WindowEvent e) {
			fontdialog.dispose();
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cancelButton) {
				fontdialog.dispose();
			} else if (e.getSource() == okButton) {
				okpressed = true;
				setCustomFont(new Font(name, type, size));
				fontdialog.dispose();
			}
		}
	}
	public static void main(String[] args){
		FontDialog fd = new FontDialog(new JFrame(),"www",true);
		fd.showFontDialog();
	}

}
