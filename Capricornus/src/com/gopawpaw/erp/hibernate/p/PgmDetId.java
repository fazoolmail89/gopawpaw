package com.gopawpaw.erp.hibernate.p;

/**
 * PgmDetId entity. @author MyEclipse Persistence Tools
 */
public class PgmDetId extends AbstractPgmDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PgmDetId() {
	}

	/** minimal constructor */
	public PgmDetId(String pgmDomain) {
		super(pgmDomain);
	}

	/** full constructor */
	public PgmDetId(String pgmDomain, String pgmRef, String pgmEq,
			String pgmType, Integer pgmSeq) {
		super(pgmDomain, pgmRef, pgmEq, pgmType, pgmSeq);
	}

}
