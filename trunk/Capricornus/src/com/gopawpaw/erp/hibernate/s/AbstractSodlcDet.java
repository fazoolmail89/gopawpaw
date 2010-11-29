package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSodlcDet entity provides the base persistence definition of the
 * SodlcDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodlcDet implements java.io.Serializable {

	// Fields

	private SodlcDetId id;
	private String sodlcTrlCode;
	private Double sodlcLcAmt;
	private String sodlcChargeType;
	private String sodlcRef;
	private Boolean sodlcOneTime;
	private Integer sodlcTimesCharged;
	private String sodlcOwnedBy;
	private String sodlcAbsShipfrom;
	private Double sodlcExtPrice;
	private String sodlcAcct;
	private String sodlcCc;
	private Boolean sodlcTaxable;
	private String sodlcTaxc;
	private String sodlcSub;
	private String sodlcProject;
	private String sodlcModUserid;
	private Date sodlcModDate;
	private String sodlcUserc01;
	private String sodlcUserc02;
	private String sodlcQadc01;
	private String sodlcQadc02;
	private Double oidSodlcDet;

	// Constructors

	/** default constructor */
	public AbstractSodlcDet() {
	}

	/** minimal constructor */
	public AbstractSodlcDet(SodlcDetId id, String sodlcTrlCode,
			Double sodlcLcAmt, String sodlcChargeType, String sodlcRef,
			Boolean sodlcOneTime, Integer sodlcTimesCharged,
			String sodlcOwnedBy, String sodlcAbsShipfrom, Double sodlcExtPrice,
			String sodlcAcct, String sodlcCc, Boolean sodlcTaxable,
			String sodlcTaxc, String sodlcSub, String sodlcProject,
			String sodlcModUserid, String sodlcUserc01, String sodlcUserc02,
			String sodlcQadc01, String sodlcQadc02, Double oidSodlcDet) {
		this.id = id;
		this.sodlcTrlCode = sodlcTrlCode;
		this.sodlcLcAmt = sodlcLcAmt;
		this.sodlcChargeType = sodlcChargeType;
		this.sodlcRef = sodlcRef;
		this.sodlcOneTime = sodlcOneTime;
		this.sodlcTimesCharged = sodlcTimesCharged;
		this.sodlcOwnedBy = sodlcOwnedBy;
		this.sodlcAbsShipfrom = sodlcAbsShipfrom;
		this.sodlcExtPrice = sodlcExtPrice;
		this.sodlcAcct = sodlcAcct;
		this.sodlcCc = sodlcCc;
		this.sodlcTaxable = sodlcTaxable;
		this.sodlcTaxc = sodlcTaxc;
		this.sodlcSub = sodlcSub;
		this.sodlcProject = sodlcProject;
		this.sodlcModUserid = sodlcModUserid;
		this.sodlcUserc01 = sodlcUserc01;
		this.sodlcUserc02 = sodlcUserc02;
		this.sodlcQadc01 = sodlcQadc01;
		this.sodlcQadc02 = sodlcQadc02;
		this.oidSodlcDet = oidSodlcDet;
	}

	/** full constructor */
	public AbstractSodlcDet(SodlcDetId id, String sodlcTrlCode,
			Double sodlcLcAmt, String sodlcChargeType, String sodlcRef,
			Boolean sodlcOneTime, Integer sodlcTimesCharged,
			String sodlcOwnedBy, String sodlcAbsShipfrom, Double sodlcExtPrice,
			String sodlcAcct, String sodlcCc, Boolean sodlcTaxable,
			String sodlcTaxc, String sodlcSub, String sodlcProject,
			String sodlcModUserid, Date sodlcModDate, String sodlcUserc01,
			String sodlcUserc02, String sodlcQadc01, String sodlcQadc02,
			Double oidSodlcDet) {
		this.id = id;
		this.sodlcTrlCode = sodlcTrlCode;
		this.sodlcLcAmt = sodlcLcAmt;
		this.sodlcChargeType = sodlcChargeType;
		this.sodlcRef = sodlcRef;
		this.sodlcOneTime = sodlcOneTime;
		this.sodlcTimesCharged = sodlcTimesCharged;
		this.sodlcOwnedBy = sodlcOwnedBy;
		this.sodlcAbsShipfrom = sodlcAbsShipfrom;
		this.sodlcExtPrice = sodlcExtPrice;
		this.sodlcAcct = sodlcAcct;
		this.sodlcCc = sodlcCc;
		this.sodlcTaxable = sodlcTaxable;
		this.sodlcTaxc = sodlcTaxc;
		this.sodlcSub = sodlcSub;
		this.sodlcProject = sodlcProject;
		this.sodlcModUserid = sodlcModUserid;
		this.sodlcModDate = sodlcModDate;
		this.sodlcUserc01 = sodlcUserc01;
		this.sodlcUserc02 = sodlcUserc02;
		this.sodlcQadc01 = sodlcQadc01;
		this.sodlcQadc02 = sodlcQadc02;
		this.oidSodlcDet = oidSodlcDet;
	}

	// Property accessors

	public SodlcDetId getId() {
		return this.id;
	}

	public void setId(SodlcDetId id) {
		this.id = id;
	}

	public String getSodlcTrlCode() {
		return this.sodlcTrlCode;
	}

	public void setSodlcTrlCode(String sodlcTrlCode) {
		this.sodlcTrlCode = sodlcTrlCode;
	}

	public Double getSodlcLcAmt() {
		return this.sodlcLcAmt;
	}

	public void setSodlcLcAmt(Double sodlcLcAmt) {
		this.sodlcLcAmt = sodlcLcAmt;
	}

	public String getSodlcChargeType() {
		return this.sodlcChargeType;
	}

	public void setSodlcChargeType(String sodlcChargeType) {
		this.sodlcChargeType = sodlcChargeType;
	}

	public String getSodlcRef() {
		return this.sodlcRef;
	}

	public void setSodlcRef(String sodlcRef) {
		this.sodlcRef = sodlcRef;
	}

	public Boolean getSodlcOneTime() {
		return this.sodlcOneTime;
	}

	public void setSodlcOneTime(Boolean sodlcOneTime) {
		this.sodlcOneTime = sodlcOneTime;
	}

	public Integer getSodlcTimesCharged() {
		return this.sodlcTimesCharged;
	}

	public void setSodlcTimesCharged(Integer sodlcTimesCharged) {
		this.sodlcTimesCharged = sodlcTimesCharged;
	}

	public String getSodlcOwnedBy() {
		return this.sodlcOwnedBy;
	}

	public void setSodlcOwnedBy(String sodlcOwnedBy) {
		this.sodlcOwnedBy = sodlcOwnedBy;
	}

	public String getSodlcAbsShipfrom() {
		return this.sodlcAbsShipfrom;
	}

	public void setSodlcAbsShipfrom(String sodlcAbsShipfrom) {
		this.sodlcAbsShipfrom = sodlcAbsShipfrom;
	}

	public Double getSodlcExtPrice() {
		return this.sodlcExtPrice;
	}

	public void setSodlcExtPrice(Double sodlcExtPrice) {
		this.sodlcExtPrice = sodlcExtPrice;
	}

	public String getSodlcAcct() {
		return this.sodlcAcct;
	}

	public void setSodlcAcct(String sodlcAcct) {
		this.sodlcAcct = sodlcAcct;
	}

	public String getSodlcCc() {
		return this.sodlcCc;
	}

	public void setSodlcCc(String sodlcCc) {
		this.sodlcCc = sodlcCc;
	}

	public Boolean getSodlcTaxable() {
		return this.sodlcTaxable;
	}

	public void setSodlcTaxable(Boolean sodlcTaxable) {
		this.sodlcTaxable = sodlcTaxable;
	}

	public String getSodlcTaxc() {
		return this.sodlcTaxc;
	}

	public void setSodlcTaxc(String sodlcTaxc) {
		this.sodlcTaxc = sodlcTaxc;
	}

	public String getSodlcSub() {
		return this.sodlcSub;
	}

	public void setSodlcSub(String sodlcSub) {
		this.sodlcSub = sodlcSub;
	}

	public String getSodlcProject() {
		return this.sodlcProject;
	}

	public void setSodlcProject(String sodlcProject) {
		this.sodlcProject = sodlcProject;
	}

	public String getSodlcModUserid() {
		return this.sodlcModUserid;
	}

	public void setSodlcModUserid(String sodlcModUserid) {
		this.sodlcModUserid = sodlcModUserid;
	}

	public Date getSodlcModDate() {
		return this.sodlcModDate;
	}

	public void setSodlcModDate(Date sodlcModDate) {
		this.sodlcModDate = sodlcModDate;
	}

	public String getSodlcUserc01() {
		return this.sodlcUserc01;
	}

	public void setSodlcUserc01(String sodlcUserc01) {
		this.sodlcUserc01 = sodlcUserc01;
	}

	public String getSodlcUserc02() {
		return this.sodlcUserc02;
	}

	public void setSodlcUserc02(String sodlcUserc02) {
		this.sodlcUserc02 = sodlcUserc02;
	}

	public String getSodlcQadc01() {
		return this.sodlcQadc01;
	}

	public void setSodlcQadc01(String sodlcQadc01) {
		this.sodlcQadc01 = sodlcQadc01;
	}

	public String getSodlcQadc02() {
		return this.sodlcQadc02;
	}

	public void setSodlcQadc02(String sodlcQadc02) {
		this.sodlcQadc02 = sodlcQadc02;
	}

	public Double getOidSodlcDet() {
		return this.oidSodlcDet;
	}

	public void setOidSodlcDet(Double oidSodlcDet) {
		this.oidSodlcDet = oidSodlcDet;
	}

}