package com.gopawpaw.erp.hibernate.m;

/**
 * MpMstrId entity. @author MyEclipse Persistence Tools
 */
public class MpMstrId extends AbstractMpMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpMstrId() {
	}

	/** minimal constructor */
	public MpMstrId(String mpDomain) {
		super(mpDomain);
	}

	/** full constructor */
	public MpMstrId(String mpDomain, String mpNbr) {
		super(mpDomain, mpNbr);
	}

}
