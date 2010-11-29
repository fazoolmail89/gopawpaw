package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UsrgdDet entity. @author MyEclipse Persistence Tools
 */
public class UsrgdDet extends AbstractUsrgdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrgdDet() {
	}

	/** full constructor */
	public UsrgdDet(UsrgdDetId id, String usrgdModUserid, Date usrgdModDate,
			String usrgdUser1, String usrgdUser2, String usrgdQadc01,
			String usrgdQadc02, Double oidUsrgdDet) {
		super(id, usrgdModUserid, usrgdModDate, usrgdUser1, usrgdUser2,
				usrgdQadc01, usrgdQadc02, oidUsrgdDet);
	}

}
