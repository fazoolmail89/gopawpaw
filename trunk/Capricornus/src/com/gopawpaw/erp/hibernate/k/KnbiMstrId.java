package com.gopawpaw.erp.hibernate.k;

/**
 * KnbiMstrId entity. @author MyEclipse Persistence Tools
 */
public class KnbiMstrId extends AbstractKnbiMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbiMstrId() {
	}

	/** full constructor */
	public KnbiMstrId(String knbiDomain, String knbiPart, Integer knbiStep) {
		super(knbiDomain, knbiPart, knbiStep);
	}

}
