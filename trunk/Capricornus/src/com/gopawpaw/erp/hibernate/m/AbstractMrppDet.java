package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMrppDet entity provides the base persistence definition of the
 * MrppDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMrppDet implements java.io.Serializable {

	// Fields

	private MrppDetId id;
	private Double mrppQtyPegged;
	private Date mrppDemandDueDate;
	private Date mrppSupplyDueDate;
	private String mrppModUserid;
	private Date mrppModDate;
	private String mrppUser1;
	private String mrppUser2;
	private String mrppQadc01;
	private String mrppQadc02;
	private Double oidMrppDet;

	// Constructors

	/** default constructor */
	public AbstractMrppDet() {
	}

	/** full constructor */
	public AbstractMrppDet(MrppDetId id, Double mrppQtyPegged,
			Date mrppDemandDueDate, Date mrppSupplyDueDate,
			String mrppModUserid, Date mrppModDate, String mrppUser1,
			String mrppUser2, String mrppQadc01, String mrppQadc02,
			Double oidMrppDet) {
		this.id = id;
		this.mrppQtyPegged = mrppQtyPegged;
		this.mrppDemandDueDate = mrppDemandDueDate;
		this.mrppSupplyDueDate = mrppSupplyDueDate;
		this.mrppModUserid = mrppModUserid;
		this.mrppModDate = mrppModDate;
		this.mrppUser1 = mrppUser1;
		this.mrppUser2 = mrppUser2;
		this.mrppQadc01 = mrppQadc01;
		this.mrppQadc02 = mrppQadc02;
		this.oidMrppDet = oidMrppDet;
	}

	// Property accessors

	public MrppDetId getId() {
		return this.id;
	}

	public void setId(MrppDetId id) {
		this.id = id;
	}

	public Double getMrppQtyPegged() {
		return this.mrppQtyPegged;
	}

	public void setMrppQtyPegged(Double mrppQtyPegged) {
		this.mrppQtyPegged = mrppQtyPegged;
	}

	public Date getMrppDemandDueDate() {
		return this.mrppDemandDueDate;
	}

	public void setMrppDemandDueDate(Date mrppDemandDueDate) {
		this.mrppDemandDueDate = mrppDemandDueDate;
	}

	public Date getMrppSupplyDueDate() {
		return this.mrppSupplyDueDate;
	}

	public void setMrppSupplyDueDate(Date mrppSupplyDueDate) {
		this.mrppSupplyDueDate = mrppSupplyDueDate;
	}

	public String getMrppModUserid() {
		return this.mrppModUserid;
	}

	public void setMrppModUserid(String mrppModUserid) {
		this.mrppModUserid = mrppModUserid;
	}

	public Date getMrppModDate() {
		return this.mrppModDate;
	}

	public void setMrppModDate(Date mrppModDate) {
		this.mrppModDate = mrppModDate;
	}

	public String getMrppUser1() {
		return this.mrppUser1;
	}

	public void setMrppUser1(String mrppUser1) {
		this.mrppUser1 = mrppUser1;
	}

	public String getMrppUser2() {
		return this.mrppUser2;
	}

	public void setMrppUser2(String mrppUser2) {
		this.mrppUser2 = mrppUser2;
	}

	public String getMrppQadc01() {
		return this.mrppQadc01;
	}

	public void setMrppQadc01(String mrppQadc01) {
		this.mrppQadc01 = mrppQadc01;
	}

	public String getMrppQadc02() {
		return this.mrppQadc02;
	}

	public void setMrppQadc02(String mrppQadc02) {
		this.mrppQadc02 = mrppQadc02;
	}

	public Double getOidMrppDet() {
		return this.oidMrppDet;
	}

	public void setOidMrppDet(Double oidMrppDet) {
		this.oidMrppDet = oidMrppDet;
	}

}