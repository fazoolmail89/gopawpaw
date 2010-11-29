package com.gopawpaw.erp.hibernate.t;

/**
 * TxrMstrId entity. @author MyEclipse Persistence Tools
 */
public class TxrMstrId extends AbstractTxrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxrMstrId() {
	}

	/** full constructor */
	public TxrMstrId(String txrDomain, String txrRegister, String txrSite) {
		super(txrDomain, txrRegister, txrSite);
	}

}
