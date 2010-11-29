package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DbsMstr entity. @author MyEclipse Persistence Tools
 */
public class DbsMstr extends AbstractDbsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DbsMstr() {
	}

	/** minimal constructor */
	public DbsMstr(DbsMstrId id, Double oidDbsMstr) {
		super(id, oidDbsMstr);
	}

	/** full constructor */
	public DbsMstr(DbsMstrId id, String dbsStatus, String dbsUserid,
			Date dbsDate, Integer dbsTime, String dbsUser1, String dbsUser2,
			String dbsQadc01, Double oidDbsMstr) {
		super(id, dbsStatus, dbsUserid, dbsDate, dbsTime, dbsUser1, dbsUser2,
				dbsQadc01, oidDbsMstr);
	}

}
