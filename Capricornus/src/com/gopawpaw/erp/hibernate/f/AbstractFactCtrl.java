package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFactCtrl entity provides the base persistence definition of the
 * FactCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFactCtrl implements java.io.Serializable {

	// Fields

	private String factDomain;
	private Boolean factAuto;
	private Boolean factGlSum;
	private Integer factIndex1;
	private String factSeqId;
	private String factQadc03;
	private String factQadc05;
	private String factQadc04;
	private String factModUserid;
	private Date factModDate;
	private String factUser1;
	private String factUser2;
	private String factChr01;
	private Double factDec01;
	private Boolean factLog01;
	private Date factDte01;
	private Integer factInt01;
	private String factQadc01;
	private Double factQadd01;
	private Boolean factQadl01;
	private Integer factQadi01;
	private Date factQadt01;
	private String factQadc02;
	private Double oidFactCtrl;

	// Constructors

	/** default constructor */
	public AbstractFactCtrl() {
	}

	/** minimal constructor */
	public AbstractFactCtrl(Boolean factAuto, Boolean factGlSum,
			Integer factIndex1, String factSeqId, String factQadc03,
			String factQadc05, String factQadc04, String factModUserid,
			Date factModDate, String factUser1, String factUser2,
			String factChr01, Double factDec01, Boolean factLog01,
			Integer factInt01, String factQadc01, Double factQadd01,
			Boolean factQadl01, Integer factQadi01, String factQadc02,
			Double oidFactCtrl) {
		this.factAuto = factAuto;
		this.factGlSum = factGlSum;
		this.factIndex1 = factIndex1;
		this.factSeqId = factSeqId;
		this.factQadc03 = factQadc03;
		this.factQadc05 = factQadc05;
		this.factQadc04 = factQadc04;
		this.factModUserid = factModUserid;
		this.factModDate = factModDate;
		this.factUser1 = factUser1;
		this.factUser2 = factUser2;
		this.factChr01 = factChr01;
		this.factDec01 = factDec01;
		this.factLog01 = factLog01;
		this.factInt01 = factInt01;
		this.factQadc01 = factQadc01;
		this.factQadd01 = factQadd01;
		this.factQadl01 = factQadl01;
		this.factQadi01 = factQadi01;
		this.factQadc02 = factQadc02;
		this.oidFactCtrl = oidFactCtrl;
	}

	/** full constructor */
	public AbstractFactCtrl(Boolean factAuto, Boolean factGlSum,
			Integer factIndex1, String factSeqId, String factQadc03,
			String factQadc05, String factQadc04, String factModUserid,
			Date factModDate, String factUser1, String factUser2,
			String factChr01, Double factDec01, Boolean factLog01,
			Date factDte01, Integer factInt01, String factQadc01,
			Double factQadd01, Boolean factQadl01, Integer factQadi01,
			Date factQadt01, String factQadc02, Double oidFactCtrl) {
		this.factAuto = factAuto;
		this.factGlSum = factGlSum;
		this.factIndex1 = factIndex1;
		this.factSeqId = factSeqId;
		this.factQadc03 = factQadc03;
		this.factQadc05 = factQadc05;
		this.factQadc04 = factQadc04;
		this.factModUserid = factModUserid;
		this.factModDate = factModDate;
		this.factUser1 = factUser1;
		this.factUser2 = factUser2;
		this.factChr01 = factChr01;
		this.factDec01 = factDec01;
		this.factLog01 = factLog01;
		this.factDte01 = factDte01;
		this.factInt01 = factInt01;
		this.factQadc01 = factQadc01;
		this.factQadd01 = factQadd01;
		this.factQadl01 = factQadl01;
		this.factQadi01 = factQadi01;
		this.factQadt01 = factQadt01;
		this.factQadc02 = factQadc02;
		this.oidFactCtrl = oidFactCtrl;
	}

	// Property accessors

	public String getFactDomain() {
		return this.factDomain;
	}

	public void setFactDomain(String factDomain) {
		this.factDomain = factDomain;
	}

	public Boolean getFactAuto() {
		return this.factAuto;
	}

	public void setFactAuto(Boolean factAuto) {
		this.factAuto = factAuto;
	}

	public Boolean getFactGlSum() {
		return this.factGlSum;
	}

	public void setFactGlSum(Boolean factGlSum) {
		this.factGlSum = factGlSum;
	}

	public Integer getFactIndex1() {
		return this.factIndex1;
	}

	public void setFactIndex1(Integer factIndex1) {
		this.factIndex1 = factIndex1;
	}

	public String getFactSeqId() {
		return this.factSeqId;
	}

	public void setFactSeqId(String factSeqId) {
		this.factSeqId = factSeqId;
	}

	public String getFactQadc03() {
		return this.factQadc03;
	}

	public void setFactQadc03(String factQadc03) {
		this.factQadc03 = factQadc03;
	}

	public String getFactQadc05() {
		return this.factQadc05;
	}

	public void setFactQadc05(String factQadc05) {
		this.factQadc05 = factQadc05;
	}

	public String getFactQadc04() {
		return this.factQadc04;
	}

	public void setFactQadc04(String factQadc04) {
		this.factQadc04 = factQadc04;
	}

	public String getFactModUserid() {
		return this.factModUserid;
	}

	public void setFactModUserid(String factModUserid) {
		this.factModUserid = factModUserid;
	}

	public Date getFactModDate() {
		return this.factModDate;
	}

	public void setFactModDate(Date factModDate) {
		this.factModDate = factModDate;
	}

	public String getFactUser1() {
		return this.factUser1;
	}

	public void setFactUser1(String factUser1) {
		this.factUser1 = factUser1;
	}

	public String getFactUser2() {
		return this.factUser2;
	}

	public void setFactUser2(String factUser2) {
		this.factUser2 = factUser2;
	}

	public String getFactChr01() {
		return this.factChr01;
	}

	public void setFactChr01(String factChr01) {
		this.factChr01 = factChr01;
	}

	public Double getFactDec01() {
		return this.factDec01;
	}

	public void setFactDec01(Double factDec01) {
		this.factDec01 = factDec01;
	}

	public Boolean getFactLog01() {
		return this.factLog01;
	}

	public void setFactLog01(Boolean factLog01) {
		this.factLog01 = factLog01;
	}

	public Date getFactDte01() {
		return this.factDte01;
	}

	public void setFactDte01(Date factDte01) {
		this.factDte01 = factDte01;
	}

	public Integer getFactInt01() {
		return this.factInt01;
	}

	public void setFactInt01(Integer factInt01) {
		this.factInt01 = factInt01;
	}

	public String getFactQadc01() {
		return this.factQadc01;
	}

	public void setFactQadc01(String factQadc01) {
		this.factQadc01 = factQadc01;
	}

	public Double getFactQadd01() {
		return this.factQadd01;
	}

	public void setFactQadd01(Double factQadd01) {
		this.factQadd01 = factQadd01;
	}

	public Boolean getFactQadl01() {
		return this.factQadl01;
	}

	public void setFactQadl01(Boolean factQadl01) {
		this.factQadl01 = factQadl01;
	}

	public Integer getFactQadi01() {
		return this.factQadi01;
	}

	public void setFactQadi01(Integer factQadi01) {
		this.factQadi01 = factQadi01;
	}

	public Date getFactQadt01() {
		return this.factQadt01;
	}

	public void setFactQadt01(Date factQadt01) {
		this.factQadt01 = factQadt01;
	}

	public String getFactQadc02() {
		return this.factQadc02;
	}

	public void setFactQadc02(String factQadc02) {
		this.factQadc02 = factQadc02;
	}

	public Double getOidFactCtrl() {
		return this.oidFactCtrl;
	}

	public void setOidFactCtrl(Double oidFactCtrl) {
		this.oidFactCtrl = oidFactCtrl;
	}

}