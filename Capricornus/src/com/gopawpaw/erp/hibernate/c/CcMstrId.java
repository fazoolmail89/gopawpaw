package com.gopawpaw.erp.hibernate.c;

/**
 * CcMstrId entity. @author MyEclipse Persistence Tools
 */
public class CcMstrId extends AbstractCcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CcMstrId() {
	}

	/** minimal constructor */
	public CcMstrId(String ccDomain) {
		super(ccDomain);
	}

	/** full constructor */
	public CcMstrId(String ccDomain, String ccCtr, Boolean ccActive) {
		super(ccDomain, ccCtr, ccActive);
	}

}
