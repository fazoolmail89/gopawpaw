package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MaxtDetId entity. @author MyEclipse Persistence Tools
 */
public class MaxtDetId extends AbstractMaxtDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaxtDetId() {
	}

	/** minimal constructor */
	public MaxtDetId(String maxtEntity) {
		super(maxtEntity);
	}

	/** full constructor */
	public MaxtDetId(String maxtField, String maxtBook, String maxtEntity,
			String maxtClass, Date maxtBegDate, Date maxtEndDate) {
		super(maxtField, maxtBook, maxtEntity, maxtClass, maxtBegDate,
				maxtEndDate);
	}

}
