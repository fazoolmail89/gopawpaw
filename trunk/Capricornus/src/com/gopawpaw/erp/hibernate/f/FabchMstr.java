package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabchMstr entity. @author MyEclipse Persistence Tools
 */
public class FabchMstr extends AbstractFabchMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabchMstr() {
	}

	/** minimal constructor */
	public FabchMstr(FabchMstrId id, Double fabchCtrl, String fabchModUserid,
			Date fabchModDate, String fabchUser1, String fabchUser2,
			String fabchChr01, Double fabchDec01, Boolean fabchLog01,
			Integer fabchInt01, String fabchQadc01, Double fabchQadd01,
			Boolean fabchQadl01, Integer fabchQadi01, Double oidFabchMstr) {
		super(id, fabchCtrl, fabchModUserid, fabchModDate, fabchUser1,
				fabchUser2, fabchChr01, fabchDec01, fabchLog01, fabchInt01,
				fabchQadc01, fabchQadd01, fabchQadl01, fabchQadi01,
				oidFabchMstr);
	}

	/** full constructor */
	public FabchMstr(FabchMstrId id, Double fabchCtrl, Date fabchCreatedt,
			String fabchModUserid, Date fabchModDate, String fabchUser1,
			String fabchUser2, String fabchChr01, Double fabchDec01,
			Boolean fabchLog01, Date fabchDte01, Integer fabchInt01,
			String fabchQadc01, Double fabchQadd01, Boolean fabchQadl01,
			Integer fabchQadi01, Date fabchQadt01, Double oidFabchMstr) {
		super(id, fabchCtrl, fabchCreatedt, fabchModUserid, fabchModDate,
				fabchUser1, fabchUser2, fabchChr01, fabchDec01, fabchLog01,
				fabchDte01, fabchInt01, fabchQadc01, fabchQadd01, fabchQadl01,
				fabchQadi01, fabchQadt01, oidFabchMstr);
	}

}
