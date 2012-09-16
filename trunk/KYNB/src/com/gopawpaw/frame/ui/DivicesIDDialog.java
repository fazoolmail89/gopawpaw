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
				//ʹ�ó���ע����
				
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
				//ע��ɹ�
				JOptionPane.showConfirmDialog(this, "ע��ɹ����ǳ���л����֧�֣�\r\n�����������������Ч��","",JOptionPane.OK_OPTION);
				GppAuthorization.getInstance().setHasSendSupass(false);
			}else{
				//ע��ʧ��
				String msg = "ע��ʧ�ܣ�����ϵ����Ա�������룺"+GppAuthorization.getSupassStart()+""+GppAuthorization.getSupassEnd();
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
			
			JLabel jLabel = new JLabel("�����룺");
			JPanel jPanel1 = new JPanel();
			jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
			jPanel1.add(jLabel, null);
			
			jPanel1.add(mJTextField, null);
			
			JTextArea jLableMsg = new JTextArea("�뽫���������ϵĻ����뷢�͸�����Ա���еǼ�ע�ᡣ");
			jLableMsg.setEditable(false);
			// ���ص�ͷ��������
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
		this.setTitle("������鿴");
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
			displayKey = "<��Ļ������ȡ�쳣������ϵ����Ա>";
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
			
			JLabel jLabel = new JLabel("ע���룺");
			
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
			//ע��ɹ�����ʱ��Ҫ�������ݿ�
			
			mGppConfiguration.setValue("registerCode", regCode);
			mGppConfiguration.saveFile();
			GppAuthorization.getInstance().updateDivicesSupass("y","y");
			return true;
		}
	}

}
