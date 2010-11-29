package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSlrdDet entity provides the base persistence definition of the
 * SlrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSlrdDet implements java.io.Serializable {

	// Fields

	private SlrdDetId id;
	private Integer slrdLinkingRule;
	private String slrdGlCostSite;
	private Date slrdModDate;
	private String slrdModUserid;
	private String slrdQadc01;
	private String slrdQadc02;
	private Double slrdQadd01;
	private Double slrdQadd02;
	private Boolean slrdQadl01;
	private Date slrdQadt01;
	private Date slrdQadt02;
	private String slrdUserc01;
	private String slrdUserc02;
	private Double slrdUserd01;
	private Integer slrdUseri01;
	private Boolean slrdUserl01;
	private Date slrdUsert01;
	private Integer slrdQadi01;
	private Double oidSlrdDet;

	// Constructors

	/** default constructor */
	public AbstractSlrdDet() {
	}

	/** minimal constructor */
	public AbstractSlrdDet(SlrdDetId id, Integer slrdLinkingRule,
			String slrdGlCostSite, Date slrdModDate, String slrdModUserid,
			String slrdQadc01, String slrdQadc02, Double slrdQadd01,
			Double slrdQadd02, Boolean slrdQadl01, String slrdUserc01,
			String slrdUserc02, Double slrdUserd01, Integer slrdUseri01,
			Boolean slrdUserl01, Integer slrdQadi01, Double oidSlrdDet) {
		this.id = id;
		this.slrdLinkingRule = slrdLinkingRule;
		this.slrdGlCostSite = slrdGlCostSite;
		this.slrdModDate = slrdModDate;
		this.slrdModUserid = slrdModUserid;
		this.slrdQadc01 = slrdQadc01;
		this.slrdQadc02 = slrdQadc02;
		this.slrdQadd01 = slrdQadd01;
		this.slrdQadd02 = slrdQadd02;
		this.slrdQadl01 = slrdQadl01;
		this.slrdUserc01 = slrdUserc01;
		this.slrdUserc02 = slrdUserc02;
		this.slrdUserd01 = slrdUserd01;
		this.slrdUseri01 = slrdUseri01;
		this.slrdUserl01 = slrdUserl01;
		this.slrdQadi01 = slrdQadi01;
		this.oidSlrdDet = oidSlrdDet;
	}

	/** full constructor */
	public AbstractSlrdDet(SlrdDetId id, Integer slrdLinkingRule,
			String slrdGlCostSite, Date slrdModDate, String slrdModUserid,
			String slrdQadc01, String slrdQadc02, Double slrdQadd01,
			Double slrdQadd02, Boolean slrdQadl01, Date slrdQadt01,
			Date slrdQadt02, String slrdUserc01, String slrdUserc02,
			Double slrdUserd01, Integer slrdUseri01, Boolean slrdUserl01,
			Date slrdUsert01, Integer slrdQadi01, Double oidSlrdDet) {
		this.id = id;
		this.slrdLinkingRule = slrdLinkingRule;
		this.slrdGlCostSite = slrdGlCostSite;
		this.slrdModDate = slrdModDate;
		this.slrdModUserid = slrdModUserid;
		this.slrdQadc01 = slrdQadc01;
		this.slrdQadc02 = slrdQadc02;
		this.slrdQadd01 = slrdQadd01;
		this.slrdQadd02 = slrdQadd02;
		this.slrdQadl01 = slrdQadl01;
		this.slrdQadt01 = slrdQadt01;
		this.slrdQadt02 = slrdQadt02;
		this.slrdUserc01 = slrdUserc01;
		this.slrdUserc02 = slrdUserc02;
		this.slrdUserd01 = slrdUserd01;
		this.slrdUseri01 = slrdUseri01;
		this.slrdUserl01 = slrdUserl01;
		this.slrdUsert01 = slrdUsert01;
		this.slrdQadi01 = slrdQadi01;
		this.oidSlrdDet = oidSlrdDet;
	}

	// Property accessors

	public SlrdDetId getId() {
		return this.id;
	}

	public void setId(SlrdDetId id) {
		this.id = id;
	}

	public Integer getSlrdLinkingRule() {
		return this.slrdLinkingRule;
	}

	public void setSlrdLinkingRule(Integer slrdLinkingRule) {
		this.slrdLinkingRule = slrdLinkingRule;
	}

	public String getSlrdGlCostSite() {
		return this.slrdGlCostSite;
	}

	public void setSlrdGlCostSite(String slrdGlCostSite) {
		this.slrdGlCostSite = slrdGlCostSite;
	}

	public Date getSlrdModDate() {
		return this.slrdModDate;
	}

	public void setSlrdModDate(Date slrdModDate) {
		this.slrdModDate = slrdModDate;
	}

	public String getSlrdModUserid() {
		return this.slrdModUserid;
	}

	public void setSlrdModUserid(String slrdModUserid) {
		this.slrdModUserid = slrdModUserid;
	}

	public String getSlrdQadc01() {
		return this.slrdQadc01;
	}

	public void setSlrdQadc01(String slrdQadc01) {
		this.slrdQadc01 = slrdQadc01;
	}

	public String getSlrdQadc02() {
		return this.slrdQadc02;
	}

	public void setSlrdQadc02(String slrdQadc02) {
		this.slrdQadc02 = slrdQadc02;
	}

	public Double getSlrdQadd01() {
		return this.slrdQadd01;
	}

	public void setSlrdQadd01(Double slrdQadd01) {
		this.slrdQadd01 = slrdQadd01;
	}

	public Double getSlrdQadd02() {
		return this.slrdQadd02;
	}

	public void setSlrdQadd02(Double slrdQadd02) {
		this.slrdQadd02 = slrdQadd02;
	}

	public Boolean getSlrdQadl01() {
		return this.slrdQadl01;
	}

	public void setSlrdQadl01(Boolean slrdQadl01) {
		this.slrdQadl01 = slrdQadl01;
	}

	public Date getSlrdQadt01() {
		return this.slrdQadt01;
	}

	public void setSlrdQadt01(Date slrdQadt01) {
		this.slrdQadt01 = slrdQadt01;
	}

	public Date getSlrdQadt02() {
		return this.slrdQadt02;
	}

	public void setSlrdQadt02(Date slrdQadt02) {
		this.slrdQadt02 = slrdQadt02;
	}

	public String getSlrdUserc01() {
		return this.slrdUserc01;
	}

	public void setSlrdUserc01(String slrdUserc01) {
		this.slrdUserc01 = slrdUserc01;
	}

	public String getSlrdUserc02() {
		return this.slrdUserc02;
	}

	public void setSlrdUserc02(String slrdUserc02) {
		this.slrdUserc02 = slrdUserc02;
	}

	public Double getSlrdUserd01() {
		return this.slrdUserd01;
	}

	public void setSlrdUserd01(Double slrdUserd01) {
		this.slrdUserd01 = slrdUserd01;
	}

	public Integer getSlrdUseri01() {
		return this.slrdUseri01;
	}

	public void setSlrdUseri01(Integer slrdUseri01) {
		this.slrdUseri01 = slrdUseri01;
	}

	public Boolean getSlrdUserl01() {
		return this.slrdUserl01;
	}

	public void setSlrdUserl01(Boolean slrdUserl01) {
		this.slrdUserl01 = slrdUserl01;
	}

	public Date getSlrdUsert01() {
		return this.slrdUsert01;
	}

	public void setSlrdUsert01(Date slrdUsert01) {
		this.slrdUsert01 = slrdUsert01;
	}

	public Integer getSlrdQadi01() {
		return this.slrdQadi01;
	}

	public void setSlrdQadi01(Integer slrdQadi01) {
		this.slrdQadi01 = slrdQadi01;
	}

	public Double getOidSlrdDet() {
		return this.oidSlrdDet;
	}

	public void setOidSlrdDet(Double oidSlrdDet) {
		this.oidSlrdDet = oidSlrdDet;
	}

}