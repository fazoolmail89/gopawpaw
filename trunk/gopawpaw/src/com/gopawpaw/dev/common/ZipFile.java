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
 * ZIP文件压缩，解压工具类
 * 
 * @version 2010-11-28
 * @author 李锦华
 * 
 */
public class ZipFile {
	private static final int BUFFER = 2048;

	/**
	 * 解压失败
	 */
	public static final int UN_ZIP_FALSE = 0;

	/**
	 * 解压成功
	 */
	public static final int UN_ZIP_TRUE = 1;

	/**
	 * 压缩失败
	 */
	public static final int ZIP_FALSE = 2;

	/**
	 * 压缩成功
	 */
	public static final int ZIP_TURE = 3;

	/**
	 * 不是一个有效的ZIP文件
	 */
	public static final int IS_NOT_ZIP_FILE = 4;

	/**
	 * 是一个有效的ZIP文件
	 */
	public static final int IS_ZIP_FILE = 5;

	/**
	 * 不是一个文件
	 */
	public static final int IS_NOT_FILE = 6;

	/**
	 * 是一个文件
	 */
	public static final int IS_FILE = 7;

	/**
	 * 文件不存在
	 */
	public static final int FILE_NOT_EXIST = 8;

	/**
	 * 文件存在
	 */
	public static final int FILE_EXIST = 9;

	/**
	 * 目标压缩文件已经存在
	 */
	public static final int TARGET_ZIP_ALREADY_EXISTS = 10;

	/**
	 * 目标解压目录已经存在
	 */
	public static final int TARGET_UNZIP_DIR_ALREADY_EXISTS = 11;

	/**
	 * 磁盘空间不足
	 */
	public static final int NO_MORE_SPACE = 12;

	/**
	 * 可用空间大小
	 */
	private static long availableSpaceSize = 0;

	/**
	 * 压缩文件大小
	 */
	private static long zipFileSize = 0;

	/**
	 * 解压所需压缩文件大小的倍数
	 */
	private static int UN_ZIP_SPACE_TIMES = 3;

	
	public ZipFile( ) {
		
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\epub\\Campione！Ⅱ.epub";
		String tagPath = "D:\\epub\\Campione！Ⅱ";
		
		
//		unZip(path);
	}

	/**
	 * 解压文件，默认解压到当前压缩文件相同目录
	 * 
	 * @param zipFilePath
	 *            :压缩文件路径
	 * @retrun UN_ZIP_TRUE :解压成功 <br>
	 *         IS_NOT_ZIP_FILE :解压文件不是一个有效的ZIP文件 <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :目标解压目录已经存在<br>
	 *         IS_NOT_FILE:不是一个文件
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
	 * 解压文件
	 * 
	 * @param zipFilePath
	 *            :压缩文件路径
	 * @param targetPath
	 *            :解压目标路径
	 * @retrun UN_ZIP_TRUE :解压成功 <br>
	 *         IS_NOT_ZIP_FILE :解压文件不是一个有效的ZIP文件 <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :目标解压目录已经存在
	 * 
	 */
	public static int unZip(String zipFilePath, String targetPath) {

		return unZip(zipFilePath,targetPath,false);
	}

	/**
	 * 解压文件
	 * 
	 * @param zipFilePath
	 *            :压缩文件路径
	 * @param targetPath
	 *            :解压目标路径
	 * @param reUnZip
	 *            :重新解压，reUnZip=true 若目标文件已存在，则删除原解压文件后再重新解压; reUnZip=false
	 *            若目标文件已存在,则不重新解压。
	 * @retrun UN_ZIP_TRUE :解压成功 <br>
	 *         IS_NOT_ZIP_FILE :解压文件不是一个有效的ZIP文件 <br>
	 *         TARGET_UNZIP_DIR_ALREADY_EXISTS :目标解压目录已经存在
	 * 
	 */
	public static int unZip(String zipFilePath, String targetPath,
			boolean reUnZip) {
		//不是ZIP文件
		if(isZipFile(zipFilePath) == IS_NOT_ZIP_FILE){
			return IS_NOT_ZIP_FILE;
		}
		
		//覆盖已经存在的解压目录
		if(reUnZip && isExistTargetDir(targetPath) == TARGET_UNZIP_DIR_ALREADY_EXISTS){
			File f = new File(targetPath);
			f.delete();
		//不覆盖已经存在的解压目录
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
	 * 判断是否为ZIP文件
	 * @return
	 * 		IS_ZIP_FILE或IS_NOT_ZIP_FILE
	 */
	public static int isZipFile(String zipFilePath){
		
		return IS_ZIP_FILE;
	}
	
	/**
	 * 是否存在解压目录
	 * @return 
	 * 		TARGET_UNZIP_DIR_ALREADY_EXISTS 或 0
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
	 * 获取可用空间大小
	 */
	public long getAvailableSpaceSize(String targetPath) {
		return availableSpaceSize;
	}

	/**
	 * 获取压缩文件大小
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
	 * 获取解压比例倍数
	 */
	public static int getUN_ZIP_SPACE_TIMES() {
		return UN_ZIP_SPACE_TIMES;
	}

	public static void setUN_ZIP_SPACE_TIMES(int uN_ZIP_SPACE_TIMES) {
		UN_ZIP_SPACE_TIMES = uN_ZIP_SPACE_TIMES;
	}

}
