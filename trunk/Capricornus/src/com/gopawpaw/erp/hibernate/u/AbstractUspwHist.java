package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUspwHist entity provides the base persistence definition of the
 * UspwHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUspwHist implements java.io.Serializable {

	// Fields

	private UspwHistId id;
	private String uspwUsrPasswd;
	private String uspwModUserid;
	private Date uspwModDate;
	private String uspwTimezone;
	private String uspwUser1;
	private String uspwUser2;
	private String uspwQadc01;
	private String uspwQadc02;
	private Double oidUspwHist;

	// Constructors

	/** default constructor */
	public AbstractUspwHist() {
	}

	/** full constructor */
	public AbstractUspwHist(UspwHistId id, String uspwUsrPasswd,
			String uspwModUserid, Date uspwModDate, String uspwTimezone,
			String uspwUser1, String uspwUser2, String uspwQadc01,
			String uspwQadc02, Double oidUspwHist) {
		this.id = id;
		this.uspwUsrPasswd = uspwUsrPasswd;
		this.uspwModUserid = uspwModUserid;
		this.uspwModDate = uspwModDate;
		this.uspwTimezone = uspwTimezone;
		this.uspwUser1 = uspwUser1;
		this.uspwUser2 = uspwUser2;
		this.uspwQadc01 = uspwQadc01;
		this.uspwQadc02 = uspwQadc02;
		this.oidUspwHist = oidUspwHist;
	}

	// Property accessors

	public UspwHistId getId() {
		return this.id;
	}

	public void setId(UspwHistId id) {
		this.id = id;
	}

	public String getUspwUsrPasswd() {
		return this.uspwUsrPasswd;
	}

	public void setUspwUsrPasswd(String uspwUsrPasswd) {
		this.uspwUsrPasswd = uspwUsrPasswd;
	}

	public String getUspwModUserid() {
		return this.uspwModUserid;
	}

	public void setUspwModUserid(String uspwModUserid) {
		this.uspwModUserid = uspwModUserid;
	}

	public Date getUspwModDate() {
		return this.uspwModDate;
	}

	public void setUspwModDate(Date uspwModDate) {
		this.uspwModDate = uspwModDate;
	}

	public String getUspwTimezone() {
		return this.uspwTimezone;
	}

	public void setUspwTimezone(String uspwTimezone) {
		this.uspwTimezone = uspwTimezone;
	}

	public String getUspwUser1() {
		return this.uspwUser1;
	}

	public void setUspwUser1(String uspwUser1) {
		this.uspwUser1 = uspwUser1;
	}

	public String getUspwUser2() {
		return this.uspwUser2;
	}

	public void setUspwUser2(String uspwUser2) {
		this.uspwUser2 = uspwUser2;
	}

	public String getUspwQadc01() {
		return this.uspwQadc01;
	}

	public void setUspwQadc01(String uspwQadc01) {
		this.uspwQadc01 = uspwQadc01;
	}

	public String getUspwQadc02() {
		return this.uspwQadc02;
	}

	public void setUspwQadc02(String uspwQadc02) {
		this.uspwQadc02 = uspwQadc02;
	}

	public Double getOidUspwHist() {
		return this.oidUspwHist;
	}

	public void setOidUspwHist(Double oidUspwHist) {
		this.oidUspwHist = oidUspwHist;
	}

}