/**
 * 
 */
package com.gopawpaw.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gopawpaw.frame.database.DatabaseInfo;
import com.gopawpaw.frame.database.Dmnd_det;
import com.gopawpaw.frame.database.Omnd_det;
import com.gopawpaw.frame.ui.GUIclient;
import com.gopawpaw.frame.ui.GppAbout;
import com.gopawpaw.frame.ui.LoginSession;
import com.gopawpaw.frame.utils.GppConfiguration;

/**
 * @version 2010-3-11
 * @author �����
 *
 */
public class GlobalParameter {

	/**
	 * ͨ�� Hibernate �������ݿ�
	 */
	public final static int DataBaseType_Hibernate = 0;
	
	/**
	 * Progress ���ݿ�
	 */
	public final static int DataBaseType_Progress = 1;
	
	/**
	 * SQL Server ���ݿ�
	 */
	public final static int DataBaseType_SQLServer = 2;
	
	/**
	 * Access ���ݿ�
	 */
	public final static int DataBaseType_Access = 3;
	
	/**
	 * MySQL ���ݿ�
	 */
	public final static int DataBaseType_MySQL = 4;
	
	private static DatabaseInfo databaseInfo = new DatabaseInfo();;
	
	/**
	 * applicationContext.xml ����ʵ��
	 */
	private static ClassPathXmlApplicationContext glbCtx = null;
	/**
	 * ��ǰ·��
	 */
	private static String courrenPath = System.getProperties().getProperty("user.dir");
	
	/**
	 * Hibernate �����ļ�
	 */
	private static String hibernatecfg = "hibernate.cfg.xml";
	
	/**
	 * �����ļ�����Ŀ¼
	 */
	private static String cfgDir = "conf";
	
	/**
	 * Ĭ������
	 */
	private static String defaultLanguage = "0";
	
	/**
	 * applicationContext �ļ�
	 */
	private static String appContext = "applicationContext.xml";
	
	private static String applicationContextxmlPath = "com\\gopawpaw\\erp\\hibernate\\appcontext\\";
	
	private static String programDir = "program";
	
	private static LoginSession loginSession = null;
	
	private static String reportHttpURL = "";
	
	private static String reportHostDomain = "";
	private static String reportHostPort = "";
	private static String reportHostDir = "";
	
	private static Vector<Dmnd_det> frequently_used_menu_item = null;
	
	private static GUIclient guiClient = null;
	
	/**
	 * 
	 */
	public GlobalParameter() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ��ȡ��ǰ·��
	 */
	public static String getCourrenPath(){
		return courrenPath;
	}
	/**
	 * ��ȡHibernate�����ļ�����·��
	 */
	public static String getHibernateCfgAbsolutePath(){
		return courrenPath+File.separator+cfgDir+File.separator+hibernatecfg;
//		return "D:\\Eclipse_Workspace\\GERP\\conf\\hibernate.cfg.xml";
	}
	
	/**
	 * ��ȡ�����ļ�����·��
	 */
	public static String getConfigAbsolutePath(){
		return courrenPath+File.separator+cfgDir+File.separator+"config.xml";
	}
	
	/**
	 * @return Ĭ������
	 */
	public static String getDefaultLanguage() {
		return defaultLanguage;
	}
	/**
	 * @param defaultLanguage the defaultLanguage to set
	 */
	public void setDefaultLanguage(String language) {
		defaultLanguage = language;
	}
	
	/**
	 * ��ȡ�����ļ�Ŀ¼
	 */
	public static String getCfgDir(){
		return cfgDir;
	}
	
	public static ClassPathXmlApplicationContext getAppContextXMLClass(String DAOObjectString){
		
		return	new ClassPathXmlApplicationContext(getAppContextXMLAbsolutePath(DAOObjectString));
	}
	
	public static String getAppContextXMLAbsolutePath(String DAOObjectString){
		
		char[] str = DAOObjectString.toCharArray();
		String tem = applicationContextxmlPath+String.valueOf(str[0]).toLowerCase()+"."+appContext;
		tem = tem.trim();
		System.out.println(tem);
		return tem;
	}
	/**
	 * ��ȡ����Ŀ¼����·��
	 */
	public static String getProgramAbsolutePath(){
		return courrenPath+File.separator+programDir;
	}

