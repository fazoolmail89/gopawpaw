package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsimMstr entity provides the base persistence definition of the
 * CsimMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsimMstr implements java.io.Serializable {

	// Fields

	private CsimMstrId id;
	private String csimDesc;
	private String csimUm;
	private Integer csimCmtindx;
	private String csimUser1;
	private String csimUser2;
	private String csimQadc01;
	private Double oidCsimMstr;

	// Constructors

	/** default constructor */
	public AbstractCsimMstr() {
	}

	/** minimal constructor */
	public AbstractCsimMstr(CsimMstrId id, Double oidCsimMstr) {
		this.id = id;
		this.oidCsimMstr = oidCsimMstr;
	}

	/** full constructor */
	public AbstractCsimMstr(CsimMstrId id, String csimDesc, String csimUm,
			Integer csimCmtindx, String csimUser1, String csimUser2,
			String csimQadc01, Double oidCsimMstr) {
		this.id = id;
		this.csimDesc = csimDesc;
		this.csimUm = csimUm;
		this.csimCmtindx = csimCmtindx;
		this.csimUser1 = csimUser1;
		this.csimUser2 = csimUser2;
		this.csimQadc01 = csimQadc01;
		this.oidCsimMstr = oidCsimMstr;
	}

	// Property accessors

	public CsimMstrId getId() {
		return this.id;
	}

	public void setId(CsimMstrId id) {
		this.id = id;
	}

	public String getCsimDesc() {
		return this.csimDesc;
	}

	public void setCsimDesc(String csimDesc) {
		this.csimDesc = csimDesc;
	}

	public String getCsimUm() {
		return this.csimUm;
	}

	public void setCsimUm(String csimUm) {
		this.csimUm = csimUm;
	}

	public Integer getCsimCmtindx() {
		return this.csimCmtindx;
	}

	public void setCsimCmtindx(Integer csimCmtindx) {
		this.csimCmtindx = csimCmtindx;
	}

	public String getCsimUser1() {
		return this.csimUser1;
	}

	public void setCsimUser1(String csimUser1) {
		this.csimUser1 = csimUser1;
	}

	public String getCsimUser2() {
		return this.csimUser2;
	}

	public void setCsimUser2(String csimUser2) {
		this.csimUser2 = csimUser2;
	}

	public String getCsimQadc01() {
		return this.csimQadc01;
	}

	public void setCsimQadc01(String csimQadc01) {
		this.csimQadc01 = csimQadc01;
	}

	public Double getOidCsimMstr() {
		return this.oidCsimMstr;
	}

	public void setOidCsimMstr(Double oidCsimMstr) {
		this.oidCsimMstr = oidCsimMstr;
	}

}