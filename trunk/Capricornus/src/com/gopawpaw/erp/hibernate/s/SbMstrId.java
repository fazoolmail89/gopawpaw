package com.gopawpaw.erp.hibernate.s;

/**
 * SbMstrId entity. @author MyEclipse Persistence Tools
 */
public class SbMstrId extends AbstractSbMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbMstrId() {
	}

	/** minimal constructor */
	public SbMstrId(String sbDomain) {
		super(sbDomain);
	}

	/** full constructor */
	public SbMstrId(String sbDomain, String sbSub, Boolean sbActive) {
		super(sbDomain, sbSub, sbActive);
	}

}
