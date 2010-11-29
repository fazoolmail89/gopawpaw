package com.gopawpaw.erp.hibernate.t;

/**
 * TotdDetId entity. @author MyEclipse Persistence Tools
 */
public class TotdDetId extends AbstractTotdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TotdDetId() {
	}

	/** full constructor */
	public TotdDetId(String totdDomain, String totdTermsCode,
			String totdLcCharge) {
		super(totdDomain, totdTermsCode, totdLcCharge);
	}

}
