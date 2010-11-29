package com.gopawpaw.erp.hibernate.f;

/**
 * FslpPlnId entity. @author MyEclipse Persistence Tools
 */
public class FslpPlnId extends AbstractFslpPlnId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FslpPlnId() {
	}

	/** minimal constructor */
	public FslpPlnId(String fslpDomain) {
		super(fslpDomain);
	}

	/** full constructor */
	public FslpPlnId(String fslpDomain, String fslpPlanId, String fslpPart,
			String fslpSite, String fslpLine, Integer fslpYear) {
		super(fslpDomain, fslpPlanId, fslpPart, fslpSite, fslpLine, fslpYear);
	}

}