	/**
	 * @return the loginSession
	 */
	public static LoginSession getLoginSession() {
		return loginSession;
	}

	/**
	 * @param loginSession the loginSession to set
	 */
	public static void setLoginSession(LoginSession loginSession) {
		GlobalParameter.loginSession = loginSession;
	}
	
	/**
	 * ��ȡ�����������ַ
	 */
	public static String getReportHttpURL(){
		reportHttpURL = "http://"+reportHostDomain+":"+reportHostPort;
		
		if(!reportHostDir.trim().isEmpty()){
			reportHttpURL = reportHttpURL + "/"+reportHostDir;
		}
//		return "http://10.8.2.249:8080/birtapp";
		return reportHttpURL;
	}
	
	/**
	 * ��ȡ�������Ŀ¼ 
	 */
	public static String getReportDir(){
		
		return "report_programs";
	}
	
	/** 
	 * ��ȡ���ݿ����� 
	 * ֵΪ��̬������DataBaseType_Progress��DataBaseType_SQLServer��DataBaseType_Access
	 */
	public static int getDataBaseType(){
		
		return databaseInfo.getDatabaseType();
	}
	
	/**
	 * ��ʼ��ȫ�ֱ���
	 */
	public static void initialize() {
		updateFromConfig();
		updateFromUserConfig();
		
		
		LoginSession ls = new LoginSession();
		ls.setDomain("Keer");
		ls.setUsername("mfg");
		ls.setGroupname("admin");
		GlobalParameter.setLoginSession(ls);
		
		GUIclient gui = new GUIclient(){

			@Override
			public int getNavShowType() {
				
				return GUIclient.NavShowType_Tree;
			}

			@Override
			public Font getFontOfFunctionList() {
				
				return new   java.awt.Font( "���� ",java.awt.Font.PLAIN,12);
			}

			@Override
			public Color getBackgroundOfFunctionList() {

				return Color.WHITE;
			}

			@Override
			public Point getLocationOfMainFrame() {
				
				return new Point(150,100);
			}

			@Override
			public Dimension getSizeOfMainFrame() {
				
				return new Dimension(1000,400);
			}

			@Override
			public Color getBackgroundOfFunctionNav() {
				
				return Color.GRAY;
			}

			@Override
			public Color getBackgroundOfFunctionTreeNav() {
				
				return Color.gray;
			}
			@Override
			public Font getFontOfFunctionTreeNav() {
				return new   java.awt.Font( "���� ",java.awt.Font.PLAIN,12);
			}

			@Override
			public Color getBackgroundOfFunctionGruop() {
				return null;
			}

			@Override
			public Font getFontOfFunctionGruop() {
				return new   java.awt.Font( "���� ",java.awt.Font.BOLD,14);
			}
			
		};
		GlobalParameter.setGuiClient(gui);
	}

