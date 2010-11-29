package com.gopawpaw.erp.hibernate.f;

/**
 * FnMstrId entity. @author MyEclipse Persistence Tools
 */
public class FnMstrId extends AbstractFnMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FnMstrId() {
	}

	/** minimal constructor */
	public FnMstrId(String fnDomain) {
		super(fnDomain);
	}

	/** full constructor */
	public FnMstrId(String fnDomain, String fnNbr) {
		super(fnDomain, fnNbr);
	}

}
