package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FrMstr entity. @author MyEclipse Persistence Tools
 */
public class FrMstr extends AbstractFrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FrMstr() {
	}

	/** minimal constructor */
	public FrMstr(FrMstrId id, Boolean frType, String frUm, String frTrlCd,
			Double oidFrMstr) {
		super(id, frType, frUm, frTrlCd, oidFrMstr);
	}

	/** full constructor */
	public FrMstr(FrMstrId id, String frDesc, Boolean frType, String frUm,
			String frTrlCd, String frUser1, String frUser2, String frChr01,
			String frChr02, String frChr03, String frChr04, String frChr05,
			String frChr06, String frChr07, String frChr08, Double frDec01,
			Double frDec02, Date frDte01, Date frDte02, Boolean frLog01,
			Boolean frLog02, String frMode, Double oidFrMstr) {
		super(id, frDesc, frType, frUm, frTrlCd, frUser1, frUser2, frChr01,
				frChr02, frChr03, frChr04, frChr05, frChr06, frChr07, frChr08,
				frDec01, frDec02, frDte01, frDte02, frLog01, frLog02, frMode,
				oidFrMstr);
	}

}
