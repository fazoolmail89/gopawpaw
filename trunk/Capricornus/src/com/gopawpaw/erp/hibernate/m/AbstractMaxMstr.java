package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMaxMstr entity provides the base persistence definition of the
 * MaxMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMaxMstr implements java.io.Serializable {

	// Fields

	private MaxMstrId id;
	private String maxDesc;
	private Date maxBegDate;
	private Date maxEndDate;
	private String maxBasis;
	private Double maxMax;
	private Double maxUsed;
	private Double maxYrCost;
	private Double maxCost;
	private Double maxReduce;
	private Integer maxBasisYr;
	private Boolean maxTable;
	private Double maxYrMax;
	private Date maxModDate;
	private String maxUserid;
	private String maxQad02;
	private String maxUser1;
	private String maxUser2;
	private Double oidMaxMstr;

	// Constructors

	/** default constructor */
	public AbstractMaxMstr() {
	}

	/** minimal constructor */
	public AbstractMaxMstr(MaxMstrId id, Double oidMaxMstr) {
		this.id = id;
		this.oidMaxMstr = oidMaxMstr;
	}

	/** full constructor */
	public AbstractMaxMstr(MaxMstrId id, String maxDesc, Date maxBegDate,
			Date maxEndDate, String maxBasis, Double maxMax, Double maxUsed,
			Double maxYrCost, Double maxCost, Double maxReduce,
			Integer maxBasisYr, Boolean maxTable, Double maxYrMax,
			Date maxModDate, String maxUserid, String maxQad02,
			String maxUser1, String maxUser2, Double oidMaxMstr) {
		this.id = id;
		this.maxDesc = maxDesc;
		this.maxBegDate = maxBegDate;
		this.maxEndDate = maxEndDate;
		this.maxBasis = maxBasis;
		this.maxMax = maxMax;
		this.maxUsed = maxUsed;
		this.maxYrCost = maxYrCost;
		this.maxCost = maxCost;
		this.maxReduce = maxReduce;
		this.maxBasisYr = maxBasisYr;
		this.maxTable = maxTable;
		this.maxYrMax = maxYrMax;
		this.maxModDate = maxModDate;
		this.maxUserid = maxUserid;
		this.maxQad02 = maxQad02;
		this.maxUser1 = maxUser1;
		this.maxUser2 = maxUser2;
		this.oidMaxMstr = oidMaxMstr;
	}

	// Property accessors

	public MaxMstrId getId() {
		return this.id;
	}

	public void setId(MaxMstrId id) {
		this.id = id;
	}

	public String getMaxDesc() {
		return this.maxDesc;
	}

	public void setMaxDesc(String maxDesc) {
		this.maxDesc = maxDesc;
	}

	public Date getMaxBegDate() {
		return this.maxBegDate;
	}

	public void setMaxBegDate(Date maxBegDate) {
		this.maxBegDate = maxBegDate;
	}

	public Date getMaxEndDate() {
		return this.maxEndDate;
	}

	public void setMaxEndDate(Date maxEndDate) {
		this.maxEndDate = maxEndDate;
	}

	public String getMaxBasis() {
		return this.maxBasis;
	}

	public void setMaxBasis(String maxBasis) {
		this.maxBasis = maxBasis;
	}

	public Double getMaxMax() {
		return this.maxMax;
	}

	public void setMaxMax(Double maxMax) {
		this.maxMax = maxMax;
	}

	public Double getMaxUsed() {
		return this.maxUsed;
	}

	public void setMaxUsed(Double maxUsed) {
		this.maxUsed = maxUsed;
	}

	public Double getMaxYrCost() {
		return this.maxYrCost;
	}

	public void setMaxYrCost(Double maxYrCost) {
		this.maxYrCost = maxYrCost;
	}

	public Double getMaxCost() {
		return this.maxCost;
	}

	public void setMaxCost(Double maxCost) {
		this.maxCost = maxCost;
	}

	public Double getMaxReduce() {
		return this.maxReduce;
	}

	public void setMaxReduce(Double maxReduce) {
		this.maxReduce = maxReduce;
	}

	public Integer getMaxBasisYr() {
		return this.maxBasisYr;
	}

	public void setMaxBasisYr(Integer maxBasisYr) {
		this.maxBasisYr = maxBasisYr;
	}

	public Boolean getMaxTable() {
		return this.maxTable;
	}

	public void setMaxTable(Boolean maxTable) {
		this.maxTable = maxTable;
	}

	public Double getMaxYrMax() {
		return this.maxYrMax;
	}

	public void setMaxYrMax(Double maxYrMax) {
		this.maxYrMax = maxYrMax;
	}

	public Date getMaxModDate() {
		return this.maxModDate;
	}

	public void setMaxModDate(Date maxModDate) {
		this.maxModDate = maxModDate;
	}

	public String getMaxUserid() {
		return this.maxUserid;
	}

	public void setMaxUserid(String maxUserid) {
		this.maxUserid = maxUserid;
	}

	public String getMaxQad02() {
		return this.maxQad02;
	}

	public void setMaxQad02(String maxQad02) {
		this.maxQad02 = maxQad02;
	}

	public String getMaxUser1() {
		return this.maxUser1;
	}

	public void setMaxUser1(String maxUser1) {
		this.maxUser1 = maxUser1;
	}

	public String getMaxUser2() {
		return this.maxUser2;
	}

	public void setMaxUser2(String maxUser2) {
		this.maxUser2 = maxUser2;
	}

	public Double getOidMaxMstr() {
		return this.oidMaxMstr;
	}

	public void setOidMaxMstr(Double oidMaxMstr) {
		this.oidMaxMstr = oidMaxMstr;
	}

}