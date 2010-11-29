package com.gopawpaw.erp.hibernate.f;

/**
 * FaclCalId entity. @author MyEclipse Persistence Tools
 */
public class FaclCalId extends AbstractFaclCalId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaclCalId() {
	}

	/** full constructor */
	public FaclCalId(String faclDomain, String faclId, Integer faclYear) {
		super(faclDomain, faclId, faclYear);
	}

}
