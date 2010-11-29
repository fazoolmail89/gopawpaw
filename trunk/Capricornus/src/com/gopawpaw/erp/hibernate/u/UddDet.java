package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UddDet entity. @author MyEclipse Persistence Tools
 */
public class UddDet extends AbstractUddDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UddDet() {
	}

	/** full constructor */
	public UddDet(UddDetId id, Boolean uddPrimary, String uddModUserid,
			Date uddModDate, String uddUser1, String uddUser2,
			String uddQadc01, String uddQadc02, String uddGroups,
			Double oidUddDet) {
		super(id, uddPrimary, uddModUserid, uddModDate, uddUser1, uddUser2,
				uddQadc01, uddQadc02, uddGroups, oidUddDet);
	}

}
