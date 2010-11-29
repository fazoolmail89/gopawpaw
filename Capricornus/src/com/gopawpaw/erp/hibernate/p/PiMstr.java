package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PiMstr entity. @author MyEclipse Persistence Tools
 */
public class PiMstr extends AbstractPiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PiMstr() {
	}

	/** minimal constructor */
	public PiMstr(PiMstrId id, String piCombType, String piAmtType,
			String piPromo1, String piPromo2, Double oidPiMstr) {
		super(id, piCombType, piAmtType, piPromo1, piPromo2, oidPiMstr);
	}

	/** full constructor */
	public PiMstr(PiMstrId id, String piDesc, Date piExpire, String piCombType,
			String piAmtType, String piBreakCat, String piQtyType,
			Boolean piManual, Double piMaxQty, String piCostSet,
			String piDiscAcct, String piDiscSub, String piDiscProj,
			String piListId, Boolean piConfgDisc, Double piMinNet,
			Integer piMaxOrd, Double piListPrice, Double piMinPrice,
			Double piMaxPrice, String piUserid, Date piModDate, String piUser1,
			String piUser2, String piQadc01, Double piQadd01, Date piDte01,
			Date piDte02, Double piDec01, Double piDec02, Boolean piLog01,
			String piChr01, String piChr02, String piChr03, String piChr04,
			String piChr05, String piChr06, String piChr07, String piChr08,
			String piChr09, String piChr10, String piDiscCc, String piTerms,
			Integer piCmtindx, Integer piSrchType, String piAccrCc,
			String piAccrProj, String piAccrAcct, String piAccrSub,
			Boolean piPrint, Double piDiscSeq, Boolean piExtrec,
			String piPromo1, String piPromo2, String piPromo3, String piPromo4,
			String piPigCode, Double oidPiMstr) {
		super(id, piDesc, piExpire, piCombType, piAmtType, piBreakCat,
				piQtyType, piManual, piMaxQty, piCostSet, piDiscAcct,
				piDiscSub, piDiscProj, piListId, piConfgDisc, piMinNet,
				piMaxOrd, piListPrice, piMinPrice, piMaxPrice, piUserid,
				piModDate, piUser1, piUser2, piQadc01, piQadd01, piDte01,
				piDte02, piDec01, piDec02, piLog01, piChr01, piChr02, piChr03,
				piChr04, piChr05, piChr06, piChr07, piChr08, piChr09, piChr10,
				piDiscCc, piTerms, piCmtindx, piSrchType, piAccrCc, piAccrProj,
				piAccrAcct, piAccrSub, piPrint, piDiscSeq, piExtrec, piPromo1,
				piPromo2, piPromo3, piPromo4, piPigCode, oidPiMstr);
	}

}
