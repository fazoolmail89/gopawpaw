package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQaddbCtrl entity provides the base persistence definition of the
 * QaddbCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQaddbCtrl implements java.io.Serializable {

	// Fields

	private Integer qaddbIndex1;
	private String qaddbServerTimezone;
	private Integer qaddbOidCode;
	private Double qaddbOidRegid;
	private String qaddbModUserid;
	private Date qaddbModDate;
	private String qaddbUser1;
	private String qaddbUser2;
	private String qaddbQadc01;
	private String qaddbQadc02;
	private Double oidQaddbCtrl;

	// Constructors

	/** default constructor */
	public AbstractQaddbCtrl() {
	}

	/** full constructor */
	public AbstractQaddbCtrl(String qaddbServerTimezone, Integer qaddbOidCode,
			Double qaddbOidRegid, String qaddbModUserid, Date qaddbModDate,
			String qaddbUser1, String qaddbUser2, String qaddbQadc01,
			String qaddbQadc02, Double oidQaddbCtrl) {
		this.qaddbServerTimezone = qaddbServerTimezone;
		this.qaddbOidCode = qaddbOidCode;
		this.qaddbOidRegid = qaddbOidRegid;
		this.qaddbModUserid = qaddbModUserid;
		this.qaddbModDate = qaddbModDate;
		this.qaddbUser1 = qaddbUser1;
		this.qaddbUser2 = qaddbUser2;
		this.qaddbQadc01 = qaddbQadc01;
		this.qaddbQadc02 = qaddbQadc02;
		this.oidQaddbCtrl = oidQaddbCtrl;
	}

	// Property accessors

	public Integer getQaddbIndex1() {
		return this.qaddbIndex1;
	}

	public void setQaddbIndex1(Integer qaddbIndex1) {
		this.qaddbIndex1 = qaddbIndex1;
	}

	public String getQaddbServerTimezone() {
		return this.qaddbServerTimezone;
	}

	public void setQaddbServerTimezone(String qaddbServerTimezone) {
		this.qaddbServerTimezone = qaddbServerTimezone;
	}

	public Integer getQaddbOidCode() {
		return this.qaddbOidCode;
	}

	public void setQaddbOidCode(Integer qaddbOidCode) {
		this.qaddbOidCode = qaddbOidCode;
	}

	public Double getQaddbOidRegid() {
		return this.qaddbOidRegid;
	}

	public void setQaddbOidRegid(Double qaddbOidRegid) {
		this.qaddbOidRegid = qaddbOidRegid;
	}

	public String getQaddbModUserid() {
		return this.qaddbModUserid;
	}

	public void setQaddbModUserid(String qaddbModUserid) {
		this.qaddbModUserid = qaddbModUserid;
	}

	public Date getQaddbModDate() {
		return this.qaddbModDate;
	}

	public void setQaddbModDate(Date qaddbModDate) {
		this.qaddbModDate = qaddbModDate;
	}

	public String getQaddbUser1() {
		return this.qaddbUser1;
	}

	public void setQaddbUser1(String qaddbUser1) {
		this.qaddbUser1 = qaddbUser1;
	}

	public String getQaddbUser2() {
		return this.qaddbUser2;
	}

	public void setQaddbUser2(String qaddbUser2) {
		this.qaddbUser2 = qaddbUser2;
	}

	public String getQaddbQadc01() {
		return this.qaddbQadc01;
	}

	public void setQaddbQadc01(String qaddbQadc01) {
		this.qaddbQadc01 = qaddbQadc01;
	}

	public String getQaddbQadc02() {
		return this.qaddbQadc02;
	}

	public void setQaddbQadc02(String qaddbQadc02) {
		this.qaddbQadc02 = qaddbQadc02;
	}

	public Double getOidQaddbCtrl() {
		return this.oidQaddbCtrl;
	}

	public void setOidQaddbCtrl(Double oidQaddbCtrl) {
		this.oidQaddbCtrl = oidQaddbCtrl;
	}

}