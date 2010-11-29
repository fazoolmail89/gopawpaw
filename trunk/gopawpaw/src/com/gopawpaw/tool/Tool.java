/**
 * 
 */
package com.gopawpaw.tool;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @version 2010-1-9
 * @author �����
 */
public class Tool {
	
	/**
	 * ����IP��ȡ�����ַ���÷���������������
	 * @param ip
	 * @return
	 */
	public static String getGeographicalPosition(String ip){
		String neturl = "http://www.bustool.com/getGeographicalPosition.php?actionip="+ip;
		String address = null;
		
		byte b[] = new byte[100];
		int n = -1;
		
		if(ip.equals("0.0.0.0") || ip.equals("127.0.0.1")) return "���ؼ����";
		
		try {
			URL url = new URL(neturl);
			InputStream in = url.openStream();
			
			while((n=in.read(b))!=-1){
				address = new String(b,0,n);
			}
		} catch (MalformedURLException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}catch (IOException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		return address;
	}
}
