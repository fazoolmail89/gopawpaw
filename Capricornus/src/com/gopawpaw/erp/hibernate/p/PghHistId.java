package com.gopawpaw.erp.hibernate.p;

/**
 * PghHistId entity. @author MyEclipse Persistence Tools
 */
public class PghHistId extends AbstractPghHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PghHistId() {
	}

	/** minimal constructor */
	public PghHistId(String pghDomain) {
		super(pghDomain);
	}

	/** full constructor */
	public PghHistId(String pghDomain, Integer pghTrnbr) {
		super(pghDomain, pghTrnbr);
	}

}
