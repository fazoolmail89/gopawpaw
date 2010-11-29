package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CpMstr entity. @author MyEclipse Persistence Tools
 */
public class CpMstr extends AbstractCpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpMstr() {
	}

	/** minimal constructor */
	public CpMstr(CpMstrId id, Double oidCpMstr) {
		super(id, oidCpMstr);
	}

	/** full constructor */
	public CpMstr(CpMstrId id, String cpPart, String cpComment, String cpUser1,
			String cpUser2, String cpUserid, Date cpModDate, String cpPkgCode,
			String cpCustEco, String cpCustPartd, String cpQadc01,
			Double oidCpMstr) {
		super(id, cpPart, cpComment, cpUser1, cpUser2, cpUserid, cpModDate,
				cpPkgCode, cpCustEco, cpCustPartd, cpQadc01, oidCpMstr);
	}

}
