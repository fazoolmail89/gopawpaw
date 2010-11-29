package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxbdDet entity provides the base persistence definition of the
 * TxbdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxbdDet implements java.io.Serializable {

	// Fields

	private TxbdDetId id;
	private String txbdQad01;
	private String txbdUser1;
	private String txbdUser2;
	private String txbdQad02;
	private Double oidTxbdDet;

	// Constructors

	/** default constructor */
	public AbstractTxbdDet() {
	}

	/** minimal constructor */
	public AbstractTxbdDet(TxbdDetId id, Double oidTxbdDet) {
		this.id = id;
		this.oidTxbdDet = oidTxbdDet;
	}

	/** full constructor */
	public AbstractTxbdDet(TxbdDetId id, String txbdQad01, String txbdUser1,
			String txbdUser2, String txbdQad02, Double oidTxbdDet) {
		this.id = id;
		this.txbdQad01 = txbdQad01;
		this.txbdUser1 = txbdUser1;
		this.txbdUser2 = txbdUser2;
		this.txbdQad02 = txbdQad02;
		this.oidTxbdDet = oidTxbdDet;
	}

	// Property accessors

	public TxbdDetId getId() {
		return this.id;
	}

	public void setId(TxbdDetId id) {
		this.id = id;
	}

	public String getTxbdQad01() {
		return this.txbdQad01;
	}

	public void setTxbdQad01(String txbdQad01) {
		this.txbdQad01 = txbdQad01;
	}

	public String getTxbdUser1() {
		return this.txbdUser1;
	}

	public void setTxbdUser1(String txbdUser1) {
		this.txbdUser1 = txbdUser1;
	}

	public String getTxbdUser2() {
		return this.txbdUser2;
	}

	public void setTxbdUser2(String txbdUser2) {
		this.txbdUser2 = txbdUser2;
	}

	public String getTxbdQad02() {
		return this.txbdQad02;
	}

	public void setTxbdQad02(String txbdQad02) {
		this.txbdQad02 = txbdQad02;
	}

	public Double getOidTxbdDet() {
		return this.oidTxbdDet;
	}

	public void setOidTxbdDet(Double oidTxbdDet) {
		this.oidTxbdDet = oidTxbdDet;
	}

}