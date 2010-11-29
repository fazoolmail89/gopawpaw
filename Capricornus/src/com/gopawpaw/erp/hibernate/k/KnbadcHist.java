package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbadcHist entity. @author MyEclipse Persistence Tools
 */
public class KnbadcHist extends AbstractKnbadcHist implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbadcHist() {
	}

	/** full constructor */
	public KnbadcHist(KnbadcHistId id, String knbadcPart, String knbadcSite,
			String knbadcTemplate, Date knbadcCalcDate, Double knbadcCalcTime,
			Double knbadcKnbismKeyid, Double knbadcDailyDemand,
			Date knbadcModDate, String knbadcModUserid, String knbadcUser1,
			String knbadcUser2, String knbadcQadc01, String knbadcQadc02,
			Double oidKnbadcHist) {
		super(id, knbadcPart, knbadcSite, knbadcTemplate, knbadcCalcDate,
				knbadcCalcTime, knbadcKnbismKeyid, knbadcDailyDemand,
				knbadcModDate, knbadcModUserid, knbadcUser1, knbadcUser2,
				knbadcQadc01, knbadcQadc02, oidKnbadcHist);
	}

}
