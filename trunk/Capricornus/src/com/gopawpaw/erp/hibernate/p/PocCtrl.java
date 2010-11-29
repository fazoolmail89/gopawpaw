package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PocCtrl entity. @author MyEclipse Persistence Tools
 */
public class PocCtrl extends AbstractPocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PocCtrl() {
	}

	/** minimal constructor */
	public PocCtrl(Boolean pocAckReq, String pocExRatetype,
			Boolean pocMultiDueDates, Double oidPocCtrl) {
		super(pocAckReq, pocExRatetype, pocMultiDueDates, oidPocCtrl);
	}

	/** full constructor */
	public PocCtrl(String pocBill, String pocShip, Integer pocPoNbr,
			Boolean pocLnFmt, String pocInspLoc, BigDecimal pocRcvType,
			BigDecimal pocRcvNbr, String pocLnStat, Double pocTolPct,
			Double pocTolCst, Boolean pocHcmmts, Boolean pocLcmmts,
			String pocFstId, String pocPstId, Boolean pocRcvAll,
			Integer pocQad01, String pocUser1, String pocUser2,
			Integer pocQadi03, Integer pocReqNbr, String pocPoPre,
			String pocRcvPre, String pocReqPre, Boolean pocSortBy,
			String pocQadc04, String pocQadc05, Boolean pocApvReq,
			Boolean pocPoHist, Boolean pocPlReq, String pocCrtaccAcct,
			String pocCrtaccCc, String pocCrtappAcct, String pocCrtappCc,
			Integer pocNextBatch, Boolean pocPcLine, Boolean pocPtReq,
			Boolean pocErsProc, String pocErsOpt, String pocQadc01,
			String pocQadc02, String pocQadc03, Date pocQadt01,
			Double pocQadd01, Double pocQadd02, Integer pocQadi01,
			Integer pocQadi02, Boolean pocQadl01, Boolean pocQadl02,
			Boolean pocQadl03, Boolean pocQadl04, Boolean pocQadl05,
			Boolean pocQadl06, Boolean pocAckReq, String pocExRatetype,
			String pocCrtaccSub, String pocCrtappSub, Boolean pocMultiDueDates,
			Double oidPocCtrl) {
		super(pocBill, pocShip, pocPoNbr, pocLnFmt, pocInspLoc, pocRcvType,
				pocRcvNbr, pocLnStat, pocTolPct, pocTolCst, pocHcmmts,
				pocLcmmts, pocFstId, pocPstId, pocRcvAll, pocQad01, pocUser1,
				pocUser2, pocQadi03, pocReqNbr, pocPoPre, pocRcvPre, pocReqPre,
				pocSortBy, pocQadc04, pocQadc05, pocApvReq, pocPoHist,
				pocPlReq, pocCrtaccAcct, pocCrtaccCc, pocCrtappAcct,
				pocCrtappCc, pocNextBatch, pocPcLine, pocPtReq, pocErsProc,
				pocErsOpt, pocQadc01, pocQadc02, pocQadc03, pocQadt01,
				pocQadd01, pocQadd02, pocQadi01, pocQadi02, pocQadl01,
				pocQadl02, pocQadl03, pocQadl04, pocQadl05, pocQadl06,
				pocAckReq, pocExRatetype, pocCrtaccSub, pocCrtappSub,
				pocMultiDueDates, oidPocCtrl);
	}

}
