package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ApMstr entity. @author MyEclipse Persistence Tools
 */
public class ApMstr extends AbstractApMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApMstr() {
	}

	/** minimal constructor */
	public ApMstr(ApMstrId id, String apDyCode, String apRemit,
			Double apExRate2, String apExRatetype, Double apBaseAmt,
			Integer apExruSeq, String apUnappliedRef, Double oidApMstr) {
		super(id, apDyCode, apRemit, apExRate2, apExRatetype, apBaseAmt,
				apExruSeq, apUnappliedRef, oidApMstr);
	}

	/** full constructor */
	public ApMstr(ApMstrId id, String apBatch, String apVend, Date apEffdate,
			Date apDate, Double apAmt, String apAcct, String apCc,
			String apDiscAcct, String apDiscCc, Boolean apOpen, String apRmk,
			String apUser1, String apUser2, String apCurr, Double apExRate,
			String apBank, String apSort, Date apExptDate, String apEntity,
			Double apEntEx, String apCkfrm, String apQad01, String apQad02,
			Boolean apQad03, String apDyCode, String apRemit, Double apExRate2,
			String apExRatetype, Double apBaseAmt, Integer apExruSeq,
			String apSub, String apDiscSub, String apUnappliedRef,
			Double oidApMstr) {
		super(id, apBatch, apVend, apEffdate, apDate, apAmt, apAcct, apCc,
				apDiscAcct, apDiscCc, apOpen, apRmk, apUser1, apUser2, apCurr,
				apExRate, apBank, apSort, apExptDate, apEntity, apEntEx,
				apCkfrm, apQad01, apQad02, apQad03, apDyCode, apRemit,
				apExRate2, apExRatetype, apBaseAmt, apExruSeq, apSub,
				apDiscSub, apUnappliedRef, oidApMstr);
	}

}
