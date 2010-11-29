package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLpmMstr entity provides the base persistence definition of the
 * LpmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLpmMstr implements java.io.Serializable {

	// Fields

	private String lpmProduct;
	private String lpmDesc;
	private Boolean lpmLicReq;
	private String lpmModUserid;
	private Date lpmModDate;
	private String lpmQadc01;
	private String lpmQadc02;
	private Double lpmQadd01;
	private Date lpmQadt01;
	private String lpmVerList;
	private Double oidLpmMstr;

	// Constructors

	/** default constructor */
	public AbstractLpmMstr() {
	}

	/** minimal constructor */
	public AbstractLpmMstr(String lpmDesc, Boolean lpmLicReq,
			String lpmModUserid, Date lpmModDate, String lpmQadc01,
			String lpmQadc02, Double lpmQadd01, String lpmVerList,
			Double oidLpmMstr) {
		this.lpmDesc = lpmDesc;
		this.lpmLicReq = lpmLicReq;
		this.lpmModUserid = lpmModUserid;
		this.lpmModDate = lpmModDate;
		this.lpmQadc01 = lpmQadc01;
		this.lpmQadc02 = lpmQadc02;
		this.lpmQadd01 = lpmQadd01;
		this.lpmVerList = lpmVerList;
		this.oidLpmMstr = oidLpmMstr;
	}

	/** full constructor */
	public AbstractLpmMstr(String lpmDesc, Boolean lpmLicReq,
			String lpmModUserid, Date lpmModDate, String lpmQadc01,
			String lpmQadc02, Double lpmQadd01, Date lpmQadt01,
			String lpmVerList, Double oidLpmMstr) {
		this.lpmDesc = lpmDesc;
		this.lpmLicReq = lpmLicReq;
		this.lpmModUserid = lpmModUserid;
		this.lpmModDate = lpmModDate;
		this.lpmQadc01 = lpmQadc01;
		this.lpmQadc02 = lpmQadc02;
		this.lpmQadd01 = lpmQadd01;
		this.lpmQadt01 = lpmQadt01;
		this.lpmVerList = lpmVerList;
		this.oidLpmMstr = oidLpmMstr;
	}

	// Property accessors

	public String getLpmProduct() {
		return this.lpmProduct;
	}

	public void setLpmProduct(String lpmProduct) {
		this.lpmProduct = lpmProduct;
	}

	public String getLpmDesc() {
		return this.lpmDesc;
	}

	public void setLpmDesc(String lpmDesc) {
		this.lpmDesc = lpmDesc;
	}

	public Boolean getLpmLicReq() {
		return this.lpmLicReq;
	}

	public void setLpmLicReq(Boolean lpmLicReq) {
		this.lpmLicReq = lpmLicReq;
	}

	public String getLpmModUserid() {
		return this.lpmModUserid;
	}

	public void setLpmModUserid(String lpmModUserid) {
		this.lpmModUserid = lpmModUserid;
	}

	public Date getLpmModDate() {
		return this.lpmModDate;
	}

	public void setLpmModDate(Date lpmModDate) {
		this.lpmModDate = lpmModDate;
	}

	public String getLpmQadc01() {
		return this.lpmQadc01;
	}

	public void setLpmQadc01(String lpmQadc01) {
		this.lpmQadc01 = lpmQadc01;
	}

	public String getLpmQadc02() {
		return this.lpmQadc02;
	}

	public void setLpmQadc02(String lpmQadc02) {
		this.lpmQadc02 = lpmQadc02;
	}

	public Double getLpmQadd01() {
		return this.lpmQadd01;
	}

	public void setLpmQadd01(Double lpmQadd01) {
		this.lpmQadd01 = lpmQadd01;
	}

	public Date getLpmQadt01() {
		return this.lpmQadt01;
	}

	public void setLpmQadt01(Date lpmQadt01) {
		this.lpmQadt01 = lpmQadt01;
	}

	public String getLpmVerList() {
		return this.lpmVerList;
	}

	public void setLpmVerList(String lpmVerList) {
		this.lpmVerList = lpmVerList;
	}

	public Double getOidLpmMstr() {
		return this.oidLpmMstr;
	}

	public void setOidLpmMstr(Double oidLpmMstr) {
		this.oidLpmMstr = oidLpmMstr;
	}

}