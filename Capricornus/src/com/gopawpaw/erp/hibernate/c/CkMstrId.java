package com.gopawpaw.erp.hibernate.c;

/**
 * CkMstrId entity. @author MyEclipse Persistence Tools
 */
public class CkMstrId extends AbstractCkMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CkMstrId() {
	}

	/** minimal constructor */
	public CkMstrId(String ckDomain) {
		super(ckDomain);
	}

	/** full constructor */
	public CkMstrId(String ckDomain, String ckRef) {
		super(ckDomain, ckRef);
	}

}
