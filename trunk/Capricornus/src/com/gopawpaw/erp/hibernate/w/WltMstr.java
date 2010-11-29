package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WltMstr entity. @author MyEclipse Persistence Tools
 */
public class WltMstr extends AbstractWltMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WltMstr() {
	}

	/** minimal constructor */
	public WltMstr(WltMstrId id, Double oidWltMstr) {
		super(id, oidWltMstr);
	}

	/** full constructor */
	public WltMstr(WltMstrId id, Double wltQty, Date wltCrDate,
			Integer wltCrTime, Date wltModDate, Integer wltModTime,
			String wltModUserid, String wltQadc01, String wltQadc02,
			String wltQadc03, String wltQadc04, Double wltQadd01,
			Double wltQadd02, Integer wltQadi01, Integer wltQadi02,
			Boolean wltQadl01, Boolean wltQadl02, Date wltQadt01,
			Date wltQadt02, String wltChr01, String wltChr02, String wltChr03,
			String wltChr04, Double wltDec01, Double wltDec02,
			Integer wltInt01, Integer wltInt02, Boolean wltLog01,
			Boolean wltLog02, Date wltDte01, Date wltDte02, String wltUser1,
			String wltUser2, Double oidWltMstr) {
		super(id, wltQty, wltCrDate, wltCrTime, wltModDate, wltModTime,
				wltModUserid, wltQadc01, wltQadc02, wltQadc03, wltQadc04,
				wltQadd01, wltQadd02, wltQadi01, wltQadi02, wltQadl01,
				wltQadl02, wltQadt01, wltQadt02, wltChr01, wltChr02, wltChr03,
				wltChr04, wltDec01, wltDec02, wltInt01, wltInt02, wltLog01,
				wltLog02, wltDte01, wltDte02, wltUser1, wltUser2, oidWltMstr);
	}

}
