package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FamtdDet entity. @author MyEclipse Persistence Tools
 */
public class FamtdDet extends AbstractFamtdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtdDet() {
	}

	/** minimal constructor */
	public FamtdDet(FamtdDetId id, Double famtdPercent, String famtdModUserid,
			Date famtdModDate, String famtdUser1, String famtdUser2,
			String famtdChr01, Double famtdDec01, Boolean famtdLog01,
			Integer famtdInt01, String famtdQadc01, Double famtdQadd01,
			Boolean famtdQadl01, Integer famtdQadi01, Double oidFamtdDet) {
		super(id, famtdPercent, famtdModUserid, famtdModDate, famtdUser1,
				famtdUser2, famtdChr01, famtdDec01, famtdLog01, famtdInt01,
				famtdQadc01, famtdQadd01, famtdQadl01, famtdQadi01, oidFamtdDet);
	}

	/** full constructor */
	public FamtdDet(FamtdDetId id, Double famtdPercent, String famtdModUserid,
			Date famtdModDate, String famtdUser1, String famtdUser2,
			String famtdChr01, Double famtdDec01, Boolean famtdLog01,
			Date famtdDte01, Integer famtdInt01, String famtdQadc01,
			Double famtdQadd01, Boolean famtdQadl01, Integer famtdQadi01,
			Date famtdQadt01, Double oidFamtdDet) {
		super(id, famtdPercent, famtdModUserid, famtdModDate, famtdUser1,
				famtdUser2, famtdChr01, famtdDec01, famtdLog01, famtdDte01,
				famtdInt01, famtdQadc01, famtdQadd01, famtdQadl01, famtdQadi01,
				famtdQadt01, oidFamtdDet);
	}

}
