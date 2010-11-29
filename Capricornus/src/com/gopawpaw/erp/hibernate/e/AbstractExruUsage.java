package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractExruUsage entity provides the base persistence definition of the
 * ExruUsage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExruUsage implements java.io.Serializable {

	// Fields

	private ExruUsageId id;
	private String exruCurr1;
	private String exruCurr2;
	private Double exruExRate;
	private Double exruExRate2;
	private Double exruQadd01;
	private String exruQadc01;
	private Boolean exruQadl01;
	private Date exruQadt01;
	private Double oidExruUsage;

	// Constructors

	/** default constructor */
	public AbstractExruUsage() {
	}

	/** minimal constructor */
	public AbstractExruUsage(ExruUsageId id, String exruCurr1,
			String exruCurr2, Double exruExRate, Double exruExRate2,
			Double exruQadd01, String exruQadc01, Boolean exruQadl01,
			Double oidExruUsage) {
		this.id = id;
		this.exruCurr1 = exruCurr1;
		this.exruCurr2 = exruCurr2;
		this.exruExRate = exruExRate;
		this.exruExRate2 = exruExRate2;
		this.exruQadd01 = exruQadd01;
		this.exruQadc01 = exruQadc01;
		this.exruQadl01 = exruQadl01;
		this.oidExruUsage = oidExruUsage;
	}

	/** full constructor */
	public AbstractExruUsage(ExruUsageId id, String exruCurr1,
			String exruCurr2, Double exruExRate, Double exruExRate2,
			Double exruQadd01, String exruQadc01, Boolean exruQadl01,
			Date exruQadt01, Double oidExruUsage) {
		this.id = id;
		this.exruCurr1 = exruCurr1;
		this.exruCurr2 = exruCurr2;
		this.exruExRate = exruExRate;
		this.exruExRate2 = exruExRate2;
		this.exruQadd01 = exruQadd01;
		this.exruQadc01 = exruQadc01;
		this.exruQadl01 = exruQadl01;
		this.exruQadt01 = exruQadt01;
		this.oidExruUsage = oidExruUsage;
	}

	// Property accessors

	public ExruUsageId getId() {
		return this.id;
	}

	public void setId(ExruUsageId id) {
		this.id = id;
	}

	public String getExruCurr1() {
		return this.exruCurr1;
	}

	public void setExruCurr1(String exruCurr1) {
		this.exruCurr1 = exruCurr1;
	}

	public String getExruCurr2() {
		return this.exruCurr2;
	}

	public void setExruCurr2(String exruCurr2) {
		this.exruCurr2 = exruCurr2;
	}

	public Double getExruExRate() {
		return this.exruExRate;
	}

	public void setExruExRate(Double exruExRate) {
		this.exruExRate = exruExRate;
	}

	public Double getExruExRate2() {
		return this.exruExRate2;
	}

	public void setExruExRate2(Double exruExRate2) {
		this.exruExRate2 = exruExRate2;
	}

	public Double getExruQadd01() {
		return this.exruQadd01;
	}

	public void setExruQadd01(Double exruQadd01) {
		this.exruQadd01 = exruQadd01;
	}

	public String getExruQadc01() {
		return this.exruQadc01;
	}

	public void setExruQadc01(String exruQadc01) {
		this.exruQadc01 = exruQadc01;
	}

	public Boolean getExruQadl01() {
		return this.exruQadl01;
	}

	public void setExruQadl01(Boolean exruQadl01) {
		this.exruQadl01 = exruQadl01;
	}

	public Date getExruQadt01() {
		return this.exruQadt01;
	}

	public void setExruQadt01(Date exruQadt01) {
		this.exruQadt01 = exruQadt01;
	}

	public Double getOidExruUsage() {
		return this.oidExruUsage;
	}

	public void setOidExruUsage(Double oidExruUsage) {
		this.oidExruUsage = oidExruUsage;
	}

}