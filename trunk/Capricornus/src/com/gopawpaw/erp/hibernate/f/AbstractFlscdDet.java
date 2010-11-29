package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlscdDet entity provides the base persistence definition of the
 * FlscdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlscdDet implements java.io.Serializable {

	// Fields

	private FlscdDetId id;
	private Double flscdMaxRate;
	private Double flscdTargetRate;
	private Date flscdModDate;
	private String flscdUser1;
	private String flscdUser2;
	private String flscdUserc03;
	private Double flscdUserd01;
	private Integer flscdUseri01;
	private String flscdModUserid;
	private Boolean flscdUserl01;
	private Date flscdUsert01;
	private String flscdQadc01;
	private String flscdQadc02;
	private String flscdQadc03;
	private Double flscdQadd01;
	private Integer flscdQadi01;
	private Boolean flscdQadl01;
	private Date flscdQadt01;
	private Double oidFlscdDet;

	// Constructors

	/** default constructor */
	public AbstractFlscdDet() {
	}

	/** minimal constructor */
	public AbstractFlscdDet(FlscdDetId id, Double flscdMaxRate,
			Double flscdTargetRate, Date flscdModDate, String flscdUser1,
			String flscdUser2, String flscdUserc03, Double flscdUserd01,
			Integer flscdUseri01, String flscdModUserid, Boolean flscdUserl01,
			String flscdQadc01, String flscdQadc02, String flscdQadc03,
			Double flscdQadd01, Integer flscdQadi01, Boolean flscdQadl01,
			Double oidFlscdDet) {
		this.id = id;
		this.flscdMaxRate = flscdMaxRate;
		this.flscdTargetRate = flscdTargetRate;
		this.flscdModDate = flscdModDate;
		this.flscdUser1 = flscdUser1;
		this.flscdUser2 = flscdUser2;
		this.flscdUserc03 = flscdUserc03;
		this.flscdUserd01 = flscdUserd01;
		this.flscdUseri01 = flscdUseri01;
		this.flscdModUserid = flscdModUserid;
		this.flscdUserl01 = flscdUserl01;
		this.flscdQadc01 = flscdQadc01;
		this.flscdQadc02 = flscdQadc02;
		this.flscdQadc03 = flscdQadc03;
		this.flscdQadd01 = flscdQadd01;
		this.flscdQadi01 = flscdQadi01;
		this.flscdQadl01 = flscdQadl01;
		this.oidFlscdDet = oidFlscdDet;
	}

	/** full constructor */
	public AbstractFlscdDet(FlscdDetId id, Double flscdMaxRate,
			Double flscdTargetRate, Date flscdModDate, String flscdUser1,
			String flscdUser2, String flscdUserc03, Double flscdUserd01,
			Integer flscdUseri01, String flscdModUserid, Boolean flscdUserl01,
			Date flscdUsert01, String flscdQadc01, String flscdQadc02,
			String flscdQadc03, Double flscdQadd01, Integer flscdQadi01,
			Boolean flscdQadl01, Date flscdQadt01, Double oidFlscdDet) {
		this.id = id;
		this.flscdMaxRate = flscdMaxRate;
		this.flscdTargetRate = flscdTargetRate;
		this.flscdModDate = flscdModDate;
		this.flscdUser1 = flscdUser1;
		this.flscdUser2 = flscdUser2;
		this.flscdUserc03 = flscdUserc03;
		this.flscdUserd01 = flscdUserd01;
		this.flscdUseri01 = flscdUseri01;
		this.flscdModUserid = flscdModUserid;
		this.flscdUserl01 = flscdUserl01;
		this.flscdUsert01 = flscdUsert01;
		this.flscdQadc01 = flscdQadc01;
		this.flscdQadc02 = flscdQadc02;
		this.flscdQadc03 = flscdQadc03;
		this.flscdQadd01 = flscdQadd01;
		this.flscdQadi01 = flscdQadi01;
		this.flscdQadl01 = flscdQadl01;
		this.flscdQadt01 = flscdQadt01;
		this.oidFlscdDet = oidFlscdDet;
	}

	// Property accessors

	public FlscdDetId getId() {
		return this.id;
	}

	public void setId(FlscdDetId id) {
		this.id = id;
	}

	public Double getFlscdMaxRate() {
		return this.flscdMaxRate;
	}

	public void setFlscdMaxRate(Double flscdMaxRate) {
		this.flscdMaxRate = flscdMaxRate;
	}

	public Double getFlscdTargetRate() {
		return this.flscdTargetRate;
	}

	public void setFlscdTargetRate(Double flscdTargetRate) {
		this.flscdTargetRate = flscdTargetRate;
	}

	public Date getFlscdModDate() {
		return this.flscdModDate;
	}

	public void setFlscdModDate(Date flscdModDate) {
		this.flscdModDate = flscdModDate;
	}

	public String getFlscdUser1() {
		return this.flscdUser1;
	}

	public void setFlscdUser1(String flscdUser1) {
		this.flscdUser1 = flscdUser1;
	}

	public String getFlscdUser2() {
		return this.flscdUser2;
	}

	public void setFlscdUser2(String flscdUser2) {
		this.flscdUser2 = flscdUser2;
	}

	public String getFlscdUserc03() {
		return this.flscdUserc03;
	}

	public void setFlscdUserc03(String flscdUserc03) {
		this.flscdUserc03 = flscdUserc03;
	}

	public Double getFlscdUserd01() {
		return this.flscdUserd01;
	}

	public void setFlscdUserd01(Double flscdUserd01) {
		this.flscdUserd01 = flscdUserd01;
	}

	public Integer getFlscdUseri01() {
		return this.flscdUseri01;
	}

	public void setFlscdUseri01(Integer flscdUseri01) {
		this.flscdUseri01 = flscdUseri01;
	}

	public String getFlscdModUserid() {
		return this.flscdModUserid;
	}

	public void setFlscdModUserid(String flscdModUserid) {
		this.flscdModUserid = flscdModUserid;
	}

	public Boolean getFlscdUserl01() {
		return this.flscdUserl01;
	}

	public void setFlscdUserl01(Boolean flscdUserl01) {
		this.flscdUserl01 = flscdUserl01;
	}

	public Date getFlscdUsert01() {
		return this.flscdUsert01;
	}

	public void setFlscdUsert01(Date flscdUsert01) {
		this.flscdUsert01 = flscdUsert01;
	}

	public String getFlscdQadc01() {
		return this.flscdQadc01;
	}

	public void setFlscdQadc01(String flscdQadc01) {
		this.flscdQadc01 = flscdQadc01;
	}

	public String getFlscdQadc02() {
		return this.flscdQadc02;
	}

	public void setFlscdQadc02(String flscdQadc02) {
		this.flscdQadc02 = flscdQadc02;
	}

	public String getFlscdQadc03() {
		return this.flscdQadc03;
	}

	public void setFlscdQadc03(String flscdQadc03) {
		this.flscdQadc03 = flscdQadc03;
	}

	public Double getFlscdQadd01() {
		return this.flscdQadd01;
	}

	public void setFlscdQadd01(Double flscdQadd01) {
		this.flscdQadd01 = flscdQadd01;
	}

	public Integer getFlscdQadi01() {
		return this.flscdQadi01;
	}

	public void setFlscdQadi01(Integer flscdQadi01) {
		this.flscdQadi01 = flscdQadi01;
	}

	public Boolean getFlscdQadl01() {
		return this.flscdQadl01;
	}

	public void setFlscdQadl01(Boolean flscdQadl01) {
		this.flscdQadl01 = flscdQadl01;
	}

	public Date getFlscdQadt01() {
		return this.flscdQadt01;
	}

	public void setFlscdQadt01(Date flscdQadt01) {
		this.flscdQadt01 = flscdQadt01;
	}

	public Double getOidFlscdDet() {
		return this.oidFlscdDet;
	}

	public void setOidFlscdDet(Double oidFlscdDet) {
		this.oidFlscdDet = oidFlscdDet;
	}

}