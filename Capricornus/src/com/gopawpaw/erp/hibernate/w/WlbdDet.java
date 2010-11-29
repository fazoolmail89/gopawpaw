package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlbdDet entity. @author MyEclipse Persistence Tools
 */
public class WlbdDet extends AbstractWlbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlbdDet() {
	}

	/** minimal constructor */
	public WlbdDet(WlbdDetId id, Double oidWlbdDet) {
		super(id, oidWlbdDet);
	}

	/** full constructor */
	public WlbdDet(WlbdDetId id, Boolean wlbdTrcComps, Boolean wlbdTrcRef,
			Boolean wlbdCompCmbOk, Date wlbdModDate, String wlbdModUserid,
			String wlbdQadc01, String wlbdQadc02, String wlbdQadc03,
			String wlbdQadc04, Double wlbdQadd01, Double wlbdQadd02,
			Integer wlbdQadi01, Integer wlbdQadi02, Boolean wlbdQadl01,
			Boolean wlbdQadl02, Date wlbdQadt01, Date wlbdQadt02,
			String wlbdChr01, String wlbdChr02, String wlbdChr03,
			String wlbdChr04, Double wlbdDec01, Double wlbdDec02,
			Integer wlbdInt01, Integer wlbdInt02, Boolean wlbdLog01,
			Boolean wlbdLog02, Date wlbdDte01, Date wlbdDte02,
			String wlbdUser1, String wlbdUser2, Double oidWlbdDet) {
		super(id, wlbdTrcComps, wlbdTrcRef, wlbdCompCmbOk, wlbdModDate,
				wlbdModUserid, wlbdQadc01, wlbdQadc02, wlbdQadc03, wlbdQadc04,
				wlbdQadd01, wlbdQadd02, wlbdQadi01, wlbdQadi02, wlbdQadl01,
				wlbdQadl02, wlbdQadt01, wlbdQadt02, wlbdChr01, wlbdChr02,
				wlbdChr03, wlbdChr04, wlbdDec01, wlbdDec02, wlbdInt01,
				wlbdInt02, wlbdLog01, wlbdLog02, wlbdDte01, wlbdDte02,
				wlbdUser1, wlbdUser2, oidWlbdDet);
	}

}
