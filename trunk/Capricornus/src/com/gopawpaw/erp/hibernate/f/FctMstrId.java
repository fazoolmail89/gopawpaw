package com.gopawpaw.erp.hibernate.f;

/**
 * FctMstrId entity. @author MyEclipse Persistence Tools
 */
public class FctMstrId extends AbstractFctMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FctMstrId() {
	}

	/** minimal constructor */
	public FctMstrId(String fctDomain) {
		super(fctDomain);
	}

	/** full constructor */
	public FctMstrId(String fctDomain, String fctType) {
		super(fctDomain, fctType);
	}

}
