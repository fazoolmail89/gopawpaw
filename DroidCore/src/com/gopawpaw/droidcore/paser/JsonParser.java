/**
 * @author EX-LIJINHUA001
 * @date 2013-1-14
 */
package com.gopawpaw.droidcore.paser;

import org.json.JSONException;
import org.json.JSONObject;

import com.gopawpaw.droidcore.http.action.HttpActionListener;
import com.gopawpaw.droidcore.log.AppLog;
import com.gopawpaw.droidcore.utils.Tools;

/**
 * Json解析器
 * @author EX-LIJINHUA001
 * @date 2013-1-14
 */
public class JsonParser implements ParserInterface{
	/**
	 * TAG
	 */
	private static final String TAG = JsonParser.class.getSimpleName();
	
	private JSONObject parseData;
	
	@Override
	public void actionParse(byte[] data) {
		
		try {
			parseData = new JSONObject(new String(data));
			AppLog.d(TAG, "actionParse=>"+parseData);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public JSONObject getData() {
		// TODO Auto-generated method stub
		return parseData;
	}

	@Override
	public int checkErrorCode(Object data, String urlId) {
		if(data == null || !(data instanceof JSONObject)){
			return HttpActionListener.STATE_FAILED;
		}
		JSONObject json = (JSONObject)data;
		String codeStr = ""+Tools.getValuseFromJSONObject(json, JsonKey.CODE);
		int code = 0;
		try {
			code = Integer.parseInt(codeStr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(code >= 0 && code <= 99){
			return HttpActionListener.STATE_SUCCESS;
		}else{
			return HttpActionListener.STATE_FAILED;
		}
	}

}
