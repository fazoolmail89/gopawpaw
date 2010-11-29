package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FcDet entity. @author MyEclipse Persistence Tools
 */
public class FcDet extends AbstractFcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcDet() {
	}

	/** minimal constructor */
	public FcDet(FcDetId id, Double oidFcDet) {
		super(id, oidFcDet);
	}

	/** full constructor */
	public FcDet(FcDetId id, String fcRef, Double fcQty, Date fcEnd,
			String fcUser1, String fcUser2, String fcQadc01, Double oidFcDet) {
		super(id, fcRef, fcQty, fcEnd, fcUser1, fcUser2, fcQadc01, oidFcDet);
	}

}
