package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WtxMstr entity. @author MyEclipse Persistence Tools
 */
public class WtxMstr extends AbstractWtxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WtxMstr() {
	}

	/** minimal constructor */
	public WtxMstr(WtxMstrId id, String wtxAcct, String wtxCc,
			Boolean wtxChargeType, Double wtxChargeAmt, String wtxInvoice,
			String wtxModUserid, Date wtxModDate, Boolean wtxPrinted,
			Double wtxRetAmt, String wtxRsnCode, String wtxSub,
			Double wtxTaxableAmt, Double wtxTaxPct, Double wtxTotAmt,
			Double wtxTotPaid, Double wtxVatAmt, Date wtxVoDate,
			Double wtxWtAmt, String wtxUser1, String wtxUser2,
			String wtxUserc03, String wtxUserc04, String wtxUserc05,
			Double wtxUserd01, Double wtxUserd02, Integer wtxUseri01,
			Integer wtxUseri02, Boolean wtxUserl01, Boolean wtxUserl02,
			String wtxQadc01, String wtxQadc02, String wtxQadc03,
			String wtxQadc04, String wtxQadc05, Double wtxQadd01,
			Double wtxQadd02, Integer wtxQadi01, Integer wtxQadi02,
			Boolean wtxQadl01, Boolean wtxQadl02, Double oidWtxMstr) {
		super(id, wtxAcct, wtxCc, wtxChargeType, wtxChargeAmt, wtxInvoice,
				wtxModUserid, wtxModDate, wtxPrinted, wtxRetAmt, wtxRsnCode,
				wtxSub, wtxTaxableAmt, wtxTaxPct, wtxTotAmt, wtxTotPaid,
				wtxVatAmt, wtxVoDate, wtxWtAmt, wtxUser1, wtxUser2, wtxUserc03,
				wtxUserc04, wtxUserc05, wtxUserd01, wtxUserd02, wtxUseri01,
				wtxUseri02, wtxUserl01, wtxUserl02, wtxQadc01, wtxQadc02,
				wtxQadc03, wtxQadc04, wtxQadc05, wtxQadd01, wtxQadd02,
				wtxQadi01, wtxQadi02, wtxQadl01, wtxQadl02, oidWtxMstr);
	}

	/** full constructor */
	public WtxMstr(WtxMstrId id, String wtxAcct, String wtxCc,
			Boolean wtxChargeType, Double wtxChargeAmt, String wtxInvoice,
			String wtxModUserid, Date wtxModDate, Boolean wtxPrinted,
			Double wtxRetAmt, String wtxRsnCode, Date wtxSetDate,
			String wtxSub, Double wtxTaxableAmt, Double wtxTaxPct,
			Double wtxTotAmt, Double wtxTotPaid, Double wtxVatAmt,
			Date wtxVoDate, Double wtxWtAmt, String wtxUser1, String wtxUser2,
			String wtxUserc03, String wtxUserc04, String wtxUserc05,
			Double wtxUserd01, Double wtxUserd02, Integer wtxUseri01,
			Integer wtxUseri02, Boolean wtxUserl01, Boolean wtxUserl02,
			Date wtxUsert01, Date wtxUsert02, String wtxQadc01,
			String wtxQadc02, String wtxQadc03, String wtxQadc04,
			String wtxQadc05, Double wtxQadd01, Double wtxQadd02,
			Integer wtxQadi01, Integer wtxQadi02, Boolean wtxQadl01,
			Boolean wtxQadl02, Date wtxQadt01, Date wtxQadt02,
			Date wtxPaidDate, Double oidWtxMstr) {
		super(id, wtxAcct, wtxCc, wtxChargeType, wtxChargeAmt, wtxInvoice,
				wtxModUserid, wtxModDate, wtxPrinted, wtxRetAmt, wtxRsnCode,
				wtxSetDate, wtxSub, wtxTaxableAmt, wtxTaxPct, wtxTotAmt,
				wtxTotPaid, wtxVatAmt, wtxVoDate, wtxWtAmt, wtxUser1, wtxUser2,
				wtxUserc03, wtxUserc04, wtxUserc05, wtxUserd01, wtxUserd02,
				wtxUseri01, wtxUseri02, wtxUserl01, wtxUserl02, wtxUsert01,
				wtxUsert02, wtxQadc01, wtxQadc02, wtxQadc03, wtxQadc04,
				wtxQadc05, wtxQadd01, wtxQadd02, wtxQadi01, wtxQadi02,
				wtxQadl01, wtxQadl02, wtxQadt01, wtxQadt02, wtxPaidDate,
				oidWtxMstr);
	}

}
