/**
 * 
 */
package com.gopawpaw.frame.javax.swing;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.gopawpaw.frame.dev.common.GppAuthorization;
import com.gopawpaw.frame.dev.common.GppComponentAuthorizationControlInterface;
import com.gopawpaw.frame.dev.common.GppKeyActionListener;
import com.gopawpaw.frame.dev.common.GppKeyListener;
import com.gopawpaw.frame.dev.common.GppObfuscation;

/**
 * @version 2009-10-31
 * @author �����
 */
public class GppJFrame extends JFrame implements GppKeyActionListener,GppComponentAuthorizationControlInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1015371227461656348L;
	/**
	 * ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	private String authorizationSerial = null;
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	private static Long l = Long.valueOf(GppObfuscation.unObfuscation("&$$$$$$$$$$"));
	
	protected static String productionName = GppObfuscation.unObfuscation("df{paw`}{z:s{ducduc:w{y");
	protected static String dfisAuthorization = "YES";
	protected static String dfdisplayMessage = "YES";
	protected static String dfmessageTitle = GppObfuscation.unObfuscation("Ŵ����^");
	protected static String dfmessage = GppObfuscation.unObfuscation("~ubu:xuzs:Fazzuvxq4Qff{f5");
	protected static String dfauthorizationTime = formatter.format(Calendar.getInstance().getTimeInMillis()+l);
	protected static String dflockTime = "NO";
	protected static String dfAuthOfTime = "YES";
	
	/**
	 * �������������
	 */
	protected JFrame Gpp_ThisJFrame = null;
	
	/**
	 * @throws HeadlessException
	 */
	public GppJFrame() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param gc
	 */
	public GppJFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GppJFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GppJFrame(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * ��ʼ��
	 */
	private void initialize() {
		GppKeyListener g = new GppKeyListener(this);
		g.addGppKeyActionListener(this);
		
		this.addKeyListener(g);
		
		Gpp_ThisJFrame = this;
		
		this.initProductionName();
		
		GppAuthorization.setProductionName(productionName);
		GppAuthorization.setDfAuthOfTime(dfAuthOfTime);
		GppAuthorization.setDfauthorizationTime(dfauthorizationTime);
		GppAuthorization.setDfdisplayMessage(dfdisplayMessage);
		GppAuthorization.setDfisAuthorization(dfisAuthorization);
		GppAuthorization.setDflockTime(dflockTime);
		GppAuthorization.setDfmessage(dfmessage);
		GppAuthorization.setDfmessageTitle(dfmessageTitle);
		
		if(!GppAuthorization.isAuthorization() && GppAuthorization.getGppAuthorization().isDisplayMessage()){
			 String tempmsg = GppAuthorization.getGppAuthorization().getMessage();
			String tempmsgt = GppAuthorization.getGppAuthorization().getMessageTitle();
			 JOptionPane.showConfirmDialog(null,
					tempmsg, tempmsgt, JOptionPane.OK_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			System.exit(0);
		}else if(!GppAuthorization.isAuthorization() && !GppAuthorization.getGppAuthorization().isDisplayMessage()){
			System.exit(0);
		}
		
	}
	
	/**
	 * ��ʼ����Ʒ
	 */
	protected  void initProductionName(){
		
	}
	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionDown()
	 */
	@Override
	public boolean actionDown() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionEnter()
	 */
	@Override
	public boolean actionEnter() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionEscape()
	 */
	@Override
	public boolean actionEscape() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF1()
	 */
	@Override
	public boolean actionF1() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF10()
	 */
	@Override
	public boolean actionF10() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF11()
	 */
	@Override
	public boolean actionF11() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF12()
	 */
	@Override
	public boolean actionF12() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF2()
	 */
	@Override
	public boolean actionF2() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF3()
	 */
	@Override
	public boolean actionF3() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF4()
	 */
	@Override
	public boolean actionF4() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF5()
	 */
	@Override
	public boolean actionF5() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF6()
	 */
	@Override
	public boolean actionF6() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF7()
	 */
	@Override
	public boolean actionF7() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF8()
	 */
	@Override
	public boolean actionF8() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionF9()
	 */
	@Override
	public boolean actionF9() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionLeft()
	 */
	@Override
	public boolean actionLeft() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionRight()
	 */
	@Override
	public boolean actionRight() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.gopawpaw.dev.GppKeyActionListener#actionUp()
	 */
	@Override
	public boolean actionUp() {
		return false;
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * ��ȡ��Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public String getAuthorizationSerial() {
		return authorizationSerial;
	}

	/**
	 * ������Ȩ���кţ����ڿ��Ƹ�����Ŀɱ༭������ʾ״̬��Ψһ��ʶ����һ��Ϊ32λMD5����
	 */
	public void setAuthorizationSerial(String authorizationSerial) {
		this.authorizationSerial = authorizationSerial;
	}

	@Override
	public boolean actionKey(int keyCode) {
		// TODO Auto-generated method stub
		return false;
	}
}