	/**
	 * �������ļ��и���������Ϣ
	 */
	private static void updateFromConfig(){
		String filename = courrenPath+File.separator+cfgDir+File.separator+"config.xml";

		SAXBuilder builder = new SAXBuilder();

		Document doc = null;
		try {
			doc = builder.build(new File(filename));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element persons = doc.getRootElement();
		//��ȡ������������
		List<?> list = persons.getChildren("report-host");
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("domain")){
					reportHostDomain = perso.getText().trim();
				}else if(perso.getAttributeValue("name").equals("port")){
					reportHostPort = perso.getText().trim();
				}else if(perso.getAttributeValue("name").equals("virtual-dir")){
					reportHostDir = perso.getText().trim();
				}
			}
		}
		
		//��ȡ���ݿ����
		List<?> list2 = persons.getChildren("database-config");
		for (Iterator<?> it = list2.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("connection.url")){
					databaseInfo.setConnectName(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.driver_class")){
					databaseInfo.setDriveName(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.username")){
					databaseInfo.setUser(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("connection.password")){
					databaseInfo.setPassword(perso.getText().trim());
				}else if(perso.getAttributeValue("name").equals("dataBaseType")){
					//���ݿ�����
					if(perso.getText().trim().equals("access")){
						databaseInfo.setDatabaseType(DataBaseType_Access);
					}else if(perso.getText().trim().equals("progress")){
						databaseInfo.setDatabaseType(DataBaseType_Progress);
					}else if(perso.getText().trim().equals("sqlserver")){
						databaseInfo.setDatabaseType(DataBaseType_SQLServer);
					}else if(perso.getText().trim().equals("hibernate")){
						databaseInfo.setDatabaseType(DataBaseType_Hibernate);
					}else if(perso.getText().trim().equals("mysql")){
						databaseInfo.setDatabaseType(DataBaseType_MySQL);
					}
				}
			}
		}
		
		//��ȡ����ҳ�����
		List<?> list3 = persons.getChildren("about-info");
		for (Iterator<?> it = list3.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("programs")){
					GppAbout.setPrograms(perso.getText().trim());
					
					if(perso.getAttributeValue("display").equals("true")){
						GppAbout.setPrograms_display(true);
					}else{
						GppAbout.setPrograms_display(false);
					}
					
				}else if(perso.getAttributeValue("name").equals("versions")){
					GppAbout.setVersions(perso.getText().trim());
					
					if(perso.getAttributeValue("display").equals("true")){
						GppAbout.setVersions_display(true);
					}else{
						GppAbout.setVersions_display(false);
					}
				}else if(perso.getAttributeValue("name").equals("author")){
					GppAbout.setAuthor(perso.getText().trim());
					
					if(perso.getAttributeValue("display").equals("true")){
						GppAbout.setAuthor_display(true);
					}else{
						GppAbout.setAuthor_display(false);
					}
				}else if(perso.getAttributeValue("name").equals("support")){
					GppAbout.setSupport(perso.getText().trim());
					
					if(perso.getAttributeValue("display").equals("true")){
						GppAbout.setSupport_display(true);
					}else{
						GppAbout.setSupport_display(false);
					}
				}else if(perso.getAttributeValue("name").equals("email")){
					GppAbout.setEmail(perso.getText().trim());
					
					if(perso.getAttributeValue("display").equals("true")){
						GppAbout.setEmail_display(true);
					}else{
						GppAbout.setEmail_display(false);
					}
				}
			}
		}
	}

	
	/**
	 * ���û������ļ��и���������Ϣ
	 */
	private static void updateFromUserConfig(){
		String filename = courrenPath+File.separator+cfgDir+File.separator+"user.config.xml";

		SAXBuilder builder = new SAXBuilder();

		Document doc = null;
		try {
			doc = builder.build(new File(filename));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element persons = doc.getRootElement();
		
		//��ȡ���ù���������Ϣ
		frequently_used_menu_item = new Vector<Dmnd_det>();
		List<?> list = persons.getChildren("frequently-used-function");
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Element person = (Element) it.next();
			List<?> li = person.getChildren("property");
			for (Iterator<?> it2 = li.iterator(); it2.hasNext();) {
				Element perso = (Element) it2.next();
				
				if(perso.getAttributeValue("name").equals("menu.item")){
					String tempstr = perso.getText().trim();
					
					Dmnd_det dd = new Dmnd_det();
					dd.setMnd_nbr(Omnd_det.getNbr(tempstr));
					dd.setMnd_select(Omnd_det.getSelect(tempstr));
					Omnd_det od = new Omnd_det(dd);
					if (od.updateDmnd_det()) {
						frequently_used_menu_item.add(od.getDmnd_det());
					} else {

					}
				}
			}
		}
	}
	
	/**
	 * ��ȡ�û����õĳ��ò˵���
	 */
	public static Vector<Dmnd_det> getFrequently_used_menu_item(){
		if(frequently_used_menu_item == null){
			updateFromUserConfig();
		}
		return frequently_used_menu_item;
	}
	
	/**
	 * @return the databaseInfo
	 */
	public static DatabaseInfo getDatabaseInfo() {
		return databaseInfo;
	}

	/**
	 * ��ȡͼ�ν������
	 */
	public static GUIclient getGuiClient() {
		return guiClient;
	}

	/**
	 * ����ͼ�ν������
	 */
	public static void setGuiClient(GUIclient guiClient) {
		GlobalParameter.guiClient = guiClient;
	}
	
	
}
