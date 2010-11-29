package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VesMstrId entity. @author MyEclipse Persistence Tools
 */
public class VesMstrId extends AbstractVesMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VesMstrId() {
	}

	/** full constructor */
	public VesMstrId(String vesDomain, String vesVendor,
			String vesVendorSource, Date vesFromDate, Date vesToDate,
			String vesSite, String vesPart, String vesRecType, String vesType,
			String vesSubType) {
		super(vesDomain, vesVendor, vesVendorSource, vesFromDate, vesToDate,
				vesSite, vesPart, vesRecType, vesType, vesSubType);
	}

}
