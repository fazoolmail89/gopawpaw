package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCncsMstr entity provides the base persistence definition of the
 * CncsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncsMstr implements java.io.Serializable {

	// Fields

	private CncsMstrId id;
	private Boolean cncsConsignFlag;
	private Integer cncsMaxAgingDays;
	private String cncsConsignLoc;
	private String cncsIntransLoc;
	private Boolean cncsAutoReplenish;
	private String cncsModUserid;
	private Date cncsModDate;
	private String cncsUser1;
	private String cncsUser2;
	private String cncsQadc01;
	private String cncsQadc02;
	private Double oidCncsMstr;

	// Constructors

	/** default constructor */
	public AbstractCncsMstr() {
	}

	/** full constructor */
	public AbstractCncsMstr(CncsMstrId id, Boolean cncsConsignFlag,
			Integer cncsMaxAgingDays, String cncsConsignLoc,
			String cncsIntransLoc, Boolean cncsAutoReplenish,
			String cncsModUserid, Date cncsModDate, String cncsUser1,
			String cncsUser2, String cncsQadc01, String cncsQadc02,
			Double oidCncsMstr) {
		this.id = id;
		this.cncsConsignFlag = cncsConsignFlag;
		this.cncsMaxAgingDays = cncsMaxAgingDays;
		this.cncsConsignLoc = cncsConsignLoc;
		this.cncsIntransLoc = cncsIntransLoc;
		this.cncsAutoReplenish = cncsAutoReplenish;
		this.cncsModUserid = cncsModUserid;
		this.cncsModDate = cncsModDate;
		this.cncsUser1 = cncsUser1;
		this.cncsUser2 = cncsUser2;
		this.cncsQadc01 = cncsQadc01;
		this.cncsQadc02 = cncsQadc02;
		this.oidCncsMstr = oidCncsMstr;
	}

	// Property accessors

	public CncsMstrId getId() {
		return this.id;
	}

	public void setId(CncsMstrId id) {
		this.id = id;
	}

	public Boolean getCncsConsignFlag() {
		return this.cncsConsignFlag;
	}

	public void setCncsConsignFlag(Boolean cncsConsignFlag) {
		this.cncsConsignFlag = cncsConsignFlag;
	}

	public Integer getCncsMaxAgingDays() {
		return this.cncsMaxAgingDays;
	}

	public void setCncsMaxAgingDays(Integer cncsMaxAgingDays) {
		this.cncsMaxAgingDays = cncsMaxAgingDays;
	}

	public String getCncsConsignLoc() {
		return this.cncsConsignLoc;
	}

	public void setCncsConsignLoc(String cncsConsignLoc) {
		this.cncsConsignLoc = cncsConsignLoc;
	}

	public String getCncsIntransLoc() {
		return this.cncsIntransLoc;
	}

	public void setCncsIntransLoc(String cncsIntransLoc) {
		this.cncsIntransLoc = cncsIntransLoc;
	}

	public Boolean getCncsAutoReplenish() {
		return this.cncsAutoReplenish;
	}

	public void setCncsAutoReplenish(Boolean cncsAutoReplenish) {
		this.cncsAutoReplenish = cncsAutoReplenish;
	}

	public String getCncsModUserid() {
		return this.cncsModUserid;
	}

	public void setCncsModUserid(String cncsModUserid) {
		this.cncsModUserid = cncsModUserid;
	}

	public Date getCncsModDate() {
		return this.cncsModDate;
	}

	public void setCncsModDate(Date cncsModDate) {
		this.cncsModDate = cncsModDate;
	}

	public String getCncsUser1() {
		return this.cncsUser1;
	}

	public void setCncsUser1(String cncsUser1) {
		this.cncsUser1 = cncsUser1;
	}

	public String getCncsUser2() {
		return this.cncsUser2;
	}

	public void setCncsUser2(String cncsUser2) {
		this.cncsUser2 = cncsUser2;
	}

	public String getCncsQadc01() {
		return this.cncsQadc01;
	}

	public void setCncsQadc01(String cncsQadc01) {
		this.cncsQadc01 = cncsQadc01;
	}

	public String getCncsQadc02() {
		return this.cncsQadc02;
	}

	public void setCncsQadc02(String cncsQadc02) {
		this.cncsQadc02 = cncsQadc02;
	}

	public Double getOidCncsMstr() {
		return this.oidCncsMstr;
	}

	public void setOidCncsMstr(Double oidCncsMstr) {
		this.oidCncsMstr = oidCncsMstr;
	}

}