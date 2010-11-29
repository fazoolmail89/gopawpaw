package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDydMstr entity provides the base persistence definition of the
 * DydMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDydMstr implements java.io.Serializable {

	// Fields

	private DydMstrId id;
	private String dydDyCode;
	private String dydUser1;
	private String dydUser2;
	private String dydQadc01;
	private Double oidDydMstr;

	// Constructors

	/** default constructor */
	public AbstractDydMstr() {
	}

	/** minimal constructor */
	public AbstractDydMstr(DydMstrId id, String dydDyCode, Double oidDydMstr) {
		this.id = id;
		this.dydDyCode = dydDyCode;
		this.oidDydMstr = oidDydMstr;
	}

	/** full constructor */
	public AbstractDydMstr(DydMstrId id, String dydDyCode, String dydUser1,
			String dydUser2, String dydQadc01, Double oidDydMstr) {
		this.id = id;
		this.dydDyCode = dydDyCode;
		this.dydUser1 = dydUser1;
		this.dydUser2 = dydUser2;
		this.dydQadc01 = dydQadc01;
		this.oidDydMstr = oidDydMstr;
	}

	// Property accessors

	public DydMstrId getId() {
		return this.id;
	}

	public void setId(DydMstrId id) {
		this.id = id;
	}

	public String getDydDyCode() {
		return this.dydDyCode;
	}

	public void setDydDyCode(String dydDyCode) {
		this.dydDyCode = dydDyCode;
	}

	public String getDydUser1() {
		return this.dydUser1;
	}

	public void setDydUser1(String dydUser1) {
		this.dydUser1 = dydUser1;
	}

	public String getDydUser2() {
		return this.dydUser2;
	}

	public void setDydUser2(String dydUser2) {
		this.dydUser2 = dydUser2;
	}

	public String getDydQadc01() {
		return this.dydQadc01;
	}

	public void setDydQadc01(String dydQadc01) {
		this.dydQadc01 = dydQadc01;
	}

	public Double getOidDydMstr() {
		return this.oidDydMstr;
	}

	public void setOidDydMstr(Double oidDydMstr) {
		this.oidDydMstr = oidDydMstr;
	}

}