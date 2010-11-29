package com.gopawpaw.erp.hibernate.l;

/**
 * LnMstrId entity. @author MyEclipse Persistence Tools
 */
public class LnMstrId extends AbstractLnMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnMstrId() {
	}

	/** minimal constructor */
	public LnMstrId(String lnDomain) {
		super(lnDomain);
	}

	/** full constructor */
	public LnMstrId(String lnDomain, String lnLine, String lnSite) {
		super(lnDomain, lnLine, lnSite);
	}

}
