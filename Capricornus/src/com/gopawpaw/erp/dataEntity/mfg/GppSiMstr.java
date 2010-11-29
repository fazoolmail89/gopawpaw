/**
 * 
 */
package com.gopawpaw.erp.dataEntity.mfg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.GppSQL;
import com.gopawpaw.erp.hibernate.s.SiMstr;
import com.gopawpaw.erp.hibernate.s.SiMstrDAO;
import com.gopawpaw.erp.hibernate.s.SiMstrId;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class GppSiMstr {
	
	private static ArrayList<SiMstr> simstr = null;
	private static String gpp_sqlstr = "";
	/**
	 * 
	 */
	public GppSiMstr() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 重新加载数据
	 */
	private static void reloadData() {
		
		
		simstr = new  ArrayList<SiMstr>();
		
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
				SiMstr temp_SiMstr = new SiMstr();
				SiMstrId temp_id = new SiMstrId();
				
				temp_id.setSiSite(rst.getString("si_site"));
				temp_SiMstr.setSiDesc(rst.getString("si_desc"));
				temp_SiMstr.setSiEntity(rst.getString("si_entity"));
				temp_SiMstr.setSiStatus(rst.getString("si_status"));
				temp_SiMstr.setSiAutoLoc(rst.getBoolean("si_auto_loc"));
				temp_SiMstr.setSiUser1(rst.getString("si_user1"));
				temp_SiMstr.setSiUser2(rst.getString("si_user2"));
				temp_SiMstr.setSiChr01(rst.getString("si__chr01"));
				temp_SiMstr.setSiChr02(rst.getString("si__chr02"));
				temp_SiMstr.setSiChr03(rst.getString("si__chr03"));
				temp_SiMstr.setSiChr04(rst.getString("si__chr04"));
				temp_SiMstr.setSiChr05(rst.getString("si__chr05"));
				temp_SiMstr.setSiDte01(rst.getDate("si__dte01"));
				temp_SiMstr.setSiDte02(rst.getDate("si__dte02"));
				temp_SiMstr.setSiDec01(rst.getDouble("si__dec01"));
				temp_SiMstr.setSiDec02(rst.getDouble("si__dec02"));
				temp_SiMstr.setSiLog01(rst.getBoolean("si__log01"));
				temp_SiMstr.setSiGlSet(rst.getString("si_gl_set"));
				temp_SiMstr.setSiCurSet(rst.getString("si_cur_set"));
				temp_SiMstr.setSiDb(rst.getString("si_db"));
				temp_SiMstr.setSiXferAcct(rst.getString("si_xfer_acct"));
				temp_SiMstr.setSiXferCc(rst.getString("si_xfer_cc"));
				temp_SiMstr.setSiGitAcct(rst.getString("si_git_acct"));
				temp_SiMstr.setSiGitCc(rst.getString("si_git_cc"));
				temp_SiMstr.setSiCanrun(rst.getString("si_canrun"));
				temp_SiMstr.setSiExtVd(rst.getBoolean("si_ext_vd"));
				temp_SiMstr.setSiBtbVend(rst.getString("si_btb_vend"));
				temp_SiMstr.setSiGitSub(rst.getString("si_git_sub"));
				temp_SiMstr.setSiXferSub(rst.getString("si_xfer_sub"));
				temp_SiMstr.setSiDecl(rst.getString("si_decl"));
				temp_SiMstr.setSiXferOwnership(rst.getBoolean("si_xfer_ownership"));
				temp_SiMstr.setSiGitLocation(rst.getString("si_git_location"));
				temp_id.setSiDomain(rst.getString("si_domain"));
				temp_SiMstr.setSiType(rst.getBoolean("si_type"));
				temp_SiMstr.setOidSiMstr(rst.getDouble("oid_si_mstr"));

				temp_SiMstr.setId(temp_id);
				
				simstr.add(temp_SiMstr);
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
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"pt_mstr\" where \"MFGPROD\".\"PUB\".\"si_mstr\".\"si_domain\"='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}
	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from pt_mstr where si_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from pt_mstr where si_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		SiMstrDAO dao = SiMstrDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("SiMstr"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			if (((SiMstr) o).getId().getSiDomain().equals(
					GlobalParameter.getLoginSession().getDomain())) {
				simstr.add((SiMstr) o);
			}
		}
	}
	
	
	
	public static ArrayList<SiMstr> getSiMstr() {
		if(simstr == null){
			reloadData();
		}
		return simstr;
	}

}
