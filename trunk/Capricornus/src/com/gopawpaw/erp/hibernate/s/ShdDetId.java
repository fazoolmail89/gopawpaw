package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShdDetId entity. @author MyEclipse Persistence Tools
 */
public class ShdDetId extends AbstractShdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShdDetId() {
	}

	/** minimal constructor */
	public ShdDetId(String shdDomain) {
		super(shdDomain);
	}

	/** full constructor */
	public ShdDetId(String shdDomain, String shdCode, String shdSrcSite,
			String shdRecSite, Date shdDeparts) {
		super(shdDomain, shdCode, shdSrcSite, shdRecSite, shdDeparts);
	}

}
