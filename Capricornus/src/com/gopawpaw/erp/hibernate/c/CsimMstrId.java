package com.gopawpaw.erp.hibernate.c;

/**
 * CsimMstrId entity. @author MyEclipse Persistence Tools
 */
public class CsimMstrId extends AbstractCsimMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsimMstrId() {
	}

	/** minimal constructor */
	public CsimMstrId(String csimDomain) {
		super(csimDomain);
	}

	/** full constructor */
	public CsimMstrId(String csimDomain, String csimCtryCode, String csimAuth,
			String csimCtrl) {
		super(csimDomain, csimCtryCode, csimAuth, csimCtrl);
	}

}
