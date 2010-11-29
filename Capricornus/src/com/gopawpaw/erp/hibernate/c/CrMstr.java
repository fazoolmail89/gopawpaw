package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CrMstr entity. @author MyEclipse Persistence Tools
 */
public class CrMstr extends AbstractCrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrMstr() {
	}

	/** minimal constructor */
	public CrMstr(CrMstrId id, Date crModDate, String crModUserid,
			String crUser1, String crUser2, String crQadc01, Double oidCrMstr) {
		super(id, crModDate, crModUserid, crUser1, crUser2, crQadc01, oidCrMstr);
	}

	/** full constructor */
	public CrMstr(CrMstrId id, Date crModDate, String crModUserid,
			String crUser1, String crUser2, String crQadc01, Date crQadt01,
			Double oidCrMstr) {
		super(id, crModDate, crModUserid, crUser1, crUser2, crQadc01, crQadt01,
				oidCrMstr);
	}

}
