package com.gopawpaw.erp.hibernate.r;

/**
 * RsMstrId entity. @author MyEclipse Persistence Tools
 */
public class RsMstrId extends AbstractRsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsMstrId() {
	}

	/** minimal constructor */
	public RsMstrId(String rsDomain, String rsRsc) {
		super(rsDomain, rsRsc);
	}

	/** full constructor */
	public RsMstrId(String rsDomain, String rsRsc, String rsSite) {
		super(rsDomain, rsRsc, rsSite);
	}

}
