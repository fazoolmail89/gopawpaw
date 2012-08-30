/*
 * ��  ��   ���� HttpActionDataCache.java
 * ��          Ȩ�� Copyright GoPawPaw All Rights Reserved.
 * ��          ����[����ļ�Ҫ����]
 * ��  ��   �ˣ� LiJinHua
 * ����ʱ�䣺 2012-4-12
 * 
 * ��   ��  �ˣ�
 * �޸�ʱ�䣺
 * �޸����ݣ�[�޸�����]
 */
package com.gopawpaw.frame.http.action;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.gopawpaw.frame.http.URLResource;
import com.gopawpaw.frame.struct.DataHashMap;

/**
 * @author LiJinHua
 * @date 2012-4-12
 * @version [Android 1.0.0, 2012-4-12]
 * @description
 */
public class HttpActionDataCache {

	
	/**
	 * ���ݻ���map 
	 */
	private static Map<Integer, Object> dataCacheMaps = new HashMap<Integer, Object>();
	
	/**
	 * �����建��map
	 */
	private static Map<Integer, String> requestDataMaps = new HashMap<Integer, String>();
	
	/**
	 * �������������Ӧ״̬��
	 */
	private static DataHashMap< Integer, Integer> stateMaps = new DataHashMap<Integer, Integer>();

	/**
	 * int����ö��
	 */
	private final static int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
			99999999, 999999999, Integer.MAX_VALUE};

	/**
	 * ��Ҫ�������ݵ�ID���� ID = urlId + connectionId
	 */
	private static int[] cacheIds = new int[]{URLResource.URL_PROCONFIG};

	/**
	 * ����urlId�ж������Ƿ���Ҫ����
	 * 
	 * @param urlId ����urlId
	 * @param connectionId ��������id
	 * @return
	 */
	private static boolean isCache(int urlId, int connectionId) {
		boolean isCache = false;
		for (int id : cacheIds) {
			if (id == urlId) {
				isCache = true;
				break;
			}
		}
		return isCache;
	}

	/**
	 * ����urlId��connectionId��ȡ����Ļ�������
	 * 
	 * @param urlId ����urlId
	 * @param connectionId ��������id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> getCache(int urlId, int connectionId) {
		return (Map<String, Object>) dataCacheMaps.get(dealUrlId(urlId) 
				+ connectionId);
	}

	/**
	 * ����urlId��connectionId��ȡ���滺�����ݶ�Ӧ�������� �û�����ˢ��ʹ��
	 * 
	 * @param urlId ����urlId
	 * @param connectionId ��������id
	 * @return
	 */
	public static String getRequestData(int urlId, int connectionId) {
		return requestDataMaps.get(dealUrlId(urlId)  + connectionId);
	}
	
	/**
	 * [��û���Ķ�Ӧ�����״̬��]<BR>
	 * [������ϸ����]
	 * @param urlId ����urlId
	 * @param connectionId ��������Id
	 * @return ����Ķ�Ӧ�����״̬��
	 * time:2012-2-13
	 */
	public static int getCacheState(int urlId, int connectionId) {
		return stateMaps.get(dealUrlId(urlId)+connectionId);
	}

	/**
	 * @param urlId ����urlId
	 * @param connectionId ��������id
	 * @param maps ����������
	 * @param data ��������
	 * @param state  ������Ӧ״̬��
	 */
	public static void saveToCache(int urlId, int connectionId,
			Map<String, Object> maps, String data, int state) {
		if (isCache(urlId, connectionId)) {
			dataCacheMaps.put(dealUrlId(urlId)  + connectionId, maps);
			requestDataMaps.put(dealUrlId(urlId)  + connectionId, data);
			stateMaps.put(dealUrlId(urlId) + connectionId, state);
		}
	}

	/**
	 * ����urlId��connectionIdɾ����������
	 * 
	 * @param urlId ����urlId
	 * @param connectionId ��������id
	 */
	public static void clearCacheById(int urlId, int connectionId) {
		dataCacheMaps.remove(dealUrlId(urlId) + connectionId);
		requestDataMaps.remove(dealUrlId(urlId) + connectionId);
		stateMaps.remove(dealUrlId(urlId) + connectionId);
	}

	/**
	 * ɾ�����л�������
	 */
	public static void clearAll() {
		dataCacheMaps.clear();
		requestDataMaps.clear();
		stateMaps.clear();
	}

	/**
	 * [���Զ����ɵ�����UrlId���д���]<BR>
	 * [������ϸ����]
	 * @param urlId ����id
	 * @return ������urlId
	 * time:2012-2-4
	 */
	private static int dealUrlId(int urlId) {
		int mode = 10000000;
		int afterdeal = 0;
		try {		
			int length = sizeOfInt(urlId);			
			DecimalFormat format = new DecimalFormat("000");			
			mode = Integer.valueOf(format.format(Math.pow(10, length - 3)));			
			afterdeal = urlId % mode*100;
		} catch (Exception e) {
			// TODO: handle exception
			afterdeal = urlId % mode * 100;
		}
		return afterdeal;
	}

	/**
	 * [���Intֵ����λ��]<BR>
	 * [������ϸ����]
	 * @param x intֵ
	 * @return ����
	 * time:2012-2-4
	 */
	static int sizeOfInt(int x) {
		for (int i = 0;; i++)
			if (x <= sizeTable[i])
				return i + 1;
	}

}

