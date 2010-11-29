package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VepdDetId entity. @author MyEclipse Persistence Tools
 */
public class VepdDetId extends AbstractVepdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VepdDetId() {
	}

	/** full constructor */
	public VepdDetId(String vepdDomain, Integer vepdTranId, Date vepdTranDate,
			String vepdVendor, String vepdVendorSource, String vepdSite) {
		super(vepdDomain, vepdTranId, vepdTranDate, vepdVendor,
				vepdVendorSource, vepdSite);
	}

}
