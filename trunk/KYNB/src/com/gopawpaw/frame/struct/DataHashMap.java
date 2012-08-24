/*
 * ��  ��   ���� DataHashMap.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          �����Զ���Map��
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-3-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * �Զ���Map��
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
	 * ����keyֵ��Map�е�list Mapת����List Ҫ��ȡ��LISTԪ��·��
	 * ���磺Ҫ�õ�debitCardList��Element���飬����keyֵΪresponseBody/debitCardList��
	 * ����elmentNameΪElement
	 * 
	 * @param key
	 *            ListԪ�����ڵ�·��
	 * @param elementName
	 *            listԪ������
	 * @param map
	 *            ��ѯ����Դ
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
	 * [����ElementȡMap�е�list]<BR>
	 * [������ϸ����]
	 * 
	 * @param maps
	 *            �����map
	 * @param elementName
	 *            ΪElement
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
	 * ����keyֵ�õ��ַ�������Ϊ���򷵻�""
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
	 * ����keyֵ�õ�object����
	 * 
	 * @param key
	 * @param map
	 * @return object���󣬻�ΪMap<String,object>������string��int�Ȼ�������
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
