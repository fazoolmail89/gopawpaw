package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CncsMstr entity. @author MyEclipse Persistence Tools
 */
public class CncsMstr extends AbstractCncsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncsMstr() {
	}

	/** full constructor */
	public CncsMstr(CncsMstrId id, Boolean cncsConsignFlag,
			Integer cncsMaxAgingDays, String cncsConsignLoc,
			String cncsIntransLoc, Boolean cncsAutoReplenish,
			String cncsModUserid, Date cncsModDate, String cncsUser1,
			String cncsUser2, String cncsQadc01, String cncsQadc02,
			Double oidCncsMstr) {
		super(id, cncsConsignFlag, cncsMaxAgingDays, cncsConsignLoc,
				cncsIntransLoc, cncsAutoReplenish, cncsModUserid, cncsModDate,
				cncsUser1, cncsUser2, cncsQadc01, cncsQadc02, oidCncsMstr);
	}

}
