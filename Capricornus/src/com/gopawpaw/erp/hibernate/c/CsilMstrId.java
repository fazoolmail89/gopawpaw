package com.gopawpaw.erp.hibernate.c;

/**
 * CsilMstrId entity. @author MyEclipse Persistence Tools
 */
public class CsilMstrId extends AbstractCsilMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsilMstrId() {
	}

	/** minimal constructor */
	public CsilMstrId(String csilDomain) {
		super(csilDomain);
	}

	/** full constructor */
	public CsilMstrId(String csilDomain, String csilCtryCode, String csilAuth,
			String csilLicen) {
		super(csilDomain, csilCtryCode, csilAuth, csilLicen);
	}

}
