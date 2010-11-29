package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlrdDetId entity. @author MyEclipse Persistence Tools
 */
public class WlrdDetId extends AbstractWlrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlrdDetId() {
	}

	/** minimal constructor */
	public WlrdDetId(String wlrdDomain) {
		super(wlrdDomain);
	}

	/** full constructor */
	public WlrdDetId(String wlrdDomain, String wlrdRouting, Date wlrdStart,
			Integer wlrdOp) {
		super(wlrdDomain, wlrdRouting, wlrdStart, wlrdOp);
	}

}
