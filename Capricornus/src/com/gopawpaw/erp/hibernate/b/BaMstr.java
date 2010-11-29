package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BaMstr entity. @author MyEclipse Persistence Tools
 */
public class BaMstr extends AbstractBaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BaMstr() {
	}

	/** minimal constructor */
	public BaMstr(BaMstrId id, Double oidBaMstr) {
		super(id, oidBaMstr);
	}

	/** full constructor */
	public BaMstr(BaMstrId id, String baUserid, Date baDate, Double baCtrl,
			Double baTotal, String baBank, String baStatus, String baUser1,
			String baUser2, String baDocType, Double baBegBal, String baQadc01,
			Double oidBaMstr) {
		super(id, baUserid, baDate, baCtrl, baTotal, baBank, baStatus, baUser1,
				baUser2, baDocType, baBegBal, baQadc01, oidBaMstr);
	}

}
