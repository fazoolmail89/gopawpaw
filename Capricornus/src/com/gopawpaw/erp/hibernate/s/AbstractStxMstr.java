package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractStxMstr entity provides the base persistence definition of the
 * StxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStxMstr implements java.io.Serializable {

	// Fields

	private StxMstrId id;
	private Boolean stxPaid;
	private Boolean stxUseSt;
	private String stxModUserid;
	private Date stxModDate;
	private String stxUser1;
	private String stxUser2;
	private String stxQadc01;
	private String stxQadc02;
	private Double oidStxMstr;

	// Constructors

	/** default constructor */
	public AbstractStxMstr() {
	}

	/** full constructor */
	public AbstractStxMstr(StxMstrId id, Boolean stxPaid, Boolean stxUseSt,
			String stxModUserid, Date stxModDate, String stxUser1,
			String stxUser2, String stxQadc01, String stxQadc02,
			Double oidStxMstr) {
		this.id = id;
		this.stxPaid = stxPaid;
		this.stxUseSt = stxUseSt;
		this.stxModUserid = stxModUserid;
		this.stxModDate = stxModDate;
		this.stxUser1 = stxUser1;
		this.stxUser2 = stxUser2;
		this.stxQadc01 = stxQadc01;
		this.stxQadc02 = stxQadc02;
		this.oidStxMstr = oidStxMstr;
	}

	// Property accessors

	public StxMstrId getId() {
		return this.id;
	}

	public void setId(StxMstrId id) {
		this.id = id;
	}

	public Boolean getStxPaid() {
		return this.stxPaid;
	}

	public void setStxPaid(Boolean stxPaid) {
		this.stxPaid = stxPaid;
	}

	public Boolean getStxUseSt() {
		return this.stxUseSt;
	}

	public void setStxUseSt(Boolean stxUseSt) {
		this.stxUseSt = stxUseSt;
	}

	public String getStxModUserid() {
		return this.stxModUserid;
	}

	public void setStxModUserid(String stxModUserid) {
		this.stxModUserid = stxModUserid;
	}

	public Date getStxModDate() {
		return this.stxModDate;
	}

	public void setStxModDate(Date stxModDate) {
		this.stxModDate = stxModDate;
	}

	public String getStxUser1() {
		return this.stxUser1;
	}

	public void setStxUser1(String stxUser1) {
		this.stxUser1 = stxUser1;
	}

	public String getStxUser2() {
		return this.stxUser2;
	}

	public void setStxUser2(String stxUser2) {
		this.stxUser2 = stxUser2;
	}

	public String getStxQadc01() {
		return this.stxQadc01;
	}

	public void setStxQadc01(String stxQadc01) {
		this.stxQadc01 = stxQadc01;
	}

	public String getStxQadc02() {
		return this.stxQadc02;
	}

	public void setStxQadc02(String stxQadc02) {
		this.stxQadc02 = stxQadc02;
	}

	public Double getOidStxMstr() {
		return this.oidStxMstr;
	}

	public void setOidStxMstr(Double oidStxMstr) {
		this.oidStxMstr = oidStxMstr;
	}

}