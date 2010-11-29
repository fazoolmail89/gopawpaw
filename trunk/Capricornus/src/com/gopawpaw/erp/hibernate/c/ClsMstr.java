package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * ClsMstr entity. @author MyEclipse Persistence Tools
 */
public class ClsMstr extends AbstractClsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ClsMstr() {
	}

	/** minimal constructor */
	public ClsMstr(Double oidClsMstr) {
		super(oidClsMstr);
	}

	/** full constructor */
	public ClsMstr(String clsDesc, String clsAcct, String clsAcAcct,
			String clsExpAcct, String clsUserid, Date clsModDate,
			Boolean clsQad01, String clsQad02, String clsQad03,
			String clsUser1, String clsUser2, Double oidClsMstr) {
		super(clsDesc, clsAcct, clsAcAcct, clsExpAcct, clsUserid, clsModDate,
				clsQad01, clsQad02, clsQad03, clsUser1, clsUser2, oidClsMstr);
	}

}
