package com.gopawpaw.erp.hibernate.s;

/**
 * SphHistId entity. @author MyEclipse Persistence Tools
 */
public class SphHistId extends AbstractSphHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SphHistId() {
	}

	/** minimal constructor */
	public SphHistId(String sphDomain) {
		super(sphDomain);
	}

	/** full constructor */
	public SphHistId(String sphDomain, Integer sphYear, String sphSlspsn1) {
		super(sphDomain, sphYear, sphSlspsn1);
	}

}
