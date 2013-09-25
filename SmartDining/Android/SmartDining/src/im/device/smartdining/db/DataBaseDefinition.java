package im.device.smartdining.db;

import java.util.ArrayList;

import android.provider.BaseColumns;

/**
 * 数据库定义类
 * @author LiJinHua
 * @version [Android 1.0.0, 2013-1-12]
 */
public class DataBaseDefinition {
	
	/** 数据库配置 **/
	public static String DBNAME = "smartdining.db";
	
	public static int VERSION = 3;
	
	/**
	 * 餐馆数据表
	 * @author LiJinHua
	 * @version [Android 1.0.0, 2013-1-12]
	 */
	public static final class Eatery implements BaseColumns {
		/**表名**/
		public static final String TABLE_NAME = "eatery"; 
		
		/**商家id**/
		public static final String EATERY_ID = "eatery_id";
		/**商家名称**/
		public static final String EATERY_NAME = "eatery_name";
		/**商家图片url**/
		public static final String EATERY_IMG = "eatery_img";
		/**商家图片缩略图url**/
		public static final String EATERY_TIMG = "eatery_timg";
		/**最低起送**/
		public static final String EATERY_MINIMUM = "eatery_minimum";
		/**送餐费**/
		public static final String EATERY_FREIGHT = "eatery_freight";
		/**营业时间**/
		public static final String EATERY_HOURS = "eatery_hours";
		/**喜欢数**/
		public static final String EATERY_LIKE = "eatery_like";
		/**商家地址**/
		public static final String EATERY_ADDRESS = "eatery_address";
		/**配送区域**/
		public static final String EATERY_AREA = "eatery_area";
		/**商家经度**/
		public static final String EATERY_LONGITUDE = "eatery_longitude";
		/**商家纬度**/
		public static final String EATERY_LATITUDE = "eatery_latitude";
		/**商家备注**/
		public static final String EATERY_TEMP = "eatery_temp";
		/**商家电话1**/
		public static final String EATERY_TEL1 = "eatery_tel1";
		/**商家电话2**/
		public static final String EATERY_TEL2 = "eatery_tel2";
		/**30分钟内拨打次数**/
		public static final String EATERY_CALL = "eatery_call";
		
		/**创建数据表**/
		public static final String CREATE_TABLE = "create table "+TABLE_NAME+" (" +
		_ID + " Integer primary key autoincrement, " +
		EATERY_ID + " Integer, " +
		EATERY_NAME + " varchar(100), " +
		EATERY_IMG + " varchar(200), " +
		EATERY_TIMG + " varchar(200), " +
		EATERY_MINIMUM + " float, " +
		EATERY_FREIGHT + " float, " +
		EATERY_HOURS + " varchar(200), " +
		EATERY_LIKE + " Integer, " +
		EATERY_ADDRESS + " varchar(200), " +
		EATERY_AREA + " varchar(200), " +
		EATERY_LONGITUDE + " double, " +
		EATERY_LATITUDE + " double, " +
		EATERY_TEMP + " varchar(200), " +
		EATERY_TEL1 + " varchar(20), " +
		EATERY_TEL2 + " varchar(20), " +
		EATERY_CALL + " Integer)";
		
		/**删除数据表**/
		public static final String DROP_TABLE = "drop table if exists "+TABLE_NAME;
		
		/**清除数据**/
		public static final String CLEAR_DATA = "delete from "+TABLE_NAME;
	
