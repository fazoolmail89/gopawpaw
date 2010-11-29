package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CmdDet entity. @author MyEclipse Persistence Tools
 */
public class CmdDet extends AbstractCmdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmdDet() {
	}

	/** full constructor */
	public CmdDet(CmdDetId id, String cmdVal, String cmdUser1, String cmdUser2,
			String cmdQadc01, String cmdModUserid, Date cmdModDate,
			Date cmdRefDate, Integer cmdRefTime, Double oidCmdDet) {
		super(id, cmdVal, cmdUser1, cmdUser2, cmdQadc01, cmdModUserid,
				cmdModDate, cmdRefDate, cmdRefTime, oidCmdDet);
	}

}
