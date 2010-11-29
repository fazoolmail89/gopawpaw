package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SsdDet entity. @author MyEclipse Persistence Tools
 */
public class SsdDet extends AbstractSsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SsdDet() {
	}

	/** minimal constructor */
	public SsdDet(SsdDetId id, Double oidSsdDet) {
		super(id, oidSsdDet);
	}

	/** full constructor */
	public SsdDet(SsdDetId id, Double ssdPercent, Date ssdStart, Date ssdEnd,
			String ssdTrans, Integer ssdLeadtime, String ssdUser1,
			String ssdUser2, Double ssdQadd01, String ssdQadc01,
			Double oidSsdDet) {
		super(id, ssdPercent, ssdStart, ssdEnd, ssdTrans, ssdLeadtime,
				ssdUser1, ssdUser2, ssdQadd01, ssdQadc01, oidSsdDet);
	}

}
