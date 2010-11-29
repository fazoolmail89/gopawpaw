package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCclscMstr entity provides the base persistence definition of the
 * CclscMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclscMstr implements java.io.Serializable {

	// Fields

	private CclscMstrId id;
	private String cclscChargeType;
	private String cclscModUserid;
	private Date cclscModDate;
	private String cclscUserc01;
	private String cclscUserc02;
	private String cclscQadc01;
	private String cclscQadc02;
	private Double oidCclscMstr;

	// Constructors

	/** default constructor */
	public AbstractCclscMstr() {
	}

	/** minimal constructor */
	public AbstractCclscMstr(CclscMstrId id, String cclscChargeType,
			String cclscModUserid, String cclscUserc01, String cclscUserc02,
			String cclscQadc01, String cclscQadc02, Double oidCclscMstr) {
		this.id = id;
		this.cclscChargeType = cclscChargeType;
		this.cclscModUserid = cclscModUserid;
		this.cclscUserc01 = cclscUserc01;
		this.cclscUserc02 = cclscUserc02;
		this.cclscQadc01 = cclscQadc01;
		this.cclscQadc02 = cclscQadc02;
		this.oidCclscMstr = oidCclscMstr;
	}

	/** full constructor */
	public AbstractCclscMstr(CclscMstrId id, String cclscChargeType,
			String cclscModUserid, Date cclscModDate, String cclscUserc01,
			String cclscUserc02, String cclscQadc01, String cclscQadc02,
			Double oidCclscMstr) {
		this.id = id;
		this.cclscChargeType = cclscChargeType;
		this.cclscModUserid = cclscModUserid;
		this.cclscModDate = cclscModDate;
		this.cclscUserc01 = cclscUserc01;
		this.cclscUserc02 = cclscUserc02;
		this.cclscQadc01 = cclscQadc01;
		this.cclscQadc02 = cclscQadc02;
		this.oidCclscMstr = oidCclscMstr;
	}

	// Property accessors

	public CclscMstrId getId() {
		return this.id;
	}

	public void setId(CclscMstrId id) {
		this.id = id;
	}

	public String getCclscChargeType() {
		return this.cclscChargeType;
	}

	public void setCclscChargeType(String cclscChargeType) {
		this.cclscChargeType = cclscChargeType;
	}

	public String getCclscModUserid() {
		return this.cclscModUserid;
	}

	public void setCclscModUserid(String cclscModUserid) {
		this.cclscModUserid = cclscModUserid;
	}

	public Date getCclscModDate() {
		return this.cclscModDate;
	}

	public void setCclscModDate(Date cclscModDate) {
		this.cclscModDate = cclscModDate;
	}

	public String getCclscUserc01() {
		return this.cclscUserc01;
	}

	public void setCclscUserc01(String cclscUserc01) {
		this.cclscUserc01 = cclscUserc01;
	}

	public String getCclscUserc02() {
		return this.cclscUserc02;
	}

	public void setCclscUserc02(String cclscUserc02) {
		this.cclscUserc02 = cclscUserc02;
	}

	public String getCclscQadc01() {
		return this.cclscQadc01;
	}

	public void setCclscQadc01(String cclscQadc01) {
		this.cclscQadc01 = cclscQadc01;
	}

	public String getCclscQadc02() {
		return this.cclscQadc02;
	}

	public void setCclscQadc02(String cclscQadc02) {
		this.cclscQadc02 = cclscQadc02;
	}

	public Double getOidCclscMstr() {
		return this.oidCclscMstr;
	}

	public void setOidCclscMstr(Double oidCclscMstr) {
		this.oidCclscMstr = oidCclscMstr;
	}

}