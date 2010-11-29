package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkfmMstr entity provides the base persistence definition of the
 * BkfmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkfmMstr implements java.io.Serializable {

	// Fields

	private BkfmMstrId id;
	private Integer bkfmLength;
	private Boolean bkfmMandatory;
	private Boolean bkfmLeadZeros;
	private String bkfmQadc01;
	private String bkfmQadc02;
	private String bkfmUser1;
	private String bkfmUser2;
	private Date bkfmModDate;
	private String bkfmModUserid;
	private Double oidBkfmMstr;

	// Constructors

	/** default constructor */
	public AbstractBkfmMstr() {
	}

	/** full constructor */
	public AbstractBkfmMstr(BkfmMstrId id, Integer bkfmLength,
			Boolean bkfmMandatory, Boolean bkfmLeadZeros, String bkfmQadc01,
			String bkfmQadc02, String bkfmUser1, String bkfmUser2,
			Date bkfmModDate, String bkfmModUserid, Double oidBkfmMstr) {
		this.id = id;
		this.bkfmLength = bkfmLength;
		this.bkfmMandatory = bkfmMandatory;
		this.bkfmLeadZeros = bkfmLeadZeros;
		this.bkfmQadc01 = bkfmQadc01;
		this.bkfmQadc02 = bkfmQadc02;
		this.bkfmUser1 = bkfmUser1;
		this.bkfmUser2 = bkfmUser2;
		this.bkfmModDate = bkfmModDate;
		this.bkfmModUserid = bkfmModUserid;
		this.oidBkfmMstr = oidBkfmMstr;
	}

	// Property accessors

	public BkfmMstrId getId() {
		return this.id;
	}

	public void setId(BkfmMstrId id) {
		this.id = id;
	}

	public Integer getBkfmLength() {
		return this.bkfmLength;
	}

	public void setBkfmLength(Integer bkfmLength) {
		this.bkfmLength = bkfmLength;
	}

	public Boolean getBkfmMandatory() {
		return this.bkfmMandatory;
	}

	public void setBkfmMandatory(Boolean bkfmMandatory) {
		this.bkfmMandatory = bkfmMandatory;
	}

	public Boolean getBkfmLeadZeros() {
		return this.bkfmLeadZeros;
	}

	public void setBkfmLeadZeros(Boolean bkfmLeadZeros) {
		this.bkfmLeadZeros = bkfmLeadZeros;
	}

	public String getBkfmQadc01() {
		return this.bkfmQadc01;
	}

	public void setBkfmQadc01(String bkfmQadc01) {
		this.bkfmQadc01 = bkfmQadc01;
	}

	public String getBkfmQadc02() {
		return this.bkfmQadc02;
	}

	public void setBkfmQadc02(String bkfmQadc02) {
		this.bkfmQadc02 = bkfmQadc02;
	}

	public String getBkfmUser1() {
		return this.bkfmUser1;
	}

	public void setBkfmUser1(String bkfmUser1) {
		this.bkfmUser1 = bkfmUser1;
	}

	public String getBkfmUser2() {
		return this.bkfmUser2;
	}

	public void setBkfmUser2(String bkfmUser2) {
		this.bkfmUser2 = bkfmUser2;
	}

	public Date getBkfmModDate() {
		return this.bkfmModDate;
	}

	public void setBkfmModDate(Date bkfmModDate) {
		this.bkfmModDate = bkfmModDate;
	}

	public String getBkfmModUserid() {
		return this.bkfmModUserid;
	}

	public void setBkfmModUserid(String bkfmModUserid) {
		this.bkfmModUserid = bkfmModUserid;
	}

	public Double getOidBkfmMstr() {
		return this.oidBkfmMstr;
	}

	public void setOidBkfmMstr(Double oidBkfmMstr) {
		this.oidBkfmMstr = oidBkfmMstr;
	}

}