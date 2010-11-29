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
 * @author �����
 * 
 */
/*
 * 
 * �����ı����ݵ���
 * 
 * ���������ΪҪ���ҵ�Ŀ¼�Ͳ��ҵ�����
 */

class SearchContent

{

	private File f = null; // Ҫ���ҵ�Ŀ¼����

	private String filename = null; // Ҫ���ҵ�Ŀ¼·��

	private BufferedWriter bw = null;

	private String findtxt = null; // Ҫ���ҵ��ı�����

	private String fileType = null; // Ҫ���ҵ��ļ�����

	private int totalFileCount = 0; // ���������ļ���

	private int findedFileCount = 0; // ���������õ��ļ���

	private int findContentCount = 0; // ��������������Ϣ��Ŀ

	/**
	 * ���캯����
	 * 
	 * @param f
	 *            Ҫ����Ŀ¼�Ķ���
	 * @param findtxt
	 *            Ҫ���ҵĹؼ���
	 * @param fileType
	 *            Ҫ���ҵ��ļ�����
	 */

	SearchContent(String filename, String findtxt, String fileType)

	{

		this.filename = filename;

		this.findtxt = findtxt;

		this.fileType = fileType;

	}

	// ��¶�Ĺ����ӿڣ���ʼ��ָ����Ŀ¼�������ؼ���

	public void startSearchContent()

	{

		try

		{

			bw = new BufferedWriter(

			new FileWriter("log.txt"));

			f = new File(filename);

			// �����ؼ��ֵ�����

			listFile(f);

			// ��ʾ�ļ���ͳ����Ϣ

			 showInfo();

			// �ر��ļ���

			bw.close();

			System.out.println("������ϣ���������ѱ�����log.txt�ļ���");

		}

		catch (Exception e)

		{

			System.out.println("������������");

		}

	}

	/*
	 * 
	 * ͨ���ݹ�����Ŀ¼���������̷����������
	 * 
	 * 1.�����Ŀ¼����ͨ���ݹ��������Ŀ¼�µ��ļ�
	 * 
	 * 2.������ļ��������ж��Ƿ���fileType�����ļ�������ǵĻ��������ļ�����
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

				// �ж��ļ����Ƿ���fileType��β
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
	 * ���ļ��������ƶ������ݣ������漸��
	 * 
	 * 1.ʹ���Զ����ɽկ��LineNumberReader�࣬��ȡ�ļ���ÿһ��
	 * 
	 * 2.
	 */

	private void FindTxt(File f)

	{

		totalFileCount++; // ���������ļ�����1

		boolean flag = false; // ��¼��ǰ�ļ����Ƿ��������ؼ��ֵı�־

		MyLineNumberReader br = null;

		try {

			br = new MyLineNumberReader(

			new FileReader(f));

			String s = null;

			while ((s = br.readLine()) != null)

			{

				// �ı������Ƿ�����ƶ����ַ���

				if (s.contains(findtxt))

				{

					flag = true; // �������ļ��Ĺؼ��֣���־��Ϊ��

					findContentCount++; // �ѵ��Ĺؼ����൱����Ŀ��1

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

		// �����ǰ�ļ����������ؼ��֣�����������������ļ�����1

		if (flag == true)

		{

			findedFileCount++;

		}

		br.close();

	}

	// ���������ͳ����Ϣ

	private void showInfo() throws IOException

	{

		bw.write("        �����ؼ��֣�" + findtxt);

		bw.newLine();

		bw.write("        ��������.java�ļ�����" + totalFileCount);

		bw.newLine();

		bw.write("        �ؼ��ļ�����" + findedFileCount);

		bw.newLine();

		bw.write("        �������Ĺؼ�����Ŀ��" + findContentCount);

		bw.newLine();

	}

}
