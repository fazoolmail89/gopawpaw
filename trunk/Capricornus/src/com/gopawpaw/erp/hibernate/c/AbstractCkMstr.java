package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCkMstr entity provides the base persistence definition of the CkMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCkMstr implements java.io.Serializable {

	// Fields

	private CkMstrId id;
	private String ckStatus;
	private Integer ckNbr;
	private String ckBank;
	private String ckType;
	private Integer ckCmtindx;
	private String ckCurr;
	private Double ckExRate;
	private Date ckVoiddate;
	private Date ckVoideff;
	private String ckUser1;
	private String ckUser2;
	private Date ckClrDate;
	private String ckQadc01;
	private Double ckExRate2;
	private String ckExRatetype;
	private Integer ckExruSeq;
	private Double oidCkMstr;

	// Constructors

	/** default constructor */
	public AbstractCkMstr() {
	}

	/** minimal constructor */
	public AbstractCkMstr(CkMstrId id, Double ckExRate2, String ckExRatetype,
			Integer ckExruSeq, Double oidCkMstr) {
		this.id = id;
		this.ckExRate2 = ckExRate2;
		this.ckExRatetype = ckExRatetype;
		this.ckExruSeq = ckExruSeq;
		this.oidCkMstr = oidCkMstr;
	}

	/** full constructor */
	public AbstractCkMstr(CkMstrId id, String ckStatus, Integer ckNbr,
			String ckBank, String ckType, Integer ckCmtindx, String ckCurr,
			Double ckExRate, Date ckVoiddate, Date ckVoideff, String ckUser1,
			String ckUser2, Date ckClrDate, String ckQadc01, Double ckExRate2,
			String ckExRatetype, Integer ckExruSeq, Double oidCkMstr) {
		this.id = id;
		this.ckStatus = ckStatus;
		this.ckNbr = ckNbr;
		this.ckBank = ckBank;
		this.ckType = ckType;
		this.ckCmtindx = ckCmtindx;
		this.ckCurr = ckCurr;
		this.ckExRate = ckExRate;
		this.ckVoiddate = ckVoiddate;
		this.ckVoideff = ckVoideff;
		this.ckUser1 = ckUser1;
		this.ckUser2 = ckUser2;
		this.ckClrDate = ckClrDate;
		this.ckQadc01 = ckQadc01;
		this.ckExRate2 = ckExRate2;
		this.ckExRatetype = ckExRatetype;
		this.ckExruSeq = ckExruSeq;
		this.oidCkMstr = oidCkMstr;
	}

	// Property accessors

	public CkMstrId getId() {
		return this.id;
	}

	public void setId(CkMstrId id) {
		this.id = id;
	}

	public String getCkStatus() {
		return this.ckStatus;
	}

	public void setCkStatus(String ckStatus) {
		this.ckStatus = ckStatus;
	}

	public Integer getCkNbr() {
		return this.ckNbr;
	}

	public void setCkNbr(Integer ckNbr) {
		this.ckNbr = ckNbr;
	}

	public String getCkBank() {
		return this.ckBank;
	}

	public void setCkBank(String ckBank) {
		this.ckBank = ckBank;
	}

	public String getCkType() {
		return this.ckType;
	}

	public void setCkType(String ckType) {
		this.ckType = ckType;
	}

	public Integer getCkCmtindx() {
		return this.ckCmtindx;
	}

	public void setCkCmtindx(Integer ckCmtindx) {
		this.ckCmtindx = ckCmtindx;
	}

	public String getCkCurr() {
		return this.ckCurr;
	}

	public void setCkCurr(String ckCurr) {
		this.ckCurr = ckCurr;
	}

	public Double getCkExRate() {
		return this.ckExRate;
	}

	public void setCkExRate(Double ckExRate) {
		this.ckExRate = ckExRate;
	}

	public Date getCkVoiddate() {
		return this.ckVoiddate;
	}

	public void setCkVoiddate(Date ckVoiddate) {
		this.ckVoiddate = ckVoiddate;
	}

	public Date getCkVoideff() {
		return this.ckVoideff;
	}

	public void setCkVoideff(Date ckVoideff) {
		this.ckVoideff = ckVoideff;
	}

	public String getCkUser1() {
		return this.ckUser1;
	}

	public void setCkUser1(String ckUser1) {
		this.ckUser1 = ckUser1;
	}

	public String getCkUser2() {
		return this.ckUser2;
	}

	public void setCkUser2(String ckUser2) {
		this.ckUser2 = ckUser2;
	}

	public Date getCkClrDate() {
		return this.ckClrDate;
	}

	public void setCkClrDate(Date ckClrDate) {
		this.ckClrDate = ckClrDate;
	}

	public String getCkQadc01() {
		return this.ckQadc01;
	}

	public void setCkQadc01(String ckQadc01) {
		this.ckQadc01 = ckQadc01;
	}

	public Double getCkExRate2() {
		return this.ckExRate2;
	}

	public void setCkExRate2(Double ckExRate2) {
		this.ckExRate2 = ckExRate2;
	}

	public String getCkExRatetype() {
		return this.ckExRatetype;
	}

	public void setCkExRatetype(String ckExRatetype) {
		this.ckExRatetype = ckExRatetype;
	}

	public Integer getCkExruSeq() {
		return this.ckExruSeq;
	}

	public void setCkExruSeq(Integer ckExruSeq) {
		this.ckExruSeq = ckExruSeq;
	}

	public Double getOidCkMstr() {
		return this.oidCkMstr;
	}

	public void setOidCkMstr(Double oidCkMstr) {
		this.oidCkMstr = oidCkMstr;
	}

}