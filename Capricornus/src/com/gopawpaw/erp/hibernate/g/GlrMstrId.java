package com.gopawpaw.erp.hibernate.g;

/**
 * GlrMstrId entity. @author MyEclipse Persistence Tools
 */
public class GlrMstrId extends AbstractGlrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlrMstrId() {
	}

	/** minimal constructor */
	public GlrMstrId(String glrDomain) {
		super(glrDomain);
	}

	/** full constructor */
	public GlrMstrId(String glrDomain, String glrCode) {
		super(glrDomain, glrCode);
	}

}
