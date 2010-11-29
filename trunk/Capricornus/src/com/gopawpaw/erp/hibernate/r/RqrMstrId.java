package com.gopawpaw.erp.hibernate.r;

/**
 * RqrMstrId entity. @author MyEclipse Persistence Tools
 */
public class RqrMstrId extends AbstractRqrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqrMstrId() {
	}

	/** minimal constructor */
	public RqrMstrId(String rqrDomain) {
		super(rqrDomain);
	}

	/** full constructor */
	public RqrMstrId(String rqrDomain, String rqrUserid, String rqrRole) {
		super(rqrDomain, rqrUserid, rqrRole);
	}

}
