package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqMstrId entity. @author MyEclipse Persistence Tools
 */
public class RqMstrId extends AbstractRqMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqMstrId() {
	}

	/** minimal constructor */
	public RqMstrId(String rqDomain, String rqPart, String rqRsc) {
		super(rqDomain, rqPart, rqRsc);
	}

	/** full constructor */
	public RqMstrId(String rqDomain, String rqPart, String rqSite,
			String rqRsc, String rqRef, Date rqStart) {
		super(rqDomain, rqPart, rqSite, rqRsc, rqRef, rqStart);
	}

}
