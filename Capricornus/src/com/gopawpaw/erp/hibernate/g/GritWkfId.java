package com.gopawpaw.erp.hibernate.g;

/**
 * GritWkfId entity. @author MyEclipse Persistence Tools
 */
public class GritWkfId extends AbstractGritWkfId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GritWkfId() {
	}

	/** minimal constructor */
	public GritWkfId(String gritDomain) {
		super(gritDomain);
	}

	/** full constructor */
	public GritWkfId(String gritDomain, String gritRunid, String gritGlCode) {
		super(gritDomain, gritRunid, gritGlCode);
	}

}
