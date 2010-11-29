package com.gopawpaw.erp.hibernate.t;

/**
 * TxzMstrId entity. @author MyEclipse Persistence Tools
 */
public class TxzMstrId extends AbstractTxzMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxzMstrId() {
	}

	/** full constructor */
	public TxzMstrId(String txzDomain, String txzTaxZone) {
		super(txzDomain, txzTaxZone);
	}

}
