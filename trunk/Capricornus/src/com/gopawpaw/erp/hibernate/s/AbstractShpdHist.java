package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShpdHist entity provides the base persistence definition of the
 * ShpdHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShpdHist implements java.io.Serializable {

	// Fields

	private ShpdHistId id;
	private String shpdStatusCode;
	private String shpdRsnCode;
	private Boolean shpdAcceptable;
	private String shpdRsnType;
	private String shpdQadc01;
	private String shpdQadc02;
	private String shpdModUserid;
	private Date shpdModDate;
	private String shpdUser1;
	private String shpdUser2;
	private Double oidShpdHist;

	// Constructors

	/** default constructor */
	public AbstractShpdHist() {
	}

	/** full constructor */
	public AbstractShpdHist(ShpdHistId id, String shpdStatusCode,
			String shpdRsnCode, Boolean shpdAcceptable, String shpdRsnType,
			String shpdQadc01, String shpdQadc02, String shpdModUserid,
			Date shpdModDate, String shpdUser1, String shpdUser2,
			Double oidShpdHist) {
		this.id = id;
		this.shpdStatusCode = shpdStatusCode;
		this.shpdRsnCode = shpdRsnCode;
		this.shpdAcceptable = shpdAcceptable;
		this.shpdRsnType = shpdRsnType;
		this.shpdQadc01 = shpdQadc01;
		this.shpdQadc02 = shpdQadc02;
		this.shpdModUserid = shpdModUserid;
		this.shpdModDate = shpdModDate;
		this.shpdUser1 = shpdUser1;
		this.shpdUser2 = shpdUser2;
		this.oidShpdHist = oidShpdHist;
	}

	// Property accessors

	public ShpdHistId getId() {
		return this.id;
	}

	public void setId(ShpdHistId id) {
		this.id = id;
	}

	public String getShpdStatusCode() {
		return this.shpdStatusCode;
	}

	public void setShpdStatusCode(String shpdStatusCode) {
		this.shpdStatusCode = shpdStatusCode;
	}

	public String getShpdRsnCode() {
		return this.shpdRsnCode;
	}

	public void setShpdRsnCode(String shpdRsnCode) {
		this.shpdRsnCode = shpdRsnCode;
	}

	public Boolean getShpdAcceptable() {
		return this.shpdAcceptable;
	}

	public void setShpdAcceptable(Boolean shpdAcceptable) {
		this.shpdAcceptable = shpdAcceptable;
	}

	public String getShpdRsnType() {
		return this.shpdRsnType;
	}

	public void setShpdRsnType(String shpdRsnType) {
		this.shpdRsnType = shpdRsnType;
	}

	public String getShpdQadc01() {
		return this.shpdQadc01;
	}

	public void setShpdQadc01(String shpdQadc01) {
		this.shpdQadc01 = shpdQadc01;
	}

	public String getShpdQadc02() {
		return this.shpdQadc02;
	}

	public void setShpdQadc02(String shpdQadc02) {
		this.shpdQadc02 = shpdQadc02;
	}

	public String getShpdModUserid() {
		return this.shpdModUserid;
	}

	public void setShpdModUserid(String shpdModUserid) {
		this.shpdModUserid = shpdModUserid;
	}

	public Date getShpdModDate() {
		return this.shpdModDate;
	}

	public void setShpdModDate(Date shpdModDate) {
		this.shpdModDate = shpdModDate;
	}

	public String getShpdUser1() {
		return this.shpdUser1;
	}

	public void setShpdUser1(String shpdUser1) {
		this.shpdUser1 = shpdUser1;
	}

	public String getShpdUser2() {
		return this.shpdUser2;
	}

	public void setShpdUser2(String shpdUser2) {
		this.shpdUser2 = shpdUser2;
	}

	public Double getOidShpdHist() {
		return this.oidShpdHist;
	}

	public void setOidShpdHist(Double oidShpdHist) {
		this.oidShpdHist = oidShpdHist;
	}

}