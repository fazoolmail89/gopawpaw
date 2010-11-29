package com.gopawpaw.erp.hibernate.g;

/**
 * GltwWkflId entity. @author MyEclipse Persistence Tools
 */
public class GltwWkflId extends AbstractGltwWkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltwWkflId() {
	}

	/** minimal constructor */
	public GltwWkflId(String gltwDomain) {
		super(gltwDomain);
	}

	/** full constructor */
	public GltwWkflId(String gltwDomain, String gltwRef, Integer gltwLine,
			Boolean gltwRflag) {
		super(gltwDomain, gltwRef, gltwLine, gltwRflag);
	}

}
