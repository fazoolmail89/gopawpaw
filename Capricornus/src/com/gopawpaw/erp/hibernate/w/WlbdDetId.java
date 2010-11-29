package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlbdDetId entity. @author MyEclipse Persistence Tools
 */
public class WlbdDetId extends AbstractWlbdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlbdDetId() {
	}

	/** minimal constructor */
	public WlbdDetId(String wlbdDomain) {
		super(wlbdDomain);
	}

	/** full constructor */
	public WlbdDetId(String wlbdDomain, String wlbdBomCode, Date wlbdStart,
			String wlbdComp) {
		super(wlbdDomain, wlbdBomCode, wlbdStart, wlbdComp);
	}

}
