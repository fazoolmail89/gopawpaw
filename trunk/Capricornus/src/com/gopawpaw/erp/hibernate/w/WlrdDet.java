package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlrdDet entity. @author MyEclipse Persistence Tools
 */
public class WlrdDet extends AbstractWlrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlrdDet() {
	}

	/** minimal constructor */
	public WlrdDet(WlrdDetId id, Double oidWlrdDet) {
		super(id, oidWlrdDet);
	}

	/** full constructor */
	public WlrdDet(WlrdDetId id, Boolean wlrdWipSplitOk, Boolean wlrdWipCmbOk,
			Boolean wlrdOverissue, Date wlrdModDate, String wlrdModUserid,
			String wlrdQadc01, String wlrdQadc02, String wlrdQadc03,
			String wlrdQadc04, Double wlrdQadd01, Double wlrdQadd02,
			Integer wlrdQadi01, Integer wlrdQadi02, Boolean wlrdQadl01,
			Boolean wlrdQadl02, Date wlrdQadt01, Date wlrdQadt02,
			String wlrdChr01, String wlrdChr02, String wlrdChr03,
			String wlrdChr04, Double wlrdDec01, Double wlrdDec02,
			Integer wlrdInt01, Integer wlrdInt02, Boolean wlrdLog01,
			Boolean wlrdLog02, Date wlrdDte01, Date wlrdDte02,
			String wlrdUser1, String wlrdUser2, Double oidWlrdDet) {
		super(id, wlrdWipSplitOk, wlrdWipCmbOk, wlrdOverissue, wlrdModDate,
				wlrdModUserid, wlrdQadc01, wlrdQadc02, wlrdQadc03, wlrdQadc04,
				wlrdQadd01, wlrdQadd02, wlrdQadi01, wlrdQadi02, wlrdQadl01,
				wlrdQadl02, wlrdQadt01, wlrdQadt02, wlrdChr01, wlrdChr02,
				wlrdChr03, wlrdChr04, wlrdDec01, wlrdDec02, wlrdInt01,
				wlrdInt02, wlrdLog01, wlrdLog02, wlrdDte01, wlrdDte02,
				wlrdUser1, wlrdUser2, oidWlrdDet);
	}

}
