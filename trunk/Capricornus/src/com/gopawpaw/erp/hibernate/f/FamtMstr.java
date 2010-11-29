package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FamtMstr entity. @author MyEclipse Persistence Tools
 */
public class FamtMstr extends AbstractFamtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtMstr() {
	}

	/** minimal constructor */
	public FamtMstr(FamtMstrId id, String famtType, Boolean famtSwitchsl,
			String famtDesc, Double famtElife, Boolean famtActive,
			Double famtPerc, Boolean famtSalv, String famtConv,
			Boolean famtActualdays, String famtModUserid, Date famtModDate,
			String famtUser1, String famtUser2, String famtChr01,
			Double famtDec01, Boolean famtLog01, Integer famtInt01,
			String famtQadc01, Double famtQadd01, Boolean famtQadl01,
			Integer famtQadi01, String famtQadc02, Double oidFamtMstr) {
		super(id, famtType, famtSwitchsl, famtDesc, famtElife, famtActive,
				famtPerc, famtSalv, famtConv, famtActualdays, famtModUserid,
				famtModDate, famtUser1, famtUser2, famtChr01, famtDec01,
				famtLog01, famtInt01, famtQadc01, famtQadd01, famtQadl01,
				famtQadi01, famtQadc02, oidFamtMstr);
	}

	/** full constructor */
	public FamtMstr(FamtMstrId id, String famtType, Boolean famtSwitchsl,
			String famtDesc, Double famtElife, Boolean famtActive,
			Double famtPerc, Boolean famtSalv, String famtConv,
			Boolean famtActualdays, String famtModUserid, Date famtModDate,
			String famtUser1, String famtUser2, String famtChr01,
			Double famtDec01, Boolean famtLog01, Date famtDte01,
			Integer famtInt01, String famtQadc01, Double famtQadd01,
			Boolean famtQadl01, Integer famtQadi01, Date famtQadt01,
			String famtQadc02, Double oidFamtMstr) {
		super(id, famtType, famtSwitchsl, famtDesc, famtElife, famtActive,
				famtPerc, famtSalv, famtConv, famtActualdays, famtModUserid,
				famtModDate, famtUser1, famtUser2, famtChr01, famtDec01,
				famtLog01, famtDte01, famtInt01, famtQadc01, famtQadd01,
				famtQadl01, famtQadi01, famtQadt01, famtQadc02, oidFamtMstr);
	}

}
