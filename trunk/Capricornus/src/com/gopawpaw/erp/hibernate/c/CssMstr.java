package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CssMstr entity. @author MyEclipse Persistence Tools
 */
public class CssMstr extends AbstractCssMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CssMstr() {
	}

	/** minimal constructor */
	public CssMstr(CssMstrId id, Double oidCssMstr) {
		super(id, oidCssMstr);
	}

	/** full constructor */
	public CssMstr(CssMstrId id, String cssCtrl, Date cssStart, Date cssEnd,
			Integer cssCmtindx, String cssUser1, String cssUser2,
			String cssQadc01, Double oidCssMstr) {
		super(id, cssCtrl, cssStart, cssEnd, cssCmtindx, cssUser1, cssUser2,
				cssQadc01, oidCssMstr);
	}

}
