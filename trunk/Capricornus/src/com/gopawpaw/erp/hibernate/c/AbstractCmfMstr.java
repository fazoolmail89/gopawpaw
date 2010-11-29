package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCmfMstr entity provides the base persistence definition of the
 * CmfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmfMstr implements java.io.Serializable {

	// Fields

	private CmfMstrId id;
	private String cmfDocType;
	private String cmfDocRef;
	private String cmfStatus;
	private String cmfModUserid;
	private Date cmfModDate;
	private String cmfQadc01;
	private Date cmfRefDate;
	private Integer cmfRefTime;
	private String cmfSoPo;
	private String cmfUser1;
	private String cmfUser2;
	private Double oidCmfMstr;

	// Constructors

	/** default constructor */
	public AbstractCmfMstr() {
	}

	/** minimal constructor */
	public AbstractCmfMstr(CmfMstrId id, String cmfDocType, String cmfDocRef,
			String cmfStatus, Date cmfRefDate, Integer cmfRefTime,
			String cmfSoPo, Double oidCmfMstr) {
		this.id = id;
		this.cmfDocType = cmfDocType;
		this.cmfDocRef = cmfDocRef;
		this.cmfStatus = cmfStatus;
		this.cmfRefDate = cmfRefDate;
		this.cmfRefTime = cmfRefTime;
		this.cmfSoPo = cmfSoPo;
		this.oidCmfMstr = oidCmfMstr;
	}

	/** full constructor */
	public AbstractCmfMstr(CmfMstrId id, String cmfDocType, String cmfDocRef,
			String cmfStatus, String cmfModUserid, Date cmfModDate,
			String cmfQadc01, Date cmfRefDate, Integer cmfRefTime,
			String cmfSoPo, String cmfUser1, String cmfUser2, Double oidCmfMstr) {
		this.id = id;
		this.cmfDocType = cmfDocType;
		this.cmfDocRef = cmfDocRef;
		this.cmfStatus = cmfStatus;
		this.cmfModUserid = cmfModUserid;
		this.cmfModDate = cmfModDate;
		this.cmfQadc01 = cmfQadc01;
		this.cmfRefDate = cmfRefDate;
		this.cmfRefTime = cmfRefTime;
		this.cmfSoPo = cmfSoPo;
		this.cmfUser1 = cmfUser1;
		this.cmfUser2 = cmfUser2;
		this.oidCmfMstr = oidCmfMstr;
	}

	// Property accessors

	public CmfMstrId getId() {
		return this.id;
	}

	public void setId(CmfMstrId id) {
		this.id = id;
	}

	public String getCmfDocType() {
		return this.cmfDocType;
	}

	public void setCmfDocType(String cmfDocType) {
		this.cmfDocType = cmfDocType;
	}

	public String getCmfDocRef() {
		return this.cmfDocRef;
	}

	public void setCmfDocRef(String cmfDocRef) {
		this.cmfDocRef = cmfDocRef;
	}

	public String getCmfStatus() {
		return this.cmfStatus;
	}

	public void setCmfStatus(String cmfStatus) {
		this.cmfStatus = cmfStatus;
	}

	public String getCmfModUserid() {
		return this.cmfModUserid;
	}

	public void setCmfModUserid(String cmfModUserid) {
		this.cmfModUserid = cmfModUserid;
	}

	public Date getCmfModDate() {
		return this.cmfModDate;
	}

	public void setCmfModDate(Date cmfModDate) {
		this.cmfModDate = cmfModDate;
	}

	public String getCmfQadc01() {
		return this.cmfQadc01;
	}

	public void setCmfQadc01(String cmfQadc01) {
		this.cmfQadc01 = cmfQadc01;
	}

	public Date getCmfRefDate() {
		return this.cmfRefDate;
	}

	public void setCmfRefDate(Date cmfRefDate) {
		this.cmfRefDate = cmfRefDate;
	}

	public Integer getCmfRefTime() {
		return this.cmfRefTime;
	}

	public void setCmfRefTime(Integer cmfRefTime) {
		this.cmfRefTime = cmfRefTime;
	}

	public String getCmfSoPo() {
		return this.cmfSoPo;
	}

	public void setCmfSoPo(String cmfSoPo) {
		this.cmfSoPo = cmfSoPo;
	}

	public String getCmfUser1() {
		return this.cmfUser1;
	}

	public void setCmfUser1(String cmfUser1) {
		this.cmfUser1 = cmfUser1;
	}

	public String getCmfUser2() {
		return this.cmfUser2;
	}

	public void setCmfUser2(String cmfUser2) {
		this.cmfUser2 = cmfUser2;
	}

	public Double getOidCmfMstr() {
		return this.oidCmfMstr;
	}

	public void setOidCmfMstr(Double oidCmfMstr) {
		this.oidCmfMstr = oidCmfMstr;
	}

}