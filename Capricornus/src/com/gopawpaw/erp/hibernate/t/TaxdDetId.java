package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TaxdDetId entity. @author MyEclipse Persistence Tools
 */
public class TaxdDetId extends AbstractTaxdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaxdDetId() {
	}

	/** full constructor */
	public TaxdDetId(String taxdState, String taxdCounty, String taxdCity,
			Date taxdEffdate) {
		super(taxdState, taxdCounty, taxdCity, taxdEffdate);
	}

}
