package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PouMstr entity. @author MyEclipse Persistence Tools
 */
public class PouMstr extends AbstractPouMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PouMstr() {
	}

	/** full constructor */
	public PouMstr(PouMstrId id, String pouDesc, Integer pouCmtindx,
			String pouModUserid, Date pouModDate, String pouUser1,
			String pouUser2, String pouQadc01, String pouQadc02,
			Double oidPouMstr) {
		super(id, pouDesc, pouCmtindx, pouModUserid, pouModDate, pouUser1,
				pouUser2, pouQadc01, pouQadc02, oidPouMstr);
	}

}
