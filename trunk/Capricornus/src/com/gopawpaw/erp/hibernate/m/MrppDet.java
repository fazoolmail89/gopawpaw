package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MrppDet entity. @author MyEclipse Persistence Tools
 */
public class MrppDet extends AbstractMrppDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MrppDet() {
	}

	/** full constructor */
	public MrppDet(MrppDetId id, Double mrppQtyPegged, Date mrppDemandDueDate,
			Date mrppSupplyDueDate, String mrppModUserid, Date mrppModDate,
			String mrppUser1, String mrppUser2, String mrppQadc01,
			String mrppQadc02, Double oidMrppDet) {
		super(id, mrppQtyPegged, mrppDemandDueDate, mrppSupplyDueDate,
				mrppModUserid, mrppModDate, mrppUser1, mrppUser2, mrppQadc01,
				mrppQadc02, oidMrppDet);
	}

}
