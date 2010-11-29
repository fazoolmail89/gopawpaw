package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PvodDet entity. @author MyEclipse Persistence Tools
 */
public class PvodDet extends AbstractPvodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PvodDet() {
	}

	/** full constructor */
	public PvodDet(PvodDetId id, String pvodOrderType, String pvodOrder,
			Integer pvodOrderLine, String pvodQadc04, String pvodAccrualAcct,
			String pvodAccrualSub, String pvodAccrualCc, String pvodProject,
			Double pvodAccruedAmt, Double pvodVoucheredAmt,
			Boolean pvodCostUpdate, String pvodInternalRef,
			String pvodInternalRefType, String pvodPart, String pvodShipto,
			String pvodShipfrom, String pvodChannel, String pvodModUserid,
			Date pvodModDate, String pvodUser1, String pvodUser2,
			String pvodQadc01, String pvodQadc02, String pvodQadc03,
			Boolean pvodTaxable, String pvodTaxc, String pvodTaxEnv,
			Boolean pvodTaxIn, String pvodTaxUsage, Double pvodQadd01,
			Double oidPvodDet) {
		super(id, pvodOrderType, pvodOrder, pvodOrderLine, pvodQadc04,
				pvodAccrualAcct, pvodAccrualSub, pvodAccrualCc, pvodProject,
				pvodAccruedAmt, pvodVoucheredAmt, pvodCostUpdate,
				pvodInternalRef, pvodInternalRefType, pvodPart, pvodShipto,
				pvodShipfrom, pvodChannel, pvodModUserid, pvodModDate,
				pvodUser1, pvodUser2, pvodQadc01, pvodQadc02, pvodQadc03,
				pvodTaxable, pvodTaxc, pvodTaxEnv, pvodTaxIn, pvodTaxUsage,
				pvodQadd01, oidPvodDet);
	}

}
