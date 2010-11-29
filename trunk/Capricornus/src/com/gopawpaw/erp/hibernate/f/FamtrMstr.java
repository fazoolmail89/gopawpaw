package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FamtrMstr entity. @author MyEclipse Persistence Tools
 */
public class FamtrMstr extends AbstractFamtrMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtrMstr() {
	}

	/** minimal constructor */
	public FamtrMstr(FamtrMstrId id, String famtrDesc, Integer famtrInit,
			Date famtrInitdt, Integer famtrRollover, String famtrModUserid,
			Date famtrModDate, String famtrUser1, String famtrUser2,
			String famtrChr01, Double famtrDec01, Boolean famtrLog01,
			Integer famtrInt01, String famtrQadc01, Double famtrQadd01,
			Boolean famtrQadl01, Integer famtrQadi01, Double oidFamtrMstr) {
		super(id, famtrDesc, famtrInit, famtrInitdt, famtrRollover,
				famtrModUserid, famtrModDate, famtrUser1, famtrUser2,
				famtrChr01, famtrDec01, famtrLog01, famtrInt01, famtrQadc01,
				famtrQadd01, famtrQadl01, famtrQadi01, oidFamtrMstr);
	}

	/** full constructor */
	public FamtrMstr(FamtrMstrId id, String famtrDesc, Integer famtrInit,
			Date famtrInitdt, Integer famtrRollover, String famtrModUserid,
			Date famtrModDate, String famtrUser1, String famtrUser2,
			String famtrChr01, Double famtrDec01, Boolean famtrLog01,
			Date famtrDte01, Integer famtrInt01, String famtrQadc01,
			Double famtrQadd01, Boolean famtrQadl01, Integer famtrQadi01,
			Date famtrQadt01, Double oidFamtrMstr) {
		super(id, famtrDesc, famtrInit, famtrInitdt, famtrRollover,
				famtrModUserid, famtrModDate, famtrUser1, famtrUser2,
				famtrChr01, famtrDec01, famtrLog01, famtrDte01, famtrInt01,
				famtrQadc01, famtrQadd01, famtrQadl01, famtrQadi01,
				famtrQadt01, oidFamtrMstr);
	}

}
