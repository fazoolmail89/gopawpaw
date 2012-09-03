package com.gopawpaw.frame.ui;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.gopawpaw.frame.utils.GppAuthorization;

public class DivicesIDDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JTextField mJTextField = new JTextField();
	/**
	 * @param arg0
	 */
	public DivicesIDDialog(Frame arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		initialize();
	}

	


	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		
			JPanel jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			
			
			JLabel jLabel = new JLabel("机器码：");
			JPanel jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel, null);
			
			jPanel1.add(mJTextField, null);
			
			JTextArea jLableMsg = new JTextArea("请将您看到以上的机器码发送给管理员进行登记注册。");
			jLableMsg.setEditable(false);
			// 隐藏掉头部工具栏
			jContentPane.add(jPanel1, BorderLayout.NORTH);
			jContentPane.add(jLableMsg, BorderLayout.CENTER);
			
			
		return jContentPane;
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(376, 100);
		this.setTitle("机器码查看");
		this.setContentPane(getJContentPane());
		this.setLocation(MainFrame.getMainFrameLocation());
		
		String divicesId = ""+GppAuthorization.getInstance().getDivicesId();
		
		int did = 0;
		
		try{
			did = Integer.parseInt(divicesId);
		}catch(Exception  e){
			
		}
		
		String displayKey = "";
		
		if(did <= 0){
			displayKey = "<你的机器码获取异常，请联系管理员>";
		}else{
			displayKey = GppAuthorization.genDisplayCode(divicesId);
		}
		
		mJTextField.setText(displayKey);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel	jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
		return jContentPane;
	}

}
