package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAnMstr entity provides the base persistence definition of the AnMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnMstr implements java.io.Serializable {

	// Fields

	private AnMstrId id;
	private String anUserid;
	private Integer anCmtindx;
	private String anDesc;
	private String anSecGroup;
	private Date anModDate;
	private Boolean anActive;
	private String anUser1;
	private String anUser2;
	private String anQadc01;
	private Double anQadd01;
	private Double oidAnMstr;

	// Constructors

	/** default constructor */
	public AbstractAnMstr() {
	}

	/** minimal constructor */
	public AbstractAnMstr(AnMstrId id, Double oidAnMstr) {
		this.id = id;
		this.oidAnMstr = oidAnMstr;
	}

	/** full constructor */
	public AbstractAnMstr(AnMstrId id, String anUserid, Integer anCmtindx,
			String anDesc, String anSecGroup, Date anModDate, Boolean anActive,
			String anUser1, String anUser2, String anQadc01, Double anQadd01,
			Double oidAnMstr) {
		this.id = id;
		this.anUserid = anUserid;
		this.anCmtindx = anCmtindx;
		this.anDesc = anDesc;
		this.anSecGroup = anSecGroup;
		this.anModDate = anModDate;
		this.anActive = anActive;
		this.anUser1 = anUser1;
		this.anUser2 = anUser2;
		this.anQadc01 = anQadc01;
		this.anQadd01 = anQadd01;
		this.oidAnMstr = oidAnMstr;
	}

	// Property accessors

	public AnMstrId getId() {
		return this.id;
	}

	public void setId(AnMstrId id) {
		this.id = id;
	}

	public String getAnUserid() {
		return this.anUserid;
	}

	public void setAnUserid(String anUserid) {
		this.anUserid = anUserid;
	}

	public Integer getAnCmtindx() {
		return this.anCmtindx;
	}

	public void setAnCmtindx(Integer anCmtindx) {
		this.anCmtindx = anCmtindx;
	}

	public String getAnDesc() {
		return this.anDesc;
	}

	public void setAnDesc(String anDesc) {
		this.anDesc = anDesc;
	}

	public String getAnSecGroup() {
		return this.anSecGroup;
	}

	public void setAnSecGroup(String anSecGroup) {
		this.anSecGroup = anSecGroup;
	}

	public Date getAnModDate() {
		return this.anModDate;
	}

	public void setAnModDate(Date anModDate) {
		this.anModDate = anModDate;
	}

	public Boolean getAnActive() {
		return this.anActive;
	}

	public void setAnActive(Boolean anActive) {
		this.anActive = anActive;
	}

	public String getAnUser1() {
		return this.anUser1;
	}

	public void setAnUser1(String anUser1) {
		this.anUser1 = anUser1;
	}

	public String getAnUser2() {
		return this.anUser2;
	}

	public void setAnUser2(String anUser2) {
		this.anUser2 = anUser2;
	}

	public String getAnQadc01() {
		return this.anQadc01;
	}

	public void setAnQadc01(String anQadc01) {
		this.anQadc01 = anQadc01;
	}

	public Double getAnQadd01() {
		return this.anQadd01;
	}

	public void setAnQadd01(Double anQadd01) {
		this.anQadd01 = anQadd01;
	}

	public Double getOidAnMstr() {
		return this.oidAnMstr;
	}

	public void setOidAnMstr(Double oidAnMstr) {
		this.oidAnMstr = oidAnMstr;
	}

}