package com.gopawpaw.erp.hibernate.t;

/**
 * TxrdDetId entity. @author MyEclipse Persistence Tools
 */
public class TxrdDetId extends AbstractTxrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxrdDetId() {
	}

	/** full constructor */
	public TxrdDetId(String txrdDomain, String txrdRegister, String txrdSite,
			String txrdTranType, String txrdRef) {
		super(txrdDomain, txrdRegister, txrdSite, txrdTranType, txrdRef);
	}

}
