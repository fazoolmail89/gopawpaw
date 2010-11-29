package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMrpcCtrl entity provides the base persistence definition of the
 * MrpcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMrpcCtrl implements java.io.Serializable {

	// Fields

	private String mrpcDomain;
	private Integer mrpcHorizon;
	private Integer mrpcSumDef;
	private String mrpcUser1;
	private String mrpcUser2;
	private Integer mrpcQadi01;
	private Boolean mrpcDrp;
	private Integer mrpcReldays;
	private String mrpcQadc01;
	private Boolean mrpcOpYield;
	private Double oidMrpcCtrl;

	// Constructors

	/** default constructor */
	public AbstractMrpcCtrl() {
	}

	/** minimal constructor */
	public AbstractMrpcCtrl(Double oidMrpcCtrl) {
		this.oidMrpcCtrl = oidMrpcCtrl;
	}

	/** full constructor */
	public AbstractMrpcCtrl(Integer mrpcHorizon, Integer mrpcSumDef,
			String mrpcUser1, String mrpcUser2, Integer mrpcQadi01,
			Boolean mrpcDrp, Integer mrpcReldays, String mrpcQadc01,
			Boolean mrpcOpYield, Double oidMrpcCtrl) {
		this.mrpcHorizon = mrpcHorizon;
		this.mrpcSumDef = mrpcSumDef;
		this.mrpcUser1 = mrpcUser1;
		this.mrpcUser2 = mrpcUser2;
		this.mrpcQadi01 = mrpcQadi01;
		this.mrpcDrp = mrpcDrp;
		this.mrpcReldays = mrpcReldays;
		this.mrpcQadc01 = mrpcQadc01;
		this.mrpcOpYield = mrpcOpYield;
		this.oidMrpcCtrl = oidMrpcCtrl;
	}

	// Property accessors

	public String getMrpcDomain() {
		return this.mrpcDomain;
	}

	public void setMrpcDomain(String mrpcDomain) {
		this.mrpcDomain = mrpcDomain;
	}

	public Integer getMrpcHorizon() {
		return this.mrpcHorizon;
	}

	public void setMrpcHorizon(Integer mrpcHorizon) {
		this.mrpcHorizon = mrpcHorizon;
	}

	public Integer getMrpcSumDef() {
		return this.mrpcSumDef;
	}

	public void setMrpcSumDef(Integer mrpcSumDef) {
		this.mrpcSumDef = mrpcSumDef;
	}

	public String getMrpcUser1() {
		return this.mrpcUser1;
	}

	public void setMrpcUser1(String mrpcUser1) {
		this.mrpcUser1 = mrpcUser1;
	}

	public String getMrpcUser2() {
		return this.mrpcUser2;
	}

	public void setMrpcUser2(String mrpcUser2) {
		this.mrpcUser2 = mrpcUser2;
	}

	public Integer getMrpcQadi01() {
		return this.mrpcQadi01;
	}

	public void setMrpcQadi01(Integer mrpcQadi01) {
		this.mrpcQadi01 = mrpcQadi01;
	}

	public Boolean getMrpcDrp() {
		return this.mrpcDrp;
	}

	public void setMrpcDrp(Boolean mrpcDrp) {
		this.mrpcDrp = mrpcDrp;
	}

	public Integer getMrpcReldays() {
		return this.mrpcReldays;
	}

	public void setMrpcReldays(Integer mrpcReldays) {
		this.mrpcReldays = mrpcReldays;
	}

	public String getMrpcQadc01() {
		return this.mrpcQadc01;
	}

	public void setMrpcQadc01(String mrpcQadc01) {
		this.mrpcQadc01 = mrpcQadc01;
	}

	public Boolean getMrpcOpYield() {
		return this.mrpcOpYield;
	}

	public void setMrpcOpYield(Boolean mrpcOpYield) {
		this.mrpcOpYield = mrpcOpYield;
	}

	public Double getOidMrpcCtrl() {
		return this.oidMrpcCtrl;
	}

	public void setOidMrpcCtrl(Double oidMrpcCtrl) {
		this.oidMrpcCtrl = oidMrpcCtrl;
	}

}