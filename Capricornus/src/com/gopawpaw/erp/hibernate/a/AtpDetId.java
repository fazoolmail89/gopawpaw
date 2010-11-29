package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtpDetId entity. @author MyEclipse Persistence Tools
 */
public class AtpDetId extends AbstractAtpDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtpDetId() {
	}

	/** minimal constructor */
	public AtpDetId(String atpDomain, String atpPart) {
		super(atpDomain, atpPart);
	}

	/** full constructor */
	public AtpDetId(String atpDomain, String atpPart, String atpSite,
			Date atpDate, Integer atpIdNum) {
		super(atpDomain, atpPart, atpSite, atpDate, atpIdNum);
	}

}
