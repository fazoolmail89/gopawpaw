package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MuMstr entity. @author MyEclipse Persistence Tools
 */
public class MuMstr extends AbstractMuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MuMstr() {
	}

	/** minimal constructor */
	public MuMstr(MuMstrId id, String muUnionCurr, Date muEndDate,
			String muModUserid, Date muModDate, String muUser1, String muUser2,
			String muQadc01, Boolean muQadl01, Double muQadd01, Double oidMuMstr) {
		super(id, muUnionCurr, muEndDate, muModUserid, muModDate, muUser1,
				muUser2, muQadc01, muQadl01, muQadd01, oidMuMstr);
	}

	/** full constructor */
	public MuMstr(MuMstrId id, String muUnionCurr, Date muEndDate,
			String muModUserid, Date muModDate, String muUser1, String muUser2,
			String muQadc01, Boolean muQadl01, Date muQadt01, Double muQadd01,
			Double oidMuMstr) {
		super(id, muUnionCurr, muEndDate, muModUserid, muModDate, muUser1,
				muUser2, muQadc01, muQadl01, muQadt01, muQadd01, oidMuMstr);
	}

}
