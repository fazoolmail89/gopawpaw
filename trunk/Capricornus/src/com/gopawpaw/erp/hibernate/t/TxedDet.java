package com.gopawpaw.erp.hibernate.t;

/**
 * TxedDet entity. @author MyEclipse Persistence Tools
 */
public class TxedDet extends AbstractTxedDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxedDet() {
	}

	/** minimal constructor */
	public TxedDet(TxedDetId id, Integer txedSeq, Double oidTxedDet) {
		super(id, txedSeq, oidTxedDet);
	}

	/** full constructor */
	public TxedDet(TxedDetId id, Integer txedSeq, String txedRound,
			String txedQad01, String txedQad02, String txedUser1,
			String txedUser2, Boolean txedQad03, Boolean txedLog01,
			Double oidTxedDet) {
		super(id, txedSeq, txedRound, txedQad01, txedQad02, txedUser1,
				txedUser2, txedQad03, txedLog01, oidTxedDet);
	}

}
