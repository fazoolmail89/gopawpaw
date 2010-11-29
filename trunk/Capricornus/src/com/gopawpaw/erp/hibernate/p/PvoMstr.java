package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PvoMstr entity. @author MyEclipse Persistence Tools
 */
public class PvoMstr extends AbstractPvoMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PvoMstr() {
	}

	/** full constructor */
	public PvoMstr(PvoMstrId id, String pvoBuyer, String pvoLcCharge,
			String pvoSupplier, String pvoInternalRefType,
			String pvoInternalRef, String pvoExternalRef, Date pvoTransDate,
			Date pvoEffDate, Boolean pvoCostUpdate, String pvoLastVoucher,
			Integer pvoErsStatus, Integer pvoErsOpt, Integer pvoErsPriceLstOpt,
			String pvoShipfrom, String pvoShipto, String pvoOrderType,
			String pvoOrder, Integer pvoLine, String pvoPart,
			Double pvoTransQty, Double pvoVoucheredQty, String pvoCurr,
			Double pvoExRate, Double pvoExRate2, String pvoExRatetype,
			Integer pvoExruSeq, Double pvoAccruedAmt, Double pvoVoucheredAmt,
			String pvoAccrualAcct, String pvoAccrualSub, String pvoAccrualCc,
			String pvoProject, Boolean pvoTaxable, String pvoTaxc,
			String pvoTaxEnv, Boolean pvoTaxIn, String pvoTaxUsage,
			String pvoApprover, Boolean pvoConsignment, String pvoModUserid,
			Date pvoModDate, String pvoUser1, String pvoUser2,
			String pvoQadc01, String pvoQadc02, String pvoQadc03,
			Double pvoQadd01, Double oidPvoMstr) {
		super(id, pvoBuyer, pvoLcCharge, pvoSupplier, pvoInternalRefType,
				pvoInternalRef, pvoExternalRef, pvoTransDate, pvoEffDate,
				pvoCostUpdate, pvoLastVoucher, pvoErsStatus, pvoErsOpt,
				pvoErsPriceLstOpt, pvoShipfrom, pvoShipto, pvoOrderType,
				pvoOrder, pvoLine, pvoPart, pvoTransQty, pvoVoucheredQty,
				pvoCurr, pvoExRate, pvoExRate2, pvoExRatetype, pvoExruSeq,
				pvoAccruedAmt, pvoVoucheredAmt, pvoAccrualAcct, pvoAccrualSub,
				pvoAccrualCc, pvoProject, pvoTaxable, pvoTaxc, pvoTaxEnv,
				pvoTaxIn, pvoTaxUsage, pvoApprover, pvoConsignment,
				pvoModUserid, pvoModDate, pvoUser1, pvoUser2, pvoQadc01,
				pvoQadc02, pvoQadc03, pvoQadd01, oidPvoMstr);
	}

}
