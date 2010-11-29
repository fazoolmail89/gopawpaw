package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CcdMstrId entity. @author MyEclipse Persistence Tools
 */
public class CcdMstrId extends AbstractCcdMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CcdMstrId() {
	}

	/** minimal constructor */
	public CcdMstrId(String ccdDomain) {
		super(ccdDomain);
	}

	/** full constructor */
	public CcdMstrId(String ccdDomain, String ccdCaNbr, Date ccdOpnDate,
			Integer ccdItmLine, String ccdPart, Integer ccdLine) {
		super(ccdDomain, ccdCaNbr, ccdOpnDate, ccdItmLine, ccdPart, ccdLine);
	}

}
