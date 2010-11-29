package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractExrRate entity provides the base persistence definition of the
 * ExrRate entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExrRate implements java.io.Serializable {

	// Fields

	private ExrRateId id;
	private Date exrEndDate;
	private Double exrRate;
	private Double exrRate2;
	private String exrModUserid;
	private Date exrModDate;
	private String exrUser1;
	private String exrUser2;
	private String exrQadc01;
	private Double exrQadd01;
	private Boolean exrQadl01;
	private Date exrQadt01;
	private Double oidExrRate;

	// Constructors

	/** default constructor */
	public AbstractExrRate() {
	}

	/** minimal constructor */
	public AbstractExrRate(ExrRateId id, Date exrEndDate, Double exrRate,
			Double exrRate2, String exrModUserid, Date exrModDate,
			String exrUser1, String exrUser2, String exrQadc01,
			Double exrQadd01, Boolean exrQadl01, Double oidExrRate) {
		this.id = id;
		this.exrEndDate = exrEndDate;
		this.exrRate = exrRate;
		this.exrRate2 = exrRate2;
		this.exrModUserid = exrModUserid;
		this.exrModDate = exrModDate;
		this.exrUser1 = exrUser1;
		this.exrUser2 = exrUser2;
		this.exrQadc01 = exrQadc01;
		this.exrQadd01 = exrQadd01;
		this.exrQadl01 = exrQadl01;
		this.oidExrRate = oidExrRate;
	}

	/** full constructor */
	public AbstractExrRate(ExrRateId id, Date exrEndDate, Double exrRate,
			Double exrRate2, String exrModUserid, Date exrModDate,
			String exrUser1, String exrUser2, String exrQadc01,
			Double exrQadd01, Boolean exrQadl01, Date exrQadt01,
			Double oidExrRate) {
		this.id = id;
		this.exrEndDate = exrEndDate;
		this.exrRate = exrRate;
		this.exrRate2 = exrRate2;
		this.exrModUserid = exrModUserid;
		this.exrModDate = exrModDate;
		this.exrUser1 = exrUser1;
		this.exrUser2 = exrUser2;
		this.exrQadc01 = exrQadc01;
		this.exrQadd01 = exrQadd01;
		this.exrQadl01 = exrQadl01;
		this.exrQadt01 = exrQadt01;
		this.oidExrRate = oidExrRate;
	}

	// Property accessors

	public ExrRateId getId() {
		return this.id;
	}

	public void setId(ExrRateId id) {
		this.id = id;
	}

	public Date getExrEndDate() {
		return this.exrEndDate;
	}

	public void setExrEndDate(Date exrEndDate) {
		this.exrEndDate = exrEndDate;
	}

	public Double getExrRate() {
		return this.exrRate;
	}

	public void setExrRate(Double exrRate) {
		this.exrRate = exrRate;
	}

	public Double getExrRate2() {
		return this.exrRate2;
	}

	public void setExrRate2(Double exrRate2) {
		this.exrRate2 = exrRate2;
	}

	public String getExrModUserid() {
		return this.exrModUserid;
	}

	public void setExrModUserid(String exrModUserid) {
		this.exrModUserid = exrModUserid;
	}

	public Date getExrModDate() {
		return this.exrModDate;
	}

	public void setExrModDate(Date exrModDate) {
		this.exrModDate = exrModDate;
	}

	public String getExrUser1() {
		return this.exrUser1;
	}

	public void setExrUser1(String exrUser1) {
		this.exrUser1 = exrUser1;
	}

	public String getExrUser2() {
		return this.exrUser2;
	}

	public void setExrUser2(String exrUser2) {
		this.exrUser2 = exrUser2;
	}

	public String getExrQadc01() {
		return this.exrQadc01;
	}

	public void setExrQadc01(String exrQadc01) {
		this.exrQadc01 = exrQadc01;
	}

	public Double getExrQadd01() {
		return this.exrQadd01;
	}

	public void setExrQadd01(Double exrQadd01) {
		this.exrQadd01 = exrQadd01;
	}

	public Boolean getExrQadl01() {
		return this.exrQadl01;
	}

	public void setExrQadl01(Boolean exrQadl01) {
		this.exrQadl01 = exrQadl01;
	}

	public Date getExrQadt01() {
		return this.exrQadt01;
	}

	public void setExrQadt01(Date exrQadt01) {
		this.exrQadt01 = exrQadt01;
	}

	public Double getOidExrRate() {
		return this.oidExrRate;
	}

	public void setOidExrRate(Double oidExrRate) {
		this.oidExrRate = oidExrRate;
	}

}