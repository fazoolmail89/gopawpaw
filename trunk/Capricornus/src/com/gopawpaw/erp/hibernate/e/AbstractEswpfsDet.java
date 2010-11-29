package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpfsDet entity provides the base persistence definition of the
 * EswpfsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfsDet implements java.io.Serializable {

	// Fields

	private EswpfsDetId id;
	private Double oidEswpfsDet;
	private String eswpfsSetDesc;
	private Date eswpfsModDate;
	private String eswpfsModUserid;
	private String eswpfsUser1;
	private String eswpfsUser2;
	private String eswpfsQadc01;
	private String eswpfsQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpfsDet() {
	}

	/** full constructor */
	public AbstractEswpfsDet(EswpfsDetId id, Double oidEswpfsDet,
			String eswpfsSetDesc, Date eswpfsModDate, String eswpfsModUserid,
			String eswpfsUser1, String eswpfsUser2, String eswpfsQadc01,
			String eswpfsQadc02) {
		this.id = id;
		this.oidEswpfsDet = oidEswpfsDet;
		this.eswpfsSetDesc = eswpfsSetDesc;
		this.eswpfsModDate = eswpfsModDate;
		this.eswpfsModUserid = eswpfsModUserid;
		this.eswpfsUser1 = eswpfsUser1;
		this.eswpfsUser2 = eswpfsUser2;
		this.eswpfsQadc01 = eswpfsQadc01;
		this.eswpfsQadc02 = eswpfsQadc02;
	}

	// Property accessors

	public EswpfsDetId getId() {
		return this.id;
	}

	public void setId(EswpfsDetId id) {
		this.id = id;
	}

	public Double getOidEswpfsDet() {
		return this.oidEswpfsDet;
	}

	public void setOidEswpfsDet(Double oidEswpfsDet) {
		this.oidEswpfsDet = oidEswpfsDet;
	}

	public String getEswpfsSetDesc() {
		return this.eswpfsSetDesc;
	}

	public void setEswpfsSetDesc(String eswpfsSetDesc) {
		this.eswpfsSetDesc = eswpfsSetDesc;
	}

	public Date getEswpfsModDate() {
		return this.eswpfsModDate;
	}

	public void setEswpfsModDate(Date eswpfsModDate) {
		this.eswpfsModDate = eswpfsModDate;
	}

	public String getEswpfsModUserid() {
		return this.eswpfsModUserid;
	}

	public void setEswpfsModUserid(String eswpfsModUserid) {
		this.eswpfsModUserid = eswpfsModUserid;
	}

	public String getEswpfsUser1() {
		return this.eswpfsUser1;
	}

	public void setEswpfsUser1(String eswpfsUser1) {
		this.eswpfsUser1 = eswpfsUser1;
	}

	public String getEswpfsUser2() {
		return this.eswpfsUser2;
	}

	public void setEswpfsUser2(String eswpfsUser2) {
		this.eswpfsUser2 = eswpfsUser2;
	}

	public String getEswpfsQadc01() {
		return this.eswpfsQadc01;
	}

	public void setEswpfsQadc01(String eswpfsQadc01) {
		this.eswpfsQadc01 = eswpfsQadc01;
	}

	public String getEswpfsQadc02() {
		return this.eswpfsQadc02;
	}

	public void setEswpfsQadc02(String eswpfsQadc02) {
		this.eswpfsQadc02 = eswpfsQadc02;
	}

}