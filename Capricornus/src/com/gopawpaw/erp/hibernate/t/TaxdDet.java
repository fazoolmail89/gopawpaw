package com.gopawpaw.erp.hibernate.t;

/**
 * TaxdDet entity. @author MyEclipse Persistence Tools
 */
public class TaxdDet extends AbstractTaxdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaxdDet() {
	}

	/** minimal constructor */
	public TaxdDet(TaxdDetId id, Double oidTaxdDet) {
		super(id, oidTaxdDet);
	}

	/** full constructor */
	public TaxdDet(TaxdDetId id, String taxdTaxamt, String taxdNtaxamt,
			Double taxdTotamt, Double taxdTottax, String taxdUser1,
			String taxdUser2, String taxdQad01, String taxdQad02,
			Boolean taxdQad03, Double oidTaxdDet) {
		super(id, taxdTaxamt, taxdNtaxamt, taxdTotamt, taxdTottax, taxdUser1,
				taxdUser2, taxdQad01, taxdQad02, taxdQad03, oidTaxdDet);
	}

}
