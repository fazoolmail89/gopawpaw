package com.gopawpaw.erp.hibernate.k;

/**
 * KnbdDetId entity. @author MyEclipse Persistence Tools
 */
public class KnbdDetId extends AbstractKnbdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbdDetId() {
	}

	/** full constructor */
	public KnbdDetId(String knbdDomain, Integer knbdId) {
		super(knbdDomain, knbdId);
	}

}
