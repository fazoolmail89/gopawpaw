package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AdxDet entity. @author MyEclipse Persistence Tools
 */
public class AdxDet extends AbstractAdxDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AdxDet() {
	}

	/** minimal constructor */
	public AdxDet(AdxDetId id, String adxMfgAddr, String adxModUserid,
			Date adxModDate, Double oidAdxDet) {
		super(id, adxMfgAddr, adxModUserid, adxModDate, oidAdxDet);
	}

	/** full constructor */
	public AdxDet(AdxDetId id, String adxMfgAddr, String adxModUserid,
			Date adxModDate, String adxUser1, String adxUser2,
			String adxQadc01, Integer adxQadi01, Double adxQadd01,
			Boolean adxQadl01, Date adxQadt01, Double oidAdxDet) {
		super(id, adxMfgAddr, adxModUserid, adxModDate, adxUser1, adxUser2,
				adxQadc01, adxQadi01, adxQadd01, adxQadl01, adxQadt01,
				oidAdxDet);
	}

}
