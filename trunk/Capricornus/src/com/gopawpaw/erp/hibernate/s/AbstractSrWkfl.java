package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSrWkfl entity provides the base persistence definition of the SrWkfl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrWkfl implements java.io.Serializable {

	// Fields

	private SrWkflId id;
	private Double srQty;
	private Double srAssay;
	private Date srExpire;
	private String srUser1;
	private String srUser2;
	private String srRev;
	private String srVendLot;
	private String srToLoc;
	private String srToSite;
	private String srStatus;
	private String srQadc01;
	private Double oidSrWkfl;

	// Constructors

	/** default constructor */
	public AbstractSrWkfl() {
	}

	/** minimal constructor */
	public AbstractSrWkfl(SrWkflId id, Double oidSrWkfl) {
		this.id = id;
		this.oidSrWkfl = oidSrWkfl;
	}

	/** full constructor */
	public AbstractSrWkfl(SrWkflId id, Double srQty, Double srAssay,
			Date srExpire, String srUser1, String srUser2, String srRev,
			String srVendLot, String srToLoc, String srToSite, String srStatus,
			String srQadc01, Double oidSrWkfl) {
		this.id = id;
		this.srQty = srQty;
		this.srAssay = srAssay;
		this.srExpire = srExpire;
		this.srUser1 = srUser1;
		this.srUser2 = srUser2;
		this.srRev = srRev;
		this.srVendLot = srVendLot;
		this.srToLoc = srToLoc;
		this.srToSite = srToSite;
		this.srStatus = srStatus;
		this.srQadc01 = srQadc01;
		this.oidSrWkfl = oidSrWkfl;
	}

	// Property accessors

	public SrWkflId getId() {
		return this.id;
	}

	public void setId(SrWkflId id) {
		this.id = id;
	}

	public Double getSrQty() {
		return this.srQty;
	}

	public void setSrQty(Double srQty) {
		this.srQty = srQty;
	}

	public Double getSrAssay() {
		return this.srAssay;
	}

	public void setSrAssay(Double srAssay) {
		this.srAssay = srAssay;
	}

	public Date getSrExpire() {
		return this.srExpire;
	}

	public void setSrExpire(Date srExpire) {
		this.srExpire = srExpire;
	}

	public String getSrUser1() {
		return this.srUser1;
	}

	public void setSrUser1(String srUser1) {
		this.srUser1 = srUser1;
	}

	public String getSrUser2() {
		return this.srUser2;
	}

	public void setSrUser2(String srUser2) {
		this.srUser2 = srUser2;
	}

	public String getSrRev() {
		return this.srRev;
	}

	public void setSrRev(String srRev) {
		this.srRev = srRev;
	}

	public String getSrVendLot() {
		return this.srVendLot;
	}

	public void setSrVendLot(String srVendLot) {
		this.srVendLot = srVendLot;
	}

	public String getSrToLoc() {
		return this.srToLoc;
	}

	public void setSrToLoc(String srToLoc) {
		this.srToLoc = srToLoc;
	}

	public String getSrToSite() {
		return this.srToSite;
	}

	public void setSrToSite(String srToSite) {
		this.srToSite = srToSite;
	}

	public String getSrStatus() {
		return this.srStatus;
	}

	public void setSrStatus(String srStatus) {
		this.srStatus = srStatus;
	}

	public String getSrQadc01() {
		return this.srQadc01;
	}

	public void setSrQadc01(String srQadc01) {
		this.srQadc01 = srQadc01;
	}

	public Double getOidSrWkfl() {
		return this.oidSrWkfl;
	}

	public void setOidSrWkfl(Double oidSrWkfl) {
		this.oidSrWkfl = oidSrWkfl;
	}

}