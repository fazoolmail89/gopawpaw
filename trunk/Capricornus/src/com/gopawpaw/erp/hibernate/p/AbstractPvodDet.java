package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPvodDet entity provides the base persistence definition of the
 * PvodDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPvodDet implements java.io.Serializable {

	// Fields

	private PvodDetId id;
	private String pvodOrderType;
	private String pvodOrder;
	private Integer pvodOrderLine;
	private String pvodQadc04;
	private String pvodAccrualAcct;
	private String pvodAccrualSub;
	private String pvodAccrualCc;
	private String pvodProject;
	private Double pvodAccruedAmt;
	private Double pvodVoucheredAmt;
	private Boolean pvodCostUpdate;
	private String pvodInternalRef;
	private String pvodInternalRefType;
	private String pvodPart;
	private String pvodShipto;
	private String pvodShipfrom;
	private String pvodChannel;
	private String pvodModUserid;
	private Date pvodModDate;
	private String pvodUser1;
	private String pvodUser2;
	private String pvodQadc01;
	private String pvodQadc02;
	private String pvodQadc03;
	private Boolean pvodTaxable;
	private String pvodTaxc;
	private String pvodTaxEnv;
	private Boolean pvodTaxIn;
	private String pvodTaxUsage;
	private Double pvodQadd01;
	private Double oidPvodDet;

	// Constructors

	/** default constructor */
	public AbstractPvodDet() {
	}

	/** full constructor */
	public AbstractPvodDet(PvodDetId id, String pvodOrderType,
			String pvodOrder, Integer pvodOrderLine, String pvodQadc04,
			String pvodAccrualAcct, String pvodAccrualSub,
			String pvodAccrualCc, String pvodProject, Double pvodAccruedAmt,
			Double pvodVoucheredAmt, Boolean pvodCostUpdate,
			String pvodInternalRef, String pvodInternalRefType,
			String pvodPart, String pvodShipto, String pvodShipfrom,
			String pvodChannel, String pvodModUserid, Date pvodModDate,
			String pvodUser1, String pvodUser2, String pvodQadc01,
			String pvodQadc02, String pvodQadc03, Boolean pvodTaxable,
			String pvodTaxc, String pvodTaxEnv, Boolean pvodTaxIn,
			String pvodTaxUsage, Double pvodQadd01, Double oidPvodDet) {
		this.id = id;
		this.pvodOrderType = pvodOrderType;
		this.pvodOrder = pvodOrder;
		this.pvodOrderLine = pvodOrderLine;
		this.pvodQadc04 = pvodQadc04;
		this.pvodAccrualAcct = pvodAccrualAcct;
		this.pvodAccrualSub = pvodAccrualSub;
		this.pvodAccrualCc = pvodAccrualCc;
		this.pvodProject = pvodProject;
		this.pvodAccruedAmt = pvodAccruedAmt;
		this.pvodVoucheredAmt = pvodVoucheredAmt;
		this.pvodCostUpdate = pvodCostUpdate;
		this.pvodInternalRef = pvodInternalRef;
		this.pvodInternalRefType = pvodInternalRefType;
		this.pvodPart = pvodPart;
		this.pvodShipto = pvodShipto;
		this.pvodShipfrom = pvodShipfrom;
		this.pvodChannel = pvodChannel;
		this.pvodModUserid = pvodModUserid;
		this.pvodModDate = pvodModDate;
		this.pvodUser1 = pvodUser1;
		this.pvodUser2 = pvodUser2;
		this.pvodQadc01 = pvodQadc01;
		this.pvodQadc02 = pvodQadc02;
		this.pvodQadc03 = pvodQadc03;
		this.pvodTaxable = pvodTaxable;
		this.pvodTaxc = pvodTaxc;
		this.pvodTaxEnv = pvodTaxEnv;
		this.pvodTaxIn = pvodTaxIn;
		this.pvodTaxUsage = pvodTaxUsage;
		this.pvodQadd01 = pvodQadd01;
		this.oidPvodDet = oidPvodDet;
	}

	// Property accessors

	public PvodDetId getId() {
		return this.id;
	}

	public void setId(PvodDetId id) {
		this.id = id;
	}

	public String getPvodOrderType() {
		return this.pvodOrderType;
	}

	public void setPvodOrderType(String pvodOrderType) {
		this.pvodOrderType = pvodOrderType;
	}

	public String getPvodOrder() {
		return this.pvodOrder;
	}

	public void setPvodOrder(String pvodOrder) {
		this.pvodOrder = pvodOrder;
	}

	public Integer getPvodOrderLine() {
		return this.pvodOrderLine;
	}

	public void setPvodOrderLine(Integer pvodOrderLine) {
		this.pvodOrderLine = pvodOrderLine;
	}

	public String getPvodQadc04() {
		return this.pvodQadc04;
	}

	public void setPvodQadc04(String pvodQadc04) {
		this.pvodQadc04 = pvodQadc04;
	}

	public String getPvodAccrualAcct() {
		return this.pvodAccrualAcct;
	}

	public void setPvodAccrualAcct(String pvodAccrualAcct) {
		this.pvodAccrualAcct = pvodAccrualAcct;
	}

	public String getPvodAccrualSub() {
		return this.pvodAccrualSub;
	}

	public void setPvodAccrualSub(String pvodAccrualSub) {
		this.pvodAccrualSub = pvodAccrualSub;
	}

	public String getPvodAccrualCc() {
		return this.pvodAccrualCc;
	}

	public void setPvodAccrualCc(String pvodAccrualCc) {
		this.pvodAccrualCc = pvodAccrualCc;
	}

	public String getPvodProject() {
		return this.pvodProject;
	}

	public void setPvodProject(String pvodProject) {
		this.pvodProject = pvodProject;
	}

	public Double getPvodAccruedAmt() {
		return this.pvodAccruedAmt;
	}

	public void setPvodAccruedAmt(Double pvodAccruedAmt) {
		this.pvodAccruedAmt = pvodAccruedAmt;
	}

	public Double getPvodVoucheredAmt() {
		return this.pvodVoucheredAmt;
	}

	public void setPvodVoucheredAmt(Double pvodVoucheredAmt) {
		this.pvodVoucheredAmt = pvodVoucheredAmt;
	}

	public Boolean getPvodCostUpdate() {
		return this.pvodCostUpdate;
	}

	public void setPvodCostUpdate(Boolean pvodCostUpdate) {
		this.pvodCostUpdate = pvodCostUpdate;
	}

	public String getPvodInternalRef() {
		return this.pvodInternalRef;
	}

	public void setPvodInternalRef(String pvodInternalRef) {
		this.pvodInternalRef = pvodInternalRef;
	}

	public String getPvodInternalRefType() {
		return this.pvodInternalRefType;
	}

	public void setPvodInternalRefType(String pvodInternalRefType) {
		this.pvodInternalRefType = pvodInternalRefType;
	}

	public String getPvodPart() {
		return this.pvodPart;
	}

	public void setPvodPart(String pvodPart) {
		this.pvodPart = pvodPart;
	}

	public String getPvodShipto() {
		return this.pvodShipto;
	}

	public void setPvodShipto(String pvodShipto) {
		this.pvodShipto = pvodShipto;
	}

	public String getPvodShipfrom() {
		return this.pvodShipfrom;
	}

	public void setPvodShipfrom(String pvodShipfrom) {
		this.pvodShipfrom = pvodShipfrom;
	}

	public String getPvodChannel() {
		return this.pvodChannel;
	}

	public void setPvodChannel(String pvodChannel) {
		this.pvodChannel = pvodChannel;
	}

	public String getPvodModUserid() {
		return this.pvodModUserid;
	}

	public void setPvodModUserid(String pvodModUserid) {
		this.pvodModUserid = pvodModUserid;
	}

	public Date getPvodModDate() {
		return this.pvodModDate;
	}

	public void setPvodModDate(Date pvodModDate) {
		this.pvodModDate = pvodModDate;
	}

	public String getPvodUser1() {
		return this.pvodUser1;
	}

	public void setPvodUser1(String pvodUser1) {
		this.pvodUser1 = pvodUser1;
	}

	public String getPvodUser2() {
		return this.pvodUser2;
	}

	public void setPvodUser2(String pvodUser2) {
		this.pvodUser2 = pvodUser2;
	}

	public String getPvodQadc01() {
		return this.pvodQadc01;
	}

	public void setPvodQadc01(String pvodQadc01) {
		this.pvodQadc01 = pvodQadc01;
	}

	public String getPvodQadc02() {
		return this.pvodQadc02;
	}

	public void setPvodQadc02(String pvodQadc02) {
		this.pvodQadc02 = pvodQadc02;
	}

	public String getPvodQadc03() {
		return this.pvodQadc03;
	}

	public void setPvodQadc03(String pvodQadc03) {
		this.pvodQadc03 = pvodQadc03;
	}

	public Boolean getPvodTaxable() {
		return this.pvodTaxable;
	}

	public void setPvodTaxable(Boolean pvodTaxable) {
		this.pvodTaxable = pvodTaxable;
	}

	public String getPvodTaxc() {
		return this.pvodTaxc;
	}

	public void setPvodTaxc(String pvodTaxc) {
		this.pvodTaxc = pvodTaxc;
	}

	public String getPvodTaxEnv() {
		return this.pvodTaxEnv;
	}

	public void setPvodTaxEnv(String pvodTaxEnv) {
		this.pvodTaxEnv = pvodTaxEnv;
	}

	public Boolean getPvodTaxIn() {
		return this.pvodTaxIn;
	}

	public void setPvodTaxIn(Boolean pvodTaxIn) {
		this.pvodTaxIn = pvodTaxIn;
	}

	public String getPvodTaxUsage() {
		return this.pvodTaxUsage;
	}

	public void setPvodTaxUsage(String pvodTaxUsage) {
		this.pvodTaxUsage = pvodTaxUsage;
	}

	public Double getPvodQadd01() {
		return this.pvodQadd01;
	}

	public void setPvodQadd01(Double pvodQadd01) {
		this.pvodQadd01 = pvodQadd01;
	}

	public Double getOidPvodDet() {
		return this.oidPvodDet;
	}

	public void setOidPvodDet(Double oidPvodDet) {
		this.oidPvodDet = oidPvodDet;
	}

}