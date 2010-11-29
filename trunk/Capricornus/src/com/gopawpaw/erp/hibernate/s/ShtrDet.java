package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShtrDet entity. @author MyEclipse Persistence Tools
 */
public class ShtrDet extends AbstractShtrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShtrDet() {
	}

	/** minimal constructor */
	public ShtrDet(ShtrDetId id, Double oidShtrDet) {
		super(id, oidShtrDet);
	}

	/** full constructor */
	public ShtrDet(ShtrDetId id, String shtrCurr, String shtrInvNbr,
			Date shtrShipDate, String shtrSite, Double shtrAmt,
			Double shtrQad01, Double shtrQad02, Double shtrQad03,
			Integer shtrQad04, String shtrQad05, String shtrUser1,
			String shtrUser2, Double oidShtrDet) {
		super(id, shtrCurr, shtrInvNbr, shtrShipDate, shtrSite, shtrAmt,
				shtrQad01, shtrQad02, shtrQad03, shtrQad04, shtrQad05,
				shtrUser1, shtrUser2, oidShtrDet);
	}

}
