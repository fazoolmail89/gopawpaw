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
import com.gopawpaw.erp.hibernate.w.WoMstr;
import com.gopawpaw.erp.hibernate.w.WoMstrDAO;
import com.gopawpaw.erp.hibernate.w.WoMstrId;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class GppWoMstr {


	private static ArrayList<WoMstr> womstr = null;
	private static String gpp_sqlstr = "";
	/**
	 * 
	 */
	public GppWoMstr() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 重新加载数据
	 */
	private static void reloadData() {
		
		
		womstr = new  ArrayList<WoMstr>();
		
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
	 * 从Progress数据库重新加载数据
	 */
	private static void reloadDataFromSQL() {
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);
		try {
			while (rst != null && rst.next()) {
				WoMstr temp_WoMstr = new WoMstr();
				WoMstrId temp_id = new WoMstrId();
				
				temp_id.setWoNbr(rst.getString("wo_nbr"));
				temp_id.setWoLot(rst.getString("wo_lot"));
				temp_WoMstr.setWoSoJob(rst.getString("wo_so_job"));
				temp_WoMstr.setWoOrdDate(rst.getDate("wo_ord_date"));
				temp_WoMstr.setWoRelDate(rst.getDate("wo_rel_date"));
				temp_WoMstr.setWoDueDate(rst.getDate("wo_due_date"));
				temp_WoMstr.setWoPerDate(rst.getDate("wo_per_date"));
				temp_WoMstr.setWoPart(rst.getString("wo_part"));
				temp_WoMstr.setWoType(rst.getString("wo_type"));
				temp_WoMstr.setWoQtyOrd(rst.getDouble("wo_qty_ord"));
				temp_WoMstr.setWoQtyComp(rst.getDouble("wo_qty_comp"));
				temp_WoMstr.setWoQtyRjct(rst.getDouble("wo_qty_rjct"));
				temp_WoMstr.setWoStatus(rst.getString("wo_status"));
				temp_WoMstr.setWoVend(rst.getString("wo_vend"));
				temp_WoMstr.setWoRmks(rst.getString("wo_rmks"));
				temp_WoMstr.setWoQtyChg(rst.getDouble("wo_qty_chg"));
				temp_WoMstr.setWoRjctChg(rst.getDouble("wo_rjct_chg"));
				temp_WoMstr.setWoBoChg(rst.getDouble("wo_bo_chg"));
				temp_WoMstr.setWoYieldPct(rst.getDouble("wo_yield_pct"));
				temp_WoMstr.setWoRev(rst.getString("wo_rev"));
				temp_WoMstr.setWoAcct(rst.getString("wo_acct"));
				temp_WoMstr.setWoCc(rst.getString("wo_cc"));
				temp_WoMstr.setWoQad01(rst.getString("wo__qad01"));
				temp_WoMstr.setWoLotPrev(rst.getString("wo_lot_prev"));
				temp_WoMstr.setWoSchdType(rst.getString("wo_schd_type"));
				temp_WoMstr.setWoCmtindx(rst.getInt("wo_cmtindx"));
				temp_WoMstr.setWoProject(rst.getString("wo_project"));
				temp_WoMstr.setWoLeadTime(rst.getInt("wo_lead_time"));
				temp_WoMstr.setWoWipTot(rst.getDouble("wo_wip_tot"));
				temp_WoMstr.setWoLbrTot(rst.getDouble("wo_lbr_tot"));
				temp_WoMstr.setWoMtlTot(rst.getDouble("wo_mtl_tot"));
				temp_WoMstr.setWoBdnTot(rst.getDouble("wo_bdn_tot"));
				temp_WoMstr.setWoSubTot(rst.getDouble("wo_sub_tot"));
				temp_WoMstr.setWoUser1(rst.getString("wo_user1"));
				temp_WoMstr.setWoUser2(rst.getString("wo_user2"));
				temp_WoMstr.setWoOvhTot(rst.getDouble("wo_ovh_tot"));
				temp_WoMstr.setWoLoc(rst.getString("wo_loc"));
				temp_WoMstr.setWoSerial(rst.getString("wo_serial"));
				temp_WoMstr.setWoRouting(rst.getString("wo_routing"));
				temp_WoMstr.setWoBomCode(rst.getString("wo_bom_code"));
				temp_WoMstr.setWoSite(rst.getString("wo_site"));
				temp_WoMstr.setWoQueueEff(rst.getDouble("wo_queue_eff"));
				temp_WoMstr.setWoDraw(rst.getString("wo_draw"));
				temp_WoMstr.setWoLbrUp(rst.getBoolean("wo_lbr_up"));
				temp_WoMstr.setWoBdnUp(rst.getBoolean("wo_bdn_up"));
				temp_WoMstr.setWoGlLbr(rst.getBoolean("wo_gl_lbr"));
				temp_WoMstr.setWoGlBdn(rst.getBoolean("wo_gl_bdn"));
				temp_WoMstr.setWoChr01(rst.getString("wo__chr01"));
				temp_WoMstr.setWoChr02(rst.getString("wo__chr02"));
				temp_WoMstr.setWoChr03(rst.getString("wo__chr03"));
				temp_WoMstr.setWoChr04(rst.getString("wo__chr04"));
				temp_WoMstr.setWoChr05(rst.getString("wo__chr05"));
				temp_WoMstr.setWoDte01(rst.getDate("wo__dte01"));
				temp_WoMstr.setWoDte02(rst.getDate("wo__dte02"));
				temp_WoMstr.setWoDec01(rst.getDouble("wo__dec01"));
				temp_WoMstr.setWoDec02(rst.getDouble("wo__dec02"));
				temp_WoMstr.setWoLog01(rst.getBoolean("wo__log01"));
				temp_WoMstr.setWoLine(rst.getString("wo_line"));
				temp_WoMstr.setWoVar(rst.getBoolean("wo_var"));
				temp_WoMstr.setWoMtlVar(rst.getDouble("wo_mtl_var"));
				temp_WoMstr.setWoLbrVar(rst.getDouble("wo_lbr_var"));
				temp_WoMstr.setWoBdnVar(rst.getDouble("wo_bdn_var"));
				temp_WoMstr.setWoSubVar(rst.getDouble("wo_sub_var"));
				temp_WoMstr.setWoMvarAcct(rst.getString("wo_mvar_acct"));
				temp_WoMstr.setWoMvarCc(rst.getString("wo_mvar_cc"));
				temp_WoMstr.setWoMvrrAcct(rst.getString("wo_mvrr_acct"));
				temp_WoMstr.setWoMvrrCc(rst.getString("wo_mvrr_cc"));
				temp_WoMstr.setWoSvarAcct(rst.getString("wo_svar_acct"));
				temp_WoMstr.setWoSvarCc(rst.getString("wo_svar_cc"));
				temp_WoMstr.setWoSvrrAcct(rst.getString("wo_svrr_acct"));
				temp_WoMstr.setWoSvrrCc(rst.getString("wo_svrr_cc"));
				temp_WoMstr.setWoFlrAcct(rst.getString("wo_flr_acct"));
				temp_WoMstr.setWoFlrCc(rst.getString("wo_flr_cc"));
				temp_WoMstr.setWoDec03(rst.getDouble("wo__dec03"));
				temp_WoMstr.setWoRjctTot(rst.getDouble("wo_rjct_tot"));
				temp_WoMstr.setWoMthdVar(rst.getDouble("wo_mthd_var"));
				temp_WoMstr.setWoRvalTot(rst.getDouble("wo_rval_tot"));
				temp_WoMstr.setWoAcctClose(rst.getBoolean("wo_acct_close"));
				temp_WoMstr.setWoCloseDate(rst.getDate("wo_close_date"));
				temp_WoMstr.setWoCloseEff(rst.getDate("wo_close_eff"));
				temp_WoMstr.setWoFsmType(rst.getString("wo_fsm_type"));
				temp_WoMstr.setWoXvarAcct(rst.getString("wo_xvar_acct"));
				temp_WoMstr.setWoXvarCc(rst.getString("wo_xvar_cc"));
				temp_WoMstr.setWoMyldVar(rst.getDouble("wo_myld_var"));
				temp_WoMstr.setWoJointType(rst.getString("wo_joint_type"));
				temp_WoMstr.setWoProdPct(rst.getDouble("wo_prod_pct"));
				temp_WoMstr.setWoQtyType(rst.getString("wo_qty_type"));
				temp_WoMstr.setWoDec04(rst.getDouble("wo__dec04"));
				temp_WoMstr.setWoBaseId(rst.getString("wo_base_id"));
				temp_WoMstr.setWoUnitCost(rst.getDouble("wo_unit_cost"));
				temp_WoMstr.setWoMixVar(rst.getDouble("wo_mix_var"));
				temp_WoMstr.setWoBdnTotx(rst.getDouble("wo_bdn_totx"));
				temp_WoMstr.setWoLbrTotx(rst.getDouble("wo_lbr_totx"));
				temp_WoMstr.setWoMtlTotx(rst.getDouble("wo_mtl_totx"));
				temp_WoMstr.setWoSubTotx(rst.getDouble("wo_sub_totx"));
				temp_WoMstr.setWoOvhTotx(rst.getDouble("wo_ovh_totx"));
				temp_WoMstr.setWoRctstatActive(rst.getBoolean("wo_rctstat_active"));
				temp_WoMstr.setWoBatch(rst.getString("wo_batch"));
				temp_WoMstr.setWoAssay(rst.getDouble("wo_assay"));
				temp_WoMstr.setWoGrade(rst.getString("wo_grade"));
				temp_WoMstr.setWoExpire(rst.getDate("wo_expire"));
				temp_WoMstr.setWoRctstat(rst.getString("wo_rctstat"));
				temp_WoMstr.setWoLotNext(rst.getString("wo_lot_next"));
				temp_WoMstr.setWoLotRcpt(rst.getBoolean("wo_lot_rcpt"));
				temp_WoMstr.setWoCaIntType(rst.getString("wo_ca_int_type"));
				temp_WoMstr.setWoIssSite(rst.getString("wo_iss_site"));
				temp_WoMstr.setWoItmLine(rst.getInt("wo_itm_line"));
				temp_WoMstr.setWoDatePosted(rst.getDate("wo_date_posted"));
				temp_WoMstr.setWoQadc01(rst.getString("wo__qadc01"));
				temp_WoMstr.setWoQadc02(rst.getString("wo__qadc02"));
				temp_WoMstr.setWoQadc03(rst.getString("wo__qadc03"));
				temp_WoMstr.setWoQadt01(rst.getDate("wo__qadt01"));
				temp_WoMstr.setWoQadt02(rst.getDate("wo__qadt02"));
				temp_WoMstr.setWoQade01(rst.getDouble("wo__qade01"));
				temp_WoMstr.setWoQade02(rst.getDouble("wo__qade02"));
				temp_WoMstr.setWoQade03(rst.getDouble("wo__qade03"));
				temp_WoMstr.setWoQadi01(rst.getInt("wo__qadi01"));
				temp_WoMstr.setWoQadi02(rst.getInt("wo__qadi02"));
				temp_WoMstr.setWoQadl01(rst.getBoolean("wo__qadl01"));
				temp_WoMstr.setWoQadl02(rst.getBoolean("wo__qadl02"));
				temp_WoMstr.setWoEngCode(rst.getString("wo_eng_code"));
				temp_WoMstr.setWoSub(rst.getString("wo_sub"));
				temp_WoMstr.setWoFlrSub(rst.getString("wo_flr_sub"));
				temp_WoMstr.setWoMvarSub(rst.getString("wo_mvar_sub"));
				temp_WoMstr.setWoMvrrSub(rst.getString("wo_mvrr_sub"));
				temp_WoMstr.setWoSvarSub(rst.getString("wo_svar_sub"));
				temp_WoMstr.setWoSvrrSub(rst.getString("wo_svrr_sub"));
				temp_WoMstr.setWoXvarSub(rst.getString("wo_xvar_sub"));
				temp_WoMstr.setWoRef(rst.getString("wo_ref"));
				temp_WoMstr.setWoRecordDate(rst.getDate("wo_record_date"));
				temp_WoMstr.setWoStatCloseDate(rst.getDate("wo_stat_close_date"));
				temp_WoMstr.setWoStatCloseUserid(rst.getString("wo_stat_close_userid"));
				temp_WoMstr.setWoAppOwner(rst.getString("wo_app_owner"));
				temp_id.setWoDomain(rst.getString("wo_domain"));
				temp_WoMstr.setOidWoMstr(rst.getDouble("oid_wo_mstr"));

				temp_WoMstr.setId(temp_id);
				
				womstr.add(temp_WoMstr);
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
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"wo_mstr\" where \"MFGPROD\".\"PUB\".\"wo_mstr\".\"wo_domain\"='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}
	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from wo_mstr where wo_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from wo_mstr where wo_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		WoMstrDAO dao = WoMstrDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("WoMstr"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			if (((WoMstr) o).getId().getWoDomain().equals(
					GlobalParameter.getLoginSession().getDomain())) {
				womstr.add((WoMstr) o);
			}
		}
	}

	
	public static ArrayList<WoMstr> getWoMstr() {
		if(womstr == null){
			reloadData();
		}
		return womstr;
	}
}
