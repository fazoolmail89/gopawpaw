package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FalocMstr entity. @author MyEclipse Persistence Tools
 */
public class FalocMstr extends AbstractFalocMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FalocMstr() {
	}

	/** minimal constructor */
	public FalocMstr(FalocMstrId id, String falocDesc, String falocCc,
			String falocSub, String falocEntity, String falocModUserid,
			Date falocModDate, String falocUser1, String falocUser2,
			String falocChr01, Double falocDec01, Boolean falocLog01,
			Integer falocInt01, String falocQadc01, Double falocQadd01,
			Integer falocQadi01, Boolean falocQadl01, String falocQadc02,
			Double oidFalocMstr) {
		super(id, falocDesc, falocCc, falocSub, falocEntity, falocModUserid,
				falocModDate, falocUser1, falocUser2, falocChr01, falocDec01,
				falocLog01, falocInt01, falocQadc01, falocQadd01, falocQadi01,
				falocQadl01, falocQadc02, oidFalocMstr);
	}

	/** full constructor */
	public FalocMstr(FalocMstrId id, String falocDesc, String falocCc,
			String falocSub, String falocEntity, String falocModUserid,
			Date falocModDate, String falocUser1, String falocUser2,
			String falocChr01, Double falocDec01, Boolean falocLog01,
			Date falocDte01, Integer falocInt01, String falocQadc01,
			Double falocQadd01, Integer falocQadi01, Date falocQadt01,
			Boolean falocQadl01, String falocQadc02, Double oidFalocMstr) {
		super(id, falocDesc, falocCc, falocSub, falocEntity, falocModUserid,
				falocModDate, falocUser1, falocUser2, falocChr01, falocDec01,
				falocLog01, falocDte01, falocInt01, falocQadc01, falocQadd01,
				falocQadi01, falocQadt01, falocQadl01, falocQadc02,
				oidFalocMstr);
	}

}
