package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkpdDet entity. @author MyEclipse Persistence Tools
 */
public class BkpdDet extends AbstractBkpdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkpdDet() {
	}

	/** minimal constructor */
	public BkpdDet(BkpdDetId id, Boolean bkpdProcessed, Double bkpdAmt,
			String bkpdBkAcct, Double bkpdResaleAmt, String bkpdRef,
			String bkpdUser1, String bkpdUser2, String bkpdUserc03,
			String bkpdUserc04, Boolean bkpdUserl01, Boolean bkpdUserl02,
			String bkpdQadc01, String bkpdQadc02, String bkpdNbr,
			Boolean bkpdSeparate, String bkpdFullBkAcct, String bkpdCsBank,
			Date bkpdModDate, String bkpdModUserid, String bkpdUserc05,
			Double bkpdUserd01, Double bkpdUserd02, Integer bkpdUseri01,
			Integer bkpdUseri02, String bkpdQadc03, String bkpdQadc04,
			String bkpdQadc05, Double bkpdQadd01, Double bkpdQadd02,
			Integer bkpdQadi01, Integer bkpdQadi02, Boolean bkpdQadl01,
			Boolean bkpdQadl02, Double oidBkpdDet) {
		super(id, bkpdProcessed, bkpdAmt, bkpdBkAcct, bkpdResaleAmt, bkpdRef,
				bkpdUser1, bkpdUser2, bkpdUserc03, bkpdUserc04, bkpdUserl01,
				bkpdUserl02, bkpdQadc01, bkpdQadc02, bkpdNbr, bkpdSeparate,
				bkpdFullBkAcct, bkpdCsBank, bkpdModDate, bkpdModUserid,
				bkpdUserc05, bkpdUserd01, bkpdUserd02, bkpdUseri01,
				bkpdUseri02, bkpdQadc03, bkpdQadc04, bkpdQadc05, bkpdQadd01,
				bkpdQadd02, bkpdQadi01, bkpdQadi02, bkpdQadl01, bkpdQadl02,
				oidBkpdDet);
	}

	/** full constructor */
	public BkpdDet(BkpdDetId id, Boolean bkpdProcessed, Double bkpdAmt,
			String bkpdBkAcct, Double bkpdResaleAmt, String bkpdRef,
			String bkpdUser1, String bkpdUser2, String bkpdUserc03,
			String bkpdUserc04, Date bkpdUsert01, Date bkpdUsert02,
			Boolean bkpdUserl01, Boolean bkpdUserl02, String bkpdQadc01,
			String bkpdQadc02, String bkpdNbr, Date bkpdDueDate,
			Boolean bkpdSeparate, String bkpdFullBkAcct, String bkpdCsBank,
			Date bkpdModDate, String bkpdModUserid, String bkpdUserc05,
			Double bkpdUserd01, Double bkpdUserd02, Integer bkpdUseri01,
			Integer bkpdUseri02, String bkpdQadc03, String bkpdQadc04,
			String bkpdQadc05, Double bkpdQadd01, Double bkpdQadd02,
			Integer bkpdQadi01, Integer bkpdQadi02, Boolean bkpdQadl01,
			Boolean bkpdQadl02, Date bkpdQadt01, Date bkpdQadt02,
			Double oidBkpdDet) {
		super(id, bkpdProcessed, bkpdAmt, bkpdBkAcct, bkpdResaleAmt, bkpdRef,
				bkpdUser1, bkpdUser2, bkpdUserc03, bkpdUserc04, bkpdUsert01,
				bkpdUsert02, bkpdUserl01, bkpdUserl02, bkpdQadc01, bkpdQadc02,
				bkpdNbr, bkpdDueDate, bkpdSeparate, bkpdFullBkAcct, bkpdCsBank,
				bkpdModDate, bkpdModUserid, bkpdUserc05, bkpdUserd01,
				bkpdUserd02, bkpdUseri01, bkpdUseri02, bkpdQadc03, bkpdQadc04,
				bkpdQadc05, bkpdQadd01, bkpdQadd02, bkpdQadi01, bkpdQadi02,
				bkpdQadl01, bkpdQadl02, bkpdQadt01, bkpdQadt02, oidBkpdDet);
	}

}
