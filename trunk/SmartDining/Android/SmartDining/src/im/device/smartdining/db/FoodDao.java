/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
package im.device.smartdining.db;

import im.device.smartdining.JsonKey;
import im.device.smartdining.db.DataBaseDefinition.Food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
public class FoodDao extends BaseDBHelper {
	
	static final String[] foodColumns = {
		Food._ID,
		Food.FOOD_ID,
		Food.FOOD_NAME,
		Food.FOOD_EATERY_ID,
		Food.FOOD_TYPE_ID,
		Food.FOOD_PRICE,
		Food.FOOD_IMG,
		Food.FOOD_TIMG
    };
	
	public FoodDao(Context context) {
		super(context);
	}
	
	/**
	 * 拿到数据库返回对象的实例
	 * @param ctx
	 * @return
	 */
	public static FoodDao getInstance(Context ctx) {
		return new FoodDao(ctx);
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
			cv.put(Food.FOOD_ID, data.get(Food.FOOD_ID));
			cv.put(Food.FOOD_NAME, data.get(Food.FOOD_NAME));
			cv.put(Food.FOOD_EATERY_ID, data.get(Food.FOOD_EATERY_ID));
			cv.put(Food.FOOD_TYPE_ID, data.get(Food.FOOD_TYPE_ID));
			cv.put(Food.FOOD_PRICE, data.get(Food.FOOD_PRICE));
			cv.put(Food.FOOD_IMG, data.get(Food.FOOD_IMG));
			cv.put(Food.FOOD_TIMG, ""+data.get(Food.FOOD_TIMG));
			
			db.insert(Food.TABLE_NAME, null, cv);
			
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
	public boolean saveList(List<HashMap<String,Object>> data,int eateryId,int typeId){
		if(data == null || data.size() == 0){
			return false;
		}
		SQLiteDatabase db = getDatabase();
		try {
			
			//先根据餐馆id和菜式分类id清空菜单，再保存新菜单
			String selection = Food.FOOD_EATERY_ID + " = " + eateryId +" and "+Food.FOOD_TYPE_ID + " = "+typeId;
			db.delete(Food.TABLE_NAME, selection, null);
			for(HashMap<String,Object> d : data){
				
				ContentValues cv = new ContentValues();
				cv.put(Food.FOOD_ID, ""+d.get(JsonKey.ID));
				cv.put(Food.FOOD_NAME, ""+d.get(JsonKey.NAME));
				cv.put(Food.FOOD_EATERY_ID, ""+eateryId);
				cv.put(Food.FOOD_TYPE_ID, ""+typeId);
				cv.put(Food.FOOD_PRICE, ""+d.get(JsonKey.PRICE));
				cv.put(Food.FOOD_IMG, ""+d.get(JsonKey.IMG));
				cv.put(Food.FOOD_TIMG, ""+d.get(JsonKey.TIMG));
				
				db.insert(Food.TABLE_NAME, null, cv);
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
	public HashMap<String,List<HashMap<String, Object>>> getAllFood(String eateryId) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = Food.FOOD_EATERY_ID + " = " + eateryId;
        	cursor = database.query(Food.TABLE_NAME, foodColumns, selection, null, null, null, null);
            if (cursor == null) {
                return null;
            }
            
            HashMap<String,List<HashMap<String, Object>>> dataMap = new HashMap<String,List<HashMap<String, Object>>>();
            for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            	HashMap<String,Object> data = getDataFromCursor(cursor);
            	String foodType = (String) data.get(Food.FOOD_TYPE_ID);
            	List<HashMap<String, Object>> list = dataMap.get(foodType);
            	if(list == null){
            		//分类
            		list = new ArrayList<HashMap<String,Object>>();
            		data.put(foodType, list);
            	}
                list.add(data);
            }
            return dataMap;
        } finally {
            database.close();
            if (cursor != null) {
                cursor.close();
            }
        }
	}
	
	/**
	 * 查询所有的记录
	 * @return
	 */
	public List<HashMap<String,Object>> getAllFood(String eateryId,String typeId) {
		SQLiteDatabase database = getDatabase();
        Cursor cursor = null;
        try {
        	String selection = Food.FOOD_EATERY_ID + " = " + eateryId +" and "+Food.FOOD_TYPE_ID + " = "+typeId;
        	cursor = database.query(Food.TABLE_NAME, foodColumns, selection, null, null, null, null);
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
        	String selection = Food.FOOD_NAME + " like " + name;
        	cursor = database.query(Food.TABLE_NAME, foodColumns, selection, null, null, null, null);
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
		int id = cursor.getInt(cursor.getColumnIndexOrThrow(Food._ID));
		String food_id = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_ID));
		String food_name = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_NAME));
		String food_eatery_id = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_EATERY_ID));
		String food_type_id = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_TYPE_ID));
		String food_price = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_PRICE));
		String food_img = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_IMG));
		String food_timg = cursor.getString(cursor.getColumnIndexOrThrow(Food.FOOD_TIMG));
		
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put(Food._ID, ""+id);
		hashMap.put(JsonKey.ID, food_id);
		hashMap.put(JsonKey.NAME, food_name);
		hashMap.put(Food.FOOD_EATERY_ID, food_eatery_id);
		hashMap.put(Food.FOOD_TYPE_ID, food_type_id);
		hashMap.put(JsonKey.PRICE, food_price);
		hashMap.put(JsonKey.IMG, food_img);
		hashMap.put(JsonKey.TIMG, food_timg);
		
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
			int result = db.delete(Food.TABLE_NAME, Food._ID + "=" + id, null);
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
		db.execSQL("delete from "+Food.TABLE_NAME);
	}
	
	private SQLiteDatabase getDatabase() {
		return getWritableDatabase();
	}
}
