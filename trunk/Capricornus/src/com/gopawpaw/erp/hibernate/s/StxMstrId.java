package com.gopawpaw.erp.hibernate.s;

/**
 * StxMstrId entity. @author MyEclipse Persistence Tools
 */
public class StxMstrId extends AbstractStxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public StxMstrId() {
	}

	/** full constructor */
	public StxMstrId(String stxDomain, String stxTranType, String stxKey,
			String stxTaxCode) {
		super(stxDomain, stxTranType, stxKey, stxTaxCode);
	}

}
