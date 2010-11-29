package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSptDet entity provides the base persistence definition of the SptDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSptDet implements java.io.Serializable {

	// Fields

	private SptDetId id;
	private Double sptCstTl;
	private Double sptCstLl;
	private String sptUser1;
	private String sptUser2;
	private String sptUserid;
	private Date sptModDate;
	private Double sptPctTl;
	private Double sptPctLl;
	private Boolean sptAo;
	private String sptQadc01;
	private Double oidSptDet;

	// Constructors

	/** default constructor */
	public AbstractSptDet() {
	}

	/** minimal constructor */
	public AbstractSptDet(SptDetId id, Double oidSptDet) {
		this.id = id;
		this.oidSptDet = oidSptDet;
	}

	/** full constructor */
	public AbstractSptDet(SptDetId id, Double sptCstTl, Double sptCstLl,
			String sptUser1, String sptUser2, String sptUserid,
			Date sptModDate, Double sptPctTl, Double sptPctLl, Boolean sptAo,
			String sptQadc01, Double oidSptDet) {
		this.id = id;
		this.sptCstTl = sptCstTl;
		this.sptCstLl = sptCstLl;
		this.sptUser1 = sptUser1;
		this.sptUser2 = sptUser2;
		this.sptUserid = sptUserid;
		this.sptModDate = sptModDate;
		this.sptPctTl = sptPctTl;
		this.sptPctLl = sptPctLl;
		this.sptAo = sptAo;
		this.sptQadc01 = sptQadc01;
		this.oidSptDet = oidSptDet;
	}

	// Property accessors

	public SptDetId getId() {
		return this.id;
	}

	public void setId(SptDetId id) {
		this.id = id;
	}

	public Double getSptCstTl() {
		return this.sptCstTl;
	}

	public void setSptCstTl(Double sptCstTl) {
		this.sptCstTl = sptCstTl;
	}

	public Double getSptCstLl() {
		return this.sptCstLl;
	}

	public void setSptCstLl(Double sptCstLl) {
		this.sptCstLl = sptCstLl;
	}

	public String getSptUser1() {
		return this.sptUser1;
	}

	public void setSptUser1(String sptUser1) {
		this.sptUser1 = sptUser1;
	}

	public String getSptUser2() {
		return this.sptUser2;
	}

	public void setSptUser2(String sptUser2) {
		this.sptUser2 = sptUser2;
	}

	public String getSptUserid() {
		return this.sptUserid;
	}

	public void setSptUserid(String sptUserid) {
		this.sptUserid = sptUserid;
	}

	public Date getSptModDate() {
		return this.sptModDate;
	}

	public void setSptModDate(Date sptModDate) {
		this.sptModDate = sptModDate;
	}

	public Double getSptPctTl() {
		return this.sptPctTl;
	}

	public void setSptPctTl(Double sptPctTl) {
		this.sptPctTl = sptPctTl;
	}

	public Double getSptPctLl() {
		return this.sptPctLl;
	}

	public void setSptPctLl(Double sptPctLl) {
		this.sptPctLl = sptPctLl;
	}

	public Boolean getSptAo() {
		return this.sptAo;
	}

	public void setSptAo(Boolean sptAo) {
		this.sptAo = sptAo;
	}

	public String getSptQadc01() {
		return this.sptQadc01;
	}

	public void setSptQadc01(String sptQadc01) {
		this.sptQadc01 = sptQadc01;
	}

	public Double getOidSptDet() {
		return this.oidSptDet;
	}

	public void setOidSptDet(Double oidSptDet) {
		this.oidSptDet = oidSptDet;
	}

}