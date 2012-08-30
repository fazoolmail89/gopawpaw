/**
 * 
 */
package com.gopawpaw.frame.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.BaseSQL;
import com.gopawpaw.frame.http.URLResource;
import com.gopawpaw.frame.http.action.HttpActionBase;
import com.gopawpaw.frame.http.action.HttpActionListener;
import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.struct.AppKeyConstants;
import com.gopawpaw.frame.struct.DataHashMap;
import com.gopawpaw.frame.utils.MD5;
import com.gopawpaw.frame.utils.Tools;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.kynb.RegisterDialog;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.utils.GppConfiguration;

/**
 * �����������
 * 
 * @version 2010-6-7
 * @author �����
 * 
 */
public class MainFrame extends JFrame implements HttpActionListener{

	/**
	 * TAG
	 */
	private static final String TAG = MainFrame.class.getSimpleName();
	
	private static final long serialVersionUID = 1L;

	private String mLiyeqin = "\r\n����֧�֣���ҵ��\r\n QQ:1483695671";

	private String mOffice = "��ϵ����֧�֣�kuaiyi_support@163.com" + mLiyeqin;

	private String mSupport = mLiyeqin;

	private JPanel jContentPane = null;

	/**
	 * ѡ��ִ�е�ģ��
	 */
	private GJComboBox jComboBoxSelectedModule = null;
	
	/**
	 * ���������
	 */
	private MainPanelTree mainPanelTree = null;

	/**
	 * �˵���
	 */
	private JMenuBar jJMenuBar = null;

	/**
	 * ״̬����ʾ
	 */
	private JLabel jLabelStatus = null;

	private GppConfiguration mGppConfiguration = new GppConfiguration("ini.ini");

	private static MainFrame thisClassMainFrame;

	private HttpActionBase mAction;
	
	private JPanel mJContentPanel;
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super();

