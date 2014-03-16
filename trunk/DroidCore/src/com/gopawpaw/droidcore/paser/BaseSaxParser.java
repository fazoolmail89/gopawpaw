/*
 * 文  件   名： BaseSaxParser.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：[该类的简要描述]
 * 创  建   人： LiJinHua
 * 创建时间： 2012-3-12
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.paser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * SAX数据数据解析基类
 * @author LiJinHua
 * @date 2012-3-12
 * @version [Android 1.0.0, 2012-3-12]
 * @description
 */
public abstract class BaseSaxParser extends DefaultHandler implements ParserInterface{

	private static final String TAG = BaseSaxParser.class.getSimpleName();

	/**
	 * 相应报文输入流
	 */
	private ByteArrayInputStream byteArrayStream;

	public void actionParse(byte[] data){
		AppLog.e(TAG, "parseData");
		byteArrayStream = new ByteArrayInputStream(data);
		SAXParserFactory saf = SAXParserFactory.newInstance();
		SAXParser parser;
		try {
			parser = saf.newSAXParser();
			parser.parse(byteArrayStream, this);
			byteArrayStream.close();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * [文本内容处理]<BR>
	 * 
	 * 
	 * @param ch
	 *            tag间内容
	 * @param start
	 *            取得开始的位置
	 * @param length
	 *            内容长度
	 */
	public abstract void characters(char[] ch, int start, int length);

	/**
	 * 
	 * [文本结束处理]<BR>
	 * 
	 */
	public abstract void endDocument();

	/**
	 * 
	 * [元素结束处理]<BR>
	 * 
	 * 
	 * @param uri
	 *            名称空间
	 * @param localName
	 *            tag标签
	 * @param qName
	 *            限定的XML名称
	 */
	public abstract void endElement(String uri, String localName, String qName);

	/**
	 * 
	 * [文本开始处理]<BR>
	 * 
	 * 
	 * @throws SAXException
	 *             任何的SAX异常
	 */
	public abstract void startDocument() throws SAXException;

	/**
	 * 
	 * [元素开始处理]<BR>
	 * 
	 * 
	 * @param uri
	 *            名称空间 URI
	 * @param localName
	 *            本地名称（不带前缀），如果未执行名称空间处理，则为空字符串
	 * @param qName
	 *            限定名（带有前缀
	 * @param attributes
	 *            连接到元素上的属性。
	 */
	public abstract void startElement(String uri, String localName,
			String qName, Attributes attributes);
}
