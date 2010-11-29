package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBaMstr entity provides the base persistence definition of the BaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBaMstr implements java.io.Serializable {

	// Fields

	private BaMstrId id;
	private String baUserid;
	private Date baDate;
	private Double baCtrl;
	private Double baTotal;
	private String baBank;
	private String baStatus;
	private String baUser1;
	private String baUser2;
	private String baDocType;
	private Double baBegBal;
	private String baQadc01;
	private Double oidBaMstr;

	// Constructors

	/** default constructor */
	public AbstractBaMstr() {
	}

	/** minimal constructor */
	public AbstractBaMstr(BaMstrId id, Double oidBaMstr) {
		this.id = id;
		this.oidBaMstr = oidBaMstr;
	}

	/** full constructor */
	public AbstractBaMstr(BaMstrId id, String baUserid, Date baDate,
			Double baCtrl, Double baTotal, String baBank, String baStatus,
			String baUser1, String baUser2, String baDocType, Double baBegBal,
			String baQadc01, Double oidBaMstr) {
		this.id = id;
		this.baUserid = baUserid;
		this.baDate = baDate;
		this.baCtrl = baCtrl;
		this.baTotal = baTotal;
		this.baBank = baBank;
		this.baStatus = baStatus;
		this.baUser1 = baUser1;
		this.baUser2 = baUser2;
		this.baDocType = baDocType;
		this.baBegBal = baBegBal;
		this.baQadc01 = baQadc01;
		this.oidBaMstr = oidBaMstr;
	}

	// Property accessors

	public BaMstrId getId() {
		return this.id;
	}

	public void setId(BaMstrId id) {
		this.id = id;
	}

	public String getBaUserid() {
		return this.baUserid;
	}

	public void setBaUserid(String baUserid) {
		this.baUserid = baUserid;
	}

	public Date getBaDate() {
		return this.baDate;
	}

	public void setBaDate(Date baDate) {
		this.baDate = baDate;
	}

	public Double getBaCtrl() {
		return this.baCtrl;
	}

	public void setBaCtrl(Double baCtrl) {
		this.baCtrl = baCtrl;
	}

	public Double getBaTotal() {
		return this.baTotal;
	}

	public void setBaTotal(Double baTotal) {
		this.baTotal = baTotal;
	}

	public String getBaBank() {
		return this.baBank;
	}

	public void setBaBank(String baBank) {
		this.baBank = baBank;
	}

	public String getBaStatus() {
		return this.baStatus;
	}

	public void setBaStatus(String baStatus) {
		this.baStatus = baStatus;
	}

	public String getBaUser1() {
		return this.baUser1;
	}

	public void setBaUser1(String baUser1) {
		this.baUser1 = baUser1;
	}

	public String getBaUser2() {
		return this.baUser2;
	}

	public void setBaUser2(String baUser2) {
		this.baUser2 = baUser2;
	}

	public String getBaDocType() {
		return this.baDocType;
	}

	public void setBaDocType(String baDocType) {
		this.baDocType = baDocType;
	}

	public Double getBaBegBal() {
		return this.baBegBal;
	}

	public void setBaBegBal(Double baBegBal) {
		this.baBegBal = baBegBal;
	}

	public String getBaQadc01() {
		return this.baQadc01;
	}

	public void setBaQadc01(String baQadc01) {
		this.baQadc01 = baQadc01;
	}

	public Double getOidBaMstr() {
		return this.oidBaMstr;
	}

	public void setOidBaMstr(Double oidBaMstr) {
		this.oidBaMstr = oidBaMstr;
	}

}