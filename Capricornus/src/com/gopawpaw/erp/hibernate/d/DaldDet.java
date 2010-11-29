package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DaldDet entity. @author MyEclipse Persistence Tools
 */
public class DaldDet extends AbstractDaldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DaldDet() {
	}

	/** minimal constructor */
	public DaldDet(DaldDetId id, Double oidDaldDet) {
		super(id, oidDaldDet);
	}

	/** full constructor */
	public DaldDet(DaldDetId id, Date daldEffDtOut, String daldModUserid,
			Date daldModDate, String daldUser1, String daldUser2,
			String daldChr01, String daldChr02, Double daldDec01,
			Double daldDec02, Integer daldInt01, Integer daldInt02,
			Boolean daldLog01, Boolean daldLog02, Date daldDte01,
			Date daldDte02, String daldQadc01, String daldQadc02,
			String daldQadc03, String daldQadc04, Double daldQadd01,
			Double daldQadd02, Integer daldQadi01, Integer daldQadi02,
			Boolean daldQadl01, Boolean daldQadl02, Date daldQadt01,
			Date daldQadt02, Double oidDaldDet) {
		super(id, daldEffDtOut, daldModUserid, daldModDate, daldUser1,
				daldUser2, daldChr01, daldChr02, daldDec01, daldDec02,
				daldInt01, daldInt02, daldLog01, daldLog02, daldDte01,
				daldDte02, daldQadc01, daldQadc02, daldQadc03, daldQadc04,
				daldQadd01, daldQadd02, daldQadi01, daldQadi02, daldQadl01,
				daldQadl02, daldQadt01, daldQadt02, oidDaldDet);
	}

}