		/**
		 * 获取初始化数据sql
		 * @return
		 */
		public static ArrayList<String> getInitDataSQL(){
			ArrayList<String> list = new ArrayList<String>();

			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (1,'佳旺', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10111974609375, 22.567114553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (2,'佳旺2', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10122974609375, 22.567224553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (3,'佳旺3', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10133974609375, 22.567334553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (4,'佳旺4', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10112974609375, 22.567124553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (5,'佳旺5', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10131974609375, 22.567314553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (6,'佳旺6', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10144974609375, 22.567444553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (7,'佳旺7', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10175974609375, 22.567754553833008,'备注', '133333333', '1333334444')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+EATERY_ID+", "+EATERY_NAME+", "+EATERY_IMG+", "+EATERY_MINIMUM+", "+EATERY_FREIGHT+", "+EATERY_LIKE+", "+EATERY_ADDRESS+", "+EATERY_AREA+", "+EATERY_LONGITUDE+", "+EATERY_LATITUDE+", "+EATERY_TEMP+", "+EATERY_TEL1+", "+EATERY_TEL2+") " +
					"VALUES (8,'佳旺8', '/img/t.jpg', 2.01 ,3.09,4,'地址','范围白石洲', 114.10188974609375, 22.567884553833008,'备注', '133333333', '1333334444')");
			return list;
		}
	}
	
	/**
	 * 菜式分类数据表
	 * @author LiJinHua
	 * @version [Android 1.0.0, 2013-1-14]
	 */
	public static final class FoodType implements BaseColumns {
		/**表名**/
		public static final String TABLE_NAME = "foodtype"; 
		
		/**菜式分类id**/
		public static final String FOODTYPE_ID = "foodtype_id";
		/**菜式分类名称**/
		public static final String FOODTYPE_NAME = "foodtype_name";
		/**菜式分类关联的商家id**/
		public static final String FOODTYPE_EATERY_ID = "foodtype_eatery_id";
		
		/**创建数据表**/
		public static final String CREATE_TABLE = "create table "+TABLE_NAME+" (" +
		_ID + " Integer primary key autoincrement, " +
		FOODTYPE_ID + " Integer, " +
		FOODTYPE_NAME + " varchar(20), " +
		FOODTYPE_EATERY_ID + " Integer)";
		
		/**删除数据表**/
		public static final String DROP_TABLE = "drop table if exists "+TABLE_NAME;
		
		/**清除数据**/
		public static final String CLEAR_DATA = "delete from "+TABLE_NAME;
		/**
		 * 获取初始化数据sql
		 * @return
		 */
		public static ArrayList<String> getInitDataSQL(){
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOODTYPE_ID+", "+FOODTYPE_NAME+", "+FOODTYPE_EATERY_ID+") " +
					"VALUES (1,'套餐',4)");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOODTYPE_ID+", "+FOODTYPE_NAME+", "+FOODTYPE_EATERY_ID+") " +
					"VALUES (2,'主食',4)");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOODTYPE_ID+", "+FOODTYPE_NAME+", "+FOODTYPE_EATERY_ID+") " +
					"VALUES (3,'饮料',4)");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOODTYPE_ID+", "+FOODTYPE_NAME+", "+FOODTYPE_EATERY_ID+") " +
					"VALUES (4,'零食',4)");
			
			return list;
		}
	}
	
	/**
	 * 菜信息数据表
	 * @author LiJinHua
	 * @version [Android 1.0.0, 2013-1-14]
	 */
	public static final class Food implements BaseColumns {
		/**表名**/
		public static final String TABLE_NAME = "food"; 
		
		/**菜id**/
		public static final String FOOD_ID = "food_id";
		/**菜名**/
		public static final String FOOD_NAME = "food_name";
		/**菜关联的商家id**/
		public static final String FOOD_EATERY_ID = "food_eatery_id";
		/**菜关联的菜式id**/
		public static final String FOOD_TYPE_ID = "food_type_id";
		/**菜单价**/
		public static final String FOOD_PRICE = "food_price";
		/**菜图片url**/
		public static final String FOOD_IMG = "food_img";
		/**菜图片url**/
		public static final String FOOD_TIMG = "food_timg";
		
		/**创建数据表**/
		public static final String CREATE_TABLE = "create table "+TABLE_NAME+" (" +
		_ID + " Integer primary key autoincrement, " +
		FOOD_ID + " Integer, " +
		FOOD_NAME + " varchar(20), " +
		FOOD_EATERY_ID + " Integer, " +
		FOOD_TYPE_ID + " Integer, " +
		FOOD_PRICE + " float, " +
		FOOD_IMG + " varchar(200), " +
		FOOD_TIMG + " varchar(200))";
		
		/**删除数据表**/
		public static final String DROP_TABLE = "drop table if exists "+TABLE_NAME;
		/**清除数据**/
		public static final String CLEAR_DATA = "delete from "+TABLE_NAME;
		/**
		 * 获取初始化数据sql
		 * @return
		 */
		public static ArrayList<String> getInitDataSQL(){
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
					"VALUES (1,'辣子鸡套餐',4,1,1.22,'http://www.jpg')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
				"VALUES (2,'红烧肉套餐',4,1,1.22,'http://www.jpg')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
				"VALUES (3,'鸡腿饭套餐',4,1,1.22,'http://www.jpg')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
				"VALUES (3,'米饭',4,2,1.22,'http://www.jpg')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
				"VALUES (3,'面包',4,2,1.22,'http://www.jpg')");
			list.add("INSERT INTO "+TABLE_NAME+" ("+FOOD_ID+", "+FOOD_NAME+", "+FOOD_EATERY_ID+", "+FOOD_TYPE_ID+", "+FOOD_PRICE+", "+FOOD_IMG+") " +
				"VALUES (3,'可乐',4,3,1.22,'http://www.jpg')");
	
			return list;
		}
	}
}
