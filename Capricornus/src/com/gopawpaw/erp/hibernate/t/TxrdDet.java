package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TxrdDet entity. @author MyEclipse Persistence Tools
 */
public class TxrdDet extends AbstractTxrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxrdDet() {
	}

	/** minimal constructor */
	public TxrdDet(TxrdDetId id, String txrdCode, Date txrdModDate,
			String txrdModUserid, String txrdUser1, String txrdUser2,
			Double txrdUserd01, Integer txrdUseri01, Boolean txrdUserl01,
			String txrdQadc01, String txrdQadc02, Double txrdQadd01,
			Integer txrdQadi01, Boolean txrdQadl01, Double oidTxrdDet) {
		super(id, txrdCode, txrdModDate, txrdModUserid, txrdUser1, txrdUser2,
				txrdUserd01, txrdUseri01, txrdUserl01, txrdQadc01, txrdQadc02,
				txrdQadd01, txrdQadi01, txrdQadl01, oidTxrdDet);
	}

	/** full constructor */
	public TxrdDet(TxrdDetId id, String txrdCode, Date txrdModDate,
			String txrdModUserid, String txrdUser1, String txrdUser2,
			Double txrdUserd01, Integer txrdUseri01, Boolean txrdUserl01,
			Date txrdUsert01, String txrdQadc01, String txrdQadc02,
			Double txrdQadd01, Integer txrdQadi01, Boolean txrdQadl01,
			Date txrdQadt01, Double oidTxrdDet) {
		super(id, txrdCode, txrdModDate, txrdModUserid, txrdUser1, txrdUser2,
				txrdUserd01, txrdUseri01, txrdUserl01, txrdUsert01, txrdQadc01,
				txrdQadc02, txrdQadd01, txrdQadi01, txrdQadl01, txrdQadt01,
				oidTxrdDet);
	}

}
