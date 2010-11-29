package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtdMstr entity provides the base persistence definition of the
 * AtdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtdMstr implements java.io.Serializable {

	// Fields

	private AtdMstrId id;
	private String atdDesc;
	private String atdGroup;
	private String atdModUserid;
	private Date atdModDate;
	private String atdUser1;
	private String atdUser2;
	private String atdQadc01;
	private String atdQadc02;
	private Double oidAtdMstr;

	// Constructors

	/** default constructor */
	public AbstractAtdMstr() {
	}

	/** full constructor */
	public AbstractAtdMstr(AtdMstrId id, String atdDesc, String atdGroup,
			String atdModUserid, Date atdModDate, String atdUser1,
			String atdUser2, String atdQadc01, String atdQadc02,
			Double oidAtdMstr) {
		this.id = id;
		this.atdDesc = atdDesc;
		this.atdGroup = atdGroup;
		this.atdModUserid = atdModUserid;
		this.atdModDate = atdModDate;
		this.atdUser1 = atdUser1;
		this.atdUser2 = atdUser2;
		this.atdQadc01 = atdQadc01;
		this.atdQadc02 = atdQadc02;
		this.oidAtdMstr = oidAtdMstr;
	}

	// Property accessors

	public AtdMstrId getId() {
		return this.id;
	}

	public void setId(AtdMstrId id) {
		this.id = id;
	}

	public String getAtdDesc() {
		return this.atdDesc;
	}

	public void setAtdDesc(String atdDesc) {
		this.atdDesc = atdDesc;
	}

	public String getAtdGroup() {
		return this.atdGroup;
	}

	public void setAtdGroup(String atdGroup) {
		this.atdGroup = atdGroup;
	}

	public String getAtdModUserid() {
		return this.atdModUserid;
	}

	public void setAtdModUserid(String atdModUserid) {
		this.atdModUserid = atdModUserid;
	}

	public Date getAtdModDate() {
		return this.atdModDate;
	}

	public void setAtdModDate(Date atdModDate) {
		this.atdModDate = atdModDate;
	}

	public String getAtdUser1() {
		return this.atdUser1;
	}

	public void setAtdUser1(String atdUser1) {
		this.atdUser1 = atdUser1;
	}

	public String getAtdUser2() {
		return this.atdUser2;
	}

	public void setAtdUser2(String atdUser2) {
		this.atdUser2 = atdUser2;
	}

	public String getAtdQadc01() {
		return this.atdQadc01;
	}

	public void setAtdQadc01(String atdQadc01) {
		this.atdQadc01 = atdQadc01;
	}

	public String getAtdQadc02() {
		return this.atdQadc02;
	}

	public void setAtdQadc02(String atdQadc02) {
		this.atdQadc02 = atdQadc02;
	}

	public Double getOidAtdMstr() {
		return this.oidAtdMstr;
	}

	public void setOidAtdMstr(Double oidAtdMstr) {
		this.oidAtdMstr = oidAtdMstr;
	}

}