package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSrocCtrl entity provides the base persistence definition of the
 * SrocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrocCtrl implements java.io.Serializable {

	// Fields

	private String srocDomain;
	private Integer srocSro;
	private Integer srocQad01;
	private String srocUser1;
	private String srocUser2;
	private Integer srocQadi01;
	private String srocSroPre;
	private Double oidSrocCtrl;

	// Constructors

	/** default constructor */
	public AbstractSrocCtrl() {
	}

	/** minimal constructor */
	public AbstractSrocCtrl(Double oidSrocCtrl) {
		this.oidSrocCtrl = oidSrocCtrl;
	}

	/** full constructor */
	public AbstractSrocCtrl(Integer srocSro, Integer srocQad01,
			String srocUser1, String srocUser2, Integer srocQadi01,
			String srocSroPre, Double oidSrocCtrl) {
		this.srocSro = srocSro;
		this.srocQad01 = srocQad01;
		this.srocUser1 = srocUser1;
		this.srocUser2 = srocUser2;
		this.srocQadi01 = srocQadi01;
		this.srocSroPre = srocSroPre;
		this.oidSrocCtrl = oidSrocCtrl;
	}

	// Property accessors

	public String getSrocDomain() {
		return this.srocDomain;
	}

	public void setSrocDomain(String srocDomain) {
		this.srocDomain = srocDomain;
	}

	public Integer getSrocSro() {
		return this.srocSro;
	}

	public void setSrocSro(Integer srocSro) {
		this.srocSro = srocSro;
	}

	public Integer getSrocQad01() {
		return this.srocQad01;
	}

	public void setSrocQad01(Integer srocQad01) {
		this.srocQad01 = srocQad01;
	}

	public String getSrocUser1() {
		return this.srocUser1;
	}

	public void setSrocUser1(String srocUser1) {
		this.srocUser1 = srocUser1;
	}

	public String getSrocUser2() {
		return this.srocUser2;
	}

	public void setSrocUser2(String srocUser2) {
		this.srocUser2 = srocUser2;
	}

	public Integer getSrocQadi01() {
		return this.srocQadi01;
	}

	public void setSrocQadi01(Integer srocQadi01) {
		this.srocQadi01 = srocQadi01;
	}

	public String getSrocSroPre() {
		return this.srocSroPre;
	}

	public void setSrocSroPre(String srocSroPre) {
		this.srocSroPre = srocSroPre;
	}

	public Double getOidSrocCtrl() {
		return this.oidSrocCtrl;
	}

	public void setOidSrocCtrl(Double oidSrocCtrl) {
		this.oidSrocCtrl = oidSrocCtrl;
	}

}