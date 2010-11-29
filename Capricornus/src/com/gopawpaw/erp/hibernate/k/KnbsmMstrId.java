package com.gopawpaw.erp.hibernate.k;

/**
 * KnbsmMstrId entity. @author MyEclipse Persistence Tools
 */
public class KnbsmMstrId extends AbstractKnbsmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbsmMstrId() {
	}

	/** full constructor */
	public KnbsmMstrId(String knbsmDomain, String knbsmSite,
			String knbsmSupermarketId) {
		super(knbsmDomain, knbsmSite, knbsmSupermarketId);
	}

}
