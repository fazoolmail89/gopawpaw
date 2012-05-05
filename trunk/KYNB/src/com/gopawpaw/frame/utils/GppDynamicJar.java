package com.gopawpaw.frame.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.JarFile;

/**
 * @version 2010-4-14
 * @author �����
 * <br><br>��̬Jar��������
 */
public class GppDynamicJar {
	
	/**
	 * jar��λ�ڱ���
	 */
	public final static int LOCAL = 1;
	
	/**
	 * jar��λ�ڹ��������
	 */
	public final static int LAN = 2;
	
	/**
	 * jar��λ�ڻ�����
	 */
	public final static int INTERNET = 3;
	
	private int location = 1;
	
	private String urlpath = null;
	
	/**
	 * @param location : jar������λ�����ͣ�LOCAL��LAN��INTERNET��
	 * @param urlpath : jar������·��
	 */
	public GppDynamicJar(int location,String urlpath) {
		this.location = location;
		this.urlpath = urlpath;
		
		initialize();
	}
	
	/**
	 * ��ʼ��
	 */
	private void initialize() {
		
	}
	
	/**
	 * �Ƿ����һ����ЧJar��
	 */
	public boolean isExistJarPack(){
		boolean retb = false;

		try {
			new JarFile(this.urlpath);
			retb = true;
		} catch (IOException e) {
//			e.printStackTrace();
			retb =false;
		}
		
		return retb;
	}
	
	
	public boolean runJar(String[] args){
		boolean retb = false;
		
		
		try {
			GppJarRunableInterface rpt = (GppJarRunableInterface) getMainClass()
					.newInstance();
			rpt.runJar(args);
			retb = true;
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}// ���ʵ����
		
		return retb;
	}
	
	public Class<?> getMainClass(){
		
		GppManifestReader gppManif = new GppManifestReader(this.urlpath);
		String mainClass = gppManif.get("Main-Class");
		
		String urlstr = "";
		if(this.location == LOCAL){
			urlstr = "file:\\"+this.urlpath;
		}else if(this.location == LAN){
			
		}else if(this.location == INTERNET){
			
		}else{
			
		}
		
		URL url = null;
		try {
			url = new URL(urlstr);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}//
		URLClassLoader urlCL = URLClassLoader.newInstance(new URL[] { url });
		Class<?> c = null;
		try {
			c = urlCL.loadClass(mainClass);

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}// ������
		
		return c;
		
	}
}
