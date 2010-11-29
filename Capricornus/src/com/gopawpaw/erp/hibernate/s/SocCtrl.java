package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;

/**
 * SocCtrl entity. @author MyEclipse Persistence Tools
 */
public class SocCtrl extends AbstractSocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SocCtrl() {
	}

	/** minimal constructor */
	public SocCtrl(Boolean socReturnsIsb, Boolean socApm, String socBtbType,
			Boolean socDueCalc, Boolean socBtbAll, String socBtbSel,
			Boolean socUseBtb, String socDumLoc, String socExRatetype,
			Boolean socAtpEnabled, Boolean socCalcPromiseDate,
			Integer socHorizon, Integer socCrnNext, String socCrnPre,
			Double oidSocCtrl) {
		super(socReturnsIsb, socApm, socBtbType, socDueCalc, socBtbAll,
				socBtbSel, socUseBtb, socDumLoc, socExRatetype, socAtpEnabled,
				socCalcPromiseDate, socHorizon, socCrnNext, socCrnPre,
				oidSocCtrl);
	}

	/** full constructor */
	public SocCtrl(Boolean socOnOrd, Boolean socReq, Boolean socAll,
			Boolean socPick, Boolean socQad01, Boolean socQad02,
			Integer socInv, Integer socSo, Integer socAllDays,
			Boolean socAllAvl, Boolean socLnFmt, Integer socJrnl,
			Boolean socSoHist, Integer socShpLead, Boolean socPrint,
			Boolean socAr, String socCompany, String socFob, Boolean socHcmmts,
			Boolean socLcmmts, String socNtaxdesc, Boolean socSa,
			Integer socFcstFwd, Integer socFcstBck, String socTrlTax,
			Boolean socInvHist, Boolean socLnInv, Boolean socConfirm,
			Integer socQad03, Boolean socDetAll, Integer socFysm,
			String socTrlNtax, String socUser1, String socUser2,
			Integer socIndex1, Integer socNextAbl, Integer socNextCid,
			Boolean socFrBySite, String socInvPre, String socSoPre,
			Boolean socMargin, Boolean socCrHold, Boolean socPlReq,
			BigDecimal socMinShip, Double socInvMin, Boolean socFrShpCalc,
			String socFrcReturns, String socCrtaccAcct, String socCrtaccCc,
			String socCrtappAcct, String socCrtappCc, Boolean socEditIsb,
			Double socMinShpamt, Boolean socPcLine, Boolean socPimIsb,
			String socPrintId, Boolean socPtReq, Boolean socBatch,
			String socBatchId, Boolean socReturnsIsb, Boolean socQadl02,
			Boolean socQadl03, String socQadc01, String socQadc02,
			String socQadc03, Integer socQadi01, Integer socQadi02,
			Boolean socApm, String socBtbType, Boolean socDueCalc,
			Boolean socBtbAll, String socBtbSel, Boolean socUseBtb,
			String socDumLoc, Boolean socMlevelBtb, String socExRatetype,
			Boolean socUseFrtTrlCd, String socCrtappSub, String socCrtaccSub,
			Boolean socPassCurr, Boolean socAutoChg, Boolean socAtpEnabled,
			Boolean socCalcPromiseDate, Integer socHorizon, Integer socCrnNext,
			String socCrnPre, Double oidSocCtrl) {
		super(socOnOrd, socReq, socAll, socPick, socQad01, socQad02, socInv,
				socSo, socAllDays, socAllAvl, socLnFmt, socJrnl, socSoHist,
				socShpLead, socPrint, socAr, socCompany, socFob, socHcmmts,
				socLcmmts, socNtaxdesc, socSa, socFcstFwd, socFcstBck,
				socTrlTax, socInvHist, socLnInv, socConfirm, socQad03,
				socDetAll, socFysm, socTrlNtax, socUser1, socUser2, socIndex1,
				socNextAbl, socNextCid, socFrBySite, socInvPre, socSoPre,
				socMargin, socCrHold, socPlReq, socMinShip, socInvMin,
				socFrShpCalc, socFrcReturns, socCrtaccAcct, socCrtaccCc,
				socCrtappAcct, socCrtappCc, socEditIsb, socMinShpamt,
				socPcLine, socPimIsb, socPrintId, socPtReq, socBatch,
				socBatchId, socReturnsIsb, socQadl02, socQadl03, socQadc01,
				socQadc02, socQadc03, socQadi01, socQadi02, socApm, socBtbType,
				socDueCalc, socBtbAll, socBtbSel, socUseBtb, socDumLoc,
				socMlevelBtb, socExRatetype, socUseFrtTrlCd, socCrtappSub,
				socCrtaccSub, socPassCurr, socAutoChg, socAtpEnabled,
				socCalcPromiseDate, socHorizon, socCrnNext, socCrnPre,
				oidSocCtrl);
	}

}
