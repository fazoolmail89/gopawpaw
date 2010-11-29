package com.gopawpaw.erp.hibernate.e;

/**
 * EngMstrId entity. @author MyEclipse Persistence Tools
 */
public class EngMstrId extends AbstractEngMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EngMstrId() {
	}

	/** minimal constructor */
	public EngMstrId(String engDomain) {
		super(engDomain);
	}

	/** full constructor */
	public EngMstrId(String engDomain, String engAddr) {
		super(engDomain, engAddr);
	}

}
