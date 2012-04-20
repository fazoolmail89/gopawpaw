/**
 * 
 */
package com.gopawpaw.frame.dev;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * @version 2010-3-18
 * @author 李锦华
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

//		Windows 2000的系统路径是 [系统盘符]:/WINNT，如C:/WINNT；而XP和Vista的系统路径是[系统盘符]:/WINDOWS，如C:/WINDOWS。在Java里要想获得系统路径，可以调用 System.getenv("SystemRoot")，或者System.getenv("windir")。“SystemRoot”和“windir”都是windows系统的环境变量（windir实际上指向SystemRoot）。 

		  

//		获得系统的所有properties:  

		       System.out.println("-------- System Properties ---------"); 

		       Properties pp = System.getProperties(); 

		       Enumeration ee = pp.propertyNames(); 

		       while (ee.hasMoreElements()) { 

		           String name = (String) ee.nextElement(); 

		           System.out.println(name + "\n\t\t\t" + pp.getProperty(name)); 

		       } 

		  

		//获得系统的所有环境变量： 

		       System.out.println("-------- System Environment ---------"); 

		       for (Map.Entry entry : System.getenv().entrySet()) { 

		           System.out.println(entry.getKey() + "\n\t\t\t" + entry.getValue()); 

		       } 

	}

}
