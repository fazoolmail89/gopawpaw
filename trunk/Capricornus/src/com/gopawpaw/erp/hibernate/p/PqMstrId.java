package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PqMstrId entity. @author MyEclipse Persistence Tools
 */
public class PqMstrId extends AbstractPqMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PqMstrId() {
	}

	/** minimal constructor */
	public PqMstrId(String pqDomain, String pqRsc) {
		super(pqDomain, pqRsc);
	}

	/** full constructor */
	public PqMstrId(String pqDomain, String pqProdLine, String pqSite,
			String pqRsc, String pqRef, Date pqStart) {
		super(pqDomain, pqProdLine, pqSite, pqRsc, pqRef, pqStart);
	}

}
