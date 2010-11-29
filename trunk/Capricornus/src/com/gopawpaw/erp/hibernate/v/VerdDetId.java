package com.gopawpaw.erp.hibernate.v;

/**
 * VerdDetId entity. @author MyEclipse Persistence Tools
 */
public class VerdDetId extends AbstractVerdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VerdDetId() {
	}

	/** full constructor */
	public VerdDetId(String verdDomain, String verdVendor,
			String verdVendorSource, String verdSite, String verdCategory) {
		super(verdDomain, verdVendor, verdVendorSource, verdSite, verdCategory);
	}

}
