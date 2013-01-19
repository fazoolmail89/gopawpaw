/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.util.prefs.Preferences;

/**
 * ע�������
 * @version 2012-10-13
 * @author Jason
 */
public class PreferencesUtils {

	private static Preferences mUserData;
	
	/**
	 * 
	 */
	private PreferencesUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static Preferences getUserData(){
		if(mUserData == null){
			mUserData =  Preferences.userRoot().node("/com/gopawpaw/data");
		}
		return mUserData;
	}
}