		initialize();
	}

	/**
	 * ͷ�����
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanelTop() {
		//ͷ�������
		JPanel jPanelParent = new JPanel();
		jPanelParent.setLayout(new BorderLayout());
		jPanelParent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		//��һ����壨��½���˳���
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5,0));
		jPanel1.setPreferredSize(new Dimension(200,25));
//		jPanel1.add(getJButton3(), null);
//		jPanel1.add(getJButton4(), null);
		
		//�ڶ�����壨ִ�в˵���
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5,0));
		
		jPanel2.add(getJLabel(), null);
		jPanel2.add(getJComboBoxSelectedModule(), null);
		jPanel2.add(getJButton5(), null);
		
		//��������壨��С�����ص���
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5,0));
		jPanel3.setPreferredSize(new Dimension(200,25));
		jPanel3.add(getJButtonMinAll(), null);
		jPanel3.add(getJButtonCloseAll(), null);
		
		jPanelParent.add(jPanel1, BorderLayout.WEST);
		jPanelParent.add(jPanel2, BorderLayout.CENTER);
		jPanelParent.add(jPanel3, BorderLayout.EAST);
		return jPanelParent;
	}

	/**
	 * This method initializes jLabel
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel() {
		JLabel jLabel = new JLabel();
		jLabel.setText("ִ�в˵���M���� ");
//		jLabel.setBorder(BorderFactory.createEmptyBorder(0, 120, 0, 0));
		return jLabel;
	}

	private GJComboBox getJComboBoxSelectedModule() {
		if (jComboBoxSelectedModule == null) {
			jComboBoxSelectedModule = new GJComboBox() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionEnter() {
					System.out.println(jComboBoxSelectedModule.getSelectedItem());
					actionModule();
					return true;
				};
			};
			jComboBoxSelectedModule.setPreferredSize(new Dimension(400,25));
			jComboBoxSelectedModule.setMaximumSize(new Dimension(400,25));
			jComboBoxSelectedModule.setEditable(true);
		}
		return jComboBoxSelectedModule;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
		jPanel1.add(getJLabel1(), null);
		return jPanel1;
	}

	/**
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel1() {
		if (jLabelStatus == null) {
			jLabelStatus = new JLabel();
			jLabelStatus.setText("״̬��");
		}
		return jLabelStatus;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		JButton jButton3 = new JButton();
		jButton3.setText("��½");
		jButton3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {

			}
		});
		return jButton3;
	}

	/**
	 * This method initializes jButton4
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton4() {
		JButton jButton4 = new JButton();
		jButton4.setText("�˳�");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				exitSystem();
			}
		});
		return jButton4;
	}

	/**
	 * This method initializes jButton5
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton5() {
		JButton jButton5 = new JButton();
		jButton5.setText("����");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionModule();
			}
		});
		
		return jButton5;
	}

	/**
	 * ��С��������ģ��
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonMinAll() {
		JButton jButton5 = new JButton();
		jButton5.setText("��С������");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mainPanelTree.actionMinAllModule();
			}
		});
		
		return jButton5;
	}
	
	/**
	 * �ر�������ģ��
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonCloseAll() {
		JButton jButton5 = new JButton();
		jButton5.setText("�ر�����");
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mainPanelTree.actionCloseAllModule();
			}
		});
		
		return jButton5;
	}
	/**
	 * ִ��ģ��
	 * @version 2012-5-6
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	private void actionModule(){
		
		mainPanelTree.actionModule(jComboBoxSelectedModule.getEditor().getItem());
		
	}
	/**
	 * 
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {

					// UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
					UIManager.setLookAndFeel(
					// UIManager.getCrossPlatformLookAndFeelClassName()
					// UIManager.getSystemLookAndFeelClassName()
					// new com.sun.java.swing.plaf.motif.MotifLookAndFeel()
					// "com.jgoodies.looks.windows.WindowsLookAndFeel"
					// "com.jgoodies.looks.plastic.PlasticLookAndFeel"
							"com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
							// "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"

							);

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				MainFrame thisClass = new MainFrame();
				thisClassMainFrame = thisClass;
				thisClass.setLocation(200, 100);
				thisClass.setSize(1000, 600);
				thisClass
						.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				thisClass.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						exitSystem();

					}

				});

//				if (thisClass.cheakRegister()) {
					GlobalParameter.isAuthModuls = true;
					thisClass.setVisible(true);
//				} else {
//					System.exit(0);
//				}
			}
		});
	}

	public static void exitSystem() {
		int option = JOptionPane.showConfirmDialog(null, "�Ƿ���ȫ�˳���ϵͳ��", "ϵͳ��ʾ",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else {
			thisClassMainFrame.setVisible(true);
		}

	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GlobalParameter.initialize();
		// MySQLUtils.initMySQLConfig();
		// MySQLUtils.startMySQLService();

		// this.setSize(GlobalParameter.getGuiClient().getSizeOfMainFrame());
		// this.setLocation(GlobalParameter.getGuiClient().getLocationOfMainFrame());
		
		mJContentPanel = getJContentPane();
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(mJContentPanel);
		this.setTitle("���ؿ���ũ����Ϣ����ϵͳ  V"+GlobalParameter.SOFT_VERSION);
		mJContentPanel.setVisible(false);
		mAction = new HttpActionBase(this,this);
		
		sendProConfig();
	}
	
	private void sendProConfig(){
		mAction.sendRequest(URLResource.URL_PROCONFIG,0,null,true);
	}

	private void sendCheckProduct(){
		String version = GlobalParameter.SOFT_VERSION;
		
		String hardwareCode = Tools.getHardwareCode();
		String hardwareCodeDisplay = genDisplayCode(hardwareCode);
		HashMap<String,String> pMap = new HashMap<String,String>();
		
		pMap.put(URLResource.KEY_VERSION, version);
		pMap.put(URLResource.KEY_HARDWARECODE, hardwareCode);
		pMap.put(URLResource.KEY_HARDWARECODEDISPLAY, hardwareCodeDisplay);
		
		mAction.sendRequest(URLResource.URL_CHECKPRODUCT,0,pMap,true);
		
	}
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {

			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			// ���ص�ͷ��������
			jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
			jContentPane.add(getMainPanelTree(), BorderLayout.CENTER);
			jContentPane.add(getJPanel1(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	private MainPanelTree getMainPanelTree() {

		if(mainPanelTree == null){
			mainPanelTree = new MainPanelTree();
		}
		return mainPanelTree;

	}

	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();

			JButton jb = new JButton("����");
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GppAbout a = new GppAbout(MainFrame.this);
					a.setModal(true);
					a.setVisible(true);
				}
			});
			jJMenuBar.add(jb);
			
			String mac = Tools.getHardwareCode();

			String registerCode = mGppConfiguration.getValue("registerCode");

			final String displayKey = genDisplayCode(mac);

			final String regKey = genKeyCode(displayKey);
			
			if (registerCode == null || !registerCode.equals(regKey)) {
				JButton jb2 = new JButton("ע��");
				jb2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						showRegDialog(regKey,displayKey);
					}
				});
				
				jJMenuBar.add(jb2);
			}
			
		}
		return jJMenuBar;
	}
	

	private boolean cheakRegister() {

		String mac = Tools.getHardwareCode();

		String registerCode = mGppConfiguration.getValue("registerCode");

		String displayKey = genDisplayCode(mac);

		final String regKey = genKeyCode(displayKey);
		
		if (registerCode == null || !registerCode.equals(regKey)) {
//			int t = GppAuthorization.getInstance().checkAuthTimes();
//			
//			if(t > 0){
//				String tempMSG = "��������������ã�"+t+" �Σ��Ƿ���Ҫ����ע�᣿";
//				int op = JOptionPane.showConfirmDialog(null, tempMSG,
//						"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
//						JOptionPane.INFORMATION_MESSAGE);
//				if(op == JOptionPane.NO_OPTION){
//					return true;
//				}else{
//					return showRegDialog(regKey,displayKey);
//				}
//			}else{
//				return showRegDialog(regKey,displayKey);
//			}
			
			return false;
		} else {
			return true;
		}

		//
		// return true;
	}
	
	private boolean showRegDialog(final String regKey,String displayKey){

		boolean regFlag = false;
		RegisterDialog rd = new RegisterDialog(this) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void actionFinish(int option, String regCode) {
				// TODO Auto-generated method stub
				if (option == RegisterDialog.YES_OPTION) {
					System.out.println(regCode);
					if (regKey.equals(regCode)) {
						// ע��ɹ�
						mGppConfiguration.setValue("registerCode", regCode);
						mGppConfiguration.saveFile();

						String tempMSG = "��ϲ��ע��ɹ����ǳ���л���Կ��������֧�֣�\r\n���������������";
						// ������ʾ
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG,
								"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
								JOptionPane.INFORMATION_MESSAGE);

						super.actionFinish(option, regCode);
					} else {
						// ע��ʧ��
						String tempMSG = "��ע���벻���ڱ���ʹ�ã���������ע�����Ѿ����ڣ�����ϵ����Ա��ȡע���룡\r\n"
								+ mSupport;
						// ������ʾ
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG,
								"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
								JOptionPane.INFORMATION_MESSAGE);
					}

				} else {
					// ȡ��
					super.actionFinish(option, regCode);
				}

			}
		};
		rd.setTitle("����֧�֣����ǵĶ�����");
		rd.setKeyCode(displayKey);
		rd.setModal(true);
		rd.setVisible(true);

		return regFlag;
	
	}

	private String genDisplayCode(String diskID) {
		MD5 md5 = new MD5();

		return md5.getMD5ofStr(diskID);
	}

	private String genKeyCode(String displayCode) {
		String k3 = displayCode.substring(3, 16);

		MD5 md5 = new MD5();

		return md5.getMD5ofStr(k3);
	}

	public static Point getMainFrameLocation() {
		return thisClassMainFrame.getLocation();
	}

	@Override
	public void onHttpActionResponse(int state, Object data, int urlId,
			int connectionId) {
		// TODO Auto-generated method stub
		APPLog.e(TAG,"state="+state+" data="+data+" urlId="+urlId);
		
		
		if(URLResource.URL_PROCONFIG == urlId){
			dealProConfig( state,  data);
		}else if(URLResource.URL_CHECKPRODUCT == urlId){
			dealCheckPro( state,  data);
		}
	}
	
	private void dealProConfig(int state, Object data){
		
		//ȡ�����ݿ����Ƿ�����ʹ��ֵ
		BaseSQL bs = new BaseSQL();
		String isOffline = "0";
		try {
			isOffline = bs.getConfig("isOffline");
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean isOfflineOperation = false;
		
		if("1".equals(isOffline.trim())){
			isOfflineOperation = true;
		}
		
		String checkUrl = null;
		if(data != null){
			DataHashMap<String, Object> dataMap = (DataHashMap<String, Object>)data;
			
			checkUrl = dataMap.getStringBykey(Tools.getKey(
					AppKeyConstants.PRODUCT,
					AppKeyConstants.CHECKURL));
		}
		
		if(checkUrl != null && !"".equals(checkUrl)){
			URLResource.getInstance().updateURL(URLResource.URL_CHECKPRODUCT, checkUrl);
			sendCheckProduct();
		}else{
			if(cheakRegister() && isOfflineOperation){
				//�Ѿ�ע�ᣬ������ʹ�ã����ü��
				mJContentPanel.setVisible(true);
			}else{
				//��������ʹ��
				String errMsg = "����������ʧ�ܣ��Ƿ������������";
				int option = JOptionPane.showConfirmDialog(this, errMsg,"",JOptionPane.OK_OPTION);
				if(option == JOptionPane.OK_OPTION){
					sendProConfig();
				}
			}
		}
	}
	
	private void dealCheckPro(int state, Object data){
		//ȡ�����ݿ����Ƿ�����ʹ��ֵ
		BaseSQL bs = new BaseSQL();
		String isOffline = "0";
		try {
			isOffline = bs.getConfig("isOffline");
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean isOfflineOperation = false;
		String overdueType = "";
		String overdueMsg = "";
		String regCode = "";
		
		if("1".equals(isOffline.trim())){
			isOfflineOperation = true;
		}
		
		if(HttpActionListener.STATE_SUCCESS == state ){
			
			DataHashMap<String, Object> dataMap = (DataHashMap<String, Object>)data;
			
			String operation = dataMap.getStringBykey(Tools.getKey(
					AppKeyConstants.DATA,
					AppKeyConstants.RESPONSE_BODY,
					AppKeyConstants.IS_OFFLINE_OPERATION));
			overdueType = dataMap.getStringBykey(Tools.getKey(
					AppKeyConstants.DATA,
					AppKeyConstants.RESPONSE_BODY,
					AppKeyConstants.OVERDUE_TYPE));
			overdueMsg = dataMap.getStringBykey(Tools.getKey(
					AppKeyConstants.DATA,
					AppKeyConstants.RESPONSE_BODY,
					AppKeyConstants.OVERDUE_MSG));
			regCode = dataMap.getStringBykey(Tools.getKey(
					AppKeyConstants.DATA,
					AppKeyConstants.RESPONSE_BODY,
					AppKeyConstants.REG_CODE));
			
			if("1".equals(operation)){
				isOfflineOperation = true;
			}else{
				isOfflineOperation = false;
			}
			
			if(regCode != null && !"".equals(regCode.trim())){
				//��ע���룬����±���ע����Ϣ
				mGppConfiguration.setValue("registerCode", regCode);
				mGppConfiguration.saveFile();
			}
		}
		APPLog.d(TAG, "overdueType="+overdueType);
		APPLog.d(TAG, "overdueMsg="+overdueMsg);
		APPLog.d(TAG, "regCode="+regCode);
		try {
			//���¸������ݿ�
			bs.updateConfig("isOffline", (isOfflineOperation ? "1":"0"));
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(cheakRegister() && isOfflineOperation){
			//�Ѿ�ע�ᣬ������ʹ�ã����ü��
			mJContentPanel.setVisible(true);
			return;
		}
		
		if(HttpActionListener.STATE_NETWORK_ENABLE == state){
			String errMsg = "����������ʧ�ܣ��Ƿ������������";
			int option = JOptionPane.showConfirmDialog(this, errMsg,"",JOptionPane.OK_OPTION);
			if(option == JOptionPane.OK_OPTION){
				sendCheckProduct();
			}
			return;
		}else if(HttpActionListener.STATE_SUCCESS == state){
			//���سɹ�������ݷ��������ص����������
			if("0".equals(overdueType)){
				//δ���ڣ�����ʾ
				mJContentPanel.setVisible(true);
			}else if("1".equals(overdueType)){
				//��ʾ������Ϣ
				mJContentPanel.setVisible(true);
				JOptionPane.showConfirmDialog(this, overdueMsg,"",JOptionPane.OK_OPTION);
			}else{
				//��ֹʹ�ã�����ע��
				mJContentPanel.setVisible(false);
				JOptionPane.showConfirmDialog(this, overdueMsg,"",JOptionPane.OK_OPTION);
			}
			return;
		}else{
			String errMsg = "����������ʧ�ܣ��Ƿ������������";
			int option = JOptionPane.showConfirmDialog(this, errMsg,"",JOptionPane.OK_OPTION);
			
			if(option == JOptionPane.OK_OPTION){
				sendCheckProduct();
			}
			
			return;
		}
	}

} // @jve:decl-index=0:visual-constraint="8,5"
