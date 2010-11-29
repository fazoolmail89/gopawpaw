package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PacMstr entity. @author MyEclipse Persistence Tools
 */
public class PacMstr extends AbstractPacMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PacMstr() {
	}

	/** minimal constructor */
	public PacMstr(PacMstrId id, Double oidPacMstr) {
		super(id, oidPacMstr);
	}

	/** full constructor */
	public PacMstr(PacMstrId id, String pacDesc, String pacSite, String pacPl,
			String pacPurAcct, String pacPurCc, String pacAmt, String pacAprBy,
			String pacReqBy, String pacUser1, String pacUser2,
			String pacUserid, Date pacModDate, String pacQadc01,
			String pacPurSub, Double oidPacMstr) {
		super(id, pacDesc, pacSite, pacPl, pacPurAcct, pacPurCc, pacAmt,
				pacAprBy, pacReqBy, pacUser1, pacUser2, pacUserid, pacModDate,
				pacQadc01, pacPurSub, oidPacMstr);
	}

}
