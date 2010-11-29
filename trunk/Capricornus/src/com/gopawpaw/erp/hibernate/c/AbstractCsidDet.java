package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCsidDet entity provides the base persistence definition of the
 * CsidDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsidDet implements java.io.Serializable {

	// Fields

	private CsidDetId id;
	private Date csidStart;
	private Date csidEnd;
	private String csidStatus;
	private String csidClass;
	private String csidPref;
	private String csidAddr1;
	private String csidAddr2;
	private String csidAddr3;
	private String csidOrigCtry;
	private Double csidOrigPct;
	private Boolean csidIntrastat;
	private String csidUser1;
	private String csidUser2;
	private String csidQadc01;
	private Double oidCsidDet;

	// Constructors

	/** default constructor */
	public AbstractCsidDet() {
	}

	/** minimal constructor */
	public AbstractCsidDet(CsidDetId id, Double oidCsidDet) {
		this.id = id;
		this.oidCsidDet = oidCsidDet;
	}

	/** full constructor */
	public AbstractCsidDet(CsidDetId id, Date csidStart, Date csidEnd,
			String csidStatus, String csidClass, String csidPref,
			String csidAddr1, String csidAddr2, String csidAddr3,
			String csidOrigCtry, Double csidOrigPct, Boolean csidIntrastat,
			String csidUser1, String csidUser2, String csidQadc01,
			Double oidCsidDet) {
		this.id = id;
		this.csidStart = csidStart;
		this.csidEnd = csidEnd;
		this.csidStatus = csidStatus;
		this.csidClass = csidClass;
		this.csidPref = csidPref;
		this.csidAddr1 = csidAddr1;
		this.csidAddr2 = csidAddr2;
		this.csidAddr3 = csidAddr3;
		this.csidOrigCtry = csidOrigCtry;
		this.csidOrigPct = csidOrigPct;
		this.csidIntrastat = csidIntrastat;
		this.csidUser1 = csidUser1;
		this.csidUser2 = csidUser2;
		this.csidQadc01 = csidQadc01;
		this.oidCsidDet = oidCsidDet;
	}

	// Property accessors

	public CsidDetId getId() {
		return this.id;
	}

	public void setId(CsidDetId id) {
		this.id = id;
	}

	public Date getCsidStart() {
		return this.csidStart;
	}

	public void setCsidStart(Date csidStart) {
		this.csidStart = csidStart;
	}

	public Date getCsidEnd() {
		return this.csidEnd;
	}

	public void setCsidEnd(Date csidEnd) {
		this.csidEnd = csidEnd;
	}

	public String getCsidStatus() {
		return this.csidStatus;
	}

	public void setCsidStatus(String csidStatus) {
		this.csidStatus = csidStatus;
	}

	public String getCsidClass() {
		return this.csidClass;
	}

	public void setCsidClass(String csidClass) {
		this.csidClass = csidClass;
	}

	public String getCsidPref() {
		return this.csidPref;
	}

	public void setCsidPref(String csidPref) {
		this.csidPref = csidPref;
	}

	public String getCsidAddr1() {
		return this.csidAddr1;
	}

	public void setCsidAddr1(String csidAddr1) {
		this.csidAddr1 = csidAddr1;
	}

	public String getCsidAddr2() {
		return this.csidAddr2;
	}

	public void setCsidAddr2(String csidAddr2) {
		this.csidAddr2 = csidAddr2;
	}

	public String getCsidAddr3() {
		return this.csidAddr3;
	}

	public void setCsidAddr3(String csidAddr3) {
		this.csidAddr3 = csidAddr3;
	}

	public String getCsidOrigCtry() {
		return this.csidOrigCtry;
	}

	public void setCsidOrigCtry(String csidOrigCtry) {
		this.csidOrigCtry = csidOrigCtry;
	}

	public Double getCsidOrigPct() {
		return this.csidOrigPct;
	}

	public void setCsidOrigPct(Double csidOrigPct) {
		this.csidOrigPct = csidOrigPct;
	}

	public Boolean getCsidIntrastat() {
		return this.csidIntrastat;
	}

	public void setCsidIntrastat(Boolean csidIntrastat) {
		this.csidIntrastat = csidIntrastat;
	}

	public String getCsidUser1() {
		return this.csidUser1;
	}

	public void setCsidUser1(String csidUser1) {
		this.csidUser1 = csidUser1;
	}

	public String getCsidUser2() {
		return this.csidUser2;
	}

	public void setCsidUser2(String csidUser2) {
		this.csidUser2 = csidUser2;
	}

	public String getCsidQadc01() {
		return this.csidQadc01;
	}

	public void setCsidQadc01(String csidQadc01) {
		this.csidQadc01 = csidQadc01;
	}

	public Double getOidCsidDet() {
		return this.oidCsidDet;
	}

	public void setOidCsidDet(Double oidCsidDet) {
		this.oidCsidDet = oidCsidDet;
	}

}