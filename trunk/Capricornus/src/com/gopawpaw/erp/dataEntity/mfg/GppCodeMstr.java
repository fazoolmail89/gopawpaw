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
import com.gopawpaw.erp.hibernate.c.CodeMstr;
import com.gopawpaw.erp.hibernate.c.CodeMstrDAO;
import com.gopawpaw.erp.hibernate.c.CodeMstrId;

/**
 * @version 2010-4-16
 * @author 李锦华
 * 
 */
public class GppCodeMstr {

	private static ArrayList<CodeMstr> abd_conv = null;
	private static ArrayList<CodeMstr> ac_type = null;
	private static ArrayList<CodeMstr> calltype = null;
	private static ArrayList<CodeMstr> ca_problem = null;
	private static ArrayList<CodeMstr> ca_resolve = null;
	private static ArrayList<CodeMstr> ca_severity = null;
	private static ArrayList<CodeMstr> cd_type = null;
	private static ArrayList<CodeMstr> cm_promo = null;
	private static ArrayList<CodeMstr> cm_region = null;
	private static ArrayList<CodeMstr> cReportRunnerNSType = null;
	private static ArrayList<CodeMstr> ctry_code1 = null;
	private static ArrayList<CodeMstr> customer_consign = null;
	private static ArrayList<CodeMstr> ded_calc = null;
	private static ArrayList<CodeMstr> ded_freq = null;
	private static ArrayList<CodeMstr> ded_type = null;
	private static ArrayList<CodeMstr> dpc_conv = null;
	private static ArrayList<CodeMstr> dprd_type = null;
	private static ArrayList<CodeMstr> ea_type = null;
	private static ArrayList<CodeMstr> ed_freq = null;
	private static ArrayList<CodeMstr> emp_freq = null;
	private static ArrayList<CodeMstr> emp_pay_type = null;
	private static ArrayList<CodeMstr> emp_status = null;
	private static ArrayList<CodeMstr> estatus = null;
	private static ArrayList<CodeMstr> estatus1 = null;
	private static ArrayList<CodeMstr> flhm_class = null;
	private static ArrayList<CodeMstr> flhm_status = null;
	private static ArrayList<CodeMstr> flhm_type = null;
	private static ArrayList<CodeMstr> fm_type = null;
	private static ArrayList<CodeMstr> freq = null;
	private static ArrayList<CodeMstr> fsskill = null;
	private static ArrayList<CodeMstr> ftxd_freq = null;
	private static ArrayList<CodeMstr> interval_mnemonic = null;
	private static ArrayList<CodeMstr> loc_type = null;
	private static ArrayList<CodeMstr> prd_length = null;
	private static ArrayList<CodeMstr> pt_abc = null;
	private static ArrayList<CodeMstr> pt_cover = null;
	private static ArrayList<CodeMstr> pt_group = null;
	private static ArrayList<CodeMstr> pt_part_type = null;
	private static ArrayList<CodeMstr> pt_promo = null;
	private static ArrayList<CodeMstr> pt_size_um = null;
	private static ArrayList<CodeMstr> pt_svc_type = null;
	private static ArrayList<CodeMstr> pt_sys_type = null;
	private static ArrayList<CodeMstr> pt_um = null;
	private static ArrayList<CodeMstr> rnd_round = null;
	private static ArrayList<CodeMstr> rptpmt_type = null;
	private static ArrayList<CodeMstr> rptpmt_valuetype = null;
	private static ArrayList<CodeMstr> schtype = null;
	private static ArrayList<CodeMstr> sch_sd_pat = null;
	private static ArrayList<CodeMstr> sch_type = null;
	private static ArrayList<CodeMstr> sod_conrep = null;
	private static ArrayList<CodeMstr> srr_problem = null;
	private static ArrayList<CodeMstr> srr_severity = null;
	private static ArrayList<CodeMstr> srr_type = null;
	private static ArrayList<CodeMstr> stat = null;
	private static ArrayList<CodeMstr> st_type = null;
	private static ArrayList<CodeMstr> supplier_consign = null;
	private static ArrayList<CodeMstr> svc_ca_cor_type = null;
	private static ArrayList<CodeMstr> svc_ca_ins_type = null;
	private static ArrayList<CodeMstr> svc_ca_pvm_type = null;
	private static ArrayList<CodeMstr> svc_ca_tec_type = null;
	private static ArrayList<CodeMstr> svc_ca_upd_type = null;
	private static ArrayList<CodeMstr> svd_svc_type = null;
	private static ArrayList<CodeMstr> sv_rsp_um = null;
	private static ArrayList<CodeMstr> sv_type = null;
	private static ArrayList<CodeMstr> tr_type = null;
	private static ArrayList<CodeMstr> tx2_method = null;
	private static ArrayList<CodeMstr> txe_tax_env = null;
	private static ArrayList<CodeMstr> txt_tax_type = null;
	private static ArrayList<CodeMstr> usr_access_loc = null;
	private static ArrayList<CodeMstr> vd_promo = null;

