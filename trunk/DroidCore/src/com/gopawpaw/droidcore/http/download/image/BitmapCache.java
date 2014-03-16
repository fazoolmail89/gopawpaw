package com.gopawpaw.droidcore.http.download.image;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Hashtable;

import android.graphics.Bitmap;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * [图片缓存器]<BR>
 * 
 * @author Devin.Hu
 * @version [Android IGIRL C01, 2012-5-14]
 */
public class BitmapCache {
	/**
	 * Log标签
	 */
	private static final String TAG = BitmapCache.class.getSimpleName();
	
	/** 图片缓存器对象 **/
	private static BitmapCache cache;
	/** 用于Chche内容的存储 */
	private Hashtable<String, MySoftRef> hashRefs;
	/** 垃圾Reference的队列（所引用的对象已经被回收，则将该引用存入队列中） */
	private ReferenceQueue<Bitmap> q;

	/**
	 * 继承SoftReference，使得每一个实例都具有可识别的标识。
	 */
	private class MySoftRef extends SoftReference<Bitmap> {
		
		private String _key = "0";

		public MySoftRef(Bitmap bmp, ReferenceQueue<Bitmap> q, String key) {
			super(bmp, q);
			_key = key;
		}
	}

	private BitmapCache() {
		hashRefs = new Hashtable<String, MySoftRef>();
		q = new ReferenceQueue<Bitmap>();
	}

	/**
	 * 取得缓存器实例
	 */
	public static BitmapCache getInstance() {
		if (cache == null) {
			cache = new BitmapCache();
		}
		return cache;
	}

	/**
	 * 以软引用的方式对一个Bitmap对象的实例进行引用并保存该引用
	 */
	public void addCacheBitmap(Bitmap bmp, String key) {
		cleanCache();
		MySoftRef ref = new MySoftRef(bmp, q, key);
		hashRefs.put(key, ref);
	}
	
	/**
	 * 依据所指定的drawable下的图片资源ID号（可以根据自己的需要从网络或本地path下获取），重新获取相应Bitmap对象的实例
	 */
	public Bitmap getBitmap(String resId) {
		Bitmap bmp = null;
		// 缓存中是否有该Bitmap实例的软引用，如果有，从软引用中取得。
		if (hashRefs.containsKey(resId)) {
			MySoftRef ref = (MySoftRef) hashRefs.get(resId);
			bmp = (Bitmap) ref.get();
		}
		return bmp;
	}

	/**
	 * 清除Cache内的内容
	 */
	private void cleanCache() {
		MySoftRef ref = null;
		while ((ref = (MySoftRef) q.poll()) != null) {
			hashRefs.remove(ref._key);
			AppLog.e(TAG, "图片已被回收："+ref._key);
		}
	}

	/**
	 * 清除Cache内的全部内容
	 */
	public void clearCache() {
		cleanCache();
		hashRefs.clear();
		System.gc();
		System.runFinalization();
	}
}
