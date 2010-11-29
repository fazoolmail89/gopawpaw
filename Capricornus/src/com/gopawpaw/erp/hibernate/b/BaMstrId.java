package com.gopawpaw.erp.hibernate.b;

/**
 * BaMstrId entity. @author MyEclipse Persistence Tools
 */
public class BaMstrId extends AbstractBaMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BaMstrId() {
	}

	/** minimal constructor */
	public BaMstrId(String baDomain) {
		super(baDomain);
	}

	/** full constructor */
	public BaMstrId(String baDomain, String baModule, String baBatch) {
		super(baDomain, baModule, baBatch);
	}

}
