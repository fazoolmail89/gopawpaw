package com.gopawpaw.erp.hibernate.v;

/**
 * VerMstrId entity. @author MyEclipse Persistence Tools
 */
public class VerMstrId extends AbstractVerMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VerMstrId() {
	}

	/** full constructor */
	public VerMstrId(String verDomain, String verVendor,
			String verVendorSource, String verSite, String verPart,
			String verCommCode) {
		super(verDomain, verVendor, verVendorSource, verSite, verPart,
				verCommCode);
	}

}
