package com.gopawpaw.erp.hibernate.f;

/**
 * FtchHistId entity. @author MyEclipse Persistence Tools
 */
public class FtchHistId extends AbstractFtchHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FtchHistId() {
	}

	/** minimal constructor */
	public FtchHistId(String ftchDomain) {
		super(ftchDomain);
	}

	/** full constructor */
	public FtchHistId(String ftchDomain, Integer ftchTrnbr) {
		super(ftchDomain, ftchTrnbr);
	}

}
