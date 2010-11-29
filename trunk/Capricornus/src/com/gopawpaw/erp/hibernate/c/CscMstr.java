package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CscMstr entity. @author MyEclipse Persistence Tools
 */
public class CscMstr extends AbstractCscMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CscMstr() {
	}

	/** minimal constructor */
	public CscMstr(CscMstrId id, Double oidCscMstr) {
		super(id, oidCscMstr);
	}

	/** full constructor */
	public CscMstr(CscMstrId id, String cscCtrl, Date cscStart, Date cscEnd,
			Integer cscCmtindx, String cscUser1, String cscUser2,
			String cscQadc01, Double oidCscMstr) {
		super(id, cscCtrl, cscStart, cscEnd, cscCmtindx, cscUser1, cscUser2,
				cscQadc01, oidCscMstr);
	}

}
