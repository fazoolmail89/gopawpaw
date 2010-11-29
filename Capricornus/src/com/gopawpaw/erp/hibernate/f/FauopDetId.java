package com.gopawpaw.erp.hibernate.f;

/**
 * FauopDetId entity. @author MyEclipse Persistence Tools
 */
public class FauopDetId extends AbstractFauopDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FauopDetId() {
	}

	/** full constructor */
	public FauopDetId(String fauopDomain, String fauopFaId, String fauopFabkId,
			String fauopYrper) {
		super(fauopDomain, fauopFaId, fauopFabkId, fauopYrper);
	}

}
