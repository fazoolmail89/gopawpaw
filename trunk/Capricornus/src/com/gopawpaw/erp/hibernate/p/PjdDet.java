package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PjdDet entity. @author MyEclipse Persistence Tools
 */
public class PjdDet extends AbstractPjdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjdDet() {
	}

	/** minimal constructor */
	public PjdDet(PjdDetId id, Integer pjdBudgetType, String pjdCaIntType,
			Integer pjdCmtindx, String pjdCommPct, String pjdCrTerms,
			String pjdDesc, Double pjdDiscPct, String pjdEngNbr,
			String pjdEuNbr, Boolean pjdGlobalInv, Boolean pjdInvDet,
			Boolean pjdInvDetPr, Boolean pjdInvLvl, Double pjdListPr,
			String pjdLoc, String pjdPjtCode, String pjdPrList,
			Double pjdPrepaid, Double pjdPrepTax, String pjdProdLine,
			String pjdSite, String pjdSlspsn, String pjdStatus,
			Double pjdTotalPrice, Boolean pjdVariation, Date pjdModDate,
			String pjdModUserid, Double oidPjdDet) {
		super(id, pjdBudgetType, pjdCaIntType, pjdCmtindx, pjdCommPct,
				pjdCrTerms, pjdDesc, pjdDiscPct, pjdEngNbr, pjdEuNbr,
				pjdGlobalInv, pjdInvDet, pjdInvDetPr, pjdInvLvl, pjdListPr,
				pjdLoc, pjdPjtCode, pjdPrList, pjdPrepaid, pjdPrepTax,
				pjdProdLine, pjdSite, pjdSlspsn, pjdStatus, pjdTotalPrice,
				pjdVariation, pjdModDate, pjdModUserid, oidPjdDet);
	}

	/** full constructor */
	public PjdDet(PjdDetId id, Integer pjdBudgetType, String pjdCaIntType,
			Integer pjdCmtindx, String pjdCommPct, String pjdCrTerms,
			String pjdDesc, Double pjdDiscPct, Date pjdEndDate,
			Date pjdEndOrig, String pjdEngNbr, String pjdEuNbr,
			Boolean pjdGlobalInv, Boolean pjdInvDet, Boolean pjdInvDetPr,
			Boolean pjdInvLvl, Double pjdListPr, String pjdLoc,
			String pjdPjtCode, String pjdPrList, Double pjdPrepaid,
			Double pjdPrepTax, String pjdProdLine, String pjdSite,
			String pjdSlspsn, Date pjdStDate, Date pjdStOrig, String pjdStatus,
			Double pjdTotalPrice, Boolean pjdVariation, Date pjdModDate,
			String pjdModUserid, String pjdUser1, String pjdUser2,
			String pjdQadc01, String pjdQadc02, Double pjdQadd01,
			Integer pjdQadi01, Boolean pjdQadl01, Date pjdQadt01,
			Double oidPjdDet) {
		super(id, pjdBudgetType, pjdCaIntType, pjdCmtindx, pjdCommPct,
				pjdCrTerms, pjdDesc, pjdDiscPct, pjdEndDate, pjdEndOrig,
				pjdEngNbr, pjdEuNbr, pjdGlobalInv, pjdInvDet, pjdInvDetPr,
				pjdInvLvl, pjdListPr, pjdLoc, pjdPjtCode, pjdPrList,
				pjdPrepaid, pjdPrepTax, pjdProdLine, pjdSite, pjdSlspsn,
				pjdStDate, pjdStOrig, pjdStatus, pjdTotalPrice, pjdVariation,
				pjdModDate, pjdModUserid, pjdUser1, pjdUser2, pjdQadc01,
				pjdQadc02, pjdQadd01, pjdQadi01, pjdQadl01, pjdQadt01,
				oidPjdDet);
	}

}
