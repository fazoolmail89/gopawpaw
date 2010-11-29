package com.gopawpaw.erp.hibernate.g;

/**
 * GlcdDet entity. @author MyEclipse Persistence Tools
 */
public class GlcdDet extends AbstractGlcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlcdDet() {
	}

	/** minimal constructor */
	public GlcdDet(GlcdDetId id, Double oidGlcdDet) {
		super(id, oidGlcdDet);
	}

	/** full constructor */
	public GlcdDet(GlcdDetId id, Boolean glcdGlClsd, Boolean glcdClosed,
			Boolean glcdYrClsd, String glcdUser1, String glcdUser2,
			String glcdQadc01, Double oidGlcdDet) {
		super(id, glcdGlClsd, glcdClosed, glcdYrClsd, glcdUser1, glcdUser2,
				glcdQadc01, oidGlcdDet);
	}

}
