package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbismDet entity. @author MyEclipse Persistence Tools
 */
public class KnbismDet extends AbstractKnbismDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbismDet() {
	}

	/** minimal constructor */
	public KnbismDet(KnbismDetId id, Double knbismKnbiKeyid,
			Double knbismKnbsmKeyid, Double knbismWorkingBuffer,
			Double knbismMaxBuf, String knbismBufLimitDisp,
			String knbismBufMethod, Boolean knbismBufModified,
			Double knbismCriticalLimit, Double knbismWarningLimit,
			Double knbismDailyDemand, String knbismDemandMethod,
			Boolean knbismDemandModified, Double knbismDemandPct,
			Double knbismVarFactor, String knbismTemplateUsed,
			Double knbismPackQty, String knbismPackType,
			Double knbismOrderPoint, String knbismSsMethod,
			Double knbismSafetyStock, Double knbismSafetyTime,
			Double knbismSsTotalQty, Integer knbismPeakPeriod,
			Double knbismServiceLevel, String knbismDestFax,
			String knbismDestFax2, String knbismDestEmail, Date knbismModDate,
			String knbismModUserid, String knbismUser1, String knbismUser2,
			String knbismQadc01, String knbismQadc02,
			Integer knbismAvgInvMethod, String knbismSsTemplate,
			Double knbismCountTolerance, Double knbismLagFactor,
			Double oidKnbismDet) {
		super(id, knbismKnbiKeyid, knbismKnbsmKeyid, knbismWorkingBuffer,
				knbismMaxBuf, knbismBufLimitDisp, knbismBufMethod,
				knbismBufModified, knbismCriticalLimit, knbismWarningLimit,
				knbismDailyDemand, knbismDemandMethod, knbismDemandModified,
				knbismDemandPct, knbismVarFactor, knbismTemplateUsed,
				knbismPackQty, knbismPackType, knbismOrderPoint,
				knbismSsMethod, knbismSafetyStock, knbismSafetyTime,
				knbismSsTotalQty, knbismPeakPeriod, knbismServiceLevel,
				knbismDestFax, knbismDestFax2, knbismDestEmail, knbismModDate,
				knbismModUserid, knbismUser1, knbismUser2, knbismQadc01,
				knbismQadc02, knbismAvgInvMethod, knbismSsTemplate,
				knbismCountTolerance, knbismLagFactor, oidKnbismDet);
	}

	/** full constructor */
	public KnbismDet(KnbismDetId id, Double knbismKnbiKeyid,
			Double knbismKnbsmKeyid, Double knbismWorkingBuffer,
			Double knbismMaxBuf, Date knbismBufLimitChg,
			String knbismBufLimitDisp, String knbismBufMethod,
			Boolean knbismBufModified, Double knbismCriticalLimit,
			Double knbismWarningLimit, Double knbismDailyDemand,
			String knbismDemandMethod, Boolean knbismDemandModified,
			Double knbismDemandPct, Double knbismVarFactor,
			String knbismTemplateUsed, Double knbismPackQty,
			String knbismPackType, Double knbismOrderPoint,
			String knbismSsMethod, Double knbismSafetyStock,
			Double knbismSafetyTime, Double knbismSsTotalQty,
			Integer knbismPeakPeriod, Double knbismServiceLevel,
			String knbismDestFax, String knbismDestFax2,
			String knbismDestEmail, Date knbismModDate, String knbismModUserid,
			String knbismUser1, String knbismUser2, String knbismQadc01,
			String knbismQadc02, Integer knbismAvgInvMethod,
			String knbismSsTemplate, Double knbismCountTolerance,
			Double knbismLagFactor, Double oidKnbismDet) {
		super(id, knbismKnbiKeyid, knbismKnbsmKeyid, knbismWorkingBuffer,
				knbismMaxBuf, knbismBufLimitChg, knbismBufLimitDisp,
				knbismBufMethod, knbismBufModified, knbismCriticalLimit,
				knbismWarningLimit, knbismDailyDemand, knbismDemandMethod,
				knbismDemandModified, knbismDemandPct, knbismVarFactor,
				knbismTemplateUsed, knbismPackQty, knbismPackType,
				knbismOrderPoint, knbismSsMethod, knbismSafetyStock,
				knbismSafetyTime, knbismSsTotalQty, knbismPeakPeriod,
				knbismServiceLevel, knbismDestFax, knbismDestFax2,
				knbismDestEmail, knbismModDate, knbismModUserid, knbismUser1,
				knbismUser2, knbismQadc01, knbismQadc02, knbismAvgInvMethod,
				knbismSsTemplate, knbismCountTolerance, knbismLagFactor,
				oidKnbismDet);
	}

}
