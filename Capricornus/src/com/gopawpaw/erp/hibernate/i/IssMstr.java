package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IssMstr entity. @author MyEclipse Persistence Tools
 */
public class IssMstr extends AbstractIssMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IssMstr() {
	}

	/** minimal constructor */
	public IssMstr(IssMstrId id, Double oidIssMstr) {
		super(id, oidIssMstr);
	}

	/** full constructor */
	public IssMstr(IssMstrId id, String issChr01, String issChr02,
			String issChr03, Double issDec01, Double issDec02, Date issDte01,
			Date issDte02, Boolean issLog01, Boolean issLog02, String issUser1,
			String issUser2, Double oidIssMstr) {
		super(id, issChr01, issChr02, issChr03, issDec01, issDec02, issDte01,
				issDte02, issLog01, issLog02, issUser1, issUser2, oidIssMstr);
	}

}
