package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShvMstr entity provides the base persistence definition of the
 * ShvMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShvMstr implements java.io.Serializable {

	// Fields

	private ShvMstrId id;
	private String shvModeTransp;
	private String shvName;
	private Boolean shvPortMandatory;
	private Date shvModDate;
	private String shvModUserid;
	private String shvUser1;
	private String shvUser2;
	private String shvQadc01;
	private String shvQadc02;
	private Double oidShvMstr;

	// Constructors

	/** default constructor */
	public AbstractShvMstr() {
	}

	/** full constructor */
	public AbstractShvMstr(ShvMstrId id, String shvModeTransp, String shvName,
			Boolean shvPortMandatory, Date shvModDate, String shvModUserid,
			String shvUser1, String shvUser2, String shvQadc01,
			String shvQadc02, Double oidShvMstr) {
		this.id = id;
		this.shvModeTransp = shvModeTransp;
		this.shvName = shvName;
		this.shvPortMandatory = shvPortMandatory;
		this.shvModDate = shvModDate;
		this.shvModUserid = shvModUserid;
		this.shvUser1 = shvUser1;
		this.shvUser2 = shvUser2;
		this.shvQadc01 = shvQadc01;
		this.shvQadc02 = shvQadc02;
		this.oidShvMstr = oidShvMstr;
	}

	// Property accessors

	public ShvMstrId getId() {
		return this.id;
	}

	public void setId(ShvMstrId id) {
		this.id = id;
	}

	public String getShvModeTransp() {
		return this.shvModeTransp;
	}

	public void setShvModeTransp(String shvModeTransp) {
		this.shvModeTransp = shvModeTransp;
	}

	public String getShvName() {
		return this.shvName;
	}

	public void setShvName(String shvName) {
		this.shvName = shvName;
	}

	public Boolean getShvPortMandatory() {
		return this.shvPortMandatory;
	}

	public void setShvPortMandatory(Boolean shvPortMandatory) {
		this.shvPortMandatory = shvPortMandatory;
	}

	public Date getShvModDate() {
		return this.shvModDate;
	}

	public void setShvModDate(Date shvModDate) {
		this.shvModDate = shvModDate;
	}

	public String getShvModUserid() {
		return this.shvModUserid;
	}

	public void setShvModUserid(String shvModUserid) {
		this.shvModUserid = shvModUserid;
	}

	public String getShvUser1() {
		return this.shvUser1;
	}

	public void setShvUser1(String shvUser1) {
		this.shvUser1 = shvUser1;
	}

	public String getShvUser2() {
		return this.shvUser2;
	}

	public void setShvUser2(String shvUser2) {
		this.shvUser2 = shvUser2;
	}

	public String getShvQadc01() {
		return this.shvQadc01;
	}

	public void setShvQadc01(String shvQadc01) {
		this.shvQadc01 = shvQadc01;
	}

	public String getShvQadc02() {
		return this.shvQadc02;
	}

	public void setShvQadc02(String shvQadc02) {
		this.shvQadc02 = shvQadc02;
	}

	public Double getOidShvMstr() {
		return this.oidShvMstr;
	}

	public void setOidShvMstr(Double oidShvMstr) {
		this.oidShvMstr = oidShvMstr;
	}

}