package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PihHist entity. @author MyEclipse Persistence Tools
 */
public class PihHist extends AbstractPihHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PihHist() {
	}

	/** minimal constructor */
	public PihHist(PihHistId id, String pihUm, String pihList,
			String pihCombType, String pihPromo1, String pihPromo2,
			Integer pihBonusLine, Double oidPihHist) {
		super(id, pihUm, pihList, pihCombType, pihPromo1, pihPromo2,
				pihBonusLine, oidPihHist);
	}

	/** full constructor */
	public PihHist(PihHistId id, String pihDiscAcct, String pihDiscCc,
			String pihDiscSub, String pihDiscProj, Double pihQty,
			Double pihAmt, Double pihDiscAmt, String pihBreakCat,
			Double pihPidQty, Double pihMinNet, String pihCrTerms,
			String pihFrList, String pihFrTerms, String pihUser1,
			String pihUser2, String pihQadc01, Double pihQadd01, Date pihDte01,
			Date pihDte02, Double pihDec01, Double pihDec02, Boolean pihLog01,
			String pihChr01, String pihChr02, String pihChr03, String pihChr04,
			String pihChr05, String pihChr06, String pihChr07, String pihChr08,
			String pihChr09, String pihChr10, Date pihModDate,
			String pihUserid, String pihQtyType, String pihUm, Integer pihTime,
			String pihAccrAcct, String pihList, String pihCombType,
			String pihAccrCc, String pihAccrProj, String pihAccrSub,
			Double pihDiscSeq, Boolean pihPrint, String pihPromo1,
			String pihPromo2, Integer pihBonusLine, String pihPromo3,
			String pihPromo4, String pihPigCode, Double oidPihHist) {
		super(id, pihDiscAcct, pihDiscCc, pihDiscSub, pihDiscProj, pihQty,
				pihAmt, pihDiscAmt, pihBreakCat, pihPidQty, pihMinNet,
				pihCrTerms, pihFrList, pihFrTerms, pihUser1, pihUser2,
				pihQadc01, pihQadd01, pihDte01, pihDte02, pihDec01, pihDec02,
				pihLog01, pihChr01, pihChr02, pihChr03, pihChr04, pihChr05,
				pihChr06, pihChr07, pihChr08, pihChr09, pihChr10, pihModDate,
				pihUserid, pihQtyType, pihUm, pihTime, pihAccrAcct, pihList,
				pihCombType, pihAccrCc, pihAccrProj, pihAccrSub, pihDiscSeq,
				pihPrint, pihPromo1, pihPromo2, pihBonusLine, pihPromo3,
				pihPromo4, pihPigCode, oidPihHist);
	}

}
