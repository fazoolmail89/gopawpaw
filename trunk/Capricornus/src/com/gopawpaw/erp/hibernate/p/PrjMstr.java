package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PrjMstr entity. @author MyEclipse Persistence Tools
 */
public class PrjMstr extends AbstractPrjMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrjMstr() {
	}

	/** minimal constructor */
	public PrjMstr(PrjMstrId id, String prjActionStat, String prjArAcct,
			String prjArSub, String prjArCc, Double prjBgAbove,
			Double prjBgBelow, String prjBillTo, String prjChannel,
			Integer prjCmtindx, String prjCommPct, String prjCrCard,
			String prjCrInit, String prjCrTerms, String prjCurr,
			String prjCust, String prjDesc, String prjEngNbr, String prjEuNbr,
			Integer prjExruSeq, Double prjExRate, Double prjExRate2,
			String prjExRatetype, Boolean prjFixRate, Boolean prjGlobalInv,
			Boolean prjInvDet, Boolean prjInvDetPr, Boolean prjInvLvl,
			String prjLang, String prjLoc, String prjMref, String prjPjtCode,
			String prjPo, String prjPrList, Boolean prjPrRollup,
			Double prjPrepaid, Double prjPrepTax, String prjRmks,
			String prjShipTo, String prjShipvia, String prjSite,
			String prjSlspsn, String prjStatus, String prjTaxEnv,
			Boolean prjTaxIn, String prjTaxUsage, Boolean prjTaxable,
			String prjTaxc, String prjTypeTaxc, Double prjTrl1Amt,
			String prjTrl1Cd, Double prjTrl2Amt, String prjTrl2Cd,
			Double prjTrl3Amt, String prjTrl3Cd, String prjUserid,
			Boolean prjUseBudgets, Date prjModDate, String prjModUserid,
			Double oidPrjMstr) {
		super(id, prjActionStat, prjArAcct, prjArSub, prjArCc, prjBgAbove,
				prjBgBelow, prjBillTo, prjChannel, prjCmtindx, prjCommPct,
				prjCrCard, prjCrInit, prjCrTerms, prjCurr, prjCust, prjDesc,
				prjEngNbr, prjEuNbr, prjExruSeq, prjExRate, prjExRate2,
				prjExRatetype, prjFixRate, prjGlobalInv, prjInvDet,
				prjInvDetPr, prjInvLvl, prjLang, prjLoc, prjMref, prjPjtCode,
				prjPo, prjPrList, prjPrRollup, prjPrepaid, prjPrepTax, prjRmks,
				prjShipTo, prjShipvia, prjSite, prjSlspsn, prjStatus,
				prjTaxEnv, prjTaxIn, prjTaxUsage, prjTaxable, prjTaxc,
				prjTypeTaxc, prjTrl1Amt, prjTrl1Cd, prjTrl2Amt, prjTrl2Cd,
				prjTrl3Amt, prjTrl3Cd, prjUserid, prjUseBudgets, prjModDate,
				prjModUserid, oidPrjMstr);
	}

	/** full constructor */
	public PrjMstr(PrjMstrId id, String prjActionStat, String prjArAcct,
			String prjArSub, String prjArCc, Double prjBgAbove,
			Double prjBgBelow, String prjBillTo, String prjChannel,
			Integer prjCmtindx, Date prjCloseDate, String prjCommPct,
			String prjCrCard, String prjCrInit, String prjCrTerms,
			String prjCurr, String prjCust, String prjDesc, Date prjEndDate,
			String prjEngNbr, String prjEuNbr, Integer prjExruSeq,
			Double prjExRate, Double prjExRate2, String prjExRatetype,
			Boolean prjFixRate, Boolean prjGlobalInv, Boolean prjInvDet,
			Boolean prjInvDetPr, Boolean prjInvLvl, String prjLang,
			String prjLoc, String prjMref, Date prjOrdDate, String prjPjtCode,
			String prjPo, String prjPrList, Boolean prjPrRollup,
			Double prjPrepaid, Double prjPrepTax, Date prjPricingDt,
			String prjRmks, Date prjShipDate, String prjShipTo,
			String prjShipvia, String prjSite, String prjSlspsn,
			Date prjStDate, String prjStatus, Date prjTaxDate,
			String prjTaxEnv, Boolean prjTaxIn, String prjTaxUsage,
			Boolean prjTaxable, String prjTaxc, String prjTypeTaxc,
			Double prjTrl1Amt, String prjTrl1Cd, Double prjTrl2Amt,
			String prjTrl2Cd, Double prjTrl3Amt, String prjTrl3Cd,
			String prjUserid, Boolean prjUseBudgets, Date prjModDate,
			String prjModUserid, String prjUser1, String prjUser2,
			Double prjDec01, Boolean prjLog01, Date prjDte01, String prjQadc01,
			String prjQadc02, Double prjQadd01, Double prjQadd02,
			Integer prjQadi01, Integer prjQadi02, Boolean prjQadl01,
			Boolean prjQadl02, Date prjQadt01, Date prjQadt02, Double oidPrjMstr) {
		super(id, prjActionStat, prjArAcct, prjArSub, prjArCc, prjBgAbove,
				prjBgBelow, prjBillTo, prjChannel, prjCmtindx, prjCloseDate,
				prjCommPct, prjCrCard, prjCrInit, prjCrTerms, prjCurr, prjCust,
				prjDesc, prjEndDate, prjEngNbr, prjEuNbr, prjExruSeq,
				prjExRate, prjExRate2, prjExRatetype, prjFixRate, prjGlobalInv,
				prjInvDet, prjInvDetPr, prjInvLvl, prjLang, prjLoc, prjMref,
				prjOrdDate, prjPjtCode, prjPo, prjPrList, prjPrRollup,
				prjPrepaid, prjPrepTax, prjPricingDt, prjRmks, prjShipDate,
				prjShipTo, prjShipvia, prjSite, prjSlspsn, prjStDate,
				prjStatus, prjTaxDate, prjTaxEnv, prjTaxIn, prjTaxUsage,
				prjTaxable, prjTaxc, prjTypeTaxc, prjTrl1Amt, prjTrl1Cd,
				prjTrl2Amt, prjTrl2Cd, prjTrl3Amt, prjTrl3Cd, prjUserid,
				prjUseBudgets, prjModDate, prjModUserid, prjUser1, prjUser2,
				prjDec01, prjLog01, prjDte01, prjQadc01, prjQadc02, prjQadd01,
				prjQadd02, prjQadi01, prjQadi02, prjQadl01, prjQadl02,
				prjQadt01, prjQadt02, oidPrjMstr);
	}

}
