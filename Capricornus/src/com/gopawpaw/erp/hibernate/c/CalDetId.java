package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CalDetId entity. @author MyEclipse Persistence Tools
 */
public class CalDetId extends AbstractCalDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CalDetId() {
	}

	/** minimal constructor */
	public CalDetId(String calDomain) {
		super(calDomain);
	}

	/** full constructor */
	public CalDetId(String calDomain, String calSite, String calWkctr,
			String calMch, String calRef, Date calStart) {
		super(calDomain, calSite, calWkctr, calMch, calRef, calStart);
	}

}
