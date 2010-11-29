package com.gopawpaw.erp.hibernate.v;

/**
 * VexMstrId entity. @author MyEclipse Persistence Tools
 */
public class VexMstrId extends AbstractVexMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VexMstrId() {
	}

	/** full constructor */
	public VexMstrId(String vexDomain, String vexSite, String vexVendor,
			String vexVendorSource) {
		super(vexDomain, vexSite, vexVendor, vexVendorSource);
	}

}
