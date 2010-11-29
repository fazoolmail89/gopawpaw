package com.gopawpaw.erp.hibernate.p;

/**
 * PouldDetId entity. @author MyEclipse Persistence Tools
 */
public class PouldDetId extends AbstractPouldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PouldDetId() {
	}

	/** full constructor */
	public PouldDetId(String pouldDomain, Integer pouldPoulRefKey,
			String pouldLoc) {
		super(pouldDomain, pouldPoulRefKey, pouldLoc);
	}

}
