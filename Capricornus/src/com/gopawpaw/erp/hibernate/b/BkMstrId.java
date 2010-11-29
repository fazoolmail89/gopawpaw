package com.gopawpaw.erp.hibernate.b;

/**
 * BkMstrId entity. @author MyEclipse Persistence Tools
 */
public class BkMstrId extends AbstractBkMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkMstrId() {
	}

	/** minimal constructor */
	public BkMstrId(String bkDomain) {
		super(bkDomain);
	}

	/** full constructor */
	public BkMstrId(String bkDomain, String bkCode) {
		super(bkDomain, bkCode);
	}

}
