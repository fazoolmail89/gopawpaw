package com.gopawpaw.erp.hibernate.g;

/**
 * GlcCalId entity. @author MyEclipse Persistence Tools
 */
public class GlcCalId extends AbstractGlcCalId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlcCalId() {
	}

	/** minimal constructor */
	public GlcCalId(String glcDomain) {
		super(glcDomain);
	}

	/** full constructor */
	public GlcCalId(String glcDomain, Integer glcYear, Integer glcPer) {
		super(glcDomain, glcYear, glcPer);
	}

}
