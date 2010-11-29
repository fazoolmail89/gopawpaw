package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FamtrdDet entity. @author MyEclipse Persistence Tools
 */
public class FamtrdDet extends AbstractFamtrdDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtrdDet() {
	}

	/** minimal constructor */
	public FamtrdDet(FamtrdDetId id, String famtrdAction, Date famtrdDate,
			Integer famtrdReading, Integer famtrdAccum, Integer famtrdUsage,
			String famtrdModUserid, Date famtrdModDate, String famtrdUser1,
			String famtrdUser2, String famtrdChr01, Double famtrdDec01,
			Boolean famtrdLog01, Integer famtrdInt01, String famtrdQadc01,
			Double famtrdQadd01, Boolean famtrdQadl01, Integer famtrdQadi01,
			Double oidFamtrdDet) {
		super(id, famtrdAction, famtrdDate, famtrdReading, famtrdAccum,
				famtrdUsage, famtrdModUserid, famtrdModDate, famtrdUser1,
				famtrdUser2, famtrdChr01, famtrdDec01, famtrdLog01,
				famtrdInt01, famtrdQadc01, famtrdQadd01, famtrdQadl01,
				famtrdQadi01, oidFamtrdDet);
	}

	/** full constructor */
	public FamtrdDet(FamtrdDetId id, String famtrdAction, Date famtrdDate,
			Integer famtrdReading, Integer famtrdAccum, Integer famtrdUsage,
			String famtrdModUserid, Date famtrdModDate, String famtrdUser1,
			String famtrdUser2, String famtrdChr01, Double famtrdDec01,
			Boolean famtrdLog01, Date famtrdDte01, Integer famtrdInt01,
			String famtrdQadc01, Double famtrdQadd01, Boolean famtrdQadl01,
			Integer famtrdQadi01, Date famtrdQadt01, Double oidFamtrdDet) {
		super(id, famtrdAction, famtrdDate, famtrdReading, famtrdAccum,
				famtrdUsage, famtrdModUserid, famtrdModDate, famtrdUser1,
				famtrdUser2, famtrdChr01, famtrdDec01, famtrdLog01,
				famtrdDte01, famtrdInt01, famtrdQadc01, famtrdQadd01,
				famtrdQadl01, famtrdQadi01, famtrdQadt01, oidFamtrdDet);
	}

}
