package com.gopawpaw.erp.hibernate.k;

/**
 * KnbfdDetId entity. @author MyEclipse Persistence Tools
 */
public class KnbfdDetId extends AbstractKnbfdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbfdDetId() {
	}

	/** full constructor */
	public KnbfdDetId(String knbfdDomain, Double knbfdKeyid) {
		super(knbfdDomain, knbfdKeyid);
	}

}
