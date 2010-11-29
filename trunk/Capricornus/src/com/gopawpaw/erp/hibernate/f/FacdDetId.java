package com.gopawpaw.erp.hibernate.f;

/**
 * FacdDetId entity. @author MyEclipse Persistence Tools
 */
public class FacdDetId extends AbstractFacdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacdDetId() {
	}

	/** full constructor */
	public FacdDetId(String facdDomain, String facdFaclsId, String facdAcctype) {
		super(facdDomain, facdFaclsId, facdAcctype);
	}

}
