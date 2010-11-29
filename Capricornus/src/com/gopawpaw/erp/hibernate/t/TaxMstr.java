package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TaxMstr entity. @author MyEclipse Persistence Tools
 */
public class TaxMstr extends AbstractTaxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaxMstr() {
	}

	/** minimal constructor */
	public TaxMstr(TaxMstrId id, Double oidTaxMstr) {
		super(id, oidTaxMstr);
	}

	/** full constructor */
	public TaxMstr(TaxMstrId id, String taxTaxPct, String taxAcct,
			String taxCc, Boolean taxTrl, String taxUser1, String taxUser2,
			Double taxMax, String taxUserid, Date taxModDate, String taxQad01,
			String taxQad02, Boolean taxQad03, Double oidTaxMstr) {
		super(id, taxTaxPct, taxAcct, taxCc, taxTrl, taxUser1, taxUser2,
				taxMax, taxUserid, taxModDate, taxQad01, taxQad02, taxQad03,
				oidTaxMstr);
	}

}
