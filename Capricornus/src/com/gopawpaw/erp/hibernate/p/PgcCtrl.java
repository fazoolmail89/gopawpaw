package com.gopawpaw.erp.hibernate.p;

/**
 * PgcCtrl entity. @author MyEclipse Persistence Tools
 */
public class PgcCtrl extends AbstractPgcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PgcCtrl() {
	}

	/** minimal constructor */
	public PgcCtrl(PgcCtrlId id, Double oidPgcCtrl) {
		super(id, oidPgcCtrl);
	}

	/** full constructor */
	public PgcCtrl(PgcCtrlId id, String pgcPhone, Boolean pgcAppendCa,
			String pgcAddr, String pgcWaitStatus, String pgcPagedStatus,
			String pgcPreControl, String pgcPostControl, String pgcPort1,
			String pgcPort2, String pgcPort3, String pgcPort4,
			String pgcProgram, String pgcUser1, String pgcUser2,
			String pgcQadc01, Double oidPgcCtrl) {
		super(id, pgcPhone, pgcAppendCa, pgcAddr, pgcWaitStatus,
				pgcPagedStatus, pgcPreControl, pgcPostControl, pgcPort1,
				pgcPort2, pgcPort3, pgcPort4, pgcProgram, pgcUser1, pgcUser2,
				pgcQadc01, oidPgcCtrl);
	}

}
