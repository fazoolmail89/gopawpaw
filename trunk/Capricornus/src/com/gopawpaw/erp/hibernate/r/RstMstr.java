package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RstMstr entity. @author MyEclipse Persistence Tools
 */
public class RstMstr extends AbstractRstMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RstMstr() {
	}

	/** minimal constructor */
	public RstMstr(RstMstrId id, String rstDesc, String rstNotify1,
			String rstNotify2, String rstUserid, String rstUser1,
			String rstUser2, String rstSvrtyList, String rstNotify1Mail,
			String rstNotify2Mail, Double oidRstMstr) {
		super(id, rstDesc, rstNotify1, rstNotify2, rstUserid, rstUser1,
				rstUser2, rstSvrtyList, rstNotify1Mail, rstNotify2Mail,
				oidRstMstr);
	}

	/** full constructor */
	public RstMstr(RstMstrId id, String rstDesc, String rstNotify1,
			String rstNotify2, Date rstModDate, String rstUserid,
			String rstUser1, String rstUser2, String rstSvrtyList,
			String rstNotify1Mail, String rstNotify2Mail, String rstQadc01,
			Double oidRstMstr) {
		super(id, rstDesc, rstNotify1, rstNotify2, rstModDate, rstUserid,
				rstUser1, rstUser2, rstSvrtyList, rstNotify1Mail,
				rstNotify2Mail, rstQadc01, oidRstMstr);
	}

}
