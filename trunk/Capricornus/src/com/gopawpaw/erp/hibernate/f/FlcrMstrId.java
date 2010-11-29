package com.gopawpaw.erp.hibernate.f;

/**
 * FlcrMstrId entity. @author MyEclipse Persistence Tools
 */
public class FlcrMstrId extends AbstractFlcrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlcrMstrId() {
	}

	/** full constructor */
	public FlcrMstrId(String flcrDomain, String flcrSite,
			String flcrProductionLine, String flcrScheduleCode,
			String flcrTypeCode, String flcrTypeValue, String flcrRateCode) {
		super(flcrDomain, flcrSite, flcrProductionLine, flcrScheduleCode,
				flcrTypeCode, flcrTypeValue, flcrRateCode);
	}

}
