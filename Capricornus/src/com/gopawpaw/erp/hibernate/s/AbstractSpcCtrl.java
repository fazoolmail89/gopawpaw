package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSpcCtrl entity provides the base persistence definition of the
 * SpcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSpcCtrl implements java.io.Serializable {

	// Fields

	private String spcDomain;
	private Integer spcNbr;
	private Integer spcQad01;
	private String spcUser1;
	private String spcUser2;
	private Integer spcQadi01;
	private Double oidSpcCtrl;

	// Constructors

	/** default constructor */
	public AbstractSpcCtrl() {
	}

	/** minimal constructor */
	public AbstractSpcCtrl(Double oidSpcCtrl) {
		this.oidSpcCtrl = oidSpcCtrl;
	}

	/** full constructor */
	public AbstractSpcCtrl(Integer spcNbr, Integer spcQad01, String spcUser1,
			String spcUser2, Integer spcQadi01, Double oidSpcCtrl) {
		this.spcNbr = spcNbr;
		this.spcQad01 = spcQad01;
		this.spcUser1 = spcUser1;
		this.spcUser2 = spcUser2;
		this.spcQadi01 = spcQadi01;
		this.oidSpcCtrl = oidSpcCtrl;
	}

	// Property accessors

	public String getSpcDomain() {
		return this.spcDomain;
	}

	public void setSpcDomain(String spcDomain) {
		this.spcDomain = spcDomain;
	}

	public Integer getSpcNbr() {
		return this.spcNbr;
	}

	public void setSpcNbr(Integer spcNbr) {
		this.spcNbr = spcNbr;
	}

	public Integer getSpcQad01() {
		return this.spcQad01;
	}

	public void setSpcQad01(Integer spcQad01) {
		this.spcQad01 = spcQad01;
	}

	public String getSpcUser1() {
		return this.spcUser1;
	}

	public void setSpcUser1(String spcUser1) {
		this.spcUser1 = spcUser1;
	}

	public String getSpcUser2() {
		return this.spcUser2;
	}

	public void setSpcUser2(String spcUser2) {
		this.spcUser2 = spcUser2;
	}

	public Integer getSpcQadi01() {
		return this.spcQadi01;
	}

	public void setSpcQadi01(Integer spcQadi01) {
		this.spcQadi01 = spcQadi01;
	}

	public Double getOidSpcCtrl() {
		return this.oidSpcCtrl;
	}

	public void setOidSpcCtrl(Double oidSpcCtrl) {
		this.oidSpcCtrl = oidSpcCtrl;
	}

}