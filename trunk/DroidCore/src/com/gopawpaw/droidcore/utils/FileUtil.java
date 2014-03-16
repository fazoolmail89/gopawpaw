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
package com.gopawpaw.droidcore.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipInputStream;

import org.apache.http.util.EncodingUtils;

import android.content.Context;
import android.os.Environment;

import com.gopawpaw.droidcore.AppConfig;
import com.gopawpaw.droidcore.log.AppLog;

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
	 * [判断是否有SD卡]<BR>
	 * [功能详细描述]
	 * 
	 * @return
	 */
	public static boolean avaiableSDCard() {
		String status = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(status))
			return true;
		else
			return false;
	}

	/**
	 * [得到系统缓存地址]<BR>
	 * [功能详细描述]
	 * 
	 * @return
	 */
	public static String getSysCachePath() {
		StringBuilder path = new StringBuilder();
		if (avaiableSDCard()) {
			path.append(Environment.getExternalStorageDirectory().toString());
			path.append(File.separator);
			path.append(AppConfig.SDCARD_ROOT);
			path.append(File.separator);
			path.append(AppConfig.DOWNLOAD_PATH);

			File file = new File(path.toString());
			// 如果文件夹不存在
			if (!file.exists() && !file.isDirectory()) {
				boolean flag = file.mkdirs();
				if (flag) {
					AppLog.e("创建文件夹成功：", file.getPath());
				} else {
					AppLog.e("创建文件夹失败：", file.getPath());
				}
			}
		} else {
			AppLog.e("getSysCachePath", "无法找到 SdCard.");
			return null;
		}

		return path.toString();
	}

	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * 
	 * @param fileName
	 * @param inStream
	 * @throws IOException
	 */
	public static boolean saveFile2SDCard(String fileName, InputStream inStream)
			throws IOException {
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;

		try {
			if (!Tools.isEmpty(path) && inStream != null) {
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);

				File file = new File(filepath.toString());
				if (!file.exists()) {
					fs = new FileOutputStream(file);
					byte[] buffer = new byte[1024];
					int len = -1;

					while ((len = inStream.read(buffer)) != -1) {
						fs.write(buffer, 0, len);
					}

					flag = true;

					AppLog.e("保存图片成功: ", filepath.toString());
				} else {
					AppLog.e("该图片已存在: ", filepath.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fs != null)
				fs.close();
		}

		return flag;
	}

	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * 
	 * @param fileName
	 * @param inStream
	 * @throws IOException
	 */
	public static boolean saveFile2SDCard(String fileName, byte[] dataBytes)
			throws IOException {
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;

		try {
			if (!Tools.isEmpty(path)) {
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);

				File file = new File(filepath.toString());
				if (!file.exists()) {
					fs = new FileOutputStream(file);
					fs.write(dataBytes, 0, dataBytes.length);
					fs.flush();
					flag = true;

					AppLog.e("保存图片成功: ", filepath.toString());
				} else {
					AppLog.e("该图片已存在: ", filepath.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fs != null)
				fs.close();
		}

		return flag;
	}

	/**
	 * [将文件保存到SDcard方法]<BR>
	 * [功能详细描述]
	 * 
	 * @param fileName
	 * @param inStream
	 * @throws IOException
	 */
	public static boolean delFile2SDCard(String fileName) throws IOException {
		boolean flag = false;
		StringBuilder filepath = new StringBuilder();
		String path = getSysCachePath();
		FileOutputStream fs = null;

		try {
			if (!Tools.isEmpty(path)) {
				filepath.append(path);
				filepath.append(File.separator);
				filepath.append(fileName);

				File file = new File(filepath.toString());
				if (file.exists()) {
					if (file.delete()) {
						AppLog.e("删除图片成功: ", fileName);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fs != null)
				fs.close();
		}

		return flag;
	}

	/**
	 * [从SD从取得文件列表]<BR>
	 * [功能详细描述]
	 * 
	 * @return
	 */
	public static HashMap<String, Boolean> getFileList2SDCard() {
		HashMap<String, Boolean> cfileList = new HashMap<String, Boolean>();
		String path = getSysCachePath();

		if (!Tools.isEmpty(path)) {
			File file = new File(path.toString());
			if (file.exists()) {
				String[] fileList = file.list();
				for (String name : fileList) {
					cfileList.put(name, true);
				}
			} else {
				AppLog.e("getFileList2SDCard", "无法找到" + path);
			}
		}
		return cfileList;
	}

	/**
	 * [读取系统缓存文件]<BR>
	 * [功能详细描述]
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static InputStream readCacheFile(String fileName) throws IOException {
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
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static byte[] readCacheFileByte(String fileName) throws IOException {
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
	 * 
	 * @param inStream
	 *            InputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readStream(InputStream inStream) throws IOException {
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
	 * 
	 * @param url
	 * @return
	 */
	public static String getFileName(String url) {
		String fileName = url;
		if (!Tools.isEmpty(url) && url.indexOf("http") > -1) {
			int beginIndex = url.lastIndexOf("/") + 1;
			fileName = url.substring(beginIndex, url.length());
		}
		AppLog.e(TAG, "getFileName : " + fileName);
		return fileName;
	}

	/**
	 * 写data/data/目录(相当AP工作目录)上的文件
	 * 
	 * @param fileName
	 *            文件名
	 * @param message
	 *            写入的内容(byte[])
	 */
	public static void writeFileData(String fileName, byte[] message,
			Context ctx) {

		try {
			FileOutputStream fout = ctx.openFileOutput(fileName,
					Context.MODE_PRIVATE);
			fout.write(message);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写data/data/目录(相当AP工作目录)上的文件
	 * 
	 * @param fileName
	 *            文件名
	 * @param message
	 *            写入的内容(String)
	 */
	public static void writeFileData(String fileName, String message,
			Context ctx) {

		try {
			FileOutputStream fout = ctx.openFileOutput(fileName,
					Context.MODE_PRIVATE);
			byte[] bytes = message.getBytes();
			fout.write(bytes);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读data/data/目录(相当AP工作目录)上的文件
	 * 
	 * @param fileName
	 *            文件名
	 * @return res 文件内容
	 */
	public static String readFileData(String fileName, Context ctx) {

		String res = "";
		try {
			FileInputStream fin = ctx.openFileInput(fileName);
			int length = fin.available();
			byte[] buffer = new byte[length];
			fin.read(buffer);
			res = EncodingUtils.getString(buffer, "UTF-8");
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 读data/data/目录(相当AP工作目录)上的文件
	 * 
	 * @param fileName
	 *            文件名
	 * @return res 文件内容
	 */
	public static byte[] readFileDataByte(String fileName, Context ctx) {

		byte[] buffer = null;
		try {
			FileInputStream fin = ctx.openFileInput(fileName);
			int length = fin.available();
			buffer = new byte[length];
			fin.read(buffer);
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer;
	}

	/**
	 * /先把db的zip文件保存在本地，再读取出来进行解压，再保存在本地
	 * 
	 * @param data
	 * @param ctx
	 * @return
	 */
	public static boolean zipDBFile(String dbZipName, String dbName,
			String dbVersionName, byte[] data, Context ctx) {
		boolean zipSuccess = false;
		try {
			// 先把db的zip文件保存在本地，再读取出来
			writeFileData(dbZipName, data, ctx);
			FileInputStream fins = ctx.openFileInput(dbZipName);
			// 将fins传入ZipInputStream中
			ZipInputStream zins = new ZipInputStream(fins);
			byte ch[] = new byte[256];
			// 解压zip包
			while (zins.getNextEntry() != null) {
				int i;
				AppLog.e(TAG, "解压成功：zipDBFile 01");
				FileOutputStream fout = ctx.openFileOutput(dbName,
						Context.MODE_PRIVATE);
				while ((i = zins.read(ch)) != -1)
					fout.write(ch, 0, i);
				AppLog.e(TAG, "解压成功：zipDBFile03");
				zins.closeEntry();
				fout.close();
				zipSuccess = true;
			}
			fins.close();
			zins.close();

		} catch (Exception e) {
			AppLog.e(TAG, "解压失败：zipDBFile--catch");
		}
		return zipSuccess;
	}

	public static long FileFolder_All_Size(String path){

		File pathFile = new File(path); // 取得sdcard文件路径

		android.os.StatFs statfs = new android.os.StatFs(pathFile.getPath());

		long nTotalBlocks = statfs.getBlockCount(); // 获取SDCard上BLOCK总数

		long nBlocSize = statfs.getBlockSize(); // 获取SDCard上每个block的SIZE

		long nAvailaBlock = statfs.getAvailableBlocks(); // 获取可供程序使用的Block的数量

		long nFreeBlock = statfs.getFreeBlocks(); // 获取剩下的所有Block的数量(包括预留的一般程序无法使用的块)

		long nSDTotalSize = nTotalBlocks * nBlocSize / 1024 / 1024; // 计算SDCard
																	// 总容量大小MB

		return nSDTotalSize;

	}

	public static long FileFolder_Free_Size(String path){

		File pathFile = new File(path); // 取得sdcard文件路径

		android.os.StatFs statfs = new android.os.StatFs(pathFile.getPath());

		long nTotalBlocks = statfs.getBlockCount(); // 获取SDCard上BLOCK总数

		long nBlocSize = statfs.getBlockSize(); // 获取SDCard上每个block的SIZE

		long nAvailaBlock = statfs.getAvailableBlocks(); // 获取可供程序使用的Block的数量

		long nFreeBlock = statfs.getFreeBlocks(); // 获取剩下的所有Block的数量(包括预留的一般程序无法使用的块)

		long nSDFreeSize = nAvailaBlock * nBlocSize / 1024 / 1024; // 计算 SDCard
																	// 剩余大小MB

		return nSDFreeSize;

	}

	public static long FileFolder_Used_Size(String path){

		File pathFile = new File(path); // 取得sdcard文件路径

		android.os.StatFs statfs = new android.os.StatFs(pathFile.getPath());

		long nTotalBlocks = statfs.getBlockCount(); // 获取SDCard上BLOCK总数

		long nBlocSize = statfs.getBlockSize(); // 获取SDCard上每个block的SIZE

		long nAvailaBlock = statfs.getAvailableBlocks(); // 获取可供程序使用的Block的数量

		long nFreeBlock = statfs.getFreeBlocks(); // 获取剩下的所有Block的数量(包括预留的一般程序无法使用的块)

		long nSDFreeSize = nAvailaBlock * nBlocSize / 1024 / 1024; // 计算 SDCard
																	// 剩余大小MB

		long nSDTotalSize = nTotalBlocks * nBlocSize / 1024 / 1024; // 计算SDCard
																	// 总容量大小MB
		return nSDTotalSize - nSDFreeSize;

		// return FileFolder_All_Size(path) - FileFolder_Free_Size(path) ;
		// //用这个方法不太好，最好用没有注掉的code，且也可以弄两个变量一减不用函数

	}

}
