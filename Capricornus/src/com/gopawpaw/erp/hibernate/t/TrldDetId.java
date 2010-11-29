package com.gopawpaw.erp.hibernate.t;

/**
 * TrldDetId entity. @author MyEclipse Persistence Tools
 */
public class TrldDetId extends AbstractTrldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrldDetId() {
	}

	/** minimal constructor */
	public TrldDetId(String trldDomain) {
		super(trldDomain);
	}

	/** full constructor */
	public TrldDetId(String trldDomain, String trldCode, String trldTaxType) {
		super(trldDomain, trldCode, trldTaxType);
	}

}
