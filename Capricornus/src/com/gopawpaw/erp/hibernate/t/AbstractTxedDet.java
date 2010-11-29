package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxedDet entity provides the base persistence definition of the
 * TxedDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxedDet implements java.io.Serializable {

	// Fields

	private TxedDetId id;
	private Integer txedSeq;
	private String txedRound;
	private String txedQad01;
	private String txedQad02;
	private String txedUser1;
	private String txedUser2;
	private Boolean txedQad03;
	private Boolean txedLog01;
	private Double oidTxedDet;

	// Constructors

	/** default constructor */
	public AbstractTxedDet() {
	}

	/** minimal constructor */
	public AbstractTxedDet(TxedDetId id, Integer txedSeq, Double oidTxedDet) {
		this.id = id;
		this.txedSeq = txedSeq;
		this.oidTxedDet = oidTxedDet;
	}

	/** full constructor */
	public AbstractTxedDet(TxedDetId id, Integer txedSeq, String txedRound,
			String txedQad01, String txedQad02, String txedUser1,
			String txedUser2, Boolean txedQad03, Boolean txedLog01,
			Double oidTxedDet) {
		this.id = id;
		this.txedSeq = txedSeq;
		this.txedRound = txedRound;
		this.txedQad01 = txedQad01;
		this.txedQad02 = txedQad02;
		this.txedUser1 = txedUser1;
		this.txedUser2 = txedUser2;
		this.txedQad03 = txedQad03;
		this.txedLog01 = txedLog01;
		this.oidTxedDet = oidTxedDet;
	}

	// Property accessors

	public TxedDetId getId() {
		return this.id;
	}

	public void setId(TxedDetId id) {
		this.id = id;
	}

	public Integer getTxedSeq() {
		return this.txedSeq;
	}

	public void setTxedSeq(Integer txedSeq) {
		this.txedSeq = txedSeq;
	}

	public String getTxedRound() {
		return this.txedRound;
	}

	public void setTxedRound(String txedRound) {
		this.txedRound = txedRound;
	}

	public String getTxedQad01() {
		return this.txedQad01;
	}

	public void setTxedQad01(String txedQad01) {
		this.txedQad01 = txedQad01;
	}

	public String getTxedQad02() {
		return this.txedQad02;
	}

	public void setTxedQad02(String txedQad02) {
		this.txedQad02 = txedQad02;
	}

	public String getTxedUser1() {
		return this.txedUser1;
	}

	public void setTxedUser1(String txedUser1) {
		this.txedUser1 = txedUser1;
	}

	public String getTxedUser2() {
		return this.txedUser2;
	}

	public void setTxedUser2(String txedUser2) {
		this.txedUser2 = txedUser2;
	}

	public Boolean getTxedQad03() {
		return this.txedQad03;
	}

	public void setTxedQad03(Boolean txedQad03) {
		this.txedQad03 = txedQad03;
	}

	public Boolean getTxedLog01() {
		return this.txedLog01;
	}

	public void setTxedLog01(Boolean txedLog01) {
		this.txedLog01 = txedLog01;
	}

	public Double getOidTxedDet() {
		return this.oidTxedDet;
	}

	public void setOidTxedDet(Double oidTxedDet) {
		this.oidTxedDet = oidTxedDet;
	}

}