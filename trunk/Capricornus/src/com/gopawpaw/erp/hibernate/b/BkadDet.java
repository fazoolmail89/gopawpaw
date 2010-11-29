package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkadDet entity. @author MyEclipse Persistence Tools
 */
public class BkadDet extends AbstractBkadDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkadDet() {
	}

	/** minimal constructor */
	public BkadDet(BkadDetId id, String bkadBank, String bkadPayMethod,
			String bkadModule, String bkadAddr, Integer bkadPaymentNbr,
			String bkadRef, Boolean bkadProcessed, Double bkadAmtChg,
			Double bkadDiscChg, String bkadUser1, String bkadUser2,
			String bkadUserc03, String bkadUserc04, Boolean bkadUserl01,
			Boolean bkadUserl02, String bkadQadc01, String bkadQadc02,
			String bkadCurr, Integer bkadSeq, Date bkadModDate,
			String bkadModUserid, String bkadUserc05, Double bkadUserd01,
			Double bkadUserd02, Integer bkadUseri01, Integer bkadUseri02,
			String bkadQadc03, String bkadQadc04, String bkadQadc05,
			Double bkadQadd01, Double bkadQadd02, Integer bkadQadi01,
			Integer bkadQadi02, Boolean bkadQadl01, Boolean bkadQadl02,
			Double oidBkadDet) {
		super(id, bkadBank, bkadPayMethod, bkadModule, bkadAddr,
				bkadPaymentNbr, bkadRef, bkadProcessed, bkadAmtChg,
				bkadDiscChg, bkadUser1, bkadUser2, bkadUserc03, bkadUserc04,
				bkadUserl01, bkadUserl02, bkadQadc01, bkadQadc02, bkadCurr,
				bkadSeq, bkadModDate, bkadModUserid, bkadUserc05, bkadUserd01,
				bkadUserd02, bkadUseri01, bkadUseri02, bkadQadc03, bkadQadc04,
				bkadQadc05, bkadQadd01, bkadQadd02, bkadQadi01, bkadQadi02,
				bkadQadl01, bkadQadl02, oidBkadDet);
	}

	/** full constructor */
	public BkadDet(BkadDetId id, String bkadBank, String bkadPayMethod,
			String bkadModule, String bkadAddr, Integer bkadPaymentNbr,
			String bkadRef, Boolean bkadProcessed, Double bkadAmtChg,
			Double bkadDiscChg, String bkadUser1, String bkadUser2,
			String bkadUserc03, String bkadUserc04, Date bkadUsert01,
			Date bkadUsert02, Boolean bkadUserl01, Boolean bkadUserl02,
			String bkadQadc01, String bkadQadc02, String bkadCurr,
			Integer bkadSeq, Date bkadModDate, String bkadModUserid,
			String bkadUserc05, Double bkadUserd01, Double bkadUserd02,
			Integer bkadUseri01, Integer bkadUseri02, String bkadQadc03,
			String bkadQadc04, String bkadQadc05, Double bkadQadd01,
			Double bkadQadd02, Integer bkadQadi01, Integer bkadQadi02,
			Boolean bkadQadl01, Boolean bkadQadl02, Date bkadQadt01,
			Date bkadQadt02, Double oidBkadDet) {
		super(id, bkadBank, bkadPayMethod, bkadModule, bkadAddr,
				bkadPaymentNbr, bkadRef, bkadProcessed, bkadAmtChg,
				bkadDiscChg, bkadUser1, bkadUser2, bkadUserc03, bkadUserc04,
				bkadUsert01, bkadUsert02, bkadUserl01, bkadUserl02, bkadQadc01,
				bkadQadc02, bkadCurr, bkadSeq, bkadModDate, bkadModUserid,
				bkadUserc05, bkadUserd01, bkadUserd02, bkadUseri01,
				bkadUseri02, bkadQadc03, bkadQadc04, bkadQadc05, bkadQadd01,
				bkadQadd02, bkadQadi01, bkadQadi02, bkadQadl01, bkadQadl02,
				bkadQadt01, bkadQadt02, oidBkadDet);
	}

}
