package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlcrMstr entity. @author MyEclipse Persistence Tools
 */
public class FlcrMstr extends AbstractFlcrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlcrMstr() {
	}

	/** minimal constructor */
	public FlcrMstr(FlcrMstrId id, Double flcrRate, String flcrModUserid,
			Date flcrModDate, String flcrUser1, String flcrUser2,
			String flcrQadc01, String flcrQadc02, String flcrUserc03,
			Double flcrUserd01, Integer flcrUseri01, Boolean flcrUserl01,
			String flcrQadc03, Double flcrQadd01, Integer flcrQadi01,
			Boolean flcrQadl01, Double oidFlcrMstr) {
		super(id, flcrRate, flcrModUserid, flcrModDate, flcrUser1, flcrUser2,
				flcrQadc01, flcrQadc02, flcrUserc03, flcrUserd01, flcrUseri01,
				flcrUserl01, flcrQadc03, flcrQadd01, flcrQadi01, flcrQadl01,
				oidFlcrMstr);
	}

	/** full constructor */
	public FlcrMstr(FlcrMstrId id, Double flcrRate, String flcrModUserid,
			Date flcrModDate, String flcrUser1, String flcrUser2,
			String flcrQadc01, String flcrQadc02, String flcrUserc03,
			Double flcrUserd01, Integer flcrUseri01, Boolean flcrUserl01,
			Date flcrUsert01, String flcrQadc03, Double flcrQadd01,
			Integer flcrQadi01, Boolean flcrQadl01, Date flcrQadt01,
			Double oidFlcrMstr) {
		super(id, flcrRate, flcrModUserid, flcrModDate, flcrUser1, flcrUser2,
				flcrQadc01, flcrQadc02, flcrUserc03, flcrUserd01, flcrUseri01,
				flcrUserl01, flcrUsert01, flcrQadc03, flcrQadd01, flcrQadi01,
				flcrQadl01, flcrQadt01, oidFlcrMstr);
	}

}
