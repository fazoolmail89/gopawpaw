package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSypsDet entity provides the base persistence definition of the
 * SypsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypsDet implements java.io.Serializable {

	// Fields

	private SypsDetId id;
	private Boolean sypsTrigUpdt;
	private String sypsModUserid;
	private Date sypsModDate;
	private String sypsUser1;
	private String sypsUser2;
	private String sypsChr01;
	private String sypsChr02;
	private Double sypsDec01;
	private Double sypsDec02;
	private Integer sypsInt01;
	private Integer sypsInt02;
	private Boolean sypsLog01;
	private Boolean sypsLog02;
	private Date sypsDte01;
	private Date sypsDte02;
	private String sypsQadc01;
	private String sypsQadc02;
	private String sypsQadc03;
	private String sypsQadc04;
	private Double sypsQadd01;
	private Double sypsQadd02;
	private Integer sypsQadi01;
	private Integer sypsQadi02;
	private Boolean sypsQadl01;
	private Boolean sypsQadl02;
	private Date sypsQadt01;
	private Date sypsQadt02;
	private Double oidSypsDet;

	// Constructors

	/** default constructor */
	public AbstractSypsDet() {
	}

	/** minimal constructor */
	public AbstractSypsDet(SypsDetId id, Double oidSypsDet) {
		this.id = id;
		this.oidSypsDet = oidSypsDet;
	}

	/** full constructor */
	public AbstractSypsDet(SypsDetId id, Boolean sypsTrigUpdt,
			String sypsModUserid, Date sypsModDate, String sypsUser1,
			String sypsUser2, String sypsChr01, String sypsChr02,
			Double sypsDec01, Double sypsDec02, Integer sypsInt01,
			Integer sypsInt02, Boolean sypsLog01, Boolean sypsLog02,
			Date sypsDte01, Date sypsDte02, String sypsQadc01,
			String sypsQadc02, String sypsQadc03, String sypsQadc04,
			Double sypsQadd01, Double sypsQadd02, Integer sypsQadi01,
			Integer sypsQadi02, Boolean sypsQadl01, Boolean sypsQadl02,
			Date sypsQadt01, Date sypsQadt02, Double oidSypsDet) {
		this.id = id;
		this.sypsTrigUpdt = sypsTrigUpdt;
		this.sypsModUserid = sypsModUserid;
		this.sypsModDate = sypsModDate;
		this.sypsUser1 = sypsUser1;
		this.sypsUser2 = sypsUser2;
		this.sypsChr01 = sypsChr01;
		this.sypsChr02 = sypsChr02;
		this.sypsDec01 = sypsDec01;
		this.sypsDec02 = sypsDec02;
		this.sypsInt01 = sypsInt01;
		this.sypsInt02 = sypsInt02;
		this.sypsLog01 = sypsLog01;
		this.sypsLog02 = sypsLog02;
		this.sypsDte01 = sypsDte01;
		this.sypsDte02 = sypsDte02;
		this.sypsQadc01 = sypsQadc01;
		this.sypsQadc02 = sypsQadc02;
		this.sypsQadc03 = sypsQadc03;
		this.sypsQadc04 = sypsQadc04;
		this.sypsQadd01 = sypsQadd01;
		this.sypsQadd02 = sypsQadd02;
		this.sypsQadi01 = sypsQadi01;
		this.sypsQadi02 = sypsQadi02;
		this.sypsQadl01 = sypsQadl01;
		this.sypsQadl02 = sypsQadl02;
		this.sypsQadt01 = sypsQadt01;
		this.sypsQadt02 = sypsQadt02;
		this.oidSypsDet = oidSypsDet;
	}

	// Property accessors

	public SypsDetId getId() {
		return this.id;
	}

	public void setId(SypsDetId id) {
		this.id = id;
	}

	public Boolean getSypsTrigUpdt() {
		return this.sypsTrigUpdt;
	}

	public void setSypsTrigUpdt(Boolean sypsTrigUpdt) {
		this.sypsTrigUpdt = sypsTrigUpdt;
	}

	public String getSypsModUserid() {
		return this.sypsModUserid;
	}

	public void setSypsModUserid(String sypsModUserid) {
		this.sypsModUserid = sypsModUserid;
	}

	public Date getSypsModDate() {
		return this.sypsModDate;
	}

	public void setSypsModDate(Date sypsModDate) {
		this.sypsModDate = sypsModDate;
	}

	public String getSypsUser1() {
		return this.sypsUser1;
	}

	public void setSypsUser1(String sypsUser1) {
		this.sypsUser1 = sypsUser1;
	}

	public String getSypsUser2() {
		return this.sypsUser2;
	}

	public void setSypsUser2(String sypsUser2) {
		this.sypsUser2 = sypsUser2;
	}

	public String getSypsChr01() {
		return this.sypsChr01;
	}

	public void setSypsChr01(String sypsChr01) {
		this.sypsChr01 = sypsChr01;
	}

	public String getSypsChr02() {
		return this.sypsChr02;
	}

	public void setSypsChr02(String sypsChr02) {
		this.sypsChr02 = sypsChr02;
	}

	public Double getSypsDec01() {
		return this.sypsDec01;
	}

	public void setSypsDec01(Double sypsDec01) {
		this.sypsDec01 = sypsDec01;
	}

	public Double getSypsDec02() {
		return this.sypsDec02;
	}

	public void setSypsDec02(Double sypsDec02) {
		this.sypsDec02 = sypsDec02;
	}

	public Integer getSypsInt01() {
		return this.sypsInt01;
	}

	public void setSypsInt01(Integer sypsInt01) {
		this.sypsInt01 = sypsInt01;
	}

	public Integer getSypsInt02() {
		return this.sypsInt02;
	}

	public void setSypsInt02(Integer sypsInt02) {
		this.sypsInt02 = sypsInt02;
	}

	public Boolean getSypsLog01() {
		return this.sypsLog01;
	}

	public void setSypsLog01(Boolean sypsLog01) {
		this.sypsLog01 = sypsLog01;
	}

	public Boolean getSypsLog02() {
		return this.sypsLog02;
	}

	public void setSypsLog02(Boolean sypsLog02) {
		this.sypsLog02 = sypsLog02;
	}

	public Date getSypsDte01() {
		return this.sypsDte01;
	}

	public void setSypsDte01(Date sypsDte01) {
		this.sypsDte01 = sypsDte01;
	}

	public Date getSypsDte02() {
		return this.sypsDte02;
	}

	public void setSypsDte02(Date sypsDte02) {
		this.sypsDte02 = sypsDte02;
	}

	public String getSypsQadc01() {
		return this.sypsQadc01;
	}

	public void setSypsQadc01(String sypsQadc01) {
		this.sypsQadc01 = sypsQadc01;
	}

	public String getSypsQadc02() {
		return this.sypsQadc02;
	}

	public void setSypsQadc02(String sypsQadc02) {
		this.sypsQadc02 = sypsQadc02;
	}

	public String getSypsQadc03() {
		return this.sypsQadc03;
	}

	public void setSypsQadc03(String sypsQadc03) {
		this.sypsQadc03 = sypsQadc03;
	}

	public String getSypsQadc04() {
		return this.sypsQadc04;
	}

	public void setSypsQadc04(String sypsQadc04) {
		this.sypsQadc04 = sypsQadc04;
	}

	public Double getSypsQadd01() {
		return this.sypsQadd01;
	}

	public void setSypsQadd01(Double sypsQadd01) {
		this.sypsQadd01 = sypsQadd01;
	}

	public Double getSypsQadd02() {
		return this.sypsQadd02;
	}

	public void setSypsQadd02(Double sypsQadd02) {
		this.sypsQadd02 = sypsQadd02;
	}

	public Integer getSypsQadi01() {
		return this.sypsQadi01;
	}

	public void setSypsQadi01(Integer sypsQadi01) {
		this.sypsQadi01 = sypsQadi01;
	}

	public Integer getSypsQadi02() {
		return this.sypsQadi02;
	}

	public void setSypsQadi02(Integer sypsQadi02) {
		this.sypsQadi02 = sypsQadi02;
	}

	public Boolean getSypsQadl01() {
		return this.sypsQadl01;
	}

	public void setSypsQadl01(Boolean sypsQadl01) {
		this.sypsQadl01 = sypsQadl01;
	}

	public Boolean getSypsQadl02() {
		return this.sypsQadl02;
	}

	public void setSypsQadl02(Boolean sypsQadl02) {
		this.sypsQadl02 = sypsQadl02;
	}

	public Date getSypsQadt01() {
		return this.sypsQadt01;
	}

	public void setSypsQadt01(Date sypsQadt01) {
		this.sypsQadt01 = sypsQadt01;
	}

	public Date getSypsQadt02() {
		return this.sypsQadt02;
	}

	public void setSypsQadt02(Date sypsQadt02) {
		this.sypsQadt02 = sypsQadt02;
	}

	public Double getOidSypsDet() {
		return this.oidSypsDet;
	}

	public void setOidSypsDet(Double oidSypsDet) {
		this.oidSypsDet = oidSypsDet;
	}

}