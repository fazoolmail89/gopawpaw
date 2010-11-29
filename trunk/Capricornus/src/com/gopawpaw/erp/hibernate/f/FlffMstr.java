package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlffMstr entity. @author MyEclipse Persistence Tools
 */
public class FlffMstr extends AbstractFlffMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlffMstr() {
	}

	/** minimal constructor */
	public FlffMstr(FlffMstrId id, Double flffPct, Date flffModDate,
			String flffUser1, String flffUser2, String flffUserc03,
			Double flffUserd01, Integer flffUseri01, String flffModUserid,
			Boolean flffUserl01, String flffQadc01, String flffQadc02,
			String flffQadc03, Double flffQadd01, Integer flffQadi01,
			Boolean flffQadl01, Double oidFlffMstr) {
		super(id, flffPct, flffModDate, flffUser1, flffUser2, flffUserc03,
				flffUserd01, flffUseri01, flffModUserid, flffUserl01,
				flffQadc01, flffQadc02, flffQadc03, flffQadd01, flffQadi01,
				flffQadl01, oidFlffMstr);
	}

	/** full constructor */
	public FlffMstr(FlffMstrId id, Double flffPct, Date flffModDate,
			String flffUser1, String flffUser2, String flffUserc03,
			Double flffUserd01, Integer flffUseri01, String flffModUserid,
			Boolean flffUserl01, Date flffUsert01, String flffQadc01,
			String flffQadc02, String flffQadc03, Double flffQadd01,
			Integer flffQadi01, Boolean flffQadl01, Date flffQadt01,
			Double oidFlffMstr) {
		super(id, flffPct, flffModDate, flffUser1, flffUser2, flffUserc03,
				flffUserd01, flffUseri01, flffModUserid, flffUserl01,
				flffUsert01, flffQadc01, flffQadc02, flffQadc03, flffQadd01,
				flffQadi01, flffQadl01, flffQadt01, oidFlffMstr);
	}

}
