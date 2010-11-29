package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FcDetId entity. @author MyEclipse Persistence Tools
 */
public class FcDetId extends AbstractFcDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcDetId() {
	}

	/** minimal constructor */
	public FcDetId(String fcDomain, String fcPart) {
		super(fcDomain, fcPart);
	}

	/** full constructor */
	public FcDetId(String fcDomain, String fcPart, String fcSite, Date fcStart) {
		super(fcDomain, fcPart, fcSite, fcStart);
	}

}
