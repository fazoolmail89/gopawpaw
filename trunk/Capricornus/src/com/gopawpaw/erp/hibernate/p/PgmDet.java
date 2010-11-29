package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PgmDet entity. @author MyEclipse Persistence Tools
 */
public class PgmDet extends AbstractPgmDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PgmDet() {
	}

	/** minimal constructor */
	public PgmDet(PgmDetId id, Double oidPgmDet) {
		super(id, oidPgmDet);
	}

	/** full constructor */
	public PgmDet(PgmDetId id, String pgmCmmt, Date pgmModDate,
			String pgmUserid, String pgmUser1, String pgmUser2, String pgmDesc,
			String pgmQadc01, Double oidPgmDet) {
		super(id, pgmCmmt, pgmModDate, pgmUserid, pgmUser1, pgmUser2, pgmDesc,
				pgmQadc01, oidPgmDet);
	}

}
