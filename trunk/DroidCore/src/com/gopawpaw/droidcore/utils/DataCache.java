package com.gopawpaw.droidcore.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.gopawpaw.droidcore.struct.DataHashMap;

/**
 * @author CUNGUANTONG
 * @date 2011-12-14
 * @version
 * @description 数据缓存类
 */
public final class DataCache {

	/**
	 * TAG标签
	 */
	static final String TAG = DataCache.class.getSimpleName();
	
	/**
	 * 数据缓存map 
	 */
	static Map<Integer, Object> dataCacheMaps = new HashMap<Integer, Object>();
	
	/**
	 * 请求体缓存map
	 */
	static Map<Integer, String> requestDataMaps = new HashMap<Integer, String>();
	
	/**
	 * 缓存请求解析响应状态码
	 */
	static DataHashMap< Integer, Integer> stateMaps = new DataHashMap<Integer, Integer>();

	/**
	 * int长度枚举
	 */
	final static int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
			99999999, 999999999, Integer.MAX_VALUE};



	/**
	 * 需要缓存数据的ID数组 ID = urlId + connectionId
	 */
	static int[] cacheIds = new int[]{0};

	/**
	 * 根据urlId判断数据是否需要缓存
	 * 
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接id
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
	 * 根据urlId和connectionId获取保存的缓存数据
	 * 
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> getCache(int urlId, int connectionId) {
		return (Map<String, Object>) dataCacheMaps.get(dealUrlId(urlId) 
				+ connectionId);
	}

	/**
	 * 根据urlId和connectionId获取保存缓存数据对应的请求体 用户数据刷新使用
	 * 
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接id
	 * @return
	 */
	public static String getRequestData(int urlId, int connectionId) {
		return requestDataMaps.get(dealUrlId(urlId)  + connectionId);
	}
	
	/**
	 * [获得缓存的对应请求的状态码]<BR>
	 * [功能详细描述]
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接Id
	 * @return 缓存的对应请求的状态码
	 * author:CUNGUANTONG465
	 * editor:CUNGUANTONG465
	 * time:2012-2-13
	 */
	public static int getCacheState(int urlId, int connectionId) {
		return stateMaps.get(dealUrlId(urlId)+connectionId);
	}

	/**
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接id
	 * @param maps 缓存请求体
	 * @param data 缓存数据
	 * @param state  请求响应状态码
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
	 * 根据urlId和connectionId删除缓存数据
	 * 
	 * @param urlId 请求urlId
	 * @param connectionId 请求连接id
	 */
	public static void clearCacheById(int urlId, int connectionId) {
		dataCacheMaps.remove(dealUrlId(urlId) + connectionId);
		requestDataMaps.remove(dealUrlId(urlId) + connectionId);
	}

	/**
	 * 删除所有缓存数据
	 */
	public static void clearAll() {
		dataCacheMaps.clear();
		requestDataMaps.clear();
	}

	/**
	 * [对自动生成的请求UrlId进行处理]<BR>
	 * [功能详细描述]
	 * @param urlId 请求id
	 * @return 处理后的urlId
	 * author:CUNGUANTONG465
	 * editor:CUNGUANTONG465
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
	 * [获得Int值长度位数]<BR>
	 * [功能详细描述]
	 * @param x int值
	 * @return 长度
	 * author:CUNGUANTONG465
	 * editor:CUNGUANTONG465
	 * time:2012-2-4
	 */
	static int sizeOfInt(int x) {
		for (int i = 0;; i++)
			if (x <= sizeTable[i])
				return i + 1;
	}

}
