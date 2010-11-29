package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PcdDet entity. @author MyEclipse Persistence Tools
 */
public class PcdDet extends AbstractPcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcdDet() {
	}

	/** minimal constructor */
	public PcdDet(PcdDetId id, Double oidPcdDet) {
		super(id, oidPcdDet);
	}

	/** full constructor */
	public PcdDet(PcdDetId id, Date pcdQad01, String pcdUser1, String pcdUser2,
			Boolean pcdQad03, String pcdQad02, Double pcdQad04, String pcdCurr,
			Double pcdAmt, Double pcdQad05, Double oidPcdDet) {
		super(id, pcdQad01, pcdUser1, pcdUser2, pcdQad03, pcdQad02, pcdQad04,
				pcdCurr, pcdAmt, pcdQad05, oidPcdDet);
	}

}
