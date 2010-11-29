package com.gopawpaw.erp.hibernate.f;

/**
 * FlpPlanId entity. @author MyEclipse Persistence Tools
 */
public class FlpPlanId extends AbstractFlpPlanId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlpPlanId() {
	}

	/** minimal constructor */
	public FlpPlanId(String flpDomain) {
		super(flpDomain);
	}

	/** full constructor */
	public FlpPlanId(String flpDomain, String flpPart, String flpSite,
			String flpLine, Integer flpYear) {
		super(flpDomain, flpPart, flpSite, flpLine, flpYear);
	}

}
