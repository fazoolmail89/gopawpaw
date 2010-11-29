package com.gopawpaw.erp.hibernate.c;

/**
 * CctrHistId entity. @author MyEclipse Persistence Tools
 */
public class CctrHistId extends AbstractCctrHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CctrHistId() {
	}

	/** full constructor */
	public CctrHistId(String cctrDomain, Integer cctrTrnbr) {
		super(cctrDomain, cctrTrnbr);
	}

}
