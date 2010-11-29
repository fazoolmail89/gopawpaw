package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlrmMstrId entity. @author MyEclipse Persistence Tools
 */
public class WlrmMstrId extends AbstractWlrmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlrmMstrId() {
	}

	/** minimal constructor */
	public WlrmMstrId(String wlrmDomain) {
		super(wlrmDomain);
	}

	/** full constructor */
	public WlrmMstrId(String wlrmDomain, String wlrmRouting, Date wlrmStart) {
		super(wlrmDomain, wlrmRouting, wlrmStart);
	}

}
