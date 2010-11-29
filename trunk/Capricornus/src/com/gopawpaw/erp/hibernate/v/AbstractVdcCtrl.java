package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVdcCtrl entity provides the base persistence definition of the
 * VdcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVdcCtrl implements java.io.Serializable {

	// Fields

	private String vdcDomain;
	private Integer vdcNbr;
	private String vdcUser1;
	private String vdcUser2;
	private Integer vdcQadi01;
	private String vdcQadc01;
	private Double oidVdcCtrl;

	// Constructors

	/** default constructor */
	public AbstractVdcCtrl() {
	}

	/** minimal constructor */
	public AbstractVdcCtrl(Double oidVdcCtrl) {
		this.oidVdcCtrl = oidVdcCtrl;
	}

	/** full constructor */
	public AbstractVdcCtrl(Integer vdcNbr, String vdcUser1, String vdcUser2,
			Integer vdcQadi01, String vdcQadc01, Double oidVdcCtrl) {
		this.vdcNbr = vdcNbr;
		this.vdcUser1 = vdcUser1;
		this.vdcUser2 = vdcUser2;
		this.vdcQadi01 = vdcQadi01;
		this.vdcQadc01 = vdcQadc01;
		this.oidVdcCtrl = oidVdcCtrl;
	}

	// Property accessors

	public String getVdcDomain() {
		return this.vdcDomain;
	}

	public void setVdcDomain(String vdcDomain) {
		this.vdcDomain = vdcDomain;
	}

	public Integer getVdcNbr() {
		return this.vdcNbr;
	}

	public void setVdcNbr(Integer vdcNbr) {
		this.vdcNbr = vdcNbr;
	}

	public String getVdcUser1() {
		return this.vdcUser1;
	}

	public void setVdcUser1(String vdcUser1) {
		this.vdcUser1 = vdcUser1;
	}

	public String getVdcUser2() {
		return this.vdcUser2;
	}

	public void setVdcUser2(String vdcUser2) {
		this.vdcUser2 = vdcUser2;
	}

	public Integer getVdcQadi01() {
		return this.vdcQadi01;
	}

	public void setVdcQadi01(Integer vdcQadi01) {
		this.vdcQadi01 = vdcQadi01;
	}

	public String getVdcQadc01() {
		return this.vdcQadc01;
	}

	public void setVdcQadc01(String vdcQadc01) {
		this.vdcQadc01 = vdcQadc01;
	}

	public Double getOidVdcCtrl() {
		return this.oidVdcCtrl;
	}

	public void setOidVdcCtrl(Double oidVdcCtrl) {
		this.oidVdcCtrl = oidVdcCtrl;
	}

}