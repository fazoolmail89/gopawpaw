package com.gopawpaw.erp.hibernate.f;

/**
 * FscMstrId entity. @author MyEclipse Persistence Tools
 */
public class FscMstrId extends AbstractFscMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FscMstrId() {
	}

	/** minimal constructor */
	public FscMstrId(String fscDomain) {
		super(fscDomain);
	}

	/** full constructor */
	public FscMstrId(String fscDomain, String fscCode) {
		super(fscDomain, fscCode);
	}

}
