package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEmcCtrl entity provides the base persistence definition of the
 * EmcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmcCtrl implements java.io.Serializable {

	// Fields

	private String emcDomain;
	private Integer emcNbr;
	private Integer emcQad01;
	private String emcUser1;
	private String emcUser2;
	private Integer emcQadi01;
	private Double oidEmcCtrl;

	// Constructors

	/** default constructor */
	public AbstractEmcCtrl() {
	}

	/** minimal constructor */
	public AbstractEmcCtrl(Double oidEmcCtrl) {
		this.oidEmcCtrl = oidEmcCtrl;
	}

	/** full constructor */
	public AbstractEmcCtrl(Integer emcNbr, Integer emcQad01, String emcUser1,
			String emcUser2, Integer emcQadi01, Double oidEmcCtrl) {
		this.emcNbr = emcNbr;
		this.emcQad01 = emcQad01;
		this.emcUser1 = emcUser1;
		this.emcUser2 = emcUser2;
		this.emcQadi01 = emcQadi01;
		this.oidEmcCtrl = oidEmcCtrl;
	}

	// Property accessors

	public String getEmcDomain() {
		return this.emcDomain;
	}

	public void setEmcDomain(String emcDomain) {
		this.emcDomain = emcDomain;
	}

	public Integer getEmcNbr() {
		return this.emcNbr;
	}

	public void setEmcNbr(Integer emcNbr) {
		this.emcNbr = emcNbr;
	}

	public Integer getEmcQad01() {
		return this.emcQad01;
	}

	public void setEmcQad01(Integer emcQad01) {
		this.emcQad01 = emcQad01;
	}

	public String getEmcUser1() {
		return this.emcUser1;
	}

	public void setEmcUser1(String emcUser1) {
		this.emcUser1 = emcUser1;
	}

	public String getEmcUser2() {
		return this.emcUser2;
	}

	public void setEmcUser2(String emcUser2) {
		this.emcUser2 = emcUser2;
	}

	public Integer getEmcQadi01() {
		return this.emcQadi01;
	}

	public void setEmcQadi01(Integer emcQadi01) {
		this.emcQadi01 = emcQadi01;
	}

	public Double getOidEmcCtrl() {
		return this.oidEmcCtrl;
	}

	public void setOidEmcCtrl(Double oidEmcCtrl) {
		this.oidEmcCtrl = oidEmcCtrl;
	}

}