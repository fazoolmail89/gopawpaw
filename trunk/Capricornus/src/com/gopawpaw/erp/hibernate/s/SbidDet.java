package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SbidDet entity. @author MyEclipse Persistence Tools
 */
public class SbidDet extends AbstractSbidDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbidDet() {
	}

	/** minimal constructor */
	public SbidDet(SbidDetId id, String sbidModelyr, String sbidCustref,
			Double oidSbidDet) {
		super(id, sbidModelyr, sbidCustref, oidSbidDet);
	}

	/** full constructor */
	public SbidDet(SbidDetId id, String sbidType, String sbidOrigin,
			String sbidPart, String sbidCust, Double sbidQty, String sbidUm,
			Double sbidPrice, Double sbidAmt, String sbidShipId,
			String sbidAuthorization, String sbidPo, Integer sbidTrnbr,
			String sbidInvNbr, Double sbidTaxAmt, Double sbidTaxPct,
			String sbidOrder, String sbidUser6, String sbidUser7,
			String sbidModUserid, Date sbidModDate, String sbidUser1,
			String sbidUser2, String sbidUser3, String sbidUser4,
			String sbidUser5, String sbidQadc01, String sbidQadc02,
			String sbidQadc03, String sbidQadc04, String sbidQadc05,
			String sbidQadc06, String sbidQadc07, String sbidQadc08,
			String sbidQadc09, String sbidQadc10, Integer sbidQadi01,
			Integer sbidQadi02, Integer sbidQadi03, Integer sbidQadi04,
			Integer sbidQadi05, Double sbidQadd01, Double sbidQadd02,
			Double sbidQadd03, Double sbidQadd04, Double sbidQadd05,
			Boolean sbidQadl01, Boolean sbidQadl02, Boolean sbidQadl03,
			Boolean sbidQadl04, Boolean sbidQadl05, Date sbidQadt01,
			Date sbidQadt02, Date sbidQadt03, Date sbidQadt04, Date sbidQadt05,
			String sbidRemarks, String sbidModelyr, String sbidCustref,
			Double oidSbidDet) {
		super(id, sbidType, sbidOrigin, sbidPart, sbidCust, sbidQty, sbidUm,
				sbidPrice, sbidAmt, sbidShipId, sbidAuthorization, sbidPo,
				sbidTrnbr, sbidInvNbr, sbidTaxAmt, sbidTaxPct, sbidOrder,
				sbidUser6, sbidUser7, sbidModUserid, sbidModDate, sbidUser1,
				sbidUser2, sbidUser3, sbidUser4, sbidUser5, sbidQadc01,
				sbidQadc02, sbidQadc03, sbidQadc04, sbidQadc05, sbidQadc06,
				sbidQadc07, sbidQadc08, sbidQadc09, sbidQadc10, sbidQadi01,
				sbidQadi02, sbidQadi03, sbidQadi04, sbidQadi05, sbidQadd01,
				sbidQadd02, sbidQadd03, sbidQadd04, sbidQadd05, sbidQadl01,
				sbidQadl02, sbidQadl03, sbidQadl04, sbidQadl05, sbidQadt01,
				sbidQadt02, sbidQadt03, sbidQadt04, sbidQadt05, sbidRemarks,
				sbidModelyr, sbidCustref, oidSbidDet);
	}

}
