package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TxhdDet entity. @author MyEclipse Persistence Tools
 */
public class TxhdDet extends AbstractTxhdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxhdDet() {
	}

	/** minimal constructor */
	public TxhdDet(TxhdDetId id, Boolean txhdPosted, String txhdTrType,
			String txhdRef, Integer txhdLine, Boolean txhdEditHist,
			Boolean txhdVatSlIn, Boolean txhdTdStatIn, Boolean txhdProcInd,
			Boolean txhdFlowIn, String txhdNbr, String txhdTrl,
			String txhdTaxCode, Double oidTxhdDet) {
		super(id, txhdPosted, txhdTrType, txhdRef, txhdLine, txhdEditHist,
				txhdVatSlIn, txhdTdStatIn, txhdProcInd, txhdFlowIn, txhdNbr,
				txhdTrl, txhdTaxCode, oidTxhdDet);
	}

	/** full constructor */
	public TxhdDet(TxhdDetId id, Boolean txhdPosted, String txhdTrType,
			String txhdRef, Integer txhdLine, Boolean txhdEditHist,
			String txhdSite, String txhdTaxCtry, String txhdTaxNbr,
			Date txhdEffdate, String txhdProgram, String txhdTransRef,
			Boolean txhdVatSlIn, Boolean txhdTdStatIn, Date txhdEnterDate,
			String txhdUserId, Date txhdChgDate, String txhdUsrIdChg,
			Date txhdVatSlDate, Date txhdStatSubmit, Date txhdDbExport,
			String txhdCustNum, String txhdCustCtry, Double txhdVatValue,
			Boolean txhdProcInd, Boolean txhdFlowIn, String txhdCommCode,
			String txhdDelTerms, String txhdTaxUsage, String txhdDesdisCtry,
			String txhdTranMode, String txhdOrigCtry, String txhdDesdisPort,
			String txhdTranshPort, String txhdStatProc, String txhdContainer,
			String txhdTaric, Double txhdInvValue, Double txhdStatValue,
			Integer txhdNetWt, Integer txhdSupplUnit, String txhdQad01,
			String txhdQad02, Boolean txhdQad03, String txhdUser1,
			String txhdUser2, String txhdFiscalClass, String txhdNbr,
			String txhdTrl, String txhdTaxCode, String txhdCurr,
			Double txhdDec01, Double txhdDec02, Date txhdDte01,
			Boolean txhdLog01, Double txhdQad04, Double txhdQad05,
			Date txhdQad06, String txhdChr01, String txhdChr02,
			Double oidTxhdDet) {
		super(id, txhdPosted, txhdTrType, txhdRef, txhdLine, txhdEditHist,
				txhdSite, txhdTaxCtry, txhdTaxNbr, txhdEffdate, txhdProgram,
				txhdTransRef, txhdVatSlIn, txhdTdStatIn, txhdEnterDate,
				txhdUserId, txhdChgDate, txhdUsrIdChg, txhdVatSlDate,
				txhdStatSubmit, txhdDbExport, txhdCustNum, txhdCustCtry,
				txhdVatValue, txhdProcInd, txhdFlowIn, txhdCommCode,
				txhdDelTerms, txhdTaxUsage, txhdDesdisCtry, txhdTranMode,
				txhdOrigCtry, txhdDesdisPort, txhdTranshPort, txhdStatProc,
				txhdContainer, txhdTaric, txhdInvValue, txhdStatValue,
				txhdNetWt, txhdSupplUnit, txhdQad01, txhdQad02, txhdQad03,
				txhdUser1, txhdUser2, txhdFiscalClass, txhdNbr, txhdTrl,
				txhdTaxCode, txhdCurr, txhdDec01, txhdDec02, txhdDte01,
				txhdLog01, txhdQad04, txhdQad05, txhdQad06, txhdChr01,
				txhdChr02, oidTxhdDet);
	}

}
