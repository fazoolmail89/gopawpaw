package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * ChmMstrId entity. @author MyEclipse Persistence Tools
 */
public class ChmMstrId extends AbstractChmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ChmMstrId() {
	}

	/** minimal constructor */
	public ChmMstrId(String chmDomain) {
		super(chmDomain);
	}

	/** full constructor */
	public ChmMstrId(String chmDomain, String chmCategory, String chmNbr,
			Date chmOpnDate) {
		super(chmDomain, chmCategory, chmNbr, chmOpnDate);
	}

}
