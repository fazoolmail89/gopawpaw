package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FctMstr entity. @author MyEclipse Persistence Tools
 */
public class FctMstr extends AbstractFctMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FctMstr() {
	}

	/** minimal constructor */
	public FctMstr(FctMstrId id, Double oidFctMstr) {
		super(id, oidFctMstr);
	}

	/** full constructor */
	public FctMstr(FctMstrId id, String fctDesc, Integer fctSchedType,
			String fctUser1, String fctUser2, String fctChr01, String fctChr02,
			Integer fctInt01, Integer fctInt02, Boolean fctLog01,
			Boolean fctLog02, String fctQadc01, String fctQadc02,
			Integer fctQadi01, Integer fctQadi02, Boolean fctQadl01,
			Boolean fctQadl02, String fctModUserid, Date fctModDate,
			Double oidFctMstr) {
		super(id, fctDesc, fctSchedType, fctUser1, fctUser2, fctChr01,
				fctChr02, fctInt01, fctInt02, fctLog01, fctLog02, fctQadc01,
				fctQadc02, fctQadi01, fctQadi02, fctQadl01, fctQadl02,
				fctModUserid, fctModDate, oidFctMstr);
	}

}
