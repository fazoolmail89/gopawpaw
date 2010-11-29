package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRsuMstr entity provides the base persistence definition of the
 * RsuMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsuMstr implements java.io.Serializable {

	// Fields

	private RsuMstrId id;
	private String rsuApprCode;
	private String rsuDocNbr;
	private String rsuDocType;
	private Date rsuApprDate;
	private Date rsuRouteDate;
	private String rsuNotify2;
	private String rsuUser1;
	private String rsuUser2;
	private String rsuNotify2Mail;
	private String rsuQadc01;
	private Double oidRsuMstr;

	// Constructors

	/** default constructor */
	public AbstractRsuMstr() {
	}

	/** minimal constructor */
	public AbstractRsuMstr(RsuMstrId id, String rsuApprCode, String rsuDocNbr,
			String rsuDocType, String rsuNotify2, String rsuUser1,
			String rsuUser2, String rsuNotify2Mail, Double oidRsuMstr) {
		this.id = id;
		this.rsuApprCode = rsuApprCode;
		this.rsuDocNbr = rsuDocNbr;
		this.rsuDocType = rsuDocType;
		this.rsuNotify2 = rsuNotify2;
		this.rsuUser1 = rsuUser1;
		this.rsuUser2 = rsuUser2;
		this.rsuNotify2Mail = rsuNotify2Mail;
		this.oidRsuMstr = oidRsuMstr;
	}

	/** full constructor */
	public AbstractRsuMstr(RsuMstrId id, String rsuApprCode, String rsuDocNbr,
			String rsuDocType, Date rsuApprDate, Date rsuRouteDate,
			String rsuNotify2, String rsuUser1, String rsuUser2,
			String rsuNotify2Mail, String rsuQadc01, Double oidRsuMstr) {
		this.id = id;
		this.rsuApprCode = rsuApprCode;
		this.rsuDocNbr = rsuDocNbr;
		this.rsuDocType = rsuDocType;
		this.rsuApprDate = rsuApprDate;
		this.rsuRouteDate = rsuRouteDate;
		this.rsuNotify2 = rsuNotify2;
		this.rsuUser1 = rsuUser1;
		this.rsuUser2 = rsuUser2;
		this.rsuNotify2Mail = rsuNotify2Mail;
		this.rsuQadc01 = rsuQadc01;
		this.oidRsuMstr = oidRsuMstr;
	}

	// Property accessors

	public RsuMstrId getId() {
		return this.id;
	}

	public void setId(RsuMstrId id) {
		this.id = id;
	}

	public String getRsuApprCode() {
		return this.rsuApprCode;
	}

	public void setRsuApprCode(String rsuApprCode) {
		this.rsuApprCode = rsuApprCode;
	}

	public String getRsuDocNbr() {
		return this.rsuDocNbr;
	}

	public void setRsuDocNbr(String rsuDocNbr) {
		this.rsuDocNbr = rsuDocNbr;
	}

	public String getRsuDocType() {
		return this.rsuDocType;
	}

	public void setRsuDocType(String rsuDocType) {
		this.rsuDocType = rsuDocType;
	}

	public Date getRsuApprDate() {
		return this.rsuApprDate;
	}

	public void setRsuApprDate(Date rsuApprDate) {
		this.rsuApprDate = rsuApprDate;
	}

	public Date getRsuRouteDate() {
		return this.rsuRouteDate;
	}

	public void setRsuRouteDate(Date rsuRouteDate) {
		this.rsuRouteDate = rsuRouteDate;
	}

	public String getRsuNotify2() {
		return this.rsuNotify2;
	}

	public void setRsuNotify2(String rsuNotify2) {
		this.rsuNotify2 = rsuNotify2;
	}

	public String getRsuUser1() {
		return this.rsuUser1;
	}

	public void setRsuUser1(String rsuUser1) {
		this.rsuUser1 = rsuUser1;
	}

	public String getRsuUser2() {
		return this.rsuUser2;
	}

	public void setRsuUser2(String rsuUser2) {
		this.rsuUser2 = rsuUser2;
	}

	public String getRsuNotify2Mail() {
		return this.rsuNotify2Mail;
	}

	public void setRsuNotify2Mail(String rsuNotify2Mail) {
		this.rsuNotify2Mail = rsuNotify2Mail;
	}

	public String getRsuQadc01() {
		return this.rsuQadc01;
	}

	public void setRsuQadc01(String rsuQadc01) {
		this.rsuQadc01 = rsuQadc01;
	}

	public Double getOidRsuMstr() {
		return this.oidRsuMstr;
	}

	public void setOidRsuMstr(Double oidRsuMstr) {
		this.oidRsuMstr = oidRsuMstr;
	}

}