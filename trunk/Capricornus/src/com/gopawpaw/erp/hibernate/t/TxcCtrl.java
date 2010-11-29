package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TxcCtrl entity. @author MyEclipse Persistence Tools
 */
public class TxcCtrl extends AbstractTxcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxcCtrl() {
	}

	/** minimal constructor */
	public TxcCtrl(Boolean txcByLine, Boolean txcInvDisc, String txcMethod,
			Boolean txcPmtDisc, Boolean txcUpdateTax, Boolean txcInvHist,
			String txcRound, Boolean txcEditHist, Boolean txcRcptTaxPoint,
			Boolean txcValVatReg, Boolean txcPrtVatReg, String txcTaxZone,
			String txcTaxEnv, Boolean txcDetrp, Boolean txcUsageTaxPoint,
			Double oidTxcCtrl) {
		super(txcByLine, txcInvDisc, txcMethod, txcPmtDisc, txcUpdateTax,
				txcInvHist, txcRound, txcEditHist, txcRcptTaxPoint,
				txcValVatReg, txcPrtVatReg, txcTaxZone, txcTaxEnv, txcDetrp,
				txcUsageTaxPoint, oidTxcCtrl);
	}

	/** full constructor */
	public TxcCtrl(Boolean txcByLine, Boolean txcInvDisc, String txcMethod,
			Boolean txcPmtDisc, Boolean txcUpdateTax, String txcUser1,
			String txcUser2, Boolean txcInvHist, String txcChr01,
			String txcChr02, Double txcDec01, Double txcDec02, Date txcDte01,
			Boolean txcLog01, String txcQad01, String txcQad02,
			Boolean txcQad03, Double txcQad04, Date txcQad05, String txcRound,
			String txcCtryCode, Integer txcIndex1, Boolean txcEditHist,
			String txcTaxCode, Boolean txcRcptTaxPoint, Boolean txcValVatReg,
			Boolean txcPrtVatReg, String txcTaxZone, String txcTaxEnv,
			Boolean txcDetrp, Boolean txcUsageTaxPoint, Double oidTxcCtrl) {
		super(txcByLine, txcInvDisc, txcMethod, txcPmtDisc, txcUpdateTax,
				txcUser1, txcUser2, txcInvHist, txcChr01, txcChr02, txcDec01,
				txcDec02, txcDte01, txcLog01, txcQad01, txcQad02, txcQad03,
				txcQad04, txcQad05, txcRound, txcCtryCode, txcIndex1,
				txcEditHist, txcTaxCode, txcRcptTaxPoint, txcValVatReg,
				txcPrtVatReg, txcTaxZone, txcTaxEnv, txcDetrp,
				txcUsageTaxPoint, oidTxcCtrl);
	}

}
