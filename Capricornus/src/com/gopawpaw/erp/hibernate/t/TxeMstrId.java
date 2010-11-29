package com.gopawpaw.erp.hibernate.t;

/**
 * TxeMstrId entity. @author MyEclipse Persistence Tools
 */
public class TxeMstrId extends AbstractTxeMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxeMstrId() {
	}

	/** full constructor */
	public TxeMstrId(String txeDomain, String txeTaxEnv) {
		super(txeDomain, txeTaxEnv);
	}

}
