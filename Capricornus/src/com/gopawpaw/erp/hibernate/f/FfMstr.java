package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FfMstr entity. @author MyEclipse Persistence Tools
 */
public class FfMstr extends AbstractFfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FfMstr() {
	}

	/** minimal constructor */
	public FfMstr(FfMstrId id, Double oidFfMstr) {
		super(id, oidFfMstr);
	}

	/** full constructor */
	public FfMstr(FfMstrId id, Date ffDate, Integer ffTime, String ffHisYr,
			String ffOrigFc, String ffAdjFc, String ffUser1, String ffUser2,
			String ffQadc01, Double oidFfMstr) {
		super(id, ffDate, ffTime, ffHisYr, ffOrigFc, ffAdjFc, ffUser1, ffUser2,
				ffQadc01, oidFfMstr);
	}

}
