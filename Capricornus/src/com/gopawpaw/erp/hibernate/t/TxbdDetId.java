package com.gopawpaw.erp.hibernate.t;

/**
 * TxbdDetId entity. @author MyEclipse Persistence Tools
 */
public class TxbdDetId extends AbstractTxbdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxbdDetId() {
	}

	/** full constructor */
	public TxbdDetId(String txbdDomain, String txbdBase, String txbdTaxType) {
		super(txbdDomain, txbdBase, txbdTaxType);
	}

}
