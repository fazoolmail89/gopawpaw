package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GlctDet entity. @author MyEclipse Persistence Tools
 */
public class GlctDet extends AbstractGlctDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlctDet() {
	}

	/** minimal constructor */
	public GlctDet(GlctDetId id, Date glctModDate, String glctModUserid,
			String glctUser1, String glctUser2, String glctQadc01,
			String glctQadc02, Double oidGlctDet) {
		super(id, glctModDate, glctModUserid, glctUser1, glctUser2, glctQadc01,
				glctQadc02, oidGlctDet);
	}

	/** full constructor */
	public GlctDet(GlctDetId id, Double glctBaseAmt, Double glctCurrAmt,
			Date glctModDate, String glctModUserid, String glctUser1,
			String glctUser2, String glctQadc01, String glctQadc02,
			Double oidGlctDet) {
		super(id, glctBaseAmt, glctCurrAmt, glctModDate, glctModUserid,
				glctUser1, glctUser2, glctQadc01, glctQadc02, oidGlctDet);
	}

}
