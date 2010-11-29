package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MpsMstrId entity. @author MyEclipse Persistence Tools
 */
public class MpsMstrId extends AbstractMpsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpsMstrId() {
	}

	/** minimal constructor */
	public MpsMstrId(String mpsDomain) {
		super(mpsDomain);
	}

	/** full constructor */
	public MpsMstrId(String mpsDomain, String mpsPart, String mpsSite,
			String mpsLine, Date mpsDueDate) {
		super(mpsDomain, mpsPart, mpsSite, mpsLine, mpsDueDate);
	}

}
