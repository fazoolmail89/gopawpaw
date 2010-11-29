package com.gopawpaw.erp.hibernate.p;

/**
 * PfdDetId entity. @author MyEclipse Persistence Tools
 */
public class PfdDetId extends AbstractPfdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PfdDetId() {
	}

	/** minimal constructor */
	public PfdDetId(String pfdDomain) {
		super(pfdDomain);
	}

	/** full constructor */
	public PfdDetId(String pfdDomain, String pfdPart, String pfdSite) {
		super(pfdDomain, pfdPart, pfdSite);
	}

}
