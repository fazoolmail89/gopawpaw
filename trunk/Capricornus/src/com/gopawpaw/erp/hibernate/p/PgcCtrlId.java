package com.gopawpaw.erp.hibernate.p;

/**
 * PgcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class PgcCtrlId extends AbstractPgcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PgcCtrlId() {
	}

	/** minimal constructor */
	public PgcCtrlId(String pgcDomain) {
		super(pgcDomain);
	}

	/** full constructor */
	public PgcCtrlId(String pgcDomain, Integer pgcIndex) {
		super(pgcDomain, pgcIndex);
	}

}
