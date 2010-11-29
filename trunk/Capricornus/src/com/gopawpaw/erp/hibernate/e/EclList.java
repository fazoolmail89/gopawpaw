package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EclList entity. @author MyEclipse Persistence Tools
 */
public class EclList extends AbstractEclList implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EclList() {
	}

	/** minimal constructor */
	public EclList(EclListId id, Double oidEclList) {
		super(id, oidEclList);
	}

	/** full constructor */
	public EclList(EclListId id, String eclDev, Integer eclCopies,
			String eclDesc, String eclUser1, String eclUser2, Boolean eclQad01,
			Date eclQad02, String eclQad03, String eclQad04, String eclQad05,
			Date eclModDate, String eclUserid, Double oidEclList) {
		super(id, eclDev, eclCopies, eclDesc, eclUser1, eclUser2, eclQad01,
				eclQad02, eclQad03, eclQad04, eclQad05, eclModDate, eclUserid,
				oidEclList);
	}

}
