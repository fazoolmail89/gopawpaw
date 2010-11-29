package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqjMstr entity. @author MyEclipse Persistence Tools
 */
public class RqjMstr extends AbstractRqjMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqjMstr() {
	}

	/** minimal constructor */
	public RqjMstr(RqjMstrId id, Double oidRqjMstr) {
		super(id, oidRqjMstr);
	}

	/** full constructor */
	public RqjMstr(RqjMstrId id, String rqjDesc, Date rqjStart, Date rqjEnd,
			String rqjChr01, String rqjChr02, String rqjChr03, String rqjChr04,
			String rqjQadc01, String rqjQadc02, String rqjQadc03,
			String rqjQadc04, Double oidRqjMstr) {
		super(id, rqjDesc, rqjStart, rqjEnd, rqjChr01, rqjChr02, rqjChr03,
				rqjChr04, rqjQadc01, rqjQadc02, rqjQadc03, rqjQadc04,
				oidRqjMstr);
	}

}
