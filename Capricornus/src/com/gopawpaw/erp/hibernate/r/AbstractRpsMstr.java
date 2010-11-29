package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRpsMstr entity provides the base persistence definition of the
 * RpsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRpsMstr implements java.io.Serializable {

	// Fields

	private RpsMstrId id;
	private Date rpsRelDate;
	private Double rpsQtyReq;
	private Double rpsQtyComp;
	private Integer rpsRecord;
	private String rpsUser1;
	private String rpsUser2;
	private String rpsBomCode;
	private String rpsRouting;
	private String rpsQadc01;
	private Double oidRpsMstr;

	// Constructors

	/** default constructor */
	public AbstractRpsMstr() {
	}

	/** minimal constructor */
	public AbstractRpsMstr(RpsMstrId id, Double oidRpsMstr) {
		this.id = id;
		this.oidRpsMstr = oidRpsMstr;
	}

	/** full constructor */
	public AbstractRpsMstr(RpsMstrId id, Date rpsRelDate, Double rpsQtyReq,
			Double rpsQtyComp, Integer rpsRecord, String rpsUser1,
			String rpsUser2, String rpsBomCode, String rpsRouting,
			String rpsQadc01, Double oidRpsMstr) {
		this.id = id;
		this.rpsRelDate = rpsRelDate;
		this.rpsQtyReq = rpsQtyReq;
		this.rpsQtyComp = rpsQtyComp;
		this.rpsRecord = rpsRecord;
		this.rpsUser1 = rpsUser1;
		this.rpsUser2 = rpsUser2;
		this.rpsBomCode = rpsBomCode;
		this.rpsRouting = rpsRouting;
		this.rpsQadc01 = rpsQadc01;
		this.oidRpsMstr = oidRpsMstr;
	}

	// Property accessors

	public RpsMstrId getId() {
		return this.id;
	}

	public void setId(RpsMstrId id) {
		this.id = id;
	}

	public Date getRpsRelDate() {
		return this.rpsRelDate;
	}

	public void setRpsRelDate(Date rpsRelDate) {
		this.rpsRelDate = rpsRelDate;
	}

	public Double getRpsQtyReq() {
		return this.rpsQtyReq;
	}

	public void setRpsQtyReq(Double rpsQtyReq) {
		this.rpsQtyReq = rpsQtyReq;
	}

	public Double getRpsQtyComp() {
		return this.rpsQtyComp;
	}

	public void setRpsQtyComp(Double rpsQtyComp) {
		this.rpsQtyComp = rpsQtyComp;
	}

	public Integer getRpsRecord() {
		return this.rpsRecord;
	}

	public void setRpsRecord(Integer rpsRecord) {
		this.rpsRecord = rpsRecord;
	}

	public String getRpsUser1() {
		return this.rpsUser1;
	}

	public void setRpsUser1(String rpsUser1) {
		this.rpsUser1 = rpsUser1;
	}

	public String getRpsUser2() {
		return this.rpsUser2;
	}

	public void setRpsUser2(String rpsUser2) {
		this.rpsUser2 = rpsUser2;
	}

	public String getRpsBomCode() {
		return this.rpsBomCode;
	}

	public void setRpsBomCode(String rpsBomCode) {
		this.rpsBomCode = rpsBomCode;
	}

	public String getRpsRouting() {
		return this.rpsRouting;
	}

	public void setRpsRouting(String rpsRouting) {
		this.rpsRouting = rpsRouting;
	}

	public String getRpsQadc01() {
		return this.rpsQadc01;
	}

	public void setRpsQadc01(String rpsQadc01) {
		this.rpsQadc01 = rpsQadc01;
	}

	public Double getOidRpsMstr() {
		return this.oidRpsMstr;
	}

	public void setOidRpsMstr(Double oidRpsMstr) {
		this.oidRpsMstr = oidRpsMstr;
	}

}