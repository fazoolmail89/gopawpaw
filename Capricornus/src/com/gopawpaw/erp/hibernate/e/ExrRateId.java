package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ExrRateId entity. @author MyEclipse Persistence Tools
 */
public class ExrRateId extends AbstractExrRateId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExrRateId() {
	}

	/** full constructor */
	public ExrRateId(String exrDomain, String exrCurr1, String exrCurr2,
			String exrRatetype, Date exrStartDate) {
		super(exrDomain, exrCurr1, exrCurr2, exrRatetype, exrStartDate);
	}

}
