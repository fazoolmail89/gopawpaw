package com.gopawpaw.erp.hibernate.t;

/**
 * TxzMstr entity. @author MyEclipse Persistence Tools
 */
public class TxzMstr extends AbstractTxzMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxzMstr() {
	}

	/** minimal constructor */
	public TxzMstr(TxzMstrId id, String txzCtryCode, String txzState,
			String txzCounty, String txzCity, String txzZip, Double oidTxzMstr) {
		super(id, txzCtryCode, txzState, txzCounty, txzCity, txzZip, oidTxzMstr);
	}

	/** full constructor */
	public TxzMstr(TxzMstrId id, String txzDesc, String txzCtryCode,
			String txzState, String txzCounty, String txzCity, String txzZip,
			String txzQad01, String txzQad02, Boolean txzQad03,
			String txzUser1, String txzUser2, Boolean txzLog01,
			Double oidTxzMstr) {
		super(id, txzDesc, txzCtryCode, txzState, txzCounty, txzCity, txzZip,
				txzQad01, txzQad02, txzQad03, txzUser1, txzUser2, txzLog01,
				oidTxzMstr);
	}

}
