package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KbtrdDet entity. @author MyEclipse Persistence Tools
 */
public class KbtrdDet extends AbstractKbtrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbtrdDet() {
	}

	/** full constructor */
	public KbtrdDet(KbtrdDetId id, Date kbtrdModDate, String kbtrdModUserid,
			String kbtrdUser1, String kbtrdUser2, Integer kbtrdUseri01,
			String kbtrdQadc01, String kbtrdQadc02, Integer kbtrdQadi01,
			Double oidKbtrdDet) {
		super(id, kbtrdModDate, kbtrdModUserid, kbtrdUser1, kbtrdUser2,
				kbtrdUseri01, kbtrdQadc01, kbtrdQadc02, kbtrdQadi01,
				oidKbtrdDet);
	}

}
