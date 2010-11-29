package com.gopawpaw.erp.hibernate.r;

/**
 * RbmMstrId entity. @author MyEclipse Persistence Tools
 */
public class RbmMstrId extends AbstractRbmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RbmMstrId() {
	}

	/** minimal constructor */
	public RbmMstrId(String rbmDomain) {
		super(rbmDomain);
	}

	/** full constructor */
	public RbmMstrId(String rbmDomain, String rbmCust, String rbmAuth) {
		super(rbmDomain, rbmCust, rbmAuth);
	}

}
