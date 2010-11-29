package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPttDet entity provides the base persistence definition of the PttDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPttDet implements java.io.Serializable {

	// Fields

	private PttDetId id;
	private String pttTaxc;
	private Boolean pttTaxable;
	private String pttUser1;
	private String pttUser2;
	private String pttUserid;
	private Date pttModDate;
	private String pttQadc01;
	private Double oidPttDet;

	// Constructors

	/** default constructor */
	public AbstractPttDet() {
	}

	/** minimal constructor */
	public AbstractPttDet(PttDetId id, Double oidPttDet) {
		this.id = id;
		this.oidPttDet = oidPttDet;
	}

	/** full constructor */
	public AbstractPttDet(PttDetId id, String pttTaxc, Boolean pttTaxable,
			String pttUser1, String pttUser2, String pttUserid,
			Date pttModDate, String pttQadc01, Double oidPttDet) {
		this.id = id;
		this.pttTaxc = pttTaxc;
		this.pttTaxable = pttTaxable;
		this.pttUser1 = pttUser1;
		this.pttUser2 = pttUser2;
		this.pttUserid = pttUserid;
		this.pttModDate = pttModDate;
		this.pttQadc01 = pttQadc01;
		this.oidPttDet = oidPttDet;
	}

	// Property accessors

	public PttDetId getId() {
		return this.id;
	}

	public void setId(PttDetId id) {
		this.id = id;
	}

	public String getPttTaxc() {
		return this.pttTaxc;
	}

	public void setPttTaxc(String pttTaxc) {
		this.pttTaxc = pttTaxc;
	}

	public Boolean getPttTaxable() {
		return this.pttTaxable;
	}

	public void setPttTaxable(Boolean pttTaxable) {
		this.pttTaxable = pttTaxable;
	}

	public String getPttUser1() {
		return this.pttUser1;
	}

	public void setPttUser1(String pttUser1) {
		this.pttUser1 = pttUser1;
	}

	public String getPttUser2() {
		return this.pttUser2;
	}

	public void setPttUser2(String pttUser2) {
		this.pttUser2 = pttUser2;
	}

	public String getPttUserid() {
		return this.pttUserid;
	}

	public void setPttUserid(String pttUserid) {
		this.pttUserid = pttUserid;
	}

	public Date getPttModDate() {
		return this.pttModDate;
	}

	public void setPttModDate(Date pttModDate) {
		this.pttModDate = pttModDate;
	}

	public String getPttQadc01() {
		return this.pttQadc01;
	}

	public void setPttQadc01(String pttQadc01) {
		this.pttQadc01 = pttQadc01;
	}

	public Double getOidPttDet() {
		return this.oidPttDet;
	}

	public void setOidPttDet(Double oidPttDet) {
		this.oidPttDet = oidPttDet;
	}

}