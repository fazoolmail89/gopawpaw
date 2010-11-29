package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RmcCtrl entity. @author MyEclipse Persistence Tools
 */
public class RmcCtrl extends AbstractRmcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmcCtrl() {
	}

	/** minimal constructor */
	public RmcCtrl(RmcCtrlId id, String rmcSoRatetype, String rmcPoRatetype,
			Double oidRmcCtrl) {
		super(id, rmcSoRatetype, rmcPoRatetype, oidRmcCtrl);
	}

	/** full constructor */
	public RmcCtrl(RmcCtrlId id, Boolean rmcEditIsb, Boolean rmcHcmmts,
			Boolean rmcLcmmts, Boolean rmcConsume, Integer rmcQadi03,
			String rmcUser1, String rmcUser2, Integer rmcQadi04,
			String rmcRoute, String rmcDfltRma, String rmcQadc05,
			String rmcQadc06, String rmcSiteIs, String rmcLocIs,
			String rmcSiteOs, String rmcLocOs, Boolean rmcDetAll,
			Integer rmcAllDays, String rmcPoPre, Integer rmcPoNbr,
			String rmcSiteOv, String rmcSiteIv, String rmcLocOv,
			String rmcLocIv, String rmcSoPre, Integer rmcSoNbr,
			String rmcChr01, String rmcChr02, String rmcChr03, String rmcChr04,
			String rmcChr05, String rmcChr06, String rmcChr07, String rmcChr08,
			String rmcChr09, String rmcChr10, Double rmcDec01, Double rmcDec02,
			Double rmcDec03, Date rmcDte01, Date rmcDte02, Date rmcDte03,
			Date rmcDte04, Boolean rmcLog01, Boolean rmcLog02,
			Boolean rmcLog03, Boolean rmcLog04, Boolean rmcLog05,
			Boolean rmcHist, String rmcQadc04, Boolean rmcPrtRtn,
			String rmcRtvTrn, Boolean rmcPl, String rmcRtnTaxc,
			Boolean rmcHistory, Boolean rmcIssues, Boolean rmcPrintTrail,
			Boolean rmcRmaAccounts, String rmcSiteLb, Boolean rmcDispTrail,
			Integer rmcTurnDays, String rmcRepairCd, String rmcQadc01,
			String rmcQadc02, String rmcQadc03, Boolean rmcQadl01,
			Boolean rmcQadl02, Boolean rmcQadl03, Integer rmcQadi01,
			Integer rmcQadi02, Double rmcQadd01, Double rmcQadd02,
			String rmcModUserid, Date rmcModDate, Boolean rmcSwsa,
			String rmcSoRatetype, String rmcPoRatetype, Double oidRmcCtrl) {
		super(id, rmcEditIsb, rmcHcmmts, rmcLcmmts, rmcConsume, rmcQadi03,
				rmcUser1, rmcUser2, rmcQadi04, rmcRoute, rmcDfltRma, rmcQadc05,
				rmcQadc06, rmcSiteIs, rmcLocIs, rmcSiteOs, rmcLocOs, rmcDetAll,
				rmcAllDays, rmcPoPre, rmcPoNbr, rmcSiteOv, rmcSiteIv, rmcLocOv,
				rmcLocIv, rmcSoPre, rmcSoNbr, rmcChr01, rmcChr02, rmcChr03,
				rmcChr04, rmcChr05, rmcChr06, rmcChr07, rmcChr08, rmcChr09,
				rmcChr10, rmcDec01, rmcDec02, rmcDec03, rmcDte01, rmcDte02,
				rmcDte03, rmcDte04, rmcLog01, rmcLog02, rmcLog03, rmcLog04,
				rmcLog05, rmcHist, rmcQadc04, rmcPrtRtn, rmcRtvTrn, rmcPl,
				rmcRtnTaxc, rmcHistory, rmcIssues, rmcPrintTrail,
				rmcRmaAccounts, rmcSiteLb, rmcDispTrail, rmcTurnDays,
				rmcRepairCd, rmcQadc01, rmcQadc02, rmcQadc03, rmcQadl01,
				rmcQadl02, rmcQadl03, rmcQadi01, rmcQadi02, rmcQadd01,
				rmcQadd02, rmcModUserid, rmcModDate, rmcSwsa, rmcSoRatetype,
				rmcPoRatetype, oidRmcCtrl);
	}

}
