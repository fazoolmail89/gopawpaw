package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDfMstr entity provides the base persistence definition of the DfMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDfMstr implements java.io.Serializable {

	// Fields

	private DfMstrId id;
	private String dfDesc;
	private String dfFormCode;
	private Boolean dfInv;
	private String dfUser1;
	private String dfUser2;
	private String dfQadc01;
	private Double oidDfMstr;

	// Constructors

	/** default constructor */
	public AbstractDfMstr() {
	}

	/** minimal constructor */
	public AbstractDfMstr(DfMstrId id, String dfDesc, String dfFormCode,
			Boolean dfInv, Double oidDfMstr) {
		this.id = id;
		this.dfDesc = dfDesc;
		this.dfFormCode = dfFormCode;
		this.dfInv = dfInv;
		this.oidDfMstr = oidDfMstr;
	}

	/** full constructor */
	public AbstractDfMstr(DfMstrId id, String dfDesc, String dfFormCode,
			Boolean dfInv, String dfUser1, String dfUser2, String dfQadc01,
			Double oidDfMstr) {
		this.id = id;
		this.dfDesc = dfDesc;
		this.dfFormCode = dfFormCode;
		this.dfInv = dfInv;
		this.dfUser1 = dfUser1;
		this.dfUser2 = dfUser2;
		this.dfQadc01 = dfQadc01;
		this.oidDfMstr = oidDfMstr;
	}

	// Property accessors

	public DfMstrId getId() {
		return this.id;
	}

	public void setId(DfMstrId id) {
		this.id = id;
	}

	public String getDfDesc() {
		return this.dfDesc;
	}

	public void setDfDesc(String dfDesc) {
		this.dfDesc = dfDesc;
	}

	public String getDfFormCode() {
		return this.dfFormCode;
	}

	public void setDfFormCode(String dfFormCode) {
		this.dfFormCode = dfFormCode;
	}

	public Boolean getDfInv() {
		return this.dfInv;
	}

	public void setDfInv(Boolean dfInv) {
		this.dfInv = dfInv;
	}

	public String getDfUser1() {
		return this.dfUser1;
	}

	public void setDfUser1(String dfUser1) {
		this.dfUser1 = dfUser1;
	}

	public String getDfUser2() {
		return this.dfUser2;
	}

	public void setDfUser2(String dfUser2) {
		this.dfUser2 = dfUser2;
	}

	public String getDfQadc01() {
		return this.dfQadc01;
	}

	public void setDfQadc01(String dfQadc01) {
		this.dfQadc01 = dfQadc01;
	}

	public Double getOidDfMstr() {
		return this.oidDfMstr;
	}

	public void setOidDfMstr(Double oidDfMstr) {
		this.oidDfMstr = oidDfMstr;
	}

}