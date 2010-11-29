/**
 * 
 */
package com.gopawpaw.dev.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * ZIP�ļ�ѹ������ѹ������
 * 
 * @version 2010-11-28
 * @author �����
 * 
 */
public class ZipFile {
	private static final int BUFFER = 2048;

	/**
	 * ��ѹʧ��
	 */
	public static final int UN_ZIP_FALSE = 0;

	/**
	 * ��ѹ�ɹ�
	 */
	public static final int UN_ZIP_TRUE = 1;

	/**
	 * ѹ��ʧ��
	 */
	public static final int ZIP_FALSE = 2;

	/**
	 * ѹ���ɹ�
	 */
	public static final int ZIP_TURE = 3;

	/**
	 * ����һ����Ч��ZIP�ļ�
	 */
	public static final int IS_NOT_ZIP_FILE = 4;

	/**
	 * ��һ����Ч��ZIP�ļ�
	 */
	public static final int IS_ZIP_FILE = 5;

	/**
	 * ����һ���ļ�
	 */
	public static final int IS_NOT_FILE = 6;

	/**
	 * ��һ���ļ�
	 */
	public static final int IS_FILE = 7;

	/**
	 * �ļ�������
	 */
	public static final int FILE_NOT_EXIST = 8;

	/**
	 * �ļ�����
	 */
	public static final int FILE_EXIST = 9;

	/**
	 * Ŀ��ѹ���ļ��Ѿ�����
	 */
	public static final int TARGET_ZIP_ALREADY_EXISTS = 10;

	/**
	 * Ŀ���ѹĿ¼�Ѿ�����
	 */
	public static final int TARGET_UNZIP_DIR_ALREADY_EXISTS = 11;

	/**
	 * ���̿ռ䲻��
	 */
	public static final int NO_MORE_SPACE = 12;

	/**
	 * ���ÿռ��С
	 */
	private static long availableSpaceSize = 0;

	/**
	 * ѹ���ļ���С
	 */
	private static long zipFileSize = 0;

	/**
	 * ��ѹ����ѹ���ļ���С�ı���
	 */
	private static int UN_ZIP_SPACE_TIMES = 3;

	
	public ZipFile( ) {
		
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\epub\\Campione����.epub";
		String tagPath = "D:\\epub\\Campione����";
		
		
//		unZip(path);
	}

	/**
	 * ��ѹ�ļ���Ĭ�Ͻ�ѹ����ǰѹ���ļ���ͬĿ¼
	 * 
	 * @param zipFilePath
	 *            :ѹ���ļ�·��
	 * @retrun UN_ZIP_TRUE :��ѹ�ɹ� <br>
	 *         IS_NOT_ZIP_FILE :��ѹ�ļ�����һ����Ч��ZIP�ļ� <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :Ŀ���ѹĿ¼�Ѿ�����<br>
	 *         IS_NOT_FILE:����һ���ļ�
	 * 
	 */
	public static int unZip(String zipFilePath) {
		if(zipFilePath == null){
			return IS_NOT_FILE;
		}
		int i = zipFilePath.lastIndexOf(".");

		return unZip(zipFilePath, zipFilePath.substring(0, i));
	}

	/**
	 * ��ѹ�ļ�
	 * 
	 * @param zipFilePath
	 *            :ѹ���ļ�·��
	 * @param targetPath
	 *            :��ѹĿ��·��
	 * @retrun UN_ZIP_TRUE :��ѹ�ɹ� <br>
	 *         IS_NOT_ZIP_FILE :��ѹ�ļ�����һ����Ч��ZIP�ļ� <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :Ŀ���ѹĿ¼�Ѿ�����
	 * 
	 */
	public static int unZip(String zipFilePath, String targetPath) {

		return unZip(zipFilePath,targetPath,false);
	}

