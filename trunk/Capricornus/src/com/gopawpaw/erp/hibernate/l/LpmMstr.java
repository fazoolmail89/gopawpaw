package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LpmMstr entity. @author MyEclipse Persistence Tools
 */
public class LpmMstr extends AbstractLpmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LpmMstr() {
	}

	/** minimal constructor */
	public LpmMstr(String lpmDesc, Boolean lpmLicReq, String lpmModUserid,
			Date lpmModDate, String lpmQadc01, String lpmQadc02,
			Double lpmQadd01, String lpmVerList, Double oidLpmMstr) {
		super(lpmDesc, lpmLicReq, lpmModUserid, lpmModDate, lpmQadc01,
				lpmQadc02, lpmQadd01, lpmVerList, oidLpmMstr);
	}

	/** full constructor */
	public LpmMstr(String lpmDesc, Boolean lpmLicReq, String lpmModUserid,
			Date lpmModDate, String lpmQadc01, String lpmQadc02,
			Double lpmQadd01, Date lpmQadt01, String lpmVerList,
			Double oidLpmMstr) {
		super(lpmDesc, lpmLicReq, lpmModUserid, lpmModDate, lpmQadc01,
				lpmQadc02, lpmQadd01, lpmQadt01, lpmVerList, oidLpmMstr);
	}

}
