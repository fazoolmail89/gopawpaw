package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CkMstr entity. @author MyEclipse Persistence Tools
 */
public class CkMstr extends AbstractCkMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CkMstr() {
	}

	/** minimal constructor */
	public CkMstr(CkMstrId id, Double ckExRate2, String ckExRatetype,
			Integer ckExruSeq, Double oidCkMstr) {
		super(id, ckExRate2, ckExRatetype, ckExruSeq, oidCkMstr);
	}

	/** full constructor */
	public CkMstr(CkMstrId id, String ckStatus, Integer ckNbr, String ckBank,
			String ckType, Integer ckCmtindx, String ckCurr, Double ckExRate,
			Date ckVoiddate, Date ckVoideff, String ckUser1, String ckUser2,
			Date ckClrDate, String ckQadc01, Double ckExRate2,
			String ckExRatetype, Integer ckExruSeq, Double oidCkMstr) {
		super(id, ckStatus, ckNbr, ckBank, ckType, ckCmtindx, ckCurr, ckExRate,
				ckVoiddate, ckVoideff, ckUser1, ckUser2, ckClrDate, ckQadc01,
				ckExRate2, ckExRatetype, ckExruSeq, oidCkMstr);
	}

}
