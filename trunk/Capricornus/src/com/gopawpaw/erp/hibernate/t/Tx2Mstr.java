package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * Tx2Mstr entity. @author MyEclipse Persistence Tools
 */
public class Tx2Mstr extends AbstractTx2Mstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tx2Mstr() {
	}

	/** minimal constructor */
	public Tx2Mstr(Tx2MstrId id, Double tx2TaxPct, Boolean tx2TrlTaxable,
			Date tx2Effdate, Double tx2Max, String tx2TaxType,
			String tx2Method, String tx2PtTaxc, String tx2TaxUsage,
			Double tx2Min, String tx2Base, Boolean tx2ByLine,
			Boolean tx2InvDisc, Boolean tx2PmtDisc, Boolean tx2UpdateTax,
			Boolean tx2RcptTaxPoint, String tx2ArAcct, String tx2ArCc,
			String tx2AraAcct, String tx2AraCc, Boolean tx2AraUse,
			String tx2ApAcct, String tx2ApCc, String tx2AprAcct,
			String tx2AprCc, Boolean tx2AprUse, Boolean tx2TaxIn,
			Boolean tx2EcSalesList, Boolean tx2EcProcessWork,
			String tx2ApDiscAcct, String tx2ApDiscCc, String tx2ApDiscSub,
			String tx2ArDiscAcct, String tx2ArDiscCc, String tx2ArDiscSub,
			String tx2Group, String tx2StxAcct, String tx2StxCc,
			String tx2StxSub, String tx2Register, Boolean tx2UsageTaxPoint,
			Double oidTx2Mstr) {
		super(id, tx2TaxPct, tx2TrlTaxable, tx2Effdate, tx2Max, tx2TaxType,
				tx2Method, tx2PtTaxc, tx2TaxUsage, tx2Min, tx2Base, tx2ByLine,
				tx2InvDisc, tx2PmtDisc, tx2UpdateTax, tx2RcptTaxPoint,
				tx2ArAcct, tx2ArCc, tx2AraAcct, tx2AraCc, tx2AraUse, tx2ApAcct,
				tx2ApCc, tx2AprAcct, tx2AprCc, tx2AprUse, tx2TaxIn,
				tx2EcSalesList, tx2EcProcessWork, tx2ApDiscAcct, tx2ApDiscCc,
				tx2ApDiscSub, tx2ArDiscAcct, tx2ArDiscCc, tx2ArDiscSub,
				tx2Group, tx2StxAcct, tx2StxCc, tx2StxSub, tx2Register,
				tx2UsageTaxPoint, oidTx2Mstr);
	}

	/** full constructor */
	public Tx2Mstr(Tx2MstrId id, Double tx2TaxPct, String tx2Qadc01,
			String tx2Qadc02, Boolean tx2TrlTaxable, String tx2User1,
			String tx2User2, Date tx2Effdate, Double tx2Max, String tx2Userid,
			Date tx2ModDate, String tx2TaxType, String tx2Method,
			String tx2PtTaxc, String tx2TaxUsage, String tx2Desc,
			Double tx2Min, String tx2Base, Double tx2PctRecv, String tx2Qad01,
			String tx2Qad02, Boolean tx2Qad03, Boolean tx2ByLine,
			Integer tx2Cmtindx, String tx2Chr01, String tx2Chr02,
			Double tx2Dec01, Double tx2Dec02, String tx2Curr, Double tx2Qad04,
			Date tx2Qad05, Boolean tx2Log01, Date tx2Dte01, Boolean tx2InvDisc,
			Boolean tx2PmtDisc, Boolean tx2UpdateTax, Boolean tx2RcptTaxPoint,
			String tx2ArAcct, String tx2ArCc, String tx2AraAcct,
			String tx2AraCc, Boolean tx2AraUse, String tx2ApAcct,
			String tx2ApCc, String tx2AprAcct, String tx2AprCc,
			Boolean tx2AprUse, Boolean tx2TaxIn, Date tx2ExpDate,
			Boolean tx2EcSalesList, Boolean tx2EcProcessWork, String tx2AprSub,
			String tx2ApSub, String tx2AraSub, String tx2ArSub,
			String tx2ApDiscAcct, String tx2ApDiscCc, String tx2ApDiscSub,
			String tx2ArDiscAcct, String tx2ArDiscCc, String tx2ArDiscSub,
			String tx2Group, String tx2StxAcct, String tx2StxCc,
			String tx2StxSub, String tx2Register, Boolean tx2UsageTaxPoint,
			Double oidTx2Mstr) {
		super(id, tx2TaxPct, tx2Qadc01, tx2Qadc02, tx2TrlTaxable, tx2User1,
				tx2User2, tx2Effdate, tx2Max, tx2Userid, tx2ModDate,
				tx2TaxType, tx2Method, tx2PtTaxc, tx2TaxUsage, tx2Desc, tx2Min,
				tx2Base, tx2PctRecv, tx2Qad01, tx2Qad02, tx2Qad03, tx2ByLine,
				tx2Cmtindx, tx2Chr01, tx2Chr02, tx2Dec01, tx2Dec02, tx2Curr,
				tx2Qad04, tx2Qad05, tx2Log01, tx2Dte01, tx2InvDisc, tx2PmtDisc,
				tx2UpdateTax, tx2RcptTaxPoint, tx2ArAcct, tx2ArCc, tx2AraAcct,
				tx2AraCc, tx2AraUse, tx2ApAcct, tx2ApCc, tx2AprAcct, tx2AprCc,
				tx2AprUse, tx2TaxIn, tx2ExpDate, tx2EcSalesList,
				tx2EcProcessWork, tx2AprSub, tx2ApSub, tx2AraSub, tx2ArSub,
				tx2ApDiscAcct, tx2ApDiscCc, tx2ApDiscSub, tx2ArDiscAcct,
				tx2ArDiscCc, tx2ArDiscSub, tx2Group, tx2StxAcct, tx2StxCc,
				tx2StxSub, tx2Register, tx2UsageTaxPoint, oidTx2Mstr);
	}

}
