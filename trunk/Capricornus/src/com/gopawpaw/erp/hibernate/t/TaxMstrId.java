package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TaxMstrId entity. @author MyEclipse Persistence Tools
 */
public class TaxMstrId extends AbstractTaxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaxMstrId() {
	}

	/** full constructor */
	public TaxMstrId(String taxState, String taxCounty, String taxCity,
			Date taxEffdate) {
		super(taxState, taxCounty, taxCity, taxEffdate);
	}

}
