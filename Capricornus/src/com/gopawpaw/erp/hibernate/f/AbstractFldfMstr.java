package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFldfMstr entity provides the base persistence definition of the
 * FldfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFldfMstr implements java.io.Serializable {

	// Fields

	private FldfMstrId id;
	private String fldfValue;
	private String fldfDesc;
	private String fldfUser1;
	private String fldfUser2;
	private String fldfQadc01;
	private Double oidFldfMstr;

	// Constructors

	/** default constructor */
	public AbstractFldfMstr() {
	}

	/** minimal constructor */
	public AbstractFldfMstr(FldfMstrId id, Double oidFldfMstr) {
		this.id = id;
		this.oidFldfMstr = oidFldfMstr;
	}

	/** full constructor */
	public AbstractFldfMstr(FldfMstrId id, String fldfValue, String fldfDesc,
			String fldfUser1, String fldfUser2, String fldfQadc01,
			Double oidFldfMstr) {
		this.id = id;
		this.fldfValue = fldfValue;
		this.fldfDesc = fldfDesc;
		this.fldfUser1 = fldfUser1;
		this.fldfUser2 = fldfUser2;
		this.fldfQadc01 = fldfQadc01;
		this.oidFldfMstr = oidFldfMstr;
	}

	// Property accessors

	public FldfMstrId getId() {
		return this.id;
	}

	public void setId(FldfMstrId id) {
		this.id = id;
	}

	public String getFldfValue() {
		return this.fldfValue;
	}

	public void setFldfValue(String fldfValue) {
		this.fldfValue = fldfValue;
	}

	public String getFldfDesc() {
		return this.fldfDesc;
	}

	public void setFldfDesc(String fldfDesc) {
		this.fldfDesc = fldfDesc;
	}

	public String getFldfUser1() {
		return this.fldfUser1;
	}

	public void setFldfUser1(String fldfUser1) {
		this.fldfUser1 = fldfUser1;
	}

	public String getFldfUser2() {
		return this.fldfUser2;
	}

	public void setFldfUser2(String fldfUser2) {
		this.fldfUser2 = fldfUser2;
	}

	public String getFldfQadc01() {
		return this.fldfQadc01;
	}

	public void setFldfQadc01(String fldfQadc01) {
		this.fldfQadc01 = fldfQadc01;
	}

	public Double getOidFldfMstr() {
		return this.oidFldfMstr;
	}

	public void setOidFldfMstr(Double oidFldfMstr) {
		this.oidFldfMstr = oidFldfMstr;
	}

}