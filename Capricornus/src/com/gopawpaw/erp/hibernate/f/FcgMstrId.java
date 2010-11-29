package com.gopawpaw.erp.hibernate.f;

/**
 * FcgMstrId entity. @author MyEclipse Persistence Tools
 */
public class FcgMstrId extends AbstractFcgMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcgMstrId() {
	}

	/** minimal constructor */
	public FcgMstrId(String fcgDomain) {
		super(fcgDomain);
	}

	/** full constructor */
	public FcgMstrId(String fcgDomain, String fcgCode) {
		super(fcgDomain, fcgCode);
	}

}
