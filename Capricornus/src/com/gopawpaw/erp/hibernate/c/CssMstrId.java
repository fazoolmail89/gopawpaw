package com.gopawpaw.erp.hibernate.c;

/**
 * CssMstrId entity. @author MyEclipse Persistence Tools
 */
public class CssMstrId extends AbstractCssMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CssMstrId() {
	}

	/** minimal constructor */
	public CssMstrId(String cssDomain) {
		super(cssDomain);
	}

	/** full constructor */
	public CssMstrId(String cssDomain, String cssCtryCode, String cssAuth,
			String cssSite) {
		super(cssDomain, cssCtryCode, cssAuth, cssSite);
	}

}
