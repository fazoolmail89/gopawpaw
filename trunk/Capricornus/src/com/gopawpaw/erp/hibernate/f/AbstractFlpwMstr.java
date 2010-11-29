package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFlpwMstr entity provides the base persistence definition of the
 * FlpwMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlpwMstr implements java.io.Serializable {

	// Fields

	private FlpwMstrId id;
	private String flpwCmmt;
	private String flpwUser1;
	private String flpwUser2;
	private String flpwQadc01;
	private Double oidFlpwMstr;

	// Constructors

	/** default constructor */
	public AbstractFlpwMstr() {
	}

	/** minimal constructor */
	public AbstractFlpwMstr(FlpwMstrId id, Double oidFlpwMstr) {
		this.id = id;
		this.oidFlpwMstr = oidFlpwMstr;
	}

	/** full constructor */
	public AbstractFlpwMstr(FlpwMstrId id, String flpwCmmt, String flpwUser1,
			String flpwUser2, String flpwQadc01, Double oidFlpwMstr) {
		this.id = id;
		this.flpwCmmt = flpwCmmt;
		this.flpwUser1 = flpwUser1;
		this.flpwUser2 = flpwUser2;
		this.flpwQadc01 = flpwQadc01;
		this.oidFlpwMstr = oidFlpwMstr;
	}

	// Property accessors

	public FlpwMstrId getId() {
		return this.id;
	}

	public void setId(FlpwMstrId id) {
		this.id = id;
	}

	public String getFlpwCmmt() {
		return this.flpwCmmt;
	}

	public void setFlpwCmmt(String flpwCmmt) {
		this.flpwCmmt = flpwCmmt;
	}

	public String getFlpwUser1() {
		return this.flpwUser1;
	}

	public void setFlpwUser1(String flpwUser1) {
		this.flpwUser1 = flpwUser1;
	}

	public String getFlpwUser2() {
		return this.flpwUser2;
	}

	public void setFlpwUser2(String flpwUser2) {
		this.flpwUser2 = flpwUser2;
	}

	public String getFlpwQadc01() {
		return this.flpwQadc01;
	}

	public void setFlpwQadc01(String flpwQadc01) {
		this.flpwQadc01 = flpwQadc01;
	}

	public Double getOidFlpwMstr() {
		return this.oidFlpwMstr;
	}

	public void setOidFlpwMstr(Double oidFlpwMstr) {
		this.oidFlpwMstr = oidFlpwMstr;
	}

}