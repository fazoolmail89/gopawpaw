package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PexMstr entity. @author MyEclipse Persistence Tools
 */
public class PexMstr extends AbstractPexMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PexMstr() {
	}

	/** minimal constructor */
	public PexMstr(PexMstrId id, String pexModUserid, Integer pexAudDays,
			String pexAudUser, String pexAudPswd, Integer pexAudNbr,
			Double oidPexMstr) {
		super(id, pexModUserid, pexAudDays, pexAudUser, pexAudPswd, pexAudNbr,
				oidPexMstr);
	}

	/** full constructor */
	public PexMstr(PexMstrId id, String pexDesc, Integer pexHwm,
			String pexUser1, String pexUser2, String pexQadc01,
			Integer pexQadi01, Double pexQadd01, Boolean pexQadl01,
			Date pexQadt01, String pexModUserid, Date pexModDate,
			Integer pexAudDays, Date pexAudDdate, Date pexAudDate,
			String pexAudUser, String pexAudPswd, Integer pexAudNbr,
			Double oidPexMstr) {
		super(id, pexDesc, pexHwm, pexUser1, pexUser2, pexQadc01, pexQadi01,
				pexQadd01, pexQadl01, pexQadt01, pexModUserid, pexModDate,
				pexAudDays, pexAudDdate, pexAudDate, pexAudUser, pexAudPswd,
				pexAudNbr, oidPexMstr);
	}

}
