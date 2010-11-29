package com.gopawpaw.erp.hibernate.i;

/**
 * IehHistId entity. @author MyEclipse Persistence Tools
 */
public class IehHistId extends AbstractIehHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IehHistId() {
	}

	/** minimal constructor */
	public IehHistId(String iehDomain) {
		super(iehDomain);
	}

	/** full constructor */
	public IehHistId(String iehDomain, Integer iehTransId) {
		super(iehDomain, iehTransId);
	}

}
