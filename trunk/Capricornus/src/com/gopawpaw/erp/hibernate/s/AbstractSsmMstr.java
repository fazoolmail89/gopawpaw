package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSsmMstr entity provides the base persistence definition of the
 * SsmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSsmMstr implements java.io.Serializable {

	// Fields

	private SsmMstrId id;
	private String ssmDesc;
	private String ssmPlanner;
	private String ssmUser1;
	private String ssmUser2;
	private String ssmQadc01;
	private Double oidSsmMstr;

	// Constructors

	/** default constructor */
	public AbstractSsmMstr() {
	}

	/** minimal constructor */
	public AbstractSsmMstr(SsmMstrId id, Double oidSsmMstr) {
		this.id = id;
		this.oidSsmMstr = oidSsmMstr;
	}

	/** full constructor */
	public AbstractSsmMstr(SsmMstrId id, String ssmDesc, String ssmPlanner,
			String ssmUser1, String ssmUser2, String ssmQadc01,
			Double oidSsmMstr) {
		this.id = id;
		this.ssmDesc = ssmDesc;
		this.ssmPlanner = ssmPlanner;
		this.ssmUser1 = ssmUser1;
		this.ssmUser2 = ssmUser2;
		this.ssmQadc01 = ssmQadc01;
		this.oidSsmMstr = oidSsmMstr;
	}

	// Property accessors

	public SsmMstrId getId() {
		return this.id;
	}

	public void setId(SsmMstrId id) {
		this.id = id;
	}

	public String getSsmDesc() {
		return this.ssmDesc;
	}

	public void setSsmDesc(String ssmDesc) {
		this.ssmDesc = ssmDesc;
	}

	public String getSsmPlanner() {
		return this.ssmPlanner;
	}

	public void setSsmPlanner(String ssmPlanner) {
		this.ssmPlanner = ssmPlanner;
	}

	public String getSsmUser1() {
		return this.ssmUser1;
	}

	public void setSsmUser1(String ssmUser1) {
		this.ssmUser1 = ssmUser1;
	}

	public String getSsmUser2() {
		return this.ssmUser2;
	}

	public void setSsmUser2(String ssmUser2) {
		this.ssmUser2 = ssmUser2;
	}

	public String getSsmQadc01() {
		return this.ssmQadc01;
	}

	public void setSsmQadc01(String ssmQadc01) {
		this.ssmQadc01 = ssmQadc01;
	}

	public Double getOidSsmMstr() {
		return this.oidSsmMstr;
	}

	public void setOidSsmMstr(Double oidSsmMstr) {
		this.oidSsmMstr = oidSsmMstr;
	}

}