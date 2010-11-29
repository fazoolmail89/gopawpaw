package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SobDet entity. @author MyEclipse Persistence Tools
 */
public class SobDet extends AbstractSobDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SobDet() {
	}

	/** minimal constructor */
	public SobDet(SobDetId id, Double oidSobDet) {
		super(id, oidSobDet);
	}

	/** full constructor */
	public SobDet(SobDetId id, Date sobIssDate, Double sobQtyReq,
			Double sobQtyAll, Double sobQtyPick, Double sobQtyIss,
			Double sobTotStd, Double sobQtyChg, Double sobBoChg,
			Double sobPrice, String sobLoc, String sobSerial,
			Integer sobCmtindx, String sobUser1, String sobUser2,
			String sobSite, Double sobScrpPct, String sobQadc01,
			String sobCfgType, Double oidSobDet) {
		super(id, sobIssDate, sobQtyReq, sobQtyAll, sobQtyPick, sobQtyIss,
				sobTotStd, sobQtyChg, sobBoChg, sobPrice, sobLoc, sobSerial,
				sobCmtindx, sobUser1, sobUser2, sobSite, sobScrpPct, sobQadc01,
				sobCfgType, oidSobDet);
	}

}
