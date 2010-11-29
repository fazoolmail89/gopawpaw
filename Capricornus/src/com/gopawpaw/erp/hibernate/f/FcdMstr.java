package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FcdMstr entity. @author MyEclipse Persistence Tools
 */
public class FcdMstr extends AbstractFcdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcdMstr() {
	}

	/** minimal constructor */
	public FcdMstr(FcdMstrId id, Double oidFcdMstr) {
		super(id, oidFcdMstr);
	}

	/** full constructor */
	public FcdMstr(FcdMstrId id, String fcdFcgContract, String fcdFcgCovered,
			String fcdFcgFixed, String fcdFcgBillable, String fcdUser1,
			String fcdUser2, Date fcdModDate, String fcdModUserid,
			String fcdChr01, String fcdChr02, Integer fcdInt01,
			Double fcdDec01, Date fcdDte01, String fcdQadc01, String fcdQadc02,
			Date fcdQadt01, Double fcdQadd01, Integer fcdQadi01,
			Boolean fcdLog01, Boolean fcdQadl01, String fcdFcgWarranty,
			Double oidFcdMstr) {
		super(id, fcdFcgContract, fcdFcgCovered, fcdFcgFixed, fcdFcgBillable,
				fcdUser1, fcdUser2, fcdModDate, fcdModUserid, fcdChr01,
				fcdChr02, fcdInt01, fcdDec01, fcdDte01, fcdQadc01, fcdQadc02,
				fcdQadt01, fcdQadd01, fcdQadi01, fcdLog01, fcdQadl01,
				fcdFcgWarranty, oidFcdMstr);
	}

}
