package com.gopawpaw.erp.hibernate.d;

/**
 * DeltMstrId entity. @author MyEclipse Persistence Tools
 */
public class DeltMstrId extends AbstractDeltMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DeltMstrId() {
	}

	/** full constructor */
	public DeltMstrId(String deltDomain, String deltUseCategory,
			String deltSite, String deltCtry, String deltState,
			String deltCity, String deltMethod) {
		super(deltDomain, deltUseCategory, deltSite, deltCtry, deltState,
				deltCity, deltMethod);
	}

}
