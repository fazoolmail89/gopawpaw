package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlbmMstr entity. @author MyEclipse Persistence Tools
 */
public class WlbmMstr extends AbstractWlbmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlbmMstr() {
	}

	/** minimal constructor */
	public WlbmMstr(WlbmMstrId id, Double oidWlbmMstr) {
		super(id, oidWlbmMstr);
	}

	/** full constructor */
	public WlbmMstr(WlbmMstrId id, Boolean wlbmTrcComps, Boolean wlbmTrcRef,
			Boolean wlbmCompCmbOk, Date wlbmEnd, Date wlbmModDate,
			String wlbmModUserid, String wlbmQadc01, String wlbmQadc02,
			String wlbmQadc03, String wlbmQadc04, Double wlbmQadd01,
			Double wlbmQadd02, Integer wlbmQadi01, Integer wlbmQadi02,
			Boolean wlbmQadl01, Boolean wlbmQadl02, Date wlbmQadt01,
			Date wlbmQadt02, String wlbmChr01, String wlbmChr02,
			String wlbmChr03, String wlbmChr04, Double wlbmDec01,
			Double wlbmDec02, Integer wlbmInt01, Integer wlbmInt02,
			Boolean wlbmLog01, Boolean wlbmLog02, Date wlbmDte01,
			Date wlbmDte02, String wlbmUser1, String wlbmUser2,
			Double oidWlbmMstr) {
		super(id, wlbmTrcComps, wlbmTrcRef, wlbmCompCmbOk, wlbmEnd,
				wlbmModDate, wlbmModUserid, wlbmQadc01, wlbmQadc02, wlbmQadc03,
				wlbmQadc04, wlbmQadd01, wlbmQadd02, wlbmQadi01, wlbmQadi02,
				wlbmQadl01, wlbmQadl02, wlbmQadt01, wlbmQadt02, wlbmChr01,
				wlbmChr02, wlbmChr03, wlbmChr04, wlbmDec01, wlbmDec02,
				wlbmInt01, wlbmInt02, wlbmLog01, wlbmLog02, wlbmDte01,
				wlbmDte02, wlbmUser1, wlbmUser2, oidWlbmMstr);
	}

}
