package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VepMstrId entity. @author MyEclipse Persistence Tools
 */
public class VepMstrId extends AbstractVepMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VepMstrId() {
	}

	/** minimal constructor */
	public VepMstrId(String vepDomain, String vepVendor,
			String vepVendorSource, Date vepTranDate, Integer vepTranId) {
		super(vepDomain, vepVendor, vepVendorSource, vepTranDate, vepTranId);
	}

	/** full constructor */
	public VepMstrId(String vepDomain, String vepVendor,
			String vepVendorSource, Date vepTranDate, Integer vepTranId,
			String vepSite) {
		super(vepDomain, vepVendor, vepVendorSource, vepTranDate, vepTranId,
				vepSite);
	}

}