	private static String gpp_sqlstr = "";
	
	/**
	 * 
	 */
	public GppCodeMstr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 重新加载数据
	 */
	private static void reloadData() {

		abd_conv = new ArrayList<CodeMstr>();
		ac_type = new ArrayList<CodeMstr>();
		calltype = new ArrayList<CodeMstr>();
		ca_problem = new ArrayList<CodeMstr>();
		ca_resolve = new ArrayList<CodeMstr>();
		ca_severity = new ArrayList<CodeMstr>();
		cd_type = new ArrayList<CodeMstr>();
		cm_promo = new ArrayList<CodeMstr>();
		cm_region = new ArrayList<CodeMstr>();
		cReportRunnerNSType = new ArrayList<CodeMstr>();
		ctry_code1 = new ArrayList<CodeMstr>();
		customer_consign = new ArrayList<CodeMstr>();
		ded_calc = new ArrayList<CodeMstr>();
		ded_freq = new ArrayList<CodeMstr>();
		ded_type = new ArrayList<CodeMstr>();
		dpc_conv = new ArrayList<CodeMstr>();
		dprd_type = new ArrayList<CodeMstr>();
		ea_type = new ArrayList<CodeMstr>();
		ed_freq = new ArrayList<CodeMstr>();
		emp_freq = new ArrayList<CodeMstr>();
		emp_pay_type = new ArrayList<CodeMstr>();
		emp_status = new ArrayList<CodeMstr>();
		estatus = new ArrayList<CodeMstr>();
		estatus1 = new ArrayList<CodeMstr>();
		flhm_class = new ArrayList<CodeMstr>();
		flhm_status = new ArrayList<CodeMstr>();
		flhm_type = new ArrayList<CodeMstr>();
		fm_type = new ArrayList<CodeMstr>();
		freq = new ArrayList<CodeMstr>();
		fsskill = new ArrayList<CodeMstr>();
		ftxd_freq = new ArrayList<CodeMstr>();
		interval_mnemonic = new ArrayList<CodeMstr>();
		loc_type = new ArrayList<CodeMstr>();
		prd_length = new ArrayList<CodeMstr>();
		pt_abc = new ArrayList<CodeMstr>();
		pt_cover = new ArrayList<CodeMstr>();
		pt_group = new ArrayList<CodeMstr>();
		pt_part_type = new ArrayList<CodeMstr>();
		pt_promo = new ArrayList<CodeMstr>();
		pt_size_um = new ArrayList<CodeMstr>();
		pt_svc_type = new ArrayList<CodeMstr>();
		pt_sys_type = new ArrayList<CodeMstr>();
		pt_um = new ArrayList<CodeMstr>();
		rnd_round = new ArrayList<CodeMstr>();
		rptpmt_type = new ArrayList<CodeMstr>();
		rptpmt_valuetype = new ArrayList<CodeMstr>();
		schtype = new ArrayList<CodeMstr>();
		sch_sd_pat = new ArrayList<CodeMstr>();
		sch_type = new ArrayList<CodeMstr>();
		sod_conrep = new ArrayList<CodeMstr>();
		srr_problem = new ArrayList<CodeMstr>();
		srr_severity = new ArrayList<CodeMstr>();
		srr_type = new ArrayList<CodeMstr>();
		stat = new ArrayList<CodeMstr>();
		st_type = new ArrayList<CodeMstr>();
		supplier_consign = new ArrayList<CodeMstr>();
		svc_ca_cor_type = new ArrayList<CodeMstr>();
		svc_ca_ins_type = new ArrayList<CodeMstr>();
		svc_ca_pvm_type = new ArrayList<CodeMstr>();
		svc_ca_tec_type = new ArrayList<CodeMstr>();
		svc_ca_upd_type = new ArrayList<CodeMstr>();
		svd_svc_type = new ArrayList<CodeMstr>();
		sv_rsp_um = new ArrayList<CodeMstr>();
		sv_type = new ArrayList<CodeMstr>();
		tr_type = new ArrayList<CodeMstr>();
		tx2_method = new ArrayList<CodeMstr>();
		txe_tax_env = new ArrayList<CodeMstr>();
		txt_tax_type = new ArrayList<CodeMstr>();
		usr_access_loc = new ArrayList<CodeMstr>();
		vd_promo = new ArrayList<CodeMstr>();

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
				CodeMstr temp_CodeMstr = new CodeMstr();
				CodeMstrId temp_id = new CodeMstrId();

				temp_id.setCodeFldname(rst.getString("code_fldname"));
				temp_id.setCodeValue(rst.getString("code_value"));

				temp_CodeMstr.setCodeCmmt(rst.getString("code_cmmt"));
				temp_CodeMstr.setCodeUser1(rst.getString("code_user1"));
				temp_CodeMstr.setCodeUser2(rst.getString("code_user2"));
				temp_CodeMstr.setCodeDesc(rst.getString("code_desc"));
				temp_CodeMstr.setCodeQadc01(rst.getString("code__qadc01"));
				temp_id.setCodeDomain(rst.getString("code_domain"));
				temp_CodeMstr.setOidCodeMstr(rst.getDouble("oid_code_mstr"));

				temp_CodeMstr.setId(temp_id);

				if (temp_CodeMstr.getId().getCodeFldname().equals("abd_conv")) {
					abd_conv.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ac_type")) {
					ac_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"calltype")) {
					calltype.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ca_problem")) {
					ca_problem.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ca_resolve")) {
					ca_resolve.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ca_severity")) {
					ca_severity.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"cd_type")) {
					cd_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"cm_promo")) {
					cm_promo.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"cm_region")) {
					cm_region.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"cReportRunnerNSType")) {
					cReportRunnerNSType.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ctry_code1")) {
					ctry_code1.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"customer_consign")) {
					customer_consign.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ded_calc")) {
					ded_calc.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ded_freq")) {
					ded_freq.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ded_type")) {
					ded_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"dpc_conv")) {
					dpc_conv.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"dprd_type")) {
					dprd_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ea_type")) {
					ea_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ed_freq")) {
					ed_freq.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"emp_freq")) {
					emp_freq.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"emp_pay_type")) {
					emp_pay_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"emp_status")) {
					emp_status.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"estatus")) {
					estatus.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"estatus1")) {
					estatus1.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"flhm_class")) {
					flhm_class.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"flhm_status")) {
					flhm_status.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"flhm_type")) {
					flhm_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"fm_type")) {
					fm_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname()
						.equals("freq")) {
					freq.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"fsskill")) {
					fsskill.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"ftxd_freq")) {
					ftxd_freq.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"interval_mnemonic")) {
					interval_mnemonic.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"loc_type")) {
					loc_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"prd_length")) {
					prd_length.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_abc")) {
					pt_abc.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_cover")) {
					pt_cover.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_group")) {
					pt_group.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_part_type")) {
					pt_part_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_promo")) {
					pt_promo.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_size_um")) {
					pt_size_um.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_svc_type")) {
					pt_svc_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_sys_type")) {
					pt_sys_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"pt_um")) {
					pt_um.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"rnd_round")) {
					rnd_round.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"rptpmt_type")) {
					rptpmt_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"rptpmt_valuetype")) {
					rptpmt_valuetype.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"schtype")) {
					schtype.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"sch_sd_pat")) {
					sch_sd_pat.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"sch_type")) {
					sch_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"sod_conrep")) {
					sod_conrep.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"srr_problem")) {
					srr_problem.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"srr_severity")) {
					srr_severity.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"srr_type")) {
					srr_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname()
						.equals("stat")) {
					stat.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"st_type")) {
					st_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"supplier_consign")) {
					supplier_consign.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svc_ca_cor_type")) {
					svc_ca_cor_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svc_ca_ins_type")) {
					svc_ca_ins_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svc_ca_pvm_type")) {
					svc_ca_pvm_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svc_ca_tec_type")) {
					svc_ca_tec_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svc_ca_upd_type")) {
					svc_ca_upd_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"svd_svc_type")) {
					svd_svc_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"sv_rsp_um")) {
					sv_rsp_um.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"sv_type")) {
					sv_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"tr_type")) {
					tr_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"tx2_method")) {
					tx2_method.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"txe_tax_env")) {
					txe_tax_env.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"txt_tax_type")) {
					txt_tax_type.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"usr_access_loc")) {
					usr_access_loc.add(temp_CodeMstr);
				} else if (temp_CodeMstr.getId().getCodeFldname().equals(
						"vd_promo")) {
					vd_promo.add(temp_CodeMstr);
				}

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
		gpp_sqlstr = "select * from \"MFGPROD\".\"PUB\".\"code_mstr\" where \"MFGPROD\".\"PUB\".\"code_mstr\".\"code_domain\"='"
			+ GlobalParameter.getLoginSession().getDomain() + "'";
		
		reloadDataFromSQL();
	}

	/**
	 * 从SQLServer数据库重新加载数据
	 */
	private static void reloadDataFromSQLServer() {
		gpp_sqlstr = "select * from code_mstr where code_domain='"
			+ GlobalParameter.getLoginSession().getDomain() + "'";
		
		reloadDataFromSQL();
	}

	/**
	 * 从Access数据库重新加载数据
	 */
	private static void reloadDataFromAccess() {
		gpp_sqlstr = "select * from code_mstr where code_domain='"
			+ GlobalParameter.getLoginSession().getDomain() + "'";
		
		reloadDataFromSQL();
	}

	/**
	 * 通过 Hibernate 重新加载数据
	 */
	private static void reloadDataFromHibernate() {
		CodeMstrDAO dao = CodeMstrDAO.getFromApplicationContext(GlobalParameter
				.getAppContextXMLClass("CodeMstr"));
		List<?> l = dao.findAll();
		for (Object o : l) {
			// if (((CodeMstr) o).getId().getCodeDomain().equals(
			// GlobalParameter.getLoginSession().getDomain())
			// && ((CodeMstr) o).getId().getCodeFldname().equals(
			// "abd_conv")) {
			// abd_conv.add((CodeMstr) o);
			// System.out.println(((CodeMstr) o).getId().getCodeDomain()
			// + "==" + ((CodeMstr) o).getId().getCodeFldname() + "=="
			// + ((CodeMstr) o).getId().getCodeValue() + "=="
			// + ((CodeMstr) o).getCodeCmmt() + "=="
			// + ((CodeMstr) o).getCodeDesc() + "=="
			// + ((CodeMstr) o).getCodeQadc01() + "=="
			// + ((CodeMstr) o).getCodeUser1() + "=="
			// + ((CodeMstr) o).getCodeUser2() + "=="
			// + ((CodeMstr) o).getOidCodeMstr());
			// } else
			if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"abd_conv")) {
				abd_conv.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("ac_type")) {
				ac_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"calltype")) {
				calltype.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ca_problem")) {
				ca_problem.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ca_resolve")) {
				ca_resolve.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ca_severity")) {
				ca_severity.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("cd_type")) {
				cd_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"cm_promo")) {
				cm_promo.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"cm_region")) {
				cm_region.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"cReportRunnerNSType")) {
				cReportRunnerNSType.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ctry_code1")) {
				ctry_code1.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"customer_consign")) {
				customer_consign.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ded_calc")) {
				ded_calc.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ded_freq")) {
				ded_freq.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ded_type")) {
				ded_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"dpc_conv")) {
				dpc_conv.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"dprd_type")) {
				dprd_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("ea_type")) {
				ea_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("ed_freq")) {
				ed_freq.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"emp_freq")) {
				emp_freq.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"emp_pay_type")) {
				emp_pay_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"emp_status")) {
				emp_status.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("estatus")) {
				estatus.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"estatus1")) {
				estatus1.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"flhm_class")) {
				flhm_class.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"flhm_status")) {
				flhm_status.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"flhm_type")) {
				flhm_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("fm_type")) {
				fm_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals("freq")) {
				freq.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("fsskill")) {
				fsskill.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"ftxd_freq")) {
				ftxd_freq.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"interval_mnemonic")) {
				interval_mnemonic.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"loc_type")) {
				loc_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"prd_length")) {
				prd_length.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals("pt_abc")) {
				pt_abc.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_cover")) {
				pt_cover.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_group")) {
				pt_group.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_part_type")) {

				pt_part_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_promo")) {
				pt_promo.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_size_um")) {
				pt_size_um.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_svc_type")) {
				pt_svc_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"pt_sys_type")) {
				pt_sys_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals("pt_um")) {
				pt_um.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"rnd_round")) {
				rnd_round.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"rptpmt_type")) {
				rptpmt_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"rptpmt_valuetype")) {
				rptpmt_valuetype.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("schtype")) {
				schtype.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"sch_sd_pat")) {
				sch_sd_pat.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"sch_type")) {
				sch_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"sod_conrep")) {
				sod_conrep.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"srr_problem")) {
				srr_problem.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"srr_severity")) {
				srr_severity.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"srr_type")) {
				srr_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals("stat")) {
				stat.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("st_type")) {
				st_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"supplier_consign")) {
				supplier_consign.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svc_ca_cor_type")) {
				svc_ca_cor_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svc_ca_ins_type")) {
				svc_ca_ins_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svc_ca_pvm_type")) {
				svc_ca_pvm_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svc_ca_tec_type")) {
				svc_ca_tec_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svc_ca_upd_type")) {
				svc_ca_upd_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"svd_svc_type")) {
				svd_svc_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"sv_rsp_um")) {
				sv_rsp_um.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("sv_type")) {
				sv_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname()
							.equals("tr_type")) {
				tr_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"tx2_method")) {
				tx2_method.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"txe_tax_env")) {
				txe_tax_env.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"txt_tax_type")) {
				txt_tax_type.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"usr_access_loc")) {
				usr_access_loc.add((CodeMstr) o);
			} else if (((CodeMstr) o).getId().getCodeDomain().equals(
					GlobalParameter.getLoginSession().getDomain())
					&& ((CodeMstr) o).getId().getCodeFldname().equals(
							"vd_promo")) {
				vd_promo.add((CodeMstr) o);
			}
		}

	}

	/**
	 * @return the abd_conv
	 */
	public static ArrayList<CodeMstr> getAbd_conv() {
		if (abd_conv == null) {
			reloadData();
		}
		return abd_conv;
	}

	/**
	 * @return the ac_type
	 */
	public static ArrayList<CodeMstr> getAc_type() {
		if (ac_type == null) {
			reloadData();
		}
		return ac_type;
	}

	/**
	 * @return the calltype
	 */
	public static ArrayList<CodeMstr> getCalltype() {
		if (calltype == null) {
			reloadData();
		}
		return calltype;
	}

	/**
	 * @return the ca_problem
	 */
	public static ArrayList<CodeMstr> getCa_problem() {
		if (ca_problem == null) {
			reloadData();
		}
		return ca_problem;
	}

	/**
	 * @return the ca_resolve
	 */
	public static ArrayList<CodeMstr> getCa_resolve() {
		if (ca_resolve == null) {
			reloadData();
		}
		return ca_resolve;
	}

	/**
	 * @return the ca_severity
	 */
	public static ArrayList<CodeMstr> getCa_severity() {
		if (ca_severity == null) {
			reloadData();
		}
		return ca_severity;
	}

	/**
	 * @return the cd_type
	 */
	public static ArrayList<CodeMstr> getCd_type() {
		if (cd_type == null) {
			reloadData();
		}
		return cd_type;
	}

	/**
	 * @return the cm_promo
	 */
	public static ArrayList<CodeMstr> getCm_promo() {
		if (cm_promo == null) {
			reloadData();
		}
		return cm_promo;
	}

	/**
	 * @return the cm_region
	 */
	public static ArrayList<CodeMstr> getCm_region() {
		if (cm_region == null) {
			reloadData();
		}
		return cm_region;
	}

	/**
	 * @return the cReportRunnerNSType
	 */
	public static ArrayList<CodeMstr> getcReportRunnerNSType() {
		if (cReportRunnerNSType == null) {
			reloadData();
		}
		return cReportRunnerNSType;
	}

	/**
	 * @return the ctry_code1
	 */
	public static ArrayList<CodeMstr> getCtry_code1() {
		if (ctry_code1 == null) {
			reloadData();
		}
		return ctry_code1;
	}

	/**
	 * @return the customer_consign
	 */
	public static ArrayList<CodeMstr> getCustomer_consign() {
		if (customer_consign == null) {
			reloadData();
		}
		return customer_consign;
	}

	/**
	 * @return the ded_calc
	 */
	public static ArrayList<CodeMstr> getDed_calc() {
		if (ded_calc == null) {
			reloadData();
		}
		return ded_calc;
	}

	/**
	 * @return the ded_freq
	 */
	public static ArrayList<CodeMstr> getDed_freq() {
		if (ded_freq == null) {
			reloadData();
		}
		return ded_freq;
	}

	/**
	 * @return the ded_type
	 */
	public static ArrayList<CodeMstr> getDed_type() {
		if (ded_type == null) {
			reloadData();
		}
		return ded_type;
	}

	/**
	 * @return the dpc_conv
	 */
	public static ArrayList<CodeMstr> getDpc_conv() {
		if (dpc_conv == null) {
			reloadData();
		}
		return dpc_conv;
	}

	/**
	 * @return the dprd_type
	 */
	public static ArrayList<CodeMstr> getDprd_type() {
		if (dprd_type == null) {
			reloadData();
		}
		return dprd_type;
	}

	/**
	 * @return the ea_type
	 */
	public static ArrayList<CodeMstr> getEa_type() {
		if (ea_type == null) {
			reloadData();
		}
		return ea_type;
	}

	/**
	 * @return the ed_freq
	 */
	public static ArrayList<CodeMstr> getEd_freq() {
		if (ed_freq == null) {
			reloadData();
		}
		return ed_freq;
	}

	/**
	 * @return the emp_freq
	 */
	public static ArrayList<CodeMstr> getEmp_freq() {
		if (emp_freq == null) {
			reloadData();
		}
		return emp_freq;
	}

	/**
	 * @return the emp_pay_type
	 */
	public static ArrayList<CodeMstr> getEmp_pay_type() {
		if (emp_pay_type == null) {
			reloadData();
		}
		return emp_pay_type;
	}

	/**
	 * @return the emp_status
	 */
	public static ArrayList<CodeMstr> getEmp_status() {
		if (emp_status == null) {
			reloadData();
		}
		return emp_status;
	}

	/**
	 * @return the estatus
	 */
	public static ArrayList<CodeMstr> getEstatus() {
		if (estatus == null) {
			reloadData();
		}
		return estatus;
	}

	/**
	 * @return the estatus1
	 */
	public static ArrayList<CodeMstr> getEstatus1() {
		if (estatus1 == null) {
			reloadData();
		}
		return estatus1;
	}

	/**
	 * @return the flhm_class
	 */
	public static ArrayList<CodeMstr> getFlhm_class() {
		if (flhm_class == null) {
			reloadData();
		}
		return flhm_class;
	}

	/**
	 * @return the flhm_status
	 */
	public static ArrayList<CodeMstr> getFlhm_status() {
		if (flhm_status == null) {
			reloadData();
		}
		return flhm_status;
	}

	/**
	 * @return the flhm_type
	 */
	public static ArrayList<CodeMstr> getFlhm_type() {
		if (flhm_type == null) {
			reloadData();
		}
		return flhm_type;
	}

	/**
	 * @return the fm_type
	 */
	public static ArrayList<CodeMstr> getFm_type() {
		if (fm_type == null) {
			reloadData();
		}
		return fm_type;
	}

	/**
	 * @return the freq
	 */
	public static ArrayList<CodeMstr> getFreq() {
		if (freq == null) {
			reloadData();
		}
		return freq;
	}

	/**
	 * @return the fsskill
	 */
	public static ArrayList<CodeMstr> getFsskill() {
		if (fsskill == null) {
			reloadData();
		}
		return fsskill;
	}

	/**
	 * @return the ftxd_freq
	 */
	public static ArrayList<CodeMstr> getFtxd_freq() {
		if (ftxd_freq == null) {
			reloadData();
		}
		return ftxd_freq;
	}

	/**
	 * @return the interval_mnemonic
	 */
	public static ArrayList<CodeMstr> getInterval_mnemonic() {
		if (interval_mnemonic == null) {
			reloadData();
		}
		return interval_mnemonic;
	}

	/**
	 * @return the loc_type
	 */
	public static ArrayList<CodeMstr> getLoc_type() {
		if (loc_type == null) {
			reloadData();
		}
		return loc_type;
	}

	/**
	 * @return the prd_length
	 */
	public static ArrayList<CodeMstr> getPrd_length() {

		if (prd_length == null) {
			reloadData();
		}
		return prd_length;
	}

	/**
	 * @return the pt_abc
	 */
	public static ArrayList<CodeMstr> getPt_abc() {
		if (pt_abc == null) {
			reloadData();
		}
		return pt_abc;
	}

	/**
	 * @return the pt_cover
	 */
	public static ArrayList<CodeMstr> getPt_cover() {
		if (pt_cover == null) {
			reloadData();
		}
		return pt_cover;
	}

	/**
	 * @return the pt_group
	 */
	public static ArrayList<CodeMstr> getPt_group() {
		if (pt_group == null) {
			reloadData();
		}
		return pt_group;
	}

	/**
	 * @return the pt_part_type
	 */
	public static ArrayList<CodeMstr> getPt_part_type() {
		if (pt_part_type == null) {
			reloadData();
		}
		return pt_part_type;
	}

	/**
	 * @return the pt_promo
	 */
	public static ArrayList<CodeMstr> getPt_promo() {
		if (pt_promo == null) {
			reloadData();
		}
		return pt_promo;
	}

	/**
	 * @return the pt_size_um
	 */
	public static ArrayList<CodeMstr> getPt_size_um() {
		if (pt_size_um == null) {
			reloadData();
		}
		return pt_size_um;
	}

	/**
	 * @return the pt_svc_type
	 */
	public static ArrayList<CodeMstr> getPt_svc_type() {
		if (pt_svc_type == null) {
			reloadData();
		}
		return pt_svc_type;
	}

	/**
	 * @return the pt_sys_type
	 */
	public static ArrayList<CodeMstr> getPt_sys_type() {
		if (pt_sys_type == null) {
			reloadData();
		}
		return pt_sys_type;
	}

	/**
	 * @return the pt_um
	 */
	public static ArrayList<CodeMstr> getPt_um() {
		if (pt_um == null) {
			reloadData();
		}
		return pt_um;
	}

	/**
	 * @return the rnd_round
	 */
	public static ArrayList<CodeMstr> getRnd_round() {
		if (rnd_round == null) {
			reloadData();
		}
		return rnd_round;
	}

	/**
	 * @return the rptpmt_type
	 */
	public static ArrayList<CodeMstr> getRptpmt_type() {
		if (rptpmt_type == null) {
			reloadData();
		}
		return rptpmt_type;
	}

	/**
	 * @return the rptpmt_valuetype
	 */
	public static ArrayList<CodeMstr> getRptpmt_valuetype() {
		if (rptpmt_valuetype == null) {
			reloadData();
		}
		return rptpmt_valuetype;
	}

	/**
	 * @return the schtype
	 */
	public static ArrayList<CodeMstr> getSchtype() {
		if (schtype == null) {
			reloadData();
		}
		return schtype;
	}

	/**
	 * @return the sch_sd_pat
	 */
	public static ArrayList<CodeMstr> getSch_sd_pat() {
		if (sch_sd_pat == null) {
			reloadData();
		}
		return sch_sd_pat;
	}

	/**
	 * @return the sch_type
	 */
	public static ArrayList<CodeMstr> getSch_type() {
		if (sch_type == null) {
			reloadData();
		}
		return sch_type;
	}

	/**
	 * @return the sod_conrep
	 */
	public static ArrayList<CodeMstr> getSod_conrep() {
		if (sod_conrep == null) {
			reloadData();
		}
		return sod_conrep;
	}

	/**
	 * @return the srr_problem
	 */
	public static ArrayList<CodeMstr> getSrr_problem() {
		if (srr_problem == null) {
			reloadData();
		}
		return srr_problem;
	}

	/**
	 * @return the srr_severity
	 */
	public static ArrayList<CodeMstr> getSrr_severity() {
		if (srr_severity == null) {
			reloadData();
		}
		return srr_severity;
	}

	/**
	 * @return the srr_type
	 */
	public static ArrayList<CodeMstr> getSrr_type() {
		if (srr_type == null) {
			reloadData();
		}
		return srr_type;
	}

	/**
	 * @return the stat
	 */
	public static ArrayList<CodeMstr> getStat() {
		if (stat == null) {
			reloadData();
		}
		return stat;
	}

	/**
	 * @return the st_type
	 */
	public static ArrayList<CodeMstr> getSt_type() {
		if (st_type == null) {
			reloadData();
		}
		return st_type;
	}

	/**
	 * @return the supplier_consign
	 */
	public static ArrayList<CodeMstr> getSupplier_consign() {
		if (supplier_consign == null) {
			reloadData();
		}
		return supplier_consign;
	}

	/**
	 * @return the svc_ca_cor_type
	 */
	public static ArrayList<CodeMstr> getSvc_ca_cor_type() {
		if (svc_ca_cor_type == null) {
			reloadData();
		}
		return svc_ca_cor_type;
	}

	/**
	 * @return the svc_ca_ins_type
	 */
	public static ArrayList<CodeMstr> getSvc_ca_ins_type() {
		if (svc_ca_ins_type == null) {
			reloadData();
		}
		return svc_ca_ins_type;
	}

	/**
	 * @return the svc_ca_pvm_type
	 */
	public static ArrayList<CodeMstr> getSvc_ca_pvm_type() {
		if (svc_ca_pvm_type == null) {
			reloadData();
		}
		return svc_ca_pvm_type;
	}

	/**
	 * @return the svc_ca_tec_type
	 */
	public static ArrayList<CodeMstr> getSvc_ca_tec_type() {
		if (svc_ca_tec_type == null) {
			reloadData();
		}
		return svc_ca_tec_type;
	}

	/**
	 * @return the svc_ca_upd_type
	 */
	public static ArrayList<CodeMstr> getSvc_ca_upd_type() {
		if (svc_ca_upd_type == null) {
			reloadData();
		}
		return svc_ca_upd_type;
	}

	/**
	 * @return the svd_svc_type
	 */
	public static ArrayList<CodeMstr> getSvd_svc_type() {
		if (svd_svc_type == null) {
			reloadData();
		}
		return svd_svc_type;
	}

	/**
	 * @return the sv_rsp_um
	 */
	public static ArrayList<CodeMstr> getSv_rsp_um() {
		if (sv_rsp_um == null) {
			reloadData();
		}
		return sv_rsp_um;
	}

	/**
	 * @return the sv_type
	 */
	public static ArrayList<CodeMstr> getSv_type() {
		if (sv_type == null) {
			reloadData();
		}
		return sv_type;
	}

	/**
	 * @return the tr_type
	 */
	public static ArrayList<CodeMstr> getTr_type() {
		if (tr_type == null) {
			reloadData();
		}
		return tr_type;
	}

	/**
	 * @return the tx2_method
	 */
	public static ArrayList<CodeMstr> getTx2_method() {
		if (tx2_method == null) {
			reloadData();
		}
		return tx2_method;
	}

	/**
	 * @return the txe_tax_env
	 */
	public static ArrayList<CodeMstr> getTxe_tax_env() {
		if (txe_tax_env == null) {
			reloadData();
		}
		return txe_tax_env;
	}

	/**
	 * @return the txt_tax_type
	 */
	public static ArrayList<CodeMstr> getTxt_tax_type() {
		if (txt_tax_type == null) {
			reloadData();
		}
		return txt_tax_type;
	}

	/**
	 * @return the usr_access_loc
	 */
	public static ArrayList<CodeMstr> getUsr_access_loc() {
		if (usr_access_loc == null) {
			reloadData();
		}
		return usr_access_loc;
	}

	/**
	 * @return the vd_promo
	 */
	public static ArrayList<CodeMstr> getVd_promo() {
		if (vd_promo == null) {
			reloadData();
		}
		return vd_promo;
	}
}
