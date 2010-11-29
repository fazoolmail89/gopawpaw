package com.gopawpaw.erp.hibernate.f;

/**
 * FcsSumId entity. @author MyEclipse Persistence Tools
 */
public class FcsSumId extends AbstractFcsSumId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcsSumId() {
	}

	/** minimal constructor */
	public FcsSumId(String fcsDomain, String fcsPart, Integer fcsYear) {
		super(fcsDomain, fcsPart, fcsYear);
	}

	/** full constructor */
	public FcsSumId(String fcsDomain, String fcsPart, String fcsSite,
			Integer fcsYear) {
		super(fcsDomain, fcsPart, fcsSite, fcsYear);
	}

}
