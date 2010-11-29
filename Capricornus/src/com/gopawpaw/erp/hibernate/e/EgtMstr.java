package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgtMstr entity. @author MyEclipse Persistence Tools
 */
public class EgtMstr extends AbstractEgtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgtMstr() {
	}

	/** minimal constructor */
	public EgtMstr(EgtMstrId id, Boolean egtClose, String egtStartTime,
			String egtEndTime, Double egtHours, Boolean egtMulti,
			Boolean egtReschedule, Date egtSchedDate, Double oidEgtMstr) {
		super(id, egtClose, egtStartTime, egtEndTime, egtHours, egtMulti,
				egtReschedule, egtSchedDate, oidEgtMstr);
	}

	/** full constructor */
	public EgtMstr(EgtMstrId id, String egtEngCode, String egtCaNbr,
			Date egtCreateDate, String egtCurrent, String egtUser1,
			String egtUser2, Boolean egtClose, String egtStartTime,
			String egtEndTime, Double egtHours, Boolean egtMulti,
			Integer egtPriority, Boolean egtReschedule, Date egtSchedDate,
			String egtEshSchedule, String egtChr01, String egtChr02,
			String egtChr03, String egtChr04, Double egtDec01, Double egtDec02,
			Double egtDec03, Date egtDte01, Date egtDte02, Date egtDte03,
			Boolean egtLog01, Boolean egtLog02, Boolean egtLog03,
			String egtQadc01, String egtQadc02, String egtQadc03,
			String egtQadc04, Date egtQadd01, Date egtQadd02, Date egtQadd03,
			Double egtQadde01, Double egtQadde02, Double egtQadde03,
			Boolean egtQadl01, Boolean egtQadl02, Boolean egtQadl03,
			String egtItmPrefix, String egtItmType, Integer egtItmItmLine,
			Integer egtItmLine, Double oidEgtMstr) {
		super(id, egtEngCode, egtCaNbr, egtCreateDate, egtCurrent, egtUser1,
				egtUser2, egtClose, egtStartTime, egtEndTime, egtHours,
				egtMulti, egtPriority, egtReschedule, egtSchedDate,
				egtEshSchedule, egtChr01, egtChr02, egtChr03, egtChr04,
				egtDec01, egtDec02, egtDec03, egtDte01, egtDte02, egtDte03,
				egtLog01, egtLog02, egtLog03, egtQadc01, egtQadc02, egtQadc03,
				egtQadc04, egtQadd01, egtQadd02, egtQadd03, egtQadde01,
				egtQadde02, egtQadde03, egtQadl01, egtQadl02, egtQadl03,
				egtItmPrefix, egtItmType, egtItmItmLine, egtItmLine, oidEgtMstr);
	}

}
