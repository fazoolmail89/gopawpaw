package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtgMstr entity provides the base persistence definition of the
 * AtgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtgMstr implements java.io.Serializable {

	// Fields

	private AtgMstrId id;
	private Double oidAtgMstr;
	private String atgGroupDesc;
	private String atgOrigin;
	private Date atgModDate;
	private String atgModUserid;
	private String atgUser1;
	private String atgUser2;
	private String atgQadc01;
	private String atgQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtgMstr() {
	}

	/** full constructor */
	public AbstractAtgMstr(AtgMstrId id, Double oidAtgMstr,
			String atgGroupDesc, String atgOrigin, Date atgModDate,
			String atgModUserid, String atgUser1, String atgUser2,
			String atgQadc01, String atgQadc02) {
		this.id = id;
		this.oidAtgMstr = oidAtgMstr;
		this.atgGroupDesc = atgGroupDesc;
		this.atgOrigin = atgOrigin;
		this.atgModDate = atgModDate;
		this.atgModUserid = atgModUserid;
		this.atgUser1 = atgUser1;
		this.atgUser2 = atgUser2;
		this.atgQadc01 = atgQadc01;
		this.atgQadc02 = atgQadc02;
	}

	// Property accessors

	public AtgMstrId getId() {
		return this.id;
	}

	public void setId(AtgMstrId id) {
		this.id = id;
	}

	public Double getOidAtgMstr() {
		return this.oidAtgMstr;
	}

	public void setOidAtgMstr(Double oidAtgMstr) {
		this.oidAtgMstr = oidAtgMstr;
	}

	public String getAtgGroupDesc() {
		return this.atgGroupDesc;
	}

	public void setAtgGroupDesc(String atgGroupDesc) {
		this.atgGroupDesc = atgGroupDesc;
	}

	public String getAtgOrigin() {
		return this.atgOrigin;
	}

	public void setAtgOrigin(String atgOrigin) {
		this.atgOrigin = atgOrigin;
	}

	public Date getAtgModDate() {
		return this.atgModDate;
	}

	public void setAtgModDate(Date atgModDate) {
		this.atgModDate = atgModDate;
	}

	public String getAtgModUserid() {
		return this.atgModUserid;
	}

	public void setAtgModUserid(String atgModUserid) {
		this.atgModUserid = atgModUserid;
	}

	public String getAtgUser1() {
		return this.atgUser1;
	}

	public void setAtgUser1(String atgUser1) {
		this.atgUser1 = atgUser1;
	}

	public String getAtgUser2() {
		return this.atgUser2;
	}

	public void setAtgUser2(String atgUser2) {
		this.atgUser2 = atgUser2;
	}

	public String getAtgQadc01() {
		return this.atgQadc01;
	}

	public void setAtgQadc01(String atgQadc01) {
		this.atgQadc01 = atgQadc01;
	}

	public String getAtgQadc02() {
		return this.atgQadc02;
	}

	public void setAtgQadc02(String atgQadc02) {
		this.atgQadc02 = atgQadc02;
	}

}