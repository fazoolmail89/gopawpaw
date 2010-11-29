package com.gopawpaw.erp.hibernate.t;

/**
 * TxhdDetId entity. @author MyEclipse Persistence Tools
 */
public class TxhdDetId extends AbstractTxhdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxhdDetId() {
	}

	/** full constructor */
	public TxhdDetId(String txhdDomain, Integer txhdTrNbr) {
		super(txhdDomain, txhdTrNbr);
	}

}
