package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FauopDet entity. @author MyEclipse Persistence Tools
 */
public class FauopDet extends AbstractFauopDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FauopDet() {
	}

	/** minimal constructor */
	public FauopDet(FauopDetId id, Integer fauopUpper, Integer fauopAccup,
			String fauopModUserid, Date fauopModDate, String fauopUser1,
			String fauopUser2, String fauopChr01, Double fauopDec01,
			Boolean fauopLog01, Integer fauopInt01, String fauopQadc01,
			Double fauopQadd01, Boolean fauopQadl01, Integer fauopQadi01,
			Double oidFauopDet) {
		super(id, fauopUpper, fauopAccup, fauopModUserid, fauopModDate,
				fauopUser1, fauopUser2, fauopChr01, fauopDec01, fauopLog01,
				fauopInt01, fauopQadc01, fauopQadd01, fauopQadl01, fauopQadi01,
				oidFauopDet);
	}

	/** full constructor */
	public FauopDet(FauopDetId id, Integer fauopUpper, Integer fauopAccup,
			String fauopModUserid, Date fauopModDate, String fauopUser1,
			String fauopUser2, String fauopChr01, Double fauopDec01,
			Boolean fauopLog01, Date fauopDte01, Integer fauopInt01,
			String fauopQadc01, Double fauopQadd01, Boolean fauopQadl01,
			Integer fauopQadi01, Date fauopQadt01, Double oidFauopDet) {
		super(id, fauopUpper, fauopAccup, fauopModUserid, fauopModDate,
				fauopUser1, fauopUser2, fauopChr01, fauopDec01, fauopLog01,
				fauopDte01, fauopInt01, fauopQadc01, fauopQadd01, fauopQadl01,
				fauopQadi01, fauopQadt01, oidFauopDet);
	}

}
