package com.gopawpaw.erp.hibernate.g;

/**
 * GlcdDetId entity. @author MyEclipse Persistence Tools
 */
public class GlcdDetId extends AbstractGlcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlcdDetId() {
	}

	/** minimal constructor */
	public GlcdDetId(String glcdDomain) {
		super(glcdDomain);
	}

	/** full constructor */
	public GlcdDetId(String glcdDomain, Integer glcdYear, Integer glcdPer,
			String glcdEntity) {
		super(glcdDomain, glcdYear, glcdPer, glcdEntity);
	}

}
