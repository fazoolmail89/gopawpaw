package com.gopawpaw.erp.hibernate.f;

/**
 * FlffMstrId entity. @author MyEclipse Persistence Tools
 */
public class FlffMstrId extends AbstractFlffMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlffMstrId() {
	}

	/** full constructor */
	public FlffMstrId(String flffDomain, String flffSite,
			String flffProductionLine, String flffScheduleCode,
			Integer flffPeriodNumber) {
		super(flffDomain, flffSite, flffProductionLine, flffScheduleCode,
				flffPeriodNumber);
	}

}
