package com.gopawpaw.erp.hibernate.s;

/**
 * SpMstrId entity. @author MyEclipse Persistence Tools
 */
public class SpMstrId extends AbstractSpMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SpMstrId() {
	}

	/** minimal constructor */
	public SpMstrId(String spDomain) {
		super(spDomain);
	}

	/** full constructor */
	public SpMstrId(String spDomain, String spAddr) {
		super(spDomain, spAddr);
	}

}
