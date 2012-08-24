/*
 * 文件名: FileUtil.java
 * 版    权：  Copyright PingAn Technology All Rights Reserved.
 * 描    述: [该类的简要描述]
 * 创建人: EX-HUXINWU001
 * 创建时间: 2012-1-6
 * 
 * 修改人：
 * 修改时间:
 * 修改内容：[修改内容]
 */
package com.gopawpaw.frame.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import com.gopawpaw.frame.log.APPLog;



/**
 * @author EX-HUXINWU001
 * @date 2012-1-6
 * @version [Android PABank C01, @2012-1-6]
 * @description
 */
public class FileUtil {

	/**
	 * 日志对象
	 */
	private static final String TAG = FileUtil.class.getSimpleName();
	
	/**
	 * [得到系统缓存地址]<BR>
	 * [功能详细描述]
	 * @return
	 */
	public static String getSysCachePath()
	{
		return "";
	}
	
	
	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * @param fileName
	 * @param inStream
	 * @throws IOException 
	 */
	public static boolean saveFile2SDCard(String fileName, InputStream inStream) throws IOException
	{
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;
		
		try 
		{    
			if(!isEmpty(path) && inStream != null)
			{
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);
				
				File file = new File(filepath.toString());
	            if(!file.exists())
	            {
            		 fs = new FileOutputStream(file);    
	                 byte[] buffer = new byte[1024];   
	                 int len = -1;    
	                 
	                 while((len = inStream.read(buffer))!= -1){    
	                	 fs.write(buffer, 0, len);    
	                 }    
	                 
	                 flag = true;
	                 
	                 APPLog.e("保存图片成功: ", filepath.toString());
	            }
	            else{
	            	APPLog.e("该图片已存在: ", filepath.toString());
	            }
			}
        }    
        catch(Exception e){    
            e.printStackTrace();    
        }finally{
        	if(fs!=null)fs.close();
        }   
        
