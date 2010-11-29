package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PttDet entity. @author MyEclipse Persistence Tools
 */
public class PttDet extends AbstractPttDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PttDet() {
	}

	/** minimal constructor */
	public PttDet(PttDetId id, Double oidPttDet) {
		super(id, oidPttDet);
	}

	/** full constructor */
	public PttDet(PttDetId id, String pttTaxc, Boolean pttTaxable,
			String pttUser1, String pttUser2, String pttUserid,
			Date pttModDate, String pttQadc01, Double oidPttDet) {
		super(id, pttTaxc, pttTaxable, pttUser1, pttUser2, pttUserid,
				pttModDate, pttQadc01, oidPttDet);
	}

}
