package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * HdMstrId entity. @author MyEclipse Persistence Tools
 */
public class HdMstrId extends AbstractHdMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HdMstrId() {
	}

	/** minimal constructor */
	public HdMstrId(String hdDomain, Date hdDate) {
		super(hdDomain, hdDate);
	}

	/** full constructor */
	public HdMstrId(String hdDomain, String hdSite, Date hdDate) {
		super(hdDomain, hdSite, hdDate);
	}

}
