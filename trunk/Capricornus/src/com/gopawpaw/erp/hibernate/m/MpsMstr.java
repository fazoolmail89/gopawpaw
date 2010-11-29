package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MpsMstr entity. @author MyEclipse Persistence Tools
 */
public class MpsMstr extends AbstractMpsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpsMstr() {
	}

	/** minimal constructor */
	public MpsMstr(MpsMstrId id, Double oidMpsMstr) {
		super(id, oidMpsMstr);
	}

	/** full constructor */
	public MpsMstr(MpsMstrId id, Date mpsRelDate, Double mpsQtyReq,
			Double mpsQtyCons, Integer mpsRecord, String mpsUser1,
			String mpsUser2, String mpsBomCode, String mpsRouting,
			String mpsQadc01, Double oidMpsMstr) {
		super(id, mpsRelDate, mpsQtyReq, mpsQtyCons, mpsRecord, mpsUser1,
				mpsUser2, mpsBomCode, mpsRouting, mpsQadc01, oidMpsMstr);
	}

}
