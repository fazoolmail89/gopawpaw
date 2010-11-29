package com.gopawpaw.erp.hibernate.s;

/**
 * SadhHistId entity. @author MyEclipse Persistence Tools
 */
public class SadhHistId extends AbstractSadhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SadhHistId() {
	}

	/** minimal constructor */
	public SadhHistId(String sadhDomain) {
		super(sadhDomain);
	}

	/** full constructor */
	public SadhHistId(String sadhDomain, Integer sadhTrnbr) {
		super(sadhDomain, sadhTrnbr);
	}

}
