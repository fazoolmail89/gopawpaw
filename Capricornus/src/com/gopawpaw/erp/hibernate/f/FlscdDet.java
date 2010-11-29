package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlscdDet entity. @author MyEclipse Persistence Tools
 */
public class FlscdDet extends AbstractFlscdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlscdDet() {
	}

	/** minimal constructor */
	public FlscdDet(FlscdDetId id, Double flscdMaxRate, Double flscdTargetRate,
			Date flscdModDate, String flscdUser1, String flscdUser2,
			String flscdUserc03, Double flscdUserd01, Integer flscdUseri01,
			String flscdModUserid, Boolean flscdUserl01, String flscdQadc01,
			String flscdQadc02, String flscdQadc03, Double flscdQadd01,
			Integer flscdQadi01, Boolean flscdQadl01, Double oidFlscdDet) {
		super(id, flscdMaxRate, flscdTargetRate, flscdModDate, flscdUser1,
				flscdUser2, flscdUserc03, flscdUserd01, flscdUseri01,
				flscdModUserid, flscdUserl01, flscdQadc01, flscdQadc02,
				flscdQadc03, flscdQadd01, flscdQadi01, flscdQadl01, oidFlscdDet);
	}

	/** full constructor */
	public FlscdDet(FlscdDetId id, Double flscdMaxRate, Double flscdTargetRate,
			Date flscdModDate, String flscdUser1, String flscdUser2,
			String flscdUserc03, Double flscdUserd01, Integer flscdUseri01,
			String flscdModUserid, Boolean flscdUserl01, Date flscdUsert01,
			String flscdQadc01, String flscdQadc02, String flscdQadc03,
			Double flscdQadd01, Integer flscdQadi01, Boolean flscdQadl01,
			Date flscdQadt01, Double oidFlscdDet) {
		super(id, flscdMaxRate, flscdTargetRate, flscdModDate, flscdUser1,
				flscdUser2, flscdUserc03, flscdUserd01, flscdUseri01,
				flscdModUserid, flscdUserl01, flscdUsert01, flscdQadc01,
				flscdQadc02, flscdQadc03, flscdQadd01, flscdQadi01,
				flscdQadl01, flscdQadt01, oidFlscdDet);
	}

}