        return flag;
	}
	
	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * @param fileName
	 * @param inStream
	 * @throws IOException 
	 */
	public static boolean saveFile2SDCard(String fileName, byte[] dataBytes) throws IOException
	{
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;
		
		try 
		{    
			if(!isEmpty(path))
			{
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);
				
				File file = new File(filepath.toString());
	            if(!file.exists())
	            {
            		 fs = new FileOutputStream(file);    
	                 fs.write(dataBytes, 0, dataBytes.length);  
	                 fs.flush();
	                 flag = true;
	                 
	                 APPLog.e("保存图片成功: ", filepath.toString());
	            }
	            else{
	            	APPLog.e("该图片已存在: ", filepath.toString());
	            }
			}
        }    
        catch(Exception e){    
            e.printStackTrace();    
        }finally{
        	if(fs!=null)fs.close();
        }   
        
        return flag;
	}
	
	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * @param fileName
	 * @param inStream
	 * @throws IOException 
	 */
	public static boolean delFile2SDCard(String fileName) throws IOException
	{
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;
		
		try 
		{    
			if(!isEmpty(path))
			{
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);
				
				File file = new File(filepath.toString());
	            if(file.exists())
	            {
	            	if(file.delete()){
	            		APPLog.e("删除图片成功: ", fileName);
	            	}
	            }
			}
        }    
        catch(Exception e){    
            e.printStackTrace();    
        }finally{
        	if(fs!=null)fs.close();
        }   
        
        return flag;
	}
	
	/**
	 * [从SD从取得文件列表]<BR>
	 * [功能详细描述]
	 * @return
	 */
	public static HashMap<String, Boolean> getFileList2SDCard()
	{
		HashMap<String, Boolean> cfileList = new HashMap<String, Boolean>();
		String path = getSysCachePath();
		
		if(!isEmpty(path))
		{
			File file = new File(path.toString());  
			if(file.exists()){
				String[] fileList = file.list();
				for(String name : fileList){
					cfileList.put(name, true);
				}
			}
			else
			{
				APPLog.e("getFileList2SDCard", "无法找到" + path);
			}
		}
		return cfileList;
	}
	
	
	/**
	 * [读取系统缓存文件]<BR>
	 * [功能详细描述]
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static InputStream readCacheFile(String fileName) throws IOException
	{
		InputStream in = null;
		
		String path = getSysCachePath();
		StringBuilder filepath = new StringBuilder();
		filepath.append(path);
		filepath.append(File.separator);
		filepath.append(fileName);
		
		in = new FileInputStream(new File(filepath.toString()));
		
	   return in;
   }
	
	/**
	 * [读取系统缓存文件]<BR>
	 * [功能详细描述]
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static byte[] readCacheFileByte(String fileName) throws IOException
	{
		InputStream in = null;
		
		String path = getSysCachePath();
		StringBuilder filepath = new StringBuilder();
		filepath.append(path);
		filepath.append(File.separator);
		filepath.append(fileName);
		
		in = new FileInputStream(filepath.toString());
		byte[] byetes = new byte[in.available()];
		in.read(byetes);
		in.close();
		return byetes;
   }
	
	/**
	 * [将文件流转换成字节]<BR>
	 * [功能详细描述]
	 * @param inStream InputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readStream(InputStream inStream) throws IOException
	{
		ByteArrayOutputStream outstream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = inStream.read(buffer)) != -1) {
		    outstream.write(buffer, 0, len);
		}
		
		return outstream.toByteArray();
   }

	
	/**
	 * [得到文件名方法]<BR>
	 * [功能详细描述]
	 * @param url
	 * @return
	 */
	public static String getFileName(String url)
	{
		String fileName = "";
		if(!isEmpty(url) && url.indexOf("http") > -1)
		{
			int beginIndex = url.lastIndexOf("/") + 1;
			fileName = url.substring(beginIndex, url.length());
		}
		APPLog.e(TAG, "getFileName : " + fileName);
		return fileName;
	}
	
	/**
	 * 写data/data/目录(相当AP工作目录)上的文件
	 * @param fileName 文件名
	 * @param message 写入的内容(byte[])
	 */
	public static void writeFileData(String fileName, byte[] message) {
		
//		try {
//			FileOutputStream fout = ctx.openFileOutput(fileName, Context.MODE_PRIVATE);
//			fout.write(message);
//			fout.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	/**
	 * 写data/data/目录(相当AP工作目录)上的文件
	 * @param fileName 文件名
	 * @param message 写入的内容(String)
	 */
	public static void writeFileData(String fileName, String message) {
		
//		try {
//			FileOutputStream fout = ctx.openFileOutput(fileName, Context.MODE_PRIVATE);
//			byte[] bytes = message.getBytes();
//			fout.write(bytes);
//			fout.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	/**
	 * 读data/data/目录(相当AP工作目录)上的文件
	 * @param fileName 文件名
	 * @return res 文件内容
	 */
	public static String readFileData(String fileName) {
		
		String res = "";
//		try {
//			FileInputStream fin = ctx.openFileInput(fileName);
//			int length = fin.available();
//			byte[] buffer = new byte[length];
//			fin.read(buffer);
//			res = EncodingUtils.getString(buffer, "UTF-8");
//			fin.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return res;
	}
	
	/**
	 * 读data/data/目录(相当AP工作目录)上的文件
	 * @param fileName 文件名
	 * @return res 文件内容
	 */
	public static byte[] readFileDataByte(String fileName) {
		
		byte[] buffer = null;
//		try {
//			FileInputStream fin = ctx.openFileInput(fileName);
//			int length = fin.available();
//			buffer = new byte[length];
//			fin.read(buffer);
//			fin.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return buffer;
	}
	
	/**
	 * /先把db的zip文件保存在本地，再读取出来进行解压，再保存在本地
	 * @param data
	 * @param ctx
	 * @return
	 */
	public static boolean zipDBFile(String dbZipName, String dbName, String dbVersionName, byte[] data){
		boolean zipSuccess = false;
		return zipSuccess;
	}
	
	/**
	 * 是否为空
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		if (value == null || value.length() == 0) {
			return true;
		}
		else
			return false;
	}
}

