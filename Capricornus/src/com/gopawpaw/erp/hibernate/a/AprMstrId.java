package com.gopawpaw.erp.hibernate.a;

/**
 * AprMstrId entity. @author MyEclipse Persistence Tools
 */
public class AprMstrId extends AbstractAprMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AprMstrId() {
	}

	/** minimal constructor */
	public AprMstrId(String aprDomain) {
		super(aprDomain);
	}

	/** full constructor */
	public AprMstrId(String aprDomain, String aprAppId) {
		super(aprDomain, aprAppId);
	}

}
