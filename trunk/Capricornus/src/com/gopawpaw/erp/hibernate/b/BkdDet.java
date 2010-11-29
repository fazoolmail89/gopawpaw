package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkdDet entity. @author MyEclipse Persistence Tools
 */
public class BkdDet extends AbstractBkdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkdDet() {
	}

	/** minimal constructor */
	public BkdDet(BkdDetId id, Boolean bkdAutoPayment,
			Boolean bkdManualPayment, Boolean bkdDraft, Integer bkdFromCk,
			Integer bkdToCk, Integer bkdNextCk, String bkdPipAcct,
			String bkdPipCc, String bkdProgram, String bkdUser1,
			String bkdUser2, Boolean bkdFile, String bkdValidationList,
			String bkdCurrList, Boolean bkdSwift, Boolean bkdAccMandatory,
			Boolean bkdUserl01, Boolean bkdQadl01, Double bkdUserd01,
			Double bkdQadd01, Integer bkdPayGroup, Boolean bkdExceedBalance,
			Boolean bkdReconCredit, String bkdPipSub, Integer bkdUseri01,
			Integer bkdQadi01, String bkdQadc01, String bkdQadc02,
			Date bkdModDate, String bkdModUserid, Double oidBkdDet) {
		super(id, bkdAutoPayment, bkdManualPayment, bkdDraft, bkdFromCk,
				bkdToCk, bkdNextCk, bkdPipAcct, bkdPipCc, bkdProgram, bkdUser1,
				bkdUser2, bkdFile, bkdValidationList, bkdCurrList, bkdSwift,
				bkdAccMandatory, bkdUserl01, bkdQadl01, bkdUserd01, bkdQadd01,
				bkdPayGroup, bkdExceedBalance, bkdReconCredit, bkdPipSub,
				bkdUseri01, bkdQadi01, bkdQadc01, bkdQadc02, bkdModDate,
				bkdModUserid, oidBkdDet);
	}

	/** full constructor */
	public BkdDet(BkdDetId id, Boolean bkdAutoPayment,
			Boolean bkdManualPayment, Boolean bkdDraft, Integer bkdFromCk,
			Integer bkdToCk, Integer bkdNextCk, String bkdPipAcct,
			String bkdPipCc, String bkdProgram, String bkdUser1,
			String bkdUser2, Boolean bkdFile, String bkdValidationList,
			String bkdCurrList, Boolean bkdSwift, Boolean bkdAccMandatory,
			Boolean bkdUserl01, Boolean bkdQadl01, Double bkdUserd01,
			Double bkdQadd01, Date bkdUsert01, Integer bkdPayGroup,
			Boolean bkdExceedBalance, Boolean bkdReconCredit, String bkdPipSub,
			Integer bkdUseri01, Integer bkdQadi01, String bkdQadc01,
			String bkdQadc02, Date bkdQadt01, Date bkdModDate,
			String bkdModUserid, Double oidBkdDet) {
		super(id, bkdAutoPayment, bkdManualPayment, bkdDraft, bkdFromCk,
				bkdToCk, bkdNextCk, bkdPipAcct, bkdPipCc, bkdProgram, bkdUser1,
				bkdUser2, bkdFile, bkdValidationList, bkdCurrList, bkdSwift,
				bkdAccMandatory, bkdUserl01, bkdQadl01, bkdUserd01, bkdQadd01,
				bkdUsert01, bkdPayGroup, bkdExceedBalance, bkdReconCredit,
				bkdPipSub, bkdUseri01, bkdQadi01, bkdQadc01, bkdQadc02,
				bkdQadt01, bkdModDate, bkdModUserid, oidBkdDet);
	}

}
