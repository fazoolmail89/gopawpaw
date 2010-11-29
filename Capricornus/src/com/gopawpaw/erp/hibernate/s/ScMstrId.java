package com.gopawpaw.erp.hibernate.s;

/**
 * ScMstrId entity. @author MyEclipse Persistence Tools
 */
public class ScMstrId extends AbstractScMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScMstrId() {
	}

	/** minimal constructor */
	public ScMstrId(String scDomain) {
		super(scDomain);
	}

	/** full constructor */
	public ScMstrId(String scDomain, String scSim, String scElement) {
		super(scDomain, scSim, scElement);
	}

}
