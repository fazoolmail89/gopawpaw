package com.gopawpaw.erp.hibernate.k;

/**
 * KnbddMstrId entity. @author MyEclipse Persistence Tools
 */
public class KnbddMstrId extends AbstractKnbddMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbddMstrId() {
	}

	/** full constructor */
	public KnbddMstrId(String knbddDomain, String knbddDocumentType,
			String knbddDocumentName) {
		super(knbddDomain, knbddDocumentType, knbddDocumentName);
	}

}
