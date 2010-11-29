package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLpmdDet entity provides the base persistence definition of the
 * LpmdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLpmdDet implements java.io.Serializable {

	// Fields

	private LpmdDetId id;
	private String lpmdModUserid;
	private Date lpmdModDate;
	private String lpmdQadc01;
	private String lpmdQadc02;
	private Double lpmdQadd01;
	private Date lpmdQadt01;
	private String lpmdAccessType;
	private Double oidLpmdDet;

	// Constructors

	/** default constructor */
	public AbstractLpmdDet() {
	}

	/** minimal constructor */
	public AbstractLpmdDet(LpmdDetId id, String lpmdModUserid,
			Date lpmdModDate, String lpmdQadc01, String lpmdQadc02,
			Double lpmdQadd01, String lpmdAccessType, Double oidLpmdDet) {
		this.id = id;
		this.lpmdModUserid = lpmdModUserid;
		this.lpmdModDate = lpmdModDate;
		this.lpmdQadc01 = lpmdQadc01;
		this.lpmdQadc02 = lpmdQadc02;
		this.lpmdQadd01 = lpmdQadd01;
		this.lpmdAccessType = lpmdAccessType;
		this.oidLpmdDet = oidLpmdDet;
	}

	/** full constructor */
	public AbstractLpmdDet(LpmdDetId id, String lpmdModUserid,
			Date lpmdModDate, String lpmdQadc01, String lpmdQadc02,
			Double lpmdQadd01, Date lpmdQadt01, String lpmdAccessType,
			Double oidLpmdDet) {
		this.id = id;
		this.lpmdModUserid = lpmdModUserid;
		this.lpmdModDate = lpmdModDate;
		this.lpmdQadc01 = lpmdQadc01;
		this.lpmdQadc02 = lpmdQadc02;
		this.lpmdQadd01 = lpmdQadd01;
		this.lpmdQadt01 = lpmdQadt01;
		this.lpmdAccessType = lpmdAccessType;
		this.oidLpmdDet = oidLpmdDet;
	}

	// Property accessors

	public LpmdDetId getId() {
		return this.id;
	}

	public void setId(LpmdDetId id) {
		this.id = id;
	}

	public String getLpmdModUserid() {
		return this.lpmdModUserid;
	}

	public void setLpmdModUserid(String lpmdModUserid) {
		this.lpmdModUserid = lpmdModUserid;
	}

	public Date getLpmdModDate() {
		return this.lpmdModDate;
	}

	public void setLpmdModDate(Date lpmdModDate) {
		this.lpmdModDate = lpmdModDate;
	}

	public String getLpmdQadc01() {
		return this.lpmdQadc01;
	}

	public void setLpmdQadc01(String lpmdQadc01) {
		this.lpmdQadc01 = lpmdQadc01;
	}

	public String getLpmdQadc02() {
		return this.lpmdQadc02;
	}

	public void setLpmdQadc02(String lpmdQadc02) {
		this.lpmdQadc02 = lpmdQadc02;
	}

	public Double getLpmdQadd01() {
		return this.lpmdQadd01;
	}

	public void setLpmdQadd01(Double lpmdQadd01) {
		this.lpmdQadd01 = lpmdQadd01;
	}

	public Date getLpmdQadt01() {
		return this.lpmdQadt01;
	}

	public void setLpmdQadt01(Date lpmdQadt01) {
		this.lpmdQadt01 = lpmdQadt01;
	}

	public String getLpmdAccessType() {
		return this.lpmdAccessType;
	}

	public void setLpmdAccessType(String lpmdAccessType) {
		this.lpmdAccessType = lpmdAccessType;
	}

	public Double getOidLpmdDet() {
		return this.oidLpmdDet;
	}

	public void setOidLpmdDet(Double oidLpmdDet) {
		this.oidLpmdDet = oidLpmdDet;
	}

}