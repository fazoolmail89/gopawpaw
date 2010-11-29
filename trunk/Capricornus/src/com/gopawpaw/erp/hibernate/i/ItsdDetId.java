package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ItsdDetId entity. @author MyEclipse Persistence Tools
 */
public class ItsdDetId extends AbstractItsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItsdDetId() {
	}

	/** minimal constructor */
	public ItsdDetId(String itsdDomain) {
		super(itsdDomain);
	}

	/** full constructor */
	public ItsdDetId(String itsdDomain, String itsdPart, String itsdSite,
			Date itsdDate, String itsdType) {
		super(itsdDomain, itsdPart, itsdSite, itsdDate, itsdType);
	}

}
