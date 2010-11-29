package com.gopawpaw.erp.hibernate.c;

/**
 * CmhHistId entity. @author MyEclipse Persistence Tools
 */
public class CmhHistId extends AbstractCmhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmhHistId() {
	}

	/** minimal constructor */
	public CmhHistId(String cmhDomain) {
		super(cmhDomain);
	}

	/** full constructor */
	public CmhHistId(String cmhDomain, Integer cmhYear, String cmhCust) {
		super(cmhDomain, cmhYear, cmhCust);
	}

}
