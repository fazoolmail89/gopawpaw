package com.gopawpaw.erp.hibernate.f;

/**
 * Fsp3PlnId entity. @author MyEclipse Persistence Tools
 */
public class Fsp3PlnId extends AbstractFsp3PlnId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp3PlnId() {
	}

	/** minimal constructor */
	public Fsp3PlnId(String fsp3Domain) {
		super(fsp3Domain);
	}

	/** full constructor */
	public Fsp3PlnId(String fsp3Domain, String fsp3PlanId, String fsp3Site,
			String fsp3Part, Integer fsp3Year) {
		super(fsp3Domain, fsp3PlanId, fsp3Site, fsp3Part, fsp3Year);
	}

}
