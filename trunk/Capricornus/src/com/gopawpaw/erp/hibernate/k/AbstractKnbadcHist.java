package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbadcHist entity provides the base persistence definition of the
 * KnbadcHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbadcHist implements java.io.Serializable {

	// Fields

	private KnbadcHistId id;
	private String knbadcPart;
	private String knbadcSite;
	private String knbadcTemplate;
	private Date knbadcCalcDate;
	private Double knbadcCalcTime;
	private Double knbadcKnbismKeyid;
	private Double knbadcDailyDemand;
	private Date knbadcModDate;
	private String knbadcModUserid;
	private String knbadcUser1;
	private String knbadcUser2;
	private String knbadcQadc01;
	private String knbadcQadc02;
	private Double oidKnbadcHist;

	// Constructors

	/** default constructor */
	public AbstractKnbadcHist() {
	}

	/** full constructor */
	public AbstractKnbadcHist(KnbadcHistId id, String knbadcPart,
			String knbadcSite, String knbadcTemplate, Date knbadcCalcDate,
			Double knbadcCalcTime, Double knbadcKnbismKeyid,
			Double knbadcDailyDemand, Date knbadcModDate,
			String knbadcModUserid, String knbadcUser1, String knbadcUser2,
			String knbadcQadc01, String knbadcQadc02, Double oidKnbadcHist) {
		this.id = id;
		this.knbadcPart = knbadcPart;
		this.knbadcSite = knbadcSite;
		this.knbadcTemplate = knbadcTemplate;
		this.knbadcCalcDate = knbadcCalcDate;
		this.knbadcCalcTime = knbadcCalcTime;
		this.knbadcKnbismKeyid = knbadcKnbismKeyid;
		this.knbadcDailyDemand = knbadcDailyDemand;
		this.knbadcModDate = knbadcModDate;
		this.knbadcModUserid = knbadcModUserid;
		this.knbadcUser1 = knbadcUser1;
		this.knbadcUser2 = knbadcUser2;
		this.knbadcQadc01 = knbadcQadc01;
		this.knbadcQadc02 = knbadcQadc02;
		this.oidKnbadcHist = oidKnbadcHist;
	}

	// Property accessors

	public KnbadcHistId getId() {
		return this.id;
	}

	public void setId(KnbadcHistId id) {
		this.id = id;
	}

	public String getKnbadcPart() {
		return this.knbadcPart;
	}

	public void setKnbadcPart(String knbadcPart) {
		this.knbadcPart = knbadcPart;
	}

	public String getKnbadcSite() {
		return this.knbadcSite;
	}

	public void setKnbadcSite(String knbadcSite) {
		this.knbadcSite = knbadcSite;
	}

	public String getKnbadcTemplate() {
		return this.knbadcTemplate;
	}

	public void setKnbadcTemplate(String knbadcTemplate) {
		this.knbadcTemplate = knbadcTemplate;
	}

	public Date getKnbadcCalcDate() {
		return this.knbadcCalcDate;
	}

	public void setKnbadcCalcDate(Date knbadcCalcDate) {
		this.knbadcCalcDate = knbadcCalcDate;
	}

	public Double getKnbadcCalcTime() {
		return this.knbadcCalcTime;
	}

	public void setKnbadcCalcTime(Double knbadcCalcTime) {
		this.knbadcCalcTime = knbadcCalcTime;
	}

	public Double getKnbadcKnbismKeyid() {
		return this.knbadcKnbismKeyid;
	}

	public void setKnbadcKnbismKeyid(Double knbadcKnbismKeyid) {
		this.knbadcKnbismKeyid = knbadcKnbismKeyid;
	}

	public Double getKnbadcDailyDemand() {
		return this.knbadcDailyDemand;
	}

	public void setKnbadcDailyDemand(Double knbadcDailyDemand) {
		this.knbadcDailyDemand = knbadcDailyDemand;
	}

	public Date getKnbadcModDate() {
		return this.knbadcModDate;
	}

	public void setKnbadcModDate(Date knbadcModDate) {
		this.knbadcModDate = knbadcModDate;
	}

	public String getKnbadcModUserid() {
		return this.knbadcModUserid;
	}

	public void setKnbadcModUserid(String knbadcModUserid) {
		this.knbadcModUserid = knbadcModUserid;
	}

	public String getKnbadcUser1() {
		return this.knbadcUser1;
	}

	public void setKnbadcUser1(String knbadcUser1) {
		this.knbadcUser1 = knbadcUser1;
	}

	public String getKnbadcUser2() {
		return this.knbadcUser2;
	}

	public void setKnbadcUser2(String knbadcUser2) {
		this.knbadcUser2 = knbadcUser2;
	}

	public String getKnbadcQadc01() {
		return this.knbadcQadc01;
	}

	public void setKnbadcQadc01(String knbadcQadc01) {
		this.knbadcQadc01 = knbadcQadc01;
	}

	public String getKnbadcQadc02() {
		return this.knbadcQadc02;
	}

	public void setKnbadcQadc02(String knbadcQadc02) {
		this.knbadcQadc02 = knbadcQadc02;
	}

	public Double getOidKnbadcHist() {
		return this.oidKnbadcHist;
	}

	public void setOidKnbadcHist(Double oidKnbadcHist) {
		this.oidKnbadcHist = oidKnbadcHist;
	}

}