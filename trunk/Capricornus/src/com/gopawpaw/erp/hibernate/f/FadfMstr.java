package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FadfMstr entity. @author MyEclipse Persistence Tools
 */
public class FadfMstr extends AbstractFadfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FadfMstr() {
	}

	/** minimal constructor */
	public FadfMstr(FadfMstrId id, String fadfFamtId, Double fadfFamtElife,
			String fadfModUserid, Date fadfModDate, String fadfUser1,
			String fadfUser2, String fadfChr01, Double fadfDec01,
			Boolean fadfLog01, Integer fadfInt01, String fadfQadc01,
			Double fadfQadd01, Boolean fadfQadl01, Integer fadfQadi01,
			Double oidFadfMstr) {
		super(id, fadfFamtId, fadfFamtElife, fadfModUserid, fadfModDate,
				fadfUser1, fadfUser2, fadfChr01, fadfDec01, fadfLog01,
				fadfInt01, fadfQadc01, fadfQadd01, fadfQadl01, fadfQadi01,
				oidFadfMstr);
	}

	/** full constructor */
	public FadfMstr(FadfMstrId id, String fadfFamtId, Double fadfFamtElife,
			String fadfModUserid, Date fadfModDate, String fadfUser1,
			String fadfUser2, String fadfChr01, Double fadfDec01,
			Boolean fadfLog01, Date fadfDte01, Integer fadfInt01,
			String fadfQadc01, Double fadfQadd01, Boolean fadfQadl01,
			Integer fadfQadi01, Date fadfQadt01, Double oidFadfMstr) {
		super(id, fadfFamtId, fadfFamtElife, fadfModUserid, fadfModDate,
				fadfUser1, fadfUser2, fadfChr01, fadfDec01, fadfLog01,
				fadfDte01, fadfInt01, fadfQadc01, fadfQadd01, fadfQadl01,
				fadfQadi01, fadfQadt01, oidFadfMstr);
	}

}
