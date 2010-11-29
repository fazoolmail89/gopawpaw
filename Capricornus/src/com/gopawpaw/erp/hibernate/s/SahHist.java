package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SahHist entity. @author MyEclipse Persistence Tools
 */
public class SahHist extends AbstractSahHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SahHist() {
	}

	/** minimal constructor */
	public SahHist(SahHistId id, Double sahExRate2, String sahExRatetype,
			Integer sahExruSeq, Double oidSahHist) {
		super(id, sahExRate2, sahExRatetype, sahExruSeq, oidSahHist);
	}

	/** full constructor */
	public SahHist(SahHistId id, String sahArea, Boolean sahArrears,
			String sahQadc05, String sahQadc06, Boolean sahAutornew,
			Double sahBasePct, Integer sahBillCnt, String sahBillTo,
			String sahBillType, Boolean sahBlanket, String sahBol,
			Integer sahCallsAllow, Integer sahCallsTotal, Date sahCancel,
			Double sahCanTax, String sahChannel, Integer sahCmtindx,
			String sahXcommPct, Boolean sahComplete, Date sahConfDate,
			String sahCrCard, String sahCrInit, String sahCrTerms,
			String sahCurr, String sahCust, String sahCycle,
			Date sahDatePrinted, Double sahDiscPct, String sahEnduser,
			Date sahEndDate, Double sahEntEx, Date sahExpDate, Date sahExtDate,
			Double sahExRate, Boolean sahFixPr, Boolean sahFixRate,
			String sahFob, Date sahFreeFrm, Date sahFreeTo, String sahFstId,
			Boolean sahGen0itm, Boolean sahHold, String sahLimitCopy,
			Boolean sahInvoiced, Date sahInvDate, String sahLang,
			Date sahLastBill, Date sahLstBill, Date sahLstCover,
			String sahRenewedFrom, String sahMref, String sahNbr,
			Double sahNextDur, Date sahNxtBill, String sahOffHoursPt,
			Date sahOrdDate, Date sahOrigDate, String sahPart,
			Boolean sahPeriodic, String sahPo, String sahPrefix,
			Double sahPrepaid, Boolean sahPrint, Boolean sahPrintPl,
			String sahProdline, Boolean sahPrt0itm, String sahPrList,
			String sahPrList2, Boolean sahPst, String sahPstId,
			Double sahQtyPer, Double sahQtyPlst, String sahQuote,
			Boolean sahQuoteMod, Boolean sahRelease, Date sahRelDate,
			Date sahRenewalDate, Integer sahRenewCount, Integer sahRenewPeriod,
			Date sahRevalueDate, Integer sahRevalIndex, Integer sahRevalPeriod,
			String sahRmks, String sahRsnLost, String sahSahType,
			Boolean sahSchedule, Boolean sahSchedStart, Boolean sahSerialDet,
			String sahShipvia, Date sahShipDate, String sahSite,
			String sahXslspsn, String sahSource, String sahSoNbr,
			String sahStat, Date sahStCover, Date sahStDate,
			Boolean sahSummarize, Boolean sahTaxable, String sahTaxc,
			Date sahTaxDate, String sahTaxEnv, String sahTaxPct,
			String sahTaxUsage, Double sahTotalBilled, Double sahTotalCost,
			String sahRenewedTo, Double sahTrl1Amt, String sahTrl1Cd,
			Double sahTrl2Amt, String sahTrl2Cd, Double sahTrl3Amt,
			String sahTrl3Cd, String sahType, String sahUm, String sahUser1,
			String sahUser2, Double sahVisits, String sahChr01,
			String sahChr02, String sahChr03, String sahChr04, String sahChr05,
			String sahChr06, String sahChr07, String sahChr08, String sahChr09,
			String sahChr10, Double sahDec01, Double sahDec02, Double sahDec03,
			Date sahDte01, Date sahDte02, Date sahDte03, Boolean sahLog01,
			Boolean sahLog02, Boolean sahLog03, String sahQadc01,
			String sahQadc02, String sahQadc03, String sahQadc04,
			Date sahQadt01, Date sahQadt02, Date sahQadt03, Double sahQadd01,
			Double sahQadd02, Double sahQadd03, Boolean sahQadl01,
			Boolean sahQadl02, Boolean sahQadl03, String sahCommPct,
			String sahProject, Boolean sahMrp, String sahModUserid,
			Date sahModDate, String sahSlspsn, Boolean sahQadl04,
			Double sahExRate2, String sahExRatetype, Integer sahExruSeq,
			Double oidSahHist) {
		super(id, sahArea, sahArrears, sahQadc05, sahQadc06, sahAutornew,
				sahBasePct, sahBillCnt, sahBillTo, sahBillType, sahBlanket,
				sahBol, sahCallsAllow, sahCallsTotal, sahCancel, sahCanTax,
				sahChannel, sahCmtindx, sahXcommPct, sahComplete, sahConfDate,
				sahCrCard, sahCrInit, sahCrTerms, sahCurr, sahCust, sahCycle,
				sahDatePrinted, sahDiscPct, sahEnduser, sahEndDate, sahEntEx,
				sahExpDate, sahExtDate, sahExRate, sahFixPr, sahFixRate,
				sahFob, sahFreeFrm, sahFreeTo, sahFstId, sahGen0itm, sahHold,
				sahLimitCopy, sahInvoiced, sahInvDate, sahLang, sahLastBill,
				sahLstBill, sahLstCover, sahRenewedFrom, sahMref, sahNbr,
				sahNextDur, sahNxtBill, sahOffHoursPt, sahOrdDate, sahOrigDate,
				sahPart, sahPeriodic, sahPo, sahPrefix, sahPrepaid, sahPrint,
				sahPrintPl, sahProdline, sahPrt0itm, sahPrList, sahPrList2,
				sahPst, sahPstId, sahQtyPer, sahQtyPlst, sahQuote, sahQuoteMod,
				sahRelease, sahRelDate, sahRenewalDate, sahRenewCount,
				sahRenewPeriod, sahRevalueDate, sahRevalIndex, sahRevalPeriod,
				sahRmks, sahRsnLost, sahSahType, sahSchedule, sahSchedStart,
				sahSerialDet, sahShipvia, sahShipDate, sahSite, sahXslspsn,
				sahSource, sahSoNbr, sahStat, sahStCover, sahStDate,
				sahSummarize, sahTaxable, sahTaxc, sahTaxDate, sahTaxEnv,
				sahTaxPct, sahTaxUsage, sahTotalBilled, sahTotalCost,
				sahRenewedTo, sahTrl1Amt, sahTrl1Cd, sahTrl2Amt, sahTrl2Cd,
				sahTrl3Amt, sahTrl3Cd, sahType, sahUm, sahUser1, sahUser2,
				sahVisits, sahChr01, sahChr02, sahChr03, sahChr04, sahChr05,
				sahChr06, sahChr07, sahChr08, sahChr09, sahChr10, sahDec01,
				sahDec02, sahDec03, sahDte01, sahDte02, sahDte03, sahLog01,
				sahLog02, sahLog03, sahQadc01, sahQadc02, sahQadc03, sahQadc04,
				sahQadt01, sahQadt02, sahQadt03, sahQadd01, sahQadd02,
				sahQadd03, sahQadl01, sahQadl02, sahQadl03, sahCommPct,
				sahProject, sahMrp, sahModUserid, sahModDate, sahSlspsn,
				sahQadl04, sahExRate2, sahExRatetype, sahExruSeq, oidSahHist);
	}

}
