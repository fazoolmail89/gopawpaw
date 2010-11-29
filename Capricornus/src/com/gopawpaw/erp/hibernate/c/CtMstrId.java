package com.gopawpaw.erp.hibernate.c;

/**
 * CtMstrId entity. @author MyEclipse Persistence Tools
 */
public class CtMstrId extends AbstractCtMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CtMstrId() {
	}

	/** minimal constructor */
	public CtMstrId(String ctDomain) {
		super(ctDomain);
	}

	/** full constructor */
	public CtMstrId(String ctDomain, String ctCode) {
		super(ctDomain, ctCode);
	}

}
