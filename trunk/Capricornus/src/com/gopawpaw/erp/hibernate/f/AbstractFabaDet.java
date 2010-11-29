package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabaDet entity provides the base persistence definition of the
 * FabaDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabaDet implements java.io.Serializable {

	// Fields

	private FabaDetId id;
	private String fabaAcct;
	private String fabaSub;
	private String fabaCc;
	private String fabaProj;
	private String fabaModUserid;
	private Date fabaModDate;
	private String fabaUser1;
	private String fabaUser2;
	private String fabaChr01;
	private Double fabaDec01;
	private Boolean fabaLog01;
	private Date fabaDte01;
	private Integer fabaInt01;
	private String fabaQadc01;
	private Double fabaQadd01;
	private Integer fabaQadi01;
	private Boolean fabaQadl01;
	private Date fabaQadt01;
	private Double oidFabaDet;

	// Constructors

	/** default constructor */
	public AbstractFabaDet() {
	}

	/** minimal constructor */
	public AbstractFabaDet(FabaDetId id, String fabaAcct, String fabaSub,
			String fabaCc, String fabaProj, String fabaModUserid,
			Date fabaModDate, String fabaUser1, String fabaUser2,
			String fabaChr01, Double fabaDec01, Boolean fabaLog01,
			Integer fabaInt01, String fabaQadc01, Double fabaQadd01,
			Integer fabaQadi01, Boolean fabaQadl01, Double oidFabaDet) {
		this.id = id;
		this.fabaAcct = fabaAcct;
		this.fabaSub = fabaSub;
		this.fabaCc = fabaCc;
		this.fabaProj = fabaProj;
		this.fabaModUserid = fabaModUserid;
		this.fabaModDate = fabaModDate;
		this.fabaUser1 = fabaUser1;
		this.fabaUser2 = fabaUser2;
		this.fabaChr01 = fabaChr01;
		this.fabaDec01 = fabaDec01;
		this.fabaLog01 = fabaLog01;
		this.fabaInt01 = fabaInt01;
		this.fabaQadc01 = fabaQadc01;
		this.fabaQadd01 = fabaQadd01;
		this.fabaQadi01 = fabaQadi01;
		this.fabaQadl01 = fabaQadl01;
		this.oidFabaDet = oidFabaDet;
	}

	/** full constructor */
	public AbstractFabaDet(FabaDetId id, String fabaAcct, String fabaSub,
			String fabaCc, String fabaProj, String fabaModUserid,
			Date fabaModDate, String fabaUser1, String fabaUser2,
			String fabaChr01, Double fabaDec01, Boolean fabaLog01,
			Date fabaDte01, Integer fabaInt01, String fabaQadc01,
			Double fabaQadd01, Integer fabaQadi01, Boolean fabaQadl01,
			Date fabaQadt01, Double oidFabaDet) {
		this.id = id;
		this.fabaAcct = fabaAcct;
		this.fabaSub = fabaSub;
		this.fabaCc = fabaCc;
		this.fabaProj = fabaProj;
		this.fabaModUserid = fabaModUserid;
		this.fabaModDate = fabaModDate;
		this.fabaUser1 = fabaUser1;
		this.fabaUser2 = fabaUser2;
		this.fabaChr01 = fabaChr01;
		this.fabaDec01 = fabaDec01;
		this.fabaLog01 = fabaLog01;
		this.fabaDte01 = fabaDte01;
		this.fabaInt01 = fabaInt01;
		this.fabaQadc01 = fabaQadc01;
		this.fabaQadd01 = fabaQadd01;
		this.fabaQadi01 = fabaQadi01;
		this.fabaQadl01 = fabaQadl01;
		this.fabaQadt01 = fabaQadt01;
		this.oidFabaDet = oidFabaDet;
	}

	// Property accessors

	public FabaDetId getId() {
		return this.id;
	}

	public void setId(FabaDetId id) {
		this.id = id;
	}

	public String getFabaAcct() {
		return this.fabaAcct;
	}

	public void setFabaAcct(String fabaAcct) {
		this.fabaAcct = fabaAcct;
	}

	public String getFabaSub() {
		return this.fabaSub;
	}

	public void setFabaSub(String fabaSub) {
		this.fabaSub = fabaSub;
	}

	public String getFabaCc() {
		return this.fabaCc;
	}

	public void setFabaCc(String fabaCc) {
		this.fabaCc = fabaCc;
	}

	public String getFabaProj() {
		return this.fabaProj;
	}

	public void setFabaProj(String fabaProj) {
		this.fabaProj = fabaProj;
	}

	public String getFabaModUserid() {
		return this.fabaModUserid;
	}

	public void setFabaModUserid(String fabaModUserid) {
		this.fabaModUserid = fabaModUserid;
	}

	public Date getFabaModDate() {
		return this.fabaModDate;
	}

	public void setFabaModDate(Date fabaModDate) {
		this.fabaModDate = fabaModDate;
	}

	public String getFabaUser1() {
		return this.fabaUser1;
	}

	public void setFabaUser1(String fabaUser1) {
		this.fabaUser1 = fabaUser1;
	}

	public String getFabaUser2() {
		return this.fabaUser2;
	}

	public void setFabaUser2(String fabaUser2) {
		this.fabaUser2 = fabaUser2;
	}

	public String getFabaChr01() {
		return this.fabaChr01;
	}

	public void setFabaChr01(String fabaChr01) {
		this.fabaChr01 = fabaChr01;
	}

	public Double getFabaDec01() {
		return this.fabaDec01;
	}

	public void setFabaDec01(Double fabaDec01) {
		this.fabaDec01 = fabaDec01;
	}

	public Boolean getFabaLog01() {
		return this.fabaLog01;
	}

	public void setFabaLog01(Boolean fabaLog01) {
		this.fabaLog01 = fabaLog01;
	}

	public Date getFabaDte01() {
		return this.fabaDte01;
	}

	public void setFabaDte01(Date fabaDte01) {
		this.fabaDte01 = fabaDte01;
	}

	public Integer getFabaInt01() {
		return this.fabaInt01;
	}

	public void setFabaInt01(Integer fabaInt01) {
		this.fabaInt01 = fabaInt01;
	}

	public String getFabaQadc01() {
		return this.fabaQadc01;
	}

	public void setFabaQadc01(String fabaQadc01) {
		this.fabaQadc01 = fabaQadc01;
	}

	public Double getFabaQadd01() {
		return this.fabaQadd01;
	}

	public void setFabaQadd01(Double fabaQadd01) {
		this.fabaQadd01 = fabaQadd01;
	}

	public Integer getFabaQadi01() {
		return this.fabaQadi01;
	}

	public void setFabaQadi01(Integer fabaQadi01) {
		this.fabaQadi01 = fabaQadi01;
	}

	public Boolean getFabaQadl01() {
		return this.fabaQadl01;
	}

	public void setFabaQadl01(Boolean fabaQadl01) {
		this.fabaQadl01 = fabaQadl01;
	}

	public Date getFabaQadt01() {
		return this.fabaQadt01;
	}

	public void setFabaQadt01(Date fabaQadt01) {
		this.fabaQadt01 = fabaQadt01;
	}

	public Double getOidFabaDet() {
		return this.oidFabaDet;
	}

	public void setOidFabaDet(Double oidFabaDet) {
		this.oidFabaDet = oidFabaDet;
	}

}