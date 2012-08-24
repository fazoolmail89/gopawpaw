/*
 * ��  ��   ���� DataHashMapParser.java
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

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.gopawpaw.frame.log.APPLog;
import com.gopawpaw.frame.struct.DataHashMap;


/**
 * DataHashMap���ݽ����࣬���DataHashMap���ݽṹ����
 * @author LiJinHua
 * @date 2012-3-12
 * @version [Android 1.0.0, 2012-3-12]
 * @description
 */
public class DataHashMapParser extends BaseSaxParser {
	
	/**
	 * Log��ǩ
	 */
	private static final String TAG = DataHashMapParser.class.getSimpleName();

	private Stack<String> mTagStack = new Stack<String>();

	private Stack<DataHashMap<String, Object>> mMapStack = new Stack<DataHashMap<String, Object>>();

	private DataHashMap<String, Object> mMaps;

	private String[] sIgnoreList = new String[] { "Data" };

	/**
	 * ��ǰ�洢���ݵ�Map
	 */
	private DataHashMap<String, Object> mCurrentMaps;

	private String mStartTagName = "";
	private String mEndTagName = "";
	private String mTagValue = "";

	private int mTagDepth = 0;

	StringBuffer buffer = new StringBuffer();

	public DataHashMap<String, Object> getObjectMap() {
		return mCurrentMaps;
	}

	private boolean dealWitchIgnoreTag(String tagName) {
		boolean isIgnore = false;
		for (String str : sIgnoreList) {
			if (str.equalsIgnoreCase(tagName)) {
				isIgnore = true;
				break;
			}
		}
		return isIgnore;
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		buffer.append(ch, start, length);
	}

	@Override
	public void startDocument() throws SAXException {
		APPLog.e(TAG, "startDocument");
		// ��ʼ����һ��MapsĿ¼
		mMaps = new DataHashMap<String, Object>();
		mCurrentMaps = mMaps;
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		String tagName = localName == "" ? qName : localName;
		// ���Ա�ǩ
		if (dealWitchIgnoreTag(tagName)) {
			return;
		}

		mEndTagName = tagName;
		mTagValue = buffer.toString().trim();
		// GLog.e(TAG, mStartTagName + "==" + mTagValue);
		try {
			String stackTopTag = "";
			if (!mTagStack.empty()) {
				stackTopTag = mTagStack.peek().toString();
			}
			if (stackTopTag.equalsIgnoreCase(mEndTagName)) {
				mTagStack.pop();
				if (mTagDepth == mTagStack.size()) {
					if (mCurrentMaps.containsKey(mEndTagName)) {
						int num = getElementNum(mCurrentMaps, mEndTagName);
						mCurrentMaps.put(mEndTagName + num, mTagValue);
					} else {
						mCurrentMaps.put(mEndTagName, mTagValue);
					}
				}
				if (mTagDepth - 1 == mTagStack.size()) {

					mMaps = mCurrentMaps;
					mCurrentMaps = mMapStack.pop();
					addElementToMap();
					mTagDepth -= 1;
				}

			}
		} catch (EmptyStackException e) {
			APPLog.e(TAG, e.toString());
		} catch (Exception e) {
			APPLog.e(TAG, e.toString());
		}

	}

	private void addElementToMap() {
		if (mCurrentMaps.containsKey(mEndTagName)) {
			int num = getElementNum(mCurrentMaps, mEndTagName);
			mCurrentMaps.put(mEndTagName + num, mMaps);
		} else {
			mCurrentMaps.put(mEndTagName, mMaps);
		}
	}

	/**
	 * 
	 * [��ȡ��ǰmap��elmentNameԪ������]<BR>
	 * [������ϸ����]
	 * 
	 * @param currentMap
	 *            currentMap
	 * @param elementName
	 *            elementName
	 * @return int
	 */
	@SuppressWarnings("unchecked")
	private int getElementNum(DataHashMap<String, Object> currentMap,
			String elementName) {
		HashMap<String, Object> maps = (HashMap<String, Object>) currentMap
				.clone();
		Iterator<Entry<String, Object>> iterator = maps.entrySet().iterator();
		int num = 0;
		String keyName = "";
		while (iterator.hasNext()) {
			Entry<String, Object> entry = iterator.next();
			keyName = entry.getKey();
			if (keyName.startsWith(elementName)) {
				num += 1;
			}
		}
		return num;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) {
		String tagName = localName == "" ? qName : localName;
		// ���Ա�ǩ
		if (dealWitchIgnoreTag(tagName)) {
			return;
		}
		buffer.delete(0, buffer.length());
		mStartTagName = tagName;
		if (mTagDepth + 1 == mTagStack.size()) {

			mMapStack.push(mCurrentMaps);
			mCurrentMaps = new DataHashMap<String, Object>();
			mTagDepth += 1;
		}
		mTagStack.push(mStartTagName);
	}

	@Override
	public void endDocument() {
		APPLog.i(TAG, "endDocument");
		mCurrentMaps.toString();
		int size = mCurrentMaps.size();
		APPLog.i(TAG, "endDocument.size == " + size);

	}

}
