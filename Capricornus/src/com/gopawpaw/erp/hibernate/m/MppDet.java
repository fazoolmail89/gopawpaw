package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MppDet entity. @author MyEclipse Persistence Tools
 */
public class MppDet extends AbstractMppDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MppDet() {
	}

	/** minimal constructor */
	public MppDet(MppDetId id, Double oidMppDet) {
		super(id, oidMppDet);
	}

	/** full constructor */
	public MppDet(MppDetId id, String mppParm, String mppDesc,
			String mppFieldType, Date mppModDate, String mppModUserid,
			String mppUser1, String mppUser2, String mppChr01,
			Boolean mppLog01, String mppQadc01, Date mppQadt01,
			Double mppQade01, Boolean mppQadl01, Double oidMppDet) {
		super(id, mppParm, mppDesc, mppFieldType, mppModDate, mppModUserid,
				mppUser1, mppUser2, mppChr01, mppLog01, mppQadc01, mppQadt01,
				mppQade01, mppQadl01, oidMppDet);
	}

}
