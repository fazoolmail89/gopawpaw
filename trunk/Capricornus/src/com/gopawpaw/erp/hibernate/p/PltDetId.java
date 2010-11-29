package com.gopawpaw.erp.hibernate.p;

/**
 * PltDetId entity. @author MyEclipse Persistence Tools
 */
public class PltDetId extends AbstractPltDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PltDetId() {
	}

	/** minimal constructor */
	public PltDetId(String pltDomain) {
		super(pltDomain);
	}

	/** full constructor */
	public PltDetId(String pltDomain, String pltProdLine, String pltTaxType) {
		super(pltDomain, pltProdLine, pltTaxType);
	}

}
