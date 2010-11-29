package com.gopawpaw.erp.hibernate.c;

/**
 * CssiDetId entity. @author MyEclipse Persistence Tools
 */
public class CssiDetId extends AbstractCssiDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CssiDetId() {
	}

	/** minimal constructor */
	public CssiDetId(String cssiDomain) {
		super(cssiDomain);
	}

	/** full constructor */
	public CssiDetId(String cssiDomain, String cssiSite, String cssiSet,
			Boolean cssiActive) {
		super(cssiDomain, cssiSite, cssiSet, cssiActive);
	}

}
