package com.gopawpaw.erp.hibernate.p;

/**
 * PjMstrId entity. @author MyEclipse Persistence Tools
 */
public class PjMstrId extends AbstractPjMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjMstrId() {
	}

	/** minimal constructor */
	public PjMstrId(String pjDomain) {
		super(pjDomain);
	}

	/** full constructor */
	public PjMstrId(String pjDomain, String pjProject) {
		super(pjDomain, pjProject);
	}

}
