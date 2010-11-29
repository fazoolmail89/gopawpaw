package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFamtdDet entity provides the base persistence definition of the
 * FamtdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtdDet implements java.io.Serializable {

	// Fields

	private FamtdDetId id;
	private Double famtdPercent;
	private String famtdModUserid;
	private Date famtdModDate;
	private String famtdUser1;
	private String famtdUser2;
	private String famtdChr01;
	private Double famtdDec01;
	private Boolean famtdLog01;
	private Date famtdDte01;
	private Integer famtdInt01;
	private String famtdQadc01;
	private Double famtdQadd01;
	private Boolean famtdQadl01;
	private Integer famtdQadi01;
	private Date famtdQadt01;
	private Double oidFamtdDet;

	// Constructors

	/** default constructor */
	public AbstractFamtdDet() {
	}

	/** minimal constructor */
	public AbstractFamtdDet(FamtdDetId id, Double famtdPercent,
			String famtdModUserid, Date famtdModDate, String famtdUser1,
			String famtdUser2, String famtdChr01, Double famtdDec01,
			Boolean famtdLog01, Integer famtdInt01, String famtdQadc01,
			Double famtdQadd01, Boolean famtdQadl01, Integer famtdQadi01,
			Double oidFamtdDet) {
		this.id = id;
		this.famtdPercent = famtdPercent;
		this.famtdModUserid = famtdModUserid;
		this.famtdModDate = famtdModDate;
		this.famtdUser1 = famtdUser1;
		this.famtdUser2 = famtdUser2;
		this.famtdChr01 = famtdChr01;
		this.famtdDec01 = famtdDec01;
		this.famtdLog01 = famtdLog01;
		this.famtdInt01 = famtdInt01;
		this.famtdQadc01 = famtdQadc01;
		this.famtdQadd01 = famtdQadd01;
		this.famtdQadl01 = famtdQadl01;
		this.famtdQadi01 = famtdQadi01;
		this.oidFamtdDet = oidFamtdDet;
	}

	/** full constructor */
	public AbstractFamtdDet(FamtdDetId id, Double famtdPercent,
			String famtdModUserid, Date famtdModDate, String famtdUser1,
			String famtdUser2, String famtdChr01, Double famtdDec01,
			Boolean famtdLog01, Date famtdDte01, Integer famtdInt01,
			String famtdQadc01, Double famtdQadd01, Boolean famtdQadl01,
			Integer famtdQadi01, Date famtdQadt01, Double oidFamtdDet) {
		this.id = id;
		this.famtdPercent = famtdPercent;
		this.famtdModUserid = famtdModUserid;
		this.famtdModDate = famtdModDate;
		this.famtdUser1 = famtdUser1;
		this.famtdUser2 = famtdUser2;
		this.famtdChr01 = famtdChr01;
		this.famtdDec01 = famtdDec01;
		this.famtdLog01 = famtdLog01;
		this.famtdDte01 = famtdDte01;
		this.famtdInt01 = famtdInt01;
		this.famtdQadc01 = famtdQadc01;
		this.famtdQadd01 = famtdQadd01;
		this.famtdQadl01 = famtdQadl01;
		this.famtdQadi01 = famtdQadi01;
		this.famtdQadt01 = famtdQadt01;
		this.oidFamtdDet = oidFamtdDet;
	}

	// Property accessors

	public FamtdDetId getId() {
		return this.id;
	}

	public void setId(FamtdDetId id) {
		this.id = id;
	}

	public Double getFamtdPercent() {
		return this.famtdPercent;
	}

	public void setFamtdPercent(Double famtdPercent) {
		this.famtdPercent = famtdPercent;
	}

	public String getFamtdModUserid() {
		return this.famtdModUserid;
	}

	public void setFamtdModUserid(String famtdModUserid) {
		this.famtdModUserid = famtdModUserid;
	}

	public Date getFamtdModDate() {
		return this.famtdModDate;
	}

	public void setFamtdModDate(Date famtdModDate) {
		this.famtdModDate = famtdModDate;
	}

	public String getFamtdUser1() {
		return this.famtdUser1;
	}

	public void setFamtdUser1(String famtdUser1) {
		this.famtdUser1 = famtdUser1;
	}

	public String getFamtdUser2() {
		return this.famtdUser2;
	}

	public void setFamtdUser2(String famtdUser2) {
		this.famtdUser2 = famtdUser2;
	}

	public String getFamtdChr01() {
		return this.famtdChr01;
	}

	public void setFamtdChr01(String famtdChr01) {
		this.famtdChr01 = famtdChr01;
	}

	public Double getFamtdDec01() {
		return this.famtdDec01;
	}

	public void setFamtdDec01(Double famtdDec01) {
		this.famtdDec01 = famtdDec01;
	}

	public Boolean getFamtdLog01() {
		return this.famtdLog01;
	}

	public void setFamtdLog01(Boolean famtdLog01) {
		this.famtdLog01 = famtdLog01;
	}

	public Date getFamtdDte01() {
		return this.famtdDte01;
	}

	public void setFamtdDte01(Date famtdDte01) {
		this.famtdDte01 = famtdDte01;
	}

	public Integer getFamtdInt01() {
		return this.famtdInt01;
	}

	public void setFamtdInt01(Integer famtdInt01) {
		this.famtdInt01 = famtdInt01;
	}

	public String getFamtdQadc01() {
		return this.famtdQadc01;
	}

	public void setFamtdQadc01(String famtdQadc01) {
		this.famtdQadc01 = famtdQadc01;
	}

	public Double getFamtdQadd01() {
		return this.famtdQadd01;
	}

	public void setFamtdQadd01(Double famtdQadd01) {
		this.famtdQadd01 = famtdQadd01;
	}

	public Boolean getFamtdQadl01() {
		return this.famtdQadl01;
	}

	public void setFamtdQadl01(Boolean famtdQadl01) {
		this.famtdQadl01 = famtdQadl01;
	}

	public Integer getFamtdQadi01() {
		return this.famtdQadi01;
	}

	public void setFamtdQadi01(Integer famtdQadi01) {
		this.famtdQadi01 = famtdQadi01;
	}

	public Date getFamtdQadt01() {
		return this.famtdQadt01;
	}

	public void setFamtdQadt01(Date famtdQadt01) {
		this.famtdQadt01 = famtdQadt01;
	}

	public Double getOidFamtdDet() {
		return this.oidFamtdDet;
	}

	public void setOidFamtdDet(Double oidFamtdDet) {
		this.oidFamtdDet = oidFamtdDet;
	}

}