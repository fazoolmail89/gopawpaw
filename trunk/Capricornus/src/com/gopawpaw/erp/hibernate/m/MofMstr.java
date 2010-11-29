package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MofMstr entity. @author MyEclipse Persistence Tools
 */
public class MofMstr extends AbstractMofMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MofMstr() {
	}

	/** minimal constructor */
	public MofMstr(Double oidMofMstr) {
		super(oidMofMstr);
	}

	/** full constructor */
	public MofMstr(Integer mofFromLogin, Integer mofToLogin,
			Integer mofFromIdleMenu, Integer mofFromIdleProg,
			Boolean mofFilter, String mofFromUserid, String mofToUserid,
			String mofFromSel, String mofToSel, Boolean mofBind,
			String mofDesc, Integer mofSessions, String mofUser1,
			String mofUser2, String mofQadc01, Double mofQadd01,
			Integer mofQadi01, Boolean mofQadl01, Date mofQadt01,
			Double oidMofMstr) {
		super(mofFromLogin, mofToLogin, mofFromIdleMenu, mofFromIdleProg,
				mofFilter, mofFromUserid, mofToUserid, mofFromSel, mofToSel,
				mofBind, mofDesc, mofSessions, mofUser1, mofUser2, mofQadc01,
				mofQadd01, mofQadi01, mofQadl01, mofQadt01, oidMofMstr);
	}

}
