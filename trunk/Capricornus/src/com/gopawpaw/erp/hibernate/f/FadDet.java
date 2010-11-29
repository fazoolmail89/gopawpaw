package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FadDet entity. @author MyEclipse Persistence Tools
 */
public class FadDet extends AbstractFadDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FadDet() {
	}

	/** minimal constructor */
	public FadDet(FadDetId id, String fadFaId, String fadDesc,
			String fadSerial, Double fadPuramt, String fadModUserid,
			Date fadModDate, String fadUser1, String fadUser2, String fadChr01,
			Double fadDec01, Boolean fadLog01, Integer fadInt01,
			String fadQadc01, Double fadQadd01, Boolean fadQadl01,
			Integer fadQadi01, Double oidFadDet) {
		super(id, fadFaId, fadDesc, fadSerial, fadPuramt, fadModUserid,
				fadModDate, fadUser1, fadUser2, fadChr01, fadDec01, fadLog01,
				fadInt01, fadQadc01, fadQadd01, fadQadl01, fadQadi01, oidFadDet);
	}

	/** full constructor */
	public FadDet(FadDetId id, String fadFaId, String fadDesc,
			String fadSerial, Double fadPuramt, String fadModUserid,
			Date fadModDate, String fadUser1, String fadUser2, String fadChr01,
			Double fadDec01, Boolean fadLog01, Integer fadInt01, Date fadDte01,
			String fadQadc01, Double fadQadd01, Boolean fadQadl01,
			Integer fadQadi01, Date fadQadt01, Double oidFadDet) {
		super(id, fadFaId, fadDesc, fadSerial, fadPuramt, fadModUserid,
				fadModDate, fadUser1, fadUser2, fadChr01, fadDec01, fadLog01,
				fadInt01, fadDte01, fadQadc01, fadQadd01, fadQadl01, fadQadi01,
				fadQadt01, oidFadDet);
	}

}
