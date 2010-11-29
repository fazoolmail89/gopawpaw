package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlbmMstrId entity. @author MyEclipse Persistence Tools
 */
public class WlbmMstrId extends AbstractWlbmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlbmMstrId() {
	}

	/** minimal constructor */
	public WlbmMstrId(String wlbmDomain) {
		super(wlbmDomain);
	}

	/** full constructor */
	public WlbmMstrId(String wlbmDomain, String wlbmBomCode, Date wlbmStart) {
		super(wlbmDomain, wlbmBomCode, wlbmStart);
	}

}
