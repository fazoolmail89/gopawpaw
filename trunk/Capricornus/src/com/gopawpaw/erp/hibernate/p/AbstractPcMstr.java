package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPcMstr entity provides the base persistence definition of the PcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcMstr implements java.io.Serializable {

	// Fields

	private PcMstrId id;
	private Date pcExpire;
	private String pcAmtType;
	private String pcQad02;
	private String pcMinQty;
	private String pcAmt;
	private Boolean pcTaxIn;
	private Double pcQad01;
	private String pcUser1;
	private String pcUser2;
	private String pcUserid;
	private Date pcModDate;
	private Double pcMinPrice;
	private String pcMaxPrice;
	private Double oidPcMstr;

	// Constructors

	/** default constructor */
	public AbstractPcMstr() {
	}

	/** minimal constructor */
	public AbstractPcMstr(PcMstrId id, Double oidPcMstr) {
		this.id = id;
		this.oidPcMstr = oidPcMstr;
	}

	/** full constructor */
	public AbstractPcMstr(PcMstrId id, Date pcExpire, String pcAmtType,
			String pcQad02, String pcMinQty, String pcAmt, Boolean pcTaxIn,
			Double pcQad01, String pcUser1, String pcUser2, String pcUserid,
			Date pcModDate, Double pcMinPrice, String pcMaxPrice,
			Double oidPcMstr) {
		this.id = id;
		this.pcExpire = pcExpire;
		this.pcAmtType = pcAmtType;
		this.pcQad02 = pcQad02;
		this.pcMinQty = pcMinQty;
		this.pcAmt = pcAmt;
		this.pcTaxIn = pcTaxIn;
		this.pcQad01 = pcQad01;
		this.pcUser1 = pcUser1;
		this.pcUser2 = pcUser2;
		this.pcUserid = pcUserid;
		this.pcModDate = pcModDate;
		this.pcMinPrice = pcMinPrice;
		this.pcMaxPrice = pcMaxPrice;
		this.oidPcMstr = oidPcMstr;
	}

	// Property accessors

	public PcMstrId getId() {
		return this.id;
	}

	public void setId(PcMstrId id) {
		this.id = id;
	}

	public Date getPcExpire() {
		return this.pcExpire;
	}

	public void setPcExpire(Date pcExpire) {
		this.pcExpire = pcExpire;
	}

	public String getPcAmtType() {
		return this.pcAmtType;
	}

	public void setPcAmtType(String pcAmtType) {
		this.pcAmtType = pcAmtType;
	}

	public String getPcQad02() {
		return this.pcQad02;
	}

	public void setPcQad02(String pcQad02) {
		this.pcQad02 = pcQad02;
	}

	public String getPcMinQty() {
		return this.pcMinQty;
	}

	public void setPcMinQty(String pcMinQty) {
		this.pcMinQty = pcMinQty;
	}

	public String getPcAmt() {
		return this.pcAmt;
	}

	public void setPcAmt(String pcAmt) {
		this.pcAmt = pcAmt;
	}

	public Boolean getPcTaxIn() {
		return this.pcTaxIn;
	}

	public void setPcTaxIn(Boolean pcTaxIn) {
		this.pcTaxIn = pcTaxIn;
	}

	public Double getPcQad01() {
		return this.pcQad01;
	}

	public void setPcQad01(Double pcQad01) {
		this.pcQad01 = pcQad01;
	}

	public String getPcUser1() {
		return this.pcUser1;
	}

	public void setPcUser1(String pcUser1) {
		this.pcUser1 = pcUser1;
	}

	public String getPcUser2() {
		return this.pcUser2;
	}

	public void setPcUser2(String pcUser2) {
		this.pcUser2 = pcUser2;
	}

	public String getPcUserid() {
		return this.pcUserid;
	}

	public void setPcUserid(String pcUserid) {
		this.pcUserid = pcUserid;
	}

	public Date getPcModDate() {
		return this.pcModDate;
	}

	public void setPcModDate(Date pcModDate) {
		this.pcModDate = pcModDate;
	}

	public Double getPcMinPrice() {
		return this.pcMinPrice;
	}

	public void setPcMinPrice(Double pcMinPrice) {
		this.pcMinPrice = pcMinPrice;
	}

	public String getPcMaxPrice() {
		return this.pcMaxPrice;
	}

	public void setPcMaxPrice(String pcMaxPrice) {
		this.pcMaxPrice = pcMaxPrice;
	}

	public Double getOidPcMstr() {
		return this.oidPcMstr;
	}

	public void setOidPcMstr(Double oidPcMstr) {
		this.oidPcMstr = oidPcMstr;
	}

}