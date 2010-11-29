package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AcodMstr entity. @author MyEclipse Persistence Tools
 */
public class AcodMstr extends AbstractAcodMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcodMstr() {
	}

	/** minimal constructor */
	public AcodMstr(AcodMstrId id, Double oidAcodMstr) {
		super(id, oidAcodMstr);
	}

	/** full constructor */
	public AcodMstr(AcodMstrId id, String acodTargVal, String acodDesc,
			String acodModUserid, Date acodModDate, String acodUser1,
			String acodUser2, Double acodDec01, Double acodDec02,
			Integer acodInt01, Integer acodInt02, Boolean acodLog01,
			Boolean acodLog02, Date acodDte01, Date acodDte02,
			String acodQadc01, String acodQadc02, String acodQadc03,
			String acodQadc04, Double acodQadd01, Double acodQadd02,
			Integer acodQadi01, Integer acodQadi02, Boolean acodQadl01,
			Boolean acodQadl02, Date acodQadt01, Date acodQadt02,
			Double oidAcodMstr) {
		super(id, acodTargVal, acodDesc, acodModUserid, acodModDate, acodUser1,
				acodUser2, acodDec01, acodDec02, acodInt01, acodInt02,
				acodLog01, acodLog02, acodDte01, acodDte02, acodQadc01,
				acodQadc02, acodQadc03, acodQadc04, acodQadd01, acodQadd02,
				acodQadi01, acodQadi02, acodQadl01, acodQadl02, acodQadt01,
				acodQadt02, oidAcodMstr);
	}

}
