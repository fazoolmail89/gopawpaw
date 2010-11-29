package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDbsMstr entity provides the base persistence definition of the
 * DbsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDbsMstr implements java.io.Serializable {

	// Fields

	private DbsMstrId id;
	private String dbsStatus;
	private String dbsUserid;
	private Date dbsDate;
	private Integer dbsTime;
	private String dbsUser1;
	private String dbsUser2;
	private String dbsQadc01;
	private Double oidDbsMstr;

	// Constructors

	/** default constructor */
	public AbstractDbsMstr() {
	}

	/** minimal constructor */
	public AbstractDbsMstr(DbsMstrId id, Double oidDbsMstr) {
		this.id = id;
		this.oidDbsMstr = oidDbsMstr;
	}

	/** full constructor */
	public AbstractDbsMstr(DbsMstrId id, String dbsStatus, String dbsUserid,
			Date dbsDate, Integer dbsTime, String dbsUser1, String dbsUser2,
			String dbsQadc01, Double oidDbsMstr) {
		this.id = id;
		this.dbsStatus = dbsStatus;
		this.dbsUserid = dbsUserid;
		this.dbsDate = dbsDate;
		this.dbsTime = dbsTime;
		this.dbsUser1 = dbsUser1;
		this.dbsUser2 = dbsUser2;
		this.dbsQadc01 = dbsQadc01;
		this.oidDbsMstr = oidDbsMstr;
	}

	// Property accessors

	public DbsMstrId getId() {
		return this.id;
	}

	public void setId(DbsMstrId id) {
		this.id = id;
	}

	public String getDbsStatus() {
		return this.dbsStatus;
	}

	public void setDbsStatus(String dbsStatus) {
		this.dbsStatus = dbsStatus;
	}

	public String getDbsUserid() {
		return this.dbsUserid;
	}

	public void setDbsUserid(String dbsUserid) {
		this.dbsUserid = dbsUserid;
	}

	public Date getDbsDate() {
		return this.dbsDate;
	}

	public void setDbsDate(Date dbsDate) {
		this.dbsDate = dbsDate;
	}

	public Integer getDbsTime() {
		return this.dbsTime;
	}

	public void setDbsTime(Integer dbsTime) {
		this.dbsTime = dbsTime;
	}

	public String getDbsUser1() {
		return this.dbsUser1;
	}

	public void setDbsUser1(String dbsUser1) {
		this.dbsUser1 = dbsUser1;
	}

	public String getDbsUser2() {
		return this.dbsUser2;
	}

	public void setDbsUser2(String dbsUser2) {
		this.dbsUser2 = dbsUser2;
	}

	public String getDbsQadc01() {
		return this.dbsQadc01;
	}

	public void setDbsQadc01(String dbsQadc01) {
		this.dbsQadc01 = dbsQadc01;
	}

	public Double getOidDbsMstr() {
		return this.oidDbsMstr;
	}

	public void setOidDbsMstr(Double oidDbsMstr) {
		this.oidDbsMstr = oidDbsMstr;
	}

}