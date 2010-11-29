package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCssMstr entity provides the base persistence definition of the
 * CssMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCssMstr implements java.io.Serializable {

	// Fields

	private CssMstrId id;
	private String cssCtrl;
	private Date cssStart;
	private Date cssEnd;
	private Integer cssCmtindx;
	private String cssUser1;
	private String cssUser2;
	private String cssQadc01;
	private Double oidCssMstr;

	// Constructors

	/** default constructor */
	public AbstractCssMstr() {
	}

	/** minimal constructor */
	public AbstractCssMstr(CssMstrId id, Double oidCssMstr) {
		this.id = id;
		this.oidCssMstr = oidCssMstr;
	}

	/** full constructor */
	public AbstractCssMstr(CssMstrId id, String cssCtrl, Date cssStart,
			Date cssEnd, Integer cssCmtindx, String cssUser1, String cssUser2,
			String cssQadc01, Double oidCssMstr) {
		this.id = id;
		this.cssCtrl = cssCtrl;
		this.cssStart = cssStart;
		this.cssEnd = cssEnd;
		this.cssCmtindx = cssCmtindx;
		this.cssUser1 = cssUser1;
		this.cssUser2 = cssUser2;
		this.cssQadc01 = cssQadc01;
		this.oidCssMstr = oidCssMstr;
	}

	// Property accessors

	public CssMstrId getId() {
		return this.id;
	}

	public void setId(CssMstrId id) {
		this.id = id;
	}

	public String getCssCtrl() {
		return this.cssCtrl;
	}

	public void setCssCtrl(String cssCtrl) {
		this.cssCtrl = cssCtrl;
	}

	public Date getCssStart() {
		return this.cssStart;
	}

	public void setCssStart(Date cssStart) {
		this.cssStart = cssStart;
	}

	public Date getCssEnd() {
		return this.cssEnd;
	}

	public void setCssEnd(Date cssEnd) {
		this.cssEnd = cssEnd;
	}

	public Integer getCssCmtindx() {
		return this.cssCmtindx;
	}

	public void setCssCmtindx(Integer cssCmtindx) {
		this.cssCmtindx = cssCmtindx;
	}

	public String getCssUser1() {
		return this.cssUser1;
	}

	public void setCssUser1(String cssUser1) {
		this.cssUser1 = cssUser1;
	}

	public String getCssUser2() {
		return this.cssUser2;
	}

	public void setCssUser2(String cssUser2) {
		this.cssUser2 = cssUser2;
	}

	public String getCssQadc01() {
		return this.cssQadc01;
	}

	public void setCssQadc01(String cssQadc01) {
		this.cssQadc01 = cssQadc01;
	}

	public Double getOidCssMstr() {
		return this.oidCssMstr;
	}

	public void setOidCssMstr(Double oidCssMstr) {
		this.oidCssMstr = oidCssMstr;
	}

}