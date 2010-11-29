package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ApcCtrl entity. @author MyEclipse Persistence Tools
 */
public class ApcCtrl extends AbstractApcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApcCtrl() {
	}

	/** minimal constructor */
	public ApcCtrl(String apcExRatetype, Boolean apcMultiEntityPay,
			Double oidApcCtrl) {
		super(apcExRatetype, apcMultiEntityPay, oidApcCtrl);
	}

	/** full constructor */
	public ApcCtrl(Integer apcBatch, Integer apcVoucher, Integer apcJrnl,
			Boolean apcVchrAll, Boolean apcGlSum, Integer apcQad01,
			String apcCkfrm, String apcUser1, String apcUser2, String apcShip,
			String apcQad03, Date apcQad02, Integer apcQadi01, Double apcExTol,
			String apcBank, String apcQadc03, String apcQadc05,
			Boolean apcConfirm, Boolean apcPip, String apcVoPre,
			String apcQadc01, String apcQadc02, Boolean apcUseDrft,
			Boolean apcExpvar, Boolean apcRvConf, Boolean apcApprov,
			Boolean apcExtRef, Boolean apcQad04, Boolean apcErsPsErr,
			Boolean apcGlAvgCst, Integer apcErsVoTp, String apcExRatetype,
			Integer apcSumLvl, String apcQadc04, Boolean apcMultiEntityPay,
			Double oidApcCtrl) {
		super(apcBatch, apcVoucher, apcJrnl, apcVchrAll, apcGlSum, apcQad01,
				apcCkfrm, apcUser1, apcUser2, apcShip, apcQad03, apcQad02,
				apcQadi01, apcExTol, apcBank, apcQadc03, apcQadc05, apcConfirm,
				apcPip, apcVoPre, apcQadc01, apcQadc02, apcUseDrft, apcExpvar,
				apcRvConf, apcApprov, apcExtRef, apcQad04, apcErsPsErr,
				apcGlAvgCst, apcErsVoTp, apcExRatetype, apcSumLvl, apcQadc04,
				apcMultiEntityPay, oidApcCtrl);
	}

}
