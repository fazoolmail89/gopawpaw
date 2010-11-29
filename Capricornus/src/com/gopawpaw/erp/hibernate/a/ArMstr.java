package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ArMstr entity. @author MyEclipse Persistence Tools
 */
public class ArMstr extends AbstractArMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArMstr() {
	}

	/** minimal constructor */
	public ArMstr(ArMstrId id, Boolean arDrftSel, String arCollMthd,
			Double arAmtChg, Double arDiscChg, Double arBaseAmt,
			String arDyCode, Integer arDunLevel, Double arExRate2,
			String arExRatetype, Double arBaseAmtChg, Double arBaseApplied,
			String arBaseCommAmt, Integer arExruSeq, String arDdCurr,
			Double arDdExRate, Double arDdExRate2, Integer arDdExruSeq,
			Boolean arPrepayment, String arCustomerBank, String arStatus,
			Boolean arCustomerInitiated, String arPayMethod, Double oidArMstr) {
		super(id, arDrftSel, arCollMthd, arAmtChg, arDiscChg, arBaseAmt,
				arDyCode, arDunLevel, arExRate2, arExRatetype, arBaseAmtChg,
				arBaseApplied, arBaseCommAmt, arExruSeq, arDdCurr, arDdExRate,
				arDdExRate2, arDdExruSeq, arPrepayment, arCustomerBank,
				arStatus, arCustomerInitiated, arPayMethod, oidArMstr);
	}

	/** full constructor */
	public ArMstr(ArMstrId id, String arType, String arCust, String arSoNbr,
			String arXcommPct, Date arEffdate, Date arDate, String arCrTerms,
			String arPo, Double arAmt, Double arApplied, Date arDiscDate,
			Date arDueDate, Date arExptDate, String arAcct, String arCc,
			Double arSalesAmt, String arXslspsn1, String arXslspsn2,
			Date arPaidDate, String arBatch, String arDiscAcct,
			String arDiscCc, String arShip, Boolean arOpen,
			Boolean arContested, String arCheck, Integer arCmtindx,
			String arUser1, String arUser2, String arCurr, Double arExRate,
			String arVarAcct, String arVarCc, String arBank, Double arMrgnAmt,
			String arEntity, Double arEntEx, String arChr01, String arChr02,
			String arChr03, String arChr04, String arChr05, Date arDte01,
			Date arDte02, Double arDec01, Double arDec02, Boolean arLog01,
			Boolean arDraft, Date arLdueDate, Boolean arPrint, String arInvCr,
			String arFrTerms, String arSlspsn, Date arTaxDate,
			String arCommPct, String arBill, String arTaxEnv, String arQad01,
			String arQad02, Boolean arQad03, Boolean arDrftSel,
			String arCollMthd, Double arAmtChg, Double arDiscChg,
			Double arBaseAmt, String arFsmType, String arCommAmt,
			String arDyCode, Integer arDunLevel, Double arExRate2,
			String arExRatetype, Double arBaseAmtChg, Double arBaseApplied,
			String arBaseCommAmt, Integer arExruSeq, String arDdCurr,
			Double arDdExRate, Double arDdExRate2, Integer arDdExruSeq,
			String arAppOwner, String arSub, String arDiscSub, String arVarSub,
			Boolean arPrepayment, String arShipfrom, String arCustomerBank,
			Date arDraftDiscDate, Date arReconDate, String arStatus,
			Boolean arCustomerInitiated, Date arDraftSubmitDate,
			String arPayMethod, Date arVoidDate, Double oidArMstr) {
		super(id, arType, arCust, arSoNbr, arXcommPct, arEffdate, arDate,
				arCrTerms, arPo, arAmt, arApplied, arDiscDate, arDueDate,
				arExptDate, arAcct, arCc, arSalesAmt, arXslspsn1, arXslspsn2,
				arPaidDate, arBatch, arDiscAcct, arDiscCc, arShip, arOpen,
				arContested, arCheck, arCmtindx, arUser1, arUser2, arCurr,
				arExRate, arVarAcct, arVarCc, arBank, arMrgnAmt, arEntity,
				arEntEx, arChr01, arChr02, arChr03, arChr04, arChr05, arDte01,
				arDte02, arDec01, arDec02, arLog01, arDraft, arLdueDate,
				arPrint, arInvCr, arFrTerms, arSlspsn, arTaxDate, arCommPct,
				arBill, arTaxEnv, arQad01, arQad02, arQad03, arDrftSel,
				arCollMthd, arAmtChg, arDiscChg, arBaseAmt, arFsmType,
				arCommAmt, arDyCode, arDunLevel, arExRate2, arExRatetype,
				arBaseAmtChg, arBaseApplied, arBaseCommAmt, arExruSeq,
				arDdCurr, arDdExRate, arDdExRate2, arDdExruSeq, arAppOwner,
				arSub, arDiscSub, arVarSub, arPrepayment, arShipfrom,
				arCustomerBank, arDraftDiscDate, arReconDate, arStatus,
				arCustomerInitiated, arDraftSubmitDate, arPayMethod,
				arVoidDate, oidArMstr);
	}

}
