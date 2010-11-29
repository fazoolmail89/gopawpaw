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
import com.gopawpaw.erp.hibernate.p.PlMstr;
import com.gopawpaw.erp.hibernate.p.PlMstrDAO;
import com.gopawpaw.erp.hibernate.p.PlMstrId;

/**
 * @version 2010-4-21
 * @author 李锦华
 * 
 */
public class GppPlMstr {

	private static ArrayList<PlMstr> plmstr = null;
	private static String gpp_sqlstr = "";
	/**
	 * 
	 */
	public GppPlMstr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 重新加载数据
	 */
	private static void reloadData() {

		plmstr = new ArrayList<PlMstr>();

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
				PlMstr temp_PlMstr = new PlMstr();
				PlMstrId temp_id = new PlMstrId();

				temp_id.setPlProdLine(rst.getString("pl_prod_line"));
				temp_PlMstr.setPlDesc(rst.getString("pl_desc"));
				temp_PlMstr.setPlSlsAcct(rst.getString("pl_sls_acct"));
				temp_PlMstr.setPlInvAcct(rst.getString("pl_inv_acct"));
				temp_PlMstr.setPlWipAcct(rst.getString("pl_wip_acct"));
				temp_PlMstr.setPlCogAcct(rst.getString("pl_cog_acct"));
				temp_PlMstr.setPlPurAcct(rst.getString("pl_pur_acct"));
				temp_PlMstr.setPlScrpAcct(rst.getString("pl_scrp_acct"));
				temp_PlMstr.setPlDscrAcct(rst.getString("pl_dscr_acct"));
				temp_PlMstr.setPlSlsCc(rst.getString("pl_sls_cc"));
				temp_PlMstr.setPlInvCc(rst.getString("pl_inv_cc"));
				temp_PlMstr.setPlWipCc(rst.getString("pl_wip_cc"));
				temp_PlMstr.setPlCogCc(rst.getString("pl_cog_cc"));
				temp_PlMstr.setPlPurCc(rst.getString("pl_pur_cc"));
				temp_PlMstr.setPlScrpCc(rst.getString("pl_scrp_cc"));
				temp_PlMstr.setPlDscrCc(rst.getString("pl_dscr_cc"));
				temp_PlMstr.setPlPpvAcct(rst.getString("pl_ppv_acct"));
				temp_PlMstr.setPlPpvCc(rst.getString("pl_ppv_cc"));
				temp_PlMstr.setPlRcptAcct(rst.getString("pl_rcpt_acct"));
				temp_PlMstr.setPlRcptCc(rst.getString("pl_rcpt_cc"));
				temp_PlMstr.setPlDscAcct(rst.getString("pl_dsc_acct"));
				temp_PlMstr.setPlDscCc(rst.getString("pl_dsc_cc"));
				temp_PlMstr.setPlWvarAcct(rst.getString("pl_wvar_acct"));
				temp_PlMstr.setPlWvarCc(rst.getString("pl_wvar_cc"));
				temp_PlMstr.setPlTaxc(rst.getString("pl_taxc"));
				temp_PlMstr.setPlTaxable(rst.getBoolean("pl_taxable"));
				temp_PlMstr.setPlUser1(rst.getString("pl_user1"));
				temp_PlMstr.setPlUser2(rst.getString("pl_user2"));
				temp_PlMstr.setPlPst(rst.getBoolean("pl_pst"));
				temp_PlMstr.setPlEslsAcct(rst.getString("pl_esls_acct"));
				temp_PlMstr.setPlEslsCc(rst.getString("pl_esls_cc"));
				temp_PlMstr.setPlChr01(rst.getString("pl__chr01"));
				temp_PlMstr.setPlChr02(rst.getString("pl__chr02"));
				temp_PlMstr.setPlChr03(rst.getString("pl__chr03"));
				temp_PlMstr.setPlChr04(rst.getString("pl__chr04"));
				temp_PlMstr.setPlChr05(rst.getString("pl__chr05"));
				temp_PlMstr.setPlDte01(rst.getDate("pl__dte01"));
				temp_PlMstr.setPlDte02(rst.getDate("pl__dte02"));
				temp_PlMstr.setPlDec01(rst.getDouble("pl__dec01"));
				temp_PlMstr.setPlDec02(rst.getDouble("pl__dec02"));
				temp_PlMstr.setPlLog01(rst.getBoolean("pl__log01"));
				temp_PlMstr.setPlGroup(rst.getString("pl_group"));
				temp_PlMstr.setPlDivision(rst.getString("pl_division"));
				temp_PlMstr.setPlCchgAcct(rst.getString("pl_cchg_acct"));
				temp_PlMstr.setPlCchgCc(rst.getString("pl_cchg_cc"));
				temp_PlMstr.setPlCmtlAcct(rst.getString("pl_cmtl_acct"));
				temp_PlMstr.setPlCmtlCc(rst.getString("pl_cmtl_cc"));
				temp_PlMstr.setPlClbrAcct(rst.getString("pl_clbr_acct"));
				temp_PlMstr.setPlClbrCc(rst.getString("pl_clbr_cc"));
				temp_PlMstr.setPlCbdnAcct(rst.getString("pl_cbdn_acct"));
				temp_PlMstr.setPlCbdnCc(rst.getString("pl_cbdn_cc"));
				temp_PlMstr.setPlCovhAcct(rst.getString("pl_covh_acct"));
				temp_PlMstr.setPlCovhCc(rst.getString("pl_covh_cc"));
				temp_PlMstr.setPlCsubAcct(rst.getString("pl_csub_acct"));
				temp_PlMstr.setPlCsubCc(rst.getString("pl_csub_cc"));
				temp_PlMstr.setPlApvrAcct(rst.getString("pl_apvr_acct"));
				temp_PlMstr.setPlApvrCc(rst.getString("pl_apvr_cc"));
				temp_PlMstr.setPlApvuAcct(rst.getString("pl_apvu_acct"));
				temp_PlMstr.setPlApvuCc(rst.getString("pl_apvu_cc"));
				temp_PlMstr.setPlOvhAcct(rst.getString("pl_ovh_acct"));
				temp_PlMstr.setPlOvhCc(rst.getString("pl_ovh_cc"));
				temp_PlMstr.setPlMvarAcct(rst.getString("pl_mvar_acct"));
				temp_PlMstr.setPlMvarCc(rst.getString("pl_mvar_cc"));
				temp_PlMstr.setPlMvrrAcct(rst.getString("pl_mvrr_acct"));
				temp_PlMstr.setPlMvrrCc(rst.getString("pl_mvrr_cc"));
				temp_PlMstr.setPlSvarAcct(rst.getString("pl_svar_acct"));
				temp_PlMstr.setPlSvarCc(rst.getString("pl_svar_cc"));
				temp_PlMstr.setPlSvrrAcct(rst.getString("pl_svrr_acct"));
				temp_PlMstr.setPlSvrrCc(rst.getString("pl_svrr_cc"));
				temp_PlMstr.setPlCopAcct(rst.getString("pl_cop_acct"));
				temp_PlMstr.setPlCopCc(rst.getString("pl_cop_cc"));
				temp_PlMstr.setPlFlrAcct(rst.getString("pl_flr_acct"));
				temp_PlMstr.setPlFlrCc(rst.getString("pl_flr_cc"));
				temp_PlMstr.setPlModDate(rst.getDate("pl_mod_date"));
				temp_PlMstr.setPlUserid(rst.getString("pl_userid"));
				temp_PlMstr.setPlQadc08(rst.getString("pl__qadc08"));
				temp_PlMstr.setPlQadc09(rst.getString("pl__qadc09"));
				temp_PlMstr.setPlQadc14(rst.getString("pl__qadc14"));
				temp_PlMstr.setPlQadc15(rst.getString("pl__qadc15"));
				temp_PlMstr.setPlRmarAcct(rst.getString("pl_rmar_acct"));
				temp_PlMstr.setPlRmarCc(rst.getString("pl_rmar_cc"));
				temp_PlMstr.setPlQadc12(rst.getString("pl__qadc12"));
				temp_PlMstr.setPlQadc13(rst.getString("pl__qadc13"));
				temp_PlMstr.setPlQadc06(rst.getString("pl__qadc06"));
				temp_PlMstr.setPlQadc07(rst.getString("pl__qadc07"));
				temp_PlMstr.setPlFiscalClass(rst.getString("pl_fiscal_class"));
				temp_PlMstr.setPlXvarAcct(rst.getString("pl_xvar_acct"));
				temp_PlMstr.setPlXvarCc(rst.getString("pl_xvar_cc"));
				temp_PlMstr.setPlFslbrAcct(rst.getString("pl_fslbr_acct"));
				temp_PlMstr.setPlFsbdnAcct(rst.getString("pl_fsbdn_acct"));
				temp_PlMstr.setPlFsexpAcct(rst.getString("pl_fsexp_acct"));
				temp_PlMstr.setPlFsexdAcct(rst.getString("pl_fsexd_acct"));
				temp_PlMstr.setPlQadc10(rst.getString("pl__qadc10"));
				temp_PlMstr.setPlFslbrCc(rst.getString("pl_fslbr_cc"));
				temp_PlMstr.setPlFsbdnCc(rst.getString("pl_fsbdn_cc"));
				temp_PlMstr.setPlQadc11(rst.getString("pl__qadc11"));
				temp_PlMstr.setPlFsexpCc(rst.getString("pl_fsexp_cc"));
				temp_PlMstr.setPlFsexdCc(rst.getString("pl_fsexd_cc"));
				temp_PlMstr.setPlFsrcInvCc(rst.getString("pl_fsrc_inv_cc"));
				temp_PlMstr.setPlFscmInvAcct(rst.getString("pl_fscm_inv_acct"));
				temp_PlMstr.setPlFscmInvCc(rst.getString("pl_fscm_inv_cc"));
				temp_PlMstr.setPlFsrcInvAcct(rst.getString("pl_fsrc_inv_acct"));
				temp_PlMstr.setPlQadc01(rst.getString("pl__qadc01"));
				temp_PlMstr.setPlQadc02(rst.getString("pl__qadc02"));
				temp_PlMstr.setPlQadc03(rst.getString("pl__qadc03"));
				temp_PlMstr.setPlQadc04(rst.getString("pl__qadc04"));
				temp_PlMstr.setPlQadc05(rst.getString("pl__qadc05"));
				temp_PlMstr.setPlQadl01(rst.getBoolean("pl__qadl01"));
				temp_PlMstr.setPlQadt01(rst.getDate("pl__qadt01"));
				temp_PlMstr.setPlQadd01(rst.getDouble("pl__qadd01"));
				temp_PlMstr.setPlApvrSub(rst.getString("pl_apvr_sub"));
				temp_PlMstr.setPlApvuSub(rst.getString("pl_apvu_sub"));
				temp_PlMstr.setPlCbdnSub(rst.getString("pl_cbdn_sub"));
				temp_PlMstr.setPlCchgSub(rst.getString("pl_cchg_sub"));
				temp_PlMstr.setPlClbrSub(rst.getString("pl_clbr_sub"));
				temp_PlMstr.setPlCmtlSub(rst.getString("pl_cmtl_sub"));
				temp_PlMstr.setPlCogSub(rst.getString("pl_cog_sub"));
				temp_PlMstr.setPlCopSub(rst.getString("pl_cop_sub"));
				temp_PlMstr.setPlCovhSub(rst.getString("pl_covh_sub"));
				temp_PlMstr.setPlCsubSub(rst.getString("pl_csub_sub"));
				temp_PlMstr.setPlDscrSub(rst.getString("pl_dscr_sub"));
				temp_PlMstr.setPlDscSub(rst.getString("pl_dsc_sub"));
				temp_PlMstr.setPlFlrSub(rst.getString("pl_flr_sub"));
				temp_PlMstr.setPlFsbdnSub(rst.getString("pl_fsbdn_sub"));
				temp_PlMstr.setPlFscmInvSub(rst.getString("pl_fscm_inv_sub"));
				temp_PlMstr.setPlFsexdSub(rst.getString("pl_fsexd_sub"));
				temp_PlMstr.setPlFsexpSub(rst.getString("pl_fsexp_sub"));
				temp_PlMstr.setPlFslbrSub(rst.getString("pl_fslbr_sub"));
				temp_PlMstr.setPlFsrcInvSub(rst.getString("pl_fsrc_inv_sub"));
				temp_PlMstr.setPlInvSub(rst.getString("pl_inv_sub"));
				temp_PlMstr.setPlMvarSub(rst.getString("pl_mvar_sub"));
				temp_PlMstr.setPlMvrrSub(rst.getString("pl_mvrr_sub"));
				temp_PlMstr.setPlOvhSub(rst.getString("pl_ovh_sub"));
				temp_PlMstr.setPlPpvSub(rst.getString("pl_ppv_sub"));
				temp_PlMstr.setPlPurSub(rst.getString("pl_pur_sub"));
				temp_PlMstr.setPlRcptSub(rst.getString("pl_rcpt_sub"));
				temp_PlMstr.setPlRmarSub(rst.getString("pl_rmar_sub"));
				temp_PlMstr.setPlScrpSub(rst.getString("pl_scrp_sub"));
				temp_PlMstr.setPlSlsSub(rst.getString("pl_sls_sub"));
				temp_PlMstr.setPlSvarSub(rst.getString("pl_svar_sub"));
				temp_PlMstr.setPlSvrrSub(rst.getString("pl_svrr_sub"));
				temp_PlMstr.setPlWipSub(rst.getString("pl_wip_sub"));
				temp_PlMstr.setPlWvarSub(rst.getString("pl_wvar_sub"));
				temp_PlMstr.setPlXvarSub(rst.getString("pl_xvar_sub"));
				temp_PlMstr.setPlXferAcct(rst.getString("pl_xfer_acct"));
				temp_PlMstr.setPlXferSub(rst.getString("pl_xfer_sub"));
				temp_PlMstr.setPlXferCc(rst.getString("pl_xfer_cc"));
				temp_PlMstr.setPlFsdefAcct(rst.getString("pl_fsdef_acct"));
				temp_PlMstr.setPlFsdefSub(rst.getString("pl_fsdef_sub"));
				temp_PlMstr.setPlFsdefCc(rst.getString("pl_fsdef_cc"));
				temp_PlMstr.setPlFsaccrAcct(rst.getString("pl_fsaccr_acct"));
				temp_PlMstr.setPlFsaccrSub(rst.getString("pl_fsaccr_sub"));
				temp_PlMstr.setPlFsaccrCc(rst.getString("pl_fsaccr_cc"));
				temp_id.setPlDomain(rst.getString("pl_domain"));
				temp_PlMstr.setOidPlMstr(rst.getDouble("oid_pl_mstr"));

				temp_PlMstr.setId(temp_id);

				
				plmstr.add(temp_PlMstr);
				
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
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"pl_mstr\" where \"MFGPROD\".\"PUB\".\"pl_mstr\".\"pl_domain\"='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}
	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from pl_mstr where pl_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from pl_mstr where pl_domain='"+GlobalParameter.getLoginSession().getDomain()+"'";
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		PlMstrDAO dao = PlMstrDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("PlMstr"));
		List<?> l = dao.findAll();

		for (Object o : l) {
			if (((PlMstr) o).getId().getPlDomain().equals(
					GlobalParameter.getLoginSession().getDomain())) {
				plmstr.add((PlMstr) o);
			}
		}
	}

	/**
	 * @return the plmstr
	 */
	public static ArrayList<PlMstr> getPlMstr() {
		if (plmstr == null) {
			reloadData();
		}
		return plmstr;
	}

}
