package com.gopawpaw.erp.hibernate.p;

/**
 * PtvDet entity. @author MyEclipse Persistence Tools
 */
public class PtvDet extends AbstractPtvDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtvDet() {
	}

	/** minimal constructor */
	public PtvDet(PtvDetId id, Double ptvStatValue, Double oidPtvDet) {
		super(id, ptvStatValue, oidPtvDet);
	}

	/** full constructor */
	public PtvDet(PtvDetId id, Double ptvStatValue, String ptvQad01,
			String ptvQad02, String ptvUser1, String ptvUser2, Double ptvQad03,
			Boolean ptvQad04, Double ptvDec01, Boolean ptvLog01,
			String ptvChr01, Double oidPtvDet) {
		super(id, ptvStatValue, ptvQad01, ptvQad02, ptvUser1, ptvUser2,
				ptvQad03, ptvQad04, ptvDec01, ptvLog01, ptvChr01, oidPtvDet);
	}

}
