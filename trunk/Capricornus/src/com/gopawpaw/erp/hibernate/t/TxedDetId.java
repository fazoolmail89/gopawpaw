package com.gopawpaw.erp.hibernate.t;

/**
 * TxedDetId entity. @author MyEclipse Persistence Tools
 */
public class TxedDetId extends AbstractTxedDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxedDetId() {
	}

	/** full constructor */
	public TxedDetId(String txedDomain, String txedTaxEnv, String txedTaxType) {
		super(txedDomain, txedTaxEnv, txedTaxType);
	}

}
