package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CahHistId entity. @author MyEclipse Persistence Tools
 */
public class CahHistId extends AbstractCahHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CahHistId() {
	}

	/** minimal constructor */
	public CahHistId(String cahDomain) {
		super(cahDomain);
	}

	/** full constructor */
	public CahHistId(String cahDomain, String cahNbr, Date cahOpnDate,
			Integer cahSeq) {
		super(cahDomain, cahNbr, cahOpnDate, cahSeq);
	}

}
