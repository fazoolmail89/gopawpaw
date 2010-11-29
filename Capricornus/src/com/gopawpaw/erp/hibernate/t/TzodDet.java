package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TzodDet entity. @author MyEclipse Persistence Tools
 */
public class TzodDet extends AbstractTzodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TzodDet() {
	}

	/** minimal constructor */
	public TzodDet(TzodDetId id, Double oidTzodDet) {
		super(id, oidTzodDet);
	}

	/** full constructor */
	public TzodDet(TzodDetId id, Integer tzodMin, Integer tzodHour,
			Integer tzodSday, Integer tzodEday, Integer tzodMonth,
			String tzodWday, Integer tzodOffset, String tzodDesc,
			String tzodUser1, String tzodUser2, String tzodChr01,
			String tzodChr02, Integer tzodInt01, Integer tzodInt02,
			Date tzodDte01, Date tzodDte02, Boolean tzodLog01,
			Boolean tzodLog02, String tzodQadc01, String tzodQadc02,
			Integer tzodQadi01, Integer tzodQadi02, Boolean tzodQadl01,
			Boolean tzodQadl02, Date tzodQadt01, Date tzodQadt02,
			String tzodModUserid, Date tzodModDate, Double oidTzodDet) {
		super(id, tzodMin, tzodHour, tzodSday, tzodEday, tzodMonth, tzodWday,
				tzodOffset, tzodDesc, tzodUser1, tzodUser2, tzodChr01,
				tzodChr02, tzodInt01, tzodInt02, tzodDte01, tzodDte02,
				tzodLog01, tzodLog02, tzodQadc01, tzodQadc02, tzodQadi01,
				tzodQadi02, tzodQadl01, tzodQadl02, tzodQadt01, tzodQadt02,
				tzodModUserid, tzodModDate, oidTzodDet);
	}

}
