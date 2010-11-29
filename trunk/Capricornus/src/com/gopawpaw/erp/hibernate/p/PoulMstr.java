package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PoulMstr entity. @author MyEclipse Persistence Tools
 */
public class PoulMstr extends AbstractPoulMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PoulMstr() {
	}

	/** full constructor */
	public PoulMstr(PoulMstrId id, Integer poulRefKey, Integer poulCmtindx,
			String poulModUserid, Date poulModDate, String poulUser1,
			String poulUser2, String poulQadc01, String poulQadc02,
			Double oidPoulMstr) {
		super(id, poulRefKey, poulCmtindx, poulModUserid, poulModDate,
				poulUser1, poulUser2, poulQadc01, poulQadc02, oidPoulMstr);
	}

}
