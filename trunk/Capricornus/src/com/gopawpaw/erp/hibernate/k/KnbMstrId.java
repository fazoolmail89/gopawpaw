package com.gopawpaw.erp.hibernate.k;

/**
 * KnbMstrId entity. @author MyEclipse Persistence Tools
 */
public class KnbMstrId extends AbstractKnbMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbMstrId() {
	}

	/** full constructor */
	public KnbMstrId(String knbDomain, Double knbKeyid) {
		super(knbDomain, knbKeyid);
	}

}
