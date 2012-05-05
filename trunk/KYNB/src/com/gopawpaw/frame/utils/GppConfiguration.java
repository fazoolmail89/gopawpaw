/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @version 2010-1-9
 * @author �����
 * <p>
 * 		�����ļ�������
 * </p>
 */
public class GppConfiguration {

	private Properties propertie;

	private FileInputStream inputFile;

	private FileOutputStream outputFile;

	private String propsFile = GppObfuscation.unObfuscation("s{ducduc:}z}");// �����ļ�·��
	
	private String filePath = "";

	/**
	 * ��ʼ��Configuration��
	 */
	public GppConfiguration() {
		propertie = new Properties();
	}

	/**
	 * ��ʼ��Configuration��
	 * 
	 * @param filePath
	 *            Ҫ��ȡ�������ļ���·��+����,����E:\\INI.INI
	 */
	public GppConfiguration(String filePath) {
		this.filePath = filePath;
		propertie = new Properties();
		try {
			inputFile = new FileInputStream(filePath);
			propertie.load(inputFile);
			inputFile.close();
		} catch (FileNotFoundException ex) {
			System.out.println("��ȡ�����ļ�--->ʧ�ܣ�- ԭ���ļ�·����������ļ�������");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("װ���ļ�--->ʧ��!");
			ex.printStackTrace();
		}
	}// end ReadConfigInfo()

	/**
	 * ���غ������õ�key��ֵ
	 * 
	 * @param key
	 *            ȡ����ֵ�ļ�
	 * @return key��ֵ
	 */
	public String getValue(String key) {
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key);// �õ�ĳһ���Ե�ֵ
			return value;
		} else
			return "";
	}// end getValue()

	/**
	 * ���غ������õ�key��ֵ
	 * 
	 * @param fileName
	 *            properties�ļ���·��+�ļ���
	 * @param key
	 *            ȡ����ֵ�ļ�
	 * @return key��ֵ
	 */
	public String getValue(String fileName, String key) {
		try {
			String value = "";
			inputFile = new FileInputStream(fileName);
			propertie.load(inputFile);
			inputFile.close();
			if (propertie.containsKey(key)) {
				value = propertie.getProperty(key);
				return value;
			} else
				return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}// end getValue()

	/**
	 * ���properties�ļ������е�key����ֵ
	 */
	public void clear() {
		propertie.clear();
	}// end clear();

	/**
	 * �ı�����һ��key��ֵ����key������properties�ļ���ʱ��key��ֵ��value�����棬 ��key������ʱ����key��ֵ��value
	 * 
	 * @param key
	 *            Ҫ����ļ�
	 * @param value
	 *            Ҫ�����ֵ
	 */
	public void setValue(String key, String value) {
		propertie.setProperty(key, value);
	}// end setValue()

	/**
	 * �����ĺ���ļ����ݴ���ָ�����ļ��У����ļ��������Ȳ����ڡ�
	 * 
	 * @param fileName
	 *            �ļ�·��+�ļ�����
	 * @param description
	 *            �Ը��ļ�������
	 */
	public void saveFile(String fileName, String description) {
		try {
			outputFile = new FileOutputStream(fileName);
			propertie.store(outputFile, description);
			outputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}// end saveFile()

	/**
	 * �����ĺ���ļ����ݴ���ָ�����ļ��С�
	 * 
	 */
	public void saveFile() {
		try {
			outputFile = new FileOutputStream(this.filePath);
			propertie.store(outputFile, "");
			outputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}// end saveFile()
	
	/**
	 * ͨ��key�õ�value
	 * 
	 * @param key
	 */
	public String getProp(String key) {
		String retVal = null;
		InputStream is = getClass().getResourceAsStream(propsFile);
		Properties props = new Properties();
		try {
			props.load(is);
			retVal = props.getProperty(key);
			if (retVal == null)
				retVal = "";
		} catch (Exception e) {
			// log.error(e.getMessage().toString());
			return null;
		}
		return retVal;
	}

	/**
	 * ��ȡ������
	 */
	public Set<?> getKeySet(){
		return propertie.keySet();
	}
	
	/**
	 * ��ȡʵ�弯��
	 */
	public Set<?> getEntrySet(){
		return propertie.entrySet();
	}
	
	/**
	 * ��Ԫ����
	 * @param args
	 */
//	public static void main(String[] args) {
//		Configuration	cfg = new Configuration("E:\\INI.INI");
//		cfg.setValue("kD", "vD");
//		cfg.setValue("Vk", "vD");cfg.setValue("kS", "vD");
//		cfg.setValue("k", "vD");
//		cfg.saveFile("E:\\INI.INI", "SAFDS");
//		
//	}
	
}
