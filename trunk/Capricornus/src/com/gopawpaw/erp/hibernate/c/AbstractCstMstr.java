package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCstMstr entity provides the base persistence definition of the
 * CstMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCstMstr implements java.io.Serializable {

	// Fields

	private String cstCust;
	private String cstDesc;
	private String cstQad01;
	private String cstQad02;
	private String cstUser1;
	private String cstUser2;
	private Double oidCstMstr;

	// Constructors

	/** default constructor */
	public AbstractCstMstr() {
	}

	/** minimal constructor */
	public AbstractCstMstr(Double oidCstMstr) {
		this.oidCstMstr = oidCstMstr;
	}

	/** full constructor */
	public AbstractCstMstr(String cstDesc, String cstQad01, String cstQad02,
			String cstUser1, String cstUser2, Double oidCstMstr) {
		this.cstDesc = cstDesc;
		this.cstQad01 = cstQad01;
		this.cstQad02 = cstQad02;
		this.cstUser1 = cstUser1;
		this.cstUser2 = cstUser2;
		this.oidCstMstr = oidCstMstr;
	}

	// Property accessors

	public String getCstCust() {
		return this.cstCust;
	}

	public void setCstCust(String cstCust) {
		this.cstCust = cstCust;
	}

	public String getCstDesc() {
		return this.cstDesc;
	}

	public void setCstDesc(String cstDesc) {
		this.cstDesc = cstDesc;
	}

	public String getCstQad01() {
		return this.cstQad01;
	}

	public void setCstQad01(String cstQad01) {
		this.cstQad01 = cstQad01;
	}

	public String getCstQad02() {
		return this.cstQad02;
	}

	public void setCstQad02(String cstQad02) {
		this.cstQad02 = cstQad02;
	}

	public String getCstUser1() {
		return this.cstUser1;
	}

	public void setCstUser1(String cstUser1) {
		this.cstUser1 = cstUser1;
	}

	public String getCstUser2() {
		return this.cstUser2;
	}

	public void setCstUser2(String cstUser2) {
		this.cstUser2 = cstUser2;
	}

	public Double getOidCstMstr() {
		return this.oidCstMstr;
	}

	public void setOidCstMstr(Double oidCstMstr) {
		this.oidCstMstr = oidCstMstr;
	}

}