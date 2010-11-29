package com.gopawpaw.erp.hibernate.a;

/**
 * ArMstrId entity. @author MyEclipse Persistence Tools
 */
public class ArMstrId extends AbstractArMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArMstrId() {
	}

	/** minimal constructor */
	public ArMstrId(String arDomain) {
		super(arDomain);
	}

	/** full constructor */
	public ArMstrId(String arDomain, String arNbr) {
		super(arDomain, arNbr);
	}

}
