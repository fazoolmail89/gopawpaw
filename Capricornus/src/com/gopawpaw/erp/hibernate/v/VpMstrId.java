package com.gopawpaw.erp.hibernate.v;

/**
 * VpMstrId entity. @author MyEclipse Persistence Tools
 */
public class VpMstrId extends AbstractVpMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VpMstrId() {
	}

	/** full constructor */
	public VpMstrId(String vpDomain, String vpPart, String vpVend,
			String vpVendPart) {
		super(vpDomain, vpPart, vpVend, vpVendPart);
	}

}
