package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmcCtrl entity provides the base persistence definition of the
 * CmcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmcCtrl implements java.io.Serializable {

	// Fields

	private String cmcDomain;
	private Integer cmcNbr;
	private String cmcUser1;
	private String cmcUser2;
	private Integer cmcQadi01;
	private String cmcQadc01;
	private Double oidCmcCtrl;

	// Constructors

	/** default constructor */
	public AbstractCmcCtrl() {
	}

	/** minimal constructor */
	public AbstractCmcCtrl(Double oidCmcCtrl) {
		this.oidCmcCtrl = oidCmcCtrl;
	}

	/** full constructor */
	public AbstractCmcCtrl(Integer cmcNbr, String cmcUser1, String cmcUser2,
			Integer cmcQadi01, String cmcQadc01, Double oidCmcCtrl) {
		this.cmcNbr = cmcNbr;
		this.cmcUser1 = cmcUser1;
		this.cmcUser2 = cmcUser2;
		this.cmcQadi01 = cmcQadi01;
		this.cmcQadc01 = cmcQadc01;
		this.oidCmcCtrl = oidCmcCtrl;
	}

	// Property accessors

	public String getCmcDomain() {
		return this.cmcDomain;
	}

	public void setCmcDomain(String cmcDomain) {
		this.cmcDomain = cmcDomain;
	}

	public Integer getCmcNbr() {
		return this.cmcNbr;
	}

	public void setCmcNbr(Integer cmcNbr) {
		this.cmcNbr = cmcNbr;
	}

	public String getCmcUser1() {
		return this.cmcUser1;
	}

	public void setCmcUser1(String cmcUser1) {
		this.cmcUser1 = cmcUser1;
	}

	public String getCmcUser2() {
		return this.cmcUser2;
	}

	public void setCmcUser2(String cmcUser2) {
		this.cmcUser2 = cmcUser2;
	}

	public Integer getCmcQadi01() {
		return this.cmcQadi01;
	}

	public void setCmcQadi01(Integer cmcQadi01) {
		this.cmcQadi01 = cmcQadi01;
	}

	public String getCmcQadc01() {
		return this.cmcQadc01;
	}

	public void setCmcQadc01(String cmcQadc01) {
		this.cmcQadc01 = cmcQadc01;
	}

	public Double getOidCmcCtrl() {
		return this.oidCmcCtrl;
	}

	public void setOidCmcCtrl(Double oidCmcCtrl) {
		this.oidCmcCtrl = oidCmcCtrl;
	}

}