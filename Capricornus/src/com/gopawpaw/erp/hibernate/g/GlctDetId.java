package com.gopawpaw.erp.hibernate.g;

/**
 * GlctDetId entity. @author MyEclipse Persistence Tools
 */
public class GlctDetId extends AbstractGlctDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlctDetId() {
	}

	/** full constructor */
	public GlctDetId(String glctDomain, String glctEntity,
			String glctSourceCurr, String glctAcc, String glctSub,
			String glctCc, Integer glctYear, Integer glctPer) {
		super(glctDomain, glctEntity, glctSourceCurr, glctAcc, glctSub, glctCc,
				glctYear, glctPer);
	}

}
