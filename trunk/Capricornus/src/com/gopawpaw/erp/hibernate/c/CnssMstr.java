package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CnssMstr entity. @author MyEclipse Persistence Tools
 */
public class CnssMstr extends AbstractCnssMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnssMstr() {
	}

	/** full constructor */
	public CnssMstr(CnssMstrId id, Boolean cnssConsignFlag,
			Integer cnssMaxAgingDays, String cnssModUserid, Date cnssModDate,
			String cnssUser1, String cnssUser2, String cnssQadc01,
			String cnssQadc02, Double oidCnssMstr) {
		super(id, cnssConsignFlag, cnssMaxAgingDays, cnssModUserid,
				cnssModDate, cnssUser1, cnssUser2, cnssQadc01, cnssQadc02,
				oidCnssMstr);
	}

}
