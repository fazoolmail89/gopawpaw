/**
 * 
 */
package com.gopawpaw.tool.searchText;

import java.io.IOException;
import java.io.Reader;

/**
 * @version 2010-3-14
 * @author �����
 * 
 */
// ɽկ���LineNumberReader�࣬��ȡ�ı�����ʱ�ɻ�õ�ǰ�Ĵ�������,ʵ����Java�е�LineNumberReader�Ĺ���

class MyLineNumberReader

{

	// �����õ���װ����ģʽ����������ݿɲμ����˵Ĳ��ġ�����ɽկ��Ʒ��α���Ʒ����������װ��ģʽ��

	private Reader fr;

	private int lineNumber = 0; // ��¼��ǰ������

	MyLineNumberReader(Reader fr)

	{

		this.fr = fr;

	}

	/*
	 * 
	 * ͨ��read()����һ��һ���ַ��Ķ�ȡ���������س����оͷ��ض�ȡ��һ���ַ���
	 */

	public String readLine()

	{

		int num = 0;

		StringBuffer sb = new StringBuffer();

		try {

			while ((num = fr.read()) != -1)

			{

				if (num == '\r')

					continue;

				else if (num == '\n')

				{

					lineNumber++; // ��ȡһ�У��кż�1

					return sb.toString(); // ���ض�ȡ��һ���ַ���

				}

				else

				{

					sb.append((char) num);

				}

			}

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			return null;

		}

		// ��ֹ�ı�ĩβû�ӻس����з����Զ�ʧ�ı�����

		if (sb.length() > 0)

		{

			lineNumber++;

			return sb.toString();

		}

		return null;

	}

	// �ر�����������

	public void close()

	{

		try {

			fr.close();

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	// ���õ�ǰ������

	public void setLineNumber(int lineNumber)

	{

		this.lineNumber = lineNumber;

	}

	// ��ȡ��ǰ������

	public int getLineNumber()

	{

		return lineNumber;

	}

}
