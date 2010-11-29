package com.gopawpaw.erp.hibernate.c;

/**
 * CbMstrId entity. @author MyEclipse Persistence Tools
 */
public class CbMstrId extends AbstractCbMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CbMstrId() {
	}

	/** minimal constructor */
	public CbMstrId(String cbDomain) {
		super(cbDomain);
	}

	/** full constructor */
	public CbMstrId(String cbDomain, String cbBatch, Integer cbLine) {
		super(cbDomain, cbBatch, cbLine);
	}

}
