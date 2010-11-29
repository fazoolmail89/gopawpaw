package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LacdDet entity. @author MyEclipse Persistence Tools
 */
public class LacdDet extends AbstractLacdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LacdDet() {
	}

	/** full constructor */
	public LacdDet(LacdDetId id, String lacdLogSupplier, String lacdElement,
			String lacdAccrualLevel, String lacdModUserid, Date lacdModDate,
			String lacdUser1, String lacdUser2, String lacdQadc01,
			String lacdQadc02, Double oidLacdDet) {
		super(id, lacdLogSupplier, lacdElement, lacdAccrualLevel,
				lacdModUserid, lacdModDate, lacdUser1, lacdUser2, lacdQadc01,
				lacdQadc02, oidLacdDet);
	}

}
