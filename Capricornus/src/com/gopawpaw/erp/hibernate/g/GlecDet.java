package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GlecDet entity. @author MyEclipse Persistence Tools
 */
public class GlecDet extends AbstractGlecDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlecDet() {
	}

	/** full constructor */
	public GlecDet(GlecDetId id, String glecModUserid, Date glecModDate,
			String glecUser1, String glecUser2, String glecQadc01,
			String glecQadc02, String glecConsEntity, String glecSubEntity,
			Double oidGlecDet) {
		super(id, glecModUserid, glecModDate, glecUser1, glecUser2, glecQadc01,
				glecQadc02, glecConsEntity, glecSubEntity, oidGlecDet);
	}

}
