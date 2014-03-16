/*
 * 文  件   名： DataHashMap.java
 * 版          权： Copyright GoPawPaw All Rights Reserved.
 * 描          述：自定义Map类
 * 创  建   人： LiJinHua
 * 创建时间： 2012-3-12
 * 
 * 修   改  人：
 * 修改时间：
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 自定义Map类
 * 
 * @author LiJinHua
 * @version [Android 1.0.0, 2012-3-12]
 */
public class DataHashMap<K, V> extends HashMap<K, V> {
	
	private static final long serialVersionUID = -814238145128956406L;
	
	private Map<Object, Object> map;

	public DataHashMap() {

	}

	/**
	 * 根据key值把Map中的list Map转换成List 要获取的LIST元素路径
	 * 例如：要得到debitCardList中Element数组，传入key值为responseBody/debitCardList，
	 * 传入elmentName为Element
	 * 
	 * @param key
	 *            List元素所在的路径
	 * @param elementName
	 *            list元素名称
	 * @param map
	 *            查询数据源
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getListByKey(String key, String elementName) {
		List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
		Object obj = getObjectByKey(key);
		if ("".equals(obj) || obj == null) {
			return null;
		}
		Map<String, Object> maps = (Map<String, Object>) obj;
		int length = maps.size();
		Map<String, Object> tmpMap = null;
		if (length > 0) {

			tmpMap = (Map<String, Object>) maps.get(elementName);
			if (tmpMap != null)
				lists.add(tmpMap);

			for (int i = 1; i < length; ++i) {
				tmpMap = null;
				tmpMap = (Map<String, Object>) maps.get(elementName + i);
				if (tmpMap != null) {
					lists.add(tmpMap);
				}
			}
		}

		return lists;
	}

	/**
	 * [根据Element取Map中的list]<BR>
	 * [功能详细描述]
	 * 
	 * @param maps
	 *            传入的map
	 * @param elementName
	 *            为Element
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String, String>> getListByKey(
			DataHashMap<String, Object> maps, String elementName) {
		List<Map<String, String>> lists = new ArrayList<Map<String, String>>();
		if (maps == null) {
			return null;
		}
		int length = maps.size();
		Map<String, String> tmpMap = null;
		if (length > 0) {

			tmpMap = (Map<String, String>) maps.get(elementName);
			if (tmpMap != null)
				lists.add(tmpMap);

			for (int i = 1; i < length; ++i) {
				tmpMap = null;
				tmpMap = (Map<String, String>) maps.get(elementName + i);
				lists.add(tmpMap);
			}
		}

		return lists;
	}

	/**
	 * 根据key值得到字符串，如为空则返回""
	 * 
	 * @param key
	 * @param map
	 * @return
	 */
	public String getStringBykey(String key) {
		Object object = getObjectByKey(key);
		if (object != null && !"null".equals(object.toString()))
			return object.toString();
		else
			return "";
	}

	/**
	 * 根据key值得到object对象
	 * 
	 * @param key
	 * @param map
	 * @return object对象，或为Map<String,object>或者是string、int等基本类型
	 */
	@SuppressWarnings("unchecked")
	public Object getObjectByKey(String key) {
		try {
			String[] keys = key.split("/");
			for (int i = 0; i < keys.length - 1 && !this.isEmpty(); ++i) {
				if ("".equals(keys[i]))
					continue;
				if (map == null)
					map = (Map<Object, Object>) get(keys[i]);
				else
					map = (Map<Object, Object>) map.get(keys[i]);
			}
			key = keys[keys.length - 1];
			if (map != null)
				return map.get(key);
			else {
				return get(key);
			}
		} catch (Exception e) {
			return null;
		} finally {
			map = null;
		}

	}

}
