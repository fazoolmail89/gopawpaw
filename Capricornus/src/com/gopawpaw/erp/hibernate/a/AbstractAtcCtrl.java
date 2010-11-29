package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtcCtrl entity provides the base persistence definition of the
 * AtcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtcCtrl implements java.io.Serializable {

	// Fields

	private Integer atcIndex1;
	private Double oidAtcCtrl;
	private Boolean atcStorageShutdown;
	private String atcLogfile;
	private Date atcModDate;
	private String atcModUserid;
	private String atcUser1;
	private String atcUser2;
	private String atcQadc01;
	private String atcQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtcCtrl() {
	}

	/** full constructor */
	public AbstractAtcCtrl(Double oidAtcCtrl, Boolean atcStorageShutdown,
			String atcLogfile, Date atcModDate, String atcModUserid,
			String atcUser1, String atcUser2, String atcQadc01, String atcQadc02) {
		this.oidAtcCtrl = oidAtcCtrl;
		this.atcStorageShutdown = atcStorageShutdown;
		this.atcLogfile = atcLogfile;
		this.atcModDate = atcModDate;
		this.atcModUserid = atcModUserid;
		this.atcUser1 = atcUser1;
		this.atcUser2 = atcUser2;
		this.atcQadc01 = atcQadc01;
		this.atcQadc02 = atcQadc02;
	}

	// Property accessors

	public Integer getAtcIndex1() {
		return this.atcIndex1;
	}

	public void setAtcIndex1(Integer atcIndex1) {
		this.atcIndex1 = atcIndex1;
	}

	public Double getOidAtcCtrl() {
		return this.oidAtcCtrl;
	}

	public void setOidAtcCtrl(Double oidAtcCtrl) {
		this.oidAtcCtrl = oidAtcCtrl;
	}

	public Boolean getAtcStorageShutdown() {
		return this.atcStorageShutdown;
	}

	public void setAtcStorageShutdown(Boolean atcStorageShutdown) {
		this.atcStorageShutdown = atcStorageShutdown;
	}

	public String getAtcLogfile() {
		return this.atcLogfile;
	}

	public void setAtcLogfile(String atcLogfile) {
		this.atcLogfile = atcLogfile;
	}

	public Date getAtcModDate() {
		return this.atcModDate;
	}

	public void setAtcModDate(Date atcModDate) {
		this.atcModDate = atcModDate;
	}

	public String getAtcModUserid() {
		return this.atcModUserid;
	}

	public void setAtcModUserid(String atcModUserid) {
		this.atcModUserid = atcModUserid;
	}

	public String getAtcUser1() {
		return this.atcUser1;
	}

	public void setAtcUser1(String atcUser1) {
		this.atcUser1 = atcUser1;
	}

	public String getAtcUser2() {
		return this.atcUser2;
	}

	public void setAtcUser2(String atcUser2) {
		this.atcUser2 = atcUser2;
	}

	public String getAtcQadc01() {
		return this.atcQadc01;
	}

	public void setAtcQadc01(String atcQadc01) {
		this.atcQadc01 = atcQadc01;
	}

	public String getAtcQadc02() {
		return this.atcQadc02;
	}

	public void setAtcQadc02(String atcQadc02) {
		this.atcQadc02 = atcQadc02;
	}

}