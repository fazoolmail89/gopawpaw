package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFaclsMstr entity provides the base persistence definition of the
 * FaclsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaclsMstr implements java.io.Serializable {

	// Fields

	private FaclsMstrId id;
	private Boolean faclsDep;
	private String faclsDesc;
	private String faclsModUserid;
	private Date faclsModDate;
	private String faclsUser1;
	private String faclsUser2;
	private String faclsChr01;
	private Double faclsDec01;
	private Boolean faclsLog01;
	private Integer faclsInt01;
	private Date faclsDte01;
	private String faclsQadc01;
	private Double faclsQadd01;
	private Boolean faclsQadl01;
	private Integer faclsQadi01;
	private Date faclsQadt01;
	private String faclsQadc02;
	private Double oidFaclsMstr;

	// Constructors

	/** default constructor */
	public AbstractFaclsMstr() {
	}

	/** minimal constructor */
	public AbstractFaclsMstr(FaclsMstrId id, Boolean faclsDep,
			String faclsDesc, String faclsModUserid, Date faclsModDate,
			String faclsUser1, String faclsUser2, String faclsChr01,
			Double faclsDec01, Boolean faclsLog01, Integer faclsInt01,
			String faclsQadc01, Double faclsQadd01, Boolean faclsQadl01,
			Integer faclsQadi01, String faclsQadc02, Double oidFaclsMstr) {
		this.id = id;
		this.faclsDep = faclsDep;
		this.faclsDesc = faclsDesc;
		this.faclsModUserid = faclsModUserid;
		this.faclsModDate = faclsModDate;
		this.faclsUser1 = faclsUser1;
		this.faclsUser2 = faclsUser2;
		this.faclsChr01 = faclsChr01;
		this.faclsDec01 = faclsDec01;
		this.faclsLog01 = faclsLog01;
		this.faclsInt01 = faclsInt01;
		this.faclsQadc01 = faclsQadc01;
		this.faclsQadd01 = faclsQadd01;
		this.faclsQadl01 = faclsQadl01;
		this.faclsQadi01 = faclsQadi01;
		this.faclsQadc02 = faclsQadc02;
		this.oidFaclsMstr = oidFaclsMstr;
	}

	/** full constructor */
	public AbstractFaclsMstr(FaclsMstrId id, Boolean faclsDep,
			String faclsDesc, String faclsModUserid, Date faclsModDate,
			String faclsUser1, String faclsUser2, String faclsChr01,
			Double faclsDec01, Boolean faclsLog01, Integer faclsInt01,
			Date faclsDte01, String faclsQadc01, Double faclsQadd01,
			Boolean faclsQadl01, Integer faclsQadi01, Date faclsQadt01,
			String faclsQadc02, Double oidFaclsMstr) {
		this.id = id;
		this.faclsDep = faclsDep;
		this.faclsDesc = faclsDesc;
		this.faclsModUserid = faclsModUserid;
		this.faclsModDate = faclsModDate;
		this.faclsUser1 = faclsUser1;
		this.faclsUser2 = faclsUser2;
		this.faclsChr01 = faclsChr01;
		this.faclsDec01 = faclsDec01;
		this.faclsLog01 = faclsLog01;
		this.faclsInt01 = faclsInt01;
		this.faclsDte01 = faclsDte01;
		this.faclsQadc01 = faclsQadc01;
		this.faclsQadd01 = faclsQadd01;
		this.faclsQadl01 = faclsQadl01;
		this.faclsQadi01 = faclsQadi01;
		this.faclsQadt01 = faclsQadt01;
		this.faclsQadc02 = faclsQadc02;
		this.oidFaclsMstr = oidFaclsMstr;
	}

	// Property accessors

	public FaclsMstrId getId() {
		return this.id;
	}

	public void setId(FaclsMstrId id) {
		this.id = id;
	}

	public Boolean getFaclsDep() {
		return this.faclsDep;
	}

	public void setFaclsDep(Boolean faclsDep) {
		this.faclsDep = faclsDep;
	}

	public String getFaclsDesc() {
		return this.faclsDesc;
	}

	public void setFaclsDesc(String faclsDesc) {
		this.faclsDesc = faclsDesc;
	}

	public String getFaclsModUserid() {
		return this.faclsModUserid;
	}

	public void setFaclsModUserid(String faclsModUserid) {
		this.faclsModUserid = faclsModUserid;
	}

	public Date getFaclsModDate() {
		return this.faclsModDate;
	}

	public void setFaclsModDate(Date faclsModDate) {
		this.faclsModDate = faclsModDate;
	}

	public String getFaclsUser1() {
		return this.faclsUser1;
	}

	public void setFaclsUser1(String faclsUser1) {
		this.faclsUser1 = faclsUser1;
	}

	public String getFaclsUser2() {
		return this.faclsUser2;
	}

	public void setFaclsUser2(String faclsUser2) {
		this.faclsUser2 = faclsUser2;
	}

	public String getFaclsChr01() {
		return this.faclsChr01;
	}

	public void setFaclsChr01(String faclsChr01) {
		this.faclsChr01 = faclsChr01;
	}

	public Double getFaclsDec01() {
		return this.faclsDec01;
	}

	public void setFaclsDec01(Double faclsDec01) {
		this.faclsDec01 = faclsDec01;
	}

	public Boolean getFaclsLog01() {
		return this.faclsLog01;
	}

	public void setFaclsLog01(Boolean faclsLog01) {
		this.faclsLog01 = faclsLog01;
	}

	public Integer getFaclsInt01() {
		return this.faclsInt01;
	}

	public void setFaclsInt01(Integer faclsInt01) {
		this.faclsInt01 = faclsInt01;
	}

	public Date getFaclsDte01() {
		return this.faclsDte01;
	}

	public void setFaclsDte01(Date faclsDte01) {
		this.faclsDte01 = faclsDte01;
	}

	public String getFaclsQadc01() {
		return this.faclsQadc01;
	}

	public void setFaclsQadc01(String faclsQadc01) {
		this.faclsQadc01 = faclsQadc01;
	}

	public Double getFaclsQadd01() {
		return this.faclsQadd01;
	}

	public void setFaclsQadd01(Double faclsQadd01) {
		this.faclsQadd01 = faclsQadd01;
	}

	public Boolean getFaclsQadl01() {
		return this.faclsQadl01;
	}

	public void setFaclsQadl01(Boolean faclsQadl01) {
		this.faclsQadl01 = faclsQadl01;
	}

	public Integer getFaclsQadi01() {
		return this.faclsQadi01;
	}

	public void setFaclsQadi01(Integer faclsQadi01) {
		this.faclsQadi01 = faclsQadi01;
	}

	public Date getFaclsQadt01() {
		return this.faclsQadt01;
	}

	public void setFaclsQadt01(Date faclsQadt01) {
		this.faclsQadt01 = faclsQadt01;
	}

	public String getFaclsQadc02() {
		return this.faclsQadc02;
	}

	public void setFaclsQadc02(String faclsQadc02) {
		this.faclsQadc02 = faclsQadc02;
	}

	public Double getOidFaclsMstr() {
		return this.oidFaclsMstr;
	}

	public void setOidFaclsMstr(Double oidFaclsMstr) {
		this.oidFaclsMstr = oidFaclsMstr;
	}

}