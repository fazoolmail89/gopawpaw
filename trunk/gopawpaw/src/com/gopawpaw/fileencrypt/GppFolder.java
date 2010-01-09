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
 * @author �����
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
	 * ��ʼ��
	 */
	private void initialize() {
		this.file = new File(this.folderPath);
	}

	/**
	 * �ļ��и���
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
		// // ȷ��ԭ�ļ��Ƿ����
		// abort("no   such   source   file:   " + fromPath);
		// }

		// if (!fromFile.isDirectory()) {
		// // ȷ���Ƿ���һ��Ŀ¼
		// abort("can't   copy   directory:   " + fromPath);
		// }

		if (!toFile.exists()) {
			// Ŀ��Ŀ¼�������򴴽�
			toFile.getFile().mkdirs();
		}

		// �ļ����б�
		String[] filelist = fromFile.getFile().list();

		int filelength = filelist.length;

		for (int i = 0; i < filelength; i++) {
			/*
			 * ����Ŀ¼����
			 */
			// ��·��
			String fromsonpath = null;
			String tosonpath = null;

			/**
			 * ����������
			 */
			// if (fromPath.endsWith(File.separator)) {
			// fromsonpath = fromPath + filelist[i];
			// tosonpath = toPath + filelist[i];
			// } else {
			fromsonpath = fromPath + File.separator + filelist[i];
			tosonpath = toPath + File.separator + filelist[i];
			// }

			// ���ļ�
			File sonfile = new File(fromsonpath);

			if (sonfile.isDirectory()) {
				/*
				 * ��Ŀ¼����
				 */
				GppFolder.copyFolder(fromsonpath, tosonpath);
			}

			if (sonfile.isFile()) {
				/*
				 * ���ļ�����
				 */
				GppFolder.copyFile(fromsonpath, tosonpath);
			}
		}

		return true;
	}

	/**
	 * �����ļ�
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
			// ȷ��ԭ�ļ��Ƿ����
			abort("no   such   source   file:   " + fromPath);
		}

		if (!fromFile.isFile()) {
			// ȷ���Ƿ���һ���ļ�
			abort("can't   copy   file:   " + fromPath);
		}

		if (!fromFile.canRead()) {
			// ȷ���ļ��Ƿ�ɶ�
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
	 * ɾ���ļ��У��������ļ��У�
	 * 
	 * @param folderPath
	 * @return
	 */
	public static boolean delFolder(String folderPath) {
		try {
			delAllFile(folderPath); // ɾ����������������
			String filePath = folderPath;
			filePath = filePath.toString();
			java.io.File myFilePath = new java.io.File(filePath);
			myFilePath.delete(); // ɾ�����ļ���

		} catch (Exception e) {
			System.out.println("ɾ���ļ��в�������");
			e.printStackTrace();

		}
		return true;
	}

	/**
	 * ɾ���ļ��У����������ļ��У�
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
				delAllFile(path + "/" + tempList[i]);// ��ɾ���ļ���������ļ�
				delFolder(path + "/" + tempList[i]);// ��ɾ�����ļ���
			}
		}
		return true;
	}

	/**
	 * �ж��Ƿ�Ϊ�ļ�
	 * 
	 * @return
	 */
	public boolean isFile() {

		return file.isFile();
	}

	/**
	 * �ж��Ƿ�ΪĿ¼
	 * 
	 * @return
	 */
	public boolean isDirectory() {

		return file.isDirectory();
	}

	/**
	 * �ж��ļ��Ƿ�ɶ�
	 * 
	 * @return
	 */
	public boolean canRead() {
		return file.canRead();
	}

	/**
	 * �ж��ļ��Ƿ��д
	 * 
	 * @return
	 */
	public boolean canWrite() {
		return file.canWrite();
	}

	/**
	 * �ж��ļ��Ƿ����
	 * 
	 * @return
	 */
	public boolean exists() {
		return file.exists();
	}

	/**
	 * ��ȡ�ļ�
	 * 
	 * @return
	 */
	public File getFile() {
		return this.file;
	}

	/**
	 * �쳣�׳�����
	 * 
	 * @param msg
	 * @throws IOException
	 */
	private static void abort(String msg) throws IOException {
		throw new IOException("GppFolder:   " + msg);
	}
}
