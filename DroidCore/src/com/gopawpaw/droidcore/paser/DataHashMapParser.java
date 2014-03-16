/*
 * 文  件   名： DataHashMapParser.java
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

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.struct.AppKeyConstants;
import com.gopawpaw.droidcore.struct.DataHashMap;


/**
 * DataHashMap数据解析类，针对DataHashMap数据结构解析
 * @author LiJinHua
 * @date 2012-3-12
 * @version [Android 1.0.0, 2012-3-12]
 * @description
 */
public class DataHashMapParser extends BaseSaxParser {
	
	/**
	 * Log标签
	 */
	private static final String TAG = DataHashMapParser.class.getSimpleName();

	private Stack<String> mTagStack = new Stack<String>();

	private Stack<DataHashMap<String, Object>> mMapStack = new Stack<DataHashMap<String, Object>>();

	private DataHashMap<String, Object> mMaps;

	private String[] sIgnoreList = new String[] { "Data" };

	/**
	 * 当前存储数据的Map
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
		AppLog.e(TAG, "startDocument");
		// 初始化第一级Maps目录
		mMaps = new DataHashMap<String, Object>();
		mCurrentMaps = mMaps;
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		String tagName = localName == "" ? qName : localName;
		// 忽略标签
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
			AppLog.e(TAG, e.toString());
		} catch (Exception e) {
			AppLog.e(TAG, e.toString());
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
	 * [获取当前map中elmentName元素名称]<BR>
	 * [功能详细描述]
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
		// 忽略标签
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
		AppLog.i(TAG, "endDocument");
		mCurrentMaps.toString();
		int size = mCurrentMaps.size();
		AppLog.i(TAG, "endDocument.size == " + size);

	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return mCurrentMaps;
	}

	
	@Override
	public int checkErrorCode(Object data, String urlId) {
		int state = 0;
		@SuppressWarnings("unchecked")
		Map<String, Object> maps = (Map<String, Object>)data;
		Object obj = maps.get(AppKeyConstants.ERRCODE);
		int errorCode = -1;
		if (obj != null) {
			errorCode = Integer.parseInt(obj.toString());
		}
		
		switch (errorCode) {
		case 0:{
			// 成功返回 000
			state = 0;
		}
			break;
		case 1: { 
			// 业务级错误 001
			state = 1;
			}
			break;
		case 9: {
			// 系统处理出错 009
			state = 9;
			}
			break;
		default: {
			// 默认错误
			state = 11212;
			}
		}
		return state;
	}
}
