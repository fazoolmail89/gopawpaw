package com.gopawpaw.erp.hibernate.c;

/**
 * CsaMstrId entity. @author MyEclipse Persistence Tools
 */
public class CsaMstrId extends AbstractCsaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsaMstrId() {
	}

	/** minimal constructor */
	public CsaMstrId(String csaDomain) {
		super(csaDomain);
	}

	/** full constructor */
	public CsaMstrId(String csaDomain, String csaAuth) {
		super(csaDomain, csaAuth);
	}

}
