package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AprmMstr entity. @author MyEclipse Persistence Tools
 */
public class AprmMstr extends AbstractAprmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AprmMstr() {
	}

	/** minimal constructor */
	public AprmMstr(AprmMstrId id, Double oidAprmMstr) {
		super(id, oidAprmMstr);
	}

	/** full constructor */
	public AprmMstr(AprmMstrId id, Date aprmModDate, String aprmModUserid,
			String aprmCode, String aprmDesc, String aprmVal, String aprmUser1,
			String aprmUser2, Double aprmDec01, Double aprmDec02,
			Integer aprmInt01, Integer aprmInt02, Boolean aprmLog01,
			Boolean aprmLog02, Date aprmDte01, Date aprmDte02,
			String aprmQadc01, String aprmQadc02, String aprmQadc03,
			String aprmQadc04, Double aprmQadd01, Double aprmQadd02,
			Integer aprmQadi01, Integer aprmQadi02, Boolean aprmQadl01,
			Boolean aprmQadl02, Date aprmQadt01, Date aprmQadt02,
			Double oidAprmMstr) {
		super(id, aprmModDate, aprmModUserid, aprmCode, aprmDesc, aprmVal,
				aprmUser1, aprmUser2, aprmDec01, aprmDec02, aprmInt01,
				aprmInt02, aprmLog01, aprmLog02, aprmDte01, aprmDte02,
				aprmQadc01, aprmQadc02, aprmQadc03, aprmQadc04, aprmQadd01,
				aprmQadd02, aprmQadi01, aprmQadi02, aprmQadl01, aprmQadl02,
				aprmQadt01, aprmQadt02, oidAprmMstr);
	}

}
