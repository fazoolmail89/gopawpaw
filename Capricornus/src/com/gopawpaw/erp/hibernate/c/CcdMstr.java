package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CcdMstr entity. @author MyEclipse Persistence Tools
 */
public class CcdMstr extends AbstractCcdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CcdMstr() {
	}

	/** minimal constructor */
	public CcdMstr(CcdMstrId id, Double oidCcdMstr) {
		super(id, oidCcdMstr);
	}

	/** full constructor */
	public CcdMstr(CcdMstrId id, String ccdType, String ccdEngCode,
			Double ccdHours, String ccdProblem, String ccdChr01,
			String ccdChr02, String ccdChr03, String ccdChr04, String ccdChr05,
			String ccdChr06, String ccdChr07, String ccdChr08, String ccdCause,
			String ccdResolution, String ccdSerial, String ccdDate,
			String ccdSysSer, String ccdSysPart, Integer ccdCmtindx,
			String ccdUser1, String ccdUser2, Boolean ccdLog01,
			String ccdQadc01, String ccdQadc02, String ccdQadc03,
			String ccdQadc04, Date ccdModDate, String ccdModUserid,
			Double oidCcdMstr) {
		super(id, ccdType, ccdEngCode, ccdHours, ccdProblem, ccdChr01,
				ccdChr02, ccdChr03, ccdChr04, ccdChr05, ccdChr06, ccdChr07,
				ccdChr08, ccdCause, ccdResolution, ccdSerial, ccdDate,
				ccdSysSer, ccdSysPart, ccdCmtindx, ccdUser1, ccdUser2,
				ccdLog01, ccdQadc01, ccdQadc02, ccdQadc03, ccdQadc04,
				ccdModDate, ccdModUserid, oidCcdMstr);
	}

}
