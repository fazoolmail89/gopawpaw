package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DbkMstr entity. @author MyEclipse Persistence Tools
 */
public class DbkMstr extends AbstractDbkMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DbkMstr() {
	}

	/** minimal constructor */
	public DbkMstr(DbkMstrId id, Integer dbkCurrPd, Integer dbkPdYr,
			Date dbkBegDt, Double oidDbkMstr) {
		super(id, dbkCurrPd, dbkPdYr, dbkBegDt, oidDbkMstr);
	}

	/** full constructor */
	public DbkMstr(DbkMstrId id, String dbkDesc, String dbkCurr,
			Boolean dbkPost, Boolean dbkYtd, Integer dbkPdTaken,
			Integer dbkCurrPd, Integer dbkPdYr, Boolean dbkRepCost,
			Date dbkModDate, String dbkUserid, Date dbkBegDt, Boolean dbkQad01,
			String dbkQad02, String dbkQad03, String dbkBank, String dbkUser1,
			String dbkUser2, Double oidDbkMstr) {
		super(id, dbkDesc, dbkCurr, dbkPost, dbkYtd, dbkPdTaken, dbkCurrPd,
				dbkPdYr, dbkRepCost, dbkModDate, dbkUserid, dbkBegDt, dbkQad01,
				dbkQad02, dbkQad03, dbkBank, dbkUser1, dbkUser2, oidDbkMstr);
	}

}
