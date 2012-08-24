/*
 * �ļ���: FileUtil.java
 * ��    Ȩ��  Copyright PingAn Technology All Rights Reserved.
 * ��    ��: [����ļ�Ҫ����]
 * ������: EX-HUXINWU001
 * ����ʱ��: 2012-1-6
 * 
 * �޸��ˣ�
 * �޸�ʱ��:
 * �޸����ݣ�[�޸�����]
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
	 * ��־����
	 */
	private static final String TAG = FileUtil.class.getSimpleName();
	
	/**
	 * [�õ�ϵͳ�����ַ]<BR>
	 * [������ϸ����]
	 * @return
	 */
	public static String getSysCachePath()
	{
		return "";
	}
	
	
	/**
	 * [���ļ����浽SDcard����]<BR>
	 * [������ϸ����]
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
	                 
	                 APPLog.e("����ͼƬ�ɹ�: ", filepath.toString());
	            }
	            else{
	            	APPLog.e("��ͼƬ�Ѵ���: ", filepath.toString());
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
	 * [���ļ����浽SDcard����]<BR>
	 * [������ϸ����]
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
	                 
	                 APPLog.e("����ͼƬ�ɹ�: ", filepath.toString());
	            }
	            else{
	            	APPLog.e("��ͼƬ�Ѵ���: ", filepath.toString());
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
	 * [���ļ����浽SDcard����]<BR>
	 * [������ϸ����]
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
	            		APPLog.e("ɾ��ͼƬ�ɹ�: ", fileName);
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
	 * [��SD��ȡ���ļ��б�]<BR>
	 * [������ϸ����]
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
				APPLog.e("getFileList2SDCard", "�޷��ҵ�" + path);
			}
		}
		return cfileList;
	}
	
	
	/**
	 * [��ȡϵͳ�����ļ�]<BR>
	 * [������ϸ����]
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
	 * [��ȡϵͳ�����ļ�]<BR>
	 * [������ϸ����]
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
	 * [���ļ���ת�����ֽ�]<BR>
	 * [������ϸ����]
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
	 * [�õ��ļ�������]<BR>
	 * [������ϸ����]
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
	 * дdata/data/Ŀ¼(�൱AP����Ŀ¼)�ϵ��ļ�
	 * @param fileName �ļ���
	 * @param message д�������(byte[])
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
	 * дdata/data/Ŀ¼(�൱AP����Ŀ¼)�ϵ��ļ�
	 * @param fileName �ļ���
	 * @param message д�������(String)
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
	 * ��data/data/Ŀ¼(�൱AP����Ŀ¼)�ϵ��ļ�
	 * @param fileName �ļ���
	 * @return res �ļ�����
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
	 * ��data/data/Ŀ¼(�൱AP����Ŀ¼)�ϵ��ļ�
	 * @param fileName �ļ���
	 * @return res �ļ�����
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
	 * /�Ȱ�db��zip�ļ������ڱ��أ��ٶ�ȡ�������н�ѹ���ٱ����ڱ���
	 * @param data
	 * @param ctx
	 * @return
	 */
	public static boolean zipDBFile(String dbZipName, String dbName, String dbVersionName, byte[] data){
		boolean zipSuccess = false;
		return zipSuccess;
	}
	
	/**
	 * �Ƿ�Ϊ��
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

