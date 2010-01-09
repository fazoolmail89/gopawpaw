/**
 * 
 */
package com.gopawpaw.fileencrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 2010-1-1
 * @author 李锦华
 */
public class GppFolder {
	String folderPath = null;
	File file = null;

	public static void main(String[] args) {
		String ff = "E:\\wwe2";
		String tt = "E:\\kkk..\\";
		try {
			GppFolder.copyFolder(ff, tt);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// GppFolder.delFolder(tt);
	}

	/**
	 * 
	 * @param folderPath
	 */
	public GppFolder(String folderPath) {
		super();
		this.folderPath = folderPath;
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.file = new File(this.folderPath);
	}

	/**
	 * 文件夹复制
	 * 
	 * @param fromPath
	 * @param toPath
	 * @return
	 */
	public static boolean copyFolder(String fromPath, String toPath)
			throws IOException {
		GppFolder fromFile = new GppFolder(fromPath);
		GppFolder toFile = new GppFolder(toPath);

		// if (!fromFile.exists()) {
		// // 确定原文件是否存在
		// abort("no   such   source   file:   " + fromPath);
		// }

		// if (!fromFile.isDirectory()) {
		// // 确定是否是一个目录
		// abort("can't   copy   directory:   " + fromPath);
		// }

		if (!toFile.exists()) {
			// 目标目录不存在则创建
			toFile.getFile().mkdirs();
		}

		// 文件夹列表
		String[] filelist = fromFile.getFile().list();

		int filelength = filelist.length;

		for (int i = 0; i < filelength; i++) {
			/*
			 * 遍历目录复制
			 */
			// 子路径
			String fromsonpath = null;
			String tosonpath = null;

			/**
			 * 解析操作符
			 */
			// if (fromPath.endsWith(File.separator)) {
			// fromsonpath = fromPath + filelist[i];
			// tosonpath = toPath + filelist[i];
			// } else {
			fromsonpath = fromPath + File.separator + filelist[i];
			tosonpath = toPath + File.separator + filelist[i];
			// }

			// 子文件
			File sonfile = new File(fromsonpath);

			if (sonfile.isDirectory()) {
				/*
				 * 是目录处理
				 */
				GppFolder.copyFolder(fromsonpath, tosonpath);
			}

			if (sonfile.isFile()) {
				/*
				 * 是文件处理
				 */
				GppFolder.copyFile(fromsonpath, tosonpath);
			}
		}

		return true;
	}

	/**
	 * 拷贝文件
	 * 
	 * @param fromPath
	 * @param toPath
	 * @return
	 * @throws IOException
	 */
	public static boolean copyFile(String fromPath, String toPath)
			throws IOException {
		File fromFile = new File(fromPath);

		if (!fromFile.exists()) {
			// 确定原文件是否存在
			abort("no   such   source   file:   " + fromPath);
		}

		if (!fromFile.isFile()) {
			// 确定是否是一个文件
			abort("can't   copy   file:   " + fromPath);
		}

		if (!fromFile.canRead()) {
			// 确定文件是否可读
			abort("source   file   is   unreadable:   " + fromPath);
		}

		FileInputStream input = new FileInputStream(fromFile);
		FileOutputStream output = new FileOutputStream(toPath);

		byte[] b = new byte[1024 * 5];
		int len;
		while ((len = input.read(b)) != -1) {
			output.write(b, 0, len);
		}
		output.flush();
		output.close();
		input.close();
		return true;
	}

	/**
	 * 删除文件夹（包含本文件夹）
	 * 
	 * @param folderPath
	 * @return
	 */
	public static boolean delFolder(String folderPath) {
		try {
			delAllFile(folderPath); // 删除完里面所有内容
			String filePath = folderPath;
			filePath = filePath.toString();
			java.io.File myFilePath = new java.io.File(filePath);
			myFilePath.delete(); // 删除空文件夹

		} catch (Exception e) {
			System.out.println("删除文件夹操作出错");
			e.printStackTrace();

		}
		return true;
	}

	/**
	 * 删除文件夹（不包含本文件夹）
	 * 
	 * @param path
	 * @return
	 */
	public static boolean delAllFile(String path) {

		File file = new File(path);
		if (!file.exists()) {
			return false;
		}
		if (!file.isDirectory()) {
			return false;
		}
		String[] tempList = file.list();
		File temp = null;
		for (int i = 0; i < tempList.length; i++) {
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				temp = new File(path + File.separator + tempList[i]);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			if (temp.isDirectory()) {
				delAllFile(path + "/" + tempList[i]);// 先删除文件夹里面的文件
				delFolder(path + "/" + tempList[i]);// 再删除空文件夹
			}
		}
		return true;
	}

	/**
	 * 判断是否为文件
	 * 
	 * @return
	 */
	public boolean isFile() {

		return file.isFile();
	}

	/**
	 * 判断是否为目录
	 * 
	 * @return
	 */
	public boolean isDirectory() {

		return file.isDirectory();
	}

	/**
	 * 判断文件是否可读
	 * 
	 * @return
	 */
	public boolean canRead() {
		return file.canRead();
	}

	/**
	 * 判断文件是否可写
	 * 
	 * @return
	 */
	public boolean canWrite() {
		return file.canWrite();
	}

	/**
	 * 判断文件是否存在
	 * 
	 * @return
	 */
	public boolean exists() {
		return file.exists();
	}

	/**
	 * 获取文件
	 * 
	 * @return
	 */
	public File getFile() {
		return this.file;
	}

	/**
	 * 异常抛出程序
	 * 
	 * @param msg
	 * @throws IOException
	 */
	private static void abort(String msg) throws IOException {
		throw new IOException("GppFolder:   " + msg);
	}
}
