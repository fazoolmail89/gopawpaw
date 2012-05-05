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
 * @author 李锦华
 * <p>
 * 		配置文件操作类
 * </p>
 */
public class GppConfiguration {

	private Properties propertie;

	private FileInputStream inputFile;

	private FileOutputStream outputFile;

	private String propsFile = GppObfuscation.unObfuscation("s{ducduc:}z}");// 配置文件路径
	
	private String filePath = "";

	/**
	 * 初始化Configuration类
	 */
	public GppConfiguration() {
		propertie = new Properties();
	}

	/**
	 * 初始化Configuration类
	 * 
	 * @param filePath
	 *            要读取的配置文件的路径+名称,例：E:\\INI.INI
	 */
	public GppConfiguration(String filePath) {
		this.filePath = filePath;
		propertie = new Properties();
		try {
			inputFile = new FileInputStream(filePath);
			propertie.load(inputFile);
			inputFile.close();
		} catch (FileNotFoundException ex) {
			System.out.println("读取属性文件--->失败！- 原因：文件路径错误或者文件不存在");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("装载文件--->失败!");
			ex.printStackTrace();
		}
	}// end ReadConfigInfo()

	/**
	 * 重载函数，得到key的值
	 * 
	 * @param key
	 *            取得其值的键
	 * @return key的值
	 */
	public String getValue(String key) {
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key);// 得到某一属性的值
			return value;
		} else
			return "";
	}// end getValue()

	/**
	 * 重载函数，得到key的值
	 * 
	 * @param fileName
	 *            properties文件的路径+文件名
	 * @param key
	 *            取得其值的键
	 * @return key的值
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
	 * 清除properties文件中所有的key和其值
	 */
	public void clear() {
		propertie.clear();
	}// end clear();

	/**
	 * 改变或添加一个key的值，当key存在于properties文件中时该key的值被value所代替， 当key不存在时，该key的值是value
	 * 
	 * @param key
	 *            要存入的键
	 * @param value
	 *            要存入的值
	 */
	public void setValue(String key, String value) {
		propertie.setProperty(key, value);
	}// end setValue()

	/**
	 * 将更改后的文件数据存入指定的文件中，该文件可以事先不存在。
	 * 
	 * @param fileName
	 *            文件路径+文件名称
	 * @param description
	 *            对该文件的描述
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
	 * 将更改后的文件数据存入指定的文件中。
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
	 * 通过key得到value
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
	 * 获取键集合
	 */
	public Set<?> getKeySet(){
		return propertie.keySet();
	}
	
	/**
	 * 获取实体集合
	 */
	public Set<?> getEntrySet(){
		return propertie.entrySet();
	}
	
	/**
	 * 单元测试
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
