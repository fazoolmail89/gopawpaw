package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsMstr entity provides the base persistence definition of the RsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsMstr implements java.io.Serializable {

	// Fields

	private RsMstrId id;
	private String rsDesc;
	private String rsUm;
	private String rsUser1;
	private String rsUser2;
	private String rsQadc01;
	private Double oidRsMstr;

	// Constructors

	/** default constructor */
	public AbstractRsMstr() {
	}

	/** minimal constructor */
	public AbstractRsMstr(RsMstrId id, Double oidRsMstr) {
		this.id = id;
		this.oidRsMstr = oidRsMstr;
	}

	/** full constructor */
	public AbstractRsMstr(RsMstrId id, String rsDesc, String rsUm,
			String rsUser1, String rsUser2, String rsQadc01, Double oidRsMstr) {
		this.id = id;
		this.rsDesc = rsDesc;
		this.rsUm = rsUm;
		this.rsUser1 = rsUser1;
		this.rsUser2 = rsUser2;
		this.rsQadc01 = rsQadc01;
		this.oidRsMstr = oidRsMstr;
	}

	// Property accessors

	public RsMstrId getId() {
		return this.id;
	}

	public void setId(RsMstrId id) {
		this.id = id;
	}

	public String getRsDesc() {
		return this.rsDesc;
	}

	public void setRsDesc(String rsDesc) {
		this.rsDesc = rsDesc;
	}

	public String getRsUm() {
		return this.rsUm;
	}

	public void setRsUm(String rsUm) {
		this.rsUm = rsUm;
	}

	public String getRsUser1() {
		return this.rsUser1;
	}

	public void setRsUser1(String rsUser1) {
		this.rsUser1 = rsUser1;
	}

	public String getRsUser2() {
		return this.rsUser2;
	}

	public void setRsUser2(String rsUser2) {
		this.rsUser2 = rsUser2;
	}

	public String getRsQadc01() {
		return this.rsQadc01;
	}

	public void setRsQadc01(String rsQadc01) {
		this.rsQadc01 = rsQadc01;
	}

	public Double getOidRsMstr() {
		return this.oidRsMstr;
	}

	public void setOidRsMstr(Double oidRsMstr) {
		this.oidRsMstr = oidRsMstr;
	}

}