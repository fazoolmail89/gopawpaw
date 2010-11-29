package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlhMstr entity. @author MyEclipse Persistence Tools
 */
public class FlhMstr extends AbstractFlhMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlhMstr() {
	}

	/** minimal constructor */
	public FlhMstr(FlhMstrId id, String flhModUserid, Double oidFlhMstr) {
		super(id, flhModUserid, oidFlhMstr);
	}

	/** full constructor */
	public FlhMstr(FlhMstrId id, String flhDesc, String flhExec, Integer flhX,
			Integer flhY, Integer flhDown, String flhUser1, String flhUser2,
			String flhQadc01, String flhModUserid, Date flhModDate,
			Double oidFlhMstr) {
		super(id, flhDesc, flhExec, flhX, flhY, flhDown, flhUser1, flhUser2,
				flhQadc01, flhModUserid, flhModDate, oidFlhMstr);
	}

}
