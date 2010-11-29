package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCnssMstr entity provides the base persistence definition of the
 * CnssMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnssMstr implements java.io.Serializable {

	// Fields

	private CnssMstrId id;
	private Boolean cnssConsignFlag;
	private Integer cnssMaxAgingDays;
	private String cnssModUserid;
	private Date cnssModDate;
	private String cnssUser1;
	private String cnssUser2;
	private String cnssQadc01;
	private String cnssQadc02;
	private Double oidCnssMstr;

	// Constructors

	/** default constructor */
	public AbstractCnssMstr() {
	}

	/** full constructor */
	public AbstractCnssMstr(CnssMstrId id, Boolean cnssConsignFlag,
			Integer cnssMaxAgingDays, String cnssModUserid, Date cnssModDate,
			String cnssUser1, String cnssUser2, String cnssQadc01,
			String cnssQadc02, Double oidCnssMstr) {
		this.id = id;
		this.cnssConsignFlag = cnssConsignFlag;
		this.cnssMaxAgingDays = cnssMaxAgingDays;
		this.cnssModUserid = cnssModUserid;
		this.cnssModDate = cnssModDate;
		this.cnssUser1 = cnssUser1;
		this.cnssUser2 = cnssUser2;
		this.cnssQadc01 = cnssQadc01;
		this.cnssQadc02 = cnssQadc02;
		this.oidCnssMstr = oidCnssMstr;
	}

	// Property accessors

	public CnssMstrId getId() {
		return this.id;
	}

	public void setId(CnssMstrId id) {
		this.id = id;
	}

	public Boolean getCnssConsignFlag() {
		return this.cnssConsignFlag;
	}

	public void setCnssConsignFlag(Boolean cnssConsignFlag) {
		this.cnssConsignFlag = cnssConsignFlag;
	}

	public Integer getCnssMaxAgingDays() {
		return this.cnssMaxAgingDays;
	}

	public void setCnssMaxAgingDays(Integer cnssMaxAgingDays) {
		this.cnssMaxAgingDays = cnssMaxAgingDays;
	}

	public String getCnssModUserid() {
		return this.cnssModUserid;
	}

	public void setCnssModUserid(String cnssModUserid) {
		this.cnssModUserid = cnssModUserid;
	}

	public Date getCnssModDate() {
		return this.cnssModDate;
	}

	public void setCnssModDate(Date cnssModDate) {
		this.cnssModDate = cnssModDate;
	}

	public String getCnssUser1() {
		return this.cnssUser1;
	}

	public void setCnssUser1(String cnssUser1) {
		this.cnssUser1 = cnssUser1;
	}

	public String getCnssUser2() {
		return this.cnssUser2;
	}

	public void setCnssUser2(String cnssUser2) {
		this.cnssUser2 = cnssUser2;
	}

	public String getCnssQadc01() {
		return this.cnssQadc01;
	}

	public void setCnssQadc01(String cnssQadc01) {
		this.cnssQadc01 = cnssQadc01;
	}

	public String getCnssQadc02() {
		return this.cnssQadc02;
	}

	public void setCnssQadc02(String cnssQadc02) {
		this.cnssQadc02 = cnssQadc02;
	}

	public Double getOidCnssMstr() {
		return this.oidCnssMstr;
	}

	public void setOidCnssMstr(Double oidCnssMstr) {
		this.oidCnssMstr = oidCnssMstr;
	}

}