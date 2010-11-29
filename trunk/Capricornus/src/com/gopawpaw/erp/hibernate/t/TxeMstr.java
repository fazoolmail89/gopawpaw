package com.gopawpaw.erp.hibernate.t;

/**
 * TxeMstr entity. @author MyEclipse Persistence Tools
 */
public class TxeMstr extends AbstractTxeMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxeMstr() {
	}

	/** minimal constructor */
	public TxeMstr(TxeMstrId id, String txeZoneTo, String txeZoneFrom,
			Double oidTxeMstr) {
		super(id, txeZoneTo, txeZoneFrom, oidTxeMstr);
	}

	/** full constructor */
	public TxeMstr(TxeMstrId id, String txeDesc, String txeZoneTo,
			String txeZoneFrom, String txeQad01, String txeQad02,
			Boolean txeQad03, String txeUser1, String txeUser2,
			Boolean txeLog01, Double oidTxeMstr) {
		super(id, txeDesc, txeZoneTo, txeZoneFrom, txeQad01, txeQad02,
				txeQad03, txeUser1, txeUser2, txeLog01, oidTxeMstr);
	}

}
