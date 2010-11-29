package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SfbDet entity. @author MyEclipse Persistence Tools
 */
public class SfbDet extends AbstractSfbDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SfbDet() {
	}

	/** minimal constructor */
	public SfbDet(SfbDetId id, Boolean sfbPriceOnInv, Boolean sfbQtyOnInv,
			Double oidSfbDet) {
		super(id, sfbPriceOnInv, sfbQtyOnInv, oidSfbDet);
	}

	/** full constructor */
	public SfbDet(SfbDetId id, Integer sfbCmtindx, Double sfbCoveredAmt,
			String sfbDesc, Integer sfbFisColumn, String sfbFscCode,
			Integer sfbOp, String sfbPart, Double sfbPrice,
			Double sfbQtyBilled, Double sfbQtyInv, Double sfbQtyReq,
			String sfbSerial, Double sfbTotalStd, String sfbChr01,
			String sfbChr02, String sfbChr03, String sfbChr04, Double sfbDec01,
			Double sfbDec02, Double sfbDec03, Date sfbDte01, Date sfbDte02,
			Date sfbDte03, Boolean sfbLog01, Boolean sfbLog02,
			Boolean sfbLog03, String sfbQadc01, String sfbQadc02,
			String sfbQadc03, String sfbQadc04, Date sfbQadd01, Date sfbQadd02,
			Date sfbQadd03, Double sfbQadde01, Double sfbQadde02,
			Double sfbQadde03, Boolean sfbQadl01, Boolean sfbQadl02,
			Boolean sfbExchange, String sfbFcgCode, Double sfbQtyRet,
			Double sfbExgPrice, String sfbUm, Boolean sfbDetail,
			Double sfbFixedCost, Double sfbFixedPrice, Double sfbInvoiceCost,
			Date sfbCaOpnDate, String sfbUser1, String sfbUser2,
			Date sfbModDate, String sfbModUserid, String sfbReport,
			String sfbRetSerial, String sfbTaxc, String sfbTaxUsage,
			Boolean sfbTaxable, Boolean sfbTaxIn, String sfbTaxEnv,
			Boolean sfbPst, Boolean sfbQadl03, Boolean sfbQadl04,
			Boolean sfbPriceOnInv, Boolean sfbQtyOnInv, Double oidSfbDet) {
		super(id, sfbCmtindx, sfbCoveredAmt, sfbDesc, sfbFisColumn, sfbFscCode,
				sfbOp, sfbPart, sfbPrice, sfbQtyBilled, sfbQtyInv, sfbQtyReq,
				sfbSerial, sfbTotalStd, sfbChr01, sfbChr02, sfbChr03, sfbChr04,
				sfbDec01, sfbDec02, sfbDec03, sfbDte01, sfbDte02, sfbDte03,
				sfbLog01, sfbLog02, sfbLog03, sfbQadc01, sfbQadc02, sfbQadc03,
				sfbQadc04, sfbQadd01, sfbQadd02, sfbQadd03, sfbQadde01,
				sfbQadde02, sfbQadde03, sfbQadl01, sfbQadl02, sfbExchange,
				sfbFcgCode, sfbQtyRet, sfbExgPrice, sfbUm, sfbDetail,
				sfbFixedCost, sfbFixedPrice, sfbInvoiceCost, sfbCaOpnDate,
				sfbUser1, sfbUser2, sfbModDate, sfbModUserid, sfbReport,
				sfbRetSerial, sfbTaxc, sfbTaxUsage, sfbTaxable, sfbTaxIn,
				sfbTaxEnv, sfbPst, sfbQadl03, sfbQadl04, sfbPriceOnInv,
				sfbQtyOnInv, oidSfbDet);
	}

}
