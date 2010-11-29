package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AldDet entity. @author MyEclipse Persistence Tools
 */
public class AldDet extends AbstractAldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AldDet() {
	}

	/** minimal constructor */
	public AldDet(AldDetId id, Double oidAldDet) {
		super(id, oidAldDet);
	}

	/** full constructor */
	public AldDet(AldDetId id, Double aldPct, String aldUser1, String aldUser2,
			String aldQad02, Date aldQad01, Double oidAldDet) {
		super(id, aldPct, aldUser1, aldUser2, aldQad02, aldQad01, oidAldDet);
	}

}
