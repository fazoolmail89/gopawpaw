package com.gopawpaw.erp.hibernate.g;

/**
 * GlrdDet entity. @author MyEclipse Persistence Tools
 */
public class GlrdDet extends AbstractGlrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlrdDet() {
	}

	/** minimal constructor */
	public GlrdDet(GlrdDetId id, Double oidGlrdDet) {
		super(id, oidGlrdDet);
	}

	/** full constructor */
	public GlrdDet(GlrdDetId id, String glrdAcct, String glrdCc,
			String glrdDesc, Integer glrdSums, Boolean glrdDrCr,
			Boolean glrdPage, Boolean glrdHeader, Boolean glrdTotal,
			String glrdEntity, String glrdUser1, String glrdUser2,
			Boolean glrdUnderln, Boolean glrdSkip, String glrdSub,
			String glrdAcct1, String glrdCc1, String glrdSub1,
			String glrdQadc01, Double oidGlrdDet) {
		super(id, glrdAcct, glrdCc, glrdDesc, glrdSums, glrdDrCr, glrdPage,
				glrdHeader, glrdTotal, glrdEntity, glrdUser1, glrdUser2,
				glrdUnderln, glrdSkip, glrdSub, glrdAcct1, glrdCc1, glrdSub1,
				glrdQadc01, oidGlrdDet);
	}

}
