package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SytfMstr entity. @author MyEclipse Persistence Tools
 */
public class SytfMstr extends AbstractSytfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SytfMstr() {
	}

	/** minimal constructor */
	public SytfMstr(SytfMstrId id, Double oidSytfMstr) {
		super(id, oidSytfMstr);
	}

	/** full constructor */
	public SytfMstr(SytfMstrId id, Boolean sytfReqdAdd, Boolean sytfReqdChgdel,
			String sytfModUserid, Date sytfModDate, String sytfUser1,
			String sytfUser2, String sytfChr01, String sytfChr02,
			Double sytfDec01, Double sytfDec02, Integer sytfInt01,
			Integer sytfInt02, Boolean sytfLog01, Boolean sytfLog02,
			Date sytfDte01, Date sytfDte02, String sytfQadc01,
			String sytfQadc02, String sytfQadc03, String sytfQadc04,
			Double sytfQadd01, Double sytfQadd02, Integer sytfQadi01,
			Integer sytfQadi02, Boolean sytfQadl01, Boolean sytfQadl02,
			Date sytfQadt01, Date sytfQadt02, Double oidSytfMstr) {
		super(id, sytfReqdAdd, sytfReqdChgdel, sytfModUserid, sytfModDate,
				sytfUser1, sytfUser2, sytfChr01, sytfChr02, sytfDec01,
				sytfDec02, sytfInt01, sytfInt02, sytfLog01, sytfLog02,
				sytfDte01, sytfDte02, sytfQadc01, sytfQadc02, sytfQadc03,
				sytfQadc04, sytfQadd01, sytfQadd02, sytfQadi01, sytfQadi02,
				sytfQadl01, sytfQadl02, sytfQadt01, sytfQadt02, oidSytfMstr);
	}

}
