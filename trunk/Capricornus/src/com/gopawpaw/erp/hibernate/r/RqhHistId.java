package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqhHistId entity. @author MyEclipse Persistence Tools
 */
public class RqhHistId extends AbstractRqhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqhHistId() {
	}

	/** minimal constructor */
	public RqhHistId(String rqhDomain) {
		super(rqhDomain);
	}

	/** full constructor */
	public RqhHistId(String rqhDomain, String rqhNbr, Date rqhDate,
			Integer rqhTime, Integer rqhSeqNbr) {
		super(rqhDomain, rqhNbr, rqhDate, rqhTime, rqhSeqNbr);
	}

}
