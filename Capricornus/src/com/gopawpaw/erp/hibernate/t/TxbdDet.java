package com.gopawpaw.erp.hibernate.t;

/**
 * TxbdDet entity. @author MyEclipse Persistence Tools
 */
public class TxbdDet extends AbstractTxbdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxbdDet() {
	}

	/** minimal constructor */
	public TxbdDet(TxbdDetId id, Double oidTxbdDet) {
		super(id, oidTxbdDet);
	}

	/** full constructor */
	public TxbdDet(TxbdDetId id, String txbdQad01, String txbdUser1,
			String txbdUser2, String txbdQad02, Double oidTxbdDet) {
		super(id, txbdQad01, txbdUser1, txbdUser2, txbdQad02, oidTxbdDet);
	}

}
