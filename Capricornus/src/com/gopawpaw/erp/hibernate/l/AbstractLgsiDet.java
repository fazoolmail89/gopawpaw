package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLgsiDet entity provides the base persistence definition of the
 * LgsiDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLgsiDet implements java.io.Serializable {

	// Fields

	private LgsiDetId id;
	private Date lgsiModDate;
	private String lgsiModUserid;
	private String lgsiUser1;
	private String lgsiUser2;
	private Double lgsiDec01;
	private Double lgsiDec02;
	private Integer lgsiInt01;
	private Integer lgsiInt02;
	private Boolean lgsiLog01;
	private Boolean lgsiLog02;
	private Date lgsiDte01;
	private Date lgsiDte02;
	private String lgsiQadc01;
	private String lgsiQadc02;
	private String lgsiQadc03;
	private String lgsiQadc04;
	private Double lgsiQadd01;
	private Double lgsiQadd02;
	private Integer lgsiQadi01;
	private Integer lgsiQadi02;
	private Boolean lgsiQadl01;
	private Boolean lgsiQadl02;
	private Date lgsiQadt01;
	private Date lgsiQadt02;
	private Double oidLgsiDet;

	// Constructors

	/** default constructor */
	public AbstractLgsiDet() {
	}

	/** minimal constructor */
	public AbstractLgsiDet(LgsiDetId id, Double oidLgsiDet) {
		this.id = id;
		this.oidLgsiDet = oidLgsiDet;
	}

	/** full constructor */
	public AbstractLgsiDet(LgsiDetId id, Date lgsiModDate,
			String lgsiModUserid, String lgsiUser1, String lgsiUser2,
			Double lgsiDec01, Double lgsiDec02, Integer lgsiInt01,
			Integer lgsiInt02, Boolean lgsiLog01, Boolean lgsiLog02,
			Date lgsiDte01, Date lgsiDte02, String lgsiQadc01,
			String lgsiQadc02, String lgsiQadc03, String lgsiQadc04,
			Double lgsiQadd01, Double lgsiQadd02, Integer lgsiQadi01,
			Integer lgsiQadi02, Boolean lgsiQadl01, Boolean lgsiQadl02,
			Date lgsiQadt01, Date lgsiQadt02, Double oidLgsiDet) {
		this.id = id;
		this.lgsiModDate = lgsiModDate;
		this.lgsiModUserid = lgsiModUserid;
		this.lgsiUser1 = lgsiUser1;
		this.lgsiUser2 = lgsiUser2;
		this.lgsiDec01 = lgsiDec01;
		this.lgsiDec02 = lgsiDec02;
		this.lgsiInt01 = lgsiInt01;
		this.lgsiInt02 = lgsiInt02;
		this.lgsiLog01 = lgsiLog01;
		this.lgsiLog02 = lgsiLog02;
		this.lgsiDte01 = lgsiDte01;
		this.lgsiDte02 = lgsiDte02;
		this.lgsiQadc01 = lgsiQadc01;
		this.lgsiQadc02 = lgsiQadc02;
		this.lgsiQadc03 = lgsiQadc03;
		this.lgsiQadc04 = lgsiQadc04;
		this.lgsiQadd01 = lgsiQadd01;
		this.lgsiQadd02 = lgsiQadd02;
		this.lgsiQadi01 = lgsiQadi01;
		this.lgsiQadi02 = lgsiQadi02;
		this.lgsiQadl01 = lgsiQadl01;
		this.lgsiQadl02 = lgsiQadl02;
		this.lgsiQadt01 = lgsiQadt01;
		this.lgsiQadt02 = lgsiQadt02;
		this.oidLgsiDet = oidLgsiDet;
	}

	// Property accessors

	public LgsiDetId getId() {
		return this.id;
	}

	public void setId(LgsiDetId id) {
		this.id = id;
	}

	public Date getLgsiModDate() {
		return this.lgsiModDate;
	}

	public void setLgsiModDate(Date lgsiModDate) {
		this.lgsiModDate = lgsiModDate;
	}

	public String getLgsiModUserid() {
		return this.lgsiModUserid;
	}

	public void setLgsiModUserid(String lgsiModUserid) {
		this.lgsiModUserid = lgsiModUserid;
	}

	public String getLgsiUser1() {
		return this.lgsiUser1;
	}

	public void setLgsiUser1(String lgsiUser1) {
		this.lgsiUser1 = lgsiUser1;
	}

	public String getLgsiUser2() {
		return this.lgsiUser2;
	}

	public void setLgsiUser2(String lgsiUser2) {
		this.lgsiUser2 = lgsiUser2;
	}

	public Double getLgsiDec01() {
		return this.lgsiDec01;
	}

	public void setLgsiDec01(Double lgsiDec01) {
		this.lgsiDec01 = lgsiDec01;
	}

	public Double getLgsiDec02() {
		return this.lgsiDec02;
	}

	public void setLgsiDec02(Double lgsiDec02) {
		this.lgsiDec02 = lgsiDec02;
	}

	public Integer getLgsiInt01() {
		return this.lgsiInt01;
	}

	public void setLgsiInt01(Integer lgsiInt01) {
		this.lgsiInt01 = lgsiInt01;
	}

	public Integer getLgsiInt02() {
		return this.lgsiInt02;
	}

	public void setLgsiInt02(Integer lgsiInt02) {
		this.lgsiInt02 = lgsiInt02;
	}

	public Boolean getLgsiLog01() {
		return this.lgsiLog01;
	}

	public void setLgsiLog01(Boolean lgsiLog01) {
		this.lgsiLog01 = lgsiLog01;
	}

	public Boolean getLgsiLog02() {
		return this.lgsiLog02;
	}

	public void setLgsiLog02(Boolean lgsiLog02) {
		this.lgsiLog02 = lgsiLog02;
	}

	public Date getLgsiDte01() {
		return this.lgsiDte01;
	}

	public void setLgsiDte01(Date lgsiDte01) {
		this.lgsiDte01 = lgsiDte01;
	}

	public Date getLgsiDte02() {
		return this.lgsiDte02;
	}

	public void setLgsiDte02(Date lgsiDte02) {
		this.lgsiDte02 = lgsiDte02;
	}

	public String getLgsiQadc01() {
		return this.lgsiQadc01;
	}

	public void setLgsiQadc01(String lgsiQadc01) {
		this.lgsiQadc01 = lgsiQadc01;
	}

	public String getLgsiQadc02() {
		return this.lgsiQadc02;
	}

	public void setLgsiQadc02(String lgsiQadc02) {
		this.lgsiQadc02 = lgsiQadc02;
	}

	public String getLgsiQadc03() {
		return this.lgsiQadc03;
	}

	public void setLgsiQadc03(String lgsiQadc03) {
		this.lgsiQadc03 = lgsiQadc03;
	}

	public String getLgsiQadc04() {
		return this.lgsiQadc04;
	}

	public void setLgsiQadc04(String lgsiQadc04) {
		this.lgsiQadc04 = lgsiQadc04;
	}

	public Double getLgsiQadd01() {
		return this.lgsiQadd01;
	}

	public void setLgsiQadd01(Double lgsiQadd01) {
		this.lgsiQadd01 = lgsiQadd01;
	}

	public Double getLgsiQadd02() {
		return this.lgsiQadd02;
	}

	public void setLgsiQadd02(Double lgsiQadd02) {
		this.lgsiQadd02 = lgsiQadd02;
	}

	public Integer getLgsiQadi01() {
		return this.lgsiQadi01;
	}

	public void setLgsiQadi01(Integer lgsiQadi01) {
		this.lgsiQadi01 = lgsiQadi01;
	}

	public Integer getLgsiQadi02() {
		return this.lgsiQadi02;
	}

	public void setLgsiQadi02(Integer lgsiQadi02) {
		this.lgsiQadi02 = lgsiQadi02;
	}

	public Boolean getLgsiQadl01() {
		return this.lgsiQadl01;
	}

	public void setLgsiQadl01(Boolean lgsiQadl01) {
		this.lgsiQadl01 = lgsiQadl01;
	}

	public Boolean getLgsiQadl02() {
		return this.lgsiQadl02;
	}

	public void setLgsiQadl02(Boolean lgsiQadl02) {
		this.lgsiQadl02 = lgsiQadl02;
	}

	public Date getLgsiQadt01() {
		return this.lgsiQadt01;
	}

	public void setLgsiQadt01(Date lgsiQadt01) {
		this.lgsiQadt01 = lgsiQadt01;
	}

	public Date getLgsiQadt02() {
		return this.lgsiQadt02;
	}

	public void setLgsiQadt02(Date lgsiQadt02) {
		this.lgsiQadt02 = lgsiQadt02;
	}

	public Double getOidLgsiDet() {
		return this.oidLgsiDet;
	}

	public void setOidLgsiDet(Double oidLgsiDet) {
		this.oidLgsiDet = oidLgsiDet;
	}

}