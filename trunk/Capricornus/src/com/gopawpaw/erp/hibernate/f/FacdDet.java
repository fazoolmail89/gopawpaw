package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FacdDet entity. @author MyEclipse Persistence Tools
 */
public class FacdDet extends AbstractFacdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacdDet() {
	}

	/** minimal constructor */
	public FacdDet(FacdDetId id, String facdFabkId, String facdAcct,
			String facdModUserid, Date facdModDate, String facdUser1,
			String facdUser2, String facdChr01, Double facdDec01,
			Boolean facdLog01, Integer facdInt01, String facdQadc01,
			Double facdQadd01, Integer facdQadi01, Boolean facdQadl01,
			Double oidFacdDet) {
		super(id, facdFabkId, facdAcct, facdModUserid, facdModDate, facdUser1,
				facdUser2, facdChr01, facdDec01, facdLog01, facdInt01,
				facdQadc01, facdQadd01, facdQadi01, facdQadl01, oidFacdDet);
	}

	/** full constructor */
	public FacdDet(FacdDetId id, String facdFabkId, String facdAcct,
			String facdModUserid, Date facdModDate, String facdUser1,
			String facdUser2, String facdChr01, Double facdDec01,
			Boolean facdLog01, Date facdDte01, Integer facdInt01,
			String facdQadc01, Double facdQadd01, Integer facdQadi01,
			Boolean facdQadl01, Date facdQadt01, Double oidFacdDet) {
		super(id, facdFabkId, facdAcct, facdModUserid, facdModDate, facdUser1,
				facdUser2, facdChr01, facdDec01, facdLog01, facdDte01,
				facdInt01, facdQadc01, facdQadd01, facdQadi01, facdQadl01,
				facdQadt01, oidFacdDet);
	}

}
