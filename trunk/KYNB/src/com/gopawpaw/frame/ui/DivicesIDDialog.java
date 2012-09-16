package com.gopawpaw.frame.ui;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.utils.GppAuthorization;
import com.gopawpaw.frame.utils.Tools;
import com.gopawpaw.frame.widget.GJTextField;
import com.gopawpaw.kynb.utils.GppConfiguration;

public class DivicesIDDialog extends JDialog {

	/**
	 * TAG
	 */
	private static final String TAG = DivicesIDDialog.class.getSimpleName();
	
	private static final long serialVersionUID = 1L;
	
	private JPanel	jContentPane;
	
	private JPanel jContentPaneSupass;
	private GppConfiguration mGppConfiguration = new GppConfiguration("ini.ini");
	private JTextField mJTextField = new GJTextField(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean actionEnter() {
			if("admin".equals(mJTextField.getText())){
				//使用超级注册码
				
				String divicesId = ""+Tools.getHardwareCode();
				String displayKey = GppAuthorization.genDisplayCode(divicesId);
				mJTextField.setText(displayKey);
				
				jContentPane.add(getJPanelSupass(), BorderLayout.SOUTH);
				DivicesIDDialog.this.setSize(376, 100);
				DivicesIDDialog.this.invalidate();
			}else{
				
				mJTextField.setText(getDisplayCode());
				jContentPane.remove(getJPanelSupass());
				DivicesIDDialog.this.setSize(376, 80);
				DivicesIDDialog.this.invalidate();
			}
			return true;
		};
	};
	
	private JTextField mJTextFieldSupasskey = new GJTextField(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public boolean actionEnter() {
			if(regSupass(mJTextFieldSupasskey.getText())){
				//注册成功
				JOptionPane.showConfirmDialog(this, "注册成功，非常感谢您的支持！\r\n请重启软件，即可生效。","",JOptionPane.OK_OPTION);
				GppAuthorization.getInstance().setHasSendSupass(false);
			}else{
				//注册失败
				String msg = "注册失败，请联系管理员，错误码："+GppAuthorization.getSupassStart()+""+GppAuthorization.getSupassEnd();
				JOptionPane.showConfirmDialog(this, msg,"",JOptionPane.OK_OPTION);
			}
			return true;
		};
	};
	
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
			jContentPane.add(jLableMsg, BorderLayout.SOUTH);
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
		this.setSize(376, 80);
		this.setTitle("机器码查看");
		this.setContentPane(getJContentPane());
		this.setLocation(MainFrame.getMainFrameLocation());
		
		mJTextField.setText(getDisplayCode());
	}

	private String getDisplayCode(){
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
		
		return displayKey;
	}
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
		return jContentPane;
	}
	
	private JPanel getJPanelSupass() {
		
		if(jContentPaneSupass == null){
			
			jContentPaneSupass = new JPanel();
			jContentPaneSupass.setLayout(new BorderLayout());
			
			JLabel jLabel = new JLabel("注册码：");
			
			JPanel jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel, null);
			jPanel1.add(mJTextFieldSupasskey, null);
			
			jContentPaneSupass.add(jPanel1, BorderLayout.NORTH);
		}
		return jContentPaneSupass;
	}
	
	private boolean regSupass(String regCode) {

		String divicesId = ""+Tools.getHardwareCode();

		String displayKey = GppAuthorization.genDisplayCode(divicesId);
		
		final String regKey = GppAuthorization.genKeyCode(displayKey);
		
		APPLog.d(TAG, "regSupass registerCode:"+regCode);
		APPLog.d(TAG, "regSupass regKey:"+regKey);
		
		if (regCode == null || !regCode.equals(regKey)) {
			
			return false;
		} else {
			//注册成功，此时需要更新数据库
			
			mGppConfiguration.setValue("registerCode", regCode);
			mGppConfiguration.saveFile();
			GppAuthorization.getInstance().updateDivicesSupass("y","y");
			return true;
		}
	}

}
