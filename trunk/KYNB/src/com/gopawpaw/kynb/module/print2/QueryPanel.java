package com.gopawpaw.kynb.module.print2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorp;
import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorpDAO;

public class QueryPanel extends JPanel {
	private static final long serialVersionUID = -1981810628043724422L;
	private MainFrame mainFrame;
	
	private static final String[] PRINT_STATS = {"δ��ӡ", "�Ѵ�ӡ","����"};
	//���������б�
	private PrintThorp[] ptArray = {};
	
	private JLabel lblThorp = new JLabel("��������");
	private JComboBox cbbThorp  = null;
	private JTextField ttfThorpName = new JTextField();
	
	private JLabel lblName = new JLabel("����");
	private JTextField ttfName = new JTextField();
	
	private JLabel lblICCode = new JLabel("���֤��");
	private JTextField ttfICCode = new JTextField();
	
	private JLabel lblPrint = new JLabel("��ӡ���");
	private JComboBox cbbPrint  = new JComboBox(PRINT_STATS);
	
	private JButton btnQuery = new JButton("��ѯ");
	
	public QueryPanel(MainFrame mf) {
		this.mainFrame = mf;
		// ��ʼ������
		initPtArray();
		
		Dimension dsLbl = new Dimension(50, 20);
		//Dimension dsTtf = new Dimension(100, 20);

		lblThorp.setPreferredSize(dsLbl);
		lblThorp.setHorizontalAlignment(SwingConstants.RIGHT); 
		cbbThorp = new JComboBox(ptArray);
		cbbThorp.setPreferredSize(new Dimension(80, 20));
		ttfThorpName.setPreferredSize(new Dimension(100, 20));
		
		lblName.setPreferredSize(dsLbl);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfName.setPreferredSize(new Dimension(100, 20));
		
		lblICCode.setPreferredSize(dsLbl);
		lblICCode.setHorizontalAlignment(SwingConstants.RIGHT); 
		ttfICCode.setPreferredSize(new Dimension(100, 20));
		
		lblPrint.setPreferredSize(dsLbl);
		lblPrint.setHorizontalAlignment(SwingConstants.RIGHT); 
		cbbPrint.setPreferredSize(new Dimension(80, 20));

		
		btnQuery.setMaximumSize(MyStyle.BTN_DIM);
		btnQuery.setFont(MyStyle.BTN_FONT_PLAIN);
		btnQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executQuery();
			}
		});	
		
		//��enter����Ϊ��ѯ��ť��ݼ�
		btnQuery.registerKeyboardAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ִ�в�ѯ
				executQuery();
			}
		}, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		add(lblThorp);
		add(cbbThorp);
		add(ttfThorpName);
		
		add(lblName);
		add(ttfName);
		
		add(lblICCode);
		add(ttfICCode);
		
		add(lblPrint);
		add(cbbPrint);
		
		add(btnQuery);
	}
	
	/**
	 * ִ�в�ѯ������ˢ��������
	 */
	public void executQuery() {
		if(mainFrame != null) {
			Map<String,Object> parames = new HashMap<String, Object>();
			// ��ȡ���ڴ�������IDֵ��index=0ʱPrintThorp����Ϊ��
			if(cbbThorp.getSelectedIndex() > 0) {
				PrintThorp pt = (PrintThorp) cbbThorp.getItemAt(cbbThorp.getSelectedIndex());
				parames.put(PrintDataDAO.THORP_ID, pt.getId());				
			}
			
			parames.put(PrintDataDAO.THORPNAME, ttfThorpName.getText().toString().trim());
			parames.put(PrintDataDAO.NAME, ttfName.getText().toString().trim());
			parames.put(PrintDataDAO.ICCODE, ttfICCode.getText().toString().trim());
			
			String temp = cbbPrint.getSelectedItem().toString().trim();
			if("δ��ӡ".equals(temp))
				parames.put(PrintDataDAO.PRINTFLAG, "0");
			else if("�Ѵ�ӡ".equals(temp))
				parames.put(PrintDataDAO.PRINTFLAG, "1");
			else
				parames.put(PrintDataDAO.PRINTFLAG, "");
			
			mainFrame.executQuery(parames);
		}
	}
	
	/**
	 * ��ʼ�����������б�
	 */
	private void initPtArray() {
		PrintThorp[] temp = new PrintThorpDAO().findObjArray();
		ptArray = new PrintThorp[temp.length + 1];
		//��ptArray�б��һ�����󸳿�ֵ
		ptArray[0] = new PrintThorp();
		for(int i = 0; i < temp.length; i++) {
			ptArray[i+1] = temp[i];
		}
	}
	
	/**
	 * ˢ�»���������
	 */
	public void refreshCbbDpmt() {
		initPtArray();
		ComboBoxModel cbbModel = new DefaultComboBoxModel(ptArray);
		cbbThorp.setModel(cbbModel);
		cbbThorp.repaint();
		cbbThorp.updateUI();
	}
}
