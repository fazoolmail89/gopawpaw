package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlscMstr entity. @author MyEclipse Persistence Tools
 */
public class FlscMstr extends AbstractFlscMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlscMstr() {
	}

	/** minimal constructor */
	public FlscMstr(FlscMstrId id, Date flscStartDate, String flscPeriodCode,
			String flscSchUm, String flscDesc, Boolean flscFlexFences,
			Boolean flscPhysicalUsage, Boolean flscTimeUsage,
			Boolean flscDailyTimeUsage, Boolean flscEntryMode,
			Date flscModDate, String flscUser1, String flscUser2,
			String flscUserc03, Double flscUserd01, Integer flscUseri01,
			String flscModUserid, Boolean flscUserl01, String flscQadc01,
			String flscQadc02, String flscQadc03, Double flscQadd01,
			Integer flscQadi01, Boolean flscQadl01, String flscSchMeasurement,
			String flscRateExpression, String flscQadc04, String flscQadc05,
			String flscQadc06, Double flscQadd02, Integer flscQadi02,
			Boolean flscQadl02, Double oidFlscMstr) {
		super(id, flscStartDate, flscPeriodCode, flscSchUm, flscDesc,
				flscFlexFences, flscPhysicalUsage, flscTimeUsage,
				flscDailyTimeUsage, flscEntryMode, flscModDate, flscUser1,
				flscUser2, flscUserc03, flscUserd01, flscUseri01,
				flscModUserid, flscUserl01, flscQadc01, flscQadc02, flscQadc03,
				flscQadd01, flscQadi01, flscQadl01, flscSchMeasurement,
				flscRateExpression, flscQadc04, flscQadc05, flscQadc06,
				flscQadd02, flscQadi02, flscQadl02, oidFlscMstr);
	}

	/** full constructor */
	public FlscMstr(FlscMstrId id, Date flscStartDate, String flscPeriodCode,
			String flscSchUm, String flscDesc, Boolean flscFlexFences,
			Boolean flscPhysicalUsage, Boolean flscTimeUsage,
			Boolean flscDailyTimeUsage, Boolean flscEntryMode,
			Date flscModDate, String flscUser1, String flscUser2,
			String flscUserc03, Double flscUserd01, Integer flscUseri01,
			String flscModUserid, Boolean flscUserl01, Date flscUsert01,
			String flscQadc01, String flscQadc02, String flscQadc03,
			Double flscQadd01, Integer flscQadi01, Boolean flscQadl01,
			Date flscQadt01, String flscSchMeasurement,
			String flscRateExpression, String flscQadc04, String flscQadc05,
			String flscQadc06, Double flscQadd02, Integer flscQadi02,
			Boolean flscQadl02, Date flscQadt02, Double oidFlscMstr) {
		super(id, flscStartDate, flscPeriodCode, flscSchUm, flscDesc,
				flscFlexFences, flscPhysicalUsage, flscTimeUsage,
				flscDailyTimeUsage, flscEntryMode, flscModDate, flscUser1,
				flscUser2, flscUserc03, flscUserd01, flscUseri01,
				flscModUserid, flscUserl01, flscUsert01, flscQadc01,
				flscQadc02, flscQadc03, flscQadd01, flscQadi01, flscQadl01,
				flscQadt01, flscSchMeasurement, flscRateExpression, flscQadc04,
				flscQadc05, flscQadc06, flscQadd02, flscQadi02, flscQadl02,
				flscQadt02, oidFlscMstr);
	}

}
