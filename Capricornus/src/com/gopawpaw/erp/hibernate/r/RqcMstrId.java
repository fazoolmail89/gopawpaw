package com.gopawpaw.erp.hibernate.r;

/**
 * RqcMstrId entity. @author MyEclipse Persistence Tools
 */
public class RqcMstrId extends AbstractRqcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqcMstrId() {
	}

	/** minimal constructor */
	public RqcMstrId(String rqcDomain) {
		super(rqcDomain);
	}

	/** full constructor */
	public RqcMstrId(String rqcDomain, String rqcCategory) {
		super(rqcDomain, rqcCategory);
	}

}
