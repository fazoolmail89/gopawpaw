package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CsidDet entity. @author MyEclipse Persistence Tools
 */
public class CsidDet extends AbstractCsidDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsidDet() {
	}

	/** minimal constructor */
	public CsidDet(CsidDetId id, Double oidCsidDet) {
		super(id, oidCsidDet);
	}

	/** full constructor */
	public CsidDet(CsidDetId id, Date csidStart, Date csidEnd,
			String csidStatus, String csidClass, String csidPref,
			String csidAddr1, String csidAddr2, String csidAddr3,
			String csidOrigCtry, Double csidOrigPct, Boolean csidIntrastat,
			String csidUser1, String csidUser2, String csidQadc01,
			Double oidCsidDet) {
		super(id, csidStart, csidEnd, csidStatus, csidClass, csidPref,
				csidAddr1, csidAddr2, csidAddr3, csidOrigCtry, csidOrigPct,
				csidIntrastat, csidUser1, csidUser2, csidQadc01, oidCsidDet);
	}

}
