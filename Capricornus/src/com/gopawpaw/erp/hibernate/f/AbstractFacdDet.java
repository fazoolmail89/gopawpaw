package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFacdDet entity provides the base persistence definition of the
 * FacdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacdDet implements java.io.Serializable {

	// Fields

	private FacdDetId id;
	private String facdFabkId;
	private String facdAcct;
	private String facdModUserid;
	private Date facdModDate;
	private String facdUser1;
	private String facdUser2;
	private String facdChr01;
	private Double facdDec01;
	private Boolean facdLog01;
	private Date facdDte01;
	private Integer facdInt01;
	private String facdQadc01;
	private Double facdQadd01;
	private Integer facdQadi01;
	private Boolean facdQadl01;
	private Date facdQadt01;
	private Double oidFacdDet;

	// Constructors

	/** default constructor */
	public AbstractFacdDet() {
	}

	/** minimal constructor */
	public AbstractFacdDet(FacdDetId id, String facdFabkId, String facdAcct,
			String facdModUserid, Date facdModDate, String facdUser1,
			String facdUser2, String facdChr01, Double facdDec01,
			Boolean facdLog01, Integer facdInt01, String facdQadc01,
			Double facdQadd01, Integer facdQadi01, Boolean facdQadl01,
			Double oidFacdDet) {
		this.id = id;
		this.facdFabkId = facdFabkId;
		this.facdAcct = facdAcct;
		this.facdModUserid = facdModUserid;
		this.facdModDate = facdModDate;
		this.facdUser1 = facdUser1;
		this.facdUser2 = facdUser2;
		this.facdChr01 = facdChr01;
		this.facdDec01 = facdDec01;
		this.facdLog01 = facdLog01;
		this.facdInt01 = facdInt01;
		this.facdQadc01 = facdQadc01;
		this.facdQadd01 = facdQadd01;
		this.facdQadi01 = facdQadi01;
		this.facdQadl01 = facdQadl01;
		this.oidFacdDet = oidFacdDet;
	}

	/** full constructor */
	public AbstractFacdDet(FacdDetId id, String facdFabkId, String facdAcct,
			String facdModUserid, Date facdModDate, String facdUser1,
			String facdUser2, String facdChr01, Double facdDec01,
			Boolean facdLog01, Date facdDte01, Integer facdInt01,
			String facdQadc01, Double facdQadd01, Integer facdQadi01,
			Boolean facdQadl01, Date facdQadt01, Double oidFacdDet) {
		this.id = id;
		this.facdFabkId = facdFabkId;
		this.facdAcct = facdAcct;
		this.facdModUserid = facdModUserid;
		this.facdModDate = facdModDate;
		this.facdUser1 = facdUser1;
		this.facdUser2 = facdUser2;
		this.facdChr01 = facdChr01;
		this.facdDec01 = facdDec01;
		this.facdLog01 = facdLog01;
		this.facdDte01 = facdDte01;
		this.facdInt01 = facdInt01;
		this.facdQadc01 = facdQadc01;
		this.facdQadd01 = facdQadd01;
		this.facdQadi01 = facdQadi01;
		this.facdQadl01 = facdQadl01;
		this.facdQadt01 = facdQadt01;
		this.oidFacdDet = oidFacdDet;
	}

	// Property accessors

	public FacdDetId getId() {
		return this.id;
	}

	public void setId(FacdDetId id) {
		this.id = id;
	}

	public String getFacdFabkId() {
		return this.facdFabkId;
	}

	public void setFacdFabkId(String facdFabkId) {
		this.facdFabkId = facdFabkId;
	}

	public String getFacdAcct() {
		return this.facdAcct;
	}

	public void setFacdAcct(String facdAcct) {
		this.facdAcct = facdAcct;
	}

	public String getFacdModUserid() {
		return this.facdModUserid;
	}

	public void setFacdModUserid(String facdModUserid) {
		this.facdModUserid = facdModUserid;
	}

	public Date getFacdModDate() {
		return this.facdModDate;
	}

	public void setFacdModDate(Date facdModDate) {
		this.facdModDate = facdModDate;
	}

	public String getFacdUser1() {
		return this.facdUser1;
	}

	public void setFacdUser1(String facdUser1) {
		this.facdUser1 = facdUser1;
	}

	public String getFacdUser2() {
		return this.facdUser2;
	}

	public void setFacdUser2(String facdUser2) {
		this.facdUser2 = facdUser2;
	}

	public String getFacdChr01() {
		return this.facdChr01;
	}

	public void setFacdChr01(String facdChr01) {
		this.facdChr01 = facdChr01;
	}

	public Double getFacdDec01() {
		return this.facdDec01;
	}

	public void setFacdDec01(Double facdDec01) {
		this.facdDec01 = facdDec01;
	}

	public Boolean getFacdLog01() {
		return this.facdLog01;
	}

	public void setFacdLog01(Boolean facdLog01) {
		this.facdLog01 = facdLog01;
	}

	public Date getFacdDte01() {
		return this.facdDte01;
	}

	public void setFacdDte01(Date facdDte01) {
		this.facdDte01 = facdDte01;
	}

	public Integer getFacdInt01() {
		return this.facdInt01;
	}

	public void setFacdInt01(Integer facdInt01) {
		this.facdInt01 = facdInt01;
	}

	public String getFacdQadc01() {
		return this.facdQadc01;
	}

	public void setFacdQadc01(String facdQadc01) {
		this.facdQadc01 = facdQadc01;
	}

	public Double getFacdQadd01() {
		return this.facdQadd01;
	}

	public void setFacdQadd01(Double facdQadd01) {
		this.facdQadd01 = facdQadd01;
	}

	public Integer getFacdQadi01() {
		return this.facdQadi01;
	}

	public void setFacdQadi01(Integer facdQadi01) {
		this.facdQadi01 = facdQadi01;
	}

	public Boolean getFacdQadl01() {
		return this.facdQadl01;
	}

	public void setFacdQadl01(Boolean facdQadl01) {
		this.facdQadl01 = facdQadl01;
	}

	public Date getFacdQadt01() {
		return this.facdQadt01;
	}

	public void setFacdQadt01(Date facdQadt01) {
		this.facdQadt01 = facdQadt01;
	}

	public Double getOidFacdDet() {
		return this.oidFacdDet;
	}

	public void setOidFacdDet(Double oidFacdDet) {
		this.oidFacdDet = oidFacdDet;
	}

}