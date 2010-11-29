package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAdxDet entity provides the base persistence definition of the AdxDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdxDet implements java.io.Serializable {

	// Fields

	private AdxDetId id;
	private String adxMfgAddr;
	private String adxModUserid;
	private Date adxModDate;
	private String adxUser1;
	private String adxUser2;
	private String adxQadc01;
	private Integer adxQadi01;
	private Double adxQadd01;
	private Boolean adxQadl01;
	private Date adxQadt01;
	private Double oidAdxDet;

	// Constructors

	/** default constructor */
	public AbstractAdxDet() {
	}

	/** minimal constructor */
	public AbstractAdxDet(AdxDetId id, String adxMfgAddr, String adxModUserid,
			Date adxModDate, Double oidAdxDet) {
		this.id = id;
		this.adxMfgAddr = adxMfgAddr;
		this.adxModUserid = adxModUserid;
		this.adxModDate = adxModDate;
		this.oidAdxDet = oidAdxDet;
	}

	/** full constructor */
	public AbstractAdxDet(AdxDetId id, String adxMfgAddr, String adxModUserid,
			Date adxModDate, String adxUser1, String adxUser2,
			String adxQadc01, Integer adxQadi01, Double adxQadd01,
			Boolean adxQadl01, Date adxQadt01, Double oidAdxDet) {
		this.id = id;
		this.adxMfgAddr = adxMfgAddr;
		this.adxModUserid = adxModUserid;
		this.adxModDate = adxModDate;
		this.adxUser1 = adxUser1;
		this.adxUser2 = adxUser2;
		this.adxQadc01 = adxQadc01;
		this.adxQadi01 = adxQadi01;
		this.adxQadd01 = adxQadd01;
		this.adxQadl01 = adxQadl01;
		this.adxQadt01 = adxQadt01;
		this.oidAdxDet = oidAdxDet;
	}

	// Property accessors

	public AdxDetId getId() {
		return this.id;
	}

	public void setId(AdxDetId id) {
		this.id = id;
	}

	public String getAdxMfgAddr() {
		return this.adxMfgAddr;
	}

	public void setAdxMfgAddr(String adxMfgAddr) {
		this.adxMfgAddr = adxMfgAddr;
	}

	public String getAdxModUserid() {
		return this.adxModUserid;
	}

	public void setAdxModUserid(String adxModUserid) {
		this.adxModUserid = adxModUserid;
	}

	public Date getAdxModDate() {
		return this.adxModDate;
	}

	public void setAdxModDate(Date adxModDate) {
		this.adxModDate = adxModDate;
	}

	public String getAdxUser1() {
		return this.adxUser1;
	}

	public void setAdxUser1(String adxUser1) {
		this.adxUser1 = adxUser1;
	}

	public String getAdxUser2() {
		return this.adxUser2;
	}

	public void setAdxUser2(String adxUser2) {
		this.adxUser2 = adxUser2;
	}

	public String getAdxQadc01() {
		return this.adxQadc01;
	}

	public void setAdxQadc01(String adxQadc01) {
		this.adxQadc01 = adxQadc01;
	}

	public Integer getAdxQadi01() {
		return this.adxQadi01;
	}

	public void setAdxQadi01(Integer adxQadi01) {
		this.adxQadi01 = adxQadi01;
	}

	public Double getAdxQadd01() {
		return this.adxQadd01;
	}

	public void setAdxQadd01(Double adxQadd01) {
		this.adxQadd01 = adxQadd01;
	}

	public Boolean getAdxQadl01() {
		return this.adxQadl01;
	}

	public void setAdxQadl01(Boolean adxQadl01) {
		this.adxQadl01 = adxQadl01;
	}

	public Date getAdxQadt01() {
		return this.adxQadt01;
	}

	public void setAdxQadt01(Date adxQadt01) {
		this.adxQadt01 = adxQadt01;
	}

	public Double getOidAdxDet() {
		return this.oidAdxDet;
	}

	public void setOidAdxDet(Double oidAdxDet) {
		this.oidAdxDet = oidAdxDet;
	}

}