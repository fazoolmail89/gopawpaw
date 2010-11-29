package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlcrhHist entity provides the base persistence definition of the
 * FlcrhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlcrhHist implements java.io.Serializable {

	// Fields

	private FlcrhHistId id;
	private String flcrhRateCode;
	private Boolean flcrhEntryMode;
	private String flcrhModUserid;
	private Date flcrhModDate;
	private String flcrhUser1;
	private String flcrhUser2;
	private String flcrhUserc03;
	private Double flcrhUserd01;
	private Integer flcrhUseri01;
	private Boolean flcrhUserl01;
	private Date flcrhUsert01;
	private String flcrhQadc01;
	private String flcrhQadc02;
	private String flcrhQadc03;
	private Double flcrhQadd01;
	private Integer flcrhQadi01;
	private Boolean flcrhQadl01;
	private Date flcrhQadt01;
	private Double oidFlcrhHist;

	// Constructors

	/** default constructor */
	public AbstractFlcrhHist() {
	}

	/** minimal constructor */
	public AbstractFlcrhHist(FlcrhHistId id, String flcrhRateCode,
			Boolean flcrhEntryMode, String flcrhModUserid, Date flcrhModDate,
			String flcrhUser1, String flcrhUser2, String flcrhUserc03,
			Double flcrhUserd01, Integer flcrhUseri01, Boolean flcrhUserl01,
			String flcrhQadc01, String flcrhQadc02, String flcrhQadc03,
			Double flcrhQadd01, Integer flcrhQadi01, Boolean flcrhQadl01,
			Double oidFlcrhHist) {
		this.id = id;
		this.flcrhRateCode = flcrhRateCode;
		this.flcrhEntryMode = flcrhEntryMode;
		this.flcrhModUserid = flcrhModUserid;
		this.flcrhModDate = flcrhModDate;
		this.flcrhUser1 = flcrhUser1;
		this.flcrhUser2 = flcrhUser2;
		this.flcrhUserc03 = flcrhUserc03;
		this.flcrhUserd01 = flcrhUserd01;
		this.flcrhUseri01 = flcrhUseri01;
		this.flcrhUserl01 = flcrhUserl01;
		this.flcrhQadc01 = flcrhQadc01;
		this.flcrhQadc02 = flcrhQadc02;
		this.flcrhQadc03 = flcrhQadc03;
		this.flcrhQadd01 = flcrhQadd01;
		this.flcrhQadi01 = flcrhQadi01;
		this.flcrhQadl01 = flcrhQadl01;
		this.oidFlcrhHist = oidFlcrhHist;
	}

	/** full constructor */
	public AbstractFlcrhHist(FlcrhHistId id, String flcrhRateCode,
			Boolean flcrhEntryMode, String flcrhModUserid, Date flcrhModDate,
			String flcrhUser1, String flcrhUser2, String flcrhUserc03,
			Double flcrhUserd01, Integer flcrhUseri01, Boolean flcrhUserl01,
			Date flcrhUsert01, String flcrhQadc01, String flcrhQadc02,
			String flcrhQadc03, Double flcrhQadd01, Integer flcrhQadi01,
			Boolean flcrhQadl01, Date flcrhQadt01, Double oidFlcrhHist) {
		this.id = id;
		this.flcrhRateCode = flcrhRateCode;
		this.flcrhEntryMode = flcrhEntryMode;
		this.flcrhModUserid = flcrhModUserid;
		this.flcrhModDate = flcrhModDate;
		this.flcrhUser1 = flcrhUser1;
		this.flcrhUser2 = flcrhUser2;
		this.flcrhUserc03 = flcrhUserc03;
		this.flcrhUserd01 = flcrhUserd01;
		this.flcrhUseri01 = flcrhUseri01;
		this.flcrhUserl01 = flcrhUserl01;
		this.flcrhUsert01 = flcrhUsert01;
		this.flcrhQadc01 = flcrhQadc01;
		this.flcrhQadc02 = flcrhQadc02;
		this.flcrhQadc03 = flcrhQadc03;
		this.flcrhQadd01 = flcrhQadd01;
		this.flcrhQadi01 = flcrhQadi01;
		this.flcrhQadl01 = flcrhQadl01;
		this.flcrhQadt01 = flcrhQadt01;
		this.oidFlcrhHist = oidFlcrhHist;
	}

	// Property accessors

	public FlcrhHistId getId() {
		return this.id;
	}

	public void setId(FlcrhHistId id) {
		this.id = id;
	}

	public String getFlcrhRateCode() {
		return this.flcrhRateCode;
	}

	public void setFlcrhRateCode(String flcrhRateCode) {
		this.flcrhRateCode = flcrhRateCode;
	}

	public Boolean getFlcrhEntryMode() {
		return this.flcrhEntryMode;
	}

	public void setFlcrhEntryMode(Boolean flcrhEntryMode) {
		this.flcrhEntryMode = flcrhEntryMode;
	}

	public String getFlcrhModUserid() {
		return this.flcrhModUserid;
	}

	public void setFlcrhModUserid(String flcrhModUserid) {
		this.flcrhModUserid = flcrhModUserid;
	}

	public Date getFlcrhModDate() {
		return this.flcrhModDate;
	}

	public void setFlcrhModDate(Date flcrhModDate) {
		this.flcrhModDate = flcrhModDate;
	}

	public String getFlcrhUser1() {
		return this.flcrhUser1;
	}

	public void setFlcrhUser1(String flcrhUser1) {
		this.flcrhUser1 = flcrhUser1;
	}

	public String getFlcrhUser2() {
		return this.flcrhUser2;
	}

	public void setFlcrhUser2(String flcrhUser2) {
		this.flcrhUser2 = flcrhUser2;
	}

	public String getFlcrhUserc03() {
		return this.flcrhUserc03;
	}

	public void setFlcrhUserc03(String flcrhUserc03) {
		this.flcrhUserc03 = flcrhUserc03;
	}

	public Double getFlcrhUserd01() {
		return this.flcrhUserd01;
	}

	public void setFlcrhUserd01(Double flcrhUserd01) {
		this.flcrhUserd01 = flcrhUserd01;
	}

	public Integer getFlcrhUseri01() {
		return this.flcrhUseri01;
	}

	public void setFlcrhUseri01(Integer flcrhUseri01) {
		this.flcrhUseri01 = flcrhUseri01;
	}

	public Boolean getFlcrhUserl01() {
		return this.flcrhUserl01;
	}

	public void setFlcrhUserl01(Boolean flcrhUserl01) {
		this.flcrhUserl01 = flcrhUserl01;
	}

	public Date getFlcrhUsert01() {
		return this.flcrhUsert01;
	}

	public void setFlcrhUsert01(Date flcrhUsert01) {
		this.flcrhUsert01 = flcrhUsert01;
	}

	public String getFlcrhQadc01() {
		return this.flcrhQadc01;
	}

	public void setFlcrhQadc01(String flcrhQadc01) {
		this.flcrhQadc01 = flcrhQadc01;
	}

	public String getFlcrhQadc02() {
		return this.flcrhQadc02;
	}

	public void setFlcrhQadc02(String flcrhQadc02) {
		this.flcrhQadc02 = flcrhQadc02;
	}

	public String getFlcrhQadc03() {
		return this.flcrhQadc03;
	}

	public void setFlcrhQadc03(String flcrhQadc03) {
		this.flcrhQadc03 = flcrhQadc03;
	}

	public Double getFlcrhQadd01() {
		return this.flcrhQadd01;
	}

	public void setFlcrhQadd01(Double flcrhQadd01) {
		this.flcrhQadd01 = flcrhQadd01;
	}

	public Integer getFlcrhQadi01() {
		return this.flcrhQadi01;
	}

	public void setFlcrhQadi01(Integer flcrhQadi01) {
		this.flcrhQadi01 = flcrhQadi01;
	}

	public Boolean getFlcrhQadl01() {
		return this.flcrhQadl01;
	}

	public void setFlcrhQadl01(Boolean flcrhQadl01) {
		this.flcrhQadl01 = flcrhQadl01;
	}

	public Date getFlcrhQadt01() {
		return this.flcrhQadt01;
	}

	public void setFlcrhQadt01(Date flcrhQadt01) {
		this.flcrhQadt01 = flcrhQadt01;
	}

	public Double getOidFlcrhHist() {
		return this.oidFlcrhHist;
	}

	public void setOidFlcrhHist(Double oidFlcrhHist) {
		this.oidFlcrhHist = oidFlcrhHist;
	}

}