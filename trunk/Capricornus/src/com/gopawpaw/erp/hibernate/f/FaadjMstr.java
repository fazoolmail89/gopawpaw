package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FaadjMstr entity. @author MyEclipse Persistence Tools
 */
public class FaadjMstr extends AbstractFaadjMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaadjMstr() {
	}

	/** minimal constructor */
	public FaadjMstr(FaadjMstrId id, String faadjType, Double faadjAmt,
			String faadjYrper, Double faadjLife, String faadjFamtId,
			Boolean faadjMigrate, String faadjModUserid, Date faadjModDate,
			String faadjUser1, String faadjUser2, String faadjChr01,
			Double faadjDec01, Boolean faadjLog01, Integer faadjInt01,
			String faadjQadc01, Double faadjQadd01, Boolean faadjQadl01,
			Integer faadjQadi01, Double oidFaadjMstr) {
		super(id, faadjType, faadjAmt, faadjYrper, faadjLife, faadjFamtId,
				faadjMigrate, faadjModUserid, faadjModDate, faadjUser1,
				faadjUser2, faadjChr01, faadjDec01, faadjLog01, faadjInt01,
				faadjQadc01, faadjQadd01, faadjQadl01, faadjQadi01,
				oidFaadjMstr);
	}

	/** full constructor */
	public FaadjMstr(FaadjMstrId id, String faadjType, Double faadjAmt,
			String faadjYrper, Double faadjLife, String faadjFamtId,
			Boolean faadjMigrate, String faadjModUserid, Date faadjModDate,
			String faadjUser1, String faadjUser2, String faadjChr01,
			Double faadjDec01, Boolean faadjLog01, Date faadjDte01,
			Integer faadjInt01, String faadjQadc01, Double faadjQadd01,
			Boolean faadjQadl01, Integer faadjQadi01, Date faadjQadt01,
			Double oidFaadjMstr) {
		super(id, faadjType, faadjAmt, faadjYrper, faadjLife, faadjFamtId,
				faadjMigrate, faadjModUserid, faadjModDate, faadjUser1,
				faadjUser2, faadjChr01, faadjDec01, faadjLog01, faadjDte01,
				faadjInt01, faadjQadc01, faadjQadd01, faadjQadl01, faadjQadi01,
				faadjQadt01, oidFaadjMstr);
	}

}
