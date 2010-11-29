package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SrrMstr entity. @author MyEclipse Persistence Tools
 */
public class SrrMstr extends AbstractSrrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrrMstr() {
	}

	/** minimal constructor */
	public SrrMstr(SrrMstrId id, Double oidSrrMstr) {
		super(id, oidSrrMstr);
	}

	/** full constructor */
	public SrrMstr(SrrMstrId id, Integer srrProbidx, Integer srrResidx,
			String srrDesc, Date srrDate, String srrUpdate, String srrProblem,
			String srrType, String srrStarted, String srrChr01,
			String srrChr02, String srrChr03, String srrChr04, String srrChr05,
			String srrChr06, String srrChr07, String srrChr08, String srrChr09,
			String srrChr10, Date srrDte01, Date srrDte02, Double srrDec01,
			Double srrDec02, Boolean srrLog01, String srrAssign,
			String srrStatus, String srrCaNbr, String srrSeverity,
			String srrPart, String srrEuNbr, Integer srrPri, Date srrClsDate,
			Double srrActHrs, Double srrEstHrs, String srrQue, Date srrTdate,
			String srrTfix, String srrUser1, String srrUser2, String srrEco,
			String srrNote, String srrPhone, String srrRequestor,
			String srrResolution, Double oidSrrMstr) {
		super(id, srrProbidx, srrResidx, srrDesc, srrDate, srrUpdate,
				srrProblem, srrType, srrStarted, srrChr01, srrChr02, srrChr03,
				srrChr04, srrChr05, srrChr06, srrChr07, srrChr08, srrChr09,
				srrChr10, srrDte01, srrDte02, srrDec01, srrDec02, srrLog01,
				srrAssign, srrStatus, srrCaNbr, srrSeverity, srrPart, srrEuNbr,
				srrPri, srrClsDate, srrActHrs, srrEstHrs, srrQue, srrTdate,
				srrTfix, srrUser1, srrUser2, srrEco, srrNote, srrPhone,
				srrRequestor, srrResolution, oidSrrMstr);
	}

}
