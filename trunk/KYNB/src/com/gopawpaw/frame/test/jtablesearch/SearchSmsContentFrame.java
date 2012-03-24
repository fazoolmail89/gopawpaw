/**
 * 
 */
package com.gopawpaw.frame.test.jtablesearch;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @version 2010-5-9
 * @author �����
 * 
 */
public class SearchSmsContentFrame extends JFrame {

	JTable table = null;

	Vector vecHead = new Vector();

	Vector vecContent = new Vector();

	DefaultTableModel defaultModel = null;

	private JTextField textArea;

	public SearchSmsContentFrame() {
		init();
	}

	private void init() {
		setTitle("SearchSmsContentFrame");
		setSize(300, 200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Container contentPane = getContentPane();

		// ����������ݣ�������ط��Ƿŵļټ�¼������ʵ����Ŀ��ʱ����Դ����ݿ���ļ��ж�ȡ����
		vecHead.add("�ֶ� 1");
		vecHead.add("�ֶ� 2");
		vecHead.add("�ֶ� 3");
		vecHead.add("�ֶ� 4");
		vecHead.add("�ֶ� 5");

		int value = 1;
		for (int i = 0; i < 10000; i++) {
			Vector colVec = new Vector();
			for (int j = 0; j < 5; j++) {
				colVec.add(String.valueOf(value++));
			}
			vecContent.add(colVec);
		}

		// this text area holds the activity output
		textArea = new JTextField("", 10);

		// set up panel with button and progress bar
		defaultModel = new DefaultTableModel(vecContent, vecHead);
		table = new JTable(defaultModel);

		table.setPreferredScrollableViewportSize(new Dimension(400, 600));

		// ��ӱ�����
		JScrollPane s = new JScrollPane(table);

		// ����ĵ��¼�
		textArea.getDocument().addDocumentListener(
				new UpperDocumentListener(table, vecContent, vecHead));

		JPanel panel = new JPanel();
		panel.add(textArea);
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(s, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		SearchSmsContentFrame search = new SearchSmsContentFrame();

		search.setSize(new Dimension(600, 480));

		search.setVisible(true);
	}
}
