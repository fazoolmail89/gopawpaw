/**
 * 
 */
package com.gopawpaw.frame.dataEntity.mfg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.GppSQL;
import com.gopawpaw.frame.hibernate.m.MntDet;
import com.gopawpaw.frame.hibernate.m.MntDetDAO;
import com.gopawpaw.frame.hibernate.m.MntDetId;

/**
 * @version 2010-7-24
 * @author 李锦华
 *
 */
public class GppMntDet {

	private static ArrayList<MntDet> mntdet = null;
	private static String gpp_sqlstr = "";
	/**
	 * 
	 */
	public GppMntDet() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * 重新加载数据
	 */
	private static void reloadData() {
		
		
		mntdet = new  ArrayList<MntDet>();
		
		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {
			reloadDataFromProgress();
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {
			reloadDataFromAccess();
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			reloadDataFromSQLServer();
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {
			reloadDataFromHibernate();
		} else {
			reloadDataFromHibernate();
		}
	}

	/**
	 * 从数据库重新加载数据
	 */
	private static void reloadDataFromSQL() {
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);
		try {
			while (rst != null && rst.next()) {
				MntDet temp_MntDet = new MntDet();
				MntDetId temp_id = new MntDetId();

				temp_id.setMntNbr(rst.getString("mnt_nbr"));
				temp_id.setMntSelect(rst.getInt("mnt_select"));
				temp_id.setMntLang(rst.getString("mnt_lang"));
				
				temp_MntDet.setMntLabel(rst.getString("mnt_label"));
				temp_MntDet.setMntUser1(rst.getString("mnt_user1"));
				temp_MntDet.setMntUser2(rst.getString("mnt_user2"));
				temp_MntDet.setMntQadc01(rst.getString("mnt__qadc01"));
				temp_MntDet.setOidMntDet(rst.getDouble("oid_mnt_det"));

				temp_MntDet.setId(temp_id);
				
				mntdet.add(temp_MntDet);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();
	}
	
	/**
	 * 从Progress数据库重新加载数据
	 */
	private static void reloadDataFromProgress() {
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"mnt_det\" where \"MFGPROD\".\"PUB\".\"mnt_det\".\"mnt_lang\"='"+GlobalParameter.getDefaultLanguage()+"'";
		
		reloadDataFromSQL();
	
	}
	
	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from mnt_det where mnt_lang='"+GlobalParameter.getDefaultLanguage()+"'";
		
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from mnt_det where mnt_lang='"+GlobalParameter.getDefaultLanguage()+"'";
		
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		MntDetDAO dao = MntDetDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("MntDet"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			if (((MntDet) o).getId().getMntLang().equals(GlobalParameter.getDefaultLanguage())) {
				mntdet.add((MntDet) o);
			}
		}
	}
	
	/**
	 * @return the mntdet
	 */
	public static ArrayList<MntDet> getMntDet() {
		if(mntdet == null){
			reloadData();
		}
		return mntdet;
	}
}
