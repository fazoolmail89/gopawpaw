package com.gopawpaw.erp.hibernate.r;

/**
 * RsdDetId entity. @author MyEclipse Persistence Tools
 */
public class RsdDetId extends AbstractRsdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsdDetId() {
	}

	/** minimal constructor */
	public RsdDetId(String rsdDomain, String rsdRsc) {
		super(rsdDomain, rsdRsc);
	}

	/** full constructor */
	public RsdDetId(String rsdDomain, String rsdRsc, String rsdSite,
			String rsdRef) {
		super(rsdDomain, rsdRsc, rsdSite, rsdRef);
	}

}