	/**
	 * ��ѹ�ļ�
	 * 
	 * @param zipFilePath
	 *            :ѹ���ļ�·��
	 * @param targetPath
	 *            :��ѹĿ��·��
	 * @param reUnZip
	 *            :���½�ѹ��reUnZip=true ��Ŀ���ļ��Ѵ��ڣ���ɾ��ԭ��ѹ�ļ��������½�ѹ; reUnZip=false
	 *            ��Ŀ���ļ��Ѵ���,�����½�ѹ��
	 * @retrun UN_ZIP_TRUE :��ѹ�ɹ� <br>
	 *         IS_NOT_ZIP_FILE :��ѹ�ļ�����һ����Ч��ZIP�ļ� <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :Ŀ���ѹĿ¼�Ѿ�����
	 * 
	 */
	public static int unZip(String zipFilePath, String targetPath,
			boolean reUnZip) {
		//����ZIP�ļ�
		if(isZipFile(zipFilePath) == IS_NOT_ZIP_FILE){
			return IS_NOT_ZIP_FILE;
		}
		
		//�����Ѿ����ڵĽ�ѹĿ¼
		if(reUnZip && isExistTargetDir(targetPath) == TARGET_UNZIP_DIR_ALREADY_EXISTS){
			File f = new File(targetPath);
			f.delete();
		//�������Ѿ����ڵĽ�ѹĿ¼
		}else if(!reUnZip && isExistTargetDir(targetPath) == TARGET_UNZIP_DIR_ALREADY_EXISTS){
			return TARGET_UNZIP_DIR_ALREADY_EXISTS;
		}
		
		try {
			BufferedOutputStream dest = null;
			FileInputStream fis = new FileInputStream(zipFilePath);
			ZipInputStream zis = new ZipInputStream(
					new BufferedInputStream(fis));

			File outDir = new File(targetPath);
			if (!outDir.exists()) {
				outDir.mkdirs();
			}

			ZipEntry entry;
			while ((entry = zis.getNextEntry()) != null) {
				if (entry.isDirectory()) {
					File file = new File(targetPath + File.separator
							+ entry.getName());
					file.mkdirs();
				} else {
					int count;
					byte data[] = new byte[BUFFER];
					// write the files to the disk
					FileOutputStream fos = new FileOutputStream(targetPath
							+ File.separator + entry.getName());
					dest = new BufferedOutputStream(fos, BUFFER);
					while ((count = zis.read(data, 0, BUFFER)) != -1) {
						dest.write(data, 0, count);
					}
				}
				dest.flush();
				dest.close();
			}
			zis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return UN_ZIP_TRUE;
	}
	
	/**
	 * �ж��Ƿ�ΪZIP�ļ�
	 * @return
	 * 		IS_ZIP_FILE��IS_NOT_ZIP_FILE
	 */
	public static int isZipFile(String zipFilePath){
		
		return IS_ZIP_FILE;
	}
	
	/**
	 * �Ƿ���ڽ�ѹĿ¼
	 * @return 
	 * 		TARGET_UNZIP_DIR_ALREADY_EXISTS �� 0
	 */
	public static int isExistTargetDir(String targetPath){
		File  f = new File(targetPath);
		if(f.exists()){
			return TARGET_UNZIP_DIR_ALREADY_EXISTS;
		}else{
			return 0;
		}
	
	}
	
	/**
	 * ��ȡ���ÿռ��С
	 */
	public long getAvailableSpaceSize(String targetPath) {
		return availableSpaceSize;
	}

	/**
	 * ��ȡѹ���ļ���С
	 * @throws IOException 
	 */
	public static long getZipFileSize(File file) throws IOException {
		long size=0;
        if (file.exists()) {
            FileInputStream fis = null;
            fis = new FileInputStream(file);
            size= fis.available();
        } else {
          return (long) 0;
        } 
        return size;
	}
	
	/**
	 * ��ȡ��ѹ��������
	 */
	public static int getUN_ZIP_SPACE_TIMES() {
		return UN_ZIP_SPACE_TIMES;
	}

	public static void setUN_ZIP_SPACE_TIMES(int uN_ZIP_SPACE_TIMES) {
		UN_ZIP_SPACE_TIMES = uN_ZIP_SPACE_TIMES;
	}

}
