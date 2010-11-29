package com.gopawpaw.erp.hibernate.f;

/**
 * Fsp2PlnId entity. @author MyEclipse Persistence Tools
 */
public class Fsp2PlnId extends AbstractFsp2PlnId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp2PlnId() {
	}

	/** minimal constructor */
	public Fsp2PlnId(String fsp2Domain) {
		super(fsp2Domain);
	}

	/** full constructor */
	public Fsp2PlnId(String fsp2Domain, String fsp2PlanId, String fsp2Site,
			String fsp2Part, Integer fsp2Year) {
		super(fsp2Domain, fsp2PlanId, fsp2Site, fsp2Part, fsp2Year);
	}

}
