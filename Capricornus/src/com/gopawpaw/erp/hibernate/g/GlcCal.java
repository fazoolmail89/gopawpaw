package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GlcCal entity. @author MyEclipse Persistence Tools
 */
public class GlcCal extends AbstractGlcCal implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlcCal() {
	}

	/** minimal constructor */
	public GlcCal(GlcCalId id, Boolean glcYrEnd, Double oidGlcCal) {
		super(id, glcYrEnd, oidGlcCal);
	}

	/** full constructor */
	public GlcCal(GlcCalId id, Date glcStart, Date glcEnd, Boolean glcQad01,
			Boolean glcQad04, Boolean glcQad03, String glcQad02,
			String glcUser1, String glcUser2, Boolean glcYrEnd, Double oidGlcCal) {
		super(id, glcStart, glcEnd, glcQad01, glcQad04, glcQad03, glcQad02,
				glcUser1, glcUser2, glcYrEnd, oidGlcCal);
	}

}
