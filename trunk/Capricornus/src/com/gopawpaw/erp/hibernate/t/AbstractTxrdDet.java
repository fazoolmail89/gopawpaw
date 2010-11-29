package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTxrdDet entity provides the base persistence definition of the
 * TxrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxrdDet implements java.io.Serializable {

	// Fields

	private TxrdDetId id;
	private String txrdCode;
	private Date txrdModDate;
	private String txrdModUserid;
	private String txrdUser1;
	private String txrdUser2;
	private Double txrdUserd01;
	private Integer txrdUseri01;
	private Boolean txrdUserl01;
	private Date txrdUsert01;
	private String txrdQadc01;
	private String txrdQadc02;
	private Double txrdQadd01;
	private Integer txrdQadi01;
	private Boolean txrdQadl01;
	private Date txrdQadt01;
	private Double oidTxrdDet;

	// Constructors

	/** default constructor */
	public AbstractTxrdDet() {
	}

	/** minimal constructor */
	public AbstractTxrdDet(TxrdDetId id, String txrdCode, Date txrdModDate,
			String txrdModUserid, String txrdUser1, String txrdUser2,
			Double txrdUserd01, Integer txrdUseri01, Boolean txrdUserl01,
			String txrdQadc01, String txrdQadc02, Double txrdQadd01,
			Integer txrdQadi01, Boolean txrdQadl01, Double oidTxrdDet) {
		this.id = id;
		this.txrdCode = txrdCode;
		this.txrdModDate = txrdModDate;
		this.txrdModUserid = txrdModUserid;
		this.txrdUser1 = txrdUser1;
		this.txrdUser2 = txrdUser2;
		this.txrdUserd01 = txrdUserd01;
		this.txrdUseri01 = txrdUseri01;
		this.txrdUserl01 = txrdUserl01;
		this.txrdQadc01 = txrdQadc01;
		this.txrdQadc02 = txrdQadc02;
		this.txrdQadd01 = txrdQadd01;
		this.txrdQadi01 = txrdQadi01;
		this.txrdQadl01 = txrdQadl01;
		this.oidTxrdDet = oidTxrdDet;
	}

	/** full constructor */
	public AbstractTxrdDet(TxrdDetId id, String txrdCode, Date txrdModDate,
			String txrdModUserid, String txrdUser1, String txrdUser2,
			Double txrdUserd01, Integer txrdUseri01, Boolean txrdUserl01,
			Date txrdUsert01, String txrdQadc01, String txrdQadc02,
			Double txrdQadd01, Integer txrdQadi01, Boolean txrdQadl01,
			Date txrdQadt01, Double oidTxrdDet) {
		this.id = id;
		this.txrdCode = txrdCode;
		this.txrdModDate = txrdModDate;
		this.txrdModUserid = txrdModUserid;
		this.txrdUser1 = txrdUser1;
		this.txrdUser2 = txrdUser2;
		this.txrdUserd01 = txrdUserd01;
		this.txrdUseri01 = txrdUseri01;
		this.txrdUserl01 = txrdUserl01;
		this.txrdUsert01 = txrdUsert01;
		this.txrdQadc01 = txrdQadc01;
		this.txrdQadc02 = txrdQadc02;
		this.txrdQadd01 = txrdQadd01;
		this.txrdQadi01 = txrdQadi01;
		this.txrdQadl01 = txrdQadl01;
		this.txrdQadt01 = txrdQadt01;
		this.oidTxrdDet = oidTxrdDet;
	}

	// Property accessors

	public TxrdDetId getId() {
		return this.id;
	}

	public void setId(TxrdDetId id) {
		this.id = id;
	}

	public String getTxrdCode() {
		return this.txrdCode;
	}

	public void setTxrdCode(String txrdCode) {
		this.txrdCode = txrdCode;
	}

	public Date getTxrdModDate() {
		return this.txrdModDate;
	}

	public void setTxrdModDate(Date txrdModDate) {
		this.txrdModDate = txrdModDate;
	}

	public String getTxrdModUserid() {
		return this.txrdModUserid;
	}

	public void setTxrdModUserid(String txrdModUserid) {
		this.txrdModUserid = txrdModUserid;
	}

	public String getTxrdUser1() {
		return this.txrdUser1;
	}

	public void setTxrdUser1(String txrdUser1) {
		this.txrdUser1 = txrdUser1;
	}

	public String getTxrdUser2() {
		return this.txrdUser2;
	}

	public void setTxrdUser2(String txrdUser2) {
		this.txrdUser2 = txrdUser2;
	}

	public Double getTxrdUserd01() {
		return this.txrdUserd01;
	}

	public void setTxrdUserd01(Double txrdUserd01) {
		this.txrdUserd01 = txrdUserd01;
	}

	public Integer getTxrdUseri01() {
		return this.txrdUseri01;
	}

	public void setTxrdUseri01(Integer txrdUseri01) {
		this.txrdUseri01 = txrdUseri01;
	}

	public Boolean getTxrdUserl01() {
		return this.txrdUserl01;
	}

	public void setTxrdUserl01(Boolean txrdUserl01) {
		this.txrdUserl01 = txrdUserl01;
	}

	public Date getTxrdUsert01() {
		return this.txrdUsert01;
	}

	public void setTxrdUsert01(Date txrdUsert01) {
		this.txrdUsert01 = txrdUsert01;
	}

	public String getTxrdQadc01() {
		return this.txrdQadc01;
	}

	public void setTxrdQadc01(String txrdQadc01) {
		this.txrdQadc01 = txrdQadc01;
	}

	public String getTxrdQadc02() {
		return this.txrdQadc02;
	}

	public void setTxrdQadc02(String txrdQadc02) {
		this.txrdQadc02 = txrdQadc02;
	}

	public Double getTxrdQadd01() {
		return this.txrdQadd01;
	}

	public void setTxrdQadd01(Double txrdQadd01) {
		this.txrdQadd01 = txrdQadd01;
	}

	public Integer getTxrdQadi01() {
		return this.txrdQadi01;
	}

	public void setTxrdQadi01(Integer txrdQadi01) {
		this.txrdQadi01 = txrdQadi01;
	}

	public Boolean getTxrdQadl01() {
		return this.txrdQadl01;
	}

	public void setTxrdQadl01(Boolean txrdQadl01) {
		this.txrdQadl01 = txrdQadl01;
	}

	public Date getTxrdQadt01() {
		return this.txrdQadt01;
	}

	public void setTxrdQadt01(Date txrdQadt01) {
		this.txrdQadt01 = txrdQadt01;
	}

	public Double getOidTxrdDet() {
		return this.oidTxrdDet;
	}

	public void setOidTxrdDet(Double oidTxrdDet) {
		this.oidTxrdDet = oidTxrdDet;
	}

}