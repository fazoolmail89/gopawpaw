package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMpsMstr entity provides the base persistence definition of the
 * MpsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpsMstr implements java.io.Serializable {

	// Fields

	private MpsMstrId id;
	private Date mpsRelDate;
	private Double mpsQtyReq;
	private Double mpsQtyCons;
	private Integer mpsRecord;
	private String mpsUser1;
	private String mpsUser2;
	private String mpsBomCode;
	private String mpsRouting;
	private String mpsQadc01;
	private Double oidMpsMstr;

	// Constructors

	/** default constructor */
	public AbstractMpsMstr() {
	}

	/** minimal constructor */
	public AbstractMpsMstr(MpsMstrId id, Double oidMpsMstr) {
		this.id = id;
		this.oidMpsMstr = oidMpsMstr;
	}

	/** full constructor */
	public AbstractMpsMstr(MpsMstrId id, Date mpsRelDate, Double mpsQtyReq,
			Double mpsQtyCons, Integer mpsRecord, String mpsUser1,
			String mpsUser2, String mpsBomCode, String mpsRouting,
			String mpsQadc01, Double oidMpsMstr) {
		this.id = id;
		this.mpsRelDate = mpsRelDate;
		this.mpsQtyReq = mpsQtyReq;
		this.mpsQtyCons = mpsQtyCons;
		this.mpsRecord = mpsRecord;
		this.mpsUser1 = mpsUser1;
		this.mpsUser2 = mpsUser2;
		this.mpsBomCode = mpsBomCode;
		this.mpsRouting = mpsRouting;
		this.mpsQadc01 = mpsQadc01;
		this.oidMpsMstr = oidMpsMstr;
	}

	// Property accessors

	public MpsMstrId getId() {
		return this.id;
	}

	public void setId(MpsMstrId id) {
		this.id = id;
	}

	public Date getMpsRelDate() {
		return this.mpsRelDate;
	}

	public void setMpsRelDate(Date mpsRelDate) {
		this.mpsRelDate = mpsRelDate;
	}

	public Double getMpsQtyReq() {
		return this.mpsQtyReq;
	}

	public void setMpsQtyReq(Double mpsQtyReq) {
		this.mpsQtyReq = mpsQtyReq;
	}

	public Double getMpsQtyCons() {
		return this.mpsQtyCons;
	}

	public void setMpsQtyCons(Double mpsQtyCons) {
		this.mpsQtyCons = mpsQtyCons;
	}

	public Integer getMpsRecord() {
		return this.mpsRecord;
	}

	public void setMpsRecord(Integer mpsRecord) {
		this.mpsRecord = mpsRecord;
	}

	public String getMpsUser1() {
		return this.mpsUser1;
	}

	public void setMpsUser1(String mpsUser1) {
		this.mpsUser1 = mpsUser1;
	}

	public String getMpsUser2() {
		return this.mpsUser2;
	}

	public void setMpsUser2(String mpsUser2) {
		this.mpsUser2 = mpsUser2;
	}

	public String getMpsBomCode() {
		return this.mpsBomCode;
	}

	public void setMpsBomCode(String mpsBomCode) {
		this.mpsBomCode = mpsBomCode;
	}

	public String getMpsRouting() {
		return this.mpsRouting;
	}

	public void setMpsRouting(String mpsRouting) {
		this.mpsRouting = mpsRouting;
	}

	public String getMpsQadc01() {
		return this.mpsQadc01;
	}

	public void setMpsQadc01(String mpsQadc01) {
		this.mpsQadc01 = mpsQadc01;
	}

	public Double getOidMpsMstr() {
		return this.oidMpsMstr;
	}

	public void setOidMpsMstr(Double oidMpsMstr) {
		this.oidMpsMstr = oidMpsMstr;
	}

}