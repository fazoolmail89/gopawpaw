package com.gopawpaw.erp.hibernate.s;

/**
 * SbcMstrId entity. @author MyEclipse Persistence Tools
 */
public class SbcMstrId extends AbstractSbcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbcMstrId() {
	}

	/** minimal constructor */
	public SbcMstrId(String sbcDomain) {
		super(sbcDomain);
	}

	/** full constructor */
	public SbcMstrId(String sbcDomain, String sbcCode) {
		super(sbcDomain, sbcCode);
	}

}
