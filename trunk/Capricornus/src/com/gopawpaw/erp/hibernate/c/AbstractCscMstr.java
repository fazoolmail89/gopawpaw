package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCscMstr entity provides the base persistence definition of the
 * CscMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCscMstr implements java.io.Serializable {

	// Fields

	private CscMstrId id;
	private String cscCtrl;
	private Date cscStart;
	private Date cscEnd;
	private Integer cscCmtindx;
	private String cscUser1;
	private String cscUser2;
	private String cscQadc01;
	private Double oidCscMstr;

	// Constructors

	/** default constructor */
	public AbstractCscMstr() {
	}

	/** minimal constructor */
	public AbstractCscMstr(CscMstrId id, Double oidCscMstr) {
		this.id = id;
		this.oidCscMstr = oidCscMstr;
	}

	/** full constructor */
	public AbstractCscMstr(CscMstrId id, String cscCtrl, Date cscStart,
			Date cscEnd, Integer cscCmtindx, String cscUser1, String cscUser2,
			String cscQadc01, Double oidCscMstr) {
		this.id = id;
		this.cscCtrl = cscCtrl;
		this.cscStart = cscStart;
		this.cscEnd = cscEnd;
		this.cscCmtindx = cscCmtindx;
		this.cscUser1 = cscUser1;
		this.cscUser2 = cscUser2;
		this.cscQadc01 = cscQadc01;
		this.oidCscMstr = oidCscMstr;
	}

	// Property accessors

	public CscMstrId getId() {
		return this.id;
	}

	public void setId(CscMstrId id) {
		this.id = id;
	}

	public String getCscCtrl() {
		return this.cscCtrl;
	}

	public void setCscCtrl(String cscCtrl) {
		this.cscCtrl = cscCtrl;
	}

	public Date getCscStart() {
		return this.cscStart;
	}

	public void setCscStart(Date cscStart) {
		this.cscStart = cscStart;
	}

	public Date getCscEnd() {
		return this.cscEnd;
	}

	public void setCscEnd(Date cscEnd) {
		this.cscEnd = cscEnd;
	}

	public Integer getCscCmtindx() {
		return this.cscCmtindx;
	}

	public void setCscCmtindx(Integer cscCmtindx) {
		this.cscCmtindx = cscCmtindx;
	}

	public String getCscUser1() {
		return this.cscUser1;
	}

	public void setCscUser1(String cscUser1) {
		this.cscUser1 = cscUser1;
	}

	public String getCscUser2() {
		return this.cscUser2;
	}

	public void setCscUser2(String cscUser2) {
		this.cscUser2 = cscUser2;
	}

	public String getCscQadc01() {
		return this.cscQadc01;
	}

	public void setCscQadc01(String cscQadc01) {
		this.cscQadc01 = cscQadc01;
	}

	public Double getOidCscMstr() {
		return this.oidCscMstr;
	}

	public void setOidCscMstr(Double oidCscMstr) {
		this.oidCscMstr = oidCscMstr;
	}

}