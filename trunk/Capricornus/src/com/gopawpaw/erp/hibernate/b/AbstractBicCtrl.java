package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBicCtrl entity provides the base persistence definition of the
 * BicCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBicCtrl implements java.io.Serializable {

	// Fields

	private String bicDomain;
	private Integer bicPeriods;
	private Date bicLastDue;
	private String bicLastCyc;
	private Date bicLstDate;
	private Integer bicQadi01;
	private Boolean bicAudit;
	private String bicUser1;
	private String bicUser2;
	private String bicQadc01;
	private Double oidBicCtrl;

	// Constructors

	/** default constructor */
	public AbstractBicCtrl() {
	}

	/** minimal constructor */
	public AbstractBicCtrl(Double oidBicCtrl) {
		this.oidBicCtrl = oidBicCtrl;
	}

	/** full constructor */
	public AbstractBicCtrl(Integer bicPeriods, Date bicLastDue,
			String bicLastCyc, Date bicLstDate, Integer bicQadi01,
			Boolean bicAudit, String bicUser1, String bicUser2,
			String bicQadc01, Double oidBicCtrl) {
		this.bicPeriods = bicPeriods;
		this.bicLastDue = bicLastDue;
		this.bicLastCyc = bicLastCyc;
		this.bicLstDate = bicLstDate;
		this.bicQadi01 = bicQadi01;
		this.bicAudit = bicAudit;
		this.bicUser1 = bicUser1;
		this.bicUser2 = bicUser2;
		this.bicQadc01 = bicQadc01;
		this.oidBicCtrl = oidBicCtrl;
	}

	// Property accessors

	public String getBicDomain() {
		return this.bicDomain;
	}

	public void setBicDomain(String bicDomain) {
		this.bicDomain = bicDomain;
	}

	public Integer getBicPeriods() {
		return this.bicPeriods;
	}

	public void setBicPeriods(Integer bicPeriods) {
		this.bicPeriods = bicPeriods;
	}

	public Date getBicLastDue() {
		return this.bicLastDue;
	}

	public void setBicLastDue(Date bicLastDue) {
		this.bicLastDue = bicLastDue;
	}

	public String getBicLastCyc() {
		return this.bicLastCyc;
	}

	public void setBicLastCyc(String bicLastCyc) {
		this.bicLastCyc = bicLastCyc;
	}

	public Date getBicLstDate() {
		return this.bicLstDate;
	}

	public void setBicLstDate(Date bicLstDate) {
		this.bicLstDate = bicLstDate;
	}

	public Integer getBicQadi01() {
		return this.bicQadi01;
	}

	public void setBicQadi01(Integer bicQadi01) {
		this.bicQadi01 = bicQadi01;
	}

	public Boolean getBicAudit() {
		return this.bicAudit;
	}

	public void setBicAudit(Boolean bicAudit) {
		this.bicAudit = bicAudit;
	}

	public String getBicUser1() {
		return this.bicUser1;
	}

	public void setBicUser1(String bicUser1) {
		this.bicUser1 = bicUser1;
	}

	public String getBicUser2() {
		return this.bicUser2;
	}

	public void setBicUser2(String bicUser2) {
		this.bicUser2 = bicUser2;
	}

	public String getBicQadc01() {
		return this.bicQadc01;
	}

	public void setBicQadc01(String bicQadc01) {
		this.bicQadc01 = bicQadc01;
	}

	public Double getOidBicCtrl() {
		return this.oidBicCtrl;
	}

	public void setOidBicCtrl(Double oidBicCtrl) {
		this.oidBicCtrl = oidBicCtrl;
	}

}