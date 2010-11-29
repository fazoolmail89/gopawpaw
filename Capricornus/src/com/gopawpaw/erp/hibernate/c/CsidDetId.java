package com.gopawpaw.erp.hibernate.c;

/**
 * CsidDetId entity. @author MyEclipse Persistence Tools
 */
public class CsidDetId extends AbstractCsidDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsidDetId() {
	}

	/** minimal constructor */
	public CsidDetId(String csidDomain) {
		super(csidDomain);
	}

	/** full constructor */
	public CsidDetId(String csidDomain, String csidCtryCode, String csidAuth,
			String csidCtrl, String csidPart) {
		super(csidDomain, csidCtryCode, csidAuth, csidCtrl, csidPart);
	}

}
