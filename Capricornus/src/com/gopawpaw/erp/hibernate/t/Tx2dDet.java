package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * Tx2dDet entity. @author MyEclipse Persistence Tools
 */
public class Tx2dDet extends AbstractTx2dDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tx2dDet() {
	}

	/** minimal constructor */
	public Tx2dDet(Tx2dDetId id, Date tx2dEffdate, String tx2dQadd01,
			String tx2dQadd02, Double tx2dTotamt, Double tx2dTottax,
			Boolean tx2dRcptTaxPoint, Boolean tx2dTaxIn, Boolean tx2dByLine,
			Double tx2dCurTaxAmt, Double tx2dTaxAmt, Double tx2dEntTaxAmt,
			Double tx2dCurNontaxAmt, Double tx2dNontaxAmt,
			Double tx2dEntNontaxAmt, Double tx2dTaxableAmt,
			Double tx2dCurRecovAmt, Double tx2dRecovAmt,
			Double tx2dEntRecovAmt, Double tx2dCurAbsRetAmt,
			Double tx2dAbsRetAmt, Double tx2dEntAbsRetAmt,
			Boolean tx2dUsageTaxPoint, Double oidTx2dDet) {
		super(id, tx2dEffdate, tx2dQadd01, tx2dQadd02, tx2dTotamt, tx2dTottax,
				tx2dRcptTaxPoint, tx2dTaxIn, tx2dByLine, tx2dCurTaxAmt,
				tx2dTaxAmt, tx2dEntTaxAmt, tx2dCurNontaxAmt, tx2dNontaxAmt,
				tx2dEntNontaxAmt, tx2dTaxableAmt, tx2dCurRecovAmt,
				tx2dRecovAmt, tx2dEntRecovAmt, tx2dCurAbsRetAmt, tx2dAbsRetAmt,
				tx2dEntAbsRetAmt, tx2dUsageTaxPoint, oidTx2dDet);
	}

	/** full constructor */
	public Tx2dDet(Tx2dDetId id, Date tx2dEffdate, String tx2dQadd01,
			String tx2dQadd02, Double tx2dTotamt, Double tx2dTottax,
			String tx2dUser1, String tx2dUser2, String tx2dQad01,
			String tx2dQad02, Boolean tx2dEdited, String tx2dCurr,
			Double tx2dDec01, Date tx2dDte01, Boolean tx2dLog01,
			Double tx2dQad04, Date tx2dPostedDate, String tx2dChr01,
			String tx2dChr02, Double tx2dDec02, Boolean tx2dRcptTaxPoint,
			String tx2dCarrier, String tx2dTaxEnv, String tx2dZoneFrom,
			String tx2dZoneTo, String tx2dTaxType, String tx2dTransEnt,
			String tx2dLineSiteEnt, String tx2dTaxc, String tx2dTaxUsage,
			Boolean tx2dTaxIn, Boolean tx2dByLine, Double tx2dCurTaxAmt,
			Double tx2dTaxAmt, Double tx2dEntTaxAmt, Double tx2dCurNontaxAmt,
			Double tx2dNontaxAmt, Double tx2dEntNontaxAmt,
			Double tx2dTaxableAmt, Double tx2dCurRecovAmt, Double tx2dRecovAmt,
			Double tx2dEntRecovAmt, Double tx2dCurAbsRetAmt,
			Double tx2dAbsRetAmt, Double tx2dEntAbsRetAmt, Boolean tx2dQad03,
			Date tx2dQad05, Boolean tx2dUsageTaxPoint, Double oidTx2dDet) {
		super(id, tx2dEffdate, tx2dQadd01, tx2dQadd02, tx2dTotamt, tx2dTottax,
				tx2dUser1, tx2dUser2, tx2dQad01, tx2dQad02, tx2dEdited,
				tx2dCurr, tx2dDec01, tx2dDte01, tx2dLog01, tx2dQad04,
				tx2dPostedDate, tx2dChr01, tx2dChr02, tx2dDec02,
				tx2dRcptTaxPoint, tx2dCarrier, tx2dTaxEnv, tx2dZoneFrom,
				tx2dZoneTo, tx2dTaxType, tx2dTransEnt, tx2dLineSiteEnt,
				tx2dTaxc, tx2dTaxUsage, tx2dTaxIn, tx2dByLine, tx2dCurTaxAmt,
				tx2dTaxAmt, tx2dEntTaxAmt, tx2dCurNontaxAmt, tx2dNontaxAmt,
				tx2dEntNontaxAmt, tx2dTaxableAmt, tx2dCurRecovAmt,
				tx2dRecovAmt, tx2dEntRecovAmt, tx2dCurAbsRetAmt, tx2dAbsRetAmt,
				tx2dEntAbsRetAmt, tx2dQad03, tx2dQad05, tx2dUsageTaxPoint,
				oidTx2dDet);
	}

}
