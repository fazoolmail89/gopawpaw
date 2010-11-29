package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgcCtrl entity. @author MyEclipse Persistence Tools
 */
public class EgcCtrl extends AbstractEgcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgcCtrl() {
	}

	/** minimal constructor */
	public EgcCtrl(EgcCtrlId id, Boolean egcTzLimit, Boolean egcAreaLimit,
			String egcTzEngHours, String egcAvailLimit, Integer egcTzPoints,
			Boolean egcProbLimit, Boolean egcOverrideOpt, Double oidEgcCtrl) {
		super(id, egcTzLimit, egcAreaLimit, egcTzEngHours, egcAvailLimit,
				egcTzPoints, egcProbLimit, egcOverrideOpt, oidEgcCtrl);
	}

	/** full constructor */
	public EgcCtrl(EgcCtrlId id, String egcQadc05, String egcCallList,
			String egcEngLhr, Integer egcAreaPoints, Integer egcProbPoints,
			Integer egcAvailPoints, Integer egcPrimPoints, Boolean egcByCalls,
			String egcQadc06, String egcUser1, String egcUser2,
			Boolean egcHoursDisplay, Boolean egcTzLimit, Boolean egcAreaLimit,
			String egcTzEngHours, String egcAvailLimit, Integer egcQadi01,
			Integer egcTzPoints, String egcChr01, String egcChr02,
			Integer egcInt02, Integer egcInt01, Boolean egcLog01,
			Boolean egcLog02, String egcModUserid, Date egcModDate,
			Boolean egcProbLimit, Boolean egcOverrideOpt, String egcQadc03,
			String egcQadc04, Integer egcNbr, String egcQadc07,
			Boolean egcQadl05, Boolean egcQadl06, Boolean egcQadl07,
			Integer egcQadi04, Integer egcQadi05, Double egcQadd01,
			Double egcQadd02, Double egcQadd03, Date egcQadt01, Date egcQadt02,
			Date egcQadt03, Double oidEgcCtrl) {
		super(id, egcQadc05, egcCallList, egcEngLhr, egcAreaPoints,
				egcProbPoints, egcAvailPoints, egcPrimPoints, egcByCalls,
				egcQadc06, egcUser1, egcUser2, egcHoursDisplay, egcTzLimit,
				egcAreaLimit, egcTzEngHours, egcAvailLimit, egcQadi01,
				egcTzPoints, egcChr01, egcChr02, egcInt02, egcInt01, egcLog01,
				egcLog02, egcModUserid, egcModDate, egcProbLimit,
				egcOverrideOpt, egcQadc03, egcQadc04, egcNbr, egcQadc07,
				egcQadl05, egcQadl06, egcQadl07, egcQadi04, egcQadi05,
				egcQadd01, egcQadd02, egcQadd03, egcQadt01, egcQadt02,
				egcQadt03, oidEgcCtrl);
	}

}
