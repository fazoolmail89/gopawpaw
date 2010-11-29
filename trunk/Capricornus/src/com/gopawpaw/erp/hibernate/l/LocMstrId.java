package com.gopawpaw.erp.hibernate.l;

/**
 * LocMstrId entity. @author MyEclipse Persistence Tools
 */
public class LocMstrId extends AbstractLocMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LocMstrId() {
	}

	/** minimal constructor */
	public LocMstrId(String locDomain) {
		super(locDomain);
	}

	/** full constructor */
	public LocMstrId(String locDomain, String locSite, String locLoc) {
		super(locDomain, locSite, locLoc);
	}

}
