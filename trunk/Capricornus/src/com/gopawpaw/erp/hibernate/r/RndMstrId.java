package com.gopawpaw.erp.hibernate.r;

/**
 * RndMstrId entity. @author MyEclipse Persistence Tools
 */
public class RndMstrId extends AbstractRndMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RndMstrId() {
	}

	/** minimal constructor */
	public RndMstrId(String rndDomain) {
		super(rndDomain);
	}

	/** full constructor */
	public RndMstrId(String rndDomain, String rndRndMthd) {
		super(rndDomain, rndRndMthd);
	}

}
