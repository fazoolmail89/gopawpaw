package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlrmMstr entity. @author MyEclipse Persistence Tools
 */
public class WlrmMstr extends AbstractWlrmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlrmMstr() {
	}

	/** minimal constructor */
	public WlrmMstr(WlrmMstrId id, Double oidWlrmMstr) {
		super(id, oidWlrmMstr);
	}

	/** full constructor */
	public WlrmMstr(WlrmMstrId id, Boolean wlrmTrcParent,
			Double wlrmMaxlotsize, String wlrmNrmId, Boolean wlrmWipSplitOk,
			Boolean wlrmWipCmbOk, Boolean wlrmOverissue, Integer wlrmLtStartop,
			Integer wlrmSerStartop, Date wlrmEnd, Date wlrmModDate,
			String wlrmModUserid, String wlrmQadc01, String wlrmQadc02,
			String wlrmQadc03, String wlrmQadc04, Double wlrmQadd01,
			Double wlrmQadd02, Integer wlrmQadi01, Integer wlrmQadi02,
			Boolean wlrmQadl01, Boolean wlrmQadl02, Date wlrmQadt01,
			Date wlrmQadt02, String wlrmChr01, String wlrmChr02,
			String wlrmChr03, String wlrmChr04, Double wlrmDec01,
			Double wlrmDec02, Integer wlrmInt01, Integer wlrmInt02,
			Boolean wlrmLog01, Boolean wlrmLog02, Date wlrmDte01,
			Date wlrmDte02, String wlrmUser1, String wlrmUser2,
			Double oidWlrmMstr) {
		super(id, wlrmTrcParent, wlrmMaxlotsize, wlrmNrmId, wlrmWipSplitOk,
				wlrmWipCmbOk, wlrmOverissue, wlrmLtStartop, wlrmSerStartop,
				wlrmEnd, wlrmModDate, wlrmModUserid, wlrmQadc01, wlrmQadc02,
				wlrmQadc03, wlrmQadc04, wlrmQadd01, wlrmQadd02, wlrmQadi01,
				wlrmQadi02, wlrmQadl01, wlrmQadl02, wlrmQadt01, wlrmQadt02,
				wlrmChr01, wlrmChr02, wlrmChr03, wlrmChr04, wlrmDec01,
				wlrmDec02, wlrmInt01, wlrmInt02, wlrmLog01, wlrmLog02,
				wlrmDte01, wlrmDte02, wlrmUser1, wlrmUser2, oidWlrmMstr);
	}

}
