package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCslmMstr entity provides the base persistence definition of the
 * CslmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCslmMstr implements java.io.Serializable {

	// Fields

	private CslmMstrId id;
	private String cslmGroup;
	private Date cslmStart;
	private Date cslmEnd;
	private Double cslmMaxAmt;
	private Double cslmTotAmt;
	private Integer cslmMaxQty;
	private Integer cslmTotQty;
	private String cslmCurr;
	private Integer cslmCmtindx;
	private String cslmUser1;
	private String cslmUser2;
	private String cslmQadc01;
	private Double oidCslmMstr;

	// Constructors

	/** default constructor */
	public AbstractCslmMstr() {
	}

	/** minimal constructor */
	public AbstractCslmMstr(CslmMstrId id, Double oidCslmMstr) {
		this.id = id;
		this.oidCslmMstr = oidCslmMstr;
	}

	/** full constructor */
	public AbstractCslmMstr(CslmMstrId id, String cslmGroup, Date cslmStart,
			Date cslmEnd, Double cslmMaxAmt, Double cslmTotAmt,
			Integer cslmMaxQty, Integer cslmTotQty, String cslmCurr,
			Integer cslmCmtindx, String cslmUser1, String cslmUser2,
			String cslmQadc01, Double oidCslmMstr) {
		this.id = id;
		this.cslmGroup = cslmGroup;
		this.cslmStart = cslmStart;
		this.cslmEnd = cslmEnd;
		this.cslmMaxAmt = cslmMaxAmt;
		this.cslmTotAmt = cslmTotAmt;
		this.cslmMaxQty = cslmMaxQty;
		this.cslmTotQty = cslmTotQty;
		this.cslmCurr = cslmCurr;
		this.cslmCmtindx = cslmCmtindx;
		this.cslmUser1 = cslmUser1;
		this.cslmUser2 = cslmUser2;
		this.cslmQadc01 = cslmQadc01;
		this.oidCslmMstr = oidCslmMstr;
	}

	// Property accessors

	public CslmMstrId getId() {
		return this.id;
	}

	public void setId(CslmMstrId id) {
		this.id = id;
	}

	public String getCslmGroup() {
		return this.cslmGroup;
	}

	public void setCslmGroup(String cslmGroup) {
		this.cslmGroup = cslmGroup;
	}

	public Date getCslmStart() {
		return this.cslmStart;
	}

	public void setCslmStart(Date cslmStart) {
		this.cslmStart = cslmStart;
	}

	public Date getCslmEnd() {
		return this.cslmEnd;
	}

	public void setCslmEnd(Date cslmEnd) {
		this.cslmEnd = cslmEnd;
	}

	public Double getCslmMaxAmt() {
		return this.cslmMaxAmt;
	}

	public void setCslmMaxAmt(Double cslmMaxAmt) {
		this.cslmMaxAmt = cslmMaxAmt;
	}

	public Double getCslmTotAmt() {
		return this.cslmTotAmt;
	}

	public void setCslmTotAmt(Double cslmTotAmt) {
		this.cslmTotAmt = cslmTotAmt;
	}

	public Integer getCslmMaxQty() {
		return this.cslmMaxQty;
	}

	public void setCslmMaxQty(Integer cslmMaxQty) {
		this.cslmMaxQty = cslmMaxQty;
	}

	public Integer getCslmTotQty() {
		return this.cslmTotQty;
	}

	public void setCslmTotQty(Integer cslmTotQty) {
		this.cslmTotQty = cslmTotQty;
	}

	public String getCslmCurr() {
		return this.cslmCurr;
	}

	public void setCslmCurr(String cslmCurr) {
		this.cslmCurr = cslmCurr;
	}

	public Integer getCslmCmtindx() {
		return this.cslmCmtindx;
	}

	public void setCslmCmtindx(Integer cslmCmtindx) {
		this.cslmCmtindx = cslmCmtindx;
	}

	public String getCslmUser1() {
		return this.cslmUser1;
	}

	public void setCslmUser1(String cslmUser1) {
		this.cslmUser1 = cslmUser1;
	}

	public String getCslmUser2() {
		return this.cslmUser2;
	}

	public void setCslmUser2(String cslmUser2) {
		this.cslmUser2 = cslmUser2;
	}

	public String getCslmQadc01() {
		return this.cslmQadc01;
	}

	public void setCslmQadc01(String cslmQadc01) {
		this.cslmQadc01 = cslmQadc01;
	}

	public Double getOidCslmMstr() {
		return this.oidCslmMstr;
	}

	public void setOidCslmMstr(Double oidCslmMstr) {
		this.oidCslmMstr = oidCslmMstr;
	}

}