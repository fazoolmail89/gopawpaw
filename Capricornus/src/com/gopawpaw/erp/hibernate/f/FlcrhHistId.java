package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlcrhHistId entity. @author MyEclipse Persistence Tools
 */
public class FlcrhHistId extends AbstractFlcrhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlcrhHistId() {
	}

	/** full constructor */
	public FlcrhHistId(String flcrhDomain, String flcrhSite,
			String flcrhProductionLine, String flcrhScheduleCode,
			Date flcrhStartDate) {
		super(flcrhDomain, flcrhSite, flcrhProductionLine, flcrhScheduleCode,
				flcrhStartDate);
	}

}
