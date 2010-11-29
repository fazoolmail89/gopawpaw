package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCrMstr entity provides the base persistence definition of the CrMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrMstr implements java.io.Serializable {

	// Fields

	private CrMstrId id;
	private Date crModDate;
	private String crModUserid;
	private String crUser1;
	private String crUser2;
	private String crQadc01;
	private Date crQadt01;
	private Double oidCrMstr;

	// Constructors

	/** default constructor */
	public AbstractCrMstr() {
	}

	/** minimal constructor */
	public AbstractCrMstr(CrMstrId id, Date crModDate, String crModUserid,
			String crUser1, String crUser2, String crQadc01, Double oidCrMstr) {
		this.id = id;
		this.crModDate = crModDate;
		this.crModUserid = crModUserid;
		this.crUser1 = crUser1;
		this.crUser2 = crUser2;
		this.crQadc01 = crQadc01;
		this.oidCrMstr = oidCrMstr;
	}

	/** full constructor */
	public AbstractCrMstr(CrMstrId id, Date crModDate, String crModUserid,
			String crUser1, String crUser2, String crQadc01, Date crQadt01,
			Double oidCrMstr) {
		this.id = id;
		this.crModDate = crModDate;
		this.crModUserid = crModUserid;
		this.crUser1 = crUser1;
		this.crUser2 = crUser2;
		this.crQadc01 = crQadc01;
		this.crQadt01 = crQadt01;
		this.oidCrMstr = oidCrMstr;
	}

	// Property accessors

	public CrMstrId getId() {
		return this.id;
	}

	public void setId(CrMstrId id) {
		this.id = id;
	}

	public Date getCrModDate() {
		return this.crModDate;
	}

	public void setCrModDate(Date crModDate) {
		this.crModDate = crModDate;
	}

	public String getCrModUserid() {
		return this.crModUserid;
	}

	public void setCrModUserid(String crModUserid) {
		this.crModUserid = crModUserid;
	}

	public String getCrUser1() {
		return this.crUser1;
	}

	public void setCrUser1(String crUser1) {
		this.crUser1 = crUser1;
	}

	public String getCrUser2() {
		return this.crUser2;
	}

	public void setCrUser2(String crUser2) {
		this.crUser2 = crUser2;
	}

	public String getCrQadc01() {
		return this.crQadc01;
	}

	public void setCrQadc01(String crQadc01) {
		this.crQadc01 = crQadc01;
	}

	public Date getCrQadt01() {
		return this.crQadt01;
	}

	public void setCrQadt01(Date crQadt01) {
		this.crQadt01 = crQadt01;
	}

	public Double getOidCrMstr() {
		return this.oidCrMstr;
	}

	public void setOidCrMstr(Double oidCrMstr) {
		this.oidCrMstr = oidCrMstr;
	}

}