package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RsdDet entity. @author MyEclipse Persistence Tools
 */
public class RsdDet extends AbstractRsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsdDet() {
	}

	/** minimal constructor */
	public RsdDet(RsdDetId id, Double oidRsdDet) {
		super(id, oidRsdDet);
	}

	/** full constructor */
	public RsdDet(RsdDetId id, Double rsdCap, Date rsdStart, Date rsdEnd,
			String rsdUser1, String rsdUser2, Double rsdShift1,
			Double rsdShift2, Double rsdShift3, Double rsdShift4,
			String rsdQadc01, Double oidRsdDet) {
		super(id, rsdCap, rsdStart, rsdEnd, rsdUser1, rsdUser2, rsdShift1,
				rsdShift2, rsdShift3, rsdShift4, rsdQadc01, oidRsdDet);
	}

}
