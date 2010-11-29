package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSosrdDet entity provides the base persistence definition of the
 * SosrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSosrdDet implements java.io.Serializable {

	// Fields

	private SosrdDetId id;
	private Date sosrdModDate;
	private String sosrdModUserid;
	private String sosrdRsnCode;
	private String sosrdUser1;
	private String sosrdUser2;
	private String sosrdQadc01;
	private String sosrdQadc02;
	private Double oidSosrdDet;

	// Constructors

	/** default constructor */
	public AbstractSosrdDet() {
	}

	/** full constructor */
	public AbstractSosrdDet(SosrdDetId id, Date sosrdModDate,
			String sosrdModUserid, String sosrdRsnCode, String sosrdUser1,
			String sosrdUser2, String sosrdQadc01, String sosrdQadc02,
			Double oidSosrdDet) {
		this.id = id;
		this.sosrdModDate = sosrdModDate;
		this.sosrdModUserid = sosrdModUserid;
		this.sosrdRsnCode = sosrdRsnCode;
		this.sosrdUser1 = sosrdUser1;
		this.sosrdUser2 = sosrdUser2;
		this.sosrdQadc01 = sosrdQadc01;
		this.sosrdQadc02 = sosrdQadc02;
		this.oidSosrdDet = oidSosrdDet;
	}

	// Property accessors

	public SosrdDetId getId() {
		return this.id;
	}

	public void setId(SosrdDetId id) {
		this.id = id;
	}

	public Date getSosrdModDate() {
		return this.sosrdModDate;
	}

	public void setSosrdModDate(Date sosrdModDate) {
		this.sosrdModDate = sosrdModDate;
	}

	public String getSosrdModUserid() {
		return this.sosrdModUserid;
	}

	public void setSosrdModUserid(String sosrdModUserid) {
		this.sosrdModUserid = sosrdModUserid;
	}

	public String getSosrdRsnCode() {
		return this.sosrdRsnCode;
	}

	public void setSosrdRsnCode(String sosrdRsnCode) {
		this.sosrdRsnCode = sosrdRsnCode;
	}

	public String getSosrdUser1() {
		return this.sosrdUser1;
	}

	public void setSosrdUser1(String sosrdUser1) {
		this.sosrdUser1 = sosrdUser1;
	}

	public String getSosrdUser2() {
		return this.sosrdUser2;
	}

	public void setSosrdUser2(String sosrdUser2) {
		this.sosrdUser2 = sosrdUser2;
	}

	public String getSosrdQadc01() {
		return this.sosrdQadc01;
	}

	public void setSosrdQadc01(String sosrdQadc01) {
		this.sosrdQadc01 = sosrdQadc01;
	}

	public String getSosrdQadc02() {
		return this.sosrdQadc02;
	}

	public void setSosrdQadc02(String sosrdQadc02) {
		this.sosrdQadc02 = sosrdQadc02;
	}

	public Double getOidSosrdDet() {
		return this.oidSosrdDet;
	}

	public void setOidSosrdDet(Double oidSosrdDet) {
		this.oidSosrdDet = oidSosrdDet;
	}

}