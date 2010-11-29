package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PoMstr entity. @author MyEclipse Persistence Tools
 */
public class PoMstr extends AbstractPoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PoMstr() {
	}

	/** minimal constructor */
	public PoMstr(PoMstrId id, String poSoNbr, Boolean poIsBtb,
			Boolean poSoHold, String poXmit, Double poExRate2,
			String poExRatetype, Integer poExruSeq, Boolean poConsignment,
			Integer poMaxAgingDays, String poAppOwner, String poTotTermsCode,
			Double poTransltDays, Double oidPoMstr) {
		super(id, poSoNbr, poIsBtb, poSoHold, poXmit, poExRate2, poExRatetype,
				poExruSeq, poConsignment, poMaxAgingDays, poAppOwner,
				poTotTermsCode, poTransltDays, oidPoMstr);
	}

	/** full constructor */
	public PoMstr(PoMstrId id, String poVend, String poShip, Date poOrdDate,
			String poRmks, String poCrTerms, String poBuyer, String poShipvia,
			String poFob, String poBill, Boolean poQad04, Boolean poPartial,
			Double poRev, String poStat, String poApAcct, String poApCc,
			Double poFrt, Double poServChg, Double poSpecChg, String poTaxPct,
			Double poDiscPct, Double poPrepaid, String poContact,
			Boolean poConfirm, Integer poCmtindx, Boolean poPrint,
			Date poClsDate, Boolean poTaxable, String poUser1, String poUser2,
			String poCurr, Double poExRate, String poLang, String poFstId,
			String poPstId, Boolean poPst, String poDutyType, Double poQad05,
			String poQad07, String poQad08, String poSite, String poBlanket,
			Date poQad01, Integer poQad02, String poQad03, String poContract,
			String poDelTo, Date poDueDate, Date poEffStrt, Date poEffTo,
			Double poEstValue, Boolean poQad06, String poProject,
			Integer poRelNbr, String poReqId, String poType, String poUserId,
			Double poQad09, Boolean poRelease, Boolean poRecurr, String poCycl,
			String poChr01, String poChr02, String poChr03, String poChr04,
			String poChr05, String poChr06, String poChr07, String poChr08,
			String poChr09, String poChr10, Date poDte01, Date poDte02,
			Double poDec01, Double poDec02, Boolean poLog01, String poInvMthd,
			Boolean poFixRate, Double poEntEx, Date poTaxDate,
			String poFsmType, String poBank, String poPrList, String poTaxEnv,
			Boolean poSched, String poPrList2, String poTaxUsage,
			Boolean poFixPr, String poTaxc, String poSchMthd, Date poPricedDt,
			Date poPricingDt, String poErsOpt, Integer poPrLstTp,
			String poQadc01, String poQadc02, Double poQadd01, Double poQadd02,
			Integer poQadi01, Integer poQadi02, String poSoNbr,
			Boolean poIsBtb, Boolean poSoHold, String poXmit, Double poExRate2,
			String poExRatetype, Integer poExruSeq, String poApSub,
			Double poCrtInt, Boolean poConsignment, Integer poMaxAgingDays,
			String poAppOwner, String poTotTermsCode, Double poTransltDays,
			Double oidPoMstr) {
		super(id, poVend, poShip, poOrdDate, poRmks, poCrTerms, poBuyer,
				poShipvia, poFob, poBill, poQad04, poPartial, poRev, poStat,
				poApAcct, poApCc, poFrt, poServChg, poSpecChg, poTaxPct,
				poDiscPct, poPrepaid, poContact, poConfirm, poCmtindx, poPrint,
				poClsDate, poTaxable, poUser1, poUser2, poCurr, poExRate,
				poLang, poFstId, poPstId, poPst, poDutyType, poQad05, poQad07,
				poQad08, poSite, poBlanket, poQad01, poQad02, poQad03,
				poContract, poDelTo, poDueDate, poEffStrt, poEffTo, poEstValue,
				poQad06, poProject, poRelNbr, poReqId, poType, poUserId,
				poQad09, poRelease, poRecurr, poCycl, poChr01, poChr02,
				poChr03, poChr04, poChr05, poChr06, poChr07, poChr08, poChr09,
				poChr10, poDte01, poDte02, poDec01, poDec02, poLog01,
				poInvMthd, poFixRate, poEntEx, poTaxDate, poFsmType, poBank,
				poPrList, poTaxEnv, poSched, poPrList2, poTaxUsage, poFixPr,
				poTaxc, poSchMthd, poPricedDt, poPricingDt, poErsOpt,
				poPrLstTp, poQadc01, poQadc02, poQadd01, poQadd02, poQadi01,
				poQadi02, poSoNbr, poIsBtb, poSoHold, poXmit, poExRate2,
				poExRatetype, poExruSeq, poApSub, poCrtInt, poConsignment,
				poMaxAgingDays, poAppOwner, poTotTermsCode, poTransltDays,
				oidPoMstr);
	}

}
