package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtcDet entity provides the base persistence definition of the PtcDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtcDet implements java.io.Serializable {

	// Fields

	private PtcDetId id;
	private Boolean ptcCharge;
	private String ptcChargeType;
	private String ptcContainerDesc;
	private String ptcContainerType;
	private String ptcContainerRef;
	private String ptcModUserid;
	private Date ptcModDate;
	private String ptcUserc01;
	private String ptcUserc02;
	private String ptcQadc01;
	private String ptcQadc02;
	private Double oidPtcDet;

	// Constructors

	/** default constructor */
	public AbstractPtcDet() {
	}

	/** minimal constructor */
	public AbstractPtcDet(PtcDetId id, Boolean ptcCharge, String ptcChargeType,
			String ptcContainerDesc, String ptcContainerType,
			String ptcContainerRef, String ptcModUserid, String ptcUserc01,
			String ptcUserc02, String ptcQadc01, String ptcQadc02,
			Double oidPtcDet) {
		this.id = id;
		this.ptcCharge = ptcCharge;
		this.ptcChargeType = ptcChargeType;
		this.ptcContainerDesc = ptcContainerDesc;
		this.ptcContainerType = ptcContainerType;
		this.ptcContainerRef = ptcContainerRef;
		this.ptcModUserid = ptcModUserid;
		this.ptcUserc01 = ptcUserc01;
		this.ptcUserc02 = ptcUserc02;
		this.ptcQadc01 = ptcQadc01;
		this.ptcQadc02 = ptcQadc02;
		this.oidPtcDet = oidPtcDet;
	}

	/** full constructor */
	public AbstractPtcDet(PtcDetId id, Boolean ptcCharge, String ptcChargeType,
			String ptcContainerDesc, String ptcContainerType,
			String ptcContainerRef, String ptcModUserid, Date ptcModDate,
			String ptcUserc01, String ptcUserc02, String ptcQadc01,
			String ptcQadc02, Double oidPtcDet) {
		this.id = id;
		this.ptcCharge = ptcCharge;
		this.ptcChargeType = ptcChargeType;
		this.ptcContainerDesc = ptcContainerDesc;
		this.ptcContainerType = ptcContainerType;
		this.ptcContainerRef = ptcContainerRef;
		this.ptcModUserid = ptcModUserid;
		this.ptcModDate = ptcModDate;
		this.ptcUserc01 = ptcUserc01;
		this.ptcUserc02 = ptcUserc02;
		this.ptcQadc01 = ptcQadc01;
		this.ptcQadc02 = ptcQadc02;
		this.oidPtcDet = oidPtcDet;
	}

	// Property accessors

	public PtcDetId getId() {
		return this.id;
	}

	public void setId(PtcDetId id) {
		this.id = id;
	}

	public Boolean getPtcCharge() {
		return this.ptcCharge;
	}

	public void setPtcCharge(Boolean ptcCharge) {
		this.ptcCharge = ptcCharge;
	}

	public String getPtcChargeType() {
		return this.ptcChargeType;
	}

	public void setPtcChargeType(String ptcChargeType) {
		this.ptcChargeType = ptcChargeType;
	}

	public String getPtcContainerDesc() {
		return this.ptcContainerDesc;
	}

	public void setPtcContainerDesc(String ptcContainerDesc) {
		this.ptcContainerDesc = ptcContainerDesc;
	}

	public String getPtcContainerType() {
		return this.ptcContainerType;
	}

	public void setPtcContainerType(String ptcContainerType) {
		this.ptcContainerType = ptcContainerType;
	}

	public String getPtcContainerRef() {
		return this.ptcContainerRef;
	}

	public void setPtcContainerRef(String ptcContainerRef) {
		this.ptcContainerRef = ptcContainerRef;
	}

	public String getPtcModUserid() {
		return this.ptcModUserid;
	}

	public void setPtcModUserid(String ptcModUserid) {
		this.ptcModUserid = ptcModUserid;
	}

	public Date getPtcModDate() {
		return this.ptcModDate;
	}

	public void setPtcModDate(Date ptcModDate) {
		this.ptcModDate = ptcModDate;
	}

	public String getPtcUserc01() {
		return this.ptcUserc01;
	}

	public void setPtcUserc01(String ptcUserc01) {
		this.ptcUserc01 = ptcUserc01;
	}

	public String getPtcUserc02() {
		return this.ptcUserc02;
	}

	public void setPtcUserc02(String ptcUserc02) {
		this.ptcUserc02 = ptcUserc02;
	}

	public String getPtcQadc01() {
		return this.ptcQadc01;
	}

	public void setPtcQadc01(String ptcQadc01) {
		this.ptcQadc01 = ptcQadc01;
	}

	public String getPtcQadc02() {
		return this.ptcQadc02;
	}

	public void setPtcQadc02(String ptcQadc02) {
		this.ptcQadc02 = ptcQadc02;
	}

	public Double getOidPtcDet() {
		return this.oidPtcDet;
	}

	public void setOidPtcDet(Double oidPtcDet) {
		this.oidPtcDet = oidPtcDet;
	}

}