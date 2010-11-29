package com.gopawpaw.erp.hibernate.s;

/**
 * SalhHistId entity. @author MyEclipse Persistence Tools
 */
public class SalhHistId extends AbstractSalhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SalhHistId() {
	}

	/** minimal constructor */
	public SalhHistId(String salhDomain) {
		super(salhDomain);
	}

	/** full constructor */
	public SalhHistId(String salhDomain, Integer salhTrnbr) {
		super(salhDomain, salhTrnbr);
	}

}
