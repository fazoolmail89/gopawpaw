package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqMstr entity. @author MyEclipse Persistence Tools
 */
public class RqMstr extends AbstractRqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqMstr() {
	}

	/** minimal constructor */
	public RqMstr(RqMstrId id, Double oidRqMstr) {
		super(id, oidRqMstr);
	}

	/** full constructor */
	public RqMstr(RqMstrId id, Double rqQtyPer, Integer rqLead,
			Integer rqLtOff, Date rqEnd, String rqUser1, String rqUser2,
			String rqChr01, String rqChr02, String rqChr03, String rqChr04,
			String rqChr05, Date rqDte01, Date rqDte02, Double rqDec01,
			Double rqDec02, Boolean rqLog01, Double oidRqMstr) {
		super(id, rqQtyPer, rqLead, rqLtOff, rqEnd, rqUser1, rqUser2, rqChr01,
				rqChr02, rqChr03, rqChr04, rqChr05, rqDte01, rqDte02, rqDec01,
				rqDec02, rqLog01, oidRqMstr);
	}

}
