package com.gopawpaw.frame.utils;

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
	
	public static void main(String[] args) {
		System.out.println(getHardwareCode());
	}
}
