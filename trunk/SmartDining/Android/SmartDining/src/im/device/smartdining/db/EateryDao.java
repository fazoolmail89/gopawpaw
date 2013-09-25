package im.device.smartdining.db;

import im.device.smartdining.JsonKey;
import im.device.smartdining.db.DataBaseDefinition.Eatery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


/**
 * 餐馆数据库访问类
 * @author LiJinHua
 * @version [Android 1.0.0, 2013-1-12]
 */
public class EateryDao extends BaseDBHelper {
	private static final String TAG = EateryDao.class.getSimpleName();

	static final String[] eateryColumns = {
		Eatery._ID,
		Eatery.EATERY_ID,
		Eatery.EATERY_NAME,
		Eatery.EATERY_IMG,
		Eatery.EATERY_TIMG,
		Eatery.EATERY_MINIMUM,
		Eatery.EATERY_FREIGHT,
		Eatery.EATERY_HOURS,
		Eatery.EATERY_LIKE,
		Eatery.EATERY_ADDRESS,
		Eatery.EATERY_AREA,
		Eatery.EATERY_LONGITUDE,
		Eatery.EATERY_LATITUDE,
		Eatery.EATERY_TEMP,
		Eatery.EATERY_TEL1,
		Eatery.EATERY_TEL2,
		Eatery.EATERY_CALL
    };
	
	public EateryDao(Context context) {
		super(context);
	}
	
	/**
	 * 拿到数据库返回对象的实例
	 * @param ctx
	 * @return
	 */
	public static EateryDao getInstance(Context ctx) {
		return new EateryDao(ctx);
	}
	
	/**
	 * 增加一条记录
	 * @param bean
	 * @return
	 */
	public boolean save(HashMap<String,Object> data){
		SQLiteDatabase db = getDatabase();
		try {
			
			ContentValues cv = new ContentValues();
			cv.put(Eatery.EATERY_ID, ""+data.get(Eatery.EATERY_ID));
			cv.put(Eatery.EATERY_NAME, ""+data.get(Eatery.EATERY_NAME));
			cv.put(Eatery.EATERY_IMG, ""+data.get(Eatery.EATERY_IMG));
			cv.put(Eatery.EATERY_TIMG, ""+data.get(Eatery.EATERY_TIMG));
			cv.put(Eatery.EATERY_MINIMUM, ""+data.get(Eatery.EATERY_MINIMUM));
			cv.put(Eatery.EATERY_FREIGHT, ""+data.get(Eatery.EATERY_FREIGHT));
			cv.put(Eatery.EATERY_HOURS, ""+data.get(Eatery.EATERY_HOURS));
			cv.put(Eatery.EATERY_LIKE, ""+data.get(Eatery.EATERY_LIKE));
			cv.put(Eatery.EATERY_ADDRESS, ""+data.get(Eatery.EATERY_ADDRESS));
			cv.put(Eatery.EATERY_AREA, ""+data.get(Eatery.EATERY_AREA));
			cv.put(Eatery.EATERY_LONGITUDE, ""+data.get(Eatery.EATERY_LONGITUDE));
			cv.put(Eatery.EATERY_LATITUDE, ""+data.get(Eatery.EATERY_LATITUDE));
			cv.put(Eatery.EATERY_TEMP, ""+data.get(Eatery.EATERY_TEMP));
			cv.put(Eatery.EATERY_TEL1, ""+data.get(Eatery.EATERY_TEL1));
			cv.put(Eatery.EATERY_TEL2, ""+data.get(Eatery.EATERY_TEL2));
			cv.put(Eatery.EATERY_CALL, ""+data.get(Eatery.EATERY_CALL));
			
			db.insert(Eatery.TABLE_NAME, null, cv);
			
		} catch (Exception e) {
			return false;
		} finally {
			db.close();
		}
		return true;
	}
	
	/**
	 * 更新一条记录
	 * @param bean
	 * @return
	 */
	public boolean update(HashMap<String,Object> data){
		SQLiteDatabase db = getDatabase();
		try {
			ContentValues cv = new ContentValues();
			cv.put(Eatery.EATERY_NAME, ""+data.get(JsonKey.NAME));
			cv.put(Eatery.EATERY_IMG, ""+data.get(JsonKey.IMG));
			cv.put(Eatery.EATERY_TIMG, ""+data.get(JsonKey.TIMG));
			cv.put(Eatery.EATERY_MINIMUM, ""+data.get(JsonKey.MINIMUM));
			cv.put(Eatery.EATERY_FREIGHT, ""+data.get(JsonKey.FREIGHT));
			cv.put(Eatery.EATERY_HOURS, ""+data.get(JsonKey.HOURS));
			cv.put(Eatery.EATERY_LIKE, ""+data.get(JsonKey.LIKENUM));
			cv.put(Eatery.EATERY_ADDRESS, ""+data.get(JsonKey.ADDRESS));
			cv.put(Eatery.EATERY_AREA, ""+data.get(JsonKey.AREA));
			cv.put(Eatery.EATERY_LONGITUDE, ""+data.get(JsonKey.LONGITUDE));
			cv.put(Eatery.EATERY_LATITUDE, ""+data.get(JsonKey.LATITUDE));
			cv.put(Eatery.EATERY_TEMP, ""+data.get(JsonKey.TEMP));
			cv.put(Eatery.EATERY_TEL1, ""+data.get(JsonKey.TEL1));
			cv.put(Eatery.EATERY_TEL2, ""+data.get(JsonKey.TEL2));
			cv.put(Eatery.EATERY_CALL, ""+data.get(JsonKey.CALL));
			
			String selection = Eatery.EATERY_ID + " = " + data.get(JsonKey.ID);
			db.update(Eatery.TABLE_NAME, cv, selection, null);
			
		} catch (Exception e) {
			return false;
		} finally {
			db.close();
		}
		return true;
	}
	
