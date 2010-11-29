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
import com.gopawpaw.erp.hibernate.p.PtMstr;
import com.gopawpaw.erp.hibernate.p.PtMstrDAO;
import com.gopawpaw.erp.hibernate.p.PtMstrId;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class GppPtMstr {

	private static ArrayList<PtMstr> ptmstr = null;
	private static String gpp_sqlstr = "";
	
	/**
	 * 
	 */
	public GppPtMstr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 重新加载数据
	 */
	private static void reloadData() {
		
		
		ptmstr = new  ArrayList<PtMstr>();
		
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
				PtMstr temp_PtMstr = new PtMstr();
				PtMstrId temp_id = new PtMstrId();

				temp_id.setPtPart(rst.getString("pt_part"));

				temp_PtMstr.setPtDesc1(rst.getString("pt_desc1"));
				temp_PtMstr.setPtDesc2(rst.getString("pt_desc2"));
				temp_PtMstr.setPtUm(rst.getString("pt_um"));
				temp_PtMstr.setPtQad13(rst.getString("pt__qad13"));
				temp_PtMstr.setPtQad12(rst.getDouble("pt__qad12"));
				temp_PtMstr.setPtDraw(rst.getString("pt_draw"));
				temp_PtMstr.setPtProdLine(rst.getString("pt_prod_line"));
				temp_PtMstr.setPtGroup(rst.getString("pt_group"));
				temp_PtMstr.setPtPartType(rst.getString("pt_part_type"));
				temp_PtMstr.setPtStatus(rst.getString("pt_status"));
				temp_PtMstr.setPtAbc(rst.getString("pt_abc"));
				temp_PtMstr.setPtIssPol(rst.getBoolean("pt_iss_pol"));
				temp_PtMstr.setPtPhantom(rst.getBoolean("pt_phantom"));
				temp_PtMstr.setPtLoc(rst.getString("pt_loc"));
				temp_PtMstr.setPtQad01(rst.getDouble("pt__qad01"));
				temp_PtMstr.setPtQad02(rst.getDouble("pt__qad02"));
				temp_PtMstr.setPtAbcAmt(rst.getDouble("pt_abc_amt"));
				temp_PtMstr.setPtQad03(rst.getDouble("pt__qad03"));
				temp_PtMstr.setPtQad04(rst.getDouble("pt__qad04"));
				temp_PtMstr.setPtAvgInt(rst.getInt("pt_avg_int"));
				temp_PtMstr.setPtQad05(rst.getDate("pt__qad05"));
				temp_PtMstr.setPtCycInt(rst.getInt("pt_cyc_int"));
				temp_PtMstr.setPtQad06(rst.getDate("pt__qad06"));
				temp_PtMstr.setPtQad07(rst.getDate("pt__qad07"));
				temp_PtMstr.setPtQad08(rst.getDate("pt__qad08"));
				temp_PtMstr.setPtMs(rst.getBoolean("pt_ms"));
				temp_PtMstr.setPtPlanOrd(rst.getBoolean("pt_plan_ord"));
				temp_PtMstr.setPtMrp(rst.getBoolean("pt_mrp"));
				temp_PtMstr.setPtOrdPol(rst.getString("pt_ord_pol"));
				temp_PtMstr.setPtOrdQty(rst.getDouble("pt_ord_qty"));
				temp_PtMstr.setPtOrdPer(rst.getInt("pt_ord_per"));
				temp_PtMstr.setPtSftyStk(rst.getBigDecimal("pt_sfty_stk"));
				temp_PtMstr.setPtSftyTime(rst.getBigDecimal("pt_sfty_time"));
				temp_PtMstr.setPtRop(rst.getBigDecimal("pt_rop"));
				temp_PtMstr.setPtBuyer(rst.getString("pt_buyer"));
				temp_PtMstr.setPtVend(rst.getString("pt_vend"));
				temp_PtMstr.setPtQad09(rst.getDouble("pt__qad09"));
				temp_PtMstr.setPtPmCode(rst.getString("pt_pm_code"));
				temp_PtMstr.setPtMfgLead(rst.getBigDecimal("pt_mfg_lead"));
				temp_PtMstr.setPtPurLead(rst.getInt("pt_pur_lead"));
				temp_PtMstr.setPtInspRqd(rst.getBoolean("pt_insp_rqd"));
				temp_PtMstr.setPtInspLead(rst.getInt("pt_insp_lead"));
				temp_PtMstr.setPtCumLead(rst.getInt("pt_cum_lead"));
				temp_PtMstr.setPtOrdMin(rst.getBigDecimal("pt_ord_min"));
				temp_PtMstr.setPtOrdMax(rst.getBigDecimal("pt_ord_max"));
				temp_PtMstr.setPtOrdMult(rst.getBigDecimal("pt_ord_mult"));
				temp_PtMstr.setPtYieldPct(rst.getDouble("pt_yield_pct"));
				temp_PtMstr.setPtQad16(rst.getBigDecimal("pt__qad16"));
				temp_PtMstr.setPtSetup(rst.getDouble("pt_setup"));
				temp_PtMstr.setPtSetupLl(rst.getDouble("pt_setup_ll"));
				temp_PtMstr.setPtRunLl(rst.getDouble("pt_run_ll"));
				temp_PtMstr.setPtRun(rst.getDouble("pt_run"));
				temp_PtMstr.setPtPrice(rst.getDouble("pt_price"));
				temp_PtMstr.setPtXmtlTl(rst.getDouble("pt_xmtl_tl"));
				temp_PtMstr.setPtXlbrTl(rst.getDouble("pt_xlbr_tl"));
				temp_PtMstr.setPtXbdnTl(rst.getDouble("pt_xbdn_tl"));
				temp_PtMstr.setPtXsubTl(rst.getDouble("pt_xsub_tl"));
				temp_PtMstr.setPtXmtlLl(rst.getDouble("pt_xmtl_ll"));
				temp_PtMstr.setPtXlbrLl(rst.getDouble("pt_xlbr_ll"));
				temp_PtMstr.setPtXbdnLl(rst.getDouble("pt_xbdn_ll"));
				temp_PtMstr.setPtXsubLl(rst.getDouble("pt_xsub_ll"));
				temp_PtMstr.setPtXtotCur(rst.getDouble("pt_xtot_cur"));
				temp_PtMstr.setPtCurDate(rst.getDate("pt_cur_date"));
				temp_PtMstr.setPtXmtlStdtl(rst.getDouble("pt_xmtl_stdtl"));
				temp_PtMstr.setPtXlbrStdtl(rst.getDouble("pt_xlbr_stdtl"));
				temp_PtMstr.setPtXbdnStdtl(rst.getDouble("pt_xbdn_stdtl"));
				temp_PtMstr.setPtXsubStdtl(rst.getDouble("pt_xsub_stdtl"));
				temp_PtMstr.setPtXtotStd(rst.getDouble("pt_xtot_std"));
				temp_PtMstr.setPtStdDate(rst.getDate("pt_std_date"));
				temp_PtMstr.setPtLlCode(rst.getInt("pt_ll_code"));
				temp_PtMstr.setPtAbcQty(rst.getDouble("pt_abc_qty"));
				temp_PtMstr.setPtQad10(rst.getDouble("pt__qad10"));
				temp_PtMstr.setPtQad11(rst.getDouble("pt__qad11"));
				temp_PtMstr.setPtRouting(rst.getString("pt_routing"));
				temp_PtMstr.setPtLotSer(rst.getString("pt_lot_ser"));
				temp_PtMstr.setPtTimefence(rst.getInt("pt_timefence"));
				temp_PtMstr.setPtXmtlStdll(rst.getDouble("pt_xmtl_stdll"));
				temp_PtMstr.setPtXlbrStdll(rst.getDouble("pt_xlbr_stdll"));
				temp_PtMstr.setPtXbdnStdll(rst.getDouble("pt_xbdn_stdll"));
				temp_PtMstr.setPtXsubStdll(rst.getDouble("pt_xsub_stdll"));
				temp_PtMstr.setPtRev(rst.getString("pt_rev"));
				temp_PtMstr.setPtLastEco(rst.getDate("pt_last_eco"));
				temp_PtMstr.setPtQad15(rst.getBoolean("pt__qad15"));
				temp_PtMstr.setPtQad17(rst.getBoolean("pt__qad17"));
				temp_PtMstr.setPtQcLead(rst.getInt("pt_qc_lead"));
				temp_PtMstr.setPtAutoLot(rst.getBoolean("pt_auto_lot"));
				temp_PtMstr.setPtAssay(rst.getDouble("pt_assay"));
				temp_PtMstr.setPtBatch(rst.getDouble("pt_batch"));
				temp_PtMstr.setPtQad14(rst.getDate("pt__qad14"));
				temp_PtMstr.setPtUser3(rst.getString("pt_user3"));
				temp_PtMstr.setPtUser1(rst.getString("pt_user1"));
				temp_PtMstr.setPtUser2(rst.getString("pt_user2"));
				temp_PtMstr.setPtNetWt(rst.getDouble("pt_net_wt"));
				temp_PtMstr.setPtNetWtUm(rst.getString("pt_net_wt_um"));
				temp_PtMstr.setPtSize(rst.getDouble("pt_size"));
				temp_PtMstr.setPtSizeUm(rst.getString("pt_size_um"));
				temp_PtMstr.setPtTaxable(rst.getBoolean("pt_taxable"));
				temp_PtMstr.setPtTaxc(rst.getString("pt_taxc"));
				temp_PtMstr.setPtRollup(rst.getBoolean("pt_rollup"));
				temp_PtMstr.setPtXovhLl(rst.getDouble("pt_xovh_ll"));
				temp_PtMstr.setPtXovhTl(rst.getDouble("pt_xovh_tl"));
				temp_PtMstr.setPtXovhStdll(rst.getDouble("pt_xovh_stdll"));
				temp_PtMstr.setPtXovhStdtl(rst.getDouble("pt_xovh_stdtl"));
				temp_PtMstr.setPtSite(rst.getString("pt_site"));
				temp_PtMstr.setPtShelflife(rst.getInt("pt_shelflife"));
				temp_PtMstr.setPtCritical(rst.getBoolean("pt_critical"));
				temp_PtMstr.setPtSnglLot(rst.getBoolean("pt_sngl_lot"));
				temp_PtMstr.setPtUpc(rst.getString("pt_upc"));
				temp_PtMstr.setPtHazard(rst.getString("pt_hazard"));
				temp_PtMstr.setPtAdded(rst.getDate("pt_added"));
				temp_PtMstr.setPtChr01(rst.getString("pt__chr01"));
				temp_PtMstr.setPtChr02(rst.getString("pt__chr02"));
				temp_PtMstr.setPtChr03(rst.getString("pt__chr03"));
				temp_PtMstr.setPtChr04(rst.getString("pt__chr04"));
				temp_PtMstr.setPtChr05(rst.getString("pt__chr05"));
				temp_PtMstr.setPtChr06(rst.getString("pt__chr06"));
				temp_PtMstr.setPtChr07(rst.getString("pt__chr07"));
				temp_PtMstr.setPtChr08(rst.getString("pt__chr08"));
				temp_PtMstr.setPtChr09(rst.getString("pt__chr09"));
				temp_PtMstr.setPtChr10(rst.getString("pt__chr10"));
				temp_PtMstr.setPtDte01(rst.getDate("pt__dte01"));
				temp_PtMstr.setPtDte02(rst.getDate("pt__dte02"));
				temp_PtMstr.setPtDec01(rst.getDouble("pt__dec01"));
				temp_PtMstr.setPtDec02(rst.getDouble("pt__dec02"));
				temp_PtMstr.setPtLog01(rst.getBoolean("pt__log01"));
				temp_PtMstr.setPtLog02(rst.getBoolean("pt__log02"));
				temp_PtMstr.setPtQad18(rst.getDouble("pt__qad18"));
				temp_PtMstr.setPtQad21(rst.getDouble("pt__qad21"));
				temp_PtMstr.setPtQad19(rst.getDouble("pt__qad19"));
				temp_PtMstr.setPtQad20(rst.getDouble("pt__qad20"));
				temp_PtMstr.setPtLength(rst.getDouble("pt_length"));
				temp_PtMstr.setPtHeight(rst.getDouble("pt_height"));
				temp_PtMstr.setPtWidth(rst.getDouble("pt_width"));
				temp_PtMstr.setPtDimUm(rst.getString("pt_dim_um"));
				temp_PtMstr.setPtPkgCode(rst.getString("pt_pkg_code"));
				temp_PtMstr.setPtNetwork(rst.getString("pt_network"));
				temp_PtMstr.setPtLlDrp(rst.getInt("pt_ll_drp"));
				temp_PtMstr.setPtFrClass(rst.getString("pt_fr_class"));
				temp_PtMstr.setPtSpecHdlg(rst.getString("pt_spec_hdlg"));
				temp_PtMstr.setPtBomCode(rst.getString("pt_bom_code"));
				temp_PtMstr.setPtLocType(rst.getString("pt_loc_type"));
				temp_PtMstr.setPtTranstype(rst.getString("pt_transtype"));
				temp_PtMstr.setPtCover(rst.getString("pt_cover"));
				temp_PtMstr.setPtUnitIsb(rst.getBoolean("pt_unit_isb"));
				temp_PtMstr.setPtArticle(rst.getString("pt_article"));
				temp_PtMstr.setPtPoSite(rst.getString("pt_po_site"));
				temp_PtMstr.setPtShipWt(rst.getDouble("pt_ship_wt"));
				temp_PtMstr.setPtShipWtUm(rst.getString("pt_ship_wt_um"));
				temp_PtMstr.setPtFormula(rst.getBoolean("pt_formula"));
				temp_PtMstr.setPtDea(rst.getBoolean("pt_dea"));
				temp_PtMstr.setPtQad26(rst.getBoolean("pt__qad26"));
				temp_PtMstr.setPtQad22(rst.getBoolean("pt__qad22"));
				temp_PtMstr.setPtQad25(rst.getInt("pt__qad25"));
				temp_PtMstr.setPtQad24(rst.getInt("pt__qad24"));
				temp_PtMstr.setPtQad23(rst.getInt("pt__qad23"));
				temp_PtMstr.setPtCommCode(rst.getString("pt_comm_code"));
				temp_PtMstr.setPtInstCall(rst.getBoolean("pt_inst_call"));
				temp_PtMstr.setPtSysType(rst.getString("pt_sys_type"));
				temp_PtMstr.setPtTariff(rst.getString("pt_tariff"));
				temp_PtMstr.setPtOrigin(rst.getString("pt_origin"));
				temp_PtMstr.setPtSttr(rst.getDouble("pt_sttr"));
				temp_PtMstr.setPtMfgMtbf(rst.getDouble("pt_mfg_mtbf"));
				temp_PtMstr.setPtMfgMttr(rst.getDouble("pt_mfg_mttr"));
				temp_PtMstr.setPtFru(rst.getBoolean("pt_fru"));
				temp_PtMstr.setPtVenWarr(rst.getBoolean("pt_ven_warr"));
				temp_PtMstr.setPtSvcGroup(rst.getString("pt_svc_group"));
				temp_PtMstr.setPtSvcType(rst.getString("pt_svc_type"));
				temp_PtMstr.setPtMtbf(rst.getDouble("pt_mtbf"));
				temp_PtMstr.setPtMttr(rst.getDouble("pt_mttr"));
				temp_PtMstr.setPtIsb(rst.getBoolean("pt_isb"));
				temp_PtMstr.setPtPvmDays(rst.getInt("pt_pvm_days"));
				temp_PtMstr.setPtWarrCd(rst.getString("pt_warr_cd"));
				temp_PtMstr.setPtModDate(rst.getDate("pt_mod_date"));
				temp_PtMstr.setPtUserid(rst.getString("pt_userid"));
				temp_PtMstr.setPtObsDate(rst.getDate("pt_obs_date"));
				temp_PtMstr.setPtPvmBom(rst.getString("pt_pvm_bom"));
				temp_PtMstr.setPtPvmRoute(rst.getString("pt_pvm_route"));
				temp_PtMstr.setPtPvmUm(rst.getString("pt_pvm_um"));
				temp_PtMstr.setPtRpBom(rst.getString("pt_rp_bom"));
				temp_PtMstr.setPtRpRoute(rst.getString("pt_rp_route"));
				temp_PtMstr.setPtRpVendor(rst.getString("pt_rp_vendor"));
				temp_PtMstr.setPtRctpoStatus(rst.getString("pt_rctpo_status"));
				temp_PtMstr.setPtRollupId(rst.getString("pt_rollup_id"));
				temp_PtMstr.setPtSpecGrav(rst.getDouble("pt_spec_grav"));
				temp_PtMstr.setPtJointType(rst.getString("pt_joint_type"));
				temp_PtMstr.setPtMfgPct(rst.getDouble("pt_mfg_pct"));
				temp_PtMstr.setPtPurPct(rst.getDouble("pt_pur_pct"));
				temp_PtMstr.setPtDrpPct(rst.getDouble("pt_drp_pct"));
				temp_PtMstr.setPtPouCode(rst.getString("pt_pou_code"));
				temp_PtMstr.setPtWksAvg(rst.getDouble("pt_wks_avg"));
				temp_PtMstr.setPtWksMax(rst.getDouble("pt_wks_max"));
				temp_PtMstr.setPtWksMin(rst.getDouble("pt_wks_min"));
				temp_PtMstr.setPtPickLogic(rst.getInt("pt_pick_logic"));
				temp_PtMstr.setPtFiscalClass(rst.getString("pt_fiscal_class"));
				temp_PtMstr.setPtDsgnGrp(rst.getString("pt_dsgn_grp"));
				temp_PtMstr.setPtDrwgLoc(rst.getString("pt_drwg_loc"));
				temp_PtMstr.setPtEcnRev(rst.getString("pt_ecn_rev"));
				temp_PtMstr.setPtDrwgSize(rst.getString("pt_drwg_size"));
				temp_PtMstr.setPtModel(rst.getString("pt_model"));
				temp_PtMstr.setPtRepairable(rst.getBoolean("pt_repairable"));
				temp_PtMstr.setPtRctwoStatus(rst.getString("pt_rctwo_status"));
				temp_PtMstr.setPtLotGrp(rst.getString("pt_lot_grp"));
				temp_PtMstr.setPtRctpoActive(rst.getBoolean("pt_rctpo_active"));
				temp_PtMstr.setPtRctwoActive(rst.getBoolean("pt_rctwo_active"));
				temp_PtMstr.setPtBreakCat(rst.getString("pt_break_cat"));
				temp_PtMstr.setPtFscCode(rst.getString("pt_fsc_code"));
				temp_PtMstr.setPtTraceActive(rst.getBoolean("pt_trace_active"));
				temp_PtMstr.setPtTraceDetail(rst.getBoolean("pt_trace_detail"));
				temp_PtMstr.setPtPmMrp(rst.getBoolean("pt_pm_mrp"));
				temp_PtMstr.setPtInsCallType(rst.getString("pt_ins_call_type"));
				temp_PtMstr.setPtInsBom(rst.getString("pt_ins_bom"));
				temp_PtMstr.setPtInsRoute(rst.getString("pt_ins_route"));
				temp_PtMstr.setPtPromo(rst.getString("pt_promo"));
				temp_PtMstr.setPtMeterInterval(rst.getDouble("pt_meter_interval"));
				temp_PtMstr.setPtMeterUm(rst.getString("pt_meter_um"));
				temp_PtMstr.setPtWh(rst.getBoolean("pt_wh"));
				temp_PtMstr.setPtBtbType(rst.getString("pt_btb_type"));
				temp_PtMstr.setPtCfgType(rst.getString("pt_cfg_type"));
				temp_PtMstr.setPtAppOwner(rst.getString("pt_app_owner"));
				temp_PtMstr.setPtOpYield(rst.getBoolean("pt_op_yield"));
				temp_PtMstr.setPtRunSeq1(rst.getString("pt_run_seq1"));
				temp_PtMstr.setPtRunSeq2(rst.getString("pt_run_seq2"));
				temp_PtMstr.setPtAtpEnforcement(rst.getString("pt_atp_enforcement"));
				temp_PtMstr.setPtAtpFamily(rst.getBoolean("pt_atp_family"));
				temp_id.setPtDomain(rst.getString("pt_domain"));
				temp_PtMstr.setOidPtMstr(rst.getDouble("oid_pt_mstr"));

				temp_PtMstr.setId(temp_id);
				
				
				ptmstr.add(temp_PtMstr);
				
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
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"pt_mstr\" where \"MFGPROD\".\"PUB\".\"pt_mstr\".\"pt_domain\"='"+GlobalParameter.getLoginSession().getDomain()+"'";
		
		reloadDataFromSQL();
	
	}
	
	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from pt_mstr where pt_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from pt_mstr where pt_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		PtMstrDAO dao = PtMstrDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("PtMstr"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			if (((PtMstr) o).getId().getPtDomain().equals(
					GlobalParameter.getLoginSession().getDomain())) {
				ptmstr.add((PtMstr) o);
			}
		}
	}
	
	/**
	 * @return the plmstr
	 */
	public static ArrayList<PtMstr> getPtMstr() {
		if(ptmstr == null){
			reloadData();
		}
		return ptmstr;
	}
}
