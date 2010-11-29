package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UmMstr entity. @author MyEclipse Persistence Tools
 */
public class UmMstr extends AbstractUmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UmMstr() {
	}

	/** minimal constructor */
	public UmMstr(UmMstrId id, Double oidUmMstr) {
		super(id, oidUmMstr);
	}

	/** full constructor */
	public UmMstr(UmMstrId id, Double umConv, String umDesc, Double umAltQty,
			Integer umDecimals, String umUser1, String umUser2, String umChr01,
			String umChr02, String umChr03, String umChr04, String umChr05,
			String umChr06, Double umDec01, Double umDec02, Date umDte01,
			Date umDte02, Boolean umLog01, Boolean umLog02, Double oidUmMstr) {
		super(id, umConv, umDesc, umAltQty, umDecimals, umUser1, umUser2,
				umChr01, umChr02, umChr03, umChr04, umChr05, umChr06, umDec01,
				umDec02, umDte01, umDte02, umLog01, umLog02, oidUmMstr);
	}

}
