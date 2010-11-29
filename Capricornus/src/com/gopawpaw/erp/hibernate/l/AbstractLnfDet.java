package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLnfDet entity provides the base persistence definition of the LnfDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnfDet implements java.io.Serializable {

	// Fields

	private LnfDetId id;
	private Integer lnfPreference;
	private String lnfModUserid;
	private Date lnfModDate;
	private String lnfUser1;
	private String lnfUser2;
	private String lnfUserc03;
	private Double lnfUserd01;
	private Integer lnfUseri01;
	private Boolean lnfUserl01;
	private Date lnfUsert01;
	private String lnfQadc01;
	private String lnfQadc02;
	private String lnfQadc03;
	private Double lnfQadd01;
	private Integer lnfQadi01;
	private Boolean lnfQadl01;
	private Date lnfQadt01;
	private Double oidLnfDet;

	// Constructors

	/** default constructor */
	public AbstractLnfDet() {
	}

	/** minimal constructor */
	public AbstractLnfDet(LnfDetId id, Integer lnfPreference,
			String lnfModUserid, Date lnfModDate, String lnfUser1,
			String lnfUser2, String lnfUserc03, Double lnfUserd01,
			Integer lnfUseri01, Boolean lnfUserl01, String lnfQadc01,
			String lnfQadc02, String lnfQadc03, Double lnfQadd01,
			Integer lnfQadi01, Boolean lnfQadl01, Double oidLnfDet) {
		this.id = id;
		this.lnfPreference = lnfPreference;
		this.lnfModUserid = lnfModUserid;
		this.lnfModDate = lnfModDate;
		this.lnfUser1 = lnfUser1;
		this.lnfUser2 = lnfUser2;
		this.lnfUserc03 = lnfUserc03;
		this.lnfUserd01 = lnfUserd01;
		this.lnfUseri01 = lnfUseri01;
		this.lnfUserl01 = lnfUserl01;
		this.lnfQadc01 = lnfQadc01;
		this.lnfQadc02 = lnfQadc02;
		this.lnfQadc03 = lnfQadc03;
		this.lnfQadd01 = lnfQadd01;
		this.lnfQadi01 = lnfQadi01;
		this.lnfQadl01 = lnfQadl01;
		this.oidLnfDet = oidLnfDet;
	}

	/** full constructor */
	public AbstractLnfDet(LnfDetId id, Integer lnfPreference,
			String lnfModUserid, Date lnfModDate, String lnfUser1,
			String lnfUser2, String lnfUserc03, Double lnfUserd01,
			Integer lnfUseri01, Boolean lnfUserl01, Date lnfUsert01,
			String lnfQadc01, String lnfQadc02, String lnfQadc03,
			Double lnfQadd01, Integer lnfQadi01, Boolean lnfQadl01,
			Date lnfQadt01, Double oidLnfDet) {
		this.id = id;
		this.lnfPreference = lnfPreference;
		this.lnfModUserid = lnfModUserid;
		this.lnfModDate = lnfModDate;
		this.lnfUser1 = lnfUser1;
		this.lnfUser2 = lnfUser2;
		this.lnfUserc03 = lnfUserc03;
		this.lnfUserd01 = lnfUserd01;
		this.lnfUseri01 = lnfUseri01;
		this.lnfUserl01 = lnfUserl01;
		this.lnfUsert01 = lnfUsert01;
		this.lnfQadc01 = lnfQadc01;
		this.lnfQadc02 = lnfQadc02;
		this.lnfQadc03 = lnfQadc03;
		this.lnfQadd01 = lnfQadd01;
		this.lnfQadi01 = lnfQadi01;
		this.lnfQadl01 = lnfQadl01;
		this.lnfQadt01 = lnfQadt01;
		this.oidLnfDet = oidLnfDet;
	}

	// Property accessors

	public LnfDetId getId() {
		return this.id;
	}

	public void setId(LnfDetId id) {
		this.id = id;
	}

	public Integer getLnfPreference() {
		return this.lnfPreference;
	}

	public void setLnfPreference(Integer lnfPreference) {
		this.lnfPreference = lnfPreference;
	}

	public String getLnfModUserid() {
		return this.lnfModUserid;
	}

	public void setLnfModUserid(String lnfModUserid) {
		this.lnfModUserid = lnfModUserid;
	}

	public Date getLnfModDate() {
		return this.lnfModDate;
	}

	public void setLnfModDate(Date lnfModDate) {
		this.lnfModDate = lnfModDate;
	}

	public String getLnfUser1() {
		return this.lnfUser1;
	}

	public void setLnfUser1(String lnfUser1) {
		this.lnfUser1 = lnfUser1;
	}

	public String getLnfUser2() {
		return this.lnfUser2;
	}

	public void setLnfUser2(String lnfUser2) {
		this.lnfUser2 = lnfUser2;
	}

	public String getLnfUserc03() {
		return this.lnfUserc03;
	}

	public void setLnfUserc03(String lnfUserc03) {
		this.lnfUserc03 = lnfUserc03;
	}

	public Double getLnfUserd01() {
		return this.lnfUserd01;
	}

	public void setLnfUserd01(Double lnfUserd01) {
		this.lnfUserd01 = lnfUserd01;
	}

	public Integer getLnfUseri01() {
		return this.lnfUseri01;
	}

	public void setLnfUseri01(Integer lnfUseri01) {
		this.lnfUseri01 = lnfUseri01;
	}

	public Boolean getLnfUserl01() {
		return this.lnfUserl01;
	}

	public void setLnfUserl01(Boolean lnfUserl01) {
		this.lnfUserl01 = lnfUserl01;
	}

	public Date getLnfUsert01() {
		return this.lnfUsert01;
	}

	public void setLnfUsert01(Date lnfUsert01) {
		this.lnfUsert01 = lnfUsert01;
	}

	public String getLnfQadc01() {
		return this.lnfQadc01;
	}

	public void setLnfQadc01(String lnfQadc01) {
		this.lnfQadc01 = lnfQadc01;
	}

	public String getLnfQadc02() {
		return this.lnfQadc02;
	}

	public void setLnfQadc02(String lnfQadc02) {
		this.lnfQadc02 = lnfQadc02;
	}

	public String getLnfQadc03() {
		return this.lnfQadc03;
	}

	public void setLnfQadc03(String lnfQadc03) {
		this.lnfQadc03 = lnfQadc03;
	}

	public Double getLnfQadd01() {
		return this.lnfQadd01;
	}

	public void setLnfQadd01(Double lnfQadd01) {
		this.lnfQadd01 = lnfQadd01;
	}

	public Integer getLnfQadi01() {
		return this.lnfQadi01;
	}

	public void setLnfQadi01(Integer lnfQadi01) {
		this.lnfQadi01 = lnfQadi01;
	}

	public Boolean getLnfQadl01() {
		return this.lnfQadl01;
	}

	public void setLnfQadl01(Boolean lnfQadl01) {
		this.lnfQadl01 = lnfQadl01;
	}

	public Date getLnfQadt01() {
		return this.lnfQadt01;
	}

	public void setLnfQadt01(Date lnfQadt01) {
		this.lnfQadt01 = lnfQadt01;
	}

	public Double getOidLnfDet() {
		return this.oidLnfDet;
	}

	public void setOidLnfDet(Double oidLnfDet) {
		this.oidLnfDet = oidLnfDet;
	}

}