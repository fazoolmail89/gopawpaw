package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DeclMstr entity. @author MyEclipse Persistence Tools
 */
public class DeclMstr extends AbstractDeclMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DeclMstr() {
	}

	/** full constructor */
	public DeclMstr(DeclMstrId id, String declAgent, String declBranch,
			String declCtryCode, String declCurr, String declProgram,
			String declExRatetype, String declRegion, Date declModDate,
			String declModUserid, String declAffiliation, String declUser1,
			String declUser2, String declQadc01, String declQadc02,
			Double declNetWtMin, Double oidDeclMstr) {
		super(id, declAgent, declBranch, declCtryCode, declCurr, declProgram,
				declExRatetype, declRegion, declModDate, declModUserid,
				declAffiliation, declUser1, declUser2, declQadc01, declQadc02,
				declNetWtMin, oidDeclMstr);
	}

}
