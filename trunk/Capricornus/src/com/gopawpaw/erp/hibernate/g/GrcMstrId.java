package com.gopawpaw.erp.hibernate.g;

/**
 * GrcMstrId entity. @author MyEclipse Persistence Tools
 */
public class GrcMstrId extends AbstractGrcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrcMstrId() {
	}

	/** minimal constructor */
	public GrcMstrId(String grcDomain) {
		super(grcDomain);
	}

	/** full constructor */
	public GrcMstrId(String grcDomain, String grcColGroup) {
		super(grcDomain, grcColGroup);
	}

}
