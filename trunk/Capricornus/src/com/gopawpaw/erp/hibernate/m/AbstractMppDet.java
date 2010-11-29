package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMppDet entity provides the base persistence definition of the MppDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMppDet implements java.io.Serializable {

	// Fields

	private MppDetId id;
	private String mppParm;
	private String mppDesc;
	private String mppFieldType;
	private Date mppModDate;
	private String mppModUserid;
	private String mppUser1;
	private String mppUser2;
	private String mppChr01;
	private Boolean mppLog01;
	private String mppQadc01;
	private Date mppQadt01;
	private Double mppQade01;
	private Boolean mppQadl01;
	private Double oidMppDet;

	// Constructors

	/** default constructor */
	public AbstractMppDet() {
	}

	/** minimal constructor */
	public AbstractMppDet(MppDetId id, Double oidMppDet) {
		this.id = id;
		this.oidMppDet = oidMppDet;
	}

	/** full constructor */
	public AbstractMppDet(MppDetId id, String mppParm, String mppDesc,
			String mppFieldType, Date mppModDate, String mppModUserid,
			String mppUser1, String mppUser2, String mppChr01,
			Boolean mppLog01, String mppQadc01, Date mppQadt01,
			Double mppQade01, Boolean mppQadl01, Double oidMppDet) {
		this.id = id;
		this.mppParm = mppParm;
		this.mppDesc = mppDesc;
		this.mppFieldType = mppFieldType;
		this.mppModDate = mppModDate;
		this.mppModUserid = mppModUserid;
		this.mppUser1 = mppUser1;
		this.mppUser2 = mppUser2;
		this.mppChr01 = mppChr01;
		this.mppLog01 = mppLog01;
		this.mppQadc01 = mppQadc01;
		this.mppQadt01 = mppQadt01;
		this.mppQade01 = mppQade01;
		this.mppQadl01 = mppQadl01;
		this.oidMppDet = oidMppDet;
	}

	// Property accessors

	public MppDetId getId() {
		return this.id;
	}

	public void setId(MppDetId id) {
		this.id = id;
	}

	public String getMppParm() {
		return this.mppParm;
	}

	public void setMppParm(String mppParm) {
		this.mppParm = mppParm;
	}

	public String getMppDesc() {
		return this.mppDesc;
	}

	public void setMppDesc(String mppDesc) {
		this.mppDesc = mppDesc;
	}

	public String getMppFieldType() {
		return this.mppFieldType;
	}

	public void setMppFieldType(String mppFieldType) {
		this.mppFieldType = mppFieldType;
	}

	public Date getMppModDate() {
		return this.mppModDate;
	}

	public void setMppModDate(Date mppModDate) {
		this.mppModDate = mppModDate;
	}

	public String getMppModUserid() {
		return this.mppModUserid;
	}

	public void setMppModUserid(String mppModUserid) {
		this.mppModUserid = mppModUserid;
	}

	public String getMppUser1() {
		return this.mppUser1;
	}

	public void setMppUser1(String mppUser1) {
		this.mppUser1 = mppUser1;
	}

	public String getMppUser2() {
		return this.mppUser2;
	}

	public void setMppUser2(String mppUser2) {
		this.mppUser2 = mppUser2;
	}

	public String getMppChr01() {
		return this.mppChr01;
	}

	public void setMppChr01(String mppChr01) {
		this.mppChr01 = mppChr01;
	}

	public Boolean getMppLog01() {
		return this.mppLog01;
	}

	public void setMppLog01(Boolean mppLog01) {
		this.mppLog01 = mppLog01;
	}

	public String getMppQadc01() {
		return this.mppQadc01;
	}

	public void setMppQadc01(String mppQadc01) {
		this.mppQadc01 = mppQadc01;
	}

	public Date getMppQadt01() {
		return this.mppQadt01;
	}

	public void setMppQadt01(Date mppQadt01) {
		this.mppQadt01 = mppQadt01;
	}

	public Double getMppQade01() {
		return this.mppQade01;
	}

	public void setMppQade01(Double mppQade01) {
		this.mppQade01 = mppQade01;
	}

	public Boolean getMppQadl01() {
		return this.mppQadl01;
	}

	public void setMppQadl01(Boolean mppQadl01) {
		this.mppQadl01 = mppQadl01;
	}

	public Double getOidMppDet() {
		return this.oidMppDet;
	}

	public void setOidMppDet(Double oidMppDet) {
		this.oidMppDet = oidMppDet;
	}

}