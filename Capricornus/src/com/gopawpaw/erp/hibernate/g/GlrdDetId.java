package com.gopawpaw.erp.hibernate.g;

/**
 * GlrdDetId entity. @author MyEclipse Persistence Tools
 */
public class GlrdDetId extends AbstractGlrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlrdDetId() {
	}

	/** minimal constructor */
	public GlrdDetId(String glrdDomain) {
		super(glrdDomain);
	}

	/** full constructor */
	public GlrdDetId(String glrdDomain, String glrdCode, Integer glrdFpos,
			Integer glrdLine) {
		super(glrdDomain, glrdCode, glrdFpos, glrdLine);
	}

}
