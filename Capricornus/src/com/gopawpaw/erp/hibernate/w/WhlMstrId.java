package com.gopawpaw.erp.hibernate.w;

/**
 * WhlMstrId entity. @author MyEclipse Persistence Tools
 */
public class WhlMstrId extends AbstractWhlMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WhlMstrId() {
	}

	/** minimal constructor */
	public WhlMstrId(String whlDomain) {
		super(whlDomain);
	}

	/** full constructor */
	public WhlMstrId(String whlDomain, String whlSite, String whlLoc) {
		super(whlDomain, whlSite, whlLoc);
	}

}
