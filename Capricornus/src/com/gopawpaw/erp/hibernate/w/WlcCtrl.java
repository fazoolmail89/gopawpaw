package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlcCtrl entity. @author MyEclipse Persistence Tools
 */
public class WlcCtrl extends AbstractWlcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlcCtrl() {
	}

	/** minimal constructor */
	public WlcCtrl(Double oidWlcCtrl) {
		super(oidWlcCtrl);
	}

	/** full constructor */
	public WlcCtrl(Boolean wlcTrcParents, Double wlcMaxlotsize,
			String wlcNrmId, Boolean wlcWipSplitOk, Boolean wlcWipCmbOk,
			Boolean wlcOverissue, Boolean wlcTrcComps, Boolean wlcTrcRef,
			Boolean wlcCompCmbOk, Integer wlcQadi03, Date wlcModDate,
			String wlcModUserid, String wlcQadc01, String wlcQadc02,
			String wlcQadc03, String wlcQadc04, Double wlcQadd01,
			Double wlcQadd02, Integer wlcQadi01, Integer wlcQadi02,
			Boolean wlcQadl01, Boolean wlcQadl02, Date wlcQadt01,
			Date wlcQadt02, String wlcChr01, String wlcChr02, String wlcChr03,
			String wlcChr04, Double wlcDec01, Double wlcDec02,
			Integer wlcInt01, Integer wlcInt02, Boolean wlcLog01,
			Boolean wlcLog02, Date wlcDte01, Date wlcDte02, String wlcUser1,
			String wlcUser2, Boolean wlcEnableWlt, Double oidWlcCtrl) {
		super(wlcTrcParents, wlcMaxlotsize, wlcNrmId, wlcWipSplitOk,
				wlcWipCmbOk, wlcOverissue, wlcTrcComps, wlcTrcRef,
				wlcCompCmbOk, wlcQadi03, wlcModDate, wlcModUserid, wlcQadc01,
				wlcQadc02, wlcQadc03, wlcQadc04, wlcQadd01, wlcQadd02,
				wlcQadi01, wlcQadi02, wlcQadl01, wlcQadl02, wlcQadt01,
				wlcQadt02, wlcChr01, wlcChr02, wlcChr03, wlcChr04, wlcDec01,
				wlcDec02, wlcInt01, wlcInt02, wlcLog01, wlcLog02, wlcDte01,
				wlcDte02, wlcUser1, wlcUser2, wlcEnableWlt, oidWlcCtrl);
	}

}
