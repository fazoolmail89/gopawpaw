/**
 * 
 */
package com.gopawpaw.erp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.jar.JarFile;

/**
 * @version 2010-4-8
 * @author �����
 * 
 */
public class GppManifestReaderT {

	private String jarFilePath;
	private HashMap<String, String> attributeMap = null;

	/**
	 * 
	 */
	public GppManifestReaderT(String jarFilePath) {
		this.jarFilePath = jarFilePath;
		initialize();
	}

	private void initialize() {
		attributeMap = new HashMap<String, String>();
	}

	/**
	 * ��ȡ����ӳ���
	 */
	public HashMap<String, String> getAttributeMap() {

		reloadManifest();

		return attributeMap;
	}

	/**
	 * ��ȡ��������
	 */
	public Set<String> getKeySet() {
		return getAttributeMap().keySet();

	}

	/**
	 * ��ȡֵ����
	 */
	public Set<Entry<String, String>> getValuesSet() {
		return getAttributeMap().entrySet();
	}
	
	/**
	 * ��ȡֵ
	 */
	public String get(Object keyobj){
		return getAttributeMap().get(keyobj);
	}

	/**
	 * ���¼��� MANIFEST.MF�ļ�
	 */
	private boolean reloadManifest() {

		JarFile jarFile = null;
		try {
			jarFile = new JarFile(this.jarFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStream in = null;
		try {
			in = jarFile.getInputStream(jarFile
					.getEntry("META-INF/MANIFEST.MF"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String line = null;
		String newline = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} // ��ȡ��һ��
		while (line != null) { // ��� line Ϊ��˵��������
			if (line.startsWith(" ")) {
				newline = newline + line.trim();
			} else {
				newline = line.trim();
			}
			attributeMap.put(getKeyFromString(newline), getValuesFromString(newline));
			try {
				line = reader.readLine();
				// ��ȡ��һ�� **
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		
		return true;
	}

	private String getKeyFromString(String line) {
		String[] str = line.split(":");
		return str[0];
	}
	
	private String getValuesFromString(String line) {
		String[] str = line.split(":");
		if(str.length != 2){
			return "";
		}
		return str[1].trim();
	}
}
