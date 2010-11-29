/**
 * 
 */
package com.gopawpaw.fileencrypt;


import java.io.*;

/**
 * @version 2010-1-1
 * @author 李锦华
 */
public class FileCopy {
	public static void main(String[] args) {
//		if (args.length != 2) // 检测程序是否有两个参数
//			System.err
//					.println("Usage:   java   FileCopy   <source>   <destination>");
//		else {
//			try {
//				copy(args[0], args[1]);
//			} catch (IOException e) {
//				System.err.println(e.getMessage());
//			}
//		}
		String oldfolder = "E:\\wwe\\新建 文本文档.txt";
		String newfolder = "E:\\wwe2\\新建 文本文档.txt";
		
		try {
			copy(oldfolder,newfolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copy(String from_name, String to_name)
			throws IOException {
		File from_file = new File(from_name); // 获取file对象
		File to_file = new File(to_name);

		if (!from_file.exists()) // 确定原文件是否存在
			abort("no   such   source   file:   " + from_name);
		if (!from_file.isFile()) // 确定是否是一个文件
			abort("can't   copy   directory:   " + from_name);
		if (!from_file.canRead()) // 确定文件是否可读
			abort("source   file   is   unreadable:   " + from_name);

		if (to_file.isDirectory()) // 如果目标是目录，将原文件名做为目标文件名
			to_file = new File(to_file, from_file.getName()); // 既将该目录的名称用做目标文件的名称

		if (to_file.exists()) {
			if (!to_file.canWrite()) // 如果目标存在，确定是否可写
				abort("destination   file   is   unwriteable:   " + to_name);
			System.out.print("Overwrite   existing   file   "
					+ to_file.getName() + "?(Y/N):"); // 如果可写，确定是否可以覆盖
			System.out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in)); // 获取用户响应
			String response = in.readLine();
			if (!response.equals("Y") && !response.equals("y")) // 如果是yes，放弃复制
				abort("existing   file   was   not   overwritten.");
		} else { // 如果文件不存在，检测目录是否存在，是否可写
			String parent = to_file.getParent(); // 目标目录
			if (parent == null) // 如果getParent返回null，则目录是当前目录
				parent = System.getProperty("user.dir");
			File dir = new File(parent); // 并将目录转换成文件
			if (!dir.exists())
				abort("destination   directory   doesn't   exist:   " + parent);
			if (dir.isFile())
				abort("destination   is   not   a   directory:   " + parent);
			if (!dir.canWrite())
				abort("destination   directory   is   unwriteable:   " + parent);
		}
		// 到此说明一切正常
		FileInputStream from = null; // 置源流
		FileOutputStream to = null; // 置目标流
		try {
			from = new FileInputStream(from_file); // 创建输入流
			to = new FileOutputStream(to_file); // 创建输出流
			byte[] buffer = new byte[4096]; // 保存文件内容到buffer
			int bytes_read; // 缓冲区大小
			while ((bytes_read = from.read(buffer)) != -1)
				// 读直到文件末尾
				to.write(buffer, 0, bytes_read); // 写入buffer
		} finally { // 关闭流（永远不要忘记）
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

	private static void abort(String msg) throws IOException { // 异常抛出的简单程序
		throw new IOException("FileCopy:   " + msg);
	}
}

