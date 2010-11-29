package com.gopawpaw.erp.hibernate.t;

/**
 * Tx2MstrId entity. @author MyEclipse Persistence Tools
 */
public class Tx2MstrId extends AbstractTx2MstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tx2MstrId() {
	}

	/** full constructor */
	public Tx2MstrId(String tx2Domain, String tx2TaxCode) {
		super(tx2Domain, tx2TaxCode);
	}

}
