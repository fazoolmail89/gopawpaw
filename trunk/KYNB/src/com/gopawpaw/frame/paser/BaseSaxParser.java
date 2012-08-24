/*
 * ��  ��   ���� BaseSaxParser.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-3-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.paser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.gopawpaw.frame.log.APPLog;

/**
 * SAX�������ݽ�������
 * @author LiJinHua
 * @date 2012-3-12
 * @version [Android 1.0.0, 2012-3-12]
 * @description
 */
public abstract class BaseSaxParser extends DefaultHandler {

	private static final String TAG = BaseSaxParser.class.getSimpleName();

	/**
	 * ��Ӧ����������
	 */
	private ByteArrayInputStream byteArrayStream;

	public void parseData(byte[] data) throws OutOfMemoryError,
			ParserConfigurationException, SAXException, IOException {
		APPLog.e(TAG, "parseData");
		
		byteArrayStream = new ByteArrayInputStream(data);
		SAXParserFactory saf = SAXParserFactory.newInstance();
		SAXParser parser = saf.newSAXParser();
		parser.parse(byteArrayStream, this);
		byteArrayStream.close();
	}

	/**
	 * 
	 * [�ı����ݴ���]<BR>
	 * 
	 * 
	 * @param ch
	 *            tag������
	 * @param start
	 *            ȡ�ÿ�ʼ��λ��
	 * @param length
	 *            ���ݳ���
	 */
	public abstract void characters(char[] ch, int start, int length);

	/**
	 * 
	 * [�ı���������]<BR>
	 * 
	 */
	public abstract void endDocument();

	/**
	 * 
	 * [Ԫ�ؽ�������]<BR>
	 * 
	 * 
	 * @param uri
	 *            ���ƿռ�
	 * @param localName
	 *            tag��ǩ
	 * @param qName
	 *            �޶���XML����
	 */
	public abstract void endElement(String uri, String localName, String qName);

	/**
	 * 
	 * [�ı���ʼ����]<BR>
	 * 
	 * 
	 * @throws SAXException
	 *             �κε�SAX�쳣
	 */
	public abstract void startDocument() throws SAXException;

	/**
	 * 
	 * [Ԫ�ؿ�ʼ����]<BR>
	 * 
	 * 
	 * @param uri
	 *            ���ƿռ� URI
	 * @param localName
	 *            �������ƣ�����ǰ׺�������δִ�����ƿռ䴦����Ϊ���ַ���
	 * @param qName
	 *            �޶���������ǰ׺
	 * @param attributes
	 *            ���ӵ�Ԫ���ϵ����ԡ�
	 */
	public abstract void startElement(String uri, String localName,
			String qName, Attributes attributes);
}
