package com.gopawpaw.erp.hibernate.c;

/**
 * CsldDetId entity. @author MyEclipse Persistence Tools
 */
public class CsldDetId extends AbstractCsldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsldDetId() {
	}

	/** minimal constructor */
	public CsldDetId(String csldDomain) {
		super(csldDomain);
	}

	/** full constructor */
	public CsldDetId(String csldDomain, String csldCtryCode, String csldAuth,
			String csldLicen, String csldPart) {
		super(csldDomain, csldCtryCode, csldAuth, csldLicen, csldPart);
	}

}
