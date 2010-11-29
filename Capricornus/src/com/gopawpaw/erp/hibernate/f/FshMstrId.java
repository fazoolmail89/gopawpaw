package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FshMstrId entity. @author MyEclipse Persistence Tools
 */
public class FshMstrId extends AbstractFshMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FshMstrId() {
	}

	/** minimal constructor */
	public FshMstrId(String fshDomain) {
		super(fshDomain);
	}

	/** full constructor */
	public FshMstrId(String fshDomain, String fshCode, String fshCodeField,
			Date fshDate) {
		super(fshDomain, fshCode, fshCodeField, fshDate);
	}

}
