package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SixRef entity. @author MyEclipse Persistence Tools
 */
public class SixRef extends AbstractSixRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SixRef() {
	}

	/** minimal constructor */
	public SixRef(SixRefId id, String sixModelyr, String sixCustref,
			Double oidSixRef) {
		super(id, sixModelyr, sixCustref, oidSixRef);
	}

	/** full constructor */
	public SixRef(SixRefId id, String sixType, String sixOrder,
			Integer sixLine, String sixSite, String sixShip, String sixCust,
			String sixBill, String sixPart, String sixSopart, Double sixQty,
			String sixUm, Double sixPrice, Double sixAmt, String sixCurr,
			String sixShipId, String sixAuthorization, String sixPo,
			Date sixShipdt, String sixInvNbr, Double sixQtyPaid,
			Double sixAmtPaid, Boolean sixClosed, String sixModUserid,
			Date sixModDate, String sixUser1, String sixUser2, String sixUser3,
			String sixUser4, String sixUser5, String sixQadc01,
			String sixQadc02, String sixQadc03, String sixQadc04,
			String sixQadc05, String sixQadc06, String sixQadc07,
			String sixQadc08, String sixQadc09, String sixQadc10,
			Integer sixQadi01, Integer sixQadi02, Integer sixQadi03,
			Integer sixQadi04, Integer sixQadi05, Double sixQadd01,
			Double sixQadd02, Double sixQadd03, Double sixQadd04,
			Double sixQadd05, Boolean sixQadl01, Boolean sixQadl02,
			Boolean sixQadl03, Boolean sixQadl04, Boolean sixQadl05,
			Date sixQadt01, Date sixQadt02, Date sixQadt03, Date sixQadt04,
			Date sixQadt05, Double sixAmtAppld, String sixModelyr,
			String sixCustref, Double oidSixRef) {
		super(id, sixType, sixOrder, sixLine, sixSite, sixShip, sixCust,
				sixBill, sixPart, sixSopart, sixQty, sixUm, sixPrice, sixAmt,
				sixCurr, sixShipId, sixAuthorization, sixPo, sixShipdt,
				sixInvNbr, sixQtyPaid, sixAmtPaid, sixClosed, sixModUserid,
				sixModDate, sixUser1, sixUser2, sixUser3, sixUser4, sixUser5,
				sixQadc01, sixQadc02, sixQadc03, sixQadc04, sixQadc05,
				sixQadc06, sixQadc07, sixQadc08, sixQadc09, sixQadc10,
				sixQadi01, sixQadi02, sixQadi03, sixQadi04, sixQadi05,
				sixQadd01, sixQadd02, sixQadd03, sixQadd04, sixQadd05,
				sixQadl01, sixQadl02, sixQadl03, sixQadl04, sixQadl05,
				sixQadt01, sixQadt02, sixQadt03, sixQadt04, sixQadt05,
				sixAmtAppld, sixModelyr, sixCustref, oidSixRef);
	}

}
