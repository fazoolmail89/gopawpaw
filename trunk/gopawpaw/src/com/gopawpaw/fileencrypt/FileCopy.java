/**
 * 
 */
package com.gopawpaw.fileencrypt;


import java.io.*;

/**
 * @version 2010-1-1
 * @author �����
 */
public class FileCopy {
	public static void main(String[] args) {
//		if (args.length != 2) // �������Ƿ�����������
//			System.err
//					.println("Usage:   java   FileCopy   <source>   <destination>");
//		else {
//			try {
//				copy(args[0], args[1]);
//			} catch (IOException e) {
//				System.err.println(e.getMessage());
//			}
//		}
		String oldfolder = "E:\\wwe\\�½� �ı��ĵ�.txt";
		String newfolder = "E:\\wwe2\\�½� �ı��ĵ�.txt";
		
		try {
			copy(oldfolder,newfolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copy(String from_name, String to_name)
			throws IOException {
		File from_file = new File(from_name); // ��ȡfile����
		File to_file = new File(to_name);

		if (!from_file.exists()) // ȷ��ԭ�ļ��Ƿ����
			abort("no   such   source   file:   " + from_name);
		if (!from_file.isFile()) // ȷ���Ƿ���һ���ļ�
			abort("can't   copy   directory:   " + from_name);
		if (!from_file.canRead()) // ȷ���ļ��Ƿ�ɶ�
			abort("source   file   is   unreadable:   " + from_name);

		if (to_file.isDirectory()) // ���Ŀ����Ŀ¼����ԭ�ļ�����ΪĿ���ļ���
			to_file = new File(to_file, from_file.getName()); // �Ƚ���Ŀ¼����������Ŀ���ļ�������

		if (to_file.exists()) {
			if (!to_file.canWrite()) // ���Ŀ����ڣ�ȷ���Ƿ��д
				abort("destination   file   is   unwriteable:   " + to_name);
			System.out.print("Overwrite   existing   file   "
					+ to_file.getName() + "?(Y/N):"); // �����д��ȷ���Ƿ���Ը���
			System.out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in)); // ��ȡ�û���Ӧ
			String response = in.readLine();
			if (!response.equals("Y") && !response.equals("y")) // �����yes����������
				abort("existing   file   was   not   overwritten.");
		} else { // ����ļ������ڣ����Ŀ¼�Ƿ���ڣ��Ƿ��д
			String parent = to_file.getParent(); // Ŀ��Ŀ¼
			if (parent == null) // ���getParent����null����Ŀ¼�ǵ�ǰĿ¼
				parent = System.getProperty("user.dir");
			File dir = new File(parent); // ����Ŀ¼ת�����ļ�
			if (!dir.exists())
				abort("destination   directory   doesn't   exist:   " + parent);
			if (dir.isFile())
				abort("destination   is   not   a   directory:   " + parent);
			if (!dir.canWrite())
				abort("destination   directory   is   unwriteable:   " + parent);
		}
		// ����˵��һ������
		FileInputStream from = null; // ��Դ��
		FileOutputStream to = null; // ��Ŀ����
		try {
			from = new FileInputStream(from_file); // ����������
			to = new FileOutputStream(to_file); // ���������
			byte[] buffer = new byte[4096]; // �����ļ����ݵ�buffer
			int bytes_read; // ��������С
			while ((bytes_read = from.read(buffer)) != -1)
				// ��ֱ���ļ�ĩβ
				to.write(buffer, 0, bytes_read); // д��buffer
		} finally { // �ر�������Զ��Ҫ���ǣ�
			if (from != null)
				try {
					from.close();
				} catch (IOException e) {
					;
				}
			if (to != null)
				try {
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}

	private static void abort(String msg) throws IOException { // �쳣�׳��ļ򵥳���
		throw new IOException("FileCopy:   " + msg);
	}
}

