package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FalMstr entity. @author MyEclipse Persistence Tools
 */
public class FalMstr extends AbstractFalMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FalMstr() {
	}

	/** minimal constructor */
	public FalMstr(Double oidFalMstr) {
		super(oidFalMstr);
	}

	/** full constructor */
	public FalMstr(String falLoc, String falDesc, String falBldg,
			String falDept, String falCc, String falAcCc, String falExpCc,
			String falSub, String falAcSub, String falExpSub, String falUserid,
			Date falModDate, Boolean falQad01, String falQad02,
			String falQad03, String falUser1, String falUser2, Double oidFalMstr) {
		super(falLoc, falDesc, falBldg, falDept, falCc, falAcCc, falExpCc,
				falSub, falAcSub, falExpSub, falUserid, falModDate, falQad01,
				falQad02, falQad03, falUser1, falUser2, oidFalMstr);
	}

}
