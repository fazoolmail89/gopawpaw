package com.gopawpaw.erp.hibernate.i;

/**
 * ItsMstrId entity. @author MyEclipse Persistence Tools
 */
public class ItsMstrId extends AbstractItsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItsMstrId() {
	}

	/** minimal constructor */
	public ItsMstrId(String itsDomain) {
		super(itsDomain);
	}

	/** full constructor */
	public ItsMstrId(String itsDomain, String itsPart, String itsSite) {
		super(itsDomain, itsPart, itsSite);
	}

}
