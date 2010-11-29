/**
 * 
 */
package com.gopawpaw.tool.searchText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 2010-3-14
 * @author 李锦华
 * 
 */
/*
 * 
 * 搜索文本内容的类
 * 
 * 输入的内容为要查找的目录和查找的内容
 */

class SearchContent

{

	private File f = null; // 要查找的目录对象

	private String filename = null; // 要查找的目录路径

	private BufferedWriter bw = null;

	private String findtxt = null; // 要查找的文本内容

	private String fileType = null; // 要查找的文件类型

	private int totalFileCount = 0; // 共搜索的文件数

	private int findedFileCount = 0; // 搜索到有用的文件数

	private int findContentCount = 0; // 搜索到的有用信息数目

	/**
	 * 构造函数，
	 * 
	 * @param f
	 *            要查找目录的对象
	 * @param findtxt
	 *            要查找的关键字
	 * @param fileType
	 *            要查找的文件类型
	 */

	SearchContent(String filename, String findtxt, String fileType)

	{

		this.filename = filename;

		this.findtxt = findtxt;

		this.fileType = fileType;

	}

	// 暴露的公共接口，开始在指定的目录中搜索关键字

	public void startSearchContent()

	{

		try

		{

			bw = new BufferedWriter(

			new FileWriter("log.txt"));

			f = new File(filename);

			// 搜索关键字的内容

			listFile(f);

			// 显示文件的统计信息

			 showInfo();

			// 关闭文件流

			bw.close();

			System.out.println("搜索完毕，搜索结果已保存在log.txt文件中");

		}

		catch (Exception e)

		{

			System.out.println("搜索出错！！！");

		}

	}

	/*
	 * 
	 * 通过递归搜索目录，搜索过程分两种情况：
	 * 
	 * 1.如果是目录，则通过递归继续查找目录下的文件
	 * 
	 * 2.如果是文件，则先判断是否是fileType类型文件，如果是的话就搜索文件内容
	 */

	private void listFile(File f)

	{

		File[] files = f.listFiles();

		for (int x = 0; x < files.length; x++)

		{

			if (files[x].isDirectory())

				listFile(files[x]);

			else

			{

				// 判断文件名是否以fileType结尾
System.out.println(this.fileType);
				if (files[x].getName().endsWith(fileType))

				{

					FindTxt(files[x]);

				}

			}

		}

	}

	/*
	 * 
	 * 从文件中搜索制定的内容，分下面几步
	 * 
	 * 1.使用自定义的山寨版LineNumberReader类，读取文件的每一行
	 * 
	 * 2.
	 */

	private void FindTxt(File f)

	{

		totalFileCount++; // 搜索到的文件数加1

		boolean flag = false; // 记录当前文件中是否搜索到关键字的标志

		MyLineNumberReader br = null;

		try {

			br = new MyLineNumberReader(

			new FileReader(f));

			String s = null;

			while ((s = br.readLine()) != null)

			{

				// 文本行中是否包含制定的字符串

				if (s.contains(findtxt))

				{

					flag = true; // 搜索到文件的关键字，标志变为真

					findContentCount++; // 搜到的关键字相当的数目加1

					bw.write(f.getAbsolutePath());

					bw.newLine();

					bw.write("  " + br.getLineNumber() + ":  " + s);

					bw.newLine();

					bw.newLine();

				}

			}

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		// 如果当前文件中搜索到关键字，则把搜索到的有用文件数加1

		if (flag == true)

		{

			findedFileCount++;

		}

		br.close();

	}

	// 输出搜索的统计信息

	private void showInfo() throws IOException

	{

		bw.write("        搜索关键字：" + findtxt);

		bw.newLine();

		bw.write("        共搜索的.java文件数：" + totalFileCount);

		bw.newLine();

		bw.write("        关键文件数：" + findedFileCount);

		bw.newLine();

		bw.write("        搜索到的关键字数目：" + findContentCount);

		bw.newLine();

	}

}
