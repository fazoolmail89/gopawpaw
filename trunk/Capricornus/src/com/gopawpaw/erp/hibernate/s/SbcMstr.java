package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SbcMstr entity. @author MyEclipse Persistence Tools
 */
public class SbcMstr extends AbstractSbcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbcMstr() {
	}

	/** minimal constructor */
	public SbcMstr(SbcMstrId id, Double oidSbcMstr) {
		super(id, oidSbcMstr);
	}

	/** full constructor */
	public SbcMstr(SbcMstrId id, String sbcDesc, Integer sbcDuration,
			Double sbcQtyBill, String sbcChr01, String sbcChr02,
			String sbcChr03, String sbcChr04, String sbcChr05, String sbcUser1,
			String sbcUser2, String sbcUm, String sbcModUserid,
			Date sbcModDate, String sbcQadc01, String sbcQadc02,
			String sbcQadc03, Double sbcQadd01, Boolean sbcQadl01,
			Double oidSbcMstr) {
		super(id, sbcDesc, sbcDuration, sbcQtyBill, sbcChr01, sbcChr02,
				sbcChr03, sbcChr04, sbcChr05, sbcUser1, sbcUser2, sbcUm,
				sbcModUserid, sbcModDate, sbcQadc01, sbcQadc02, sbcQadc03,
				sbcQadd01, sbcQadl01, oidSbcMstr);
	}

}
