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
	
	private static final String[] PRINT_STATS = {"未打印", "已打印","所有"};
	//所属机构列表
	private PrintThorp[] ptArray = {};
	
	private JLabel lblThorp = new JLabel("所属机构");
	private JComboBox cbbThorp  = null;
	private JTextField ttfThorpName = new JTextField();
	
	private JLabel lblName = new JLabel("姓名");
	private JTextField ttfName = new JTextField();
	
	private JLabel lblICCode = new JLabel("身份证号");
	private JTextField ttfICCode = new JTextField();
	
	private JLabel lblPrint = new JLabel("打印标记");
	private JComboBox cbbPrint  = new JComboBox(PRINT_STATS);
	
	private JButton btnQuery = new JButton("查询");
	
	public QueryPanel(MainFrame mf) {
		this.mainFrame = mf;
		// 初始化数据
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
		
		//将enter设置为查询按钮快捷键
		btnQuery.registerKeyboardAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 执行查询
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
	 * 执行查询操作，刷新主界面
	 */
	public void executQuery() {
		if(mainFrame != null) {
			Map<String,Object> parames = new HashMap<String, Object>();
			// 获取所在村下拉框ID值，index=0时PrintThorp对象为空
			if(cbbThorp.getSelectedIndex() > 0) {
				PrintThorp pt = (PrintThorp) cbbThorp.getItemAt(cbbThorp.getSelectedIndex());
				parames.put(PrintDataDAO.THORP_ID, pt.getId());				
			}
			
			parames.put(PrintDataDAO.THORPNAME, ttfThorpName.getText().toString().trim());
			parames.put(PrintDataDAO.NAME, ttfName.getText().toString().trim());
			parames.put(PrintDataDAO.ICCODE, ttfICCode.getText().toString().trim());
			
			String temp = cbbPrint.getSelectedItem().toString().trim();
			if("未打印".equals(temp))
				parames.put(PrintDataDAO.PRINTFLAG, "0");
			else if("已打印".equals(temp))
				parames.put(PrintDataDAO.PRINTFLAG, "1");
			else
				parames.put(PrintDataDAO.PRINTFLAG, "");
			
			mainFrame.executQuery(parames);
		}
	}
	
	/**
	 * 初始化所属机构列表
	 */
	private void initPtArray() {
		PrintThorp[] temp = new PrintThorpDAO().findObjArray();
		ptArray = new PrintThorp[temp.length + 1];
		//将ptArray列表第一个对象赋空值
		ptArray[0] = new PrintThorp();
		for(int i = 0; i < temp.length; i++) {
			ptArray[i+1] = temp[i];
		}
	}
	
	/**
	 * 刷新机构下拉框
	 */
	public void refreshCbbDpmt() {
		initPtArray();
		ComboBoxModel cbbModel = new DefaultComboBoxModel(ptArray);
		cbbThorp.setModel(cbbModel);
		cbbThorp.repaint();
		cbbThorp.updateUI();
	}
}
