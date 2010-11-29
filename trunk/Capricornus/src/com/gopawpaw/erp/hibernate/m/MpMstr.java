package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MpMstr entity. @author MyEclipse Persistence Tools
 */
public class MpMstr extends AbstractMpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpMstr() {
	}

	/** minimal constructor */
	public MpMstr(MpMstrId id, Double oidMpMstr) {
		super(id, oidMpMstr);
	}

	/** full constructor */
	public MpMstr(MpMstrId id, String mpDesc, Date mpExpire, String mpUser1,
			String mpUser2, String mpChr01, String mpChr02, String mpChr03,
			String mpChr04, String mpChr05, Double mpDec01, Double mpDec02,
			Double oidMpMstr) {
		super(id, mpDesc, mpExpire, mpUser1, mpUser2, mpChr01, mpChr02,
				mpChr03, mpChr04, mpChr05, mpDec01, mpDec02, oidMpMstr);
	}

}
