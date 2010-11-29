package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PlidDet entity. @author MyEclipse Persistence Tools
 */
public class PlidDet extends AbstractPlidDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlidDet() {
	}

	/** full constructor */
	public PlidDet(PlidDetId id, String plidOrderType, String plidOrder,
			Integer plidOrderLine, Double plidInvQty, Double plidInvCost,
			Integer plidPvoId, Boolean plidTaxable, String plidTaxc,
			String plidTaxEnv, Boolean plidTaxIn, String plidTaxUsage,
			Date plidModDate, String plidModUserid, String plidUser1,
			String plidUser2, String plidQadc01, String plidQadc02,
			Double oidPlidDet) {
		super(id, plidOrderType, plidOrder, plidOrderLine, plidInvQty,
				plidInvCost, plidPvoId, plidTaxable, plidTaxc, plidTaxEnv,
				plidTaxIn, plidTaxUsage, plidModDate, plidModUserid, plidUser1,
				plidUser2, plidQadc01, plidQadc02, oidPlidDet);
	}

}
