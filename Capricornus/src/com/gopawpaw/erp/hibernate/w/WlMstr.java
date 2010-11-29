package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WlMstr entity. @author MyEclipse Persistence Tools
 */
public class WlMstr extends AbstractWlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlMstr() {
	}

	/** minimal constructor */
	public WlMstr(WlMstrId id, Double oidWlMstr) {
		super(id, oidWlMstr);
	}

	/** full constructor */
	public WlMstr(WlMstrId id, String wlCertStatus, Double wlQtyCumprod,
			Double wlQtyCumcons, Double wlQtyCumrjct, Double wlQtyCumrwrk,
			Double wlQtyCumscrap, Double wlQtyCumadj, Double wlQtyCumtrin,
			Double wlQtyCumtrout, Date wlCrDate, Integer wlCrTime,
			Date wlModDate, Integer wlModTime, String wlModUserid,
			String wlQadc01, String wlQadc02, String wlQadc03, String wlQadc04,
			Double wlQadd01, Double wlQadd02, Integer wlQadi01,
			Integer wlQadi02, Boolean wlQadl01, Boolean wlQadl02,
			Date wlQadt01, Date wlQadt02, String wlChr01, String wlChr02,
			String wlChr03, String wlChr04, Double wlDec01, Double wlDec02,
			Integer wlInt01, Integer wlInt02, Boolean wlLog01, Boolean wlLog02,
			Date wlDte01, Date wlDte02, String wlUser1, String wlUser2,
			Double oidWlMstr) {
		super(id, wlCertStatus, wlQtyCumprod, wlQtyCumcons, wlQtyCumrjct,
				wlQtyCumrwrk, wlQtyCumscrap, wlQtyCumadj, wlQtyCumtrin,
				wlQtyCumtrout, wlCrDate, wlCrTime, wlModDate, wlModTime,
				wlModUserid, wlQadc01, wlQadc02, wlQadc03, wlQadc04, wlQadd01,
				wlQadd02, wlQadi01, wlQadi02, wlQadl01, wlQadl02, wlQadt01,
				wlQadt02, wlChr01, wlChr02, wlChr03, wlChr04, wlDec01, wlDec02,
				wlInt01, wlInt02, wlLog01, wlLog02, wlDte01, wlDte02, wlUser1,
				wlUser2, oidWlMstr);
	}

}
