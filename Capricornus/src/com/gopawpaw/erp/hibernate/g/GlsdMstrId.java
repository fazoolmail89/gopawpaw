package com.gopawpaw.erp.hibernate.g;

/**
 * GlsdMstrId entity. @author MyEclipse Persistence Tools
 */
public class GlsdMstrId extends AbstractGlsdMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlsdMstrId() {
	}

	/** full constructor */
	public GlsdMstrId(String glsdDomain, String glsdNbr, Integer glsdSelect,
			String glsdLang) {
		super(glsdDomain, glsdNbr, glsdSelect, glsdLang);
	}

}
