package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtdcdDet entity. @author MyEclipse Persistence Tools
 */
public class AtdcdDet extends AbstractAtdcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtdcdDet() {
	}

	/** minimal constructor */
	public AtdcdDet(AtdcdDetId id, Double oidAtdcdDet, Double oidAtdcMstr,
			Boolean atdcdUsed, Date atdcdModDate, String atdcdModUserid,
			String atdcdUser1, String atdcdUser2, String atdcdQadc01,
			String atdcdQadc02) {
		super(id, oidAtdcdDet, oidAtdcMstr, atdcdUsed, atdcdModDate,
				atdcdModUserid, atdcdUser1, atdcdUser2, atdcdQadc01,
				atdcdQadc02);
	}

	/** full constructor */
	public AtdcdDet(AtdcdDetId id, Double oidAtdcdDet, Double oidAtdcMstr,
			Date atdcdEndDate, Boolean atdcdUsed, Date atdcdModDate,
			String atdcdModUserid, String atdcdUser1, String atdcdUser2,
			String atdcdQadc01, String atdcdQadc02) {
		super(id, oidAtdcdDet, oidAtdcMstr, atdcdEndDate, atdcdUsed,
				atdcdModDate, atdcdModUserid, atdcdUser1, atdcdUser2,
				atdcdQadc01, atdcdQadc02);
	}

}
