package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SadDet entity. @author MyEclipse Persistence Tools
 */
public class SadDet extends AbstractSadDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SadDet() {
	}

	/** minimal constructor */
	public SadDet(SadDetId id, String sadEsNbr, Boolean sadAccrued,
			String sadLineType, Integer sadUiLine, Integer sadParentLine,
			String sadCust, String sadBillTo, Boolean sadBlanketEu,
			String sadSoNbr, Boolean sadAutorenew, String sadPo,
			String sadCurr, Integer sadExruSeq, Double sadExRate,
			Double sadExRate2, String sadExRatetype, Boolean sadFixRate,
			Boolean sadReleased, String sadRenewedTo, Double oidSadDet) {
		super(id, sadEsNbr, sadAccrued, sadLineType, sadUiLine, sadParentLine,
				sadCust, sadBillTo, sadBlanketEu, sadSoNbr, sadAutorenew,
				sadPo, sadCurr, sadExruSeq, sadExRate, sadExRate2,
				sadExRatetype, sadFixRate, sadReleased, sadRenewedTo, oidSadDet);
	}

	/** full constructor */
	public SadDet(SadDetId id, Date sadEndDate, Date sadPerDate,
			Date sadStDate, String sadSvCode, Double sadQtyItem,
			Double sadQtyBld, String sadType, Double sadPrice,
			Double sadStdCost, Double sadQtyChg, String sadAcct,
			Boolean sadTaxable, String sadSerial, String sadDesc, String sadUm,
			String sadCc, String sadComment, Double sadUmConv,
			Double sadDiscPct, String sadProject, Integer sadCmtindx,
			String sadCustpart, String sadStatus, String sadXslspsn,
			String sadXcommPct, String sadUser1, String sadUser2,
			Date sadExpire, String sadTaxc, String sadProdline,
			Boolean sadTaxIn, Boolean sadFstList, Boolean sadPst,
			String sadChr01, String sadChr02, String sadChr03, String sadChr04,
			String sadChr05, String sadChr06, String sadChr07, String sadChr08,
			String sadChr09, String sadChr10, Date sadDte01, Date sadDte02,
			Double sadDec01, Double sadDec02, Boolean sadLog01, String sadFor,
			Double sadListPr, String sadDscAcct, String sadDscCc,
			String sadPrList, Double sadQtyLst, Date sadLstcover,
			Date sadLastbill, Integer sadRef, Date sadStCover,
			Double sadQtyPer, Date sadNxtBill, Double sadQtyLitm,
			Date sadLstBill, String sadCycle, Date sadCancel, String sadCaNbr,
			String sadEuNbr, String sadPvmBom, String sadPvmRoute,
			String sadSite, Double sadVisits, String sadAmtType,
			String sadPctType, Integer sadPriority, String sadArea,
			String sadQadc05, String sadQadc06, Boolean sadDiscount,
			String sadEsNbr, Integer sadSodLine, String sadSoShip,
			Boolean sadPvmBill, Boolean sadPvmOnly, Integer sadSoShipln,
			String sadTaxEnv, String sadTaxUsage, Double sadCrtInt,
			Boolean sadFixPr, Date sadPricingDt, Double sadTotalBld,
			String sadSlspsn, String sadQadc01, String sadQadc02,
			String sadQadc03, String sadQadc04, Date sadQadt01, Date sadQadt02,
			Date sadQadt03, Double sadQadd01, Double sadQadd02,
			Double sadQadd03, Boolean sadPrlistFnd, Boolean sadQadl02,
			Boolean sadQadl03, Boolean sadMrp, String sadModUserid,
			Date sadModDate, String sadCommPct, Boolean sadQadl01,
			String sadSub, String sadDscSub, String sadDscProject,
			Boolean sadAccrued, String sadLineType, Integer sadUiLine,
			Integer sadParentLine, String sadCust, String sadBillTo,
			Boolean sadBlanketEu, String sadSoNbr, Boolean sadAutorenew,
			String sadPo, String sadCurr, Integer sadExruSeq, Double sadExRate,
			Double sadExRate2, String sadExRatetype, Boolean sadFixRate,
			Boolean sadReleased, String sadRenewedTo, Double oidSadDet) {
		super(id, sadEndDate, sadPerDate, sadStDate, sadSvCode, sadQtyItem,
				sadQtyBld, sadType, sadPrice, sadStdCost, sadQtyChg, sadAcct,
				sadTaxable, sadSerial, sadDesc, sadUm, sadCc, sadComment,
				sadUmConv, sadDiscPct, sadProject, sadCmtindx, sadCustpart,
				sadStatus, sadXslspsn, sadXcommPct, sadUser1, sadUser2,
				sadExpire, sadTaxc, sadProdline, sadTaxIn, sadFstList, sadPst,
				sadChr01, sadChr02, sadChr03, sadChr04, sadChr05, sadChr06,
				sadChr07, sadChr08, sadChr09, sadChr10, sadDte01, sadDte02,
				sadDec01, sadDec02, sadLog01, sadFor, sadListPr, sadDscAcct,
				sadDscCc, sadPrList, sadQtyLst, sadLstcover, sadLastbill,
				sadRef, sadStCover, sadQtyPer, sadNxtBill, sadQtyLitm,
				sadLstBill, sadCycle, sadCancel, sadCaNbr, sadEuNbr, sadPvmBom,
				sadPvmRoute, sadSite, sadVisits, sadAmtType, sadPctType,
				sadPriority, sadArea, sadQadc05, sadQadc06, sadDiscount,
				sadEsNbr, sadSodLine, sadSoShip, sadPvmBill, sadPvmOnly,
				sadSoShipln, sadTaxEnv, sadTaxUsage, sadCrtInt, sadFixPr,
				sadPricingDt, sadTotalBld, sadSlspsn, sadQadc01, sadQadc02,
				sadQadc03, sadQadc04, sadQadt01, sadQadt02, sadQadt03,
				sadQadd01, sadQadd02, sadQadd03, sadPrlistFnd, sadQadl02,
				sadQadl03, sadMrp, sadModUserid, sadModDate, sadCommPct,
				sadQadl01, sadSub, sadDscSub, sadDscProject, sadAccrued,
				sadLineType, sadUiLine, sadParentLine, sadCust, sadBillTo,
				sadBlanketEu, sadSoNbr, sadAutorenew, sadPo, sadCurr,
				sadExruSeq, sadExRate, sadExRate2, sadExRatetype, sadFixRate,
				sadReleased, sadRenewedTo, oidSadDet);
	}

}
