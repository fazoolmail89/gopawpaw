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
 * @author 李锦华
 */
public class Tool {
	
	/**
	 * 根据IP获取物理地址，该方法必须链接网络
	 * @param ip
	 * @return
	 */
	public static String getGeographicalPosition(String ip){
		String neturl = "http://www.bustool.com/getGeographicalPosition.php?actionip="+ip;
		String address = null;
		
		byte b[] = new byte[100];
		int n = -1;
		
		if(ip.equals("0.0.0.0") || ip.equals("127.0.0.1")) return "本地计算机";
		
		try {
			URL url = new URL(neturl);
			InputStream in = url.openStream();
			
			while((n=in.read(b))!=-1){
				address = new String(b,0,n);
			}
		} catch (MalformedURLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}catch (IOException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return address;
	}
}
