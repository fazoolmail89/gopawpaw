/**
 * 
 */
package com.gopawpaw.frame.dev;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * @version 2010-3-18
 * @author �����
 *
 */
public class GppSystemAttribute {

	/**
	 * 
	 */
	public GppSystemAttribute() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Windows 2000��ϵͳ·���� [ϵͳ�̷�]:/WINNT����C:/WINNT����XP��Vista��ϵͳ·����[ϵͳ�̷�]:/WINDOWS����C:/WINDOWS����Java��Ҫ����ϵͳ·�������Ե��� System.getenv("SystemRoot")������System.getenv("windir")����SystemRoot���͡�windir������windowsϵͳ�Ļ���������windirʵ����ָ��SystemRoot���� 

		  

//		���ϵͳ������properties:  

		       System.out.println("-------- System Properties ---------"); 

		       Properties pp = System.getProperties(); 

		       Enumeration ee = pp.propertyNames(); 

		       while (ee.hasMoreElements()) { 

		           String name = (String) ee.nextElement(); 

		           System.out.println(name + "\n\t\t\t" + pp.getProperty(name)); 

		       } 

		  

		//���ϵͳ�����л��������� 

		       System.out.println("-------- System Environment ---------"); 

		       for (Map.Entry entry : System.getenv().entrySet()) { 

		           System.out.println(entry.getKey() + "\n\t\t\t" + entry.getValue()); 

		       } 

	}

}
