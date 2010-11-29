package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SfhHist entity. @author MyEclipse Persistence Tools
 */
public class SfhHist extends AbstractSfhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SfhHist() {
	}

	/** minimal constructor */
	public SfhHist(SfhHistId id, Boolean sfhPriceOnInv, Boolean sfhQtyOnInv,
			Double oidSfhHist) {
		super(id, sfhPriceOnInv, sfhQtyOnInv, oidSfhHist);
	}

	/** full constructor */
	public SfhHist(SfhHistId id, Integer sfhCmtindx, Double sfhCoveredAmt,
			String sfhDesc, Integer sfhFisColumn, String sfhFisSort,
			String sfhFscCode, Integer sfhLine, String sfhNbr, Integer sfhOp,
			String sfhPart, Double sfhPrice, Integer sfhPtType,
			Double sfhQtyBilled, Double sfhQtyInv, Double sfhQtyReq,
			String sfhSerial, Integer sfhSoLine, Double sfhTotalStd,
			String sfhChr01, String sfhChr02, String sfhChr03, String sfhChr04,
			Double sfhDec01, Double sfhDec02, Double sfhDec03, Date sfhDte01,
			Date sfhDte02, Date sfhDte03, Boolean sfhLog01, Boolean sfhLog02,
			Boolean sfhLog03, String sfhQadc01, String sfhQadc02,
			String sfhQadc03, String sfhQadc04, Date sfhQadd01, Date sfhQadd02,
			Date sfhQadd03, Double sfhQadde01, Double sfhQadde02,
			Double sfhQadde03, Boolean sfhQadl01, Boolean sfhQadl02,
			Boolean sfhExchange, String sfhFcgCode, Double sfhQtyRet,
			Double sfhExgPrice, String sfhUm, Boolean sfhDetail,
			Double sfhFixedCost, Double sfhFixedPrice, Double sfhInvoiceCost,
			Date sfhCaOpnDate, String sfhInvNbr, String sfhUser1,
			String sfhUser2, Date sfhModDate, String sfhModUserid,
			String sfhReport, String sfhRetSerial, String sfhTaxc,
			String sfhTaxUsage, Boolean sfhTaxable, Boolean sfhTaxIn,
			String sfhTaxEnv, Boolean sfhPst, Boolean sfhQadl03,
			Boolean sfhQadl04, Boolean sfhPriceOnInv, Boolean sfhQtyOnInv,
			Double oidSfhHist) {
		super(id, sfhCmtindx, sfhCoveredAmt, sfhDesc, sfhFisColumn, sfhFisSort,
				sfhFscCode, sfhLine, sfhNbr, sfhOp, sfhPart, sfhPrice,
				sfhPtType, sfhQtyBilled, sfhQtyInv, sfhQtyReq, sfhSerial,
				sfhSoLine, sfhTotalStd, sfhChr01, sfhChr02, sfhChr03, sfhChr04,
				sfhDec01, sfhDec02, sfhDec03, sfhDte01, sfhDte02, sfhDte03,
				sfhLog01, sfhLog02, sfhLog03, sfhQadc01, sfhQadc02, sfhQadc03,
				sfhQadc04, sfhQadd01, sfhQadd02, sfhQadd03, sfhQadde01,
				sfhQadde02, sfhQadde03, sfhQadl01, sfhQadl02, sfhExchange,
				sfhFcgCode, sfhQtyRet, sfhExgPrice, sfhUm, sfhDetail,
				sfhFixedCost, sfhFixedPrice, sfhInvoiceCost, sfhCaOpnDate,
				sfhInvNbr, sfhUser1, sfhUser2, sfhModDate, sfhModUserid,
				sfhReport, sfhRetSerial, sfhTaxc, sfhTaxUsage, sfhTaxable,
				sfhTaxIn, sfhTaxEnv, sfhPst, sfhQadl03, sfhQadl04,
				sfhPriceOnInv, sfhQtyOnInv, oidSfhHist);
	}

}
