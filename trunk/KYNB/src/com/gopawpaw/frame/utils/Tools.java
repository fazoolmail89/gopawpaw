package com.gopawpaw.frame.utils;

import java.io.File;

import chenmin.io.DiskID;


public class Tools {

	public static String getHardwareCode(){
		
		String hcode = null;
		hcode = DiskID.DiskID();
		if(hcode == null || "".equals(hcode.trim()) || hcode.trim().equalsIgnoreCase("null")){
			hcode = MacUtils.getMACAddress();
		}
		
		return hcode;
	}
	
	/**
	 * [�õ�key]<BR>
	 * [������ϸ����]
	 * @param keys
	 * @return
	 */
	public static String getKey(String... keys)
	{
		if(keys == null) return "";
		StringBuffer sbKey = new StringBuffer();
		
		for(int i=0;i<keys.length;i++)
		{
			sbKey.append(keys[i]);
			if(i == keys.length -1)
			{
				break;
			}
			sbKey.append("/");
		}
		return sbKey.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(getHardwareCode());
	}
}
