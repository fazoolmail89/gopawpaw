package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsaMstr entity provides the base persistence definition of the
 * CsaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsaMstr implements java.io.Serializable {

	// Fields

	private CsaMstrId id;
	private String csaName;
	private String csaType;
	private String csaGroup;
	private Integer csaCmtindx;
	private String csaUser1;
	private String csaUser2;
	private String csaQadc01;
	private Double oidCsaMstr;

	// Constructors

	/** default constructor */
	public AbstractCsaMstr() {
	}

	/** minimal constructor */
	public AbstractCsaMstr(CsaMstrId id, Double oidCsaMstr) {
		this.id = id;
		this.oidCsaMstr = oidCsaMstr;
	}

	/** full constructor */
	public AbstractCsaMstr(CsaMstrId id, String csaName, String csaType,
			String csaGroup, Integer csaCmtindx, String csaUser1,
			String csaUser2, String csaQadc01, Double oidCsaMstr) {
		this.id = id;
		this.csaName = csaName;
		this.csaType = csaType;
		this.csaGroup = csaGroup;
		this.csaCmtindx = csaCmtindx;
		this.csaUser1 = csaUser1;
		this.csaUser2 = csaUser2;
		this.csaQadc01 = csaQadc01;
		this.oidCsaMstr = oidCsaMstr;
	}

	// Property accessors

	public CsaMstrId getId() {
		return this.id;
	}

	public void setId(CsaMstrId id) {
		this.id = id;
	}

	public String getCsaName() {
		return this.csaName;
	}

	public void setCsaName(String csaName) {
		this.csaName = csaName;
	}

	public String getCsaType() {
		return this.csaType;
	}

	public void setCsaType(String csaType) {
		this.csaType = csaType;
	}

	public String getCsaGroup() {
		return this.csaGroup;
	}

	public void setCsaGroup(String csaGroup) {
		this.csaGroup = csaGroup;
	}

	public Integer getCsaCmtindx() {
		return this.csaCmtindx;
	}

	public void setCsaCmtindx(Integer csaCmtindx) {
		this.csaCmtindx = csaCmtindx;
	}

	public String getCsaUser1() {
		return this.csaUser1;
	}

	public void setCsaUser1(String csaUser1) {
		this.csaUser1 = csaUser1;
	}

	public String getCsaUser2() {
		return this.csaUser2;
	}

	public void setCsaUser2(String csaUser2) {
		this.csaUser2 = csaUser2;
	}

	public String getCsaQadc01() {
		return this.csaQadc01;
	}

	public void setCsaQadc01(String csaQadc01) {
		this.csaQadc01 = csaQadc01;
	}

	public Double getOidCsaMstr() {
		return this.oidCsaMstr;
	}

	public void setOidCsaMstr(Double oidCsaMstr) {
		this.oidCsaMstr = oidCsaMstr;
	}

}