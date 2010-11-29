package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SacCtrl entity. @author MyEclipse Persistence Tools
 */
public class SacCtrl extends AbstractSacCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SacCtrl() {
	}

	/** minimal constructor */
	public SacCtrl(String sacExRatetype, Boolean sacPtIsb, String sacRevenue,
			Boolean sacBillEnduser, Boolean sacBillSummary,
			Boolean sacItemEnduser, Boolean sacEuTotals, Boolean sacEuAddChrg,
			Boolean sacAddChrg, Double oidSacCtrl) {
		super(sacExRatetype, sacPtIsb, sacRevenue, sacBillEnduser,
				sacBillSummary, sacItemEnduser, sacEuTotals, sacEuAddChrg,
				sacAddChrg, oidSacCtrl);
	}

	/** full constructor */
	public SacCtrl(Integer sacFreeMth, Boolean sacAutoSa, Integer sacFreeGt,
			Integer sacSa, Boolean sacLnFmt, Boolean sacFreeBe,
			String sacChr01, Boolean sacPrint, String sacChr02,
			String sacCompany, String sacFob, Boolean sacHcmmts,
			Boolean sacLcmmts, String sacChr03, String sacChr04,
			String sacChr05, String sacChr06, String sacTrlTax,
			String sacChr07, String sacChr08, String sacChr09,
			Integer sacQad01, String sacTrlNtax, String sacUser1,
			String sacUser2, Integer sacIndex1, String sacSaPre,
			Boolean sacSaqoNbr, Integer sacQo, String sacQoPre,
			Integer sacSoNbr, String sacSoPre, String sacChr10,
			Double sacDec01, Double sacDec02, Double sacDec03, Date sacDte01,
			Date sacDte02, Date sacDte03, Date sacDte04, Boolean sacLog01,
			Boolean sacLog02, Boolean sacLog03, Boolean sacLog04,
			Boolean sacLog05, Boolean sacSoHist, Boolean sacContractPr,
			Boolean sacGenDef, Boolean sacQadl04, String sacSaSite,
			Boolean sacDeferred, Boolean sacCallsMrp, Boolean sacCreatePm,
			Boolean sacLimitsWnd, Integer sacRenewalDays, String sacRenewFmt,
			Boolean sacRevalBill, Boolean sacRevalWnd, Boolean sacRvidxNxtbl,
			Boolean sacSaMulti, Boolean sacUserPricing, Boolean sacPmDays,
			String sacQadc01, String sacQadc02, String sacQadc03,
			Integer sacQadi01, Integer sacQadi02, Boolean sacQadl01,
			Boolean sacQadl02, Boolean sacQadl03, String sacModUserid,
			Date sacModDate, String sacLimitCopy, Boolean sacLimHist,
			String sacExRatetype, Boolean sacPtIsb, String sacRevenue,
			Boolean sacBillEnduser, Boolean sacBillSummary,
			Boolean sacItemEnduser, Boolean sacEuTotals, Boolean sacEuAddChrg,
			Boolean sacAddChrg, Double oidSacCtrl) {
		super(sacFreeMth, sacAutoSa, sacFreeGt, sacSa, sacLnFmt, sacFreeBe,
				sacChr01, sacPrint, sacChr02, sacCompany, sacFob, sacHcmmts,
				sacLcmmts, sacChr03, sacChr04, sacChr05, sacChr06, sacTrlTax,
				sacChr07, sacChr08, sacChr09, sacQad01, sacTrlNtax, sacUser1,
				sacUser2, sacIndex1, sacSaPre, sacSaqoNbr, sacQo, sacQoPre,
				sacSoNbr, sacSoPre, sacChr10, sacDec01, sacDec02, sacDec03,
				sacDte01, sacDte02, sacDte03, sacDte04, sacLog01, sacLog02,
				sacLog03, sacLog04, sacLog05, sacSoHist, sacContractPr,
				sacGenDef, sacQadl04, sacSaSite, sacDeferred, sacCallsMrp,
				sacCreatePm, sacLimitsWnd, sacRenewalDays, sacRenewFmt,
				sacRevalBill, sacRevalWnd, sacRvidxNxtbl, sacSaMulti,
				sacUserPricing, sacPmDays, sacQadc01, sacQadc02, sacQadc03,
				sacQadi01, sacQadi02, sacQadl01, sacQadl02, sacQadl03,
				sacModUserid, sacModDate, sacLimitCopy, sacLimHist,
				sacExRatetype, sacPtIsb, sacRevenue, sacBillEnduser,
				sacBillSummary, sacItemEnduser, sacEuTotals, sacEuAddChrg,
				sacAddChrg, oidSacCtrl);
	}

}
