package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxeMstr entity provides the base persistence definition of the
 * TxeMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxeMstr implements java.io.Serializable {

	// Fields

	private TxeMstrId id;
	private String txeDesc;
	private String txeZoneTo;
	private String txeZoneFrom;
	private String txeQad01;
	private String txeQad02;
	private Boolean txeQad03;
	private String txeUser1;
	private String txeUser2;
	private Boolean txeLog01;
	private Double oidTxeMstr;

	// Constructors

	/** default constructor */
	public AbstractTxeMstr() {
	}

	/** minimal constructor */
	public AbstractTxeMstr(TxeMstrId id, String txeZoneTo, String txeZoneFrom,
			Double oidTxeMstr) {
		this.id = id;
		this.txeZoneTo = txeZoneTo;
		this.txeZoneFrom = txeZoneFrom;
		this.oidTxeMstr = oidTxeMstr;
	}

	/** full constructor */
	public AbstractTxeMstr(TxeMstrId id, String txeDesc, String txeZoneTo,
			String txeZoneFrom, String txeQad01, String txeQad02,
			Boolean txeQad03, String txeUser1, String txeUser2,
			Boolean txeLog01, Double oidTxeMstr) {
		this.id = id;
		this.txeDesc = txeDesc;
		this.txeZoneTo = txeZoneTo;
		this.txeZoneFrom = txeZoneFrom;
		this.txeQad01 = txeQad01;
		this.txeQad02 = txeQad02;
		this.txeQad03 = txeQad03;
		this.txeUser1 = txeUser1;
		this.txeUser2 = txeUser2;
		this.txeLog01 = txeLog01;
		this.oidTxeMstr = oidTxeMstr;
	}

	// Property accessors

	public TxeMstrId getId() {
		return this.id;
	}

	public void setId(TxeMstrId id) {
		this.id = id;
	}

	public String getTxeDesc() {
		return this.txeDesc;
	}

	public void setTxeDesc(String txeDesc) {
		this.txeDesc = txeDesc;
	}

	public String getTxeZoneTo() {
		return this.txeZoneTo;
	}

	public void setTxeZoneTo(String txeZoneTo) {
		this.txeZoneTo = txeZoneTo;
	}

	public String getTxeZoneFrom() {
		return this.txeZoneFrom;
	}

	public void setTxeZoneFrom(String txeZoneFrom) {
		this.txeZoneFrom = txeZoneFrom;
	}

	public String getTxeQad01() {
		return this.txeQad01;
	}

	public void setTxeQad01(String txeQad01) {
		this.txeQad01 = txeQad01;
	}

	public String getTxeQad02() {
		return this.txeQad02;
	}

	public void setTxeQad02(String txeQad02) {
		this.txeQad02 = txeQad02;
	}

	public Boolean getTxeQad03() {
		return this.txeQad03;
	}

	public void setTxeQad03(Boolean txeQad03) {
		this.txeQad03 = txeQad03;
	}

	public String getTxeUser1() {
		return this.txeUser1;
	}

	public void setTxeUser1(String txeUser1) {
		this.txeUser1 = txeUser1;
	}

	public String getTxeUser2() {
		return this.txeUser2;
	}

	public void setTxeUser2(String txeUser2) {
		this.txeUser2 = txeUser2;
	}

	public Boolean getTxeLog01() {
		return this.txeLog01;
	}

	public void setTxeLog01(Boolean txeLog01) {
		this.txeLog01 = txeLog01;
	}

	public Double getOidTxeMstr() {
		return this.oidTxeMstr;
	}

	public void setOidTxeMstr(Double oidTxeMstr) {
		this.oidTxeMstr = oidTxeMstr;
	}

}