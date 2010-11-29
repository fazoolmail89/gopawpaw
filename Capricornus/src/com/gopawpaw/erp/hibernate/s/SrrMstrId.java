package com.gopawpaw.erp.hibernate.s;

/**
 * SrrMstrId entity. @author MyEclipse Persistence Tools
 */
public class SrrMstrId extends AbstractSrrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrrMstrId() {
	}

	/** minimal constructor */
	public SrrMstrId(String srrDomain) {
		super(srrDomain);
	}

	/** full constructor */
	public SrrMstrId(String srrDomain, String srrNbr) {
		super(srrDomain, srrNbr);
	}

}
