package com.gopawpaw.erp.hibernate.k;

/**
 * KnbcdDetId entity. @author MyEclipse Persistence Tools
 */
public class KnbcdDetId extends AbstractKnbcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbcdDetId() {
	}

	/** full constructor */
	public KnbcdDetId(String knbcdDomain, String knbcdDispatchId,
			Integer knbcdKnbdId) {
		super(knbcdDomain, knbcdDispatchId, knbcdKnbdId);
	}

}
