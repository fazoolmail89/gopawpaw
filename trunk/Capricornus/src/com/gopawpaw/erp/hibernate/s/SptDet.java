package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SptDet entity. @author MyEclipse Persistence Tools
 */
public class SptDet extends AbstractSptDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SptDet() {
	}

	/** minimal constructor */
	public SptDet(SptDetId id, Double oidSptDet) {
		super(id, oidSptDet);
	}

	/** full constructor */
	public SptDet(SptDetId id, Double sptCstTl, Double sptCstLl,
			String sptUser1, String sptUser2, String sptUserid,
			Date sptModDate, Double sptPctTl, Double sptPctLl, Boolean sptAo,
			String sptQadc01, Double oidSptDet) {
		super(id, sptCstTl, sptCstLl, sptUser1, sptUser2, sptUserid,
				sptModDate, sptPctTl, sptPctLl, sptAo, sptQadc01, oidSptDet);
	}

}
