package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCmtDet entity provides the base persistence definition of the CmtDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmtDet implements java.io.Serializable {

	// Fields

	private CmtDetId id;
	private String cmtRef;
	private String cmtType;
	private String cmtCmmt;
	private String cmtPrint;
	private String cmtLang;
	private String cmtUser1;
	private String cmtUser2;
	private Date cmtStart;
	private Date cmtExpire;
	private String cmtQadc01;
	private Double oidCmtDet;

	// Constructors

	/** default constructor */
	public AbstractCmtDet() {
	}

	/** minimal constructor */
	public AbstractCmtDet(CmtDetId id, Double oidCmtDet) {
		this.id = id;
		this.oidCmtDet = oidCmtDet;
	}

	/** full constructor */
	public AbstractCmtDet(CmtDetId id, String cmtRef, String cmtType,
			String cmtCmmt, String cmtPrint, String cmtLang, String cmtUser1,
			String cmtUser2, Date cmtStart, Date cmtExpire, String cmtQadc01,
			Double oidCmtDet) {
		this.id = id;
		this.cmtRef = cmtRef;
		this.cmtType = cmtType;
		this.cmtCmmt = cmtCmmt;
		this.cmtPrint = cmtPrint;
		this.cmtLang = cmtLang;
		this.cmtUser1 = cmtUser1;
		this.cmtUser2 = cmtUser2;
		this.cmtStart = cmtStart;
		this.cmtExpire = cmtExpire;
		this.cmtQadc01 = cmtQadc01;
		this.oidCmtDet = oidCmtDet;
	}

	// Property accessors

	public CmtDetId getId() {
		return this.id;
	}

	public void setId(CmtDetId id) {
		this.id = id;
	}

	public String getCmtRef() {
		return this.cmtRef;
	}

	public void setCmtRef(String cmtRef) {
		this.cmtRef = cmtRef;
	}

	public String getCmtType() {
		return this.cmtType;
	}

	public void setCmtType(String cmtType) {
		this.cmtType = cmtType;
	}

	public String getCmtCmmt() {
		return this.cmtCmmt;
	}

	public void setCmtCmmt(String cmtCmmt) {
		this.cmtCmmt = cmtCmmt;
	}

	public String getCmtPrint() {
		return this.cmtPrint;
	}

	public void setCmtPrint(String cmtPrint) {
		this.cmtPrint = cmtPrint;
	}

	public String getCmtLang() {
		return this.cmtLang;
	}

	public void setCmtLang(String cmtLang) {
		this.cmtLang = cmtLang;
	}

	public String getCmtUser1() {
		return this.cmtUser1;
	}

	public void setCmtUser1(String cmtUser1) {
		this.cmtUser1 = cmtUser1;
	}

	public String getCmtUser2() {
		return this.cmtUser2;
	}

	public void setCmtUser2(String cmtUser2) {
		this.cmtUser2 = cmtUser2;
	}

	public Date getCmtStart() {
		return this.cmtStart;
	}

	public void setCmtStart(Date cmtStart) {
		this.cmtStart = cmtStart;
	}

	public Date getCmtExpire() {
		return this.cmtExpire;
	}

	public void setCmtExpire(Date cmtExpire) {
		this.cmtExpire = cmtExpire;
	}

	public String getCmtQadc01() {
		return this.cmtQadc01;
	}

	public void setCmtQadc01(String cmtQadc01) {
		this.cmtQadc01 = cmtQadc01;
	}

	public Double getOidCmtDet() {
		return this.oidCmtDet;
	}

	public void setOidCmtDet(Double oidCmtDet) {
		this.oidCmtDet = oidCmtDet;
	}

}