package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpsDet entity provides the base persistence definition of the
 * EswpsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpsDet implements java.io.Serializable {

	// Fields

	private EswpsDetId id;
	private Double oidEswpsDet;
	private Boolean eswpsInclude;
	private String eswpsTableName;
	private String eswpsCode;
	private Boolean eswpsMultiple;
	private Date eswpsModDate;
	private String eswpsModUserid;
	private String eswpsUser1;
	private String eswpsUser2;
	private String eswpsQadc01;
	private String eswpsQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpsDet() {
	}

	/** full constructor */
	public AbstractEswpsDet(EswpsDetId id, Double oidEswpsDet,
			Boolean eswpsInclude, String eswpsTableName, String eswpsCode,
			Boolean eswpsMultiple, Date eswpsModDate, String eswpsModUserid,
			String eswpsUser1, String eswpsUser2, String eswpsQadc01,
			String eswpsQadc02) {
		this.id = id;
		this.oidEswpsDet = oidEswpsDet;
		this.eswpsInclude = eswpsInclude;
		this.eswpsTableName = eswpsTableName;
		this.eswpsCode = eswpsCode;
		this.eswpsMultiple = eswpsMultiple;
		this.eswpsModDate = eswpsModDate;
		this.eswpsModUserid = eswpsModUserid;
		this.eswpsUser1 = eswpsUser1;
		this.eswpsUser2 = eswpsUser2;
		this.eswpsQadc01 = eswpsQadc01;
		this.eswpsQadc02 = eswpsQadc02;
	}

	// Property accessors

	public EswpsDetId getId() {
		return this.id;
	}

	public void setId(EswpsDetId id) {
		this.id = id;
	}

	public Double getOidEswpsDet() {
		return this.oidEswpsDet;
	}

	public void setOidEswpsDet(Double oidEswpsDet) {
		this.oidEswpsDet = oidEswpsDet;
	}

	public Boolean getEswpsInclude() {
		return this.eswpsInclude;
	}

	public void setEswpsInclude(Boolean eswpsInclude) {
		this.eswpsInclude = eswpsInclude;
	}

	public String getEswpsTableName() {
		return this.eswpsTableName;
	}

	public void setEswpsTableName(String eswpsTableName) {
		this.eswpsTableName = eswpsTableName;
	}

	public String getEswpsCode() {
		return this.eswpsCode;
	}

	public void setEswpsCode(String eswpsCode) {
		this.eswpsCode = eswpsCode;
	}

	public Boolean getEswpsMultiple() {
		return this.eswpsMultiple;
	}

	public void setEswpsMultiple(Boolean eswpsMultiple) {
		this.eswpsMultiple = eswpsMultiple;
	}

	public Date getEswpsModDate() {
		return this.eswpsModDate;
	}

	public void setEswpsModDate(Date eswpsModDate) {
		this.eswpsModDate = eswpsModDate;
	}

	public String getEswpsModUserid() {
		return this.eswpsModUserid;
	}

	public void setEswpsModUserid(String eswpsModUserid) {
		this.eswpsModUserid = eswpsModUserid;
	}

	public String getEswpsUser1() {
		return this.eswpsUser1;
	}

	public void setEswpsUser1(String eswpsUser1) {
		this.eswpsUser1 = eswpsUser1;
	}

	public String getEswpsUser2() {
		return this.eswpsUser2;
	}

	public void setEswpsUser2(String eswpsUser2) {
		this.eswpsUser2 = eswpsUser2;
	}

	public String getEswpsQadc01() {
		return this.eswpsQadc01;
	}

	public void setEswpsQadc01(String eswpsQadc01) {
		this.eswpsQadc01 = eswpsQadc01;
	}

	public String getEswpsQadc02() {
		return this.eswpsQadc02;
	}

	public void setEswpsQadc02(String eswpsQadc02) {
		this.eswpsQadc02 = eswpsQadc02;
	}

}