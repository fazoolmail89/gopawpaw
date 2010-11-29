package com.gopawpaw.erp.hibernate.s;

/**
 * SixRefId entity. @author MyEclipse Persistence Tools
 */
public class SixRefId extends AbstractSixRefId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SixRefId() {
	}

	/** minimal constructor */
	public SixRefId(String sixDomain) {
		super(sixDomain);
	}

	/** full constructor */
	public SixRefId(String sixDomain, Integer sixTrnbr) {
		super(sixDomain, sixTrnbr);
	}

}
