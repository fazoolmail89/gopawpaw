package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ItsMstr entity. @author MyEclipse Persistence Tools
 */
public class ItsMstr extends AbstractItsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItsMstr() {
	}

	/** minimal constructor */
	public ItsMstr(ItsMstrId id, Double oidItsMstr) {
		super(id, oidItsMstr);
	}

	/** full constructor */
	public ItsMstr(ItsMstrId id, Date itsDate, Integer itsTarget,
			Double itsQtyOh, String itsUser1, String itsUser2, Double itsDec01,
			Double itsDec02, Double itsDec03, Double oidItsMstr) {
		super(id, itsDate, itsTarget, itsQtyOh, itsUser1, itsUser2, itsDec01,
				itsDec02, itsDec03, oidItsMstr);
	}

}
