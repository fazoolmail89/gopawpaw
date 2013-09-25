package im.device.smartdining.db;

import im.device.smartdining.db.DataBaseDefinition.Eatery;
import im.device.smartdining.db.DataBaseDefinition.Food;
import im.device.smartdining.db.DataBaseDefinition.FoodType;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * 数据库辅助类
 * @author LiJinHua
 * @version [Android 1.0.0, 2013-1-12]
 */
public class BaseDBHelper extends SQLiteOpenHelper {
	public  String TAG = this.getClass().getSimpleName();
	
	public BaseDBHelper(Context context) {
		super(context, DataBaseDefinition.DBNAME, null, DataBaseDefinition.VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		/** 创建数据库结构 **/
		db.execSQL(Eatery.CREATE_TABLE);
		db.execSQL(FoodType.CREATE_TABLE);
		db.execSQL(Food.CREATE_TABLE);
		initTripData(db);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//删除数据表
		db.execSQL(Eatery.DROP_TABLE);
		db.execSQL(FoodType.DROP_TABLE);
		db.execSQL(Food.DROP_TABLE);
		onCreate(db);
	}
	
	/**
	 * 初始化数据库数据
	 * @param db
	 */
	public void initTripData(SQLiteDatabase db){
		for(String sql : Eatery.getInitDataSQL()){
			db.execSQL(sql);
		}
		
		for(String sql : FoodType.getInitDataSQL()){
			db.execSQL(sql);
		}
		
		for(String sql : Food.getInitDataSQL()){
			db.execSQL(sql);
		}
		
	}
	
	/**
	 * 清除数据
	 * @author ex-lijinhua001
	 * @date 2013-2-17
	 * @return
	 */
	public boolean clearData(){
		SQLiteDatabase db = getWritableDatabase();
		/** 创建数据库结构 **/
		db.execSQL(Eatery.CLEAR_DATA);
		db.execSQL(FoodType.CLEAR_DATA);
		db.execSQL(Food.CLEAR_DATA);
		return true;
	}
}