	/**
	 * 查询所有的记录
	 * @return
	 */
	public List<HashMap<String,Object>> getAllEatery(boolean isJsonKey) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	cursor = database.query(Eatery.TABLE_NAME, eateryColumns, null, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            
            List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
            for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            	HashMap<String,Object> data = getDataFromCursor(cursor,isJsonKey);
                list.add(data);
            }
            
            return list;
        } finally {
            database.close();
            if (cursor != null) {
                cursor.close();
            }
        }
	}
	
	/**
	 * 查询所有的历史记录
	 * @return
	 */
	public HashMap<String,Object> getDataByName(String name,boolean isJsonKey) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = Eatery.EATERY_NAME + " like " + name;
        	cursor = database.query(Eatery.TABLE_NAME, eateryColumns, selection, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            cursor.moveToFirst();
            if( !cursor.isAfterLast() ) {
            	HashMap<String,Object> data = getDataFromCursor(cursor,isJsonKey);
            	return data;
            }
            
            return null;
        } finally {
            database.close();
            if (cursor != null) {
                cursor.close();
            }
        }
	}
	
	/**
	 * 查询所有的历史记录
	 * @return
	 */
	public HashMap<String,Object> getDataById(String id,boolean isJsonKey) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = Eatery.EATERY_ID + " = " + id;
        	cursor = database.query(Eatery.TABLE_NAME, eateryColumns, selection, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            cursor.moveToFirst();
            if( !cursor.isAfterLast() ) {
            	HashMap<String,Object> data = getDataFromCursor(cursor,isJsonKey);
            	return data;
            }
            
            return null;
        } finally {
            database.close();
            if (cursor != null) {
                cursor.close();
            }
        }
	}
	
	/**
	 * @param name
	 * @return
	 */
	public boolean hasName(String name) {
		if (getDataByName(name,false) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 从Cursor中返回一个二维码历史记录的实例对象
	 * @author EX-LIJINHUA001
	 * @date 2013-1-18
	 * @param cursor
	 * @param isJsonKey
	 * @return
	 */
	private static HashMap<String,Object> getDataFromCursor(Cursor cursor,boolean isJsonKey) {
		int id = cursor.getInt(cursor.getColumnIndexOrThrow(Eatery._ID));
		String eatery_id = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_ID));
		String eatery_name = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_NAME));
		String eatery_img = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_IMG));
		String eatery_timg = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_TIMG));
		String eatery_minimum = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_MINIMUM));
		String eatery_freight = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_FREIGHT));
		String eatery_hours = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_HOURS));
		String eatery_like = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_LIKE));
		String eatery_address = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_ADDRESS));
		String eatery_area = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_AREA));
		double eatery_longitude = cursor.getDouble(cursor.getColumnIndexOrThrow(Eatery.EATERY_LONGITUDE));
		double eatery_latitude = cursor.getDouble(cursor.getColumnIndexOrThrow(Eatery.EATERY_LATITUDE));
		String eatery_temp = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_TEMP));
		String eatery_tel1 = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_TEL1));
		String eatery_tel2 = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_TEL2));
		String eatery_call = cursor.getString(cursor.getColumnIndexOrThrow(Eatery.EATERY_CALL));
		
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		if(isJsonKey){
			//封装成网页返回的json key
			hashMap.put(Eatery._ID, ""+id);
			hashMap.put(JsonKey.ID, eatery_id);
			hashMap.put(JsonKey.NAME, eatery_name);
			hashMap.put(JsonKey.IMG, eatery_img);
			hashMap.put(JsonKey.TIMG, eatery_timg);
			hashMap.put(JsonKey.MINIMUM, eatery_minimum);
			hashMap.put(JsonKey.FREIGHT, eatery_freight);
			hashMap.put(JsonKey.HOURS, eatery_hours);
			hashMap.put(JsonKey.LIKENUM, eatery_like);
			hashMap.put(JsonKey.ADDRESS, eatery_address);
			hashMap.put(JsonKey.AREA, eatery_area);
			hashMap.put(JsonKey.LONGITUDE, ""+eatery_longitude);
			hashMap.put(JsonKey.LATITUDE, ""+eatery_latitude);
			hashMap.put(JsonKey.TEMP, eatery_temp);
			hashMap.put(JsonKey.TEL1, eatery_tel1);
			hashMap.put(JsonKey.TEL2, eatery_tel2);
			hashMap.put(JsonKey.CALL, eatery_call);
		}else{
			//封装成数据库字段的key
			hashMap.put(Eatery._ID, ""+id);
			hashMap.put(Eatery.EATERY_ID, eatery_id);
			hashMap.put(Eatery.EATERY_NAME, eatery_name);
			hashMap.put(Eatery.EATERY_IMG, eatery_img);
			hashMap.put(Eatery.EATERY_TIMG, eatery_timg);
			hashMap.put(Eatery.EATERY_MINIMUM, eatery_minimum);
			hashMap.put(Eatery.EATERY_FREIGHT, eatery_freight);
			hashMap.put(Eatery.EATERY_HOURS, eatery_hours);
			hashMap.put(Eatery.EATERY_LIKE, eatery_like);
			hashMap.put(Eatery.EATERY_ADDRESS, eatery_address);
			hashMap.put(Eatery.EATERY_AREA, eatery_area);
			hashMap.put(Eatery.EATERY_LONGITUDE, ""+eatery_longitude);
			hashMap.put(Eatery.EATERY_LATITUDE, ""+eatery_latitude);
			hashMap.put(Eatery.EATERY_TEMP, eatery_temp);
			hashMap.put(Eatery.EATERY_TEL1, eatery_tel1);
			hashMap.put(Eatery.EATERY_TEL2, eatery_tel2);
			hashMap.put(Eatery.EATERY_CALL, eatery_call);
		}
		
		return  hashMap;
	}
	
	
	/**
	 * 删除指定的记录
	 * @param id
	 * @return
	 */
	public boolean delete(int id) {
		SQLiteDatabase db = getDatabase();
		try {
			int result = db.delete(Eatery.TABLE_NAME, Eatery._ID + "=" + id, null);
			if (result !=0 ) {
				return true;
			}
		} finally {
			db.close();
		}
		return false;
	}
	
	/**
	 * 清空记录
	 */
	public void clearAll() {
		SQLiteDatabase db = getDatabase();
		db.execSQL("delete from "+Eatery.TABLE_NAME);
	}
	
	private SQLiteDatabase getDatabase() {
		return getWritableDatabase();
	}
	
	/**
	 * 增加列表数据记录
	 * @param bean
	 * @return
	 */
	public boolean save(List<HashMap<String,Object>> list){
		if(list == null || list.size() == 0){
			return false;
		}
		SQLiteDatabase db = getDatabase();
		Cursor cursor = null;
		try {
			for(HashMap<String,Object> data : list){
				
				//将每一条餐馆数据存入餐馆数据表中，如果存在，则更新=====================start
				String eatery_id = ""+data.get(JsonKey.ID);
				ContentValues cv = new ContentValues();
				cv.put(Eatery.EATERY_ID, eatery_id);
				cv.put(Eatery.EATERY_NAME, ""+data.get(JsonKey.NAME));
				cv.put(Eatery.EATERY_IMG, ""+data.get(JsonKey.IMG));
				cv.put(Eatery.EATERY_TIMG, ""+data.get(JsonKey.TIMG));
				cv.put(Eatery.EATERY_MINIMUM, ""+data.get(JsonKey.MINIMUM));
//				cv.put(Eatery.EATERY_FREIGHT, ""+data.get(JsonKey.FREIGHT));
				cv.put(Eatery.EATERY_LIKE, ""+data.get(JsonKey.LIKENUM));
//				cv.put(Eatery.EATERY_ADDRESS, ""+data.get(JsonKey.ADDRESS));
//				cv.put(Eatery.EATERY_AREA, ""+data.get(JsonKey.AREA));
				cv.put(Eatery.EATERY_LONGITUDE, ""+data.get(JsonKey.LONGITUDE));
				cv.put(Eatery.EATERY_LATITUDE, ""+data.get(JsonKey.LATITUDE));
//				cv.put(Eatery.EATERY_TEMP, ""+data.get(JsonKey.TEMP));
//				cv.put(Eatery.EATERY_TEL1, ""+data.get(JsonKey.TEL1));
//				cv.put(Eatery.EATERY_TEL2, ""+data.get(JsonKey.TEL2));
				
				String selection = Eatery.EATERY_ID + " = " + eatery_id;
				cursor = db.query(Eatery.TABLE_NAME, new String[]{Eatery.EATERY_ID}, selection, null, null, null, null);
				boolean flagExist = false;
	            if (cursor != null) {
	            	cursor.moveToFirst();
	            	if( !cursor.isAfterLast()) {
	            		flagExist = true;
	            	}
	            	cursor.close();
	            }
	            if(flagExist){
	            	//数据已经存在,则更新
	            	db.update(Eatery.TABLE_NAME, cv, selection, null);
	            }else{
	            	db.insert(Eatery.TABLE_NAME, null, cv);
	            }
	            //将每一条餐馆数据存入餐馆数据表中，如果存在，则更新=====================end
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			db.close();
		}
		return true;
	}
	
}
