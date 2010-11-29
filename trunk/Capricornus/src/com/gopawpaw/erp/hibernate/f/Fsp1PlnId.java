package com.gopawpaw.erp.hibernate.f;

/**
 * Fsp1PlnId entity. @author MyEclipse Persistence Tools
 */
public class Fsp1PlnId extends AbstractFsp1PlnId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp1PlnId() {
	}

	/** minimal constructor */
	public Fsp1PlnId(String fsp1Domain) {
		super(fsp1Domain);
	}

	/** full constructor */
	public Fsp1PlnId(String fsp1Domain, String fsp1PlanId, String fsp1Site,
			String fsp1Part, Integer fsp1Year) {
		super(fsp1Domain, fsp1PlanId, fsp1Site, fsp1Part, fsp1Year);
	}

}
