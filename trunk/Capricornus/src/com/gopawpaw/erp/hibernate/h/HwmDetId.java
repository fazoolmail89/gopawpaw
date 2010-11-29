package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * HwmDetId entity. @author MyEclipse Persistence Tools
 */
public class HwmDetId extends AbstractHwmDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HwmDetId() {
	}

	/** full constructor */
	public HwmDetId(String hwmProduct, Date hwmDate) {
		super(hwmProduct, hwmDate);
	}

}
