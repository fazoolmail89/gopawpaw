package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SaMstr entity. @author MyEclipse Persistence Tools
 */
public class SaMstr extends AbstractSaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SaMstr() {
	}

	/** minimal constructor */
	public SaMstr(SaMstrId id, String saRsnLost, Double saExRate2,
			String saExRatetype, Integer saExruSeq, String saCallPrice,
			String saRevenue, String saFsaccrAcct, String saFsaccrSub,
			String saFsaccrCc, String saFsdefAcct, String saFsdefSub,
			String saFsdefCc, Boolean saBillEnduser, Boolean saBillSummary,
			Boolean saItemEnduser, Boolean saPerBill, Boolean saProrate,
			Double oidSaMstr) {
		super(id, saRsnLost, saExRate2, saExRatetype, saExruSeq, saCallPrice,
				saRevenue, saFsaccrAcct, saFsaccrSub, saFsaccrCc, saFsdefAcct,
				saFsdefSub, saFsdefCc, saBillEnduser, saBillSummary,
				saItemEnduser, saPerBill, saProrate, oidSaMstr);
	}

	/** full constructor */
	public SaMstr(SaMstrId id, String saCust, String saEnduser, Date saOrdDate,
			Date saStDate, Date saEndDate, String saRmks, String saCrTerms,
			String saFob, String saPo, String saShipvia, Boolean saPrint,
			String saPrList, String saQadc05, String saSource,
			String saXcommPct, String saCrCard, Boolean saPrintPl,
			String saCrInit, String saStat, Double saDiscPct, String saTaxPct,
			Double saPrepaid, Boolean saInvoiced, String saArAcct,
			String saArCc, Date saInvDate, Date saShipDate, Boolean saTaxable,
			Integer saCmtindx, String saUser1, String saUser2, String saCurr,
			Double saExRate, String saLang, String saType, Date saConfDate,
			String saBol, Boolean saPst, String saFstId, Double saTrl1Amt,
			String saTrl1Cd, Double saTrl2Amt, String saTrl2Cd,
			Double saTrl3Amt, String saTrl3Cd, String saPstId, String saQuote,
			String saTaxc, String saChr01, String saChr02, String saChr03,
			String saChr04, String saChr05, String saChr06, String saChr07,
			String saChr08, String saChr09, String saChr10, Date saDte01,
			Date saDte02, Double saDec01, Double saDec02, Boolean saLog01,
			String saSvCode, Date saLastBill, Date saNxtBill, Date saRelDate,
			Boolean saRelease, String saUm, String saCycle, Date saExpDate,
			Boolean saComplete, Integer saBillCnt, String saSoNbr,
			String saProdline, String saMref, Date saLstCover,
			Boolean saAutornew, Date saExtDate, Boolean saArrears,
			Boolean saHold, Date saStCover, Double saQtyPer, Double saQtyPlst,
			Date saLstBill, Double saCanTax, Date saFreeFrm, Date saFreeTo,
			Date saCancel, String saSite, String saBillTo, String saArea,
			Boolean saBlanket, String saChannel, Date saDatePrinted,
			Boolean saGen0itm, Date saOrigDate, Boolean saPrt0itm,
			Boolean saQuoteMod, String saRsnLost, String saSaType,
			String saBillType, Boolean saSchedStart, Boolean saSerialDet,
			Boolean saSummarize, Double saVisits, Date saTaxDate,
			Double saEntEx, String saOffHoursPt, String saTaxEnv,
			String saTaxUsage, String saPrList2, Boolean saFixRate,
			Boolean saFixPr, String saCommPct, String saSlspsn,
			Double saBasePct, String saLimitCopy, Integer saCallsAllow,
			Integer saCallsTotal, Integer saRevalPeriod, Double saDec03,
			Double saNextDur, Boolean saPeriodic, Date saRenewalDate,
			Integer saRenewCount, Integer saRenewPeriods, Date saRevalueDate,
			Integer saRevalIndex, Boolean saQadl04, Boolean saSchedule,
			Double saTotalBilled, Double saTotalCost, Date saDte03,
			String saQadc01, String saQadc02, String saQadc03, String saQadc04,
			Date saQadt01, Date saQadt02, Date saQadt03, Double saQadd01,
			Double saQadd02, Double saQadd03, Boolean saQadl01,
			Boolean saQadl02, Boolean saQadl03, String saProject,
			Boolean saMrp, String saModUserid, Date saModDate,
			String saRenewedFrom, String saRenewedTo, Boolean saLog02,
			Boolean saLog03, Double saExRate2, String saExRatetype,
			Integer saExruSeq, String saArSub, String saCallPrice,
			String saRevenue, String saFsaccrAcct, String saFsaccrSub,
			String saFsaccrCc, String saFsdefAcct, String saFsdefSub,
			String saFsdefCc, Boolean saBillEnduser, Boolean saBillSummary,
			Boolean saItemEnduser, Boolean saPerBill, Boolean saProrate,
			Double oidSaMstr) {
		super(id, saCust, saEnduser, saOrdDate, saStDate, saEndDate, saRmks,
				saCrTerms, saFob, saPo, saShipvia, saPrint, saPrList, saQadc05,
				saSource, saXcommPct, saCrCard, saPrintPl, saCrInit, saStat,
				saDiscPct, saTaxPct, saPrepaid, saInvoiced, saArAcct, saArCc,
				saInvDate, saShipDate, saTaxable, saCmtindx, saUser1, saUser2,
				saCurr, saExRate, saLang, saType, saConfDate, saBol, saPst,
				saFstId, saTrl1Amt, saTrl1Cd, saTrl2Amt, saTrl2Cd, saTrl3Amt,
				saTrl3Cd, saPstId, saQuote, saTaxc, saChr01, saChr02, saChr03,
				saChr04, saChr05, saChr06, saChr07, saChr08, saChr09, saChr10,
				saDte01, saDte02, saDec01, saDec02, saLog01, saSvCode,
				saLastBill, saNxtBill, saRelDate, saRelease, saUm, saCycle,
				saExpDate, saComplete, saBillCnt, saSoNbr, saProdline, saMref,
				saLstCover, saAutornew, saExtDate, saArrears, saHold,
				saStCover, saQtyPer, saQtyPlst, saLstBill, saCanTax, saFreeFrm,
				saFreeTo, saCancel, saSite, saBillTo, saArea, saBlanket,
				saChannel, saDatePrinted, saGen0itm, saOrigDate, saPrt0itm,
				saQuoteMod, saRsnLost, saSaType, saBillType, saSchedStart,
				saSerialDet, saSummarize, saVisits, saTaxDate, saEntEx,
				saOffHoursPt, saTaxEnv, saTaxUsage, saPrList2, saFixRate,
				saFixPr, saCommPct, saSlspsn, saBasePct, saLimitCopy,
				saCallsAllow, saCallsTotal, saRevalPeriod, saDec03, saNextDur,
				saPeriodic, saRenewalDate, saRenewCount, saRenewPeriods,
				saRevalueDate, saRevalIndex, saQadl04, saSchedule,
				saTotalBilled, saTotalCost, saDte03, saQadc01, saQadc02,
				saQadc03, saQadc04, saQadt01, saQadt02, saQadt03, saQadd01,
				saQadd02, saQadd03, saQadl01, saQadl02, saQadl03, saProject,
				saMrp, saModUserid, saModDate, saRenewedFrom, saRenewedTo,
				saLog02, saLog03, saExRate2, saExRatetype, saExruSeq, saArSub,
				saCallPrice, saRevenue, saFsaccrAcct, saFsaccrSub, saFsaccrCc,
				saFsdefAcct, saFsdefSub, saFsdefCc, saBillEnduser,
				saBillSummary, saItemEnduser, saPerBill, saProrate, oidSaMstr);
	}

}
