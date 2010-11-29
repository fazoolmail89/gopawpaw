package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgdDet entity. @author MyEclipse Persistence Tools
 */
public class EgdDet extends AbstractEgdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgdDet() {
	}

	/** minimal constructor */
	public EgdDet(EgdDetId id, Double oidEgdDet) {
		super(id, oidEgdDet);
	}

	/** full constructor */
	public EgdDet(EgdDetId id, String egdStartTime, Date egdEndEff,
			String egdEndTime, String egdDays, String egdSchedType,
			String egdStatus, Boolean egdHolidays, Boolean egdOncall,
			String egdEshSchedule, String egdUser1, String egdUser2,
			Date egdModDate, String egdModUserid, String egdChr01,
			String egdQadc01, String egdQadc02, Boolean egdLog01,
			Boolean egdLog02, Boolean egdQadl01, Boolean egdQadl02,
			Date egdDte01, Date egdQadt01, Date egdQadt02, Double egdDec01,
			Double egdQade01, Double oidEgdDet) {
		super(id, egdStartTime, egdEndEff, egdEndTime, egdDays, egdSchedType,
				egdStatus, egdHolidays, egdOncall, egdEshSchedule, egdUser1,
				egdUser2, egdModDate, egdModUserid, egdChr01, egdQadc01,
				egdQadc02, egdLog01, egdLog02, egdQadl01, egdQadl02, egdDte01,
				egdQadt01, egdQadt02, egdDec01, egdQade01, oidEgdDet);
	}

}
