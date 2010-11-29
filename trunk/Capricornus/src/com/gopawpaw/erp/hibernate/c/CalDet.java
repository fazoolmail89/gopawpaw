package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CalDet entity. @author MyEclipse Persistence Tools
 */
public class CalDet extends AbstractCalDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CalDet() {
	}

	/** minimal constructor */
	public CalDet(CalDetId id, Double oidCalDet) {
		super(id, oidCalDet);
	}

	/** full constructor */
	public CalDet(CalDetId id, Date calEnd, Double calHours, String calUser1,
			String calUser2, Double calShift1, Double calShift2,
			Double calShift3, Double calShift4, String calQadc01,
			Double oidCalDet) {
		super(id, calEnd, calHours, calUser1, calUser2, calShift1, calShift2,
				calShift3, calShift4, calQadc01, oidCalDet);
	}

}
