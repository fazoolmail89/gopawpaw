package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCclscdDet entity provides the base persistence definition of the
 * CclscdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclscdDet implements java.io.Serializable {

	// Fields

	private CclscdDetId id;
	private Date cclscdExpire;
	private Double cclscdPrice;
	private String cclscdRef;
	private String cclscdModUserid;
	private Date cclscdModDate;
	private String cclscdUserc01;
	private String cclscdUserc02;
	private String cclscdQadc01;
	private String cclscdQadc02;
	private Double oidCclscdDet;

	// Constructors

	/** default constructor */
	public AbstractCclscdDet() {
	}

	/** minimal constructor */
	public AbstractCclscdDet(CclscdDetId id, Double cclscdPrice,
			String cclscdRef, String cclscdModUserid, String cclscdUserc01,
			String cclscdUserc02, String cclscdQadc01, String cclscdQadc02,
			Double oidCclscdDet) {
		this.id = id;
		this.cclscdPrice = cclscdPrice;
		this.cclscdRef = cclscdRef;
		this.cclscdModUserid = cclscdModUserid;
		this.cclscdUserc01 = cclscdUserc01;
		this.cclscdUserc02 = cclscdUserc02;
		this.cclscdQadc01 = cclscdQadc01;
		this.cclscdQadc02 = cclscdQadc02;
		this.oidCclscdDet = oidCclscdDet;
	}

	/** full constructor */
	public AbstractCclscdDet(CclscdDetId id, Date cclscdExpire,
			Double cclscdPrice, String cclscdRef, String cclscdModUserid,
			Date cclscdModDate, String cclscdUserc01, String cclscdUserc02,
			String cclscdQadc01, String cclscdQadc02, Double oidCclscdDet) {
		this.id = id;
		this.cclscdExpire = cclscdExpire;
		this.cclscdPrice = cclscdPrice;
		this.cclscdRef = cclscdRef;
		this.cclscdModUserid = cclscdModUserid;
		this.cclscdModDate = cclscdModDate;
		this.cclscdUserc01 = cclscdUserc01;
		this.cclscdUserc02 = cclscdUserc02;
		this.cclscdQadc01 = cclscdQadc01;
		this.cclscdQadc02 = cclscdQadc02;
		this.oidCclscdDet = oidCclscdDet;
	}

	// Property accessors

	public CclscdDetId getId() {
		return this.id;
	}

	public void setId(CclscdDetId id) {
		this.id = id;
	}

	public Date getCclscdExpire() {
		return this.cclscdExpire;
	}

	public void setCclscdExpire(Date cclscdExpire) {
		this.cclscdExpire = cclscdExpire;
	}

	public Double getCclscdPrice() {
		return this.cclscdPrice;
	}

	public void setCclscdPrice(Double cclscdPrice) {
		this.cclscdPrice = cclscdPrice;
	}

	public String getCclscdRef() {
		return this.cclscdRef;
	}

	public void setCclscdRef(String cclscdRef) {
		this.cclscdRef = cclscdRef;
	}

	public String getCclscdModUserid() {
		return this.cclscdModUserid;
	}

	public void setCclscdModUserid(String cclscdModUserid) {
		this.cclscdModUserid = cclscdModUserid;
	}

	public Date getCclscdModDate() {
		return this.cclscdModDate;
	}

	public void setCclscdModDate(Date cclscdModDate) {
		this.cclscdModDate = cclscdModDate;
	}

	public String getCclscdUserc01() {
		return this.cclscdUserc01;
	}

	public void setCclscdUserc01(String cclscdUserc01) {
		this.cclscdUserc01 = cclscdUserc01;
	}

	public String getCclscdUserc02() {
		return this.cclscdUserc02;
	}

	public void setCclscdUserc02(String cclscdUserc02) {
		this.cclscdUserc02 = cclscdUserc02;
	}

	public String getCclscdQadc01() {
		return this.cclscdQadc01;
	}

	public void setCclscdQadc01(String cclscdQadc01) {
		this.cclscdQadc01 = cclscdQadc01;
	}

	public String getCclscdQadc02() {
		return this.cclscdQadc02;
	}

	public void setCclscdQadc02(String cclscdQadc02) {
		this.cclscdQadc02 = cclscdQadc02;
	}

	public Double getOidCclscdDet() {
		return this.oidCclscdDet;
	}

	public void setOidCclscdDet(Double oidCclscdDet) {
		this.oidCclscdDet = oidCclscdDet;
	}

}