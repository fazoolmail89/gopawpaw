package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFamtrdDet entity provides the base persistence definition of the
 * FamtrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtrdDet implements java.io.Serializable {

	// Fields

	private FamtrdDetId id;
	private String famtrdAction;
	private Date famtrdDate;
	private Integer famtrdReading;
	private Integer famtrdAccum;
	private Integer famtrdUsage;
	private String famtrdModUserid;
	private Date famtrdModDate;
	private String famtrdUser1;
	private String famtrdUser2;
	private String famtrdChr01;
	private Double famtrdDec01;
	private Boolean famtrdLog01;
	private Date famtrdDte01;
	private Integer famtrdInt01;
	private String famtrdQadc01;
	private Double famtrdQadd01;
	private Boolean famtrdQadl01;
	private Integer famtrdQadi01;
	private Date famtrdQadt01;
	private Double oidFamtrdDet;

	// Constructors

	/** default constructor */
	public AbstractFamtrdDet() {
	}

	/** minimal constructor */
	public AbstractFamtrdDet(FamtrdDetId id, String famtrdAction,
			Date famtrdDate, Integer famtrdReading, Integer famtrdAccum,
			Integer famtrdUsage, String famtrdModUserid, Date famtrdModDate,
			String famtrdUser1, String famtrdUser2, String famtrdChr01,
			Double famtrdDec01, Boolean famtrdLog01, Integer famtrdInt01,
			String famtrdQadc01, Double famtrdQadd01, Boolean famtrdQadl01,
			Integer famtrdQadi01, Double oidFamtrdDet) {
		this.id = id;
		this.famtrdAction = famtrdAction;
		this.famtrdDate = famtrdDate;
		this.famtrdReading = famtrdReading;
		this.famtrdAccum = famtrdAccum;
		this.famtrdUsage = famtrdUsage;
		this.famtrdModUserid = famtrdModUserid;
		this.famtrdModDate = famtrdModDate;
		this.famtrdUser1 = famtrdUser1;
		this.famtrdUser2 = famtrdUser2;
		this.famtrdChr01 = famtrdChr01;
		this.famtrdDec01 = famtrdDec01;
		this.famtrdLog01 = famtrdLog01;
		this.famtrdInt01 = famtrdInt01;
		this.famtrdQadc01 = famtrdQadc01;
		this.famtrdQadd01 = famtrdQadd01;
		this.famtrdQadl01 = famtrdQadl01;
		this.famtrdQadi01 = famtrdQadi01;
		this.oidFamtrdDet = oidFamtrdDet;
	}

	/** full constructor */
	public AbstractFamtrdDet(FamtrdDetId id, String famtrdAction,
			Date famtrdDate, Integer famtrdReading, Integer famtrdAccum,
			Integer famtrdUsage, String famtrdModUserid, Date famtrdModDate,
			String famtrdUser1, String famtrdUser2, String famtrdChr01,
			Double famtrdDec01, Boolean famtrdLog01, Date famtrdDte01,
			Integer famtrdInt01, String famtrdQadc01, Double famtrdQadd01,
			Boolean famtrdQadl01, Integer famtrdQadi01, Date famtrdQadt01,
			Double oidFamtrdDet) {
		this.id = id;
		this.famtrdAction = famtrdAction;
		this.famtrdDate = famtrdDate;
		this.famtrdReading = famtrdReading;
		this.famtrdAccum = famtrdAccum;
		this.famtrdUsage = famtrdUsage;
		this.famtrdModUserid = famtrdModUserid;
		this.famtrdModDate = famtrdModDate;
		this.famtrdUser1 = famtrdUser1;
		this.famtrdUser2 = famtrdUser2;
		this.famtrdChr01 = famtrdChr01;
		this.famtrdDec01 = famtrdDec01;
		this.famtrdLog01 = famtrdLog01;
		this.famtrdDte01 = famtrdDte01;
		this.famtrdInt01 = famtrdInt01;
		this.famtrdQadc01 = famtrdQadc01;
		this.famtrdQadd01 = famtrdQadd01;
		this.famtrdQadl01 = famtrdQadl01;
		this.famtrdQadi01 = famtrdQadi01;
		this.famtrdQadt01 = famtrdQadt01;
		this.oidFamtrdDet = oidFamtrdDet;
	}

	// Property accessors

	public FamtrdDetId getId() {
		return this.id;
	}

	public void setId(FamtrdDetId id) {
		this.id = id;
	}

	public String getFamtrdAction() {
		return this.famtrdAction;
	}

	public void setFamtrdAction(String famtrdAction) {
		this.famtrdAction = famtrdAction;
	}

	public Date getFamtrdDate() {
		return this.famtrdDate;
	}

	public void setFamtrdDate(Date famtrdDate) {
		this.famtrdDate = famtrdDate;
	}

	public Integer getFamtrdReading() {
		return this.famtrdReading;
	}

	public void setFamtrdReading(Integer famtrdReading) {
		this.famtrdReading = famtrdReading;
	}

	public Integer getFamtrdAccum() {
		return this.famtrdAccum;
	}

	public void setFamtrdAccum(Integer famtrdAccum) {
		this.famtrdAccum = famtrdAccum;
	}

	public Integer getFamtrdUsage() {
		return this.famtrdUsage;
	}

	public void setFamtrdUsage(Integer famtrdUsage) {
		this.famtrdUsage = famtrdUsage;
	}

	public String getFamtrdModUserid() {
		return this.famtrdModUserid;
	}

	public void setFamtrdModUserid(String famtrdModUserid) {
		this.famtrdModUserid = famtrdModUserid;
	}

	public Date getFamtrdModDate() {
		return this.famtrdModDate;
	}

	public void setFamtrdModDate(Date famtrdModDate) {
		this.famtrdModDate = famtrdModDate;
	}

	public String getFamtrdUser1() {
		return this.famtrdUser1;
	}

	public void setFamtrdUser1(String famtrdUser1) {
		this.famtrdUser1 = famtrdUser1;
	}

	public String getFamtrdUser2() {
		return this.famtrdUser2;
	}

	public void setFamtrdUser2(String famtrdUser2) {
		this.famtrdUser2 = famtrdUser2;
	}

	public String getFamtrdChr01() {
		return this.famtrdChr01;
	}

	public void setFamtrdChr01(String famtrdChr01) {
		this.famtrdChr01 = famtrdChr01;
	}

	public Double getFamtrdDec01() {
		return this.famtrdDec01;
	}

	public void setFamtrdDec01(Double famtrdDec01) {
		this.famtrdDec01 = famtrdDec01;
	}

	public Boolean getFamtrdLog01() {
		return this.famtrdLog01;
	}

	public void setFamtrdLog01(Boolean famtrdLog01) {
		this.famtrdLog01 = famtrdLog01;
	}

	public Date getFamtrdDte01() {
		return this.famtrdDte01;
	}

	public void setFamtrdDte01(Date famtrdDte01) {
		this.famtrdDte01 = famtrdDte01;
	}

	public Integer getFamtrdInt01() {
		return this.famtrdInt01;
	}

	public void setFamtrdInt01(Integer famtrdInt01) {
		this.famtrdInt01 = famtrdInt01;
	}

	public String getFamtrdQadc01() {
		return this.famtrdQadc01;
	}

	public void setFamtrdQadc01(String famtrdQadc01) {
		this.famtrdQadc01 = famtrdQadc01;
	}

	public Double getFamtrdQadd01() {
		return this.famtrdQadd01;
	}

	public void setFamtrdQadd01(Double famtrdQadd01) {
		this.famtrdQadd01 = famtrdQadd01;
	}

	public Boolean getFamtrdQadl01() {
		return this.famtrdQadl01;
	}

	public void setFamtrdQadl01(Boolean famtrdQadl01) {
		this.famtrdQadl01 = famtrdQadl01;
	}

	public Integer getFamtrdQadi01() {
		return this.famtrdQadi01;
	}

	public void setFamtrdQadi01(Integer famtrdQadi01) {
		this.famtrdQadi01 = famtrdQadi01;
	}

	public Date getFamtrdQadt01() {
		return this.famtrdQadt01;
	}

	public void setFamtrdQadt01(Date famtrdQadt01) {
		this.famtrdQadt01 = famtrdQadt01;
	}

	public Double getOidFamtrdDet() {
		return this.oidFamtrdDet;
	}

	public void setOidFamtrdDet(Double oidFamtrdDet) {
		this.oidFamtrdDet = oidFamtrdDet;
	}

}