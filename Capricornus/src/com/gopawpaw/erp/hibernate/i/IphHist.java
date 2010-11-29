package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IphHist entity. @author MyEclipse Persistence Tools
 */
public class IphHist extends AbstractIphHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IphHist() {
	}

	/** minimal constructor */
	public IphHist(IphHistId id, String iphUm, String iphList,
			String iphCombType, Double oidIphHist) {
		super(id, iphUm, iphList, iphCombType, oidIphHist);
	}

	/** full constructor */
	public IphHist(IphHistId id, String iphDiscAcct, String iphDiscCc,
			String iphDiscSub, String iphDiscProj, Double iphQty,
			Double iphAmt, Double iphDiscAmt, String iphBreakCat,
			Double iphPidQty, Double iphMinNet, String iphCrTerms,
			String iphFrList, String iphFrTerms, String iphUser1,
			String iphUser2, String iphQadc01, Double iphQadd01, Date iphDte01,
			Date iphDte02, Double iphDec01, Double iphDec02, Boolean iphLog01,
			String iphChr01, String iphChr02, String iphChr03, String iphChr04,
			String iphChr05, String iphChr06, String iphChr07, String iphChr08,
			String iphChr09, String iphChr10, Date iphModDate,
			String iphUserid, String iphQtyType, String iphUm, Integer iphTime,
			String iphAccrAcct, String iphList, String iphCombType,
			String iphAccrCc, String iphAccrProj, String iphAccrSub,
			Double iphDiscSeq, Boolean iphPrint, String iphPromo1,
			String iphPromo2, String iphPromo3, String iphPromo4,
			Integer iphBonusLine, String iphPigCode, Double oidIphHist) {
		super(id, iphDiscAcct, iphDiscCc, iphDiscSub, iphDiscProj, iphQty,
				iphAmt, iphDiscAmt, iphBreakCat, iphPidQty, iphMinNet,
				iphCrTerms, iphFrList, iphFrTerms, iphUser1, iphUser2,
				iphQadc01, iphQadd01, iphDte01, iphDte02, iphDec01, iphDec02,
				iphLog01, iphChr01, iphChr02, iphChr03, iphChr04, iphChr05,
				iphChr06, iphChr07, iphChr08, iphChr09, iphChr10, iphModDate,
				iphUserid, iphQtyType, iphUm, iphTime, iphAccrAcct, iphList,
				iphCombType, iphAccrCc, iphAccrProj, iphAccrSub, iphDiscSeq,
				iphPrint, iphPromo1, iphPromo2, iphPromo3, iphPromo4,
				iphBonusLine, iphPigCode, oidIphHist);
	}

}
