package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTblcdDet entity provides the base persistence definition of the
 * TblcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblcdDet implements java.io.Serializable {

	// Fields

	private TblcdDetId id;
	private Boolean tblcdActive;
	private String tblcdDesc;
	private String tblcdUser1;
	private String tblcdUser2;
	private String tblcdQadc01;
	private String tblcdQadc02;
	private Date tblcdModDate;
	private String tblcdModUserid;
	private Double oidTblcdDet;

	// Constructors

	/** default constructor */
	public AbstractTblcdDet() {
	}

	/** full constructor */
	public AbstractTblcdDet(TblcdDetId id, Boolean tblcdActive,
			String tblcdDesc, String tblcdUser1, String tblcdUser2,
			String tblcdQadc01, String tblcdQadc02, Date tblcdModDate,
			String tblcdModUserid, Double oidTblcdDet) {
		this.id = id;
		this.tblcdActive = tblcdActive;
		this.tblcdDesc = tblcdDesc;
		this.tblcdUser1 = tblcdUser1;
		this.tblcdUser2 = tblcdUser2;
		this.tblcdQadc01 = tblcdQadc01;
		this.tblcdQadc02 = tblcdQadc02;
		this.tblcdModDate = tblcdModDate;
		this.tblcdModUserid = tblcdModUserid;
		this.oidTblcdDet = oidTblcdDet;
	}

	// Property accessors

	public TblcdDetId getId() {
		return this.id;
	}

	public void setId(TblcdDetId id) {
		this.id = id;
	}

	public Boolean getTblcdActive() {
		return this.tblcdActive;
	}

	public void setTblcdActive(Boolean tblcdActive) {
		this.tblcdActive = tblcdActive;
	}

	public String getTblcdDesc() {
		return this.tblcdDesc;
	}

	public void setTblcdDesc(String tblcdDesc) {
		this.tblcdDesc = tblcdDesc;
	}

	public String getTblcdUser1() {
		return this.tblcdUser1;
	}

	public void setTblcdUser1(String tblcdUser1) {
		this.tblcdUser1 = tblcdUser1;
	}

	public String getTblcdUser2() {
		return this.tblcdUser2;
	}

	public void setTblcdUser2(String tblcdUser2) {
		this.tblcdUser2 = tblcdUser2;
	}

	public String getTblcdQadc01() {
		return this.tblcdQadc01;
	}

	public void setTblcdQadc01(String tblcdQadc01) {
		this.tblcdQadc01 = tblcdQadc01;
	}

	public String getTblcdQadc02() {
		return this.tblcdQadc02;
	}

	public void setTblcdQadc02(String tblcdQadc02) {
		this.tblcdQadc02 = tblcdQadc02;
	}

	public Date getTblcdModDate() {
		return this.tblcdModDate;
	}

	public void setTblcdModDate(Date tblcdModDate) {
		this.tblcdModDate = tblcdModDate;
	}

	public String getTblcdModUserid() {
		return this.tblcdModUserid;
	}

	public void setTblcdModUserid(String tblcdModUserid) {
		this.tblcdModUserid = tblcdModUserid;
	}

	public Double getOidTblcdDet() {
		return this.oidTblcdDet;
	}

	public void setOidTblcdDet(Double oidTblcdDet) {
		this.oidTblcdDet = oidTblcdDet;
	}

}