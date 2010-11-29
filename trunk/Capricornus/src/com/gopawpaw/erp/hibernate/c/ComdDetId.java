package com.gopawpaw.erp.hibernate.c;

/**
 * ComdDetId entity. @author MyEclipse Persistence Tools
 */
public class ComdDetId extends AbstractComdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ComdDetId() {
	}

	/** full constructor */
	public ComdDetId(String comdDomain, String comdCommCode, String comdPart) {
		super(comdDomain, comdCommCode, comdPart);
	}

}
