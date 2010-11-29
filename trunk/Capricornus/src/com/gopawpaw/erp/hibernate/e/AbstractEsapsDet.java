package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapsDet entity provides the base persistence definition of the
 * EsapsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapsDet implements java.io.Serializable {

	// Fields

	private EsapsDetId id;
	private Double oidEsapsDet;
	private Boolean esapsInclude;
	private String esapsTableName;
	private String esapsCode;
	private Boolean esapsMultiple;
	private Date esapsModDate;
	private String esapsModUserid;
	private String esapsUser1;
	private String esapsUser2;
	private String esapsQadc01;
	private String esapsQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapsDet() {
	}

	/** full constructor */
	public AbstractEsapsDet(EsapsDetId id, Double oidEsapsDet,
			Boolean esapsInclude, String esapsTableName, String esapsCode,
			Boolean esapsMultiple, Date esapsModDate, String esapsModUserid,
			String esapsUser1, String esapsUser2, String esapsQadc01,
			String esapsQadc02) {
		this.id = id;
		this.oidEsapsDet = oidEsapsDet;
		this.esapsInclude = esapsInclude;
		this.esapsTableName = esapsTableName;
		this.esapsCode = esapsCode;
		this.esapsMultiple = esapsMultiple;
		this.esapsModDate = esapsModDate;
		this.esapsModUserid = esapsModUserid;
		this.esapsUser1 = esapsUser1;
		this.esapsUser2 = esapsUser2;
		this.esapsQadc01 = esapsQadc01;
		this.esapsQadc02 = esapsQadc02;
	}

	// Property accessors

	public EsapsDetId getId() {
		return this.id;
	}

	public void setId(EsapsDetId id) {
		this.id = id;
	}

	public Double getOidEsapsDet() {
		return this.oidEsapsDet;
	}

	public void setOidEsapsDet(Double oidEsapsDet) {
		this.oidEsapsDet = oidEsapsDet;
	}

	public Boolean getEsapsInclude() {
		return this.esapsInclude;
	}

	public void setEsapsInclude(Boolean esapsInclude) {
		this.esapsInclude = esapsInclude;
	}

	public String getEsapsTableName() {
		return this.esapsTableName;
	}

	public void setEsapsTableName(String esapsTableName) {
		this.esapsTableName = esapsTableName;
	}

	public String getEsapsCode() {
		return this.esapsCode;
	}

	public void setEsapsCode(String esapsCode) {
		this.esapsCode = esapsCode;
	}

	public Boolean getEsapsMultiple() {
		return this.esapsMultiple;
	}

	public void setEsapsMultiple(Boolean esapsMultiple) {
		this.esapsMultiple = esapsMultiple;
	}

	public Date getEsapsModDate() {
		return this.esapsModDate;
	}

	public void setEsapsModDate(Date esapsModDate) {
		this.esapsModDate = esapsModDate;
	}

	public String getEsapsModUserid() {
		return this.esapsModUserid;
	}

	public void setEsapsModUserid(String esapsModUserid) {
		this.esapsModUserid = esapsModUserid;
	}

	public String getEsapsUser1() {
		return this.esapsUser1;
	}

	public void setEsapsUser1(String esapsUser1) {
		this.esapsUser1 = esapsUser1;
	}

	public String getEsapsUser2() {
		return this.esapsUser2;
	}

	public void setEsapsUser2(String esapsUser2) {
		this.esapsUser2 = esapsUser2;
	}

	public String getEsapsQadc01() {
		return this.esapsQadc01;
	}

	public void setEsapsQadc01(String esapsQadc01) {
		this.esapsQadc01 = esapsQadc01;
	}

	public String getEsapsQadc02() {
		return this.esapsQadc02;
	}

	public void setEsapsQadc02(String esapsQadc02) {
		this.esapsQadc02 = esapsQadc02;
	}

}