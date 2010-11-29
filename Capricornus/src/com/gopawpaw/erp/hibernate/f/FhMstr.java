package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FhMstr entity. @author MyEclipse Persistence Tools
 */
public class FhMstr extends AbstractFhMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FhMstr() {
	}

	/** minimal constructor */
	public FhMstr(FhMstrId id, Double oidFhMstr) {
		super(id, oidFhMstr);
	}

	/** full constructor */
	public FhMstr(FhMstrId id, Double fhFcstPct, String fhRlupPct,
			Date fhModDate, String fhModUserid, String fhUser1, String fhUser2,
			String fhRmks, String fhQadc01, Double oidFhMstr) {
		super(id, fhFcstPct, fhRlupPct, fhModDate, fhModUserid, fhUser1,
				fhUser2, fhRmks, fhQadc01, oidFhMstr);
	}

}
