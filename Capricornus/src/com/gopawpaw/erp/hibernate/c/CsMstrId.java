package com.gopawpaw.erp.hibernate.c;

/**
 * CsMstrId entity. @author MyEclipse Persistence Tools
 */
public class CsMstrId extends AbstractCsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsMstrId() {
	}

	/** minimal constructor */
	public CsMstrId(String csDomain) {
		super(csDomain);
	}

	/** full constructor */
	public CsMstrId(String csDomain, String csSet) {
		super(csDomain, csSet);
	}

}
