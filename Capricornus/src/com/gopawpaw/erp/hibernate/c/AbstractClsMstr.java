package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractClsMstr entity provides the base persistence definition of the
 * ClsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractClsMstr implements java.io.Serializable {

	// Fields

	private String clsClass;
	private String clsDesc;
	private String clsAcct;
	private String clsAcAcct;
	private String clsExpAcct;
	private String clsUserid;
	private Date clsModDate;
	private Boolean clsQad01;
	private String clsQad02;
	private String clsQad03;
	private String clsUser1;
	private String clsUser2;
	private Double oidClsMstr;

	// Constructors

	/** default constructor */
	public AbstractClsMstr() {
	}

	/** minimal constructor */
	public AbstractClsMstr(Double oidClsMstr) {
		this.oidClsMstr = oidClsMstr;
	}

	/** full constructor */
	public AbstractClsMstr(String clsDesc, String clsAcct, String clsAcAcct,
			String clsExpAcct, String clsUserid, Date clsModDate,
			Boolean clsQad01, String clsQad02, String clsQad03,
			String clsUser1, String clsUser2, Double oidClsMstr) {
		this.clsDesc = clsDesc;
		this.clsAcct = clsAcct;
		this.clsAcAcct = clsAcAcct;
		this.clsExpAcct = clsExpAcct;
		this.clsUserid = clsUserid;
		this.clsModDate = clsModDate;
		this.clsQad01 = clsQad01;
		this.clsQad02 = clsQad02;
		this.clsQad03 = clsQad03;
		this.clsUser1 = clsUser1;
		this.clsUser2 = clsUser2;
		this.oidClsMstr = oidClsMstr;
	}

	// Property accessors

	public String getClsClass() {
		return this.clsClass;
	}

	public void setClsClass(String clsClass) {
		this.clsClass = clsClass;
	}

	public String getClsDesc() {
		return this.clsDesc;
	}

	public void setClsDesc(String clsDesc) {
		this.clsDesc = clsDesc;
	}

	public String getClsAcct() {
		return this.clsAcct;
	}

	public void setClsAcct(String clsAcct) {
		this.clsAcct = clsAcct;
	}

	public String getClsAcAcct() {
		return this.clsAcAcct;
	}

	public void setClsAcAcct(String clsAcAcct) {
		this.clsAcAcct = clsAcAcct;
	}

	public String getClsExpAcct() {
		return this.clsExpAcct;
	}

	public void setClsExpAcct(String clsExpAcct) {
		this.clsExpAcct = clsExpAcct;
	}

	public String getClsUserid() {
		return this.clsUserid;
	}

	public void setClsUserid(String clsUserid) {
		this.clsUserid = clsUserid;
	}

	public Date getClsModDate() {
		return this.clsModDate;
	}

	public void setClsModDate(Date clsModDate) {
		this.clsModDate = clsModDate;
	}

	public Boolean getClsQad01() {
		return this.clsQad01;
	}

	public void setClsQad01(Boolean clsQad01) {
		this.clsQad01 = clsQad01;
	}

	public String getClsQad02() {
		return this.clsQad02;
	}

	public void setClsQad02(String clsQad02) {
		this.clsQad02 = clsQad02;
	}

	public String getClsQad03() {
		return this.clsQad03;
	}

	public void setClsQad03(String clsQad03) {
		this.clsQad03 = clsQad03;
	}

	public String getClsUser1() {
		return this.clsUser1;
	}

	public void setClsUser1(String clsUser1) {
		this.clsUser1 = clsUser1;
	}

	public String getClsUser2() {
		return this.clsUser2;
	}

	public void setClsUser2(String clsUser2) {
		this.clsUser2 = clsUser2;
	}

	public Double getOidClsMstr() {
		return this.oidClsMstr;
	}

	public void setOidClsMstr(Double oidClsMstr) {
		this.oidClsMstr = oidClsMstr;
	}

}