package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgwWkfl entity. @author MyEclipse Persistence Tools
 */
public class EgwWkfl extends AbstractEgwWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgwWkfl() {
	}

	/** minimal constructor */
	public EgwWkfl(EgwWkflId id, Double oidEgwWkfl) {
		super(id, oidEgwWkfl);
	}

	/** full constructor */
	public EgwWkfl(EgwWkflId id, Integer egwPoints, Boolean egwProb,
			String egwArea, Boolean egwAvailable, Date egwWeek,
			String egwHours, String egwAvailHours, String egwName,
			Boolean egwTag, String egwCalls, Integer egwEgaRecid,
			String egwUser1, String egwUser2, String egwStTime,
			String egwEndTime, Boolean egwOvertime, Boolean egwQadl01,
			Boolean egwQadl02, Date egwQadt01, String egwSchedule,
			Date egwQadt02, String egwQadc02, Integer egwQadi01,
			Integer egwQadi02, String egwQadc03, Double oidEgwWkfl) {
		super(id, egwPoints, egwProb, egwArea, egwAvailable, egwWeek, egwHours,
				egwAvailHours, egwName, egwTag, egwCalls, egwEgaRecid,
				egwUser1, egwUser2, egwStTime, egwEndTime, egwOvertime,
				egwQadl01, egwQadl02, egwQadt01, egwSchedule, egwQadt02,
				egwQadc02, egwQadi01, egwQadi02, egwQadc03, oidEgwWkfl);
	}

}
