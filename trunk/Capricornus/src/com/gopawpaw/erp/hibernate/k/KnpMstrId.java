package com.gopawpaw.erp.hibernate.k;

/**
 * KnpMstrId entity. @author MyEclipse Persistence Tools
 */
public class KnpMstrId extends AbstractKnpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnpMstrId() {
	}

	/** full constructor */
	public KnpMstrId(String knpDomain, String knpSite, String knpProcessId) {
		super(knpDomain, knpSite, knpProcessId);
	}

}
