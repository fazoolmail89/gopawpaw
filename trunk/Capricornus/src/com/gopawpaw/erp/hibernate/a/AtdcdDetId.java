package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtdcdDetId entity. @author MyEclipse Persistence Tools
 */
public class AtdcdDetId extends AbstractAtdcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtdcdDetId() {
	}

	/** full constructor */
	public AtdcdDetId(String atdcdType, Date atdcdBeginDate) {
		super(atdcdType, atdcdBeginDate);
	}

}
