package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAdcCtrl entity provides the base persistence definition of the
 * AdcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdcCtrl implements java.io.Serializable {

	// Fields

	private String adcDomain;
	private Integer adcFormat;
	private String adcUser1;
	private String adcUser2;
	private Integer adcQadi01;
	private String adcQadc01;
	private Double oidAdcCtrl;

	// Constructors

	/** default constructor */
	public AbstractAdcCtrl() {
	}

	/** minimal constructor */
	public AbstractAdcCtrl(Double oidAdcCtrl) {
		this.oidAdcCtrl = oidAdcCtrl;
	}

	/** full constructor */
	public AbstractAdcCtrl(Integer adcFormat, String adcUser1, String adcUser2,
			Integer adcQadi01, String adcQadc01, Double oidAdcCtrl) {
		this.adcFormat = adcFormat;
		this.adcUser1 = adcUser1;
		this.adcUser2 = adcUser2;
		this.adcQadi01 = adcQadi01;
		this.adcQadc01 = adcQadc01;
		this.oidAdcCtrl = oidAdcCtrl;
	}

	// Property accessors

	public String getAdcDomain() {
		return this.adcDomain;
	}

	public void setAdcDomain(String adcDomain) {
		this.adcDomain = adcDomain;
	}

	public Integer getAdcFormat() {
		return this.adcFormat;
	}

	public void setAdcFormat(Integer adcFormat) {
		this.adcFormat = adcFormat;
	}

	public String getAdcUser1() {
		return this.adcUser1;
	}

	public void setAdcUser1(String adcUser1) {
		this.adcUser1 = adcUser1;
	}

	public String getAdcUser2() {
		return this.adcUser2;
	}

	public void setAdcUser2(String adcUser2) {
		this.adcUser2 = adcUser2;
	}

	public Integer getAdcQadi01() {
		return this.adcQadi01;
	}

	public void setAdcQadi01(Integer adcQadi01) {
		this.adcQadi01 = adcQadi01;
	}

	public String getAdcQadc01() {
		return this.adcQadc01;
	}

	public void setAdcQadc01(String adcQadc01) {
		this.adcQadc01 = adcQadc01;
	}

	public Double getOidAdcCtrl() {
		return this.oidAdcCtrl;
	}

	public void setOidAdcCtrl(Double oidAdcCtrl) {
		this.oidAdcCtrl = oidAdcCtrl;
	}

}