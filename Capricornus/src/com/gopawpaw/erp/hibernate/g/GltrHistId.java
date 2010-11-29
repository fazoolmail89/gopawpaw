package com.gopawpaw.erp.hibernate.g;

/**
 * GltrHistId entity. @author MyEclipse Persistence Tools
 */
public class GltrHistId extends AbstractGltrHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GltrHistId() {
	}

	/** minimal constructor */
	public GltrHistId(String gltrDomain) {
		super(gltrDomain);
	}

	/** full constructor */
	public GltrHistId(String gltrDomain, String gltrRef, Boolean gltrRflag,
			Integer gltrLine) {
		super(gltrDomain, gltrRef, gltrRflag, gltrLine);
	}

}
