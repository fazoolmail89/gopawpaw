/**
 * @author EX-LIJINHUA001
 * @date 2013-1-14
 */
package im.device.smartdining.db;

import im.device.smartdining.JsonKey;
import im.device.smartdining.db.DataBaseDefinition.FoodType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


/**
 * 菜式分类数据库访问类
 * @author EX-LIJINHUA001
 * @date 2013-1-14
 */
public class FoodTypeDao extends BaseDBHelper {
	
	static final String[] foodTypeColumns = {
		FoodType._ID,
		FoodType.FOODTYPE_ID,
		FoodType.FOODTYPE_NAME,
		FoodType.FOODTYPE_EATERY_ID
    };
	
	public FoodTypeDao(Context context) {
		super(context);
	}
	
	/**
	 * 拿到数据库返回对象的实例
	 * @param ctx
	 * @return
	 */
	public static FoodTypeDao getInstance(Context ctx) {
		return new FoodTypeDao(ctx);
	}
	
	/**
	 * 增加一条记录
	 * @param bean
	 * @return
	 */
	public boolean save(HashMap<String,String> data){
		SQLiteDatabase db = getDatabase();
		try {
			
			ContentValues cv = new ContentValues();
			cv.put(FoodType.FOODTYPE_ID, data.get(FoodType.FOODTYPE_ID));
			cv.put(FoodType.FOODTYPE_NAME, data.get(FoodType.FOODTYPE_NAME));
			cv.put(FoodType.FOODTYPE_EATERY_ID, data.get(FoodType.FOODTYPE_EATERY_ID));
			
			db.insert(FoodType.TABLE_NAME, null, cv);
			
		} catch (Exception e) {
			return false;
		} finally {
			db.close();
		}
		return true;
	}
	
	/**
	 * 增加一条记录
	 * @param bean
	 * @return
	 */
	public boolean saveList(List<HashMap<String, Object>> data,int eateryId){
		if(data == null || data.size() == 0){
			return false;
		}
		SQLiteDatabase db = getDatabase();
		try {
			
			db.delete(FoodType.TABLE_NAME, FoodType.FOODTYPE_EATERY_ID + "=" + eateryId, null);
			for(HashMap<String,Object> d : data){
				ContentValues cv = new ContentValues();
				cv.put(FoodType.FOODTYPE_ID, ""+d.get(JsonKey.ID));
				cv.put(FoodType.FOODTYPE_NAME, ""+d.get(JsonKey.NAME));
				cv.put(FoodType.FOODTYPE_EATERY_ID, ""+eateryId);
				db.insert(FoodType.TABLE_NAME, null, cv);
			}
			
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
	public List<HashMap<String,Object>> getAllFoodType() {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	cursor = database.query(FoodType.TABLE_NAME, foodTypeColumns, null, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            
            List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
            for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            	HashMap<String,Object> data = getDataFromCursor(cursor);
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
	 * 根据餐馆ID获取菜单分类
	 * @author EX-LIJINHUA001
	 * @date 2013-1-23
	 * @param eateryId
	 * @return
	 */
	public List<HashMap<String,Object>> getFoodTypeByEateryId(int eateryId) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = FoodType.FOODTYPE_EATERY_ID + " = " + eateryId;
        	cursor = database.query(FoodType.TABLE_NAME, foodTypeColumns, selection, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            
            List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
            for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            	HashMap<String,Object> data = getDataFromCursor(cursor);
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
	public HashMap<String,Object> getDataByName(String name) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = FoodType.FOODTYPE_NAME + " like " + name;
        	cursor = database.query(FoodType.TABLE_NAME, foodTypeColumns, selection, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            cursor.moveToFirst();
            if( !cursor.isAfterLast() ) {
            	HashMap<String,Object> data = getDataFromCursor(cursor);
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
		if (getDataByName(name) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 从Cursor中返回一个二维码历史记录的实例对象
	 * @param cursor
	 * @return
	 */
	private static HashMap<String,Object> getDataFromCursor(Cursor cursor) {
		int id = cursor.getInt(cursor.getColumnIndexOrThrow(FoodType._ID));
		String foodtype_id = cursor.getString(cursor.getColumnIndexOrThrow(FoodType.FOODTYPE_ID));
		String foodtype_name = cursor.getString(cursor.getColumnIndexOrThrow(FoodType.FOODTYPE_NAME));
		String foodtype_eatery_id = cursor.getString(cursor.getColumnIndexOrThrow(FoodType.FOODTYPE_EATERY_ID));
		
		
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put(FoodType._ID, ""+id);
		hashMap.put(JsonKey.ID, foodtype_id);
		hashMap.put(JsonKey.NAME, foodtype_name);
		hashMap.put(FoodType.FOODTYPE_EATERY_ID, foodtype_eatery_id);
		
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
			int result = db.delete(FoodType.TABLE_NAME, FoodType._ID + "=" + id, null);
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
		db.execSQL("delete from "+FoodType.TABLE_NAME);
	}
	
	private SQLiteDatabase getDatabase() {
		return getWritableDatabase();
	}
}
