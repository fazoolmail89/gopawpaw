package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * InMstr entity. @author MyEclipse Persistence Tools
 */
public class InMstr extends AbstractInMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public InMstr() {
	}

	/** minimal constructor */
	public InMstr(InMstrId id, Integer inLevel, Boolean inWh,
			String inGlCostSite, Double inCustConsignQty,
			Double inSuppConsignQty, Double oidInMstr) {
		super(id, inLevel, inWh, inGlCostSite, inCustConsignQty,
				inSuppConsignQty, oidInMstr);
	}

	/** full constructor */
	public InMstr(InMstrId id, Double inQtyOh, Double inQtyReq,
			Double inQtyAll, Double inQtyOrd, Double inQtyChg,
			Double inQtyAvail, Double inSlsChg, Double inIssChg,
			Date inIssDate, Date inRecDate, Date inCntDate, Double inAvgIss,
			Double inAvgSls, Date inAvgDate, String inUser1, String inUser2,
			BigDecimal inRop, BigDecimal inSftyStk, Double inQtyNonet,
			Boolean inMrp, String inGlSet, String inCurSet, String inAbc,
			Integer inAvgInt, Integer inCycInt, Integer inLevel,
			Double inAssay, String inGrade, String inLoc, String inLocType,
			Integer inProjUse, Boolean inRollup, String inRollupId,
			String inRctpoStatus, String inRctwoStatus, Boolean inRctpoActive,
			Boolean inRctwoActive, String inQadc01, Boolean inWh,
			String inGlCostSite, Double inCustConsignQty,
			Double inSuppConsignQty, Double oidInMstr) {
		super(id, inQtyOh, inQtyReq, inQtyAll, inQtyOrd, inQtyChg, inQtyAvail,
				inSlsChg, inIssChg, inIssDate, inRecDate, inCntDate, inAvgIss,
				inAvgSls, inAvgDate, inUser1, inUser2, inRop, inSftyStk,
				inQtyNonet, inMrp, inGlSet, inCurSet, inAbc, inAvgInt,
				inCycInt, inLevel, inAssay, inGrade, inLoc, inLocType,
				inProjUse, inRollup, inRollupId, inRctpoStatus, inRctwoStatus,
				inRctpoActive, inRctwoActive, inQadc01, inWh, inGlCostSite,
				inCustConsignQty, inSuppConsignQty, oidInMstr);
	}

}
