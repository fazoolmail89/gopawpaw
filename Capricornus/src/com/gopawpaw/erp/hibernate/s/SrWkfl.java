package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SrWkfl entity. @author MyEclipse Persistence Tools
 */
public class SrWkfl extends AbstractSrWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrWkfl() {
	}

	/** minimal constructor */
	public SrWkfl(SrWkflId id, Double oidSrWkfl) {
		super(id, oidSrWkfl);
	}

	/** full constructor */
	public SrWkfl(SrWkflId id, Double srQty, Double srAssay, Date srExpire,
			String srUser1, String srUser2, String srRev, String srVendLot,
			String srToLoc, String srToSite, String srStatus, String srQadc01,
			Double oidSrWkfl) {
		super(id, srQty, srAssay, srExpire, srUser1, srUser2, srRev, srVendLot,
				srToLoc, srToSite, srStatus, srQadc01, oidSrWkfl);
	}

}
