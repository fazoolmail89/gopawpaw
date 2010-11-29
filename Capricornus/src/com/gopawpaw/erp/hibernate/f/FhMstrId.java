package com.gopawpaw.erp.hibernate.f;

/**
 * FhMstrId entity. @author MyEclipse Persistence Tools
 */
public class FhMstrId extends AbstractFhMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FhMstrId() {
	}

	/** minimal constructor */
	public FhMstrId(String fhDomain) {
		super(fhDomain);
	}

	/** full constructor */
	public FhMstrId(String fhDomain, String fhParent, String fhComp,
			String fhSite, Integer fhYear) {
		super(fhDomain, fhParent, fhComp, fhSite, fhYear);
	}

}
