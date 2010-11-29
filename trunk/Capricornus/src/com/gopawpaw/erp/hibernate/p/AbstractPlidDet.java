package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPlidDet entity provides the base persistence definition of the
 * PlidDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlidDet implements java.io.Serializable {

	// Fields

	private PlidDetId id;
	private String plidOrderType;
	private String plidOrder;
	private Integer plidOrderLine;
	private Double plidInvQty;
	private Double plidInvCost;
	private Integer plidPvoId;
	private Boolean plidTaxable;
	private String plidTaxc;
	private String plidTaxEnv;
	private Boolean plidTaxIn;
	private String plidTaxUsage;
	private Date plidModDate;
	private String plidModUserid;
	private String plidUser1;
	private String plidUser2;
	private String plidQadc01;
	private String plidQadc02;
	private Double oidPlidDet;

	// Constructors

	/** default constructor */
	public AbstractPlidDet() {
	}

	/** full constructor */
	public AbstractPlidDet(PlidDetId id, String plidOrderType,
			String plidOrder, Integer plidOrderLine, Double plidInvQty,
			Double plidInvCost, Integer plidPvoId, Boolean plidTaxable,
			String plidTaxc, String plidTaxEnv, Boolean plidTaxIn,
			String plidTaxUsage, Date plidModDate, String plidModUserid,
			String plidUser1, String plidUser2, String plidQadc01,
			String plidQadc02, Double oidPlidDet) {
		this.id = id;
		this.plidOrderType = plidOrderType;
		this.plidOrder = plidOrder;
		this.plidOrderLine = plidOrderLine;
		this.plidInvQty = plidInvQty;
		this.plidInvCost = plidInvCost;
		this.plidPvoId = plidPvoId;
		this.plidTaxable = plidTaxable;
		this.plidTaxc = plidTaxc;
		this.plidTaxEnv = plidTaxEnv;
		this.plidTaxIn = plidTaxIn;
		this.plidTaxUsage = plidTaxUsage;
		this.plidModDate = plidModDate;
		this.plidModUserid = plidModUserid;
		this.plidUser1 = plidUser1;
		this.plidUser2 = plidUser2;
		this.plidQadc01 = plidQadc01;
		this.plidQadc02 = plidQadc02;
		this.oidPlidDet = oidPlidDet;
	}

	// Property accessors

	public PlidDetId getId() {
		return this.id;
	}

	public void setId(PlidDetId id) {
		this.id = id;
	}

	public String getPlidOrderType() {
		return this.plidOrderType;
	}

	public void setPlidOrderType(String plidOrderType) {
		this.plidOrderType = plidOrderType;
	}

	public String getPlidOrder() {
		return this.plidOrder;
	}

	public void setPlidOrder(String plidOrder) {
		this.plidOrder = plidOrder;
	}

	public Integer getPlidOrderLine() {
		return this.plidOrderLine;
	}

	public void setPlidOrderLine(Integer plidOrderLine) {
		this.plidOrderLine = plidOrderLine;
	}

	public Double getPlidInvQty() {
		return this.plidInvQty;
	}

	public void setPlidInvQty(Double plidInvQty) {
		this.plidInvQty = plidInvQty;
	}

	public Double getPlidInvCost() {
		return this.plidInvCost;
	}

	public void setPlidInvCost(Double plidInvCost) {
		this.plidInvCost = plidInvCost;
	}

	public Integer getPlidPvoId() {
		return this.plidPvoId;
	}

	public void setPlidPvoId(Integer plidPvoId) {
		this.plidPvoId = plidPvoId;
	}

	public Boolean getPlidTaxable() {
		return this.plidTaxable;
	}

	public void setPlidTaxable(Boolean plidTaxable) {
		this.plidTaxable = plidTaxable;
	}

	public String getPlidTaxc() {
		return this.plidTaxc;
	}

	public void setPlidTaxc(String plidTaxc) {
		this.plidTaxc = plidTaxc;
	}

	public String getPlidTaxEnv() {
		return this.plidTaxEnv;
	}

	public void setPlidTaxEnv(String plidTaxEnv) {
		this.plidTaxEnv = plidTaxEnv;
	}

	public Boolean getPlidTaxIn() {
		return this.plidTaxIn;
	}

	public void setPlidTaxIn(Boolean plidTaxIn) {
		this.plidTaxIn = plidTaxIn;
	}

	public String getPlidTaxUsage() {
		return this.plidTaxUsage;
	}

	public void setPlidTaxUsage(String plidTaxUsage) {
		this.plidTaxUsage = plidTaxUsage;
	}

	public Date getPlidModDate() {
		return this.plidModDate;
	}

	public void setPlidModDate(Date plidModDate) {
		this.plidModDate = plidModDate;
	}

	public String getPlidModUserid() {
		return this.plidModUserid;
	}

	public void setPlidModUserid(String plidModUserid) {
		this.plidModUserid = plidModUserid;
	}

	public String getPlidUser1() {
		return this.plidUser1;
	}

	public void setPlidUser1(String plidUser1) {
		this.plidUser1 = plidUser1;
	}

	public String getPlidUser2() {
		return this.plidUser2;
	}

	public void setPlidUser2(String plidUser2) {
		this.plidUser2 = plidUser2;
	}

	public String getPlidQadc01() {
		return this.plidQadc01;
	}

	public void setPlidQadc01(String plidQadc01) {
		this.plidQadc01 = plidQadc01;
	}

	public String getPlidQadc02() {
		return this.plidQadc02;
	}

	public void setPlidQadc02(String plidQadc02) {
		this.plidQadc02 = plidQadc02;
	}

	public Double getOidPlidDet() {
		return this.oidPlidDet;
	}

	public void setOidPlidDet(Double oidPlidDet) {
		this.oidPlidDet = oidPlidDet;
	}

}