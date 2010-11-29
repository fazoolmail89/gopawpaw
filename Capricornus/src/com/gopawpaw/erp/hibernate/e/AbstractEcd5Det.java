package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd5Det entity provides the base persistence definition of the
 * Ecd5Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd5Det implements java.io.Serializable {

	// Fields

	private Ecd5DetId id;
	private Date ecd5End;
	private String ecd5User1;
	private String ecd5User2;
	private String ecd5Userid;
	private Date ecd5ModDate;
	private Double ecd5Batch;
	private Date ecd5Apprdate;
	private String ecd5ApprId;
	private Integer ecd5Cmtindx;
	private Double ecd5Material;
	private Double ecd5Labor;
	private Double ecd5Burden;
	private Double ecd5Subcontract;
	private Double ecd5Overhead;
	private Double ecd5TotalCost;
	private String ecd5QspecNbr;
	private Integer ecd5QspecId;
	private String ecd5Qadc01;
	private Double oidEcd5Det;

	// Constructors

	/** default constructor */
	public AbstractEcd5Det() {
	}

	/** minimal constructor */
	public AbstractEcd5Det(Ecd5DetId id, Double oidEcd5Det) {
		this.id = id;
		this.oidEcd5Det = oidEcd5Det;
	}

	/** full constructor */
	public AbstractEcd5Det(Ecd5DetId id, Date ecd5End, String ecd5User1,
			String ecd5User2, String ecd5Userid, Date ecd5ModDate,
			Double ecd5Batch, Date ecd5Apprdate, String ecd5ApprId,
			Integer ecd5Cmtindx, Double ecd5Material, Double ecd5Labor,
			Double ecd5Burden, Double ecd5Subcontract, Double ecd5Overhead,
			Double ecd5TotalCost, String ecd5QspecNbr, Integer ecd5QspecId,
			String ecd5Qadc01, Double oidEcd5Det) {
		this.id = id;
		this.ecd5End = ecd5End;
		this.ecd5User1 = ecd5User1;
		this.ecd5User2 = ecd5User2;
		this.ecd5Userid = ecd5Userid;
		this.ecd5ModDate = ecd5ModDate;
		this.ecd5Batch = ecd5Batch;
		this.ecd5Apprdate = ecd5Apprdate;
		this.ecd5ApprId = ecd5ApprId;
		this.ecd5Cmtindx = ecd5Cmtindx;
		this.ecd5Material = ecd5Material;
		this.ecd5Labor = ecd5Labor;
		this.ecd5Burden = ecd5Burden;
		this.ecd5Subcontract = ecd5Subcontract;
		this.ecd5Overhead = ecd5Overhead;
		this.ecd5TotalCost = ecd5TotalCost;
		this.ecd5QspecNbr = ecd5QspecNbr;
		this.ecd5QspecId = ecd5QspecId;
		this.ecd5Qadc01 = ecd5Qadc01;
		this.oidEcd5Det = oidEcd5Det;
	}

	// Property accessors

	public Ecd5DetId getId() {
		return this.id;
	}

	public void setId(Ecd5DetId id) {
		this.id = id;
	}

	public Date getEcd5End() {
		return this.ecd5End;
	}

	public void setEcd5End(Date ecd5End) {
		this.ecd5End = ecd5End;
	}

	public String getEcd5User1() {
		return this.ecd5User1;
	}

	public void setEcd5User1(String ecd5User1) {
		this.ecd5User1 = ecd5User1;
	}

	public String getEcd5User2() {
		return this.ecd5User2;
	}

	public void setEcd5User2(String ecd5User2) {
		this.ecd5User2 = ecd5User2;
	}

	public String getEcd5Userid() {
		return this.ecd5Userid;
	}

	public void setEcd5Userid(String ecd5Userid) {
		this.ecd5Userid = ecd5Userid;
	}

	public Date getEcd5ModDate() {
		return this.ecd5ModDate;
	}

	public void setEcd5ModDate(Date ecd5ModDate) {
		this.ecd5ModDate = ecd5ModDate;
	}

	public Double getEcd5Batch() {
		return this.ecd5Batch;
	}

	public void setEcd5Batch(Double ecd5Batch) {
		this.ecd5Batch = ecd5Batch;
	}

	public Date getEcd5Apprdate() {
		return this.ecd5Apprdate;
	}

	public void setEcd5Apprdate(Date ecd5Apprdate) {
		this.ecd5Apprdate = ecd5Apprdate;
	}

	public String getEcd5ApprId() {
		return this.ecd5ApprId;
	}

	public void setEcd5ApprId(String ecd5ApprId) {
		this.ecd5ApprId = ecd5ApprId;
	}

	public Integer getEcd5Cmtindx() {
		return this.ecd5Cmtindx;
	}

	public void setEcd5Cmtindx(Integer ecd5Cmtindx) {
		this.ecd5Cmtindx = ecd5Cmtindx;
	}

	public Double getEcd5Material() {
		return this.ecd5Material;
	}

	public void setEcd5Material(Double ecd5Material) {
		this.ecd5Material = ecd5Material;
	}

	public Double getEcd5Labor() {
		return this.ecd5Labor;
	}

	public void setEcd5Labor(Double ecd5Labor) {
		this.ecd5Labor = ecd5Labor;
	}

	public Double getEcd5Burden() {
		return this.ecd5Burden;
	}

	public void setEcd5Burden(Double ecd5Burden) {
		this.ecd5Burden = ecd5Burden;
	}

	public Double getEcd5Subcontract() {
		return this.ecd5Subcontract;
	}

	public void setEcd5Subcontract(Double ecd5Subcontract) {
		this.ecd5Subcontract = ecd5Subcontract;
	}

	public Double getEcd5Overhead() {
		return this.ecd5Overhead;
	}

	public void setEcd5Overhead(Double ecd5Overhead) {
		this.ecd5Overhead = ecd5Overhead;
	}

	public Double getEcd5TotalCost() {
		return this.ecd5TotalCost;
	}

	public void setEcd5TotalCost(Double ecd5TotalCost) {
		this.ecd5TotalCost = ecd5TotalCost;
	}

	public String getEcd5QspecNbr() {
		return this.ecd5QspecNbr;
	}

	public void setEcd5QspecNbr(String ecd5QspecNbr) {
		this.ecd5QspecNbr = ecd5QspecNbr;
	}

	public Integer getEcd5QspecId() {
		return this.ecd5QspecId;
	}

	public void setEcd5QspecId(Integer ecd5QspecId) {
		this.ecd5QspecId = ecd5QspecId;
	}

	public String getEcd5Qadc01() {
		return this.ecd5Qadc01;
	}

	public void setEcd5Qadc01(String ecd5Qadc01) {
		this.ecd5Qadc01 = ecd5Qadc01;
	}

	public Double getOidEcd5Det() {
		return this.oidEcd5Det;
	}

	public void setOidEcd5Det(Double oidEcd5Det) {
		this.oidEcd5Det = oidEcd5Det;
	}

}