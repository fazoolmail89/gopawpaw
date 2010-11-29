package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMrpDet entity provides the base persistence definition of the MrpDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMrpDet implements java.io.Serializable {

	// Fields

	private MrpDetId id;
	private Date mrpRelDate;
	private Date mrpDueDate;
	private Double mrpQty;
	private String mrpType;
	private String mrpDetail;
	private Boolean mrpQad01;
	private String mrpSite;
	private String mrpUser1;
	private String mrpUser2;
	private String mrpOrdSite;
	private Integer mrpKeyid;
	private Double oidMrpDet;

	// Constructors

	/** default constructor */
	public AbstractMrpDet() {
	}

	/** minimal constructor */
	public AbstractMrpDet(MrpDetId id, Integer mrpKeyid, Double oidMrpDet) {
		this.id = id;
		this.mrpKeyid = mrpKeyid;
		this.oidMrpDet = oidMrpDet;
	}

	/** full constructor */
	public AbstractMrpDet(MrpDetId id, Date mrpRelDate, Date mrpDueDate,
			Double mrpQty, String mrpType, String mrpDetail, Boolean mrpQad01,
			String mrpSite, String mrpUser1, String mrpUser2,
			String mrpOrdSite, Integer mrpKeyid, Double oidMrpDet) {
		this.id = id;
		this.mrpRelDate = mrpRelDate;
		this.mrpDueDate = mrpDueDate;
		this.mrpQty = mrpQty;
		this.mrpType = mrpType;
		this.mrpDetail = mrpDetail;
		this.mrpQad01 = mrpQad01;
		this.mrpSite = mrpSite;
		this.mrpUser1 = mrpUser1;
		this.mrpUser2 = mrpUser2;
		this.mrpOrdSite = mrpOrdSite;
		this.mrpKeyid = mrpKeyid;
		this.oidMrpDet = oidMrpDet;
	}

	// Property accessors

	public MrpDetId getId() {
		return this.id;
	}

	public void setId(MrpDetId id) {
		this.id = id;
	}

	public Date getMrpRelDate() {
		return this.mrpRelDate;
	}

	public void setMrpRelDate(Date mrpRelDate) {
		this.mrpRelDate = mrpRelDate;
	}

	public Date getMrpDueDate() {
		return this.mrpDueDate;
	}

	public void setMrpDueDate(Date mrpDueDate) {
		this.mrpDueDate = mrpDueDate;
	}

	public Double getMrpQty() {
		return this.mrpQty;
	}

	public void setMrpQty(Double mrpQty) {
		this.mrpQty = mrpQty;
	}

	public String getMrpType() {
		return this.mrpType;
	}

	public void setMrpType(String mrpType) {
		this.mrpType = mrpType;
	}

	public String getMrpDetail() {
		return this.mrpDetail;
	}

	public void setMrpDetail(String mrpDetail) {
		this.mrpDetail = mrpDetail;
	}

	public Boolean getMrpQad01() {
		return this.mrpQad01;
	}

	public void setMrpQad01(Boolean mrpQad01) {
		this.mrpQad01 = mrpQad01;
	}

	public String getMrpSite() {
		return this.mrpSite;
	}

	public void setMrpSite(String mrpSite) {
		this.mrpSite = mrpSite;
	}

	public String getMrpUser1() {
		return this.mrpUser1;
	}

	public void setMrpUser1(String mrpUser1) {
		this.mrpUser1 = mrpUser1;
	}

	public String getMrpUser2() {
		return this.mrpUser2;
	}

	public void setMrpUser2(String mrpUser2) {
		this.mrpUser2 = mrpUser2;
	}

	public String getMrpOrdSite() {
		return this.mrpOrdSite;
	}

	public void setMrpOrdSite(String mrpOrdSite) {
		this.mrpOrdSite = mrpOrdSite;
	}

	public Integer getMrpKeyid() {
		return this.mrpKeyid;
	}

	public void setMrpKeyid(Integer mrpKeyid) {
		this.mrpKeyid = mrpKeyid;
	}

	public Double getOidMrpDet() {
		return this.oidMrpDet;
	}

	public void setOidMrpDet(Double oidMrpDet) {
		this.oidMrpDet = oidMrpDet;
	}

}