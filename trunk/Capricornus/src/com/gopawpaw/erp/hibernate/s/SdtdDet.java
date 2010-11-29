package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SdtdDet entity. @author MyEclipse Persistence Tools
 */
public class SdtdDet extends AbstractSdtdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdtdDet() {
	}

	/** minimal constructor */
	public SdtdDet(SdtdDetId id, Double oidSdtdDet) {
		super(id, oidSdtdDet);
	}

	/** full constructor */
	public SdtdDet(SdtdDetId id, String sdtdModUserid, Date sdtdModDate,
			String sdtdUser1, String sdtdUser2, String sdtdChr01,
			String sdtdChr02, Double sdtdDec01, Double sdtdDec02,
			Date sdtdDte01, Date sdtdDte02, Boolean sdtdLog01,
			String sdtdQadc01, String sdtdQadc02, Double sdtdQadd01,
			Double sdtdQadd02, Date sdtdQadt01, Date sdtdQadt02,
			Boolean sdtdQadl01, Boolean sdtdQadl02, Integer sdtdQadi01,
			Integer sdtdQadi02, Double oidSdtdDet) {
		super(id, sdtdModUserid, sdtdModDate, sdtdUser1, sdtdUser2, sdtdChr01,
				sdtdChr02, sdtdDec01, sdtdDec02, sdtdDte01, sdtdDte02,
				sdtdLog01, sdtdQadc01, sdtdQadc02, sdtdQadd01, sdtdQadd02,
				sdtdQadt01, sdtdQadt02, sdtdQadl01, sdtdQadl02, sdtdQadi01,
				sdtdQadi02, oidSdtdDet);
	}

}
