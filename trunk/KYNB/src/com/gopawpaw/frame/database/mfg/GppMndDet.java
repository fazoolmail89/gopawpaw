/**
 * 
 */
package com.gopawpaw.frame.database.mfg;

import java.util.ArrayList;

import com.gopawpaw.frame.struct.m.MndDet;

/**
 * @version 2010-7-24
 * @author 李锦华
 *
 */
public class GppMndDet {

	private static ArrayList<MndDet> mnddet = null;
	private static String gpp_sqlstr = "";
	
	/**
	 * 
	 */
	public GppMndDet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 重新加载数据
	 */
	private static void reloadData() {
		
		
//		ptmstr = new  ArrayList<PtMstr>();
//		
//		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {
//			reloadDataFromProgress();
//		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {
//			reloadDataFromAccess();
//		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
//			reloadDataFromSQLServer();
//		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {
//			reloadDataFromHibernate();
//		} else {
//			reloadDataFromHibernate();
//		}
	}
	
	public static ArrayList<MndDet> getMndDet() {
		if(mnddet == null){
			reloadData();
		}
		return mnddet;
	}
}
