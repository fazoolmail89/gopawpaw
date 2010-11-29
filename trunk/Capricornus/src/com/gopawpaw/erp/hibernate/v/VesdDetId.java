package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VesdDetId entity. @author MyEclipse Persistence Tools
 */
public class VesdDetId extends AbstractVesdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VesdDetId() {
	}

	/** full constructor */
	public VesdDetId(String vesdDomain, String vesdVendor,
			String vesdVendorSource, Date vesdVesFromDate, Date vesdVesToDate,
			String vesdSite, String vesdPart, String vesdRecType,
			String vesdType, String vesdSubType, String vesdCategory,
			Integer vesdTranId) {
		super(vesdDomain, vesdVendor, vesdVendorSource, vesdVesFromDate,
				vesdVesToDate, vesdSite, vesdPart, vesdRecType, vesdType,
				vesdSubType, vesdCategory, vesdTranId);
	}

}
