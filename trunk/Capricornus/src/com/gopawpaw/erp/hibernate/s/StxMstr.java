package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * StxMstr entity. @author MyEclipse Persistence Tools
 */
public class StxMstr extends AbstractStxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public StxMstr() {
	}

	/** full constructor */
	public StxMstr(StxMstrId id, Boolean stxPaid, Boolean stxUseSt,
			String stxModUserid, Date stxModDate, String stxUser1,
			String stxUser2, String stxQadc01, String stxQadc02,
			Double oidStxMstr) {
		super(id, stxPaid, stxUseSt, stxModUserid, stxModDate, stxUser1,
				stxUser2, stxQadc01, stxQadc02, oidStxMstr);
	}

}
