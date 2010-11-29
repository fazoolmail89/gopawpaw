package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCmdDet entity provides the base persistence definition of the CmdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmdDet implements java.io.Serializable {

	// Fields

	private CmdDetId id;
	private String cmdVal;
	private String cmdUser1;
	private String cmdUser2;
	private String cmdQadc01;
	private String cmdModUserid;
	private Date cmdModDate;
	private Date cmdRefDate;
	private Integer cmdRefTime;
	private Double oidCmdDet;

	// Constructors

	/** default constructor */
	public AbstractCmdDet() {
	}

	/** full constructor */
	public AbstractCmdDet(CmdDetId id, String cmdVal, String cmdUser1,
			String cmdUser2, String cmdQadc01, String cmdModUserid,
			Date cmdModDate, Date cmdRefDate, Integer cmdRefTime,
			Double oidCmdDet) {
		this.id = id;
		this.cmdVal = cmdVal;
		this.cmdUser1 = cmdUser1;
		this.cmdUser2 = cmdUser2;
		this.cmdQadc01 = cmdQadc01;
		this.cmdModUserid = cmdModUserid;
		this.cmdModDate = cmdModDate;
		this.cmdRefDate = cmdRefDate;
		this.cmdRefTime = cmdRefTime;
		this.oidCmdDet = oidCmdDet;
	}

	// Property accessors

	public CmdDetId getId() {
		return this.id;
	}

	public void setId(CmdDetId id) {
		this.id = id;
	}

	public String getCmdVal() {
		return this.cmdVal;
	}

	public void setCmdVal(String cmdVal) {
		this.cmdVal = cmdVal;
	}

	public String getCmdUser1() {
		return this.cmdUser1;
	}

	public void setCmdUser1(String cmdUser1) {
		this.cmdUser1 = cmdUser1;
	}

	public String getCmdUser2() {
		return this.cmdUser2;
	}

	public void setCmdUser2(String cmdUser2) {
		this.cmdUser2 = cmdUser2;
	}

	public String getCmdQadc01() {
		return this.cmdQadc01;
	}

	public void setCmdQadc01(String cmdQadc01) {
		this.cmdQadc01 = cmdQadc01;
	}

	public String getCmdModUserid() {
		return this.cmdModUserid;
	}

	public void setCmdModUserid(String cmdModUserid) {
		this.cmdModUserid = cmdModUserid;
	}

	public Date getCmdModDate() {
		return this.cmdModDate;
	}

	public void setCmdModDate(Date cmdModDate) {
		this.cmdModDate = cmdModDate;
	}

	public Date getCmdRefDate() {
		return this.cmdRefDate;
	}

	public void setCmdRefDate(Date cmdRefDate) {
		this.cmdRefDate = cmdRefDate;
	}

	public Integer getCmdRefTime() {
		return this.cmdRefTime;
	}

	public void setCmdRefTime(Integer cmdRefTime) {
		this.cmdRefTime = cmdRefTime;
	}

	public Double getOidCmdDet() {
		return this.oidCmdDet;
	}

	public void setOidCmdDet(Double oidCmdDet) {
		this.oidCmdDet = oidCmdDet;
	}

}