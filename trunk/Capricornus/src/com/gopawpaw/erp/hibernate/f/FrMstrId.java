package com.gopawpaw.erp.hibernate.f;

/**
 * FrMstrId entity. @author MyEclipse Persistence Tools
 */
public class FrMstrId extends AbstractFrMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrMstrId() {
	}

	/** minimal constructor */
	public FrMstrId(String frDomain) {
		super(frDomain);
	}

	/** full constructor */
	public FrMstrId(String frDomain, String frList, String frSite, String frCurr) {
		super(frDomain, frList, frSite, frCurr);
	}

}
