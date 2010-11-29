package com.gopawpaw.erp.hibernate.g;

/**
 * GlecDetId entity. @author MyEclipse Persistence Tools
 */
public class GlecDetId extends AbstractGlecDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlecDetId() {
	}

	/** minimal constructor */
	public GlecDetId(String glecDomain, String glecConsRef,
			Integer glecConsLine, String glecSubDomain, String glecSubRef,
			Integer glecSubLine) {
		super(glecDomain, glecConsRef, glecConsLine, glecSubDomain, glecSubRef,
				glecSubLine);
	}

	/** full constructor */
	public GlecDetId(String glecDomain, String glecConsRef,
			Boolean glecConsRflag, Integer glecConsLine, String glecSubDomain,
			String glecSubRef, Boolean glecSubRflag, Integer glecSubLine) {
		super(glecDomain, glecConsRef, glecConsRflag, glecConsLine,
				glecSubDomain, glecSubRef, glecSubRflag, glecSubLine);
	}

}
