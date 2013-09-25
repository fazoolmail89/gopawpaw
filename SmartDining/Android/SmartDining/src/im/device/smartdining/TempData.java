/**
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
package im.device.smartdining;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 临时数据
 * @author EX-LIJINHUA001
 * @date 2013-1-15
 */
public class TempData {

	public static JSONObject getEaterys(){
		JSONObject json = new JSONObject();
		try {
			json.put(JsonKey.CODE, 1);
			json.put(JsonKey.MSG, "错误码");
			
			JSONObject data = new JSONObject();
			data.put(JsonKey.RECORDCOUNT, 0);
			data.put(JsonKey.PAGECOUNT, 0);
			data.put(JsonKey.PAGESIZE, 0);
			data.put(JsonKey.PAGENO, 0);
			
			JSONArray eaterys = new JSONArray();
			JSONObject eatery = new JSONObject();
			eatery.put(JsonKey.ID, "1");
			eatery.put(JsonKey.NAME, "jiawang1======================");
			eatery.put(JsonKey.IMG, "img.jpg");
			eatery.put(JsonKey.MINIMUM, 3);
			eatery.put(JsonKey.DISTANCE, 342);
			eatery.put(JsonKey.LIKENUM, 33);
			eatery.put(JsonKey.LONGITUDE, 102.245665465);
			eatery.put(JsonKey.LATITUDE, 25.012456);
			eaterys.put(eatery);
			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang2======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang3======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang4======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang5======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang6======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang7======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang8======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
//			
//			eatery = new JSONObject();
//			eatery.put(JsonKey.NAME, "jiawang9======================");
//			eatery.put(JsonKey.IMG, "img.jpg");
//			eatery.put(JsonKey.MINIMUM, 3);
//			eatery.put(JsonKey.DISTANCE, 342);
//			eatery.put(JsonKey.LIKENUM, 33);
//			eatery.put(JsonKey.LONGITUDE, "102.245665465");
//			eatery.put(JsonKey.LONGITUDE, "25.012456");
//			eaterys.put(eatery);
			
			data.put(JsonKey.EATERYS, eaterys);
			json.put(JsonKey.DATA, data);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
	public static JSONObject getFoodtype(){
		JSONObject json = new JSONObject();
		try {
			json.put(JsonKey.CODE, 1);
			json.put(JsonKey.MSG, "错误码");
			
			JSONObject data = new JSONObject();
			data.put(JsonKey.RECORDCOUNT, 0);
			data.put(JsonKey.PAGECOUNT, 0);
			data.put(JsonKey.PAGESIZE, 0);
			data.put(JsonKey.PAGENO, 0);
			
			JSONArray foodtypes = new JSONArray();
			JSONObject foodtype = new JSONObject();
			
			foodtype.put(JsonKey.ID, "1");
			foodtype.put(JsonKey.NAME, "套餐");
			foodtypes.put(foodtype);
			
			foodtype = new JSONObject();
			foodtype.put(JsonKey.ID, "2");
			foodtype.put(JsonKey.NAME, "套餐2");
			foodtypes.put(foodtype);
			
			foodtype = new JSONObject();
			foodtype.put(JsonKey.ID, "3");
			foodtype.put(JsonKey.NAME, "套餐3");
			foodtypes.put(foodtype);
			
			foodtype = new JSONObject();
			foodtype.put(JsonKey.ID, "4");
			foodtype.put(JsonKey.NAME, "套餐4");
			foodtypes.put(foodtype);
			
			foodtype = new JSONObject();
			foodtype.put(JsonKey.ID, "5");
			foodtype.put(JsonKey.NAME, "套餐5");
			foodtypes.put(foodtype);
			
			data.put(JsonKey.FOODTYPES, foodtypes);
			
			//=======================
			JSONArray firstfoods = new JSONArray();
			JSONObject food = new JSONObject();
			food.put(JsonKey.ID, "1");
			food.put(JsonKey.NAME, "小炒肉");
			food.put(JsonKey.PRICE, 22.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "2");
			food.put(JsonKey.NAME, "小炒肉2");
			food.put(JsonKey.PRICE, 14.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "3");
			food.put(JsonKey.NAME, "小炒肉3");
			food.put(JsonKey.PRICE, 23.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "4");
			food.put(JsonKey.NAME, "小炒肉4");
			food.put(JsonKey.PRICE, 23.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "5");
			food.put(JsonKey.NAME, "小炒肉5");
			food.put(JsonKey.PRICE, 23.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "6");
			food.put(JsonKey.NAME, "小炒肉6");
			food.put(JsonKey.PRICE, 23.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			
			food = new JSONObject();
			food.put(JsonKey.ID, "7");
			food.put(JsonKey.NAME, "小炒肉7");
			food.put(JsonKey.PRICE, 23.5);
			food.put(JsonKey.IMG, "/img/2.jpg");
			firstfoods.put(food);
			data.put(JsonKey.FIRSTFOODS, firstfoods);
			
			json.put(JsonKey.DATA, data);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
}
