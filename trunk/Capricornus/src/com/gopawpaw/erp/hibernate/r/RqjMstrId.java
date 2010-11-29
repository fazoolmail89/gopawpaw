package com.gopawpaw.erp.hibernate.r;

/**
 * RqjMstrId entity. @author MyEclipse Persistence Tools
 */
public class RqjMstrId extends AbstractRqjMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqjMstrId() {
	}

	/** minimal constructor */
	public RqjMstrId(String rqjDomain) {
		super(rqjDomain);
	}

	/** full constructor */
	public RqjMstrId(String rqjDomain, String rqjJob) {
		super(rqjDomain, rqjJob);
	}

}
