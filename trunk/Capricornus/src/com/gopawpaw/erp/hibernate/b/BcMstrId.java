package com.gopawpaw.erp.hibernate.b;

/**
 * BcMstrId entity. @author MyEclipse Persistence Tools
 */
public class BcMstrId extends AbstractBcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BcMstrId() {
	}

	/** minimal constructor */
	public BcMstrId(String bcDomain) {
		super(bcDomain);
	}

	/** full constructor */
	public BcMstrId(String bcDomain, String bcBatch) {
		super(bcDomain, bcBatch);
	}

}
