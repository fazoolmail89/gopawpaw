package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbdDet entity. @author MyEclipse Persistence Tools
 */
public class KnbdDet extends AbstractKnbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbdDet() {
	}

	/** minimal constructor */
	public KnbdDet(KnbdDetId id, Double knbdKeyid, Double knbdKnblKeyid,
			Boolean knbdActive, Double knbdKanbanQuantity, String knbdStatus,
			String knbdSourceType, String knbdRef1, String knbdRef2,
			String knbdRef3, String knbdRef4, String knbdRef5,
			Double knbdAuthorizeTime, Double knbdPrintTime, String knbdRouting,
			String knbdBomCode, Boolean knbdPrintDispatch, String knbdPouSite,
			String knbdPouRef, String knbdActiveCode,
			Integer knbdCyclesAllowed, Integer knbdCyclesUsed,
			String knbdNextProcessId, Date knbdModDate, String knbdModUserid,
			String knbdUser1, String knbdUser2, String knbdQadc01,
			String knbdQadc02, Double oidKnbdDet) {
		super(id, knbdKeyid, knbdKnblKeyid, knbdActive, knbdKanbanQuantity,
				knbdStatus, knbdSourceType, knbdRef1, knbdRef2, knbdRef3,
				knbdRef4, knbdRef5, knbdAuthorizeTime, knbdPrintTime,
				knbdRouting, knbdBomCode, knbdPrintDispatch, knbdPouSite,
				knbdPouRef, knbdActiveCode, knbdCyclesAllowed, knbdCyclesUsed,
				knbdNextProcessId, knbdModDate, knbdModUserid, knbdUser1,
				knbdUser2, knbdQadc01, knbdQadc02, oidKnbdDet);
	}

	/** full constructor */
	public KnbdDet(KnbdDetId id, Double knbdKeyid, Double knbdKnblKeyid,
			Boolean knbdActive, Double knbdKanbanQuantity, String knbdStatus,
			String knbdSourceType, String knbdRef1, String knbdRef2,
			String knbdRef3, String knbdRef4, String knbdRef5,
			Date knbdAuthorizeDate, Double knbdAuthorizeTime,
			Date knbdPrintDate, Double knbdPrintTime, String knbdRouting,
			String knbdBomCode, Boolean knbdPrintDispatch, String knbdPouSite,
			String knbdPouRef, String knbdActiveCode,
			Integer knbdCyclesAllowed, Integer knbdCyclesUsed,
			Date knbdActiveStartDate, Date knbdActiveEndDate,
			String knbdNextProcessId, Date knbdModDate, String knbdModUserid,
			String knbdUser1, String knbdUser2, String knbdQadc01,
			String knbdQadc02, Double oidKnbdDet) {
		super(id, knbdKeyid, knbdKnblKeyid, knbdActive, knbdKanbanQuantity,
				knbdStatus, knbdSourceType, knbdRef1, knbdRef2, knbdRef3,
				knbdRef4, knbdRef5, knbdAuthorizeDate, knbdAuthorizeTime,
				knbdPrintDate, knbdPrintTime, knbdRouting, knbdBomCode,
				knbdPrintDispatch, knbdPouSite, knbdPouRef, knbdActiveCode,
				knbdCyclesAllowed, knbdCyclesUsed, knbdActiveStartDate,
				knbdActiveEndDate, knbdNextProcessId, knbdModDate,
				knbdModUserid, knbdUser1, knbdUser2, knbdQadc01, knbdQadc02,
				oidKnbdDet);
	}

}
