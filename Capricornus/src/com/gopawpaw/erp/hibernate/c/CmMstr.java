package com.gopawpaw.erp.hibernate.c;

import java.math.BigDecimal;
import java.util.Date;

/**
 * CmMstr entity. @author MyEclipse Persistence Tools
 */
public class CmMstr extends AbstractCmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmMstr() {
	}

	/** minimal constructor */
	public CmMstr(CmMstrId id, String cmCollMthd, Double cmDrftMin,
			Double cmDrftMax, Boolean cmDrftDisc, Boolean cmDrftApv,
			String cmPromo, Boolean cmBtbCr, String cmBtbType,
			Integer cmShipLt, Boolean cmBtbMthd, String cmExRatetype,
			String cmScurr, String cmSic, String cmPayMethod,
			Boolean cmSubmitProp, String cmBank, Double oidCmMstr) {
		super(id, cmCollMthd, cmDrftMin, cmDrftMax, cmDrftDisc, cmDrftApv,
				cmPromo, cmBtbCr, cmBtbType, cmShipLt, cmBtbMthd, cmExRatetype,
				cmScurr, cmSic, cmPayMethod, cmSubmitProp, cmBank, oidCmMstr);
	}

	/** full constructor */
	public CmMstr(CmMstrId id, String cmShip, String cmType, String cmCrTerms,
			String cmXslspsn, Integer cmQadi01, String cmPrList,
			Double cmDiscPct, Boolean cmPartial, Boolean cmStmt, Boolean cmDun,
			Boolean cmFin, String cmArAcct, String cmArCc, String cmQadc07,
			String cmQadc01, String cmStmtCyc, String cmShipvia, String cmRmks,
			String cmResale, String cmRegion, String cmQad04, String cmSort,
			Double cmBalance, Boolean cmTaxable, Date cmPayDate,
			String cmXslspsn2, Integer cmQadi02, Integer cmAvgPay,
			String cmUser1, String cmUser2, String cmCurr, String cmLang,
			String cmDb, Boolean cmCrHold, String cmCrRating, Double cmHighCr,
			Date cmHighDate, Date cmSaleDate, Integer cmInvoices,
			Date cmFinDate, Boolean cmQad06, String cmFstId, String cmPstId,
			Boolean cmPst, Boolean cmTaxIn, String cmSite, String cmClass,
			String cmTaxc, String cmBill, String cmChr01, String cmChr02,
			String cmChr03, String cmChr04, String cmChr05, String cmChr06,
			String cmChr07, String cmChr08, String cmChr09, String cmChr10,
			Date cmDte01, Date cmDte02, Double cmDec01, Double cmDec02,
			Boolean cmLog01, String cmQadc02, String cmFrList,
			String cmFrTerms, String cmUserid, Date cmModDate,
			String cmConrepLogic, String cmSlspsn, BigDecimal cmFrMinWt,
			Double cmDrftBal, Double cmLcBal, String cmPrList2,
			Boolean cmFixPr, Date cmCrUpdate, Date cmCrReview,
			String cmCollMthd, Double cmDrftMin, Double cmDrftMax,
			Boolean cmDrftDisc, Boolean cmDrftApv, Boolean cmInternal,
			String cmSvcList, Boolean cmPoReqd, String cmServTerms,
			BigDecimal cmCrLimit, String cmPromo, Boolean cmBtbCr,
			String cmBtbType, Integer cmShipLt, Boolean cmBtbMthd,
			String cmExRatetype, String cmDiscComb, String cmScurr,
			String cmQadc03, String cmQadc04, String cmQadc05, String cmQadc06,
			Double cmQadd01, Double cmQadd02, Boolean cmQadl01,
			Boolean cmQadl02, Boolean cmQadl03, Boolean cmQadl04,
			Date cmQadt01, Date cmQadt02, Integer cmQadi03, Integer cmQadi04,
			String cmArSub, String cmSic, String cmPayMethod,
			Boolean cmSubmitProp, String cmBank, Double oidCmMstr) {
		super(id, cmShip, cmType, cmCrTerms, cmXslspsn, cmQadi01, cmPrList,
				cmDiscPct, cmPartial, cmStmt, cmDun, cmFin, cmArAcct, cmArCc,
				cmQadc07, cmQadc01, cmStmtCyc, cmShipvia, cmRmks, cmResale,
				cmRegion, cmQad04, cmSort, cmBalance, cmTaxable, cmPayDate,
				cmXslspsn2, cmQadi02, cmAvgPay, cmUser1, cmUser2, cmCurr,
				cmLang, cmDb, cmCrHold, cmCrRating, cmHighCr, cmHighDate,
				cmSaleDate, cmInvoices, cmFinDate, cmQad06, cmFstId, cmPstId,
				cmPst, cmTaxIn, cmSite, cmClass, cmTaxc, cmBill, cmChr01,
				cmChr02, cmChr03, cmChr04, cmChr05, cmChr06, cmChr07, cmChr08,
				cmChr09, cmChr10, cmDte01, cmDte02, cmDec01, cmDec02, cmLog01,
				cmQadc02, cmFrList, cmFrTerms, cmUserid, cmModDate,
				cmConrepLogic, cmSlspsn, cmFrMinWt, cmDrftBal, cmLcBal,
				cmPrList2, cmFixPr, cmCrUpdate, cmCrReview, cmCollMthd,
				cmDrftMin, cmDrftMax, cmDrftDisc, cmDrftApv, cmInternal,
				cmSvcList, cmPoReqd, cmServTerms, cmCrLimit, cmPromo, cmBtbCr,
				cmBtbType, cmShipLt, cmBtbMthd, cmExRatetype, cmDiscComb,
				cmScurr, cmQadc03, cmQadc04, cmQadc05, cmQadc06, cmQadd01,
				cmQadd02, cmQadl01, cmQadl02, cmQadl03, cmQadl04, cmQadt01,
				cmQadt02, cmQadi03, cmQadi04, cmArSub, cmSic, cmPayMethod,
				cmSubmitProp, cmBank, oidCmMstr);
	}

}